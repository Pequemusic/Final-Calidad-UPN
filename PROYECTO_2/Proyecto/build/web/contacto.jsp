<%-- 
    Document   : contacto
    Created on : 28/06/2020, 11:25:56 PM
    Author     : Manuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Contacto</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/main.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/lightbox.css" rel="stylesheet" type="text/css"/>
        <script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans&family=Oswald&family=PT+Sans&display=swap" rel="stylesheet">

    </head>
    <%@include file="templates/barra.jsp"%>
    <div class="contacto parallax">
        <div class="contenedor clearfix">
            <div class="titulo">
                <h1>Contacto</h1>
            </div>            
        </div>
    </div>
    <section class="container">
        <h2>Nuestras sedes</h2>
        <div class="galeria">
            <a href="img/galeria/01.jpg" data-lightbox="galeria">
                <img src="img/galeria/thumbs/01.jpg">
            </a>
            <a href="img/galeria/02.jpg" data-lightbox="galeria">
                <img src="img/galeria/thumbs/02.jpg">
            </a>  
            <a href="img/galeria/03.jpg" data-lightbox="galeria">
                <img src="img/galeria/thumbs/03.jpg">
            </a>  
            <a href="img/galeria/04.jpg" data-lightbox="galeria">
                <img src="img/galeria/thumbs/04.jpg">
            </a>  
        </div>
    </section>
    <section class="container">
        <h2>Telefonos de contacto</h2>
        <div class="img_ventas">            
        </div>
        <div class="img_ope">            
        </div>
        <h2>Correo electronico</h2>
        <p class="correo">ventas@pits.com.pe</p>
    </section>
    <div class="contacto parallax">
        <div class="contenedor clearfix">
            <div class="titulo">
                <h1>Esperamos tu llamada PITS Logistica Integral</h1>
            </div>            
        </div>
    </div>

    <%@include file="templates/footer.jsp"%>
    <script src="JS/lightbox.js" type="text/javascript"></script>

    <script src="https://kit.fontawesome.com/c0ecea9977.js" crossorigin="anonymous"></script>
