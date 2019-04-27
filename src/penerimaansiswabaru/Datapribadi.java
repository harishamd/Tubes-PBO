/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penerimaansiswabaru;


/**
 *
 * @author Hp
 */
public class Datapribadi extends Dokumenuser {
    private String no_pendaftar;
    private String nama_lengkap;
    private String NISN;
    private int tanggal_lahir;
    private String Jenis_kelamin;
    private String alamat;
    private String agama;
    private String asal_sekolah;
    private String id_orangtua;
    private String nama_ayah;
    private String nama_ibu;
    private String pekerjaan_ayah;
    private String pekerjaan_ibu;
    private String alamat_ayah;
    private String alamat_ibu;

    public Datapribadi(String no_pendaftar, String nama_lengkap, String NISN, int tanggal_lahir, String Jenis_kelamin, String alamat, String asal_sekolah, String id_orangtua, String nama_ayah, String nama_ibu, String pekerjaan_ayah, String pekerjaan_ibu, String alamat_ayah, String alamat_ibu) {
        this.no_pendaftar = no_pendaftar;
        this.nama_lengkap = nama_lengkap;
        this.NISN = NISN;
        this.tanggal_lahir = tanggal_lahir;
        this.Jenis_kelamin = Jenis_kelamin;
        this.alamat = alamat;
        this.asal_sekolah = asal_sekolah;
        this.id_orangtua = id_orangtua;
        this.nama_ayah = nama_ayah;
        this.nama_ibu = nama_ibu;
        this.pekerjaan_ayah = pekerjaan_ayah;
        this.pekerjaan_ibu = pekerjaan_ibu;
        this.alamat_ayah = alamat_ayah;
        this.alamat_ibu = alamat_ibu;
    }

    public String getNo_pendaftar() {
        return no_pendaftar;
    }

    public void setNo_pendaftar(String no_pendaftar) {
        this.no_pendaftar = no_pendaftar;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public int getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(int tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getJenis_kelamin() {
        return Jenis_kelamin;
    }

    public void setJenis_kelamin(String Jenis_kelamin) {
        this.Jenis_kelamin = Jenis_kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAsal_sekolah() {
        return asal_sekolah;
    }

    public void setAsal_sekolah(String asal_sekolah) {
        this.asal_sekolah = asal_sekolah;
    }

    public String getNISN() {
        return NISN;
    }

    public void setNISN(String NISN) {
        this.NISN = NISN;
    }

    public String getId_orangtua() {
        return id_orangtua;
    }

    public void setId_orangtua(String id_orangtua) {
        this.id_orangtua = id_orangtua;
    }

    public String getNama_ayah() {
        return nama_ayah;
    }

    public void setNama_ayah(String nama_ayah) {
        this.nama_ayah = nama_ayah;
    }

    public String getNama_ibu() {
        return nama_ibu;
    }

    public void setNama_ibu(String nama_ibu) {
        this.nama_ibu = nama_ibu;
    }

    public String getPekerjaan_ayah() {
        return pekerjaan_ayah;
    }

    public void setPekerjaan_ayah(String pekerjaan_ayah) {
        this.pekerjaan_ayah = pekerjaan_ayah;
    }

    public String getPekerjaan_ibu() {
        return pekerjaan_ibu;
    }

    public void setPekerjaan_ibu(String pekerjaan_ibu) {
        this.pekerjaan_ibu = pekerjaan_ibu;
    }

    public String getAlamat_ayah() {
        return alamat_ayah;
    }

    public void setAlamat_ayah(String alamat_ayah) {
        this.alamat_ayah = alamat_ayah;
    }

    public String getAlamat_ibu() {
        return alamat_ibu;
    }

    public void setAlamat_ibu(String alamat_ibu) {
        this.alamat_ibu = alamat_ibu;
    }
}
