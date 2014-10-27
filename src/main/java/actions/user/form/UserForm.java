package actions.user.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.util.MessageResources;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Denis_Shipilov on 13.10.2014.
 */
public class UserForm extends ActionForm implements Serializable {

    private String username;

    private String password;

    public String getConfpassword() {
        return confpassword;
    }

    public void setConfpassword(String confpassword) {
        this.confpassword = confpassword;
    }

    private String confpassword;

    private String email;

    private String nickname;

    private Date birthdate;




    public String getBirtstring() {
        return birtstring;
    }

    public void setBirtstring(String birtstring) {
        this.birtstring = birtstring;
    }

    private String birtstring;

    public UserForm() {
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }



    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors actionErrors = new ActionErrors();
        if(username != null && username.length() > 20) {
            actionErrors.add("username",new ActionMessage("user.form.username.error",true));
        }
        if(nickname != null &&nickname.length() > 20) {
            actionErrors.add("nickname",new ActionMessage("error.nickname"));
        }



        return actionErrors;
    }
}
