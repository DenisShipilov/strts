package actions.order.action;

import actions.order.form.OrderForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.math.BigInteger;

/**
 * Created by Denis_Shipilov on 28.10.2014.
 */
public class EditOrderAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request, ServletResponse response) throws Exception {
        OrderForm order = (OrderForm)form;
        order.setUsername("stts");
        order.setBill(new BigInteger("1332132132"));
        order.setUserid(123);
        order.setUseremail("jkjkj@com");
        order.setOrdernumber("12312311");
        return mapping.findForward("success");
    }
}
