
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Subscription {
    private String company;
    private boolean isFree;
    private double subscriptionFee;
    private int paymentDate;
    private int paymentMonth;
    private int paymentYear;
    private boolean isCanceled;
    
    
    public Subscription(){
        company = "no company name";
        isFree = true;
        subscriptionFee = 0.0;
        Date d = new Date();
        paymentDate = d.getDate();
        paymentMonth = d.getMonth();
        paymentYear = d.getYear();
        isCanceled = false;
    }
    
    public Subscription(String theCompany, boolean freeValue, double sFee, int pDate,
            int pMonth, int pYear, boolean canceledValue){
        company = theCompany;
        isFree = freeValue;
        subscriptionFee = sFee;
        paymentDate = pDate;
        paymentMonth = pMonth;
        paymentYear = pYear;
        isCanceled = canceledValue;
    }
    
    // set company name
    public void setCompany(String companyName){
        company = companyName;
    }
    
    //get company name
    public String getCompanyName(){
        return company;
    }
    
      // set free status
    public void updateFreeStatus(boolean b){
        isFree = b;
    }
    
    //check if it is free
    public boolean isFree(){
        return isFree;
    }
      // set subscription free
    public void setSubscriptionFee(double sFee){
        subscriptionFee = sFee;
    }
    
    //get subscriptionFee
    public double getSubscriptionFee(){
        return subscriptionFee;
    }
      // set payment date
    public void setPaymentDate(int pDate){
        paymentDate = pDate;
    }
    
    //get payment date
    public int getPaymentDate(){
        return paymentDate;
    }
      // set payment month
    public void setPaymentMonth(int pMonth){
        paymentMonth = pMonth;
    }
    
    //get payment month
    public int getPaymentMonth(){
        return paymentMonth;
    }
      // set payment year
    public void setPaymentYear(int pYear){
        paymentYear = pYear;
    }
    
    //get payment year
    public int getPaymentYear(){
        return paymentYear;
    }
      // set cancel status
    public void updateCancelStatus(boolean b){
        isCanceled = b;
    }
    
    // check if it is true or not
    public boolean isCanceled(){
        return isCanceled;
    }
    
    
    public static void main (String[] args){
        Subscription s = new Subscription();
        System.out.println(s.paymentDate);
        System.out.println(s.isFree);
    }
}
