package pckg_cmd;

public interface CMD {

    void execute();
    void undo();
    void redo();
}
