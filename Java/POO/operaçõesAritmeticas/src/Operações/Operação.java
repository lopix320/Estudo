package Operações;

public class Operação {

    double num1, num2;

    public Operação(double n1, double n2) {
        num1 = n1;
        num2 = n2;
    }
    
    public double Soma(){
        return num1 + num2;
    }
    
    public double Sub(){
        return num1 - num2;
    }
    
    public double Div(){
        return num1 / num2;
    }
    
    public double Multi(){
        return num1 * num2;
    }
    
}
