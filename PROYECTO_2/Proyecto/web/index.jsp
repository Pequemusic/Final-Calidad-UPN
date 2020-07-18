
<%@include file="templates/header.jsp"%>
<%@include file="templates/barra.jsp"%>
<link rel="stylesheet" href="https://unpkg.com/leaflet@1.6.0/dist/leaflet.css" />
<script>
document.title = 'PITS Logistica Integral';    
</script>
<section class="seccion contenedor">
    <h2>Bienvenidos a PITS</h2>
    <p>
        Hemos evolucionado en base al mercado; y por eso mismo, nos hemos fortalecido con todos nuestros recursos a ser especialistas en distribución de documentos valorados con tecnología de punta , tanto para el sector público como privado.
    </p>
    <p>
        Contamos con más de 23 años de experiencia garantizando la entrega oportuna y una comunicación activa con nuestro cliente y su usuario directo. Desarrollamos el proceso idóneo para alcanzar los estándares de nuestros clientes, brindando innovadoras herramientas de seguridad y confianza, que permitirán un proceso óptimo garantizado.
    </p>
</section>

<section class="programa">
    <div class="contenedor-video">
        <video autoplay loop poster="img/bg-talleres.jpg">
            <source src="video/video.mp4" type="video/mp4">
            <source src="video/video.webm" type="video/webm">
            <source src="video/video.ogv" type="video/ogg">
        </video>
    </div>
    <div class="contenido-programa">
        <div class="contenedor">
            <div class="programa-evento">
                <h2>Programa del evento</h2>
                <nav class="menu-programa">
                    <a href="#servicios"><i class="fas fa-briefcase"></i> Nuestros servicios</a>
                    <a href="#sedes"><i class="far fa-building"></i> Nuestras sedes</a>                   
                    <a href="#contacto"><i class="fas fa-phone-square-alt"></i> Telefonos de contacto</a>
                </nav>



                <div id="servicios" class="info-sede ocultar clearfix">
                    <div class="detalle-evento">
                        <h3>Courier Juridico</h3>
                        <p>Envíos de documentos jurídicos, tales como notificaciones, cartas notariales a entidades públicas como el Poder Judicial, el Ministerio Público, Ministerio de Salud, etc.</p>
                    </div>                    
                    <div class="detalle-evento">
                        <h3>Correo Electronico Certificado</h3>
                        <p>El email certificado te permite tener una prueba, con validez legal, del momento en que se envía, el momento en que se recibe.</p>
                    </div>                    
                    <div class="detalle-evento">
                        <h3>Courier y Carga</h3>
                        <p>Con Pits como tu primera opción, estarás garantizando a tu cliente una experiencia de entrega de documentos única.</p>
                    </div>                 
                    <a href="servicios.jsp" class="button float-right">Ver más</a>
                </div>

                <div id="sedes" class="info-sede ocultar clearfix">
                    <div class="detalle-evento">
                        <h3>Pits Lima</h3>
                        <p><i class="fas fa-home"></i></i> Calle Primavera Nº 1227 Urb. Los Jardines
                            San Martín de Porres</p>
                    </div>
                    <div class="detalle-evento">
                        <h3>Pits Trujillo</h3>
                        <p><i class="fas fa-home"></i></i> Psje. Eduardo Bello Nº 158 Urb. Chimu
                            Trujillo Perú</p>
                    </div>
                    <div class="detalle-evento">
                        <h3>Pits Miami</h3>
                        <p><i class="fas fa-home"></i></i> Postal: 8376 NW 68th Street
                            Miami Florida 33166</p>
                    </div>
                    <a href="contacto.jsp" class="button float-right">Ver más</a>
                </div>

                <div id="contacto" class="info-sede ocultar clearfix">
                    <div class="detalle-evento">
                        <h3>Ventas</h3>
                        <p><i class="fas fa-phone"></i></i> 924 602 949</p>
                    </div>
                    <div class="detalle-evento">
                        <h3>Operaciones</h3>
                        <p><i class="fas fa-phone"></i></i> 924 602 292</p>
                    </div>
                    <div class="detalle-evento">
                        <h3>Hora de atención</h3>
                        <p><i class="far fa-clock"></i></i> Lun - Sáb : 9 a 6 pm</p>
                    </div>
                    <a href="contacto.jsp" class="button float-right">Ver más</a>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="invitados contenedor seccion">
    <h2>Nuestros directivos</h2>
    <ul class="lista-invitados clearfix">
        <li>
            <div class="invitado">
                <img src="img/invitado1.jpg" alt="imagen invitado">
                <p>Jorge Bautista</p>
            </div>
        </li>
        <li>
            <div class="invitado">
                <img src="img/invitado2.jpg" alt="imagen invitado">
                <p>Ana Lopéz</p>
            </div>
        </li>
        <li>
            <div class="invitado">
                <img src="img/invitado3.jpg" alt="imagen invitado">
                <p>Raul Romero</p>
            </div>
        </li>
        <li>
            <div class="invitado">
                <img src="img/invitado4.jpg" alt="imagen invitado">
                <p>Claudia Ramiréz </p>
            </div>
        </li>
        <li>
            <div class="invitado">
                <img src="img/invitado5.jpg" alt="imagen invitado">
                <p>Juan Carlos Trujillo</p>
            </div>
        </li>
        <li>
            <div class="invitado">
                <img src="img/invitado6.jpg" alt="imagen invitado">
                <p>Maria Chavez</p>
            </div>
        </li>
    </ul>
</section>

