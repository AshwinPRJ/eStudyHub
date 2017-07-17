<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function function1() {

		window.location = "/eStudyHubProject/faculty/facultyprofile.jsp";

	}

	function function2() {

		window.location = "/eStudyHubProject/studentregistration/studentProfile.jsp";

	}

	function function3() {

		window.location = "/eStudyHubProject/attendance/studentattendance.jsp";

	}
	function function4() {

		window.location = "/eStudyHubProject/holiday/schoolholiday.jsp";

	}
	function function5() {

		window.location = "/eStudyHubProject/history/leavehistory.jsp";

	}
</script>
<body>

	<table width="40%" align="center">
		<tr>
			<td align="center"><input type="button" class="Button"
				name="BtCustomerSave" id="BtCustomerSave" value="Favulty Profile"
				onclick="function1()"></td>
			<td align="center"><input type="button" class="Button"
				name="BtCustomerBack" id="BtCustomerBack" value="Student Profile"
				onclick="function2()"></td>
			<td align="center"><input type="button" class="Button"
				name="BtCustomerBack" id="BtCustomerBack" value="Student Attendance"
				onclick="function3()"></td>
			<td align="center"><input type="button" class="Button"
				name="BtCustomerBack" id="BtCustomerBack" value="Leave"
				onclick="function4()"></td>

			<td align="center"><input type="button" class="Button"
				name="BtCustomerBack" id="BtCustomerBack" value="Leave History"
				onclick="function5()"></td>
		</tr>
	</table>
</body>
</html>