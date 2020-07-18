<%-- 
    Document   : aspirantes
    Created on : 12-may-2020, 17:37:17
    Author     : VB
--%>

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
document.title = 'Lista de citas';    
</script>
<h2>CITAS</h2>
<section class="container_peque clearfix">
    <table border="1">
        <tr>
            <th>ID</th><th>DNI</th><th>TIPO</th><th>FECHA</th><th>HORARIO</th><th>ESTADO</th><th colspan="2">OPCION</th>
        </tr>            

        <%
            ArrayList<cita> lista = new Controlador_cita().listar();
            for (int i = 0; i < lista.size(); i++) {%>
        <tr>
            <td><%=lista.get(i).getId()%></td>
            <td><%=lista.get(i).getDni()%></td>
            <td><%=lista.get(i).getTipo()%></td>
            <td><%=lista.get(i).getFecha()%></td>
            <td><%=lista.get(i).getHora()%></td>
            <td><%=lista.get(i).getEstado()%></td>

            <td> <a href="Modificar_cita.jsp?id=<%=lista.get(i).getId()%>&&estado=<%=lista.get(i).getEstado()%>">Actualizar Estado</a> </th>
                <%
                    if ("ACEPTADO".equals(lista.get(i).getEstado())) {%>
            <td> <a href="ingresar_contrato.jsp?dni=<%=lista.get(i).getDni()%>">Generar Contrato</a> </td> 
            <%}%>
        </tr>

        <%}
        %>
    </table>
</section>
<br>
<br>
<%@include file="templates/footer_interno.jsp"%>
