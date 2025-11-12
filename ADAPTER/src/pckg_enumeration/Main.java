package pckg_enumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String [] someStrings = {"23", "novo", "vrijeme", "Kad", "Sad"};
        List<String> list = Arrays.asList(someStrings);
        Iterator<String> stringIter = list.iterator();
        Client<String> stringClient = new Client<>(stringIter);


        System.out.println(stringClient.hasSomeElement());
        System.out.println(stringClient.getNextElement());

        while(stringClient.hasSomeElement()){
            System.out.println(stringClient.getNextElement());
        }



        EnumerationConcrete<String> enumerationConcrete = new EnumerationConcrete<>();
        EnumerationToIterator<String> enumerationToIterator = new EnumerationToIterator<>(enumerationConcrete);
        Client<String> newStringClient = new Client<>(enumerationToIterator);



        System.out.println(newStringClient.hasSomeElement());
        System.out.println(newStringClient.getNextElement());



    }
}
