/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.util.*;
/**
 *
 * @author mochan
 */
public class GuessGame {
    // Number that the user is trying to guess
    int num;
    // Number user has guessed
    int guess;
    // Number of tries
    int tries;
    String STries = "";
    public  int[] arrayTries = new int[50000];
    
    // Generate a new number for the user to guess
    public void generateNum() {        
        Random randomNumber = new Random();
        tries = 0;
        num = randomNumber.nextInt(1000) + 1;
             
    }
    
    // Getters and setters
    
    
    
    public String getSTries(){
        return STries;
        
    }
    
    public void setSTries(){
        this.STries = STries;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }
    
   

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    
    
}
