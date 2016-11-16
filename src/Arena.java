public class Arena {
    private int nomorArena = 1;
    private int waktu;

    public Arena(int waktu){
        this.waktu = waktu;
    }

    public int ambilNomorArena(){
        return this.nomorArena;
    }

    public boolean kurangiWaktu(){
        this.waktu--;
        if(this.waktu==0){
            return false;
        }
        return true;
    }

    public void naikArena(){
        this.nomorArena++;
        this.waktu = 20;
        //if (this.waktu >= 10) this.waktu -= 10;
    }

    public int ambilWaktu(){
        return this.waktu;
    }
}
