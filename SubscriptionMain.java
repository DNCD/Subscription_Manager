
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
    public static void main(String [] args) throws IOException{
        
        String fileName = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\Subscription Manager\\src\\subscriptionText.txt";
        StringBuilder companyName = new StringBuilder();
        StringBuilder subFeeString = new StringBuilder();
        double subscriptionFee;
        String subscriptionType = "";
        String line = null;
        int j = 0;
        int i = 0;
        
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            while(line != null){
                
               i = 0;
               

               subscriptionType = "";
               
                   while(line.charAt(i) != ','){
                       companyName.insert(i, line.charAt(i));
                       i++;
                   }
                   i++;
                   while(line.charAt(i) != ',' ){
                           subFeeString.insert(0, line.charAt(i));
                           i++;
                   }
                   subFeeString.reverse();
                   i++;
                   while(line.charAt(i) != ':' ){
                       subscriptionType = subscriptionType + line.charAt(i);
                       i++;
                   }
                   i += 2;
                   
               
               System.out.println(companyName);
               companyName.delete(0, i);
               System.out.println(subFeeString);
               subFeeString.delete(0, i);
               System.out.println(subscriptionType);
               line = bufferedReader.readLine();
               
            }
            bufferedReader.close();
        }catch(FileNotFoundException ex){
                System.out.println(ex);
        }

//        Company c = new Company();
//        c.setCompanyName("netflix");
//        c.setSubscriptionFee(8.99);
//        c.setYearFounded(0);
//        Subscription newSub = new Subscription(c);
//        newSub.setCompany(c);
//        System.out.println(newSub.getCompanyName());

        
    }
    
    
    
}
