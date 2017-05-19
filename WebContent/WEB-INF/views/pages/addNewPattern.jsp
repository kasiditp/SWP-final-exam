<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

${message}
<form:form method="POST" action="${pageContext.request.contextPath}/addNewPattern" modelAttribute="pattern">
	<div class="form-group">
		<form:label path="name" >Pattern Name</form:label>
		<form:input path="name" class="form-control"/>
	</div>
	<div class="form-group">
		<form:label path="group" >Pattern Group</form:label>
		<form:input path="group" class="form-control"/>
	</div>
	<div class="form-group">
		<form:label path="implementation" >Implementation</form:label>
		<form:input path="implementation" class="form-control"/>
	</div>
	<button type="submit" class="btn btn-default">Save</button>
</form:form>