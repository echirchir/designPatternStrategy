/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternstrategy;

/**
 *
 * @author rocket
 */
public class Context {
    
    IChoice myChoice;
    
    public void setChoice(IChoice choice){
        myChoice = choice;
    }
    
    public void showChoice(String s1, String s2){
        myChoice.myChoice(s1, s2);
    }
}
