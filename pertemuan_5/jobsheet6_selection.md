# JOBSHEET 6 - PEMILIHAN 2

**Identitas Mahasiswa:**

- **Nama:** Rayhan Gianova Arianto
- **NIM:** 264107020213
- **Kelas / No. Presensi:** TI-1D / 24

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan permasalahan/studi kasus menggunakan sintaks pemilihan bersarang.
2. Mahasiswa mampu menerapkan sintaks pemilihan bersarang ke dalam program Java.
3. Mahasiswa mampu menerapkan operator logika `&&`, `||`, dan `!` pada struktur pemilihan.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi

Percobaan ini memperagakan penggunaan struktur `Nested-IF` (IF bersarang) untuk memvalidasi pendaftaran ujian skripsi mahasiswa. Sistem memeriksa dua tahapan syarat: pertama adalah status kompen (bebas kompen), dan kedua adalah jumlah log bimbingan dengan Pembimbing 1 (minimal 8 kali) dan Pembimbing 2 (minimal 4 kali).

#### Kode Program Java Percobaan 1

```java
package pertemuan_5;

import java.util.Scanner;

public class nestedUjianSkripsi24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan = null;

        System.out.print("Apakah mahasiswa bebas kompen? (Ya/Tidak)");
        String bebasKompwn = sc.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompwn.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        sc.close();
    }
}
```

#### 2.1.1 Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian?

Program akan menampilkan output "Gagal! Mahasiswa masih memiliki tanggungan kompen", karena di code program tersebut ada kondisi bebasKompen.equalsIgnoreCase("Ya") bernilai false, sehingga blok code if tidak dieksekusi walaupun perlu memasukkan jumlah log bimbingan di terminal, jadi program akan langsung kondisi else.

##### Pertanyaan 1 : Jelaskan maksud dari potongan kode berikut! if (bimbinganP1 >= 8 && bimbinganP2 >= 4)

Potongan kode tersebut bekerja seperti mengecek dua syarat sekaligus dari bimbinganP1 dan bimbinganP2 menggunakan ope rasi logika &&, yang dimana hasil bernilai true jika log bimbinganP1 lebih atau sama dengan 8 DAN bimibinganP2 lebih atau sama dengan 4.

##### Pertanyaan 2 : Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi!

- **Langkah pertama :** Pengecekan apakah mahasiswa bebas kompensasi YA atau Tidak, jika Tidak program akan langsung ke kondisi else, jika Ya program akan lanjut ke pengecekan selanjutnya

- **Langkah Kedua :** Pengecekan log bimbingan P1 dan P2, jika bimbinganP1 lebih atau sama dengan 8 dan bimbinganP2 lebih atau sama dengan 4 itu masuk kondisi semua syarat terpenuhi. Kalau log bimbingan P1 dan P2 kurang dari ketentuan akan masuk ke kondisi selanjutnya yaitu log bimbingan kurang dari 8 dan 4.

---

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

Percobaan ini berfokus pada penggunaan operator logika && (AND), || (OR), dan ! (NOT) untuk menentukan apakah seorang pengguna (mahasiswa atau dosen) berhak mendapatkan akses WiFi kampus dengan syarat akunnya tidak sedang diblokir.

#### Kode Program Java Percobaan 2

```java
import java.util.Scanner;

public class operatorLogikaWifi24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }

        sc.close();
    }
}
```

#### 2.2.1 Tabel Pengujian Parameter Output

| no  | mahasiswa | dosen | akunDiblokir | output yang dihasilkan | status eksekusi |
| :-: | :-------: | :---: | :----------: | :--------------------: | :-------------: |
|  1  |   true    | false |    false     |  akses wifi diberikan  |      valid      |
|  2  |   false   | true  |    false     |  akses wifi diberikan  |      valid      |
|  3  |   true    | false |     true     |   akses wifi ditolak   |      valid      |
|  4  |   false   | false |    false     |   akses wifi ditolak   |      valid      |

##### Pertanyaan 1 : Jelaskan fungsi operator ||, &&, dan ! pada kondisi program tersebut!

- **|| (OR) :** Untuk memastikan pengguna tergolong sebagai mahasiswa atau dosen (cukup satu saja yang bernilai true)
- **&& (AND) :** Digunakan saat dua gabungan syarat harus terpenuhi secara bersamaan (keduanya harus bernilai true)
- **! (NOT) :** Membalikkan nilai boolean, contohnya : Jika akunDiblokir = false, maka !akunDiblokir bernilai true (tidak terblokir)

##### Pertanyaan 2 : Mengapa pengguna dosen tetap dapat memperoleh akses ketika nilai mahasiswa = false ?

Karena ekspresi (mahasiswa || dosen) menggunakan operator logika || (OR) yang dimana kalau salah satu dari mahasiswa atau dosen yang bernilai true maka ekspresi akan bernilai true.

##### Pertanyaan 3 : Ubah operator || menjadi &&. Jalankan kembali program menggunakan data uji 1 dan 2. Apa yang terjadi dan mengapa?

Setelah mencoba data uji 1 dan 2, output yang dihasilkan berubah menjadi "Akses wifi ditolak". Hal ini terjadi karena penggunaan operator logika && yang mengharuskan pengguna untuk membuat variabel mahasiswa dan dosen bernilai true.

##### Pertanyaan 4 : Pada ekspresi mahasiswa || dosen, kapan kondisi dosen tidak perlu dievaluasi? Jelaskan berdasarkan short-circuit evaluation!

Kondisi dosen tidak perlu dievaluasi ketika variabel mahasiswa bernilai true. Berdasarkan prinsip short-circuit evaluation, pada operasi OR (||), jika operan pertama sudah bernilai true, maka hasil dari seluruh operasi OR dipastikan true tanpa harus melihat operan kedua

##### Pertanyaan 5: Pada ekspresi (mahasiswa || dosen) && !akunDiblokir, kapan kondisi !akunDiblokir tidak perlu dievaluasi? Jelaskan!

Kondisi !akunDiblokir tidak dievaluasi apabila ekspresi (mahasiswa || dosen) bernilai false (artinya pengguna bukan mahasiswa dan bukan dosen). Pada operasi AND (&&), jika operan pertama bernilai false, maka seluruh ekspresi sudah pasti bernilai false.

---

### 2.3 Percobaan 3: Nested IF dan Operator Logika untuk Menentukan Akses Laboratorium

Percobaan ini menggabungkan struktur Nested-IF dengan operator logika untuk memeriksa hak akses laboratorium di luar jam kuliah. Syarat utama adalah status mahasiswa harus aktif dan tidak sedang disanksi. Jika lolos, syarat kedua memeriksa apakah mahasiswa memiliki izin dosen atau merupakan asisten lab.

#### Kode Program Java Percobaan 3

```java
import java.util.Scanner;

public class nestedAksesLab24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();

        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();

        System.out.print("Apakah merupakan asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

        sc.close();
    }
}
```

#### 2.3.1 Tabel Pengujian Parameter Output

| Uji | mahasiswaAktif | sedangDisanksi | punyaIzinDosen | asistenLab | Output yang Dihasilkan                                        | Status Eksekusi |
| :-: | :------------: | :------------: | :------------: | :--------: | :------------------------------------------------------------ | :-------------: |
|  1  |      true      |     false      |      true      |   false    | Akses laboratorium diberikan                                  |      Valid      |
|  2  |      true      |     false      |     false      |   false    | Akses ditolak: membutuhkan izin dosen atau status asisten lab |      Valid      |
|  3  |     false      |     false      |      true      |    true    | Akses ditolak: status mahasiswa tidak memenuhi syarat         |      Valid      |
|  4  |      true      |      true      |      true      |    true    | Akses ditolak: status mahasiswa tidak memenuhi syarat         |      Valid      |

##### Pertanyaan 1 : Mengapa pemeriksaan punyaIzinDosen || asistenLab ditempatkan di dalam IF pertama?

Karena pemeriksaan izin dosen dan status asisten lab merupakan syarat sekunder. Syarat ini hanya relevan dan perlu diproses jika mahasiswa telah memenuhi syarat dasar (utama), yaitu berstatus aktif dan tidak dalam sanksi.

##### Pertanyaan 2 : Jelaskan fungsi operator &&, ||, dan ! pada program tersebut!

- **&& :** Memastikan status utama terpenuhi keduanya (Aktif DAN Tidak Disanksi).
- **|| :** Memeriksa apakah mahasiswa memenuhi salah satu dari dua hak akses tambahan (Punya Izin Dosen ATAU Asisten Lab).
- **! :** Membalikkan status boolean sedangDisanksi agar kondisi bernilai true apabila mahasiswa tidak disanksi.

##### Pertanyaan 3 : Apakah syarat akses dapat ditulis menjadi satu kondisi: mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)? Jelaskan apakah keputusan akses akhirnya sama!

Ya, keputusan akses akhirnya sama persis. Namun, penulisan satu kondisi IF membuat program tidak bisa memberikan pesan penolakan yang spesifik/berbeda untuk tiap jenis kegagalan.

##### Pertanyaan 4 : Apa keuntungan menggunakan Nested IF pada kasus ini dibandingkan hanya satu IF jika sistem perlu menampilkan alasan penolakan yang berbeda?

Keuntungannya adalah dapat memisahkan pesan kesalahan (error message) dengan spesifik sesuai tingkatan syarat yang gagal dipenuhi (membedakan antara gagal di syarat status kemahasiswaan vs gagal di syarat otoritas/izin lab).

##### Pertanyaan 5 : Buat satu kombinasi masukan yang menyebabkan akses ditolak pada level pertama dan satu kombinasi yang menyebabkan akses ditolak pada level kedua!

