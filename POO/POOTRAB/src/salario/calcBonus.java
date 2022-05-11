
package salario;


public class calcBonus {
    
    private double bonus;
    
    public calcBonus(double salario, double bonus){
        this.bonus = salario + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
