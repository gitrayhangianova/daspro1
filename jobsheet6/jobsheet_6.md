# JOBSHEET 6 - STUDI KASUS PEMILIHAN DENGAN GIT DAN GITHUB

**Identitas Mahasiswa:**

- **Nama:** Rayhan Gianova Arianto
- **NIM:** 264107020213
- **Kelas / No. Presensi:** TI-1D / 24

---

## 1. TUJUAN PRAKTIKUM

1. Mahasiswa mampu menyelesaikan studi kasus pemrograman dasar menggunakan struktur pemilihan dasar (if-else) dan pemilihan bersarang (nested if).
2. Mahasiswa mampu menyimpan, mengelola versi, dan mengumpulkan pekerjaan menggunakan Git dan GitHub melalui antarmuka Visual Studio Code.
3. Mahasiswa mampu berkolaborasi secara langsung dengan tim/rekan menggunakan fitur Git/GitHub.

---

## 2. PERSIAPAN AWAL & ALUR GIT/GITHUB

### 2.1 Konfigurasi Identitas Git

Jalankan perintah berikut pada terminal terintegrasi VS Code untuk mendaftarkan identitas pengembang secara global:

```bash
git config --global user.name "username"
git config --global user.email "useremail"
```

### 2.2 Ringkasan Perintah & Navigasi Tombol Git pada VS Code

| Proses Git      | Fungsi Utama                                                            | Navigasi / Tombol di VS Code                                                                |
| :-------------- | :---------------------------------------------------------------------- | :------------------------------------------------------------------------------------------ |
| **Clone**       | Menduplikasi repository dari GitHub ke direktori lokal                  | _Welcome Screen_ → **Clone Git Repository** → Masukkan URL → Pilih Folder                   |
| **Add (Stage)** | Menandai perubahan berkas untuk siap dimasukkan dalam commit berikutnya | Tab **Source Control** (`Ctrl+Shift+G`) → Klik ikon `+` (_Stage Changes_) di samping berkas |
| **Commit**      | Menyimpan snapshot/rekaman perubahan berkas ke repository lokal         | Tuliskan pesan commit pada kolom teks → Klik tombol **Commit**                              |
| **Push**        | Mengunggah commit dari repository lokal ke repository GitHub            | Klik ikon `...` → **Push**, atau klik tombol **Sync Changes**                               |
| **Pull**        | Mengambil dan menggabungkan perubahan terbaru dari GitHub ke lokal      | Klik ikon `...` → **Pull**                                                                  |
| **Sync**        | Melakukan `Pull` dan `Push` secara otomatis berturutan                  | Klik tombol **Sync Changes** di baris bawah atau tab Source Control                         |
| **Discard**     | Membatalkan seluruh perubahan lokal yang belum di-stage                 | Klik ikon panah melingkar (_Discard Changes_) pada berkas terkait                           |

---

## 3. HASIL PERCOBAAN STUDI KASUS

### 3.1 Percobaan 1: Studi Kasus 1 - Pemilihan Dasar (Kasir Kedai Kopi Senja)

Kedai Kopi Senja menjual Kopi Susu Gula Aren seharga **Rp18.000 per cup**.

- Jika total pembelian mencapai minimal **Rp100.000**, pembeli berhak mendapatkan diskon sebesar **10%**.
- Program menghitung total harga, diskon, total bayar, serta memeriksa kecukupan uang pembayaran (menampilkan kembalian atau kekurangan uang).

#### Kode Program Java (StudiKasus124.java)

```java
package jobsheet6.studikasus1;

import java.util.Scanner;

public class StudiKasus124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli : ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan jumlah uang bayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga : Rp." + totalHarga);
        System.out.println("Total Diskon : Rp." + diskon);
        System.out.println("Total Bayar : Rp." + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian anda : Rp." + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang anda tidak cukup, kurang Rp." + kurang);
        }

        sc.close();
    }
}

```

#### Catatan Commit History Studi Kasus 1:

1. `SK1: input dan deklarasi variabel`
2. `SK1: logika diskon dan kembalian`

---

### 3.2 Pertanyaan & Analisis Percobaan 1

**Pertanyaan 1:**
Mengapa nilai variabel diskon diinisialisasi dengan angka 0 di awal sebelum pemeriksaan kondisi if?

**Jawaban:**
Variabel diskon diinisialisasi awal dengan 0 untuk mengantisipasi kondisi di mana total pembelian tidak mencapai batas minimum diskon (kurang dari Rp100.000). Karena blok if hanya mengeksekusi perhitungan diskon ketika totalHarga >= 100000, tanpa inisialisasi awal, variabel diskon tidak akan memiliki nilai saat dihitung pada baris totalBayar = totalHarga - diskon;, yang menyebabkan error variable diskon might not have been initialized pada Java.

**Pertanyaan 2:**
Bagaimana logika program menangani kondisi ketika uang pembayaran yang dimasukkan pelanggan kurang dari total bayar?

