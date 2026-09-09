package pertemuan_2;

public class Variabel24 {
    public static void main(String[] args) {
        String salahSatuHobySayaAdalah = "Bola Voli";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSaya = 18;
        double ipk = 3.75, tinggiBadan = 1.70;
        System.out.println("Salah satu hobi saya adalah olahraga" + salahSatuHobySayaAdalah);
        System.out.println("Saya " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umur saya: " + umurSaya);
        System.out.println(String.format("Saya beripk %.2f, dengan tinggi badan %.2f", ipk, tinggiBadan));
    }
}