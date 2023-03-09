
package model;

import java.io.Serializable;


public class Kythuatvien implements Serializable {
    private int id;
    private String ten_KTV;
    private String email;
    private String password;

    public Kythuatvien() {
    }

    public Kythuatvien(int id, String ten_KTV, String email, String password) {
        this.id = id;
        this.ten_KTV = ten_KTV;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen_KTV() {
        return ten_KTV;
    }

    public void setTen_KTV(String ten_KTV) {
        this.ten_KTV = ten_KTV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Kythuatvien{" + "id=" + id + ", ten_KTV=" + ten_KTV + ", email=" + email + ", password=" + password + '}';
    }
    
    
    
}
