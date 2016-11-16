public class Arena {
  private int nomorArena;
  private int waktu;

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
  }
}
