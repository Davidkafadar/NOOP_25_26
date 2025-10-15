package pckg_interface_parametrization;

public class CompareTWO <T extends  Comparable<T>>{

    private final T fst;
    private final T snd;

    public CompareTWO(T fst, T snd) {
        this.fst = fst;
        this.snd = snd;
    }

    public void performComparison(){
        if(fst.compareTo(snd) > 0){
            System.out.println("The first one is greater than second");
        }else if(fst.compareTo(snd) < 0){
            System.out.println("The second one is greater than first");
        }else{
            System.out.println("The elements are equal!!");
        }
    }

}
