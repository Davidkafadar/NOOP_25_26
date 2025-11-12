package pckg_no_fasade;

public class HTNew {

    private Fasada fasada;

    public HTNew(Fasada fasada) {
        this.fasada = fasada;
    }
    public void watchmovie(){
        fasada.watchMovie();
    }
    public void stopMovie(){
        fasada.stopMovie();
    }
}
