<%-- 
    Document   : aspirantes
    Created on : 12-may-2020, 17:37:17
    Author     : VB
--%>

<%@page import="fecha.Fecha"%>
<%@page import="Controlador.Controlador_cita"%>
<%@page import="modelo.cita"%>
<%@page import="Controlador.Controlador_aspirante"%>
<%@page import="modelo.aspirante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Generar cita';    
</script>
<h2>Generar cita</h2>
<div class="container_peque">
    <div id="error" class="error ocultar">        
    </div>
</div>
<section class="container clearfix">
    <form action="" method="get">
        <div class="row">
            <div class="col-25">
                <label>dni</label>
            </div>
            <div class="col-75">
                <input type="text" value="<%=(request.getParameter("codigo"))%>" disabled="">
                <input type="hidden" name="dni" value="<%=(request.getParameter("codigo"))%>"><br/>
            </div>

        </div>
        <div class="row">
            <div class="col-25">
                <label>tipo</label>
            </div>
            <div class="col-75">
                <select type="text" name="tipo">
                    <option value="entrevista">entrevista</option>
                    <option value="analisis de rendimiento">analisis de rendimiento</option>
                </select><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>fecha</label>
            </div>
            <div class="col-75">
                <input type="date" name="fecha" id="fecha" min="<%=new Fecha().FormatoFecha()%>"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>hora</label>
            </div>
            <div class="col-35">
                <select  name="horario">
                    <% for (int i = 7; i <= 18; i++) {%>
                    <option value="<%=i%>"> <%=i%> </option> <%}%>
                </select> 
            </div>
            <div class="col-5">
                <label> : </label>
            </div>
            <div class="col-35">
                <select  name="horario2">
                    <% for (int i = 0; i <= 59; i++) {%>
                    <option value="<%=i%>"> <%=i%> </option> <%}%>
                </select><br/>
            </div>
        </div>


        <br/>
        <br/>

        <div class="row">
            <input type="submit" value="Enviar" onclick="return ValidarIngCita();"name="btnRegistrar">
        </div>

        <%
            if (request.getParameter("btnRegistrar") != null) {
                String dni = request.getParameter("dni");
                String tipo = request.getParameter("tipo");
                String fecha = request.getParameter("fecha");
                String horario = request.getParameter("horario") + "," + request.getParameter("horario2");
                String estado = "0";

                cita a = new cita(0, dni, tipo, fecha, horario, estado);
                int r = new Controlador_cita().insertar(a);
                out.print(r);
                request.getRequestDispatcher("listar_cita.jsp").forward(request, response);
            }
        %>
    </form>
</section>
<br>

<%@include file="templates/footer_interno.jsp"%>
<script src="JS/validaciones.js" type="text/javascript"></script>
<script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>