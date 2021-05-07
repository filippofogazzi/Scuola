package esercizio1_arraylist;

import java.util.*;

/**
 * @author Filippo Fogazzi
 */

public class Esercizio1_ArrayList {

    public static void main(String[] args) {
        
        //Esercizio 1
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        System.out.println(list_Strings);
        
        //Esercizio 2
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        for (String element : list_Strings) {
            System.out.println(element);
        }
        
        //Esercizio 3
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        list_Strings.add("Blu");
        list_Strings.add("Nero");
        System.out.println(list_Strings);
        // Inserimento colore all'inizio e alla fine
        list_Strings.add(0, "Pink");
        list_Strings.add(5, "Yellow");
        // Stampa
        System.out.println(list_Strings);
        
        //Esercizio 4
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        // Stampa
        System.out.println(list_Strings);
        // Ripercorrere il primo e il terzo elemento
        String element = list_Strings.get(0);
        System.out.println("First element: "+element);
        element = list_Strings.get(2);
        System.out.println("Third element: "+element);
        
        //Esercizio 5
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        // Stampa
        System.out.println(list_Strings);
        // Aggiorno 3 elemento con "Marrone"
        list_Strings.set(2, "Marrone");
         // Stampa 2
        System.out.println(list_Strings);
        
        //Esercizio 6
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        list_Strings.add("Nero");
        // Stampa
        System.out.println(list_Strings);
        // Rimuovere terzo elemento
        list_Strings.remove(2);
        // Stampa 2
        System.out.println("Dopo aver rimosso il terzo elemento:\n"+list_Strings);
        
        //Esercizio 7
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        list_Strings.add("Nero");
        // Cerca "Rosso"
        if (list_Strings.contains("Rosso")) {
          System.out.println("Trovato elemento");
        } else {
          System.out.println("Non trovato");
        }
        
        
        //Esercizio 8
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        list_Strings.add("Nero");
        System.out.println("List prima del sort: "+list_Strings);
        Collections.sort(list_Strings);
        System.out.println("List dopo il sort: "+list_Strings);
        
        
        //Esercizio 9
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List2: " + List2);
        // Copio List2 in List1
        Collections.copy(List1, List2);
        System.out.println("Copio List in List2,\nRisultato:");
        System.out.println("List1: " + List1);
        System.out.println("List2: " + List2);
        
        
        //Esercizio 10
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        list_Strings.add("Nero");
        System.out.println("Lista prima di mescolamento:\n" + list_Strings);  
        Collections.shuffle(list_Strings);
        System.out.println("Lista dopo mescolamento:\n" + list_Strings); 
        
        
        //Esercizio 11
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        list_Strings.add("Nero");
        System.out.println("Lista prima del reverse :\n" + list_Strings);  
        Collections.reverse(list_Strings);
        System.out.println("List dopo il reverse :\n" + list_Strings);
        
        
        //Esercizio 12
        list_Strings.add("Rosso");
        list_Strings.add("Verde");
        list_Strings.add("Bianco");
        list_Strings.add("Nero");
        System.out.println("Lista Originale: " + list_Strings);
        List<String> sub_List = list_Strings.subList(0, 3);
        System.out.println("Lista dei primi tre elementi: " + sub_List);
        
        
        //Esercizio 13
        ArrayList<String> c1= new ArrayList<String>();
          c1.add("Rosso");
          c1.add("Verde");
          c1.add("Bianco");
          c1.add("Nero");
          c1.add("Rosa");

          ArrayList<String> c2= new ArrayList<String>();
          c2.add("Rosso");
          c2.add("Verde");
          c2.add("Bianco");
          c2.add("Rosa");

          
          // Memorizzazione dell'output di confronto in ArrayList<String>
          ArrayList<String> c3 = new ArrayList<String>();
          for (String e : c1)
             c3.add(c2.contains(e) ? "Si" : "No");
          System.out.println(c3);
          
          
        //Esercizio 14
        c1.add("Rosso");
        c1.add("Verde");
        c1.add("Bianco");
        c1.add("Nero");
        c1.add("Rosa");

        System.out.println("Array Listt prima del cambio:");
        for(String a: c1){
            System.out.println(a);
        }
        //Scambio il primo(index 0) con il terzo elemento(index 2)
        Collections.swap(c1, 0, 2);
        System.out.println("Array list dopo il cambio:");
        for(String b: c1){
          System.out.println(b);
        }
        
        
        //Esercizio 15
        c1.add("Rosso");
        c1.add("Verde");
        c1.add("Bianco");
        c1.add("Nero");
        c1.add("Rosa");
        System.out.println("Lista dei primi Array: " + c1);
        c2.add("Rosso");
        c2.add("Verde");
        c2.add("Nero");
        c2.add("Rosa");
        System.out.println("Lista dei secondi Array: " + c2);
         
      // Unisciti a due elenchi sopra
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("Nuovo Array: " + a);
        
        
        //Esercizio 16
        c1.add("Rosso");
        c1.add("Verde");
        c1.add("Bianco");
        c1.add("Nero");
        c1.add("Rosa");
        System.out.println("Array List originale: " + c1);
        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("Array List clonata: " + newc1); 
        
        
        //Esercizio 17
        c1.add("Rosso");
        c1.add("Verde");
        c1.add("Bianco");
        c1.add("Nero");
        c1.add("Rosa");
        System.out.println("Array List originale: " + c1);
        c1.removeAll(c1);
        System.out.println("Array list dopo aver rimosso tutti gli elementi "+c1); 
        
        
        
        //Esercizio 18
        c1.add("Rosso");
        c1.add("Verde");
        c1.add("Bianco");
        c1.add("Nero");
        c1.add("Rosa");
        System.out.println("Array List originale: " + c1);
        System.out.println("Controllo che l'elenco di array sopra è vuoto! "+c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list dopo aver rimosso tutti gli elementi "+c1);   
        System.out.println("Controllo che l'elenco di array sopra è vuoto! "+c1.isEmpty());
        
        
        //Esercizio 19
        c1.add("Rosso");
        c1.add("Verde");
        c1.add("Bianco");
        c1.add("Nero");
        c1.add("Rosa");
        System.out.println("Array List originale: " + c1);
        System.out.println("Dopo l'utilizzo di trimToSize: ");
        c1.trimToSize();
        System.out.println(c1);
        
        
        //Esercizio 20
        c1.add("Rosso");
        c1.add("Verde");
        c1.add("Bianco");
        System.out.println("Array List originale: " + c1);
        //Aumento capacità di 6
        c1.ensureCapacity(6);
        c1.add("Nero");
        c1.add("Rosa");
        c1.add("Giallo");
        System.out.println("Nuova Array List: " + c1);
        
        
        //Esercizio 21
        ArrayList<String>  colore = new ArrayList<String>();
        colore.add("Rosso");
        colore.add("Verde");

        System.out.println("Array List originalet: " + colore);
        String new_color = "Bianco";
        colore.set(1,new_color);

        int num=colore.size();
        System.out.println("Rimpiazzo secondo elemento con 'Bianco'."); 
        for(int i=0;i<num;i++)
        System.out.println(colore.get(i));
        
        
        //Esercizio 22
        c1.add("Rosso");
        c1.add("Verde");
        c1.add("Bianco");
        c1.add("Nero");
        c1.add("Rosa");
        System.out.println("\nArray List originale: " + c1);
        System.out.println("\nStampo usando index di un elemento: ");
        int no_of_elements = c1.size();
        for (int index = 0; index < no_of_elements; index++)
         System.out.println(c1.get(index));
    }
}
