package pckg_cmd;

import java.util.List;
import java.util.Stack;

public class ListManager<E> {

    private List<E> someList;
    private CMD command;
    private final Stack<CMD> undoStack;
    private final Stack<CMD> redoStack;

    public ListManager(List<E> someList) {
        this.someList = someList;
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void setCommand(CMD command) {
        this.command = command;
    }

    public void listAllElement(){
        for(E element : someList){
            System.out.println(element);
        }
    }

    public void exeCommand(){
        command.execute();
        undoStack.add(command);
    }

    public void undoCommand(){
        if(undoStack.isEmpty()){
            System.out.println("Nothing to Undo - Stack is empty!");
        }else {
            command = undoStack.pop();
            command.undo();
            listStackElement(undoStack);
            redoStack.add(command);
            listStackElement(redoStack);

        }

    }
    public void redoCommand(){
        if(redoStack.isEmpty()){
            System.out.println("Nothing to Redo - Stack is empty!");
        }else{
            command = redoStack.pop();
            command.redo();
            listStackElement(redoStack);
            undoStack.add(command);
            listStackElement(undoStack);

        }


    }

    private void listStackElement(Stack<CMD> someStacke){
        System.out.println("--------------------" + someStacke.getClass().getSimpleName() + "---------------------");
        for(CMD element : someStacke){
            System.out.println(element);
        }
        System.out.println("_________________________________-");
    }
}
