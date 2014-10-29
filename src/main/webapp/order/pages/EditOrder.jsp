<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/scripts/jquery-2.1.1.js" type="application/javascript" ></script>
<script src="/scripts/jquery-ui.js" type="application/javascript" ></script>
<script src="/scripts/jquery.validate.min.js" type="application/javascript" ></script>
<script src="/scripts/additional-methods.min.js" type="application/javascript" ></script>
<script src="/scripts/jquery-dateFormat.min.js" type="application/javascript" ></script>
<link rel="stylesheet" href="/scripts/jquery-ui.min.css">
<link rel="stylesheet" href="/scripts/jquery-ui.structure.min.css">
<link rel="stylesheet" href="/scripts/jquery-ui.theme.min.css">
<script type="application/javascript" >
    $(document).ready(function(){
        $("#regdate").datepicker();
        $("#regdate").datepicker("option", "altField", "#regdate");
        $("#regdate").datepicker("option", "altFormat", "dd/mm/yy");
        $("#expdate").datepicker();
        $("#expdate").datepicker("option", "altField", "#expdate");
        $("#expdate").datepicker("option", "altFormat", "dd/mm/yy");
    });
</script>
<div>
    <div id="erroddiv" style="color: red;">
        <ul>
        <html:errors prefix="err.prefix" suffix="err.suffix"/>
        </ul>
    </div>
    <html:form action="/addorder.do">
        <table border="0" >
            <tr>
                <th class="right">
                    <bean:message key="order.ordernumber" />
                </th>
                <td>
                    <html:text property="ordernumber" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.registrationdate" />
                </th>
                <td>
                    <html:text styleId="regdate" property="registrationdate" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.expiredate" />
                </th>
                <td>
                    <html:text styleId="expdate" property="expiredate" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.bill" />
                </th>
                <td>
                    <html:text property="bill" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.userid" />
                </th>
                <td>
                    <html:text property="userid" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.username" />
                </th>
                <td>
                    <html:text property="username" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.useremail" />
                </th>
                <td>
                    <html:text property="useremail" />
                </td>
            </tr>
        </table>
        <tr>
            <td class="right">
                <div align="center">
                <html:submit>
                    <bean:message key="user.action.sumbit"/>
                </html:submit>
                <html:reset>
                    <bean:message key="user.action.reset"/>
                </html:reset>
                </div>
            </td>
        </tr>
    </html:form>

</div>
