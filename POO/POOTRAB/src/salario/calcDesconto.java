package salario;

public class calcDesconto {

    private float INSS, IRPF, VT, VA, VR, CVN;
    private double salario;

    public Float INSS() {
        if (salario <= 1212) {
            INSS = (float) (salario * 0.075);
            return INSS;
        }
        if (salario >= 1212.01 && salario <= 2427.35) {
            INSS = (float) (salario * 0.09);
            return INSS;
        }
        if (salario >= 2427.36 && salario <= 3641.03) {
            INSS = (float) (salario * 0.12);
            return INSS;
        }
        if (salario >= 3641.04 && salario <= 7087.22) {
            INSS = (float) (salario * 0.14);
            return INSS;
        } else {
            INSS = (float) (salario * 0.14);
            return INSS;
        }
    }

    public Float IRPF() {
        if (salario <= 1903.98) {
            IRPF = 0;
            return IRPF;
        }
        if (salario >= 1903.99 && salario <= 2826.65) {
            IRPF = (float) (salario * 0.075);
            return IRPF;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            IRPF = (float) (salario * 0.15);
            return IRPF;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            IRPF = (float) (salario * 0.225);
            return IRPF;
        } else {
            IRPF = (float) (salario * 0.275);
            return IRPF;
        }

    }

    public Float VT() {
        if (salario > 1212.00) {
            VT = (float) (salario * 0.06);
            return VT;
        }
        return null;
    }
    
    public Float VA() {
        if (salario > 3636.00) {
            VA = (float) (salario * 0.02);
            return VA;
        }
        return null;
    }
    
    public Float VR() {
        if (salario <= 1212.00) {
            System.out.println("ISENTO!");;
        }
        else if(salario > 1212.01){
            VR = (float) (salario * 0.03);
            return VR;
        }
        return null;
    }
    
    public Float CVN() {
        if (salario <= 1212.00) {
            System.out.println("ISENTO!");;
        }
        else if(salario > 1212.01){
            CVN = (float) (salario * 0.04);
            return CVN;
        }
        return null;
    }
}
