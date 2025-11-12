package pckg_zad1_vjezba;

public class TestApp {

    public static void main(String[] args) {
        NovelWriter novelWriter = new NovelWriter();
        WritingOffice writingOffice = new WritingOffice(novelWriter);

        writingOffice.writeANovel(3);
        writingOffice.setSomeNovelWriter(new AdaptSF2WriterInt(new SFNovelist()));

        writingOffice.writeANovel(0);
    }
}
