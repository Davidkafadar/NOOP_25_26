package pckg_zad1_vjezba;

public class AdaptSF2WriterInt implements WriterInt{

    private OldWriterInt sfNovelist;

    public AdaptSF2WriterInt(SFNovelist sfNovelist) {
        this.sfNovelist = sfNovelist;
    }

    @Override
    public void writeNovel(int novelType) {
        sfNovelist.writeNovelOldFashionStyle();
    }


    @Override
    public String toString() {
        return "AdaptSF2WriterInt{" +
                "sfNovelist=" + sfNovelist +
                '}';
    }
}
