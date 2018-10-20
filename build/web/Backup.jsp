<%-- 
    Document   : Backup
    Created on : 4/08/2014, 09:18:12 AM
    Author     : cesar1
--%>

    <%@page import="java.sql.*" %>
    <%@page import ="java.util.Calendar" %>
    
    <!-- se pasa la fecha , fechahoy se calcula, nombre y 
    en el runtimeprocess se de la la ruta de acceso a mysql 
    con el usuario y contraseña, se usa el comando mysqldump.exe 
    de el directorio donde se instalo mysql y de ahi el genera el
    backup -->
    <%
    try{
        Calendar fecha = Calendar.getInstance();
        String fechaHoy = fecha.get(Calendar.DATE)+"-"+fecha.get(Calendar.MONTH)+"-"+fecha.get(Calendar.YEAR);
        String nombre = "Respaldo_Sistema_etb"+fechaHoy+".sql";
        int copia_seguridad;
        Process runtimeProcess = Runtime.getRuntime().exec("C:/AppServ/MySQL/bin/mysqldump.exe --opt  --password=cesar --user=root --databases etb -r C:/Users/cesar/Documents/"+nombre);
        copia_seguridad = runtimeProcess.waitFor();      
        if(copia_seguridad==0){ //Devuelve 0 si todo ha salido bien
    %>      <script>
                function respaldoRealizado() {
                    alert("El respaldo ha sido creado con exito.\n\nCompruebe la ubicacion del archivo en el disco local \nC:/Users/cesar/Documents/");
                    location.href="menu.jsp";
                }
                respaldoRealizado();
            </script>
    <%        
        } else {
    %>      <script>
                function respaldoNoRealizado() {
                    alert("El respaldo no se pudo generar");
                    location.href="menu.jsp";
                }
                respaldoNoRealizado();
            </script>
    <%  
        }
    } catch(Exception e){
        out.println(e);
        }
    %>