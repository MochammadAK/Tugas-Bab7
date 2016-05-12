package Lanjutan;import java.util.Scanner;
public abstract class salon {
    Scanner in = new Scanner (System.in);
    private String nama;
    protected double HPerawatan;
    public double HProduk;
    public double HTotal;
        
    public salon(String nama){
        this.nama=nama;
    }
    public void setNama(String N){
        nama=N;
    }
    public String getNama(){
        return nama;
    }

    public void setHPerawatan(double perawatan){
        HPerawatan=perawatan;
    }
    public double getHPerawatan(){
        return HPerawatan;
    }
    public void setHProduk(double produk){
        HProduk=produk;
    }
    public double getHProduk(){
        return HProduk;   
    }
    public void JenisProduk(){
        System.out.println("Jenis-jenis Produk : ");
        System.out.println("1. Shampo");
        System.out.println("2. Masker");
        System.out.println("3. Body Scrub");
        System.out.println("4. Vitamin Rambut");
        System.out.println("5. Cream");
        System.out.print("Jenis Produk yang Anda inginkan : ");
        int pilih = in.nextInt();
        if (pilih == 1) {
            HProduk = HProduk + 35000;
        } else if (pilih == 2) {
            HProduk = HProduk + 40000;
        } else if (pilih == 3) {
            HProduk = HProduk + 60000;
        } else if (pilih == 4) {
            HProduk = HProduk + 30000;
        } else if (pilih == 5) {
            HProduk = HProduk + 50000;
        }
    }
    public void JenisPerawatan(){
        System.out.println("Jenis-jenis Perawatan : ");
        System.out.println("1. Potong Rambut dan Creambath");
        System.out.println("2. Lulur");
        System.out.println("3. Facial");
        System.out.print("Jenis Perawatan yang Anda Inginkan  : ");
        int pilih = in.nextInt();
        switch (pilih) {
            case 1:
                HPerawatan = HPerawatan + 80000;
                break;
            case 2:
                HPerawatan = HPerawatan + 150000;
                break;
            case 3:
                HPerawatan = HPerawatan + 200000;
                break;
        }    
    }    
    public double getHTotal(){
        return HTotal;
    }
    public abstract void akhir();
    }
