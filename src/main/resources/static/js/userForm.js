function saveUser() {
    let mydata={
        idUser:$("#idUser").val(),
        identificationUser:$("#identificationUser").val(),
        nameUser:$("#nameUser").val(),
        birthDayUser:$("#birthDayUser").val(),
        monthBirthDayUser:$("#monthBirthDayUser").val(),
        addressUser:$("#addressUser").val(),
        cellphoneUser:$("#cellphoneUser").val(),
        emailUser:$("#emailUser").val(),
        passwordUser:$("#passwordUser").val(),
        zoneUser:$("#zoneUser").val(),
        typeUser:$("#typeUser").val(),
    };
    let dataToSend=JSON.stringify(mydata);
    console.log(mydata);
    $.ajax({
        url: "http://localhost:8080/api/user/save",
        type: "POST",
        data: mydata,
        dataType: "JSON",
        ContentType:"application/json;charset=utf-8",
        success: function (respuesta) {
            console.log(respuesta);
            resultado(respuesta)	
        },

        error: function (xhr, status) {
            console.log("algo fallo");
        },
        complete: function (xhr, status) {
            console.log("Todo super bien"  + status);
        }
    });
}


