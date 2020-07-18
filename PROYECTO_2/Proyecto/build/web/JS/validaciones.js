
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
function ValidarIngreso(){
    var user = document.getElementById("usuario").value;
    var pass = document.getElementById("password").value;
    var errorDiv = document.getElementById("error");
    var mensajeError = [];
    
    if(user===""){
        $('div.error').removeClass('ocultar');
        mensajeError.push("Ingrese su usuario");
    }
    if(pass===""){
        $('div.error').removeClass('ocultar');
        mensajeError.push("Ingrese su contraseña");
    }
    errorDiv.innerHTML = mensajeError.join('<br>');
    if (mensajeError.length > 0) {
        return false;
    } else {
        $('div.error').addClass('ocultar');
        return true;
    }
    
}

function ValidarAspirante() {
    var dni = document.getElementById("dni").value;
    var nombres = document.getElementById('nombres').value;
    var apellidos = document.getElementById('apellidos').value;
    var direccion = document.getElementById('direccion').value;
    var correo = document.getElementById('correo').value;
    var celular = document.getElementById("celular").value;
    var fijo = document.getElementById("fijo").value;
    var fecha = document.getElementById("fecha").value;
    var hijos = document.getElementById('hijos').value;
    var errorDiv = document.getElementById("error");

    var mensajeError = [];
    var r = "";

    if (ValidarDni(dni) !== "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push(ValidarDni(dni));

    }
    if (nombres === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese sus nombres.");
    }
    if (apellidos === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese sus apellidos.");
    }
    if (direccion === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese su direccion.");
    }
    if (correo === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese su correo.");
    }
    if (ValidarCelular(celular) !== "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push(ValidarCelular(celular));
    }
    if (celular.charAt(0) !== 9) {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Celular no Valido");
        mensajeError.push(ValidarCelular(celular));
    }
    if (ValidarFijo(fijo) !== "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push(ValidarFijo(fijo));
    }
    if (ValidarFecha(fecha) !== "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push(ValidarFecha(fecha));
    }
    if (hijos === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese su la cantidad de hijos.");
    }

    errorDiv.innerHTML = mensajeError.join('<br>');
    if (mensajeError.length > 0) {
        return false;
    } else {
        $('div.error').addClass('ocultar');
        return true;
    }
}

function ValidarDni(dni) {
    var bandera = "";
    if (dni.length !== 8)
        bandera = "El Dni debe tener 8 caracteres";
    return bandera;
}

function ValidarCelular(celular) {
    var bandera = "";
    if (celular.length !== 9)
        bandera = "El Calular debe tener 9 caracteres";
    return bandera;
}

function ValidarFijo(fijo) {
    var bandera = "";
    if (fijo.length !== 7)
        bandera = "El Fijo debe tener 7 caracteres";
    return bandera;
}

function ValidarFecha(fecha) {
    var bandera = "";
    var menor = false;
    var f = new Date();
    var fechaActual = f.getFullYear() + "/0" + (f.getMonth() + 1) + "/" + f.getDate();

    var day = fecha.charAt(8) + fecha.charAt(9);
    var month = fecha.charAt(5) + fecha.charAt(6);
    var year = fecha.charAt(0) + fecha.charAt(1) + fecha.charAt(2) + fecha.charAt(3);

    var dayy = fechaActual.charAt(8) + fechaActual.charAt(9);
    var monthh = fechaActual.charAt(5) + fechaActual.charAt(6);
    var yearr = fechaActual.charAt(0) + fechaActual.charAt(1) + fechaActual.charAt(2) + fechaActual.charAt(3);


    if (parseInt(yearr) - parseInt(year) <= 0)
        menor = true;
    if (parseInt(yearr) - parseInt(year) <= 18)
        if (parseInt(month) > parseInt(monthh))
            menor = true;

    if (parseInt(yearr) - parseInt(year) <= 18)
        if (parseInt(month) == parseInt(monthh))
            if (parseInt(day) > parseInt(dayy))
                menor = true;

    if (menor)
        bandera = "Usted es menor de edad";

    if (!fecha)
        bandera = "Seleccione fecha de nacimiento";
    return bandera;
}

function fecha() {
    var f = new Date();
    var fechaActual = f.getFullYear() - 18 + "-0" + (f.getMonth() + 1) + "-" + f.getDate();
    document.querySelector("input#fecha").setAttribute("max", fechaActual);
}

