function getUser(){
    $.ajax({
        url: "http://localhost:8080/api/user/all",
        type: 'GET',
        dataType: 'JSON',
        success: function (response){
            console.log(response);
            printListUser(response)
        }
    });
}
function printListUser(response){
    let myTable="<table>"
    myTable+="<tr>";
        myTable+="<td>Identificacion</td>";
        myTable+="<td>Nombre</td>";
        myTable+="<td>Direccion</td>";
        myTable+="<td>Telefono</td>";
        myTable+="<td>Correo</td>";
        myTable+="<td>Contrasena</td>";
        myTable+="<td>Zona</td>";
        myTable+="<td>Tipo</td>";
    "</tr>"
    for(i=0;i<response.length;i++){
        myTable+="<tr>";
            myTable+="<td>" + response[i].identification + "</td>";
            myTable+="<td>" + response[i].name + "</td>";
            myTable+="<td>" + response[i].address + "</td>";
            myTable+="<td>" + response[i].cellPhone + "</td>";
            myTable+="<td>" + response[i].email + "</td>";
            myTable+="<td>" + response[i].password + "</td>";
            myTable+="<td>" + response[i].zone + "</td>";
            myTable+="<td>" + response[i].typeUser + "</td>";
            myTable+='<td><button class = ""> onclick="borrar(' + response[i].id + ')">Borrar!</button></td>';
            myTable+='<td><button class = ""> onclick="CargarDatos(' + response[i].id + ')">Cargar</button></td>';
            myTable+='<td><button class = ""> onclick="Actualizar(' + response[i].id + ')">Actualizar</button></td>';
            myTable+="<tr>";
    }
    myTable+="</table>"
    #("#milistaUser").html(myTable);
}

function borrar(idUser){
    var element = {
        id: idUser
    }
    var dataToSend = JSON.stringify(element);

    $.ajax(
        {
            dataType: 'json',
            data: dataToSend,
            url: "http://localhost:8080/api/user" + idUser,
            type: 'DELETE',
            contentType: "application/JSON",
            success: function(response){
                console.log(response);
                $("#miListaUser").empty();

                alert("Se ha eliminado correctamente")
            },
            error: function(jqXHR, textStatus, errorThrown){
                alert("No se elimino!!")
            }
        });

}










