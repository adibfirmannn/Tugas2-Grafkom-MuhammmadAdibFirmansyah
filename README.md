Nama : Muhammad Adib Firmansyah
Kelas : SE-05-02
Nim : 1201220012

Exercise 3.2
Algoritma struktural adalah metode untuk menggambar garis dengan menentukan
pola berulang langkah horizontal (H) dan diagonal (D). Algoritma ini lebih efisien dan akurat
dibandingkan algoritma tradisional seperti algoritma garis lurus DDA dan Bresenham.
Langkah-langkah untuk menggambar garis menggunakan algoritma struktural yang
dijelaskan pada bagian 3.3 dan 3.6 adalah sebagai berikut:
Langkah-langkah:
1. Tentukan Titik Awal dan Akhir:
Identifikasikan koordinat x dan y untuk kedua titik, yaitu (x0, y0) sebagai titik awal dan (x1,
y1) sebagai titik akhir.
2. Hitung Perbedaan Koordinat:
Temukan selisih nilai x dan y antara kedua titik:
dx = x1 - x0 (perbedaan horizontal)
dy = y1 - y0 (perbedaan vertikal)
3. Hitung Kemiringan Garis:
Bagi selisih vertikal dengan selisih horizontal untuk mendapatkan nilai kemiringan (m):
m = dy / dx
4. Hitung Nilai b:
Gunakan persamaan garis y = mx + b untuk menghitung nilai b, di mana:
m adalah kemiringan yang dihitung pada langkah 3
x dan y adalah koordinat titik awal (x0, y0)
Susun ulang persamaan menjadi:
b = y0 - mx0
5. Gambar Garis:
Mulai dari titik awal (x0, y0):
Hitung decision variable (D) menggunakan midpoint algorithm:
D = dy - (2 * dx * (y - y0))
Pilih piksel berikutnya berdasarkan nilai D:
D > 0: Pilih piksel di atas dan sebelah kanan.
D < 0: Pilih piksel di bawah dan sebelah kanan.
D = 0: Pilih piksel di sebelah kanan.
Perbarui posisi piksel (x, y) dan nilai D:
x += 1
D += dy
Ulangi langkah 5.2 dan 5.3 hingga mencapai titik akhir (x1, y1).
Kesimpulan:
Algoritma struktural menggambar garis dengan menghitung dx, dy, dan kemiringan
garis. Kemudian, persamaan garis digunakan untuk memilih piksel berikutnya berdasarkan
nilai decision variable. Algoritma ini menggunakan operasi bilangan bulat dan menghindari
floating point arithmetic untuk efisiensi komputasi.

Exercise 3.3
<img width="959" alt="Exercise3 3" src="https://github.com/adibfirmannn/Tugas2-Grafkom-MuhammmadAdibFirmansyah/assets/62836231/fea762c0-199b-496c-83df-d781b4fb08ac">
