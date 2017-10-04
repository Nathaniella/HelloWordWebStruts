<%-- 
    Document   : mensaje
    Created on : 29/09/2017, 10:13:42 AM
    Author     : aplicaciones
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html>  
    <head>  
        <title><s:property value="mensaje.mensaje" /></title>  
    </head>  
    <body>  
        <h1>El nombre es: <s:property value="mensaje.mensaje" /></h1>  
    </body>  
</html>

