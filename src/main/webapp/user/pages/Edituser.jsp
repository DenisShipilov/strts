<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
<html:form action="/Adduser.do">
    <table border="0">
        <tr>
            <th class="right">
                <bean:message key="username"/>
            </th>
            <td class="left">
                <html:text  property="username" size="16"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="password"/>
            </th>
            <td class="left">
                <html:password property="password" size="16"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="confpassword"/>
            </th>
            <td class="left">
                <html:password property="password" size="16"/>
            </td>
        </tr>
        <tr>
        <th class="right">
            <bean:message key="email"/>
        </th>
        <td class="left">
            <html:text property="email" size="16"/>
        </td>
        </tr>
        <tr>
            <td class="right">
                <html:submit>
                    <bean:message key="user.action.sumbit"/>
                </html:submit>
            </td>
            <td class="right">
                <html:reset>
                    <bean:message key="user.action.reset"/>
                </html:reset>
            </td>
        </tr>
    </table>
</html:form>
</div>
