/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4;

/**
 *
 * @author KeyBin
 */
public class GiangVien {
    private String ma,hoten;
    private int hocvi;
    private double tienlinh;

    public GiangVien() {
    }
    
    public GiangVien(String ma, String hoten, int hocvi) {
        this.ma = ma;
        this.hoten = hoten;
        this.hocvi = hocvi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getHocvi() {
        return hocvi;
    }

    public void setHocvi(int hocvi) {
        this.hocvi = hocvi;
    }

    public double getTienlinh() {
        return tienlinh;
    }

    public void setTienlinh(Double tienlinh) {
        this.tienlinh = tienlinh;
    }
    
}
