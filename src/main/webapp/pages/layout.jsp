<%--
  Created by IntelliJ IDEA.
  User: Denis_Shipilov
  Date: 22.10.2014
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html>
<body>
<table align="center" border="1">
    <tr>
        <td><tiles:insert name="header" attribute="header"/></td>
    </tr>
    <tr>
        <td><tiles:insert name="body" attribute="body"/></td>
    </tr>
    <tr>
        <td><tiles:insert name="footer" attribute="footer"/></td>
    </tr>
</table>
</body>
</html>
