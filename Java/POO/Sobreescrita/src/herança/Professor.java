/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança;

/**
 *
 * @author gabriel.lpereira13
 */
public class Professor extends Pessoa {

    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;
    
    @Override
    public String retornaDados() {
        String dados;

        dados = super.retornaDados();

        dados += "Matricula do professor: " + matriculaProfessor + "\n";
        dados += "Data de admissao: " + dataAdmissao + "\n";
        dados += "Salario por hora: " + salarioHorista + "\n";

        return dados;
    }
}
