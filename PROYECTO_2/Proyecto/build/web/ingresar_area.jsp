<%-- 
    Document   : aspirantes
    Created on : 12-may-2020, 17:37:17
    Author     : VB
--%>

<%@page import="Controlador.Controlador_area"%>
<%@page import="modelo.area"%>
<%@page import="Controlador.Controlador_cita"%>
<%@page import="modelo.cita"%>
<%@page import="Controlador.Controlador_aspirante"%>
<%@page import="modelo.aspirante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Ingresar area';    
</script>
<br>
<h2>AREA</h2>
<div class="container_peque">
    <div id="error" class="error ocultar">        
    </div>
</div>
<br>
<section class="contenedor clearfix">
    <form action="" method="get">
        <div class="row">
            <div class="col-25">
                <label>nombre</label>
            </div>
            <div class="col-75">
                <input type="text" name="nombre" id="area"><br/><br> 
            </div>
        </div>
        <input type="submit" value="Enviar" onclick = "return ValidadIngArea();"name="btnRegistrar">
        <%
            if (request.getParameter("btnRegistrar") != null) {
                String nombre = request.getParameter("nombre");

                area a = new area(0, nombre);
                int r = new Controlador_area().insertar(a);
                request.getRequestDispatcher("listar_area.jsp").forward(request, response);
            }
        %>
    </form>
</section>
<br>
<br>
<%@include file="templates/footer_interno.jsp"%>
<script src="JS/validaciones.js" type="text/javascript"></script>
<script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>