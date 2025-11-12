package pckg_cmd;

import java.util.List;

public class AddElementPosition<E> implements CMD {

    private List<E> someList;
    private int idx;
    private E element;

    public AddElementPosition(List<E> someList, int idx,  E element) {
        this.someList = someList;
        this.idx = idx;
        this.element = element;
    }

    @Override
    public void execute() {
        someList.add(idx,element);
        System.out.println("Added element at index: " + idx);

    }

    @Override
    public void undo() {
        someList.remove(idx);
        System.out.println("Removed element at index: " + idx);

    }

    @Override
    public void redo() {
        execute();

    }
}
