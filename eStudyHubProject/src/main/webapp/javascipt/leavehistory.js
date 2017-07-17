$(document).ready(
		function() {
			$(window).load(
					function() {
						alert("Data loaded.");
						$.ajax({
							url : "/eStudyHub/api/leave/leaveHistory",
							type : "POST",
							contentType : "application/json; charset=utf-8",
							dataType : "json",
							success : function(data) {
								var tableData = "";
								$.each(data, function(key, value) {
									console.log(value.studentName);
									tableData += '<tr><td align= "middle">'+ value.studentName + '</td><td align= "middle">' + value.leavetype + '</td><td align= "middle">' + value.fromDate + '</td><td align= "middle">' + value.toDate + '</td><td align= "middle">' + value.daysOfLeave + '</td><td align= "middle">' + value.approver + '</td><td align= "middle">' + value.remarks + '</td><td align= "middle">' + value.email  ;

								});

								$('#Table tbody').empty();
								$('#Table tbody').append(tableData);

							},
							error : function(xhr, status, err) {
								alert("Not Valid   " + status);
								$('#Table tbody').empty();
							}
						});
					});
		});
