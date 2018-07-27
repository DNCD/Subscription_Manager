
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
        
       // String fileName = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\Subscription Manager\\src\\subscriptionText.txt";
        String companyName;
        String subStringFee;
        double subscriptionFee;
        String subscriptionType;
        Scanner x;
        ArrayList<Company> cHolder = new ArrayList<Company>();
        
        try{
         x = new Scanner(new File("C:\\\\Users\\\\Dell\\\\Documents\\\\NetBeansProjects\\\\Subscription Manager\\\\src\\\\subscriptionText.txt"));
         while(x.hasNext()){
             companyName = x.next();
             subStringFee = x.next();
             subscriptionType = x.next();
             subscriptionFee = Double.parseDouble(subStringFee);
             Company c = new Company(companyName, subscriptionFee, subscriptionType);
             cHolder.add(c);
         }
        }catch(FileNotFoundException ex){
                System.out.println(ex);
        }  
        
        
        BufferedWriter bufWriter = null;
        
        for(int i = 0; i < cHolder.size(); i++){
            
            try{
           OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Subscription Manager\\src\\output.txt", true));
           bufWriter = new BufferedWriter(writer); 
           bufWriter.write(cHolder.get(i).toString());
           bufWriter.newLine();
           
           //bufWriter.close();
            }catch (Exception e){
               e.printStackTrace();
            }finally{
                try{
                    //close the writer
                    bufWriter.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
