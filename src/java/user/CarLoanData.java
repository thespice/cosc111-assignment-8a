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
    double payment;
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
        payment = (double)carprice / (double)loanlen;        
        return payment;
    }
    
    public double getInterest()
    {
         return (double)carprice * Math.pow((1 + (double)expreturn/12),(double)loanlen);
    }
    
    public String balance()
    {
        double[] bal = new double[loanlen];
        String s = " ";
        bal[0] = carprice;
        for(int i=1; i<loanlen; i++)
        {
            bal[i] = bal[i-1] - payment;
            bal[i] *= (1+ expreturn/12.0*0.01);
            if (i%12 ==0)
            {
            s +="Month " + i +": " + bal[i] + "\n<br>";
            }
        }
        s += "Final Balance: $" + String.format("%.2f", bal[loanlen - 1]);
        return s;
    }
}