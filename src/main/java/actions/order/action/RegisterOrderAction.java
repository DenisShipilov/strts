package actions.order.action;

import actions.order.form.OrderForm;
import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Denis_Shipilov on 28.10.2014.
 */
public class RegisterOrderAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        OrderForm order = (OrderForm)form;
        ActionRedirect redirect  = new ActionRedirect(mapping.findForward("success"));
        redirect.setPath("/Getorder");
        redirect.addParameter("id", order.getUserid());
        return mapping.findForward("success");
    }
}
