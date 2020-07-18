<%-- 
    Document   : aspirantes
    Created on : 12-may-2020, 17:37:17
    Author     : VB
--%>

<%@page import="modelo.postulaciones"%>
<%@page import="Controlador.Controlador_postulaciones"%>
<%@page import="Controlador.Controlador_aspirante"%>
<%@page import="modelo.aspirante"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Lista de postulaciones';    
</script>

<h2>ASPIRANTES</h2>
<section class="container_super_peque">
    <table border="1">
        <tr>
            <th>ID</th><th>FECHA</th><th>DNI</th>
        </tr>            

        <%
            ArrayList<postulaciones> lista = new Controlador_postulaciones().listar();
            for (int i = 0; i < lista.size(); i++) {%>
        <tr>
            <td><%= lista.get(i).getId()%></td>
            <td><%= lista.get(i).getFecha()%></td>
            <td><%= lista.get(i).getDni()%></td>
        </tr>

        <%}
        %>
    </table>
</section>
<br>
<br>
<%@include file="templates/footer_interno.jsp"%>