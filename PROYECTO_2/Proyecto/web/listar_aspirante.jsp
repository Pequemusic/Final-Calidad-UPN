<%-- 
    Document   : aspirantes
    Created on : 12-may-2020, 17:37:17
    Author     : VB
--%>

<%@page import="Controlador.Controlador_aspirante"%>
<%@page import="modelo.aspirante"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Lista de aspirantes';    
</script>

<section class="container_aspirantes">
    <h2>ASPIRANTES</h2>

    <table border="1">
        <tr>
            <th>DNI</th><th>POSTULACION</th><th>NOMBRES</th><th>APELLIDOS</th><th>DIRECCION</th><th>DISTRITO</th><th>CORREO</th><th>CELULAR</th>
            <th>FIJO</th><th>FECHA</th><th>SEXO</th><th>HIJOS</th><th>AREA</th><th>CV</th>
            <th>Opcion</th>
        </tr>            

        <%
            ArrayList<aspirante> lista = new Controlador_aspirante().listar();
            for (int i = 0; i < lista.size(); i++) {%>
        <tr>
            <td><%= lista.get(i).getDni()%></td>
            <td><%= lista.get(i).getPostulacion()%></td>
            <td><%= lista.get(i).getNombres()%></td>
            <td><%= lista.get(i).getApellidos()%></td>
            <td><%= lista.get(i).getDireccion()%></td>
            <td><%= lista.get(i).getDistrito()%></td>
            <td><%= lista.get(i).getCorreo()%></td>
            <td><%= lista.get(i).getCelular()%></td>
            <td><%= lista.get(i).getFijo()%></td>
            <td><%= lista.get(i).getFecha()%></td>
            <td><%= lista.get(i).getSexo()%></td>
            <td><%= lista.get(i).getHijos()%></td>
            <td><%= lista.get(i).getArea()%></td>
            <td><%= lista.get(i).getCv()%></td>
            <td> <a href="ingresar_cita.jsp?codigo=<%=lista.get(i).getDni()%>">Generar cita</a> </td>
        </tr>

        <%}
        %>
    </table>
</section>
<br>
<br>

<%@include file="templates/footer_interno.jsp"%>