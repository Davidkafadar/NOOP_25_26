package pckg_wildcards;

import java.util.List;
import java.util.ArrayList;

public class MultiListClass<E>{


    private final List<E> someList;

    public MultiListClass(){
        this.someList = new ArrayList<>();
    }

    public MultiListClass(List<E> someList) {
        this.someList = someList;
    }

    public void listElementsInList(){
        if(someList.isEmpty()){
            System.out.println("List is empty");
        }else{
            someList.forEach(System.out::println);
        }
    }
    public void addElementsToList(E element){
        if(someList.contains(element)){
            System.out.println("Element already exists");
        }else{
            someList.add(element);
            System.out.println("Element added");
        }
    }
    public void compareListLengths(List<?> anotherList){
        if(someList.size() > anotherList.size()){
            System.out.println("This list is longer than another list");
        }else if(someList.size() < anotherList.size()){
            System.out.println("This list is shorter than another list");
        }else{
            System.out.println("This list is equal to another list");
        }
    }
}
