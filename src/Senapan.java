public class Senapan {
    private String jenis;
    private int peluruMaksimal;
    private int kaliber;
    private int kerusakan;

    public Senapan(String jenis, int peluruMaksimal, int kaliber, int kerusakan) {
        this.jenis = jenis;
        this.peluruMaksimal = peluruMaksimal;
        this.kaliber = kaliber;
        this.kerusakan = kerusakan;
    }

    public void isiUlang(){

    }

    public String ambilJenis(){
        return this.jenis;
    }

    public int ambilKaliber(){
        return this.kaliber;
    }

    public int ambilKerusakan(){
        return this.kerusakan;
    }
}
