public class Printer {

    private int sheetsLeft;

    public Printer(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public int print(int pages, int copies) {
        return (sheetsLeft = sheetsLeft - (pages * copies));
    }
}
