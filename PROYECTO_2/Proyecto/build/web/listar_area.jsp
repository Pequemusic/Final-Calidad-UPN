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
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Lista de areas';    
</script>
<h2>AREAS</h2>
<section class="container_ultra_peque">
    <table border="1">
        <tr>
            <th>ID</th><th>DESCRIPCION</th>
        </tr>            

        <%
            ArrayList<area> lista = new Controlador_area().listar();
            for (int i = 0; i < lista.size(); i++) {%>
        <tr>
            <td><%= lista.get(i).getId()%></td>
            <td><%= lista.get(i).getNombre()%></td>
        </tr>

        <%}
        %>
    </table>
</section>
<br>
<br>        
<%@include file="templates/footer_interno.jsp"%>