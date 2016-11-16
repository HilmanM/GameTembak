import java.util.Random;

public class Sasaran {
    private int nyawa = 100;
    private int posisiTerakhir = 0;
    private boolean apaMati = false;

    public Sasaran() {}

    public int ambilNyawa(){
        return this.nyawa;
    }

    public int ambilPosisi(){
        return this.posisiTerakhir;
    }

    public void bergerak(){
        Random rand = new Random();
        int arah = rand.nextInt(3) - 1; //Generate random int from -1 to 1

        this.posisiTerakhir = arah;
    }

    public void kena(int besarKerusakan){
        kurangNyawa(besarKerusakan);
        if(ambilNyawa() <= 0){
            this.apaMati = true;
        }
    }

    private void kurangNyawa(int besarKerusakan){
        this.nyawa -= besarKerusakan;
    }

    public boolean lihatStatusApaMati(){
        return this.apaMati;
    }

    public void hidupKembali(){
        this.nyawa = 100;
        this.apaMati = false;
    }
}
