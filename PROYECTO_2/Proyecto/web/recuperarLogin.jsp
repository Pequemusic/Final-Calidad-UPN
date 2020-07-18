<%-- 
    Document   : recuperarLogin2
    Created on : 28-jun-2020, 19:28:25
    Author     : VB
--%>

<%@page import="Controlador.Controlador_empleado"%>
<%@page import="Controlador.Controlador_login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/main_interno.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/c0ecea9977.js" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans&family=Oswald&family=PT+Sans&display=swap" rel="stylesheet">

        <title>Recuperar contraseña</title>
    </head>
    <body class="login">
        <form class="box">
            <img src="img/logo.jpg" alt=""/>
            <div>
                <h1 class="titulo clearfix">Recuperar contraseña</h1>
            </div>        
            <div class="row">
                <div class="column_1">
                    <i class="fas fa-user"></i>
                </div>
                <div class="column_2">
                    <input type="text" placeholder="Usuario" name="usuario" id="usuario">
                </div>
            </div>
            <div class="row">
                <div class="column_1">
                    <i class="fas fa-lock"></i>
                </div>
                <div class="column_2">
                    <input type="password" placeholder="Ingresa nueva contraseña" name="password" id="password">
                </div>
            </div>
            <input type="submit" value="Enviar" name="Enviar" onclick="return ValidarIngreso();">
            <a href="ingreso.jsp" class="btn">Regresar a Login</a>
            <div id="error" class="error  ocultar">
            </div>
        </form>                
        <%
            if (request.getParameter("Enviar") != null) {
                int cambio = new Controlador_login().validarRecuperarContraseña(request.getParameter("password"), request.getParameter("usuario"));
                String msg = "";
                if (cambio != 0) {
                    msg = "Contraseña cambiada con exito";
                } else {
                    msg = "Contraseña no cambiada , usuario incorrecto";
                }
                response.sendRedirect("ingreso.jsp?msg=" + msg);

            }
        %>

    </body>
</html>
<script src="JS/validaciones.js" type="text/javascript"></script>
<script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>