<%-- 
    Document   : aspirantes
    Created on : 12-may-2020, 17:37:17
    Author     : VB
--%>

<%@page import="Controlador.Controlador_contrato"%>
<%@page import="modelo.contrato"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Lista de contratos';    
</script>
<h2>CONTRATOS</h2>
<section class="contenedor">
    <table border="1">
        <tr>
            <th>ID_CONTRATO</th><th>DNI</th><th>FECHA INICIO</th><th>DURACION</th><th>FECHA FIN</th><th>AREA</th><th>CARGO</th><th>DIAS TRAB</th><th>HORARIO</th>
            <th>SUELDO</th><th>ASIG FAMILIAR</th><th>CUENTA</th><th>SEGURO</th>
        </tr>            

        <%
            ArrayList<contrato> lista = new Controlador_contrato().listar();
            for (int i = 0; i < lista.size(); i++) {%>
        <tr>
            <td><%=lista.get(i).getId()%></td>
            <td><%=lista.get(i).getDni()%></td>
            <td><%=lista.get(i).getFechai()%></td>
            <td><%=lista.get(i).getDuracion()%></td>
            <td><%=lista.get(i).getFechaf()%></td>
            <td><%=lista.get(i).getArea()%></td>
            <td><%=lista.get(i).getCargo()%></td>
            <td><%=lista.get(i).getDiast()%></td>
            <td><%=lista.get(i).getHorario()%></td>
            <td><%=lista.get(i).getSueldo()%></td>
            <td><%=lista.get(i).getAsignacion()%></td>
            <td><%=lista.get(i).getCuenta()%></td>
            <td><%=lista.get(i).getSeguro()%></td>
        </tr>

        <%}
        %>
    </table>
</section>
<br>
<br>
<%@include file="templates/footer_interno.jsp"%>