- **Ditolak Level 1 :** mahasiswaAktif = false, sedangDisanksi = false, punyaIzinDosen = true, asistenLab = true (Output: Akses ditolak: status mahasiswa tidak memenuhi syarat).

- **Ditolak Level 2 :** mahasiswaAktif = true, sedangDisanksi = false, punyaIzinDosen = false, asistenLab = false (Output: Akses ditolak: membutuhkan izin dosen atau status asisten lab).

---

### 3: Tugas Mandiri

#### 3.1 Tugas 1 : Implementasi sistem diskon toko buku berdasarkan jenis dan jumlah buku (Nested IF & Operator Logika).

```java
import java.util.Scanner;

public class tugas1DiskonBuku24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        String jenisBuku;
        int jumlahBuku;
        double diskon = 0.0;

        // Input data dari pengguna
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine().trim();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            // Diskon dasar kamus = 10%
            diskon = 0.10;
            if (jumlahBuku > 2) {
                // Tambahan diskon 2% jika buku > 2
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            // Diskon dasar novel = 7%
            diskon = 0.07;
            if (jumlahBuku > 3) {
                // Tambahan diskon 2% jika novel > 3
                diskon += 0.02;
            } else {
                // Tambahan diskon 1% jika novel <= 3
                diskon += 0.01;
            }
        } else {
            // Buku selain kamus dan novel
            if (jumlahBuku > 3) {
                // Diskon 5% jika jumlah buku > 3
                diskon = 0.05;
            } else {
                diskon = 0.0;
            }
        }

        // Menampilkan output persentase diskon
        System.out.println("\n--------------------------------");
        System.out.println("Jenis Buku  : " + jenisBuku);
        System.out.println("Jumlah Buku : " + jumlahBuku);
        System.out.println("Total Diskon: " + (diskon * 100) + "%");
        System.out.println("--------------------------------");

        sc.close();
    }
}
```

Program ini menghitung persentase diskon toko buku berdasarkan jenis buku dan jumlah pembeliaan menggunakan struktur pemilihan bersarang. Jenis kamus memperoleh diskon dasar 10% dengan bonus 2% jika beli >2. Novel mendapat diskon dasar 7% ditambah bonus 1% atau 2%. Jenis lainnya diskon 5% jika beli >3.

#### 3.2 Tugas 2 : Implementasi sistem seleksi calon asisten praktikum dengan alasan kegagalan bertahap (tugas2SeleksiAsistenNoPresensi.java).

```java
import java.util.Scanner;

public class tugas2SeleksiAsisten24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang mendapat sanksi akademik? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();

        // Tahap 1: Verifikasi status mahasiswa
        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("Masukkan nilai Dasar Pemrograman (0-100): ");
            double nilaiDaspro = sc.nextDouble();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean punyaSertifikat = sc.nextBoolean();

            // Tahap 2: Verifikasi nilai atau sertifikat
            if (nilaiDaspro >= 80 || punyaSertifikat) {
                System.out.println("\nSelamat! Anda dipanggil untuk mengikuti wawancara.");
                System.out.print("Masukkan nilai wawancara (0-100): ");
                double nilaiWawancara = sc.nextDouble();

                // Tahap 3: Verifikasi wawancara
                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat, Anda DITERIMA sebagai Asisten Praktikum!");
                } else {
                    System.out.println("Gagal: Nilai wawancara kurang dari 75.");
                }
            } else {
                System.out.println("Gagal: Nilai Dasar Pemrograman < 80 dan tidak memiliki sertifikat kompetensi.");
            }
        } else {
            System.out.println("Gagal: Status mahasiswa tidak aktif atau sedang mendapat sanksi akademik.");
        }

        sc.close();
    }
}
```

Program ini menyeleksi calon asisten praktikum melalui tiga tahapan bertahap menggunakan nested-IF dan operator logika. Tahap pertama memeriksa status aktif dan sanksi. Tahap kedua menguji nilai Daspro minimal 80 atau kepemilikan sertifikat. Tahap terakhir mengevaluasi nilai wawancara minimal 75 serta menampilkan alasan spesifik jika gagal.

---

### 4: Kesimpulan

Pada Jobsheet 6 ini, dapat disimpulkan bahwa penggunaan struktur pemilihan bersarang (Nested IF) dan kombinasi operator logika (&&, ||, !) sangat efektif untuk menyelesaikan permasalahan kompleks yang membutuhkan evaluasi kondisi secara bertahap. Struktur Nested IF memberikan fleksibilitas bagi programer untuk menangani kasus yang membutuhkan klarifikasi atau pesan penolakan secara spesifik di tiap tingkatan evaluasi, sedangkan operator logika membantu menyederhanakan gabungan beberapa syarat dalam satu tingkatan ekspresi.
