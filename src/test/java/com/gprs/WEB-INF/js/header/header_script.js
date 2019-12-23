/**
 * 
 */
 /*// Get the modal
 var modal = document.getElementById('signInid');
 // When the user clicks anywhere outside of the modal, close it
 window.onclick = function(event) {
     if (event.target == modal) {
         modal.style.display = "none";
     }
 }*/

function openPopUP(pageName){
	var Window;
	if(pageName=='signup'){
		Window=window.open("../../SignUp.jsp","Sign Up","width=400","height=400");
	}
	if(pageName=='login'){
		Window=window.open("/loadLogin","Login","width=400","height=400");
	}
}
 window.onload = function() {
	  onScreenLoad();
}
 function onScreenLoad(){
	 alert("loaded");
 }
 function validate(parameter,validateField){
var object=parameter;
if(validateField=="username")
	if(object.length>15)
	{
		alert("maximun length should be 15");
	}
}