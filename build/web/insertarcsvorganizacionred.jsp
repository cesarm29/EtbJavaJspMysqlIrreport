<%-- 
    Document   : insertarcsvorganizacionred
    Created on : 28/08/2014, 01:30:34 PM
    Author     : cesar
--%>

<%@ page import="java.io.*,java.sql.*" %>
<html>
    <%  //string que contiene una peticion (trae dato ContentType)
        String contentType = request.getContentType();
        //hace validaciones si es diferente de null y si el formato multipart/form-data es mayor o igual a 0 
        if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {
            //nueva instanciacion de DataInputStream y se le pasa como valor getInputStream()
            DataInputStream in = new DataInputStream(request.getInputStream());
            //se le asigna a la variable el contenido pero contando los datos
            int formDataLength = request.getContentLength();
            //nueva instancia 
            byte dataBytes[] = new byte[formDataLength];
            //se define el valor de byteRead
            int byteRead = 0;
            //se define el valor de totalBytesRead
            int totalBytesRead = 0;
            //parte logica
            while (totalBytesRead < formDataLength) {
                byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
                totalBytesRead += byteRead;
            }
            //nueva instanciacion a variable file de dataBytes
            String file = new String(dataBytes);
            //variable saveFile va a ser igual a el conteo de las filas +10 
            String saveFile = file.substring(file.indexOf("filename=\"") + 10);
            //se imprime la variable saveFile
            System.out.println("saveFile=" + saveFile);
            // variable saveFile  va a ser igual a el indice +1
            saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1, saveFile.indexOf("\""));
            //se imprime de nuevo la variable saveFile
            System.out.println("saveFile" + saveFile);
            //variable saveFile va a ser igual a file.indice filename + 10
            saveFile = file.substring(file.indexOf("filename=\"") + 10);
            //variable saveFile va a ser igual a saveFile 0 saveFile.indexOf("\n")
            saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
            //variable saveFile va a ser igual a el indice saveFile ("\\") + 1 y saveFile.indexOf("\"")
            saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1, saveFile.indexOf("\""));
            //variable lastIndex va a tomar el valor de contentType.lastIndexOf("=")
            int lastIndex = contentType.lastIndexOf("=");
            //variable boundary va a tomar el valor de contentType.substring(lastIndex + 1 y del contentType 
            //hace un conteo de datos 
            String boundary = contentType.substring(lastIndex + 1, contentType.length());
            int pos;
            //variable pos crea posiciones virtuales para acomodar los datos en la bd
            pos = file.indexOf("filename=\"");
            pos = file.indexOf("\n", pos) + 1;
            pos = file.indexOf("\n", pos) + 1;
            pos = file.indexOf("\n", pos) + 1;
            int boundaryLocation = file.indexOf(boundary, pos) - 4;
            int startPos = ((file.substring(0, pos)).getBytes()).length;
            int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
            //nueva instancia FileOutputStream fileOut
            FileOutputStream fileOut = new FileOutputStream(saveFile);
            // variable fileOut escribe estos datos dataBytes, startPos, y hace la resta(endPos - startPos)
            fileOut.write(dataBytes, startPos, (endPos - startPos));
            
            
    %>
    <b>File <% out.println(saveFile);%> Ingresado correctamente en la base de datos.</b>
    </br>
    <input type="button" class="btn-u pull-rgt" onclick="location.href = 'menu.jsp'" name="btnSalir" id="btnSalir" value="Regresar al Menu" />
    <%      
            //conexion a la base de datos
            Connection con = null;
            Statement pst = null;
            String line = null;
            try {
                
                BufferedReader input = new BufferedReader(new FileReader(saveFile));
                //driver de mysql y datos del localhost usuario y contraseña
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/etb?user=root&password=cesar");
                pst = con.createStatement();
                int count = 0;
                while ((line = input.readLine()) != null) {
                    if(count > 0){
                        String[] cels = line.split(";");
                        //inserta datos en la bd
                        String sql ="insert into organizacionred (idORGANIZACIONRED, central, distrito, pr, tema, costocontrato, costoproyecto, pares, estado, fechaentrega, inicioprogramado, finprogramado, avance, fechareporte, mesfacturacion, contratista, USUARIOS_idUSUARIOS) values(";
                        sql += "'" + cels[0]+"','"+cels[1] + "','" + cels[2] + "','" +cels[3] + "','" +cels[4] + "','" +cels[5] + "','" +cels[6] + "','" +cels[7] + "','" +cels[8] + "','" +cels[9] + "','" +cels[10] + "','" +cels[11] + "','" +cels[12] + "','" +cels[13] + "','" +cels[14] + "','" +cels[15] + "','" +cels[16] + "');";
                        pst.executeUpdate(sql);
                    }
                    count++;
                }
            } catch (Exception e) {
                //imprime exepcion
                out.println(e.getMessage());               
            }
        }
    %>
</html>
