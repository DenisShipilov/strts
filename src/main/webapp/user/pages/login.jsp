<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head></head>
<body>
<h1></h1>
<c:set var="url" value="${pageContext.request.requestURL}"/>
<c:set var="uri" value="${pageContext.request.requestURI}"/>
<c:set var="path" value="${fn:substringBefore(url, uri)}"/>
<button type="button" onclick="window.location='${path}/order/Editorder.do'">Редактирование счёта</button>
<button type="button" onclick="window.location='${path}/user/getusers.do'">Другие пользователи</button>
<button type="button" onclick="window.location='${path}/user/register.do'">Пользователь</button>


</body>
</html>