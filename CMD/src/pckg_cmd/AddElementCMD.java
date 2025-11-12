package pckg_cmd;

import java.util.List;

public class AddElementCMD<E> implements CMD{

    private List<E> someList;
    private E element;

    public AddElementCMD(List<E> someList, E element) {
        this.element = element;
        this.someList = someList;
    }


    @Override
    public void execute() {
        someList.add(element);
        System.out.println("Added element NEW: " + element);

    }

    @Override
    public void undo() {
        someList.remove(element);
        System.out.println("Removed Element: " + element);

    }

    @Override
    public void redo() {
        execute();

    }
}
