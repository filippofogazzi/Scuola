package esercizio4_arraylist;

import java.util.*;

/**
 * @author Filippo Fogazzi
 */

public class Esercizio4_ArrayList {
    public static void main(String[] args) {
        // Crea lista con colori
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Arancio");
        list_Strings.add("Bianco");
        list_Strings.add("Nero");
        // Stampa Lista
        System.out.println(list_Strings);
        // Ripercorre il primo e il terzo elemento
        String elemento = list_Strings.get(0);
        System.out.println("Primo elemento: "+elemento);
        elemento = list_Strings.get(2);
        System.out.println("Terzo elemento: "+elemento);
    }
    
}
