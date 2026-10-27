# JOBSHEET 8 - PERULANGAN 2

**Identitas Mahasiswa:**

- **Nama:** Rayhan Gianova Arianto
- **NIM:** 264107020213
- **Kelas / No. Presensi:** TI-1D / 24

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Memahami konsep perulangan bersarang (_nested loop_) pada algoritma.
2. Memahami alur perulangan bersarang.
3. Mengenal sintaks perulangan bersarang.
4. Mampu menerapkan perulangan bersarang untuk menyelesaikan studi kasus sederhana.

---

## 2: PRAKTIKUM & HASIL PERCOBAAN

### 2.1 Percobaan 1: Review Perulangan 1

Percobaan ini mengulang konsep perulangan FOR untuk menampilkan karakter \* sebanyak n kali secara mendatar (ke arah samping) menggunakan fungsi print.

#### Kode Program Java Percobaan 1 (Star24.java)

```java
import java.util.Scanner;

public class Star24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
```

#### 2.1.1 Pertanyaan & Analisis Percobaan 1

##### Pertanyaan 1 : Jika inisialisasi i=1 diubah menjadi i=0 tanpa mengubah kondisi, berapa karakter (\*) yang tercetak ketika n=5? Jelaskan.

- **Jawaban:** Karakter (\*) yang tercetak akan menjadi 6 buah (yaitu untuk nilai i = 0, 1, 2, 3, 4, 5). Hal ini terjadi karena batas kondisi adalah i $\le$ 5, sehingga perulangan berjalan sebanyak 6 kali iterasi.

##### Pertanyaan 2 : Jika kondisi i $\le$ n diganti menjadi i $<$ n, berapa kali perulangan dijalankan saat n = 5? Mengapa hasilnya berbeda?

- **Jawaban:** Perulangan dijalankan sebanyak 4 kali (untuk nilai i = 1, 2, 3, 4). Hasilnya berbeda karena tanda kurang dari tanpa sama dengan ($<$) menghentikan perulangan sebelum i mencapai nilai n.

##### Pertanyaan 3 : Prediksi output potongan kode berikut ketika n=9, kemudian buktikan dengan mengganti perulangan FOR pada program Anda dan menjalankannya. Modifikasi kode tersebut agar mencetak bilangan ganjil positif yang tidak melebihi n.

```java
for (int i = 2; i <= n; i += 2) {
    System.out.print(i + " ");
}
```

- **Jawaban Prediksi (n=9):** 2 4 6 8
- **Modifikasi untuk mencetak bilangan ganjil positif yang tidak melebihi n:**
  ```java
  for (int i = 1; i <= n; i += 2) {
      System.out.print(i + " ");
  }
  ```

##### Pertanyaan 4 : Jelaskan mengapa perubahan increment i++ menjadi i-- (dengan kondisi tetap i $\le$ n) membuat perulangan berjalan terus-menerus dan tidak berhenti dalam waktu wajar untuk n positif?

- **Jawaban:** Karena nilai awal i (misal 1) akan terus berkurang menjadi 0, -1, -2, ... sehingga nilai i akan selalu memenuhi syarat kondisi i $\le$ n (selalu bernilai benar/infinite loop).

---

### 2.2 Percobaan 2: Pola Bintang Persegi Panjang (Nested FOR)

Percobaan ini menggunakan perulangan bersarang (nested FOR) untuk mencetak persegi panjang bintang, di mana perulangan luar (outer loop) mengatur baris dan perulangan dalam (inner loop) mengatur kolom.

#### Kode Program Java Percobaan 2 (Rectangle24.java)

```java
import java.util.Scanner;

public class Rectangle24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
```

#### 2.2.1 Pertanyaan & Analisis Percobaan 2

##### Pertanyaan 1 : Tentukan fungsi variabel i dan j pada program tersebut.

- **Jawaban:** Variabel i berfungsi sebagai penghitung/kontrol untuk perulangan luar (outer loop) yang merepresentasikan jumlah baris, sedangkan variabel j berfungsi sebagai penghitung untuk perulangan dalam (inner loop) yang merepresentasikan jumlah kolom pada setiap baris.

##### Pertanyaan 2 : Berapa kali outer loop, inner loop, dan perintah print("\*") dijalankan untuk baris = 4 dan kolom = 7?

- **Outer loop:** dijalankan sebanyak 4 kali.
- **Inner loop:** dijalankan sebanyak 4 x 7 = 28 kali secara total (4 kali perulangan luar x 7 kali putaran perulangan dalam).
- **Perintah print("\*"):** dijalankan sebanyak 4 x 7 = 28 kali.

##### Pertanyaan 3 : Apa yang terjadi jika batas perulangan luar dan dalam ditukar? Gunakan baris = 3 dan kolom = 6.

- **Jawaban:** Bentuk hasil cetakan akan tetap berupa persegi panjang dengan total bintang yang sama (3 x 6 = 18), namun orientasinya bertukar di mana jumlah baris menjadi 6 dan jumlah kolom per baris menjadi 3.

##### Pertanyaan 4 : Jelaskan akibat penghapusan System.out.println(); setelah inner loop.

- **Jawaban:** Seluruh bintang dari setiap baris akan tercetak menyambung menjadi satu baris panjang tanpa ada perpindahan baris baru ke bawah.

##### Pertanyaan 5 : Modifikasi program agar karakter yang dicetak adalah #.

- **Jawaban:** Cukup ubah System.out.print("\*"); menjadi System.out.print("#");.

---

### 2.3 Percobaan 3: Debugging Bintang Segitiga - Nested WHILE

Percobaan ini memperbaiki kode perulangan bersarang berbasis WHILE untuk membentuk pola segitiga siku-siku bertingkat, serta menambahkan logika segitiga terbalik.

#### Kode Program Java Percobaan 3 (Triangle24.java)

```java
import java.util.Scanner;

public class Triangle24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Segitiga Siku-Siku Tegak
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        // Segitiga Terbalik (Modifikasi)
        int k = n;
        while (k >= 1) {
            int j = 0;
            while (j < k) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            k--;
        }

        sc.close();
    }
}
```

#### 2.3.1 Pertanyaan & Analisis Percobaan 3

##### Pertanyaan 1 : Sebutkan ketidaksesuaian output awal dan minimal dua perbaikan yang diperlukan untuk menghasilkan pola segitiga bertingkat.

- **Jawaban:** Output awal menampilkan seluruh karakter dalam satu baris dan dimulai dari baris kosong karena inisialisasi dan posisi perintah pindah baris belum tepat. Perbaikannya meliputi penambahan System.out.println() setelah inner loop dan pengaturan inisialisasi variabel i = 1 serta kondisi yang benar.

##### Pertanyaan 2 : Jelaskan peran variabel i dan j. Mengapa nilai j harus diinisialisasi kembali ke 0 pada setiap iterasi outer loop?

- **Jawaban:** Variabel i mengontrol jumlah baris, sedangkan j mengontrol jumlah bintang per baris. j harus di-reset ke 0 pada setiap awal iterasi baris agar perhitungan jumlah bintang pada baris berikutnya dimulai dari nol kembali.

##### Pertanyaan 3 : Jelaskan perubahan inisialisasi, kondisi, dan update pada outer loop untuk membentuk segitiga terbalik.

- **Jawaban:** Inisialisasi dimulai dari nilai maksimum (k = n), kondisinya diperiksa saat k $\ge$ 1, dan update dilakukan dengan decrement (k--) agar jumlah bintang berkurang pada setiap baris berikutnya.

---

### 2.4 Percobaan 4: Studi Kasus Nilai Tugas Proyek Kelompok

Percobaan ini menggabungkan tiga jenis perulangan (WHILE untuk kelompok, FOR untuk penilai, dan DO-WHILE untuk validasi nilai) guna mengelola penilaian kelompok dan mencari kelompok dengan rata-rata tertinggi.

#### Kode Program Java Percobaan 4 (NilaiKelompok24.java)

```java
import java.util.Scanner;

public class NilaiKelompok24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai: ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("  Nilai dari Penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("  Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }

                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                nomorKelompok++;
            }

            System.out.println("==============================");
            System.out.println("Kelompok terbaik    : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }

        sc.close();
    }
}
```

#### 2.4.1 Pertanyaan & Analisis Percobaan 4

##### Pertanyaan 1 : Mengapa totalNilai perlu di-reset di dalam outer loop, tetapi rataTertinggi tidak boleh di-reset pada setiap kelompok?

- **Jawaban:**
  - totalNilai harus di-reset menjadi 0 di dalam _outer loop_ (pada awal pemrosesan tiap kelompok) agar perhitungan total nilai dari kelompok sebelumnya tidak ikut terakumulasi/tercampur ke kelompok yang baru.
  - rataTertinggi tidak boleh di-reset pada setiap kelompok karena variabel ini bertindak sebagai pemegang rekor tertinggi global untuk seluruh kelompok. Variabel ini harus tetap menyimpan rekor nilai rata-rata tertinggi dari kelompok-kelompok yang sudah diproses sebelumnya agar dapat dibandingkan dengan kelompok selanjutnya hingga perulangan selesai.

