/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NETMONSTERZ
 */
public class GuessingCore {
    
    public static int Guessing(){
        double r = Math.random() * 1000;
        int rand = (int) r;
        
        int GuessingNum = rand;
        return GuessingNum;
    }
    
}
