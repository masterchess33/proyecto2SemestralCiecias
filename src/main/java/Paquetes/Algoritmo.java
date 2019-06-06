package Paquetes;


public class Algoritmo {
    private static final char L_PAREN    = '(';
    private static final char R_PAREN    = ')';
    
    public String comprobar(int largo, String cadena){
        String resultado="";
        if(largo!=cadena.length()){
            System.out.println("El largo de la cadena no es el mismo");
        }else if(cadena.charAt(0)==(')')){
            resultado=":(";
        }else if(cadena.charAt(largo-1)==('(')){
            resultado=":(";
        
        }else if(largo%2!=0){
        resultado=":(";
        }
        
        return resultado;
    }
}
