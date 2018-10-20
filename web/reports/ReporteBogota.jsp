<%-- 
    Document   : ReporteBogota
    Created on : 24/07/2014, 01:05:13 PM
    Author     : cesar1
--%>

<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.File"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.naming.Context"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte Bogota</title>
        <link rel="icon" type="image/png" href="assets/images/icono_etb.png" />    
    </head>
    <body>
        <%
            Connection cnn = null;          
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/etb", "root", "cesar");               
                File reportFile = new File(application.getRealPath("//reports//report5.jasper"));
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
