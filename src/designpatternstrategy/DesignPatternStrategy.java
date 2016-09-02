/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternstrategy;

import java.util.Scanner;

/**
 *
 * @author rocket
 */
public class DesignPatternStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***Strategy Pattern Demo***");
        Scanner in = new Scanner(System.in);//To take input from user
        IChoice ic;
        Context cxt = new Context();
        String input1, input2;
        
        //Looping twice to test two different choices
        
        try{
            for(int i = 0; i < 2; i++){
                
                System.out.println("Enter an integer:");
                
                input1 = in.nextLine();
                
                System.out.println("Enter another integer:");
                
                input2 = in.nextLine();
                
                System.out.println("Enter ur choice(1 or 2)");
                
                System.out.println("Press 1 for Addition, 2 for Concatenation");
                
                String c = in.nextLine();
                
                /*If user input is 1, create object of FirstChoice - (Strategy 1)*/
                if (c.equals("1")){
                
                    ic = new FirstChoice();
                }else{
                    /*  If user input is 2, create object of SecondChoice - (Strategy 2)*/
                   
                    ic = new SecondChoice();
                }
                
                /*Associate the Strategy with Context*/
                cxt.setChoice(ic);
                cxt.showChoice(input1, input2);

            }
        }finally{
            in.close();
        }
        
        System.out.println("End of Strategy pattern");
    }
    
}
