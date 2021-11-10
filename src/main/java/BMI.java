/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class BMI {
/**
 *
 * @author Intel
 */
    public static void main(String[] args) {
        Scanner BMI = new Scanner(System.in);
        double bmi;
        double tbm;
        double ideal_man;
        double ideal_female;
        
        System.out.println("------------------------------------");
        System.out.println("---- Welcome to Calculator BMI ----");
        System.out.println("------------------------------------");
        System.out.println("--------- Body Mass Index ---------");
        System.out.println("Please Enter your BioData");
        System.out.println("Name : ");
        String nama = BMI.next();
        System.out.println("Age : ");
        int usia = BMI.nextInt();
        System.out.println("Gender ( Man / Female ) : ");
        String jk = BMI.next();
        System.out.println("Weight (kg) : ");
        double bb = BMI.nextInt();
        System.out.println("Height (cm) : ");
        double tb = BMI.nextInt();
        tbm = tb/100;
        bmi = bb/(tbm*tbm);
        
    switch (jk){
        case "Man" :
            System.out.println("--------------------------------");
            System.out.println("Name : " +nama);
            System.out.println("Age : " +usia);
            System.out.println("Weight : " +bb +" kg");
            System.out.println("Height : " +tb +" cm / " +tbm +" m");
            System.out.println("Your Weight (BMI) is : "+bmi);
            
          if (bmi<17.0){
              System.out.println("Your Status Body Mess Index is : Very Thin");
          }else if(bmi>17.0 && bmi<18.5){
              System.out.println("Your Status Body Mess Index is : Thin");
          }else if(bmi>18.5 && bmi<25.0){
              System.out.println("Your Status Body Mess Index is : Normal");
          }else if(bmi>25.0 && bmi<30.0){
              System.out.println("Your Status Body Mess Index is : Fat");
          }else if(bmi>30.0 && bmi<35.0){
              System.out.println("Your Status Body Mess Index is : Obesity level 1");
          }else if(bmi>35.0 && bmi<40.0){   
              System.out.println("Your Status Body Mess Index is : Obesity level 2");
          }else if(bmi>40.0){
              System.out.println("Your Status Body Mess Index is : Obesity level 3");
          }else{
              System.out.println("not detected");
          }
         
          ideal_man = (tb-100)-((tb-100)*0.1);
          System.out.println("Your Ideal Weight is : " +ideal_man);
          System.out.println("-----------------------------------");
    break;
    
    case "Female" :
            System.out.println("--------------------------------");
            System.out.println("Name : " +nama);
            System.out.println("Age : " +usia);
            System.out.println("Weight : " +bb +" kg");
            System.out.println("Height : " +tb +" cm / " +tbm +" m");
            System.out.println("Your Weight (BMI) is : "+bmi);
            
          if (bmi<17.0){
              System.out.println("Your Status Body Mess Index is : Very Thin");
          }else if(bmi>17.0 && bmi<18.5){
              System.out.println("Your Status Body Mess Index is : Thin");
          }else if(bmi>18.5 && bmi<25.0){
              System.out.println("Your Status Body Mess Index is : Normal");
          }else if(bmi>25.0 && bmi<30.0){
              System.out.println("Your Status Body Mess Index is : Fat");
          }else if(bmi>30.0 && bmi<35.0){
              System.out.println("Your Status Body Mess Index is : Obesity level 1");
          }else if(bmi>35.0 && bmi<40.0){   
              System.out.println("Your Status Body Mess Index is : Obesity level 2");
          }else if(bmi>40.0){
              System.out.println("Your Status Body Mess Index is : Obesity level 3");
          }else{
              System.out.println("not detected");
          }
         
          ideal_female = (tb-100)-((tb-100)*0.1);
          System.out.println("Your Ideal Weight is : " +ideal_female);
          System.out.println("-----------------------------------");
    break;
    }
    }
}
