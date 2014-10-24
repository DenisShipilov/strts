<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="/scripts/jquery-2.1.1.js" type="application/javascript" ></script>
<script src="/scripts/jquery-ui.js" type="application/javascript" ></script>
<script src="/scripts/jquery.validate.min.js" type="application/javascript" ></script>
<script src="/scripts/additional-methods.min.js" type="application/javascript" ></script>
<script type="application/javascript">
    //script here
    $(document).ready(function(){
        $("form").validate(
                {
                    focusCleanup: true,
                    validClass: "success",
                    groups:{
                        userparams: "username email"
                    },
                    errorPlacement: function(error, element) {
                        if(element.attr("name") == "email" &&  element.attr("name") == "username") {
                            error.insertAfter("form");
                        } else {
                            error.insertAfter("#errordiv");
                        }

                    },
                    rules:{
                        username: "required",
                        email:{
                            errorClass: "errorEmail",
                            required: true,
                            email: true
                        }

                    },
                    messages:{
                        username: "<bean:message key="user.form.username.error" />",
                        email:{
                            required: "<bean:message key="user.form.email.error" />",
                            email: "<bean:message key="user.form.email.empty.error" />"
                        }
                    }
                }
        )

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