<div class="contador parallax">
    <div class="contenedor">
        <ul class="resumen-evento clearfix">
            <li>mas de<p class="numero"></p>Envios realizados</li>
            <li>mas de<p class="numero"></p>Emails con valor legal enviados</li>
            <li>mas de<p class="numero"></p>SMS con valor legal </li>
            <li>mas de<p class="numero"></p>Courier juridico</li>
        </ul>
    </div>
</div>

<section class="precios seccion">
    <h2>Nuestros servicios</h2>
    <div class="contenedor">
        <ul class="lista-precios clearfix">
            <li>
                <div class="tabla-precio">
                    <h3>Email con valor legal</h3>
                    <br>
                    <p>Ofrecemos los servicios a nivel 
                        Local y Nacional
                        es:</p>
                    <br>
                    <ul>
                        <li>Facil de usar</li>
                        <li>Legal</li>
                        <li>Economico</li>
                    </ul>
                    <a href="servicios.jsp" class=" button hollow">Ver más</a>
                </div>                        
            </li>
            <li>
                <div class="tabla-precio">
                    <h3>Courier juridico</h3>
                    <br>
                    <p>Especialistas en entrega de notificaciones
                        regidas por la Ley Nº 27444,
                        tanto a nivel local como nacional.
                        es:</p>
                    <br>
                    <ul>
                        <li>Seguro</li>
                        <li>Flexible</li>
                        <li>Rápido</li>
                    </ul>
                    <a href="servicios.jsp" class=" button">Ver más</a>
                </div>                        
            </li>
            <li>
                <div class="tabla-precio">
                    <h3>Curier y carga</h3>
                    <br>
                    <p>Ofrecemos los servicios a nivel
                        Local y Nacional
                        Somos:</p>
                    <br>
                    <ul>
                        <li>Puntuales</li>
                        <li>Cuidadosos</li>
                        <li>Rápidos</li>
                    </ul>
                    <a href="servicios.jsp" class=" button hollow">Ver más</a>
                </div>                        
            </li>
        </ul>                
    </div>
</section>

<div id="mapa" class="mapa">

</div>

<section class="seccion">
    <h2>Testimoniales</h2>
    <div class="testimoniales contenedor clearfix">
        <div class="testimonial">
            <blockquote>
                <p>Buen servicio, buenos precios y rapidez en la importación.</p>
                <div class="info-testimonial clearfix">
                    <img src="img/foto8.jpg" alt="ïmagen testimonial">
                    <cite>Manuel Rafael Paitan<span>Usuario</span></cite>
                </div>
            </blockquote>
        </div>
        <div class="testimonial">
            <blockquote>
                <p>Muy rápido, seguro y eficiente. Además responden muy rápido a las consultas. Recomendado </p>
                <div class="info-testimonial clearfix">
                    <img src="img/foto9.jpg" alt="ïmagen testimonial">
                    <cite>Mailly Espinoza<span>Usuario</span></cite>
                </div>
            </blockquote>
        </div>
        <div class="testimonial">
            <blockquote>
                <p>Mi compra llegó tal cual lo indicado. Me asesoraron desde el inicio.Gracias</p>
                <div class="info-testimonial clearfix">
                    <img src="img/foto1.jpg" alt="ïmagen testimonial">
                    <cite>Steven Mignardi Soto<span>Usuario</span></cite>
                </div>
            </blockquote>
        </div>
        <div class="testimonial">
            <blockquote>
                <p>Mi compra llegó tal cual lo indicado. Me asesoraron desde el inicio. Super recomendado. Gracias!!!</p>
                <div class="info-testimonial clearfix">
                    <img src="img/foto2.jpg" alt="ïmagen testimonial">
                    <cite>Luiz Hernandez<span>Usuario</span></cite>
                </div>
            </blockquote>
        </div>
        <div class="testimonial">
            <blockquote>
                <p>Me llego mi envio puntualmente. Gracias!!!</p>
                <div class="info-testimonial clearfix">
                    <img src="img/foto5.jpg" alt="ïmagen testimonial">
                    <cite>Fabiola Gallardo<span>Usuario</span></cite>
                </div>
            </blockquote>
        </div>
        <div class="testimonial">
            <blockquote>
                <p>Super recomendado. Gracias!!!</p>
                <div class="info-testimonial clearfix">
                    <img src="img/foto4.jpg" alt="ïmagen testimonial">
                    <cite>Daniel Vallejos<span>Usuario</span></cite>
                </div>
            </blockquote>
        </div>
    </div>
</section>

<div class="newsletter parallax">
    <div class="contenido contenedor">
        <p class="texto_tra">Trabaja con nosotros</p>
        <h3>PITS Logistica integral</h3>
        <a href="ingresar_aspirantes.jsp" class="button transparente">Registro</a>
    </div>
</div>

<section class="seccion">
    <h2>Falta para aperturar nuestra nueva sede:</h2>
    <div class="cuenta-regresiva contenedor">
        <div class="clearfix">
            <ul class="clearfix">
                <li><p id="dias" class="numero"></p>dias</li>
                <li><p id="horas" class="numero"></p>horas</li>
                <li><p id="minutos" class="numero"></p>minutos</li>
                <li><p id="segundos" class="numero"></p>segundos</li>
            </ul>
        </div>
</section>

<%@include file="templates/footer.jsp"%>
<script src="https://unpkg.com/leaflet@1.6.0/dist/leaflet.js"></script>
<script src="JS/jquery-3.5.0.min.js" type="text/javascript"></script>
<script src="JS/jquery.animateNumber.min.js" type="text/javascript"></script>
<script src="JS/main.js" type="text/javascript"></script>
<script src="JS/jquery.countdown.min.js" type="text/javascript"></script>
<script src="JS/jquery.lettering.js" type="text/javascript"></script>