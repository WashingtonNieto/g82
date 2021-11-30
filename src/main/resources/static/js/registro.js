//Carga la libreria Jquery y ubica el cursor en el campo a registrar

$(document).ready(function(){
    estadoInicial()
});

//Intenta autenticar el usuario en la aplicacion

function registrar(){
    //captura los datos que ingreso el usuario en la pagina
    let name =$("#nameUser").val()
    let email =$("#emailUser").val()
    let password =$("#password").val()
    let repeatpassword =$("#passwordrepeat").val()

    let datos={
        name :$("#nameUser").val(),
        email :$("#emailUser").val(),
        password :$("#password").val()
    }

    let datosPeticion = JSON.stringify(datos)

    //utilizo la funcion de JQuery $.ajax para hacer
    //un llamado asincrono a un ws

    $.ajax({
        //url del servicio
        url: "http://localhost:8080/api/user/"+email + "/" + password,
        //tipo de peticion
        type: 'POST',
        contentType: "application/JSON",
        //tipo de contenido
        dataType: 'json',

        //envio de datos capturados por el usuaio a la peticion

        //success: funcion con acciones si todo es ok
        success: function (respuesta){
            //escribe en la consola del desarrollador para efectos de depuracion
            console.log(respuesta);
            resultado(respuesta)
        },
        //error: funcion con acciones si hay error
        //codigo a ejecutar si la peticion falla;
        //son pasados como argumentos a la funcion
        //el objeto de la peticion en crudo y codigo
        //de estatus de la peticion

        error: function(xhr, status){
            //$("#mensajes").html("Ocurrio un problema al ejecutar la peticion..." + status);
            console.log("Algo fallo");
        },
        //complete: funcion con el final de la peticion
        //codigo a ejecutar sin importar si la peticion fallo o no
        complete: function (xhr, status){
            console.log("todo ok" + staturs);
        }
    });
}









