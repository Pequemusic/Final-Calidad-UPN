<%-- 
    Document   : aspirantes
    Created on : 12-may-2020, 17:37:17
    Author     : VB
--%>

<%@page import="Controlador.Controlador_empleado"%>
<%@page import="modelo.empleado"%>
<%@page import="Controlador.Controlador_aspirante"%>
<%@page import="modelo.aspirante"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Lista de empleados';    
</script>
<section class="container_aspirantes">
    <h2>ASPIRANTES</h2>

    <table border="1">
        <tr>
            <th>ID</th><th># CONTRATO</th><th>DNI</th><th>NOMBRES</th><th>APELLIDOS</th><th>DIRECCION</th><th>DISTRITO</th><th>CORREO</th><th>CELULAR</th>
            <th>FIJO</th><th>FECHA</th><th>SEXO</th><th>HIJOS</th><th>AREA</th>
        </tr>            

        <%
            ArrayList<empleado> lista = new Controlador_empleado().listar();
            for (int i = 0; i < lista.size(); i++) {%>
        <tr>
            <td><%= lista.get(i).getId_empleado()%></td>
            <td><%= lista.get(i).getId_contrato()%></td>
            <td><%= lista.get(i).getDni()%></td>
            <td><%= lista.get(i).getNombre()%></td>
            <td><%= lista.get(i).getApellido()%></td>
            <td><%= lista.get(i).getDireccion()%></td>
            <td><%= lista.get(i).getDistrito()%></td>
            <td><%= lista.get(i).getCorreo()%></td>
            <td><%= lista.get(i).getCelular()%></td>
            <td><%= lista.get(i).getFijo()%></td>
            <td><%= lista.get(i).getFecha()%></td>
            <td><%= lista.get(i).getSexo()%></td>
            <td><%= lista.get(i).getHijos()%></td>
            <td><%= lista.get(i).getArea()%></td>
        </tr>

        <%}
        %>
    </table>
</section>
<br>
<br>

<%@include file="templates/footer_interno.jsp"%>