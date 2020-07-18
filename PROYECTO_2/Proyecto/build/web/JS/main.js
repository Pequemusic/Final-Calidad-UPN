(function () {
    "use strict";
    document.addEventListener('DOMContentLoaded', function () {
        var map = L.map('mapa').setView([-12.0140167, -77.05982], 11);

        L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
            attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
        }).addTo(map);

        L.marker([-12.0140167, -77.05982]).addTo(map)
                .bindPopup('PITS Logistica Integral')
                .openPopup();
        L.marker([-12.069375, -77.094237]).addTo(map)
                .bindPopup('PITS Box')
                .openPopup();
        L.marker([-12.0611978,-77.04424]).addTo(map)
                .bindPopup('PITS Sede Breña')
                .openPopup();
        L.marker([-12.0587637,-77.083]).addTo(map)
                .bindPopup('PITS Sede Bellavista')
                .openPopup();
        L.marker([-12.1067969,-77.0190]).addTo(map)
                .bindPopup('PITS Sede Surquillo')
                .openPopup();
        L.marker([-12.1173083,-77.0193]).addTo(map)
                .bindPopup('PITS Sede miraflores')
                .openPopup();
        
    });
})();

$(function () {
    $(window).scroll(function () {
        var scroll = $(window).scrollTop();
    });
    $('.programa-evento .info-sede:first').show();
    $('.menu-programa a:first').addClass('activo');
    $('.menu-programa a').on('click', function () {
        $('.menu-programa a').removeClass('activo');
        $(this).addClass('activo');
        $('.ocultar').hide();
        var enlace = $(this).attr('href');
        $(enlace).fadeIn(1000);
        return false;
    });

    //Animaciones para los numeros
    $('.resumen-evento li:nth-child(1) p').animateNumber({number: 1000}, 1200);
    $('.resumen-evento li:nth-child(2) p').animateNumber({number: 2500}, 1200);
    $('.resumen-evento li:nth-child(3) p').animateNumber({number: 1700}, 1200);
    $('.resumen-evento li:nth-child(4) p').animateNumber({number: 2000}, 1200);

    //Cuenta regresiva
    $('.cuenta-regresiva').countdown('2020/12/01 09:00:00', function (event) {
        $('#dias').html(event.strftime('%D'));
        $('#horas').html(event.strftime('%H'));
        $('#minutos').html(event.strftime('%M'));
        $('#segundos').html(event.strftime('%S'));
    });
});


