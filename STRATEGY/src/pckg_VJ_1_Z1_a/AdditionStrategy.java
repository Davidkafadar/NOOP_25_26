package pckg_VJ_1_Z1_a;



public class AdditionStrategy implements CalcStrategy{
    @Override
    public double performCalculation(Double fst, Double snd) {
        return fst+snd;

    }
}
