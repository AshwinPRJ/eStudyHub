function save() {


	var facultyProfiling = {
		firstName : $("#firstname").val(),
		middleName : $("#middlename").val(),
		lastName : $("#lastname").val(),
		gender : $('input[name=gender]:checked').val(),
		addressLine1 : $("#address1").val(),
		addressLine2 : $("#address2").val(),
		addressLine3 : $("#address3").val(),
		city : $("#city").val(),
		state : $("#state").val(),
		country : $("#country").val(),
		postalCode : $("#postalcode").val(),
		homePhone : $("#homephone").val(),
		cellPhone : $("#cellphone").val(),
		dateOfBirth : new Date($("#dob").val()),
		uploadPhoto1 : $("#up1").val(), 
		uploadPhoto2 : $("#up2").val(),
		referredBy : $("#referredby").val(),
		department : $("#department").val(),
		subjectTeacher : $("#subjectteacher").val(),
		classTeacher : $("#classteacher").val(),
	};

	var facultyQualification = {
		course : $("#Course").val(),
		batch : $("#batch").val(),
		university : $("#University").val(),
		grade : $("#Grade").val(),
	/* uploadCertificate : $("#address1").val(), */
	};

	var facultySkillSet = {
		skillSets : $("#skillset").val(),
		experience : $("#Exprience").val(),
		level : $('input[name=Level]:checked').val(),
		certified : $('input[name=Certified]:checked').val(),
		/* uploadCertificate : $("#batch").val(), */
		patens : $("#Pattens").val(),
		blogs : $("#Blogs").val(),
	};

	var facultySalary = {
		ctcSalary : $("#ctc").val(),
		year : $("#Batch").val(),
		percentageIncrement : $("#Increment").val(),
		currency : $("#Currency").val(),
	};

	var facultyDesignation = {
		roles : $("#Roles").val(),
		grade : $("#Grade").val(),
		responsibilities : $("#Responsibility").val(),
		year : $("#Year").val(),
		lastPromoted : $("#LastPromoted").val(),
	};

	var keyValue = {
		"facultyProfileBean" : facultyProfiling,
		"facultyQualificationBean" : facultyQualification,
		"facultySkillSetsBean" : facultySkillSet,
		"facultySalaryBean" : facultySalary,
		"facultyDesignationBean" : facultyDesignation
	};

	var stringifyVar = JSON.stringify(keyValue);
	$.ajax({
		url : "/eStudyHubProject/api/faculty/facultyProfiling",
		type : "POST",
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		data : stringifyVar,
		success : function(response) {
			alert("Success " + response.responseMessage);
		},
		error : function(xhr, status, err) {
			alert("Error" + status);
		}
	});
}