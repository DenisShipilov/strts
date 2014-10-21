package actions.user.action;

import actions.user.form.UserForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Denis_Shipilov on 21.10.2014.
 */
public class AddUserAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String result = "";
        UserForm user = (UserForm)form;
        user.setUsername("zhppa");
        user.setPassword("popa");
        return mapping.findForward(result);
    }
}
