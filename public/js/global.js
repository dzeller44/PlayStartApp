function profileServicesOtherShowHide(field) {
	//console.log("field.value = " + field.value.toUpperCase());
	if (field.value.toUpperCase() == "OTHER") {
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
	var checkboxField = document.getElementsByName("selectServices");
	var checkedValues = [];
	for (var i = 0, n = checkboxField.length; i < n; i++) {
		if (checkboxField[i].checked) {
			checkedValues.push(checkboxField[i].value);
		}
	}
	var finalValues = checkedValues.join(",");
	//var servicesField = document.createElement("services");
	//servicesField.setAttribute("type", "hidden");
	console.log("finalValues = " + finalValues);
	document.getElementById("services").value = finalValues;
	window.location.href = "/saveprofile?services=" + finalValues;
}

function getByServices() {
	// Get selected service...
	var e = document.getElementById("selectServices");
	var service = e.options[e.selectedIndex].value;
	console.log("service = " + service);
	window.location.href = "/searchbyservice?service=" + service;	
}

function getByCounty() {
	// Get profiles by county...
	var e = document.getElementById("selectCounty");
	var fieldValue = e.options[e.selectedIndex].value;
	console.log("county = " + fieldValue);
	window.location.href = "/searchbycounty?county=" + fieldValue;	
}
