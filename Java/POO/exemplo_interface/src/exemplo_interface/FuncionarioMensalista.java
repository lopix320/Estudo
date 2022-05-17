package exemplo_interface;

public class FuncionarioMensalista implements Operacoes {
    
    private String nome;
    private double salario;


    public FuncionarioMensalista(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public double calcularSalarioLiquido() {
        return this.salario - this.salario * 27.5 / 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