function ValidarModCita() {
    var errorDiv = document.getElementById('error');
    var estado = document.getElementById('estado');
    var estado_1 = document.getElementById('estado_1');
    var mensajeError = [];
    if (!estado.checked) {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Por favor, elija una de las opciones.");
        errorDiv.innerHTML = mensajeError;
        return false;
    } 
    else if(estado_1.value != null){
        
    }
    else {
        $('div.error').addClass('ocultar');
        return true;
    }
}

function ValidadIngArea() {
    var errorDiv = document.getElementById('error');
    var area = document.getElementById('area').value;
    var alpha = /^[a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$/;
    var mensajeError = [];
    if (area === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese un area.");
    }
    if (!area.match(alpha)) {
        mensajeError.push("Porfavor, ingrese solo letras.");
    }
    errorDiv.innerHTML = mensajeError.join('<br>');
    if (mensajeError.length > 0) {
        return false;
    } else {
        $('div.error').addClass('ocultar');
        return true;
    }
}

function ValidarIngCita() {
    var errorDiv = document.getElementById('error');
    var fecha = document.getElementById('fecha').value;
    var mensajeError = [];
    if (!fecha) {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, elija una fecha.");
    }

    errorDiv.innerHTML = mensajeError;
    if (mensajeError.length > 0) {
        return false;
    } else {
        $('div.error').addClass('ocultar');
        return true;
    }
}

function ValidarIngContrato() {
    var errorDiv = document.getElementById('error');
    var fecha = document.getElementById('fecha1').value;
    var duracion = document.getElementById('duracion').value;
    var cargo = document.getElementById('cargo').value;
    var diasTrabajo = document.getElementById('diasTrabajo').value;
    var horario = document.getElementById('horario').value;
    var sueldo = document.getElementById('sueldo').value;
    var cuenta = document.getElementById('cuenta').value;
    var seguro = document.getElementById('seguro').value;
    var mensajeError = [];
    if (!fecha) {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, elija una fecha.");
    }
    if (duracion === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese duracion.");
    }
    if (parseInt(duracion) < 1 || parseInt(duracion) > 36) {
        $('div.error').removeClass('ocultar');
        mensajeError.push("La Duracion debe estar en el rango( 1 - 36 )");
    }
    if (cargo === "-") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese cargo.");
    }
    if (diasTrabajo === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese dias de trabajo.");
    }
    if (horario === "-") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese horario.");
    }
    if (sueldo === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese sueldo.");
    }
    if (cuenta === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese cuenta.");
    }
    if (seguro === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese seguro.");
    }
    errorDiv.innerHTML = mensajeError.join('<br>');
    if (mensajeError.length > 0) {
        return false;
    } else {
        $('div.error').addClass('ocultar');
        return true;
    }
}

function ValidadIngEmpleado() {
    var errorDiv = document.getElementById('error');
    var dni = document.getElementById('dni').value;
    var nombres = document.getElementById('nombres').value;
    var apellidos = document.getElementById('apellidos').value;
    var direccion = document.getElementById('direccion').value;
    var correo = document.getElementById('correo').value;
    var celular = document.getElementById('celular').value;
    var fijo = document.getElementById('fijo').value;
    var fecha = document.getElementById('fecha').value;
    var hijos = document.getElementById('hijos').value;
    var mensajeError = [];
    if (dni.length < 8) {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese su dni de 8 digitos.");
    }
    if (nombres === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese sus nombres.");
    }
    if (apellidos === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese sus apellidos.");
    }
    if (direccion === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese su direccion.");
    }
    if (correo === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese su correo.");
    }
    if (celular.length < 9) {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese su telefono celular de 9 digitos.");
    }
    if (fijo.length < 7) {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese su telefono fijo de 7 digitos.");
    }
    if (!fecha) {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, elija una fecha.");
    }
    if (hijos === "") {
        $('div.error').removeClass('ocultar');
        mensajeError.push("Porfavor, ingrese su la cantidad de hijos.");
    }
    errorDiv.innerHTML = mensajeError.join('<br>');
    if (mensajeError.length > 0) {
        return false;

    } else {
        $('div.error').addClass('ocultar');
        return true;
    }
}

