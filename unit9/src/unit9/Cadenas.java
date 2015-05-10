package unit9;

import static java.lang.System.out;

/*
 *
 * @author Felipe Otero
 */
public class Cadenas {
    public boolean sonIguales(String cadena1, String cadena2){
        return cadena1.equals(cadena2);
    }
    public boolean esMayor(String cadena1, String cadena2){
        return cadena1.compareTo(cadena2)>0?true:false;
    }
    public boolean esMenor(String cadena1, String cadena2){
        return cadena1.compareTo(cadena2)>0?false:true;
    }
    public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2){
        return cadena1.toLowerCase().equals(cadena2.toLowerCase());
    }
    public String reemplazaTodos(String cadena, String regla, String cambio){
        return cadena.replaceAll(regla, cambio);
    }
    public String reemplazaPrimero(String cadena, String regla, String cambio){
        return cadena.replace(regla, cambio);
    }
    public String[] splitLimite(String cadena, String regla, int limite){
        return cadena.split(regla, limite);
    }
    public String[] split(String cadena, String regla){
        return cadena.split(regla);
    }    
    public void muestraSplitLimite(String cadena, String regla, int limite){
        for (String mensaje: cadena.split(regla, limite)){
            System.out.println(mensaje);
        }
    }
    public void muestraSplit(String cadena, String regla){
        for (String mensaje: cadena.split(regla)){
            System.out.println(mensaje);
        }
    }
    public String quitaEspacios(String cadena){
        return cadena.trim();
    }
    public String convertirMayusculas(String cadena){
        return cadena.toUpperCase();
    }
    public String convertirMinusculas(String cadena){
        return cadena.toLowerCase();
    }
    public String convierteCharToString(char [] cadena1){
        String cadena2 = new String(cadena1);  
        return cadena2;
    }
    public long longitudCadena(String cadena) {
        return cadena.length();
    }
    public boolean empiezaCon(String cadena, String prefijo){
        return cadena.startsWith(prefijo);
    }
    public boolean acabaEn(String cadena, String sufijo){
        return cadena.endsWith(sufijo);
    }
    public char caracterPosicion(String cadena, int indice){
        return cadena.charAt(indice);
    }    
    public long posicionPrimeraCadena(String cadena, String letra){
        return cadena.indexOf(letra);
    }
    public String extraerSubstring(String cadena, int posicionInicio){
        return cadena.substring(posicionInicio);
    }
    public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal){
        return cadena.substring(posicionInicio, posicionFinal);
    }
    public String convertirEnteroString(int numero){
        return String.valueOf(numero);
    }
    public int convertirStingEntero(String cadena){
        return Integer.parseInt(cadena.trim());
    }
    public double convertirStingDouble(String cadena){
        return Double.valueOf(cadena);
    }
    public String concatenaCadenasConcat(String cadena1, String cadena2){
        return cadena1.concat(cadena2);
    }
    public String concatenaCadenas(String cadena1, String cadena2){
        return cadena1 + cadena2;
    }    
}