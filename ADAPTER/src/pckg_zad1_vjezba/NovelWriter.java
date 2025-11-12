package pckg_zad1_vjezba;

public class NovelWriter implements WriterInt{



    @Override
    public void writeNovel(int novelType) {
        switch (novelType){
            case 1:
                System.out.println("Writing romantic type novel!"); break;

            case 2:
                System.out.println("Writing drama type novel!"); break;

            case 3:
                System.out.println("Writing history type novel!"); break;

            default:
                throw new IllegalArgumentException("Not possible");
        }
    }

    @Override
    public String toString() {
        return "NovelWriter";
    }
}
