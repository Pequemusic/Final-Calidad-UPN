<%-- 
    Document   : aspirantes
    Created on : 12-may-2020, 17:37:17
    Author     : VB
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.area"%>
<%@page import="Controlador.Controlador_area"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controlador.Controlador_aspirante"%>
<%@page import="modelo.aspirante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Ingresar empleado';    
</script>
<h2>ASPIRANTES</h2>
<div class="container_peque">
    <div id="error" class="error ocultar">        
    </div>
</div>
<section class="contenedor clearfix">
    <form action="" method="get">
        <div class="row">
            <div class="col-25">
                <label>dni</label>
            </div>
            <div class="col-75">
                <input type="text" name="dni" maxlength="8" onkeypress="return numeros(event)" id="dni"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>nombres</label>
            </div>
            <div class="col-75">                
                <input type="text" name="nombres" onkeypress="return letras(event)" id="nombres"<br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>apellidos</label>
            </div>
            <div class="col-75">
                <input type="text" name="apellidos" onkeypress="return letras(event)" id="apellidos"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>direccion</label>
            </div>
            <div class="col-75">
                <input type="text" name="direccion" onkeypress="return letras(event)" id="direccion"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>distrito</label>
            </div>
            <div class="col-75">
                <select type="text" name="distrito">
                    <%
                        List<String> distritoo = new Controlador_aspirante().llenarDistritos();
                        for (int i = 0; i < distritoo.size(); i++) {
                    %>
                    <option value="<%=distritoo.get(i)%>"><%=distritoo.get(i)%></option>
                    <%}%>
                </select>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>correo</label>
            </div>
            <div class="col-75">
                <input type="email" name="correo" id="correo"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>celular</label>
            </div>
            <div class="col-75">
                <input type="text" name="celular"  maxlength="9" onkeypress="return numeros(event)" id="celular"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>fijo</label>
            </div>
            <div class="col-75">
                <input type="text" name="fijo"  maxlength="7" onkeypress="return numeros(event)" id="fijo"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>fecha de nacimiento</label>
            </div>
            <div class="col-75">
                <input type="date" name="fecha" id="fecha"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>sexo</label>
            </div>
            <div class="col-75">
                <select type="text" name="sexo">
                    <option value="0">hombre</option>
                    <option value="1">mujer</option>
                    <option value="2">no especifica</option>
                </select><br/> 
            </div>
        </div>

        <div class="row">
            <div class="col-25">  
                <label>hijos</label>
            </div>
            <div class="col-75">
                <input type="text" name="hijos" onkeypress="return numeros(event)" id="hijos"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>area</label>
            </div>
            <div class="col-75">
                <select type="text" name="area">
                    <%
                        ArrayList<area> listaArea = new Controlador_area().listar();
                        for (int i = 0; i < listaArea.size(); i++) {
                    %>
                    <option value="<%=listaArea.get(i).getId()%>"><%= listaArea.get(i).getNombre()%></option>
                    <%}%>
                </select><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>cv</label>
            </div>
            <div class="col-75">
                <input type="file" name="cv" class="custom-file-input" id="file"onchange="return fileValidation()"><br/>
            </div>
        </div>

        <div class="row">
            <input type="submit" value="Enviar" onclick="return ValidadIngEmpleado();" name="btnRegistrar">
        </div>
        <%
            if (request.getParameter("btnRegistrar") != null) {
                String dni = request.getParameter("dni");
                String nombres = request.getParameter("nombres");
                String apellidos = request.getParameter("apellidos");
                String direccion = request.getParameter("direccion");
                String distrito = request.getParameter("distrito");
                String correo = request.getParameter("correo");
                String celular = request.getParameter("celular");
                String fijo = request.getParameter("fijo");
                String fecha = request.getParameter("fecha");
                String sexo = request.getParameter("sexo");
                String hijos = request.getParameter("hijos");
                String area = request.getParameter("area");
                String cv = request.getParameter("cv");

                aspirante a = new aspirante(dni, 0, nombres, apellidos, direccion, distrito, correo, celular, fijo, fecha, sexo, hijos, area, cv);
                int r = new Controlador_aspirante().insertar(a);
                request.getRequestDispatcher("listar_aspirante.jsp").forward(request, response);
            }
        %>
    </form>
    <div class="container_peque">
        <div id="error1" class="error1 ocultar">        
        </div>
    </div>
</section>
<script>
    function fileValidation() {
        var error = document.getElementById("error1");
        var fileInput = document.getElementById('file');

        var filePath = fileInput.value;

        // Allowing file type 
        var allowedExtensions =
                /(\.doc|\.docx|\.odt|\.pdf|\.tex|\.txt|\.rtf|\.wps|\.wks|\.wpd)$/i;

        if (!allowedExtensions.exec(filePath)) {
            $('div.error1').removeClass('ocultar');
            error.innerHTML = "Archivo no valido. Solo se acepta .doc y .pdf";
            fileInput.value = '';
            return false;
        }

    }
</script>
<br>
<br>
<%@include file="templates/footer_interno.jsp"%>
<script src="JS/validaciones.js" type="text/javascript"></script>
<script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>
