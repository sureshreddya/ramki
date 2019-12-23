<jsp:include page="defaults/Header.jsp"/>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="main-container">
	<div class="image_section">
		<form:form action="/addUser" method="post" modelAttribute="User">

            <div class="form-control"> 
                <label class="label_name">Profile Photo:</label>

                <form:input id="image" type="file" name="profile_photo" placeholder="Photo" required="" capture/>
            </div>

            <div class="form-control"> 
                <label class="label_name">First Name :</label>
                <form:input path="firstName" title="Please enter your First Name" required=""/>
            </div>

            <div class="form-control">
                <label class="label_name">Last Name:</label>
                <form:input placeholder="Store Type" />
            </div>

            <div class="form-control">  
                <label class="label_name">User Name :</label>
                <form:input path="userName" />
            </div>

            <div class="form-control">  
                <label class="label_name">Email-Id :</label>
                <form:input  path="emailId"/>
            </div>

            <div class="form-control">  
                <label class="label_name">Contact Number :</label>  
                <form:input path="mobileNumber"/>
            </div>  

            <div class="form-control">  
                <label class="label_name">Role :</label>   
                <form:select path="role" items="${roles}"/>
            </div>  

            <form:input type="submit" class="register" value="Register"/>
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
