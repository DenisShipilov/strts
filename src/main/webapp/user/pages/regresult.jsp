<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head></head>
<body>
<c:set var="url" value="${pageContext.request.requestURL}"/>
<c:set var="uri" value="${pageContext.request.requestURI}"/>
<c:set var="path" value="${fn:substringBefore(url, uri)}"/>
    <h3>
        <bean:write name="userForm" property="username" /> &nbsp is registered
    </h3>

    <div>
        <a href="${path}/user/Edituser.do">добавить юзера</a>
    </div>

</body>
</html>