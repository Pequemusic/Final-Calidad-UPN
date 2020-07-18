<%-- 
    Document   : Modificar_cita
    Created on : 15-may-2020, 12:29:18
    Author     : VB
--%>

<%@page import="modelo.cita"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>


<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Actualizar cita';    
</script>

<h2>MODIFICAR ESTADO</h2>
<div class="container_peque">
    <div id="error" class="error ocultar">        
    </div>
</div>
<br>
<section class="container clearfix">

    <form method="get" id="modificar_cita" action="">
        <div class="row">
            <div class="col-25">
                <label>Seleccione : </label>
            </div>
            <div class="col-75">
                <input type="hidden" name="idd" value="<%=request.getParameter("id")%>">
                APROBADO<input type="radio" name="estado" id="estado" value="2">
                RECHAZADO<input type="radio" name="estado" id="estado_1" value="1"><br>
            </div>
        </div>
        <div class="row">
            <input type="submit" value="enviar" onclick="return ValidarModCita();" name="enviar">  
        </div>
    </form>
</section>
<br>

<%
    if (request.getParameter("enviar") != null) {
        int id = Integer.parseInt(request.getParameter("idd"));
        String estado = request.getParameter("estado");

        cita a = new cita(id, estado);
        int r = new Controlador.Controlador_cita().ActualizarEstado(a);
        request.getRequestDispatcher("listar_cita.jsp").forward(request, response);
    }
%>

<%@include file="templates/footer_interno.jsp"%>
<script src="JS/validaciones.js" type="text/javascript"></script>
<script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>