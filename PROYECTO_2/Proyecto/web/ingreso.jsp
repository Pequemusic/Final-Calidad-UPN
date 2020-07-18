<%-- 
    Document   : ingreso
    Created on : 28-jun-2020, 15:35:29
    Author     : VB
--%>

<%@page import="java.util.List"%>
<%@page import="Controlador.Controlador_login"%>
<%@page import="modelo.login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/main_interno.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/c0ecea9977.js" crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans&family=Oswald&family=PT+Sans&display=swap" rel="stylesheet">
        <title>Login</title>
    </head>
    <a class="btn_izquierda" href="index.jsp">Regresar a pagina principal</a>
    <body class="login">
        <form class="box">
            <%
                String msg = request.getParameter("msg");
                if (msg != null) {%> <script>alert("<%=msg%>")</script> <%}

                    String valor = request.getParameter("valor");
                    if (valor != null && session.getAttribute("usuario") != null) {
                        session.setAttribute("usuario", null);
                        session.invalidate();
                    }
            %>
            <img src="img/logo.jpg" alt=""/>
            <h1 class="titulo">Login</h1>
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
                    <input type="password" placeholder="Contraseña" name="password" id="password">
                </div>
            </div>
            <input type="submit" value="Enviar" name="Enviar" onclick="return ValidarIngreso();">
            <a href="recuperarLogin.jsp" class="btn">Recuperar Contraseña</a>
            <div id="error" class="error  ocultar">
            </div>
        </div>
        <%                if (request.getParameter("Enviar") != null) {
                String usuario = request.getParameter("usuario");
                String password = request.getParameter("password");
                login a = new login(usuario, password, "");
                String mensaje = new Controlador_login().validarIngreso(a);
                if (!mensaje.equals("") && session != null) {
                    response.sendRedirect("principal.jsp");
                    HttpSession sesion = request.getSession();
                    List<String> lista = new Controlador_login().separarMensaje(mensaje);
                    String usu = lista.get(0);
                    String fecha = lista.get(1);
                    String estado = lista.get(2);
                    String rango = lista.get(3);
                    sesion.setAttribute("usuario", usu);
                    sesion.setAttribute("fecha", fecha);
                    sesion.setAttribute("estado", estado);
                    sesion.setAttribute("rango",rango);
                }
                if (session.getAttribute("usuario") == null) {
                    response.sendRedirect("ingreso.jsp");
                }

            }
        %>
    </form>

</body>
</html>
<script src="JS/validaciones.js" type="text/javascript"></script>
<script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>