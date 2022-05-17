package combustivel;

public class Combustivel {
    private double etanol;
    private double gasolina;

    public double getEtanol() {
        return etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }
    
    public double paridade(){
        double paridade = etanol / gasolina;
        return paridade;
    }
}
