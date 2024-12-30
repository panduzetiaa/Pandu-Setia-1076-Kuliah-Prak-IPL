public class ValidasiPelanggan {

    public static void main(String[] args) {
        PermintaanKueriPelanggan permintaan = buatPermintaanContoh();

        try {
            validasiPermintaan(permintaan, 10, 10);
            System.out.println("Validasi berhasil");
        } catch (BusinessException e) {
            System.out.println("Validasi gagal: " + e.getMessage());
        }
    }

    private static PermintaanKueriPelanggan buatPermintaanContoh() {
        PermintaanKueriPelanggan permintaan = new PermintaanKueriPelanggan();
        permintaan.setPelanggan(new Pelanggan("123456"));
        permintaan.setProdukPelanggan(new ProdukPelanggan("654321"));
        return permintaan;
    }

    private static void validasiPermintaan(PermintaanKueriPelanggan permintaan, int panjangIDPelanggan, int panjangNomorProduk) {
        // 1. Check both parameters are not null and not empty strings
        cekPermintaanKueriTidakNullAtauKosong(permintaan);
        // 2. Check both parameters aren't populated
        cekPermintaanKueriNullAtauKosong(permintaan);
        // 3. Check CustomerID for field length and pad the parameter
        cekIDPelangganValid(permintaan, panjangIDPelanggan);
        // 4. Check ProductNumber for field length and pad the parameter
        cekNomorProdukValid(permintaan, panjangNomorProduk);
    }

    private static void cekPermintaanKueriTidakNullAtauKosong(PermintaanKueriPelanggan permintaan) {
        if (!isNullOrEmpty(permintaan.getProdukPelanggan().getNomorProduk()) &&
                !isNullOrEmpty(permintaan.getPelanggan().getIDPelanggan())) {
            throw new BusinessException(HandledErrors.PESAN_KEDUA_PARAMETER_TIDAK_VALID);
        }
    }

    private static void cekPermintaanKueriNullAtauKosong(PermintaanKueriPelanggan permintaan) {
        if (isNullOrEmpty(permintaan.getPelanggan().getIDPelanggan()) &&
                isNullOrEmpty(permintaan.getProdukPelanggan().getNomorProduk())) {
            throw new BusinessException(HandledErrors.PESAN_BIDANG_KOSONG);
        }
    }

    private static void cekIDPelangganValid(PermintaanKueriPelanggan permintaan, int panjangIDPelanggan) {
        if (!isNullOrEmpty(permintaan.getPelanggan().getIDPelanggan()) &&
                permintaan.getPelanggan().getIDPelanggan().length() > panjangIDPelanggan) {
            throw new BusinessException(HandledErrors.PESAN_PANJANG_ID_PELANGGAN_TIDAK_VALID);
        }
        permintaan.getPelanggan().setIDPelanggan(padField(permintaan.getPelanggan().getIDPelanggan(), panjangIDPelanggan));
    }

    private static void cekNomorProdukValid(PermintaanKueriPelanggan permintaan, int panjangNomorProduk) {
        if (!isNullOrEmpty(permintaan.getProdukPelanggan().getNomorProduk()) &&
                permintaan.getProdukPelanggan().getNomorProduk().length() > panjangNomorProduk) {
            throw new BusinessException(HandledErrors.PESAN_PANJANG_NOMOR_PRODUK_TIDAK_VALID);
        }
        permintaan.getProdukPelanggan().setNomorProduk(padField(permintaan.getProdukPelanggan().getNomorProduk(), panjangNomorProduk));
    }

    private static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private static String padField(String field, int length) {
        return String.format("%1$" + length + "s", field).replace(' ', '0');
    }
}

class PermintaanKueriPelanggan {
    private Pelanggan pelanggan;
    private ProdukPelanggan produkPelanggan;

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public ProdukPelanggan getProdukPelanggan() {
        return produkPelanggan;
    }

    public void setProdukPelanggan(ProdukPelanggan produkPelanggan) {
        this.produkPelanggan = produkPelanggan;
    }
}

class Pelanggan {
    private String idPelanggan;

    public Pelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getIDPelanggan() {
        return idPelanggan;
    }

    public void setIDPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
}

class ProdukPelanggan {
    private String nomorProduk;

    public ProdukPelanggan(String nomorProduk) {
        this.nomorProduk = nomorProduk;
    }

    public String getNomorProduk() {
        return nomorProduk;
    }

    public void setNomorProduk(String nomorProduk) {
        this.nomorProduk = nomorProduk;
    }
}

class BusinessException extends RuntimeException {
    BusinessException(String message) {
        super(message);
    }
}

class HandledErrors {
    static final String PESAN_KEDUA_PARAMETER_TIDAK_VALID = "ID Pelanggan dan Nomor Produk tidak boleh keduanya terisi.";
    static final String PESAN_BIDANG_KOSONG = "ID Pelanggan dan Nomor Produk tidak boleh kosong keduanya.";
    static final String PESAN_PANJANG_ID_PELANGGAN_TIDAK_VALID = "Panjang ID Pelanggan tidak valid.";
    static final String PESAN_PANJANG_NOMOR_PRODUK_TIDAK_VALID = "Panjang Nomor Produk tidak valid.";
}
