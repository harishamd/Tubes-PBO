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
import java.util.*;
public class User_Pendaftar {
    private String username;
    private String password;
    private String Iddaftar;
    Nilaipendaftar np;
    Dokumenuser du;

    public User_Pendaftar(String username, String password, String Iddaftar, Nilaipendaftar np, Dokumenuser du) {
        this.username = username;
        this.password = password;
        this.Iddaftar = Iddaftar;
        this.np = np;
        this.du = du;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIddaftar() {
        return Iddaftar;
    }

    public void setIddaftar(String Iddaftar) {
        this.Iddaftar = Iddaftar;
    }

    public Nilaipendaftar getNp() {
        return np;
    }

    public void setNp(Nilaipendaftar np) {
        this.np = np;
    }

    public Dokumenuser getDu() {
        return du;
    }

    public void setDu(Dokumenuser du) {
        this.du = du;
    }

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
