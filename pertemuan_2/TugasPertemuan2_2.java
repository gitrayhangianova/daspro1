package pertemuan_2;

import java.util.Scanner;

public class TugasPertemuan2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang tanah (m) : ");
        double panjangTanah = input.nextDouble();
        System.out.println("Masukkan lebar tanah (m) : ");
        double lebarTanah = input.nextDouble();
        System.out.println("Masukkan diameter kolam (m) : ");
        double diameterKolam = input.nextDouble();
        System.out.println("Masukkan sisi taman (m) : ");
        double sisiTaman = input.nextDouble();

        double luasTanah = panjangTanah * lebarTanah;

        double jariJari = diameterKolam / 2;
        double luasKolam = Math.PI * jariJari * jariJari;

        double luasTaman = sisiTaman * sisiTaman;
        double luasSisa = luasTanah - (luasKolam + luasTaman);

        System.out.println("Luas Tanah Total  : " + luasTanah + " m2");
        System.out.println("Luas Kolam Ikan   : " + luasKolam + " m2");
        System.out.println("Luas Taman Bunga  : " + luasTaman + " m2");
        System.out.println("Luas Sisa Tanah   : " + luasSisa + " m2");
    }
}
