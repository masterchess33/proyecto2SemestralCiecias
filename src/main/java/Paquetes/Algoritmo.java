package Paquetes;


public class Algoritmo {
    private static final char L_paren    = '(';
    private static final char R_paren    = ')';
    
    public String comprobar(int largo, String cadena){
        String resultado="";
        if(largo!=cadena.length()){
            System.out.println("El largo de la cadena no es el mismo");
        }else if(largo>300000){
            System.out.println("La cadena es demasiada larga");
            resultado=":(";
        }else if(cadena.charAt(0)==(R_paren)){
            resultado=":(";
        }else if(cadena.charAt(1)==(L_paren)){
        resultado=":(";
        }else if(cadena.charAt(largo-2)==(R_paren)){
        resultado=":(";
        }else if(cadena.charAt(largo-1)==(L_paren)){
            resultado=":(";
        }else if(largo%2!=0){
        resultado=":(";
        }
        
        return resultado;
    }
}
