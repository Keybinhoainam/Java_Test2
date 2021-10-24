/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

/**
 *
 * @author KeyBin
 */
public class TaiLieu {
    private String ma,nhaxuatban;
    private int soban;

    public TaiLieu() {
    }
    
    public TaiLieu(String ma, String nhaxuatban, int soban) {
        this.ma = ma;
        this.nhaxuatban = nhaxuatban;
        this.soban = soban;
    }
    
    
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public int getSoban() {
        return soban;
    }

    public void setSoban(int soban) {
        this.soban = soban;
    }
    
}
