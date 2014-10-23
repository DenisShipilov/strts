package actions.user.action;

import actions.user.form.UserForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.MessageResources;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Denis_Shipilov on 21.10.2014.
 */
public class EditUserAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        UserForm user = (UserForm) form;
        if (form == null) {
            user = new UserForm();
        }
        MessageResources res = getResources(request);
        return mapping.findForward("success");
    }
}
