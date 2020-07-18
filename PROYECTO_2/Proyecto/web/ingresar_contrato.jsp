<%-- 
    Document   : aspirantes
    Created on : 12-may-2020, 17:37:17
    Author     : VB
--%>

<%@page import="Validaciones.validacionesContrato"%>
<%@page import="fecha.Fecha"%>
<%@page import="Controlador.Controlador_login"%>
<%@page import="Controlador.Controlador_empleado"%>
<%@page import="Controlador.Controlador_contrato"%>
<%@page import="modelo.contrato"%>
<%@page import="Controlador.Controlador_aspirante"%>
<%@page import="modelo.aspirante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>
<script>
document.title = 'Generar contrato';    
</script>
<script>
    function numeros(e) {
        key = e.keyCode || e.which;
        teclado = String.fromCharCode(key);
        numero = "0123456789";
        if (numero.indexOf(teclado) == -1)
            return false;
    }

    function letras(e) {
        key = e.keyCode || e.which;
        teclado1 = String.fromCharCode(key).toLowerCase(); //convertir a minusculas
        letra = "abcdefghijklmnñopqrstuvwxyz ";
        if (letra.indexOf(teclado1) == -1)
            return false;
    }
</script>


<h2>CONTRATO</h2>
<div class="container_peque">
    <div id="error" class="error ocultar">        
    </div>
</div>
<section class="contenedor clearfix">
    <form action="" method="get">
        <input type="hidden" name="dnii" value="<%=request.getParameter("dni")%>"><br/> 
        <input type="hidden" name="areaa" value="<%=new Controlador_aspirante().ObtenerArea(request.getParameter("dni"))%>"><br/>

        <div class="row">
            <div class="col-25">
                <label>fecha de inicio</label>
            </div>
            <div class="col-75">
                <input type="date" name="fechainicio" id="fecha1" min="<%=new Fecha().FormatoFecha()%>"><br/>   
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>duracion</label>
            </div>
            <div class="col-75">
                <input type="text" name="duracion" placeholder="duracion en meses" id="duracion" onkeypress="return numeros(event)" maxlength="2"><br/>
            </div>
        </div>   

        <div class="row">
            <div class="col-25">
                <label>Cargo</label>
            </div>
            <div class="col-35">
                <select  name="cargo">
                    <option value="0" id="cargo"> Trabajador </option> 
                    <option value="1" id="cargo"> Administrador </option>                   
                </select> 
            </div>

        </div>

        <div class="row">
            <div class="col-25">
                <label>dias de trabajo</label>
            </div>
            <div class="col-75">
                <input type="text" name="diastrabajo" id="diasTrabajo" onkeypress="return letras(event)" placeholder="Ejm. Lunes-Viernes"><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>Horario</label>
            </div>
            <div class="col-35">
                <select  name="horario">                 
                    <option value="Mañana" id="horario"> Mañana </option> 
                    <option value="Tarde" id="horario"> Tarde </option> 
                    <option value="Noche" id="horario"> Noche </option>                     
                </select> 
            </div>

        </div>

        <div class="row">
            <div class="col-25">
                <label>sueldo</label>
            </div>
            <div class="col-75">
                <input type="text" name="sueldo" id="sueldo" onkeypress="return numeros(event)"><br/>
            </div>
        </div>



        <div class="row">
            <div class="col-25">
                <label>cuenta</label>
            </div>
            <div class="col-75">
                <input type="text" name="cuenta" id="cuenta" onkeypress="return numeros(event)" ><br/>
            </div>
        </div>

        <div class="row">
            <div class="col-25">
                <label>seguro</label>
            </div>
            <div class="col-75">
                <input type="text" name="seguro" id="seguro" onkeypress="return letras(event)" ><br/>
            </div>
        </div>
        <br>
        <div class="row">
            <input type="submit" value="Enviar" onclick="return ValidarIngContrato();" name="btnRegistrar">
        </div>

        <%
            if (request.getParameter("btnRegistrar") != null) {
                String dni = request.getParameter("dnii");
                String fechai = request.getParameter("fechainicio");
                int duracion = Integer.parseInt(request.getParameter("duracion"));
                int cargo = Integer.parseInt(request.getParameter("cargo"));
                String diastrabajados = request.getParameter("diastrabajo");
                String area = request.getParameter("areaa");
                String horario = request.getParameter("horario");
                double sueldo = Double.parseDouble(request.getParameter("sueldo"));
                String cuenta = request.getParameter("cuenta");
                String seguro = request.getParameter("seguro");
                //para generar contrato
                contrato a = new contrato(0, dni, fechai, duracion, "", area, cargo, diastrabajados, horario, sueldo, 0, cuenta, seguro);
                int r = new Controlador_contrato().insertar(a);

                //para generar empleado
                int r2 = new Controlador_empleado().insertar(dni);

                //para generar login
                int r3 = new Controlador_login().insertar();

                request.getRequestDispatcher("listar_contrato.jsp").forward(request, response);

            }


        %>
    </form>
</section>
<br>

<%@include file="templates/footer_interno.jsp"%>
<script src="JS/validaciones.js" type="text/javascript"></script>
<script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>