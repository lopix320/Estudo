package salario;

public class CalculoSalarial {
    
    double sal, desc;
    
    public CalculoSalarial(double salario, double desconto ) {
        sal = salario;
        desc = desconto;
    }
    
    public double Calculo(){
        return sal - desc;
    }
}
