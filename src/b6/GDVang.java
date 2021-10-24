/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6;

/**
 *
 * @author KeyBin
 */
public class GDVang extends GiaoDich implements Thanhtien{
    String loaivang;

    public GDVang( String ma, String ngaygd, double dongia, int soluong,String loaivang) {
        super(ma, ngaygd, dongia, soluong);
        this.loaivang = loaivang;
    }

    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }
    
    
    public double getThanhtien() {
        return super.getDongia()*super.getSoluong();
    }

    
    public String toString(){
        return super.getMa()+" \t "+super.getNgaygd()+" \t "+super.getDongia()+" \t "+
                super.getSoluong()+" \t "+loaivang;
    }
    
}
