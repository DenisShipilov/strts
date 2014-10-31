package plugins;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.PlugIn;
import org.apache.struts.config.ModuleConfig;
import plugins.converters.BigIntegerConverter;
import plugins.converters.DateConverter;

import javax.servlet.ServletException;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by Denis_Shipilov on 30.10.2014.
 */
public class TypeConverterPlugin implements PlugIn {
    @Override
    public void destroy() {

    }

    @Override
    public void init(ActionServlet actionServlet, ModuleConfig moduleConfig) throws ServletException {
       ConvertUtils.register(new BigIntegerConverter(), BigInteger.class);
       //ConvertUtils.register(new DateConverter(), Date.class);
    }
}
