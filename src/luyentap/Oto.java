/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap;

/**
 *
 * @author KeyBin
 */
public class Oto extends PTGT implements IHangXe {
    private int socho,tocdomax;

    public Oto() {
    }

    public Oto(String sokhung, String hang, String ngaylanbanh, double gia,
    int socho, int tocdomax) {
        super(sokhung, hang, ngaylanbanh, gia);
        this.socho = socho;
        this.tocdomax = tocdomax;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    public int getTocdomax() {
        return tocdomax;
    }

    public void setTocdomax(int tocdomax) {
        this.tocdomax = tocdomax;
    }
    
    public String getHang()
    {
        String tmp="OTO"+super.getHang().toUpperCase();
        return tmp;
    }
    public String toString(){
        return super.getSokhung()+"\t"+getHang()+"\t"+super.getGia()+
                "\t"+getSocho()+"\t"+getTocdomax();
    }
    
    
}
