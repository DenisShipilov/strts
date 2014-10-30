package plugins.converters;

import org.apache.commons.beanutils.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Denis_Shipilov on 30.10.2014.
 */
public class DateConverter implements Converter {
    @Override
    public Object convert(Class aClass, Object value) {
        System.out.println ("UtilDateConverter.value the" + value);
        if (value == null) {
            return value;
        }
        if (value instanceof Date) {
            return value;
        }
        Date d = null;
        if (value instanceof String) {
            SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
            try {
                 d = sdf.parse ((String) value);
            } catch (ParseException e) {
                e.printStackTrace ();
            }
        }
        return d;
    }
}
