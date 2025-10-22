package pckg_VJ_1_Z1_a;

public class SubtractionStrategy implements CalcStrategy {
    @Override
    public double performCalculation(Double fst, Double snd) {
        return fst-snd;
    }
}
