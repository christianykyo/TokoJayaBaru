package Challenge;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TokoJB1 {

    public static void main(String[] args) {

        System.out.println("===== SELAMAT DATANG DI TOKO SEPATU JAYABARU =====");
        Scanner moiing = new Scanner(System.in);
        System.out.print("Nama pembeli : ");
        String a = moiing.nextLine();
        Scanner chris = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();

        System.out.println("\nSilahkan pilih merk sepatu yang tersedia");
        TokoJB1.merk("");
        System.out.println("Masukkan pilihan anda: ");
        int jawab = chris.nextInt();
        if (jawab == 1) {

            System.out.println("\nPilih size yang tersedia");
            TokoJB1.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = chris.nextInt();

            System.out.println("\nPilih warna yang anda inginkan");
            TokoJB1.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = chris.nextInt();

            System.out.println("\nPilih jenis sepatu");
            TokoJB1.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = chris.nextInt();

            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            TokoJB1.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = chris.nextInt();

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = chris.nextInt();
            int harga = 900000 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
            System.out.println("Nama Pembeli : " + a);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");

        } else if (jawab == 2) {

            System.out.println("\nPilih size yang tersedia");
            TokoJB1.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = chris.nextInt();

            System.out.println("\nPilih warna yang anda inginkan");
            TokoJB1.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = chris.nextInt();

            System.out.println("\nPilih jenis sepatu");
            TokoJB1.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = chris.nextInt();

            Scanner y = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            TokoJB1.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = chris.nextInt();

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = chris.nextInt();
            int harga = 0 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
            System.out.println("Nama Pembeli : " + a);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");

        } else if (jawab == 3) {
            System.out.println("\nPilih size yang tersedia");
            TokoJB1.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = chris.nextInt();

            System.out.println("\nPilih warna yang anda inginkan");
            TokoJB1.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = chris.nextInt();

            System.out.println("\nPilih jenis sepatu");
            TokoJB1.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = chris.nextInt();

            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            TokoJB1.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = chris.nextInt();

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = chris.nextInt();
            int harga = 700000 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
            System.out.println("Nama Pembeli : " + a);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 4) {
            System.out.println("\nPilih size yang tersedia");
            TokoJB1.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = chris.nextInt();

            System.out.println("\nPilih warna yang anda inginkan");
            TokoJB1.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = chris.nextInt();

            System.out.println("\nPilih jenis sepatu");
            TokoJB1.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = chris.nextInt();

            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            TokoJB1.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = chris.nextInt();

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = chris.nextInt();
            int harga = 700000 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
            System.out.println("Nama Pembeli : " + a);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 5) {
            System.out.println("\nPilih size yang tersedia");
            TokoJB1.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = chris.nextInt();

            System.out.println("\nPilih warna yang anda inginkan");
            TokoJB1.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = chris.nextInt();

            System.out.println("\nPilih jenis sepatu");
            TokoJB1.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = chris.nextInt();

            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            TokoJB1.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = chris.nextInt();

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = chris.nextInt();
            int harga = 500000 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
            System.out.println("Nama Pembeli : " + a);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 6) {
            System.out.println("\nPilih size yang tersedia");
            TokoJB1.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = chris.nextInt();

            System.out.println("\nPilih warna yang anda inginkan");
            TokoJB1.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = chris.nextInt();

            System.out.println("\nPilih jenis sepatu");
            TokoJB1.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = chris.nextInt();

            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            TokoJB1.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = chris.nextInt();

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = chris.nextInt();
            int harga = 200000 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
            System.out.println("Nama Pembeli : " + a);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 7) {
            System.out.println("\nPilih size yang tersedia");
            TokoJB1.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = chris.nextInt();

            System.out.println("\nPilih warna yang anda inginkan");
            TokoJB1.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = chris.nextInt();

            System.out.println("\nPilih jenis sepatu");
            TokoJB1.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = chris.nextInt();

            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            TokoJB1.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = chris.nextInt();

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = chris.nextInt();
            int harga = 300000 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
            System.out.println("Nama Pembeli : " + a);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 8) {
            System.out.println("\nPilih size yang tersedia");
            TokoJB1.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = chris.nextInt();

            System.out.println("\nPilih warna yang anda inginkan");
            TokoJB1.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = chris.nextInt();

            System.out.println("\nPilih jenis sepatu");
            TokoJB1.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = chris.nextInt();

            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            TokoJB1.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = chris.nextInt();

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = chris.nextInt();
            int harga = 200000 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
            System.out.println("Nama Pembeli : " + a);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 9) {
            System.out.println("\nPilih size yang tersedia");
            TokoJB1.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = chris.nextInt();

            System.out.println("\nPilih warna yang anda inginkan");
            TokoJB1.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = chris.nextInt();

            System.out.println("\nPilih jenis sepatu");
            TokoJB1.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = chris.nextInt();

            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            TokoJB1.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = chris.nextInt();

            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = chris.nextInt();
            int harga = 800000 * jumlahbarang;
            System.out.println("===== KASIR TOKO SEPATU JAYABARU ===== ");
            System.out.println("Nama Pembeli : " + a);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        }

    }

    private static void merk(String string) {
        System.out.println("[1]Adidas\n[2]Nike\n[3]Skechers\n[4]Puma\n[5]Reebok\n[6]Vans\n[7]Converse\n[8]Fila\n[9]910");

    }

    private static void size(String string) {
        System.out.println("25\t26\t27\t28\t29\t30\t31\t32\t33\t34");
    }

    private static void warna(String string) {
        System.out.println("[1]Black\n[2]White\n[3]Gold\n[4]Silver\n[5]Orange\n[6]Green\n[7]Yellow\n[8]Blue\n[9]Red");
    }

    private static void jenis(String string) {
        System.out.println("[1]Laki-laki\n[2]Perempuan");
    }

    private static void kategori(String string) {
        System.out.println("[1]Olahraga\n[2]Lari\n[3]Santai\n[4]Kantoran");

    }
}