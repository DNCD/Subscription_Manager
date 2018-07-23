/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Natnael Tezera
 */
public class SubscriptionMain {
    public static void main(String [] args){
        Company c = new Company();
        c.setCompanyName("netflix");
        c.setSubscriptionFee(8.99);
        c.setYearFounded(0);
        Subscription newSub = new Subscription(c);
        newSub.setCompany(c);
        System.out.println(newSub.getCompanyName());

        
    }
    
}
