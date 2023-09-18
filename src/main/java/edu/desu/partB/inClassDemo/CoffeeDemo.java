package edu.desu.partB.inClassDemo;

class Coffee {

}
public class CoffeeDemo {

    public Coffee getCoffee(Double money) throws InsufficientFundsException{
        if(money < 4.00)
            throw new InsufficientFundsException("We Need more money to complete this task");
        return new Coffee();
    }

    public static void main(String[] args) {
        CoffeeDemo demo = new CoffeeDemo();
        try {
            demo.getCoffee(3.00);
        }catch (InsufficientFundsException ex){

        }
    }
}
