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

<script type="application/javascript">
    jQuery.validator.setDefaults({
        debug: true,
        success: "valid"
    });
    //script here
    $(document).ready(function(){
        $("form").validate(
                {
                    errorClass: "error",
                    validClass: "success",
                    errorElement: "em",
                    rules:{
                        username: "required",
                        email:{
                            depends: function(element){return $("#confpassword").val == $("#password").val},
                            email: true,
                            required: true
                        },
                        confpassword:{
                            depends: "username"
                        },
                        birthstring: "birtstring"

                    },
                    messages:{
                        username: "<bean:message key="user.form.username.error" />",
                        email:{
                            required: "<bean:message key="user.form.email.empty.error" />",
                            email: "<bean:message key="user.form.email.error" />",
                            depends: "<bean:message key="user.form.comfpassword.error" />"
                        }
                    }
                }
        )
        $("#birtstring" ).datepicker("option","dateFormat","yy-MON-YYYY");
    });

</script>
<div>
    <div id="errordiv" style="color: red;">
        <ol>
            <html:errors/>
        </ol>
    </div>
<html:form  action="/Adduser.do">
    <table border="0">
        <tr>
            <th class="right">
                <bean:message key="username" />
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
                <html:password styleId="password" property="password" size="16"/>
            </td>
        </tr>
        <tr>
            <th class="right">
                <bean:message key="confpassword"/>
            </th>
            <td class="left">
                <html:password styleId="confpassword" property="confpassword" size="16"/>
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
            <th class="right">
                <bean:message key="birtstring"/>
            </th>
            <td class="left">
                <html:text styleId="birtstring" property="birtstring" size="16"/>
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
