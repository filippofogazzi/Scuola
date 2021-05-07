package esercizio_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Filippo Fogazzi
 */
public class Esercizio_LinkedList {

    public static void main(String[] args) {
        //Esercizio 1
        LinkedList<String> l_list = new LinkedList<String>();
        // uso il metodo .add() per aggiungere elementi alla Linked List
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        l_list.add("Giallo");
        // Stampa
        System.out.println("Linked List: " + l_list);
        
        
        //Esercizio 2
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        l_list.add("Giallo");
        for (String element : l_list) {
            System.out.println(element);
        }
        
        
        //Esercizio 3
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        l_list.add("Giallo");
        // imposto l'Iterator ad uno specifico elemento
        Iterator p = l_list.listIterator(1);
        // Stampo dalla seconda posizione
        while (p.hasNext()) {
            System.out.println(p.next());
        }
        
        
        //Esercizio 4
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        l_list.add("Giallo");
        // Stampo
        System.out.println("Lista originale:" + l_list);  
 
        Iterator it = l_list.descendingIterator();

        // Stampo in ordine opposto
        System.out.println("Elementi al contrario:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        
        //Esercizio 5
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        l_list.add("Giallo");
        System.out.println("Lista originale: ");
	System.out.println("Metto il colore giallo davanti al colore rosso: " + l_list);
	l_list.add(1, "Giallo");
	// Stampo
	System.out.println("Risultato:" + l_list);
        
        
        //Esercizio 6
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        l_list.add("Giallo");
        System.out.println("Lista originale:" + l_list);    
        // Aggiungo elemento all'inizio
        l_list.addFirst("Viola");
        // Aggiungo elemento alla fine
        l_list.addLast("Marrone");
        System.out.println("Risultato:" + l_list); 
        
        
        //Esercizio 7
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        l_list.add("Giallo");
        System.out.println("Lista originale:" + l_list);    
        // Aggiungo un elemento di fronte alla Linked List
        l_list.offerFirst("Marrone");
        System.out.println("Risultato:" + l_list); 
        
        
        //Esercizio 8
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        l_list.add("Giallo");
        System.out.println("Lista originale:" + l_list);    
        // Aggiungo elemento in fondo alla Linked List
        l_list.offerLast("Marrone");
        System.out.println("Risultato:" + l_list);  
        
        
        
        //Esercizio 9
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        // Stampo
        System.out.println("Lista originale:" + l_list);

        // creo una nuova collezione e aggiungo elementi
        LinkedList <String> new_l_list = new LinkedList <String> ();
        new_l_list.add("Marrone");
        new_l_list.add("Viola");

        // Aggiungo la collezione nella seconda posizione dell'esistente linked list
        l_list.addAll(1, new_l_list);
        // Stampo 2
        System.out.println("LinkedList:" + l_list);
    
        
        
        //Esercizio 10
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        System.out.println("Lista originale:" + l_list);  
 
        // Trovo Primo elemento
        Object first_element = l_list.getFirst();
        System.out.println("Primo elemento è: "+first_element);
 
        // Trovo ultimo elemento
        Object last_element = l_list.getLast();
        System.out.println("Ultimo elemento è: "+last_element);
        
        
        //Esercizio 11
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        System.out.println("Lista originale:" + l_list);  
        for(int z = 0; z < l_list.size(); z++)
        {
            System.out.println("Elemento "+z+": "+l_list.get(z));
        } 
        
        
        //Esercizio 12
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        System.out.println("Lista originale: " + l_list);

        // Rimuovo l'elemento in terza posizione dalla linked list
        l_list.remove(2);
        System.out.println("Risultato: " + l_list);
        
        
        //Esercizio 13
        l_list.add("Rosso");
        l_list.add("Verde");
        l_list.add("Nero");
        l_list.add("Bianco");
        l_list.add("Rosa");
        System.out.println("Lista originale: " + l_list);

        // Rimuovo il primo elemento
        Object firstElement = l_list.removeFirst();
        System.out.println("Elemento rimosso: "+ firstElement);
 
        // Rimuovo l'ultimo elemento
        Object lastElement = l_list.removeLast();
        System.out.println("Elemento rimosso: "+ lastElement);
        System.out.println("Risultato: " + l_list);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
