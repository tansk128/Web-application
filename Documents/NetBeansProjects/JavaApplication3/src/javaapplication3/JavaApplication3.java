/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author serka
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double income_tax = 0.0 , income, subsequent_charge=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your yearly gross income ");
        income=sc.nextDouble();
        if(income<=40000)
        income_tax=0;
        else if(income<=60000)
        {
        subsequent_charge= (int)((income-40000)/5000 ) * 50;
        income_tax= (0.03 * 40000) + subsequent_charge;
        }
        else if(income<=90000)
        {
        subsequent_charge= (int)((income-60000)/5000 ) * 50;
        income_tax= (0.04 * 60000) + subsequent_charge;
        }
        else if(income<=120000)
        {

        subsequent_charge= (int)((income-90000)/5000 ) * 62.5;
        income_tax= (0.03 * 90000) + subsequent_charge;
        }
        else
        {

        subsequent_charge= (int)((income-120000)/5000 ) * 65;
        income_tax= (0.04 * 120000) + subsequent_charge;

        }
        System.out.println("Total tax to pay is "+income_tax);
        }
}
    

