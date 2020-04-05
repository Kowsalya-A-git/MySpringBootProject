<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<body>
<h3>Login page</h3>
<form:form action="userwel" method="post" modelAttribute="user">
<form:label path="name">name</form:label>
<form:input path="name"/><br/>
<form:label path="password">password</form:label>
<form:input path="password"/><br/>
<form:button>submit</form:button>
</form:form>
</body>


