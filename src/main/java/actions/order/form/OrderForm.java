package actions.order.form;


import org.apache.struts.validator.ValidatorForm;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Denis_Shipilov on 13.10.2014.
 */
public class OrderForm extends ValidatorForm {

    private String registrationdate;

    private String expiredate;

    private  BigInteger bill ;

    private Integer ordernumber;

    private String username;

    private Integer userid;

    private String useremail;


    public String getRegistrationdate() {
        return registrationdate;
    }

    public Date getRegistrationDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try {
            d= sdf.parse(registrationdate);
        } catch (ParseException e) {
            d = new Date();
            e.printStackTrace();
        }
        return d;
    }

    public void setRegistrationdate(String registrationdate) {
       this.registrationdate = registrationdate;
    }

    public String getExpiredate() {
        return expiredate;
    }

    public Date getExpireDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try {
            d= sdf.parse(expiredate);
        } catch (ParseException e) {
            d = new Date();
            e.printStackTrace();
        }
        return d;
    }

    public void setExpiredate(String expiredate) {
            this.expiredate =expiredate;
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
