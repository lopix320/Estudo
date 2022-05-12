package pessoa;

import salario.*;

public class Funcionario extends Pessoa {

    private double salario, bonus;
    private int ID;
    

    public Funcionario(double salario, double bonus, int ID) {
        this.salario = salario;
        this.bonus = bonus;
        this.ID = ID;
    }

    Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String exibirDados() {
        String dados;
        dados = super.exibirDados();

        dados += "Salario: " + salario;
        dados += "Bonus: " + bonus;
        dados += "ID: " + ID;

        return dados;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
