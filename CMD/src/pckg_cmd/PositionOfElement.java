package pckg_cmd;

import java.util.List;

public class PositionOfElement<E> implements CMD {

    private List<E> someList;
    private E element;



    public PositionOfElement(List<E> someList, E element) {
        this.someList = someList;
        this.element = element;
    }


    @Override
    public void execute() {
        int pos = someList.indexOf(element);
        System.out.println("Position of element " + element + " is " + pos);
    }

    @Override
    public void undo() {
        System.out.println("Nothing to undi in this");

    }

    @Override
    public void redo() {
        execute();

    }
}
