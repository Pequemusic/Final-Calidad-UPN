<%-- 
    Document   : principal
    Created on : 28-jun-2020, 16:26:20
    Author     : VB
--%>

<%@page import="java.util.List"%>
<%@page import="Controlador.Controlador_login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header_interno.jsp"%>
<%@include file="templates/barra_interno.jsp"%>



<%    String fechaf = "";
    if (session.getAttribute("usuario") != null) {

        fechaf = new Controlador_login().ValidarFecha(String.valueOf(session.getAttribute("fecha")), Integer.parseInt(String.valueOf(session.getAttribute("estado"))));
        if ((fechaf).equals("el plazo para cambiar contraseña vencio")) {
            response.sendRedirect("ingreso.jsp?msg=" + fechaf);
        }
    } else {
        response.setIntHeader("Refresh", 5);
        response.sendRedirect("ingreso.jsp");
    }
%>
<script>alert("<%=fechaf%>");
    document.title = 'Pagina principal!';
</script>
<section class="contenedor">
    <h1 class="titulo_negro">Bienvenido a tu pagina personal</h1>
</section>

<section class="contenedor">
    <input type="hidden" id="rango" value="<%=String.valueOf(session.getAttribute("rango"))%>">
    <div class="row_i">
        <div class="column_1">
            <div id="vinculos_uno" class="vinculos_uno ocultar">
                <h3 class="title_amarillo"> Lista de actividades disponibles: </h3>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="listar_aspirante.jsp">ver Lista de aspirantes</a>
                </div>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="listar_cita.jsp">ver Lista de citas</a>
                </div>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="listar_empleado.jsp">ver Lista de empleados</a>
                </div>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="listar_postulaciones.jsp">ver Lista de postulaciones</a>
                </div>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="listar_contrato.jsp">ver Lista de contratos</a>
                </div>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="ingresar_area.jsp">Ingresar Area</a>
                </div>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="listar_area.jsp">Ver Areas</a>
                </div>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="asistencia.jsp">Asistencia</a>
                </div>
                <br>
            </div>
            <br/>
            <div id="vinculos_dos" class="vinculos_dos ocultar">
                <h3 class="title_amarillo"> Lista de actividades disponibles: </h3>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="listar_aspirante.jsp">ver Lista de aspirantes</a>
                </div>
                <br>
                <div class="enlace">
                    <a class="boton_interno" href="listar_cita.jsp">ver Lista de citas</a>
                </div>
                <div class="enlace">
                    <a class="boton_interno" href="asistencia.jsp">Asistencia</a>
                </div>
                <br>
            </div>
        </div>
        <div class="column_2">
            <h3 class="title_amarillo">Noticias</h3>
            <br>
            <div class="row_i">
                <div class="column_3_1">
                    <div>
                        <img src="img/noticias.jpg" class="responsive">
                    </div>
                    <div class="boton_noticias">
                        <a>Accede a cursos de capacitacion</a>
                    </div>
                </div>
                <div class="column_3_1">
                    <div>
                        <img src="img/Imagen_texto_a.jpg" class="responsive">                        
                    </div>
                    <div class="boton_noticias">
                        <a>Estamos contratando sede Callao</a>
                    </div>
                </div>
                <div class="column_3_1">
                    <div>
                        <img src="img/genio.png" class="responsive">
                    </div>
                    <div class="boton_noticias">
                        <a>Informe mensual de ventas sede Callao</a>
                    </div>
                </div>
            </div>

            <div class="row_i">
                <div class="column_3_1">
                    <div>
                        <img src="img/App-PITS.png" class="responsive">
                    </div>
                    <div class="boton_noticias">
                        <a>Nueva version de aplicativo PITS</a>
                    </div>
                </div>
                <div class="column_3_1">
                    <div>
                        <img src="img/CargaP.jpg" class="responsive">
                    </div>
                    <div class="boton_noticias">
                        <a>Nuevos equipos en sede Lurigancho</a>
                    </div>
                </div>
                <div class="column_3_1">
                    <div>
                        <img src="img/PITS-COURIER-JURIDICO-VIRTUAL.png" class="responsive">
                    </div>
                    <div class="boton_noticias">
                        <a>Evaluacion mensual de desempeño general</a>
                    </div>
                </div>
            </div>
        </div>

    </div>
    <div class="row_i">
        <div class="column_2_1 abajo_i">
            <p>Recuerda mantener siempre tu distancia en las zonas publicas.Para evitar el contagio del virus COVID19.</p>

        </div>
        <div class="column_2_2 abajo_i">
            <p>Si existe algun tipo de duda sobre tu pagina personal porfavor comunicarte con el equipo tecnico en la parte inferior de la pagina.</p>

        </div>
    </div>



</section>
<%@include file="templates/footer_interno.jsp"%>
<script src="JS/interno.js" type="text/javascript"></script>
<script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>