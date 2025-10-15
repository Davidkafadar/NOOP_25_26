package pckg_intro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class TEST {

    public static void main(String[] args) {

        ArrayList<Integer> Ilista = new ArrayList();
        ArrayList<Float> flist = new ArrayList();
        ArrayList<String> slist = new ArrayList<>();
        printIListElement(Ilista);

        User<Integer> user = new User<>(10, "Ivana");
        user.info(Ilista);

    }

    private static void printFListElement(ArrayList<Float> lista){
        Iterator iter = lista.iterator();
        while(iter.hasNext()){
            Float element = (Float) iter.next();
            System.out.println(element);

        }
    }
    private static void printSListElement(ArrayList<String> lista){
        Iterator iter = lista.iterator();
        while(iter.hasNext()){
            String element = (String) iter.next();
            System.out.println(element);

        }
    }
    private static void printIListElement(ArrayList<Integer> lista){
        Iterator iter = lista.iterator();
        while(iter.hasNext()){
            Integer element = (Integer) iter.next();
            System.out.println(element);

        }
    }

    private static <E> void printAnyListElements(ArrayList<E> list){
        // Zamjena za gornje 3 metode jer prima parametre <E> koji predstavljaju sve parametre poput integer sTring float itd
        for(E element : list){
            System.out.println(element);
        }

    }


    private static <K, V> void listMapElements(HashMap<K,V> map){
        for(K key : map.keySet()){
            System.out.println("Key : " + key);
            System.out.println("Value : " + map.get(key));
        }

    }


}
