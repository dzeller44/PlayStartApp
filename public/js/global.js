function profileServicesOtherShowHide(field) {
	if (field.value == "other") {
		alert("check");
		document.getElementById("otherService").style.display = "block";
	} else {
		document.getElementById("otherService").style.display = "none";
	}
}

function isLoggedOn() {
	var email = '<%= Session["email"] %>';
	if (email != null || email != "") {
		return true;
	}
	else {
		return false;
	}
}