/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6;

/**
 *
 * @author KeyBin
 */
public class GiaoDich {
//    (Mã giao dịch, ngày giao dịch 
//(ngày, tháng, năm), đơn giá, số lượng
    private String ma ,ngaygd;
    private double dongia,thanhtien;
    private int soluong;
    

    public GiaoDich(String ma, String ngaygd, double dongia, int soluong) {
        this.ma = ma;
        this.ngaygd = ngaygd;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgaygd() {
        return ngaygd;
    }

    public void setNgaygd(String ngaygd) {
        this.ngaygd = ngaygd;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
