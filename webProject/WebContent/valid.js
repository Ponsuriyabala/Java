function login() {
		var fname = document.loginform.fname.value;
		var lname = document.loginform.lastname.value;
		var pass = document.loginform.pass.value;
		if(fname==''||lname==''||pass=="")
		{
			alert("all fields required")
			
		}else
		if (pass.length < 8) {
			alert("Enter Strong password");
		} else {
			alert(fname + " " + lname + "\n Login Successfully");
		}
	}