**Jawaban:**
Logika ditangani oleh blok kondisi if (uangBayar >= totalBayar). Jika pernyataan tersebut bernilai false (uang bayar kurang dari total bayar), program akan melompat ke blok else. Di dalam blok else, program menghitung besarnya kekurangan uang melalui rumus kurang = totalBayar - uangBayar; lalu mencetak informasi kekurangan tersebut ke layar.

---

### 3.3 Percobaan 2: Studi Kasus 2 - Pemilihan Bersarang (Validasi Dana Penghargaan Prestasi)

Program ini memvalidasi kelayakan mahasiswa penerima dana penghargaan prestasi berdasarkan aturan Kemahasiswaan POLINEMA:

1. **Kegiatan Lomba (BELMAWA, BAKORMA, MANDIRI):** Harus meraih **Juara 1, 2, atau 3** DAN mengumpulkan **4 dokumen wajib** (Surat Tugas, Sertifikat, Foto, Poster).
2. **Kegiatan PKM:** Harus dinyatakan **Lolos Pendanaan** DAN mengumpulkan **4 dokumen wajib**.
3. **Jenis Kegiatan LAINNYA:** Otomatis tidak berhak menerima dana penghargaan.

#### Kode Program Java (StudiKasus224.java)

```java
package jobsheet6.studikasus2;

import java.util.Scanner;

public class StudiKasus224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = input.next();

        System.out.print("Jumlah dokumen (0-4): ");
        int jumlahDokumen = input.nextInt();

        int peringkatJuara = 0;
        int statusPendanaanPKM = 0;

        // Input kondisi tambahan berdasarkan jenis kegiatan
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
                jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara): ");
            peringkatJuara = input.nextInt();
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaanPKM = input.nextInt();
        }

        // Logika pemilihan bersarang (Nested IF)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
                jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            // Cek apakah peraih Juara 1, 2, atau 3
            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                // Cek kelengkapan dokumen (wajib 4)
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            // Cek apakah lolos pendanaan
            if (statusPendanaanPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    int kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurangDokumen
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        } else {
            System.out.println("Status: Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

        input.close();
    }
}
```

#### Catatan Commit History Studi Kasus 2:

1. `SK2: cabang lomba`
2. `SK2: cabang PKM dan lainnya`

---

### 3.4 Pertanyaan & Analisis Percobaan 2

**Pertanyaan 1:**
Mengapa perbandingan String jenis kegiatan menggunakan method .equalsIgnoreCase() dan bukan operator `==`?

**Jawaban:**
Di dalam bahasa Java, (==) membandingkan referensi memori (memory address) dari objek String, bukan isi dari teks tersebut. Karena input diterima dari Scanner (yang membuat objek String baru di memory heap), pembandingan dengan (==) akan bernilai false meskipun teksnya sama. Method .equalsIgnoreCase() membandingkan nilai konten teks karakter per karakter secara tepat sekaligus mengabaikan perbedaan huruf besar dan kecil (case-insensitive).

**Pertanyaan 2:**
Jelaskan alur eksekusi program jika user memasukkan jenisKegiatan = "PKM", jumlahDokumen = 3, dan statusPKM = 1!

**Jawaban:**
Alur eksekusi langkah demi langkah:

1. Program memeriksa kondisi utama if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || ...). Hasilnya false karena jenis kegiatan adalah "PKM".
2. Program mengecek cabang else if (jenisKegiatan.equalsIgnoreCase("PKM")). Hasilnya true.
3. Program membaca input jumlahDokumen = 3 dan statusPKM = 1.
4. Program masuk ke nested if (statusPKM == 1) → bernilai true.
5. Di dalamnya, program memeriksa kondisi if (jumlahDokumen == 4). Karena jumlahDokumen = 3, kondisi bernilai false dan berpindah ke blok else.
6. Program menghitung kurang = 4 - 3 = 1 dan mencetak: "Status: Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan."

---

## 4. HASIL UJI SILANG KOLABORASI (PERCOBAAN 4)

Tabel berikut menyajikan rekapitulasi pengujian silang program Studi Kasus 2 yang dilakukan oleh collaborator (rekan praktikum):

| No  | Jenis Kegiatan | Jumlah Dokumen | Peringkat / Pendanaan | Status Output / Hasil                                                        | Sesuai? |
| :-: | :------------- | :------------: | :-------------------: | :--------------------------------------------------------------------------- | :-----: |
|  1  | BAKORMA        |       3        |        Juara 1        | Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan.  |   Ya    |
|  2  | MANDIRI        |       4        |    4 (Bukan Juara)    | Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).                 |   Ya    |
|  3  | PKM            |       4        |       1 (Lolos)       | Berhak memperoleh dana penghargaan (PKM lolos pendanaan).                    |   Ya    |
|  4  | PKM            |       2        |    0 (Tidak Lolos)    | Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).               |   Ya    |
|  5  | LAINNYA        |       4        |           -           | Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan). |   Ya    |
