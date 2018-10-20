<%-- 
    Document   : ReporteMicromotores
    Created on : 25/07/2014, 09:53:48 AM
    Author     : cesar1
--%>

<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte Micromotores</title>
        <link rel="icon" type="image/png" href="assets/images/icono_etb.png" />    
    </head>
    <body>
        <%
            Connection cnn = null;          
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/etb", "root", "cesar");               
                File reportFile = new File(application.getRealPath("//reports//report10.jasper"));
                byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), null, cnn);
                response.setContentType("application/pdf");
                response.setContentLength(bytes.length);
                ServletOutputStream outStream = response.getOutputStream();
                outStream.write(bytes, 0, bytes.length);
                outStream.flush();
                outStream.close();
            } catch (Exception ex) {
                out.println("Error:" + ex.getMessage());
            }
        %>
    </body>
</html>