##### Pertanyaan 2 : Untuk 3 kelompok dan 2 penilai (tanpa input yang salah), berapa kali badan perulangan FOR dijalankan secara keseluruhan?

- **Jawaban:** Perulangan FOR (_inner loop_ penilai) akan dijalankan sebanyak **6 kali** secara keseluruhan (3 kelompok x 2 penilai = 6 kali eksekusi).

##### Pertanyaan 3 : Apa yang terjadi jika totalNilai dideklarasikan sebagai int dan rata-rata dihitung menggunakan pembagian dua bilangan bulat? Berikan contoh nilai.

- **Jawaban:** Jika totalNilai dideklarasikan sebagai int dan dibagi dengan jumlahPenilai (yang juga bernilai int), Java akan melakukan **pembagian bulat (integer division)** yang membuang/menghilangkan angka di belakang koma (desimal).
  - _Contoh:_ Jika totalNilai = 175 dan jumlahPenilai = 2, maka hasil perhitungan 175 / 2 akan menghasilkan 87 (bukan 87.5), sehingga nilai rata-rata menjadi tidak akurat.

##### Pertanyaan 4 : Mengapa rataTertinggi diberi nilai awal -1, bukan 0? Berikan contoh input yang membuat hasil salah apabila nilai awalnya 0.

- **Jawaban:** rataTertinggi diinisialisasi dengan -1 untuk memastikan bahwa kelompok pertama (kelompok 1) yang diinput nilainya pasti akan mencatatkan rekor awal sebagai kelompok terbaik, meskipun nilai rata-rata kelompok tersebut bernilai 0.
  - _Contoh:_ Jika nilai awal rataTertinggi = 0 dan seluruh penilai memberikan nilai 0 untuk Kelompok 1, maka kondisi rataNilai $>$ rataTertinggi (0 $>$ 0) akan bernilai false. Akibatnya, Kelompok 1 tidak akan tercatat sebagai kelompok terbaik dan variabel kelompokTerbaik akan tetap bernilai 0 (salah).

##### Pertanyaan 5 : Program ini memiliki tiga tingkat perulangan. Sebutkan masing-masing jenis perulangan beserta perannya.

- **Jawaban:**
  1. **WHILE (Outer Loop / Tingkat 1):** Berperan untuk mengatur dan melakukan iterasi perpindahan antar kelompok (memproses kelompok 1, 2, hingga n).
  2. **FOR (Middle Loop / Tingkat 2):** Berperan untuk mengiterasi proses penginputan nilai dari sejumlah penilai untuk kelompok yang sedang aktif.
  3. **DO-WHILE (Inner Loop / Tingkat 3):** Berperan sebagai sistem validasi input. Perulangan ini akan memaksa penilai memasukkan ulang angka jika nilai yang dimasukkan berada di luar rentang valid 0 - 100.

---

## 3: TUGAS MANDIRI

### 3.1 Tugas 1 : Pola Bilangan Bertingkat (Tugas124.java)

Program untuk mencetak pola angka bertingkat dari 1 sampai nomor baris, lengkap dengan perhitungan total angka yang tercetak.

```java
import java.util.Scanner;

public class Tugas124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int totalAngka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                totalAngka++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + totalAngka);
        sc.close();
    }
}
```

---

### 3.2 Tugas 2 : Tabel Perkalian (Tugas224.java)

Program untuk menampilkan tabel perkalian berukuran n $\times$ n dengan format rapi menggunakan printf serta menghitung jumlah seluruh angka pada tabel.

```java
import java.util.Scanner;

public class Tugas224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();
        int jumlahSeluruhAngka = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlahSeluruhAngka += hasil;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jumlahSeluruhAngka);
        sc.close();
    }
}
```

---

### 3.3 Tugas 3 : Rekap Penjualan Beberapa Toko (Tugas324.java)

Program berbasis perulangan bersarang untuk merekap jumlah pelanggan dan barang per toko, total seluruh barang, serta menentukan toko dengan jumlah barang terbanyak.

```java
import java.util.Scanner;

public class Tugas324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        int maxBarang = -1;
        int tokoTerbaik = 0;
        int totalBarangSeluruhToko = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                int jumlahBarang = sc.nextInt();
                totalBarangToko += jumlahBarang;
            }

            System.out.println("Toko " + i + " -> Pelanggan: " + jumlahPelanggan + ", Total Barang: " + totalBarangToko);
            System.out.println("--------------------------------------------------");

            totalBarangSeluruhToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbaik = i;
            }
        }

        System.out.println("\n=== RINGKASAN AKHIR ===");
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);

        sc.close();
    }
}
```

---
