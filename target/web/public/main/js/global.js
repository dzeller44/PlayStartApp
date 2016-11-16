function profileServicesOtherShowHide(field) {
	if (field.value == "other") {
		alert("check");
		document.getElementById("otherService").style.display = "block";
	} else {
		document.getElementById("otherService").style.display = "none";
	}
}

function isLoggedIn() {
	var returnValue = "";
	var email = '<%= Session["email"] %>';
	// var email = '<%= session.getAttribute("email") %>';
	console.log("email = " + email);
	window.alert("email = " + email);
	if (email != null || email != "") {
		returnValue = "true";
	} else {
		returnValue = "false";
	}
	console.log("isLoggedOn() = " + returnValue);
	window.alert("isLoggedOn() = " + returnValue);
	return returnValue;
}

function deleteUser(email) {
	// var email = document.getElementById("email").value;

	// alert("In delete user - email = " + email);

	window.location.href = '/deleteuser/' + email;
}

function deleteProfile(name) {
	window.location.href = '/deleteprofile/' + name;
}

function openSave() {
	document.execCommand("saveas", false, "");
}

function joinServices() {
	var checkboxes = document.getElementsByName("selectServices");
	var vals = [];
	for (var i = 0, n = checkboxes.length; i < n; i++) {
		if (checkboxes[i].checked) {
			vals.push(checkboxes[i].value);
		}
	}
	var str = vals.join(",");
	console.log(str);
	window.location.href = "/saveprofile?services=" + str;

}