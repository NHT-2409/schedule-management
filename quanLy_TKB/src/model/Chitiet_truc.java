package model;

import java.io.Serializable;

public class Chitiet_truc implements Serializable {

    public int id;
    public String hocky_Id;
    public String thu_Id;
    public String ca_Id;
    public String kythuatvien_Id;
    public String ghiChu;

    public Chitiet_truc() {
    }

    public Chitiet_truc(int id, String hocky_Id, String thu_Id, String ca_Id, String kythuatvien_Id, String ghiChu) {
        this.id = id;
        this.hocky_Id = hocky_Id;
        this.thu_Id = thu_Id;
        this.ca_Id = ca_Id;
        this.kythuatvien_Id = kythuatvien_Id;
        this.ghiChu = ghiChu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHocky_Id() {
        return hocky_Id;
    }

    public void setHocky_Id(String hocky_Id) {
        this.hocky_Id = hocky_Id;
    }

    public String getThu_Id() {
        return thu_Id;
    }

    public void setThu_Id(String thu_Id) {
        this.thu_Id = thu_Id;
    }

    public String getCa_Id() {
        return ca_Id;
    }

    public void setCa_Id(String ca_Id) {
        this.ca_Id = ca_Id;
    }

    public String getKythuatvien_Id() {
        return kythuatvien_Id;
    }

    public void setKythuatvien_Id(String kythuatvien_Id) {
        this.kythuatvien_Id = kythuatvien_Id;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public String toString() {
        return "Chitiet_truc{" + "id=" + id + ", hocky_Id=" + hocky_Id + ", thu_Id=" + thu_Id + ", ca_Id=" + ca_Id + ", kythuatvien_Id=" + kythuatvien_Id + ", ghiChu=" + ghiChu + '}';
    }

}
