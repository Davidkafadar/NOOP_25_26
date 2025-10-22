package pckg_VJ_1_Z1_b;

public class InputPanelData {

    private double fstNum;
    private double sndNum;
    private ALG_OPERATION alg_operation;

    public InputPanelData(double fstNum, double sndNum, ALG_OPERATION alg_operation) {
        this.fstNum = fstNum;
        this.sndNum = sndNum;
        this.alg_operation = alg_operation;
    }
    public Double getfstNum() {
        return fstNum;
    }
    public Double getsndNum() {
        return sndNum;
    }
    public ALG_OPERATION getAlgoperation() {
        return alg_operation;
    }
}
