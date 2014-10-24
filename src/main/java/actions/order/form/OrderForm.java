package actions.order.form;

import org.apache.struts.action.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;

/**
 * Created by Denis_Shipilov on 13.10.2014.
 */
public class OrderForm extends ActionForm {

    BigInteger bil ;

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if(bil == null || String.valueOf(bil).length() > 20) {
            errors.add("bil",new ActionMessage("bil.wrong.length"));
        }
        return errors;
    }

    @Override
    protected ActionServlet getServlet() {
        return super.getServlet();
    }
}
