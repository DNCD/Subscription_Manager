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
        Company c = new Company("Netflix", 11, "monthly");
        System.out.println(c.getCompanyName());
        Subscription newSub = new Subscription(c);
        System.out.println(newSub.getCompanyName());
        System.out.println(newSub.getSubscriptionFee());
        
    }
    
}
