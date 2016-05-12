package Lanjutan;
public class silver extends salon {
    public silver(String nama) {
        super(nama);
    }
    @Override
    public double getHPerawatan() {
        return HPerawatan;
    }
    @Override
    public double getHProduk() {
        return HProduk;
    }
    public void JenisProduk() {
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
    public void JenisPerawatan() {
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
    @Override
    public double getHTotal() {
        return HTotal = (HPerawatan - (HPerawatan * 0.1)) + (HProduk - (HProduk * 0.1));
    }
    @Override
    public void akhir() {
        System.out.println("Harga Total : Rp. " + getHTotal());
    }
}
