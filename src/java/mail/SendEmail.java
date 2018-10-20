/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

import java.util.Date;
import java.util.Properties;
import javax.mail.MailSessionDefinition;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * cesar
 */
public class SendEmail {
 //se crea una nueva instancia clase properties
 private final Properties propiedades= new Properties();
 //se define la contraseña
 private final String pass="M8a6y0o9r1g/a";
 //se define la sesion
 private Session sesion;
 //se define el correo
 private final String user="clmayorga0@misena.edu.co";
 //clase sin retorno con todos los datos de acceso (propiedades) para poder conectar a gmail
 private void init(){
     propiedades.put("mail.smtp.host", "smtp.gmail.com");
     propiedades.put("mail.smtp.starttls.enable", "true");
     propiedades.put("mail.smtp.port", 587);
     propiedades.put("mail.smtp.mail.sender", "clmayorga0@misena.edu.co");
     propiedades.put("mail.smtp.user", user);
     propiedades.put("mail.smtp.auth", "true");
     
     sesion= Session.getDefaultInstance(propiedades);
 }
 //clase para el envio del correo, se pasan los parametros msj, asunto, destinatario
 public String sendEmail(String msj, String asunto, String destinatario){
     init();
     String salida;
     try {
         MimeMessage mensaje=new MimeMessage(sesion);
         mensaje.setFrom(new InternetAddress((String)propiedades.get("mail.smtp.mail.sender")));
         mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress("clmayorga0@misena.edu.co"));
         mensaje.addRecipient(Message.RecipientType.CC, new InternetAddress(destinatario));
         mensaje.setSubject(asunto,"UTF-8");
         MimeBodyPart cuerpoMensaje= new MimeBodyPart();
         cuerpoMensaje.setText(msj, "UTF-8", "html");
         Multipart multi= new MimeMultipart();
         multi.addBodyPart(cuerpoMensaje);
         mensaje.setContent(multi);
         Transport transporte= sesion.getTransport("smtp");
         transporte.connect("clmayorga0@misena.edu.co",pass);
         transporte.sendMessage(mensaje, mensaje.getAllRecipients());
         transporte.close();
         salida="Mensaje enviado correctamente";
     } catch (MessagingException e) {
         salida= e.getMessage();
     }
     return salida;
 }
}
