package plugins.converters;

import org.apache.commons.beanutils.Converter;

import java.math.BigInteger;

/**
 * Created by Denis_Shipilov on 30.10.2014.
 */
public class BigIntegerConverter implements Converter {

    @Override
    public Object convert(Class aClass, Object value) {
        System.out.println ("BigIntegerConverter.value the" + value);
        if (value == null) {
            return value;
        }
        if (value instanceof BigInteger) {
            return value;
        }
        BigInteger d = null;
        if (value instanceof String) {
            if(((String) value).length() > 0) {
                try {
                    d = new BigInteger((String) value);
                } catch (NumberFormatException e){
                    e.printStackTrace ();
                }
            }
        }
        return d;
    }
}
