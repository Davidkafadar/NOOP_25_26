package pckg_VJ_1_Z1_b;

public enum ALG_OPERATION {

    ADDITION("Addition"),
    SUBTRACTION("Subtraction"),
    MULTIPLICATION("Multiplication"),
    DIVISION("Division");

    private String algOperLabel;

    ALG_OPERATION(String label){
        this.algOperLabel = label;
    }

    @Override
    public String toString() {
        return algOperLabel;
    }
}
