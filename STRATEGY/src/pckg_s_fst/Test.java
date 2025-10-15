package pckg_s_fst;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> somelst = new ArrayList<>();
        SortPrinciple sp1 = new SortPrinciple_1();
        SimpleSorter<String> simpleSorter = new SimpleSorter<>(somelst, sp1);
        simpleSorter.performSorting();
        simpleSorter.setSortPrinciple(new SortPrinciple_2());
        simpleSorter.performSorting();
    }
}
