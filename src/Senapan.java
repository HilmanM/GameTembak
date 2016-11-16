public class Senapan {
    private String jenis;
    private int peluruMaksimal;
    private int jumlahPeluru;
    private int kaliber;
    private int kerusakan;

    public Senapan(String jenis, int peluruMaksimal, int kaliber, int kerusakan) {
        this.jenis = jenis;
        this.peluruMaksimal = peluruMaksimal;
        this.jumlahPeluru = peluruMaksimal;
        this.kaliber = kaliber;
        this.kerusakan = kerusakan;
    }

    public void isiUlang(){
        this.jumlahPeluru = this.peluruMaksimal;
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

    public int ambilJumlahPeluru(){
        return this.jumlahPeluru;
    }

    public void kurangiPeluru(){
        this.jumlahPeluru--;
    }

    public boolean apaPeluruHabis(){
        return (ambilJumlahPeluru() == 0);
    }
}
