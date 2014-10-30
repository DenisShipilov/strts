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

    private Integer ordernumber;

    private String username;

    private Integer userid;

    private String useremail;


    public Date getRegistrationdate() {
        if(registrationdate == null)
            registrationdate = new Date();
        return registrationdate;
    }

    public void setRegistrationdate(Date registrationdate) {
            this.registrationdate = registrationdate;
    }

    public String getExpiredate() {
        if(expiredate == null)
            expiredate = new Date();
        return expiredate.toString();
    }

    public void setExpiredate(Date expiredate) {
            this.expiredate = expiredate;
    }

    public BigInteger getBill() {
        return bill;
    }

    public void setBill(BigInteger bill) {
        this.bill = bill;
    }

    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        if(ordernumber == null) {
            this.ordernumber = 0;
        } else {
            this.ordernumber = ordernumber;
        }

    }

    public void setOrdernumber(String ordernumber) {
        if(ordernumber == null) {
            this.ordernumber = 0;
        } else {
            this.ordernumber = Integer.valueOf(ordernumber);
        }
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
