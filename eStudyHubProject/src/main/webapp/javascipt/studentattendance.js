$(document).ready(function() {
	$(window).load( function() {
		$.ajax({
			url : "/eStudyHub/api/student/studentAttendance",
			type : "POST",
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			success : function(data) {
				var tableData = "";
				$.each(data,function(key,value) {
					tableData += '<tr><td align= "middle">'	+ value.studentRegistrationId + '</td><td align= "middle">' + value.studentFirstName + '</td><td align= "middle">'+ value.studentLastName + '</td><td align= "middle"><input type="radio" name="freezetransaction" id="Creditfreeze" value="A" onClick="DisableEnable()"></td><td align= "middle"><input type="button" name="delbut" id="delbut" value="Save" onclick="deleteRow(this)"/></td>';
				});
				$('#Table tbody').empty();
				$('#Table tbody').append(tableData);
			},
			error : function(xhr,status, err) {
				alert("Not a Valid Account   "+ status);
				$('#Table tbody').empty();
			}
		});
	});
});
