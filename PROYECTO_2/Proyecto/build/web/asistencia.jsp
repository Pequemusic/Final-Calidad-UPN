<%-- 
    Document   : asistencia
    Created on : 29-jun-2020, 15:46:16
    Author     : VB
--%>

<%@page import="Controlador.Controlador_asistencia"%>
<%@page import="java.util.List"%>
<%@page import="modelo.asistencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>


<%String id_empleado = "";%>

<section class="contenedor clearfix">
    <h2>MANTENER ASISTENCIAS</h2>
    <form action="asistencia.jsp">
        Dni: <input type="text" name="buscar">
        <br>
        <br>
        <input type="submit" value="Buscar">
    </form>
</section>
<br><br>
<section class="container_peque centrado clearfix">
    <table>
        <thead>
            <tr>
                <th>ID</th><th>FECHA</th><th>DESCRIPCION</th><th>ESTADO</th><th>SELECCIONAR</th>
            </tr>
        </thead>
        <tbody>
            <%
                if (request.getParameter("buscar") != null) {
                    id_empleado = new Controlador_asistencia().validarEmpleado(request.getParameter("buscar"));
                    List<asistencia> lista = new Controlador_asistencia().listarTablaAyuda(request.getParameter("buscar"));
                    boolean ok = true;
                    for (int i = 0; i < lista.size(); i++) {%>
            <tr>
                <td><%=lista.get(i).getId_asistencia_ayuda()%></td>
                <td><%=lista.get(i).getFecha()%></td>
                <td><%=lista.get(i).getDescripcion()%></td>
                <td><%=lista.get(i).getEstado_ayuda()%></td>
                <%
                    if(!lista.get(i).getDescripcion().equals("Ok")){
                        ok = false;
                    }
                %>
                <%if(!ok){%><td align="center"> <input type="radio" name="id_ayuda" value="<%=lista.get(i).getId_asistencia_ayuda()%>"> </td><%}%>
            </tr>
            <%}
                }
            %>
        </tbody>
    </table>
</section>
<section class="contenedor clearfix">
    <form>
        <input type="hidden" name="id_empleado" value="<%=id_empleado%>">
        Justificacion: 
        <select name="justificacion">
            <option value="No Aplica">No Aplica</option>
            <option value="Aplica">Aplica</option>
        </select>
        <br>
        <input type="file" name="documento"><br>
        <input type="submit" value="Enviar" name="Enviar">
        <%
            if (request.getParameter("Enviar") != null) {
                int id_asistencia = Integer.parseInt(request.getParameter("id_ayuda"));
                String justificacion = request.getParameter("justificacion");
                String cv = request.getParameter("documento");
                asistencia a = new asistencia(0, id_asistencia, Integer.parseInt(request.getParameter("id_empleado")), justificacion, cv);
                int r = new Controlador_asistencia().insertarAsistencia(a);
            }
        %>
    </form>
</section>
<br><br>
<%@include file="templates/footer_interno.jsp"%>
