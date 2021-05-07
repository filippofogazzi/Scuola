package esercizio2_arraylist;

import java.util.*;

/**
 * @author Filippo Fogazzi
 */
public class Esercizio2_ArrayList {

    public static void main(String[] args) {
        // Lista con colori
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Arancione");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        list_Strings.add("Blu");
        list_Strings.add("Nero");
        // Stampa la lista
        for (String element : list_Strings) {
            System.out.println(element);
        }
    }  
}
