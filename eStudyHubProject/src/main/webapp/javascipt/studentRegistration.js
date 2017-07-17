function saveStudentRegistrationDetails() {
	var gender="";
	if($('#female').val()=="F"){
		gender="F";
	}else{
		gender="M";
	}
	//var gender=document.studentRegisterform.sgender.value;
	//var RTEcandidate=document.studentRegisterform.sRTEcandidate.value;
	//var previousSchooling = [];
	var studentprofileinfo={
			"studentFirstName" : $('#sfirstname').val(),
			"studentMiddleName" : $('#smiddlename').val(),
			"studentLastName" : $('#slastname').val(),
			"studentPreferredName" : $('#spreferredname').val(),
			"gender" : gender,
	//	"studentDateOfBirth" : new Date($('#sdateofbirth').val()),
			 "studentPlaceOfBirth" : $('#splaceofbirth').val(),
			"studentRace" : $('#sStudentrace').val(),
			"studentLiveWith" : $('#slivewith').val(),
			"studentAadharCard" : $('#saadharcard').val(),
			"studentReligion" : $('#sreligion').val(),
			"studentCaste" : $('#scaste').val(),
			"studentCategory" : $('#scategory').val(),
			//"studentRTECandidate" : RTEcandidate,
			"studentAddressLine1" : $('#saddress1').val(),
			
			"studentAddressLine2" : $('#saddress2').val(),
			"studentAddressLine3" : $('#saddress3').val(),
			"studentCityOrTown" : $('#stownORcity').val(),
			"studentDistrict" : $('#sdistrict').val(),
			"studentState" : $('#sstate').val(),
			"studentCountry" : $('#scountry').val(),
			
			"studentPostalOrZipCode" : $('#spostalcode').val(),
			"studentHomePhoneNumber" : $('#shomephone').val(),
			"studentMobileNumber" : $('#smobilenumber').val(),
			
	};
	var previousSchooling={
		"schoolName" : $('#sPreviousSchoolName').val(),
		//"categoryofSchool" : $('#sCategoryofSchool').val(),
		//"schoolGrade" : $('#sPreviousSchoolGrade').val(),
		//"gradePercentileOrMarks" : $('#sPreviousSchoolMarks').val(),
	};

	var keyValue = {
			"studentProfileRequest" : studentprofileinfo,
			"PreviousSchoolingRequest" : previousSchooling,
		};

		var stringifyVar = JSON.stringify(keyValue);
	
		$.ajax({
					url : "/eStudyHub/api/save_student_registration_details",
					type : "POST",
					data : stringifyVar,
					dataType : "json",
					contentType : "application/json; charset=utf-8",
					success : function(response) {
						if(response.responseCode==200){
							alert(response.studentProfileBean.studentRegistrationId);
						}
					
						
					},
					error : function(xhr, status, err) {
						alert(err);
					}
				});

	}

