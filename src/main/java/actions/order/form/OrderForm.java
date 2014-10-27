package actions.order.form;


import org.apache.struts.validator.ValidatorForm;

import java.math.BigInteger;
import java.util.Date;

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

    public Date getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    public Date getExpiredate() {
        return expiredate;
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

    public BigInteger getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(BigInteger ordernumber) {
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
