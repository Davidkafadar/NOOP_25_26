package pckg_zad1_vjezba;

public class SFNovelist implements OldWriterInt {
    @Override
    public void writeNovelOldFashionStyle() {
        System.out.println("Writing SF novel");
    }

    public SFNovelist() {
        System.out.println("SFNovelist created");
    }


    @Override
    public String toString() {
        return "SFNovelist";
    }
}
