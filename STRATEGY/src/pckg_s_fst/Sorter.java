package pckg_s_fst;
import java.util.List;

public abstract class Sorter <E> {

    protected List<E> lst;
    protected SortPrinciple sortPrinciple;

    protected Sorter(List<E> somelst, SortPrinciple sortPrinciple) {
        this.lst = somelst;
        this.sortPrinciple = sortPrinciple;
    }

    protected void setListToSort(List<E> lst){
        this.lst = lst;
    }

    protected void setSortPrinciple(SortPrinciple sp){
        this.sortPrinciple = sp;
    }

    protected abstract void performSorting();

}