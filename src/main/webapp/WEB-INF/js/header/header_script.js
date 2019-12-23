/**
 * 
 */
 // Get the modal
 var modal = document.getElementById('signInid');
 // When the user clicks anywhere outside of the modal, close it
 window.onclick = function(event) {
     if (event.target == modal) {
         modal.style.display = "none";
     }
 }
 window.onload = function() {
	  onScreenLoad();
}
 function onScreenLoad(){
	// alert("loaded");
 }
 function validate(validateField){
var object=parameter;
if(validateField=="username")
	if(object.length>15)
	{
		alert("maximun length should be 15");
	}
}