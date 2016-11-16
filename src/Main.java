import java.util.Scanner;

public class Main {
    static Arena arena = new Arena(10);
    static Pemburu pemburu = new Pemburu("Player");
    static Senapan senapan = new Senapan("Shotgun", 6, 615, 99);
    static Sasaran sasaran = new Sasaran();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hi! Selamat datang di game tembak tembakan");
        System.out.println("*Isi instruksi permainan di sini*");

        System.out.println("Masukkan nama: ");
        String nama = scanner.nextLine();

        inisialisasiPermainan(nama);

        while(!sasaran.lihatStatusApaMati()){
            aksi();
            if(sasaran.lihatStatusApaMati()){
                arena.naikArena();
                sasaran.hidupKembali();
            }
        }
    }

    private static void inisialisasiPermainan(String namaPemain){
        pemburu.aturNama(namaPemain);
    }

    private static String masukanAksi(){
        System.out.println("Tembak : T");
        System.out.println("Isi peluru: R");
        String masukanAksi = scanner.nextLine();

        return masukanAksi;
    }

    private static String ambilArah(){
        System.out.println("Kiri : A; Tengah: W; Kanan : D ");
        System.out.println("Tentukan arah tembakan: ");
        String masukanArah = scanner.nextLine();

        return masukanArah;
    }

    private static int arahDalamInt(String arahStr){
        if(arahStr.equalsIgnoreCase("A")){
            return -1;
        } else if(arahStr.equalsIgnoreCase("D")){
            return 1;
        } else {
            return 0;
        }
    }

    private static void aksi(){
        tampilkanStatus();

        String aksi = masukanAksi();
        if(aksi.equalsIgnoreCase("T")){
            String arahStr = ambilArah();
            int arah = arahDalamInt(arahStr);

            sasaran.bergerak();
            if(senapan.apaPeluruHabis()) System.out.println("Peluru habis");

            if(pemburu.tembak(senapan, arah, sasaran.ambilPosisi())){
                sasaran.kena(senapan.ambilKerusakan());
                System.out.println("Sasaran kena");
            } else {
                System.out.println("Sasaran meleset");
                System.out.println("Sasaran ke " + arahSasaran(sasaran));
            }
        } else {
            senapan.isiUlang();

            System.out.println("Peluru telah terisi");
        }

        arena.kurangiWaktu();
    }

    private static void tampilkanStatus(){
        System.out.println("Level: " + arena.ambilNomorArena());
        System.out.println("Nama: " + pemburu.ambilNama());

        System.out.println("Nyawa target: " + sasaran.ambilNyawa());
        System.out.println("Waktu tersisa: " + arena.ambilWaktu());
        //senapan.kurangiPeluru();
        System.out.println("Peluru tersisa: " + senapan.ambilJumlahPeluru());
        System.out.println("--------------------------------------");
    }

    private static String arahSasaran(Sasaran sasaran){
        switch(sasaran.ambilPosisi()){
            case -1:
                return "Kiri";
            case 0:
                return "Tengah";
            case 1:
                return "Kanan";
            default:
                return "Error";
        }
    }
}
