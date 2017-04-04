package user;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mochan
 */
public class CarLoanData {

    int carprice;
    int loanlen;
    double expreturn;
    

    public int getCarprice() {
        return carprice;
    }

    public int getLoanlen() {
        return loanlen;
    }

    public double getExpreturn() {
        return expreturn;
    }

    public void setCarprice(int carprice) {
        this.carprice = carprice;
    }

    public void setLoanlen(int loanlen) {
        this.loanlen = loanlen;
    }

    public void setExpreturn(double expreturn) {
        this.expreturn = expreturn;
    }

    public double getMonthlyPayment()
    {
         return  (double)carprice / (double)loanlen;
         
    }
    
    public String print()
    { double [] balance = new double[loanlen];
    
    
    String s = "";
    balance[0] = carprice;
    for (int i=1; i<loanlen; i++)
    { 
        
        
        balance[i] = balance[i-1] - getMonthlyPayment();
        balance[i] += ( 1 * expreturn/12.0 *0.01);
                if (i%12 == 0)
                {
                    s += "Month " + i + ": $" + String.format("%.2f ", balance[i]) + "\n<br>";
                }
     }
    s += "Final Balance: $" + String.format("%.2f ", balance[loanlen - 1]);
    return s; 
}


}
