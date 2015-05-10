/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe Otero
 */
public class CadenasAlumnoTest {
    private CadenasAlumno ca;
    
    public CadenasAlumnoTest() 
    {
        ca=new CadenasAlumno();
    }

    /**
     * Test of sonIguales method, of class CadenasAlumno.
     */
    @Test
    public void testSonIguales() 
    {
        String cadena1="Alba";
        String cadena2="Alba";
        boolean actual=ca.sonIguales(cadena1, cadena2);
        boolean expected=cadena1.equals(cadena2);
        assertEquals(expected, actual);
    }

    /**
     * Test of esMayor method, of class CadenasAlumno.
     */
    @Test
    public void testEsMayor() 
    {
        String cadena1="A";
        String cadena2="C";
        boolean actual=ca.esMayor(cadena1, cadena2);
        boolean expected=false;
        int number =cadena1.compareTo(cadena2);//el compareto da un numero, si es mayor que cero es que cadena1 es mayor que cadena 2;
        if(number>0)
        {
            expected=true;
        }
        else
        {
            expected=false;
        }
        assertEquals(expected, actual);
    }

    /**
     * Test of esMenor method, of class CadenasAlumno.
     */
    @Test
    public void testEsMenor() 
    {
        String cadena1="A";
        String cadena2="C";
        boolean actual=ca.esMenor(cadena1, cadena2);
        boolean expected;
        int number =cadena1.compareTo(cadena2);//el compareto da un numero, si es mayor que cero es que cadena1 es mayor que cadena 2;
        if(number<0)
        {
            expected=true;
        }
        else
        {
            expected=false;
        }
        assertEquals(expected, actual);
    }

    /**
     * Test of comparaIgnorandoMayusculas method, of class CadenasAlumno.
     */
    @Test
    public void testComparaIgnorandoMayusculas() 
    {
        String cadena1="A";
        String cadena2="a";
        boolean actual=ca.comparaIgnorandoMayusculas(cadena1, cadena2);
        boolean expected=cadena1.equalsIgnoreCase(cadena2);
        assertEquals(expected, actual);
    }

    /**
     * Test of reemplazaTodos method, of class CadenasAlumno.
     */
    @Test
    public void testReemplazaTodos() 
    {
        String cadena1="hola";
        String valorAnterior="ho";
        String valorPosterior="mo";
        String actual=ca.reemplazaTodos(cadena1, valorAnterior, valorPosterior);
        String expected=cadena1.replaceAll(valorAnterior, valorPosterior);
        assertEquals(expected, actual);
    }

    /**
     * Test of reemplazaPrimero method, of class CadenasAlumno.
     */
    @Test
    public void testReemplazaPrimero() 
    {
        String cadena1="hola";
        String valorAnterior="ho";
        String valorPosterior="mo";
        String actual=ca.reemplazaPrimero(cadena1, valorAnterior, valorPosterior);
        String expected=cadena1.replaceAll(valorAnterior, valorPosterior);
        assertEquals(expected, actual);
    }
    /**
     * Test of quitaEspacios method, of class CadenasAlumno.
     */
    @Test
    public void testQuitaEspacios() 
    {
        String cadena1="       AC";
        String cadena2="AC";
        String actual=ca.quitaEspacios(cadena1);
        String expected=cadena1.trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of convertirMayusculas method, of class CadenasAlumno.
     */
    @Test
    public void testConvertirMayusculas() 
    {
        String cadena1="a";
        String actual=ca.convertirMayusculas(cadena1);
        String expected=cadena1.toUpperCase();
        assertEquals(expected, actual);
    }

    /**
     * Test of convertirMinusculas method, of class CadenasAlumno.
     */
    @Test
    public void testConvertirMinusculas() 
    {
        String cadena1="a";
        String actual=ca.convertirMinusculas(cadena1);
        String expected=cadena1.toLowerCase();
        assertEquals(expected, actual);
    }

    /**
     * Test of longitudCadena method, of class CadenasAlumno.
     */
    @Test
    public void testLongitudCadena() 
    {
        String cadena1="A";
        long actual=ca.longitudCadena(cadena1);
        long expected=cadena1.length();
        assertEquals(expected, actual);
    }

    /**
     * Test of empiezaCon method, of class CadenasAlumno.
     */
    @Test
    public void testEmpiezaCon() 
    {
        String letra="r";
        String cadena1="razon";
        boolean actual=ca.empiezaCon(cadena1, String.valueOf(letra));
        boolean expected=false;
        char aux=cadena1.charAt(0);
        String letraInicial = new StringBuilder().append("").append(aux).toString();
        if(letraInicial.equals(letra))
        {
            expected=true;
        }
        assertEquals(expected, actual);
    }

    /**
     * Test of acabaEn method, of class CadenasAlumno.
     */
    @Test
    public void testAcabaEn() 
    {
        char letra='n';
        String cadena1="razon";
        boolean actual=ca.acabaEn(cadena1, String.valueOf(letra));
        boolean expected=false;
        if((cadena1.charAt(cadena1.length()-1))==(char) letra)
        {
            expected=true;
        }
        assertEquals(expected, actual);
    }

    /**
     * Test of posicionPrimeraCadena method, of class CadenasAlumno.
     */
    @Test
    public void testPosicionPrimeraCadena() {
        String cadena1 = "Cosa";
        String cadena2 ="o";
        long actual=ca.posicionPrimeraCadena(cadena1, cadena2);
        long expected=cadena1.indexOf(cadena2);
        assertEquals(expected, actual);
    }
    /**
     * Test of extraerSubstring method, of class CadenasAlumno.
     */
    @Test
    public void testExtraerSubstring_String_int() 
    {
        String cadena1="En un lugar de la mancha";
        int posicionInicio=5;
        String actual=ca.extraerSubstring(cadena1, posicionInicio);
        String expected=cadena1.substring(posicionInicio, cadena1.length());
        assertEquals(expected, actual);
    }
    /**
     * Test of concatenaCadenas method, of class CadenasAlumno.
     */
    @Test
    public void testConcatenaCadenas() 
    {
        String cadena1="En un lugar";
        String cadena2="De la mancha";
        String actual=ca.concatenaCadenas(cadena1, cadena2);
        String expected=cadena1.concat(cadena2);
        assertEquals(expected, actual);
    }
}
