package Lanjutan;
import java.util.Scanner;
public class MainSalon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==========SELAMAT DATANG DI SALON SEMLOHE===========");
        boolean ulang = false;
        salon a;
        System.out.print("Nama    : ");
        String nama = in.nextLine();
        System.out.println("Jenis-jenis Member :\n1. Premium\n2. Silver\n3. Gold\n4. Non Member ");
        System.out.print("Masukkan jenis Member : ");
        int member = in.nextInt();
        if (member == 1) {
            a = new premium(nama);
            do {
                a.JenisPerawatan();
                a.JenisProduk();
                System.out.println("Apakah Anda ingin perawatan lagi? ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan: ");
                int pil = in.nextInt();
                if (pil == 1) {
                    ulang = true;
                } else if (pil == 2) {
                    System.out.println("===============================================");
                    System.out.println("Nama                : " + a.getNama());
                    System.out.println("Jenis Anggota       : " + "Premium");
                    System.out.println("Harga Perawatan     : Rp " + a.getHPerawatan());
                    System.out.println("Harga Produksi      : Rp " + a.getHProduk());
                    System.out.println("================================================");
                    a.akhir();
                    System.out.println("==================TERIMAKASIH===================");
                    System.out.println("");
                    System.out.println("=============SAMPAI JUMPA KEMBALI===============");
                    break;
                }
            } while (ulang == true);
        } else if (member == 2) {
            a = new silver(nama);
            do {
                a.JenisPerawatan();
                a.JenisProduk();
                System.out.println("Apakah anda ingin perawatan lagi? ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan: ");
                int pil = in.nextInt();
                if (pil == 1) {
                    ulang = true;
                } else if (pil == 2) {
                    System.out.println("=================================================");
                    System.out.println("Nama                : " + a.getNama());
                    System.out.println("Jenis Anggota       : " + "Silver");
                    System.out.println("Harga Perawatan     : Rp " + a.getHPerawatan());
                    System.out.println("Harga Produksi      : Rp " + a.getHProduk());
                    System.out.println("================================================");
                    a.akhir();
                    System.out.println("==================TERIMAKASIH===================");
                    System.out.println("");
                    System.out.println("======SEMOGA ANDA PUAS DENGAN LAYANAN KAMI======");
                    break;
                }
            } while (ulang == true);
        } else if (member == 3) {
            a = new gold(nama);
            do {
                a.JenisPerawatan();
                a.JenisProduk();
                System.out.println("Apakah anda ingin perawatan lagi? ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan: ");
                int pil = in.nextInt();
                if (pil == 1) {
                    ulang = true;
                } else if (pil == 2) {
                    System.out.println("=================================================");
                    System.out.println("Nama                : " + a.getNama());
                    System.out.println("Jenis Anggota       : " + "Gold");
                    System.out.println("Harga Perawatan     : Rp " + a.getHPerawatan());
                    System.out.println("Harga Produksi      : Rp " + a.getHProduk());
                    System.out.println("================================================");
                    a.akhir();
                    System.out.println("==================TERIMAKASIH===================");
                    System.out.println("======SEMOGA ANDA PUAS DENGAN LAYANAN KAMI======");
                    break;
                }
            } while (ulang == true);
        } else if (member == 4) {
            a = new NonMember(nama);
            do {
                a.getHPerawatan();
                a.getHProduk();
                System.out.println("Apakah anda ingin perawatan lagi? ");
                System.out.println("1. Ya");
                System.out.println("2. Tidak");
                System.out.print("Masukkan pilihan: ");
                int pil = in.nextInt();
                if (pil == 1) {
                    ulang = true;
                } else if (pil == 2) {
                    System.out.println("=================================================");
                    System.out.println("Nama                : " + a.getNama());
                    System.out.println("Jenis Anggota       : " + "Non Member");
                    System.out.println("Harga Perawatan     : Rp " + a.getHPerawatan());
                    System.out.println("Harga Produksi      : Rp " + a.getHProduk());
                    System.out.println("================================================");
                    a.akhir();
                    System.out.println("==================TERIMAKASIH===================");
                    System.out.println("======SEMOGA ANDA PUAS DENGAN LAYANAN KAMI======");
                    break;
                }
            } while (ulang == true);
        }
    }
}