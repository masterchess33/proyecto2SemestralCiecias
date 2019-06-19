package Paquetes;

public class SecuenciaParentesis {

    private int largoSecuencia;
    private String secuencia;
    private char[] arraySecuencia;

    public SecuenciaParentesis(int largoSecuencia, String secuencia) {
        this.largoSecuencia = largoSecuencia;
        this.secuencia = secuencia;
        this.arraySecuencia = secuencia.toCharArray();
    }

    public String resolverSecuenciaParentesis() {
        if (this.largoSecuencia % 2 != 0) {
            return ":(";
        }
        int parIzq = 0;
        int parDer = 0;
        for (int i = 0; i < this.largoSecuencia; i++) {
            if (this.arraySecuencia[i] == '(') {
                parIzq++;
            }
            if (this.arraySecuencia[i] == ')') {
                parDer++;
            }
        }
        if (parIzq > this.largoSecuencia / 2 || parDer > this.largoSecuencia / 2) {
            return ":(";
        }
        for (int i = 0; i < this.largoSecuencia; i++) {
            if (this.arraySecuencia[i] == '?') {
                if (parIzq < this.largoSecuencia / 2) {
                    this.arraySecuencia[i] = '(';
                    parIzq++;
                } else {
                    this.arraySecuencia[i] = ')';
                    parDer++;
                }
            }
        }

        int contador = 0;
        for (int i = 0; i < this.largoSecuencia; i++) {
            if (this.arraySecuencia[i] == '(') {
                contador++;
            } else {
                contador--;
            }
            if (contador <= 0 && i < this.largoSecuencia - 1) {
                return ":(";
            }
        }

        String resultado = new String(this.arraySecuencia);
        return resultado;
    }


}
