package combustivel;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Valor do etanol:");
        double etanol = leitor.nextDouble();
        System.out.println("Valor da gasolina:");
        double gasolina = leitor.nextDouble();
        
        Combustivel ct = new Combustivel();
        
        ct.setEtanol(etanol);
        ct.setGasolina(gasolina);
        
        double paridade = ct.paridade();
        if(ct.getEtanol() < ct.getGasolina()){
            System.out.println("O resultado da paridade é: " + paridade + ", Melhor abastecer com Etanol, pelo valor de: " + ct.getEtanol());
        }
        if(ct.getEtanol() > ct.getGasolina()){
            System.out.println("O resultado da paridade é: " + paridade + ", Melhor abastecer com Gasolina, pelo valor de: " + ct.getGasolina());
        }
        if(paridade == 1){
             System.out.println("O resultado da paridade é: " + paridade + ", O valor das duas é: " + ct.getGasolina());
        }
        
        
    }
    
}
