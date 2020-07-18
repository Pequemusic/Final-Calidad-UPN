<div class="barra">
    <div class="contenedor clearfix"> 
        <p class="navegacion_titulo">Usuario: <%=String.valueOf(session.getAttribute("usuario"))%></p>
        <nav class="navegacion-principal">
            <a href="principal.jsp">Pagina principal</a>
            <a href="ingreso.jsp?valor=cerrar">Salir</a>
        </nav>
    </div>
</div>
