package pckg_zad1_vjezba;

public class WritingOffice {

    private WriterInt someNovelWriter;

    public WritingOffice(WriterInt someNovelWriter) {
        this.someNovelWriter = someNovelWriter;
    }

    public void writeANovel(int novelType) {
        someNovelWriter.writeNovel(novelType);
        System.out.println(this.toString());
    }

    public void setSomeNovelWriter(WriterInt novelWriter) {
        this.someNovelWriter = novelWriter;
    }

    @Override
    public String toString() {
        return "WritingOffice{" +
                "someNovelWriter=" + someNovelWriter +
                '}';
    }
}
