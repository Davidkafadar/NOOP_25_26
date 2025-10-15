package pckg_wildcards;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMultiList {

    public static void main(String[] args) {
        String someString = "Some String, it is evident";
        String [] partsOfSomeString = someString.split(" ");
        List<String> listString = new ArrayList<>(Arrays.asList(partsOfSomeString));

        System.out.println(Arrays.toString(partsOfSomeString));
        MultiListClass<String> stringMultiListClass = new MultiListClass<>(listString);

        Integer[] intNums = {23, 44, 56, 143, 14, 123, -123, 9, 234, 4, 5, 1223, 13414};
        List<Integer> iList = new ArrayList<>(Arrays.asList(intNums));

        stringMultiListClass.compareListLengths(iList);
    }
}
