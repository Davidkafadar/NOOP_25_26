package pckg_interface_parametrization;

public class TestComparison {

    public static void main(String[] args) {
        String sFst ="Tamo neki String...";
        String sSnd ="Novi String...";
        CompareTWO<String> stringCompareTWO = new CompareTWO<>(sFst, sSnd);
        stringCompareTWO.performComparison();

        Integer fst1 = 45;
        Integer snd1 = 145;
        CompareTWO<Integer> integerCompareTWO = new CompareTWO<>(fst1, snd1);
        integerCompareTWO.performComparison();


        StringLengthComparison fst = new StringLengthComparison(sFst);
        StringLengthComparison snd = new StringLengthComparison(sSnd);
        CompareTWO<StringLengthComparison> stringLengthComparisonCompareTWO = new CompareTWO<>(fst, snd);
        stringLengthComparisonCompareTWO.performComparison();

    }
}
