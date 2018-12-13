package com.example.asus.myapplication;

public class Resep {
    private String nama_makanan;
    private  String harga;
    private  String tipe;
    private String deskripsi;
    private int gambar;


    public static final Resep[] resepmakanan= {
            new Resep("PROMO HARI IBU", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 15.000.00", "Tersedia Tipe Pilihan : G, TRD", R.drawable.promo1),
            new Resep("PROMO HARI AYAH", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 20.000.00", "Tersedia Tipe Pilihan : X, G, Q", R.drawable.promo2),
            new Resep("PROMO HARI PAHLAWAN", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 10.000.00", "Tersedia Tipe Pilihan : S, E, G", R.drawable.promo3),
            new Resep("PROMO HARI PANCASILA", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 25.000.00", "Tersedia Tipe Pilihan : E, G", R.drawable.promo4),
            new Resep("PROMO VALENTINE", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 30.000.00", "Tersedia Tipe Pilihan : G, V", R.drawable.promo5),
            new Resep("PROMO LEBARAN", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 40.000.00", "Tersedia Tipe Pilihan : G, V", R.drawable.promo6),
            new Resep("PROMO NATAL", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 35.000.00", "Tersedia Tipe Pilihan : G, VRZ, SRZ, TRD", R.drawable.promo7 ),
            new Resep("PROMO 212", "*OTR Jabodetabek, Harga Bisa Berubah Sewaktu-Waktu Tanpa Pemberitahuan Terlebih Dahulu",
                    "Start From 50.000.00", "Tersedia Tipe Pilihan : Veloz Matic, Veloz Manual", R.drawable.promo8),

    };

    private Resep(String name,String description, String harga, String tipe, int gambar){
        this.nama_makanan = name;
        this.deskripsi= description;
        this.harga=harga;
        this.tipe=tipe;
        this.gambar=gambar;
    }
    public int getGambar() {
        return gambar;
    }
    public String getDescription() {
        return deskripsi;
    }
    public String getHarga() {
        return harga;
    }
    public String getTipe() {
        return tipe;
    }
    public String getName() {
        return nama_makanan;
    }
    public String toString() {
        return this.nama_makanan;
    }
}
