<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/scripts/jquery-2.1.1.js" type="application/javascript" ></script>
<script src="/scripts/jquery-ui.js" type="application/javascript" ></script>
<script src="/scripts/jquery.validate.min.js" type="application/javascript" ></script>
<script src="/scripts/additional-methods.min.js" type="application/javascript" ></script>
<link rel="stylesheet" href="/scripts/jquery-ui.min.css">
<link rel="stylesheet" href="/scripts/jquery-ui.structure.min.css">
<link rel="stylesheet" href="/scripts/jquery-ui.theme.min.css">
<script type="application/javascript" >

</script>
<div>
    <div id="errordiv" style="color: red;">
        <ol>
            <html:errors/>
        </ol>
    </div>
    <html:form action="/Addorder.do">
        <table border="0" >
            <tr>
                <th class="right">
                    <bean:message key="order.ordernumber" />
                </th>
                <td>
                    <html:textarea property="ordernumber" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.registrationdate" />
                </th>
                <td>
                    <html:textarea property="registrationdate" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.expiredate" />
                </th>
                <td>
                    <html:textarea property="expiredate" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.bill" />
                </th>
                <td>
                    <html:textarea property="bill" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.userid" />
                </th>
                <td>
                    <html:textarea property="userid" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.username" />
                </th>
                <td>
                    <html:textarea property="username" />
                </td>
            </tr>
            <tr>
                <th class="right">
                    <bean:message key="order.useremail" />
                </th>
                <td>
                    <html:textarea property="useremail" />
                </td>
            </tr>
        </table>
    </html:form>

</div>
