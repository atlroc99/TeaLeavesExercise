$(document).ready(function(){
    $("#delEmpForm").submit(function(event){
        event.preventDefault();
        ajaxSubmitDelete();
    });
});


function ajaxSubmitDelete(){
    var formData = {
        id: $("#delEmpId").val()
    }

    $.ajax({
        type:"GET",
        contentType: "application/json",
        url:"/delete/"+ $("#delEmpId").val(),
        data:formData,
        success: function(){
            window.location="/allEmployees";
            alert("employee deleted: " + $("#delEmpId").val());
        },
        error: function(er){
            console.log('error', er);
        }
    });
}