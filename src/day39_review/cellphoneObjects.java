package day39_review;

import java.text.DecimalFormat;
import java.text.Format;

public class cellphoneObjects
{
public static void main(String[] args) {
        
        cellPhones  phone1 = new cellPhones();
            System.out.println( phone1.brand );  // 
            System.out.println( phone1.color );  // 
            System.out.println( phone1.model);   // 
            System.out.println( phone1.price);   //
            System.out.println( phone1.screensize);  //
        
        cellPhones phone2 = new cellPhones("Motorola", 200, "gray", 6.1, "z2 play");
                phone2.getInfo();
        
                cellPhones phone3 = new cellPhones("Nokia", 20, "black", 3, "3330");
                phone3.getInfo();
                
                cellPhones phone4 = new cellPhones("Samsung", 700, "red", 6.1, "GT-I7500");
                phone4.getInfo();
        
                cellPhones[] phones = {phone1, phone2, phone3, phone4 };
        
        // brand of phone3:
        System.out.println( phones[2].brand );
        
        // get info of phone3
        phones[2].getInfo();
        //Formatting Decimal===========================================        
        DecimalFormat form=new DecimalFormat("0.00");
        double b=23.4453645745;
        System.out.println(form.format(b)+1);	//brings string
        
        b=Double.parseDouble(form.format(b)); 
        System.out.println(b+1);				//brings number
    }
}
