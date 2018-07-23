/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Natnael Tezera
 * Version 1
 * 7/23/2018
 */
public class Company {
    private String companyName;
    private int yearFounded;
    private String Founder;
    private String CEO;
    private double companyNetWorth;
    private double subscriptionFee;
    private String subscriptionType;
    
    
    //Default constructor
    public Company(){
        companyName = "No company name";
        yearFounded = 0;
        Founder = "invalid";
        CEO = "invalid";
        companyNetWorth =0.0;
        subscriptionFee = 0.0;
        subscriptionType = "invalid";
        
    }
    
    //constructor
    public Company(String cName, int yFounded, String cFounder, String cCEO,
        double cNetWorth, double sFee, String sType){

        companyName = cName;
        yearFounded = yFounded;
        Founder = cFounder;
        CEO = cCEO;
        companyNetWorth = cNetWorth;
        subscriptionFee = sFee;
        subscriptionType = sType;        
    }
    
    
    //Default constructor
    public Company(String cName, double sFee, String sType){
        companyName = cName;
        yearFounded = 0;
        Founder = "invalid";
        CEO = "invalid";
        companyNetWorth =0.0;
        subscriptionFee = sFee;
        subscriptionType = sType;
        
    }
    
    //set company name
    public void setCompanyName(String cName){
        companyName = cName;
    }
    
    //get the company name
    public String getCompanyName(){
        return companyName;
    }
    
    
    //set founder name
    public void setFounderName(String fName){
        Founder = fName;
    }
    
    //get the founder name
    public String getFounderName(){
        return Founder;
    }
    
    //set CEO name
    public void setCEOName(String ceoName){
        CEO = ceoName;
    }
    
    //get the ceo name
    public String getCEOName(){
        return CEO;
    }
    
    //set subscription  type
    public void setSubscriptionType(String subscriptionType){
        companyName = subscriptionType;
    }
    
    //get the subscripton type
    public String getSubscriptionType(){
        return subscriptionType;
    }
    
    
        //set the year company founded
    public void setYearFounded(int yFounded){
        yearFounded = yFounded;
    }
    
    //get the year company founded
    public int getYearFounded(){
        return yearFounded;
    }
    
    //set the company net worth
    public void setCompanyNetWorth(double cNetWorth){
        companyNetWorth = cNetWorth;
    }
    
    //get the company net worth
    public double getCompanyNetWorth(){
        return companyNetWorth;
    }
    
    //set the subscription fee
    public void setSubscriptionFee(double sFee){
        subscriptionFee = sFee;
    }
    
    //get the subscription fee
    public double getSubscriptionFee(){
        return subscriptionFee;
    }
    
}
