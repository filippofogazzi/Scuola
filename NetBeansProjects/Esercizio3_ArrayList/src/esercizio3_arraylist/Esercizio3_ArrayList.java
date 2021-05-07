package esercizio3_arraylist;

import java.util.*;

/**
 * @author Filippo Fogazzi
 */

public class Esercizio3_ArrayList {
    public static void main(String[] args) {
        // Creazione lista
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Rosso");
        list_Strings.add("Giallo");
        list_Strings.add("Viola");
        list_Strings.add("Bianco");
        list_Strings.add("Nero");
        // Stampa lista
        System.out.println(list_Strings);
        // Inserire un colore all'inizio e alla fine della lista 
        list_Strings.add(0, "Azzurro");
        list_Strings.add(5, "Rosa");
        // Stampa lista
        System.out.println(list_Strings);
    }
    
}
