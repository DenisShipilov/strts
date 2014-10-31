package validators;

import org.apache.commons.validator.Field;
import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.Validator;
import org.apache.commons.validator.ValidatorAction;
import org.apache.commons.validator.util.ValidatorUtils;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.validator.Resources;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Denis_Shipilov on 30.10.2014.
 */
public class DateValidator {

    private static final String SIMPLE_DATE_FORMAT = "dd/MM/yyyy";

    public static boolean validateTwoFields(
            Object bean,
            Validator v,
            ValidatorAction va,
            Field field,
            ActionErrors errors,
            HttpServletRequest request) {

        String value = ValidatorUtils.getValueAsString(bean, field.getProperty());
        String sProperty2 = field.getVarValue("secondProperty");
        String value2 = ValidatorUtils.getValueAsString(bean, sProperty2);

        if (!GenericValidator.isBlankOrNull(value)) {
            try {
                if (!value.equals(value2)) {
                    errors.add(field.getKey(),
                            Resources.getActionMessage(v, request, va, field));
                    return false;
                }
            } catch (Exception e) {
                errors.add(field.getKey(),
                        Resources.getActionMessage(v, request, va, field));
                return false;
            }
        }

        return true;
    }

    public static boolean isAfterThan(Object bean,
                                      Validator v,
                                      ValidatorAction va,
                                      Field field,
                                      ActionMessages errors,
                                      HttpServletRequest request) {
        Boolean result = false;
        String value = ValidatorUtils.getValueAsString(bean, field.getProperty());
        String sProperty2 = field.getVarValue("afterthan");
        String value2 = ValidatorUtils.getValueAsString(bean, sProperty2);

        if ((!GenericValidator.isBlankOrNull(value)) && (!GenericValidator.isBlankOrNull(value2))) {
            SimpleDateFormat sdf = new SimpleDateFormat(SIMPLE_DATE_FORMAT);
            try {
                Date dat1 = sdf.parse(value);
                Date dat2 = sdf.parse(value2);
                if (dat1.after(dat2)) {
                    result = true;
                } else {
                    errors.add(field.getKey(), Resources.getActionMessage(v, request, va, field));
                    result = false;
                }
            } catch (ParseException e) {
                errors.add(field.getKey(), Resources.getActionMessage(v, request, va, field));
                result = false;
                e.printStackTrace();
            }
        }
        return result;
    }

    public static boolean isBeforeThan(Object bean,
                                       Validator v,
                                       ValidatorAction va,
                                       Field field,
                                       ActionMessages errors,
                                       HttpServletRequest request) {
        Boolean result = false;
        String value = ValidatorUtils.getValueAsString(bean, field.getProperty());
        String sProperty2 = field.getVarValue("beforethan");
        String value2 = ValidatorUtils.getValueAsString(bean, sProperty2);

        if ((!GenericValidator.isBlankOrNull(value)) && (!GenericValidator.isBlankOrNull(value2))) {
            SimpleDateFormat sdf = new SimpleDateFormat(SIMPLE_DATE_FORMAT);
            try {
                Date dat1 = sdf.parse(value);
                Date dat2 = sdf.parse(value2);
                if (dat1.before(dat2)) {
                    result = true;
                } else {
                    errors.add(field.getKey(), Resources.getActionMessage(v, request, va, field));
                    result = false;
                }
            } catch (ParseException e) {
                errors.add(field.getKey(), Resources.getActionMessage(v, request, va, field));
                result = false;
                e.printStackTrace();
            }
        }
        return result;
    }
}
