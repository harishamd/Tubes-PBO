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
public class Nilaipendaftar {
    private String id_ijazah;
    private int nilai_mtk;
    private int nilai_indo;
    private int nilai_ipa;
    private int nilai_tot;
    private boolean ceklulus;

    public Nilaipendaftar(String id_ijazah, int nilai_mtk, int nilai_indo, int nilai_ipa, int nilai_tot, boolean ceklulus) {
        this.id_ijazah = id_ijazah;
        this.nilai_mtk = nilai_mtk;
        this.nilai_indo = nilai_indo;
        this.nilai_ipa = nilai_ipa;
        this.nilai_tot = nilai_tot;
        this.ceklulus = ceklulus;
    }

    public String getId_ijazah() {
        return id_ijazah;
    }

    public void setId_ijazah(String id_ijazah) {
        this.id_ijazah = id_ijazah;
    }

    public int getNilai_mtk() {
        return nilai_mtk;
    }

    public void setNilai_mtk(int nilai_mtk) {
        this.nilai_mtk = nilai_mtk;
    }

    public int getNilai_indo() {
        return nilai_indo;
    }

    public void setNilai_indo(int nilai_indo) {
        this.nilai_indo = nilai_indo;
    }

    public int getNilai_ipa() {
        return nilai_ipa;
    }

    public void setNilai_ipa(int nilai_ipa) {
        this.nilai_ipa = nilai_ipa;
    }

    public int getNilai_tot() { 
        return nilai_tot;
    }

    public void setNilai_tot(int nilai_tot) {
         this.nilai_tot = (getNilai_ipa()+getNilai_indo()+getNilai_mtk())/3;
    }

    public void setCeklulus(boolean ceklulus) {
        ceklulus = false;
        if (getNilai_tot() >= 75){
            ceklulus = true;
        }
        else {
        }
    }
    public void cetaklulus (String cetaklulus){
        if (ceklulus == true){
            System.out.println("SELAMAT ANDA LULUS SILAHKAN MELANJUT KETAHAP SELANJUTNYA");
        }else {
            System.out.println("MAAF ANDA TIDAK DITERIMA");
        }
    
    
    }
    
}
