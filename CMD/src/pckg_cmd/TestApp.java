package pckg_cmd;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {
        List<String> newList = new ArrayList<String>();
        ListManager<String> listManager = new ListManager<>(newList);
        listManager.setCommand(new AddElementCMD<String>(newList, "Tobajas"));
        listManager.exeCommand();
        listManager.setCommand(new AddElementCMD<String>(newList, "Renault"));
        listManager.exeCommand();
        listManager.listAllElement();
        listManager.setCommand(new AddElementPosition<String>(newList, 1, "bmw"));
        listManager.exeCommand();
        listManager.listAllElement();
        listManager.undoCommand();
        listManager.listAllElement();
        listManager.redoCommand();
        listManager.listAllElement();
        listManager.redoCommand();
    }
}
