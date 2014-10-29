package actions.order.form;


import org.apache.struts.validator.ValidatorForm;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Denis_Shipilov on 13.10.2014.
 */
public class OrderForm extends ValidatorForm {

    private Date registrationdate;

    private Date expiredate;

    private  BigInteger bill ;

    private BigInteger ordernumber;

    private String username;

    private Integer userid;

    private String useremail;


    public String getRegistrationdate() {
        if(registrationdate == null)
            registrationdate = new Date();
        return registrationdate.toString();
    }

    public void setRegistrationdate(String registrationdate) {
        try {
            this.registrationdate = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH).parse(registrationdate);
        } catch (ParseException e) {
            this.registrationdate = new Date();
            e.printStackTrace();
        }
    }

    public String getExpiredate() {
        if(expiredate == null)
            expiredate = new Date();
        return expiredate.toString();
    }

    public void setExpiredate(String expiredate) {
        try {
            this.expiredate = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH).parse(expiredate);
        } catch (ParseException e) {
            this.expiredate = new Date();
            e.printStackTrace();
        }
    }

    public BigInteger getBill() {
        return bill;
    }

    public void setBill(BigInteger bill) {
        if(bill == null)
            bill = BigInteger.ZERO;
        this.bill = bill;
    }

    public BigInteger getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(BigInteger ordernumber) {
        if(ordernumber == null)
            ordernumber = BigInteger.ZERO;
        this.ordernumber = ordernumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }
}
