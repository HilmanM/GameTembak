public class Pemburu {
    private String nama;
    private int skor;
    private int levelTerakhir;

    public Pemburu(String nama) {
        this.nama = nama;
    }

    public int ambilLevelTerakhir(){
        return this.levelTerakhir;
    }

    public void tambahSkor(){

    }

    public String ambilNama(){
        return this.nama;
    }

    public int ambilSkor(){
        return this.skor;
    }

    public boolean tembak(Senapan senapan, int arah, int posisiLawan){
        if(!senapan.apaPeluruHabis()) senapan.kurangiPeluru();

        if(arah != posisiLawan || senapan.apaPeluruHabis()) {
            return false;
        }

        return true;
    }

    public void aturNama(String nama){
        this.nama = nama;
    }


}
