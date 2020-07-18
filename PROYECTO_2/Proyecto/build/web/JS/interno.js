(function () {
    "use strict";
    document.addEventListener('DOMContentLoaded', function () {
        console.log("pagina cargada");
        var rango = parseInt(document.getElementById("rango").value);
        console.log(rango);
        if (rango === 0) {
            console.log("funca 1");
            $('#vinculos_uno').removeClass('ocultar');
        }else{
            console.log("funca 2");
            $('#vinculos_dos').removeClass('ocultar');
        }
    });
})();

