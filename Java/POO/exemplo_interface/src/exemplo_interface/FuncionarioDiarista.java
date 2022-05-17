package exemplo_interface;

public class FuncionarioDiarista implements Operacoes {

    private String nome;
    private double valorHora;
    private int diasTrabalhados;

    
    public FuncionarioDiarista(String nome, double valorHora, int diasTrabalhados) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.diasTrabalhados = diasTrabalhados;
    }

    @Override
    public double calcularSalarioLiquido() {
        return (8 * valorHora) * diasTrabalhados;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

}
