/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6;

/**
 *
 * @author KeyBin
 */
public class GDTienTe extends GiaoDich implements Thanhtien{
    private double tigia;
    private int loaitien;//1-tien Viet Nam; 2-tien USD; 3-tien Euro

    public GDTienTe( String ma, String ngaygd, double dongia, int soluong,double tigia, int loaitien) {
        super(ma, ngaygd, dongia, soluong);
        this.tigia = tigia;
        this.loaitien = loaitien;
    }
    
    public double getTigia() {
        return tigia;
    }

    public void setTigia(double tigia) {
        this.tigia = tigia;
    }

    public int getLoaitien() {
        return loaitien;
    }

    public void setLoaitien(int loaitien) {
        this.loaitien = loaitien;
    }
    
    
    public double getThanhtien() {
        if(loaitien==1 )return super.getDongia()*super.getSoluong();
        return super.getDongia()*super.getSoluong()*tigia;
    }

    
    public String toString(){
        return super.getMa()+" \t "+super.getNgaygd()+" \t "+super.getDongia()+" \t "+
                super.getSoluong()+" \t "+tigia+" \t "+loaitien;
    }
}
