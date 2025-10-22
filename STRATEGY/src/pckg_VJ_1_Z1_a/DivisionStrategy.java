package pckg_VJ_1_Z1_a;

public class DivisionStrategy implements CalcStrategy {
    @Override
    public double performCalculation(Double fst, Double snd) {
        if (snd == 0){
            System.out.println("Not able to divide with 0");
        }else {
            return fst / snd;
        }
        return 0;
    }
}
