<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head></head>
<body>
<h1></h1>

<h3></h3>

 <h3> <bean:write name="userForm" property="username" /> &nbsp is registered</h3>

    <div>
        <a href="user/Edituser.do">добавить юзера</a>
    </div>

</body>
</html>