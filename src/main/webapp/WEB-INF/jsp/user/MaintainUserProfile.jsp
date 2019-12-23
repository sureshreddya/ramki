<%@include file="../defaults/Header.jsp" %>
<%@ include file="../defaults/OptionsSections.jsp" %>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="main-container">
	<div class="image_section">
		<form:form action="/addUser" method="post" modelAttribute="User">
			<div class="general" >
	            <div class="form-control"> 
	                <label class="label_name">Profile Photo:</label>
	            </div>
	
	            <div class="form-control"> 
	                <label class="label_name">First Name :</label>
	                <input type="text" name="firstName" placeholder="First Name" />
	            </div>
	
	            <div class="form-control">
	                <label class="label_name">Last Name:</label>
	                <input type="text" name="lastName" placeholder="Last Name" />
	            </div>
	
	            <div class="form-control">  
	                <label class="label_name">User Name :</label>
	                <input type="text" name="userName" placeholder="User Name"/>
	            </div>
	
	            <div class="form-control">  
	                <label class="label_name">Email-Id :</label>
	               <input type="text" name="emailId" placeholder="Email-Id"/>
	            </div>
	
	            <div class="form-control">  
	                <label class="label_name">Contact Number :</label>  
	                <input type="text" name="mobileNumber" placeholder="Contact Number"/>
	            </div>  
			</div>
            <%-- <div class="form-control">  
                <label class="label_name">Role :</label>   
                <form:select path="role" items="${roles}"/>
            </div>   --%>
            <a href="#"><span onclick="displayDiv('addressDiv')">Address +</span></a>
            <div style="display:none;" id="addressDiv">
	            <div class="form-control">  
	                <label class="label_name">House No:</label>  
	                <input type="text" name="houseNo" placeholder="House No"/>
	            </div>
	            <div class="form-control">  
	                <label class="label_name">Street Name :</label>  
	                <input type="text" name="streetName" placeholder="Street Name"/>
	            </div>
	            <div class="form-control">  
	                <label class="label_name">Land mark :</label>  
	                <input type="text" name="landmark" placeholder="Land mark"/>
	            </div>
	            <div class="form-control">  
	                <label class="label_name">City</label>  
	                <input type="text" name="city" placeholder="City"/>
	            </div>
	             <div class="form-control">  
	                <label class="label_name">Distict</label>  
	                <input type="text" name="distict" placeholder="City"/>
	            </div>
	             <div class="form-control">  
	                <label class="label_name">State</label>  
	                <input type="text" name="state" placeholder="City"/>
	            </div>
	             <div class="form-control">  
	                <label class="label_name">Country</label>  
	                <input type="text" name="country" placeholder="City"/>
	            </div>
	             <div class="form-control">  
	                <label class="label_name">Pip Code</label>  
	                <input type="text" name="zipCode" placeholder="City"/>
	            </div>
			</div>
            <input type="submit" class="register" value="Register"/>
        </form:form>

		
	</div>
	<div class="form_header_section">
	
	</div>
	<div class="form_edit_section">
		
	</div>
</div>
<div class="footer_section">
	<jsp:include page="default/Footer.jsp"/>
</div>
