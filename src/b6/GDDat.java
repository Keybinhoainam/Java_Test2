/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6;

/**
 *
 * @author KeyBin
 */
public class GDDat extends GiaoDich implements Thanhtien{
    private int loaidat;// 1 (200),2 (400),3 (800)

    public GDDat(String ma, String ngaygd, double dongia, int soluong,int loaidat) {
        super(ma, ngaygd, dongia, soluong);
        this.loaidat = loaidat;
    }

    public int getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(int loaidat) {
        this.loaidat = loaidat;
    }
    
    public double getThanhtien() {
        if(loaidat==1 )return super.getDongia()*super.getSoluong()*200;
        if(loaidat==2 )return super.getDongia()*super.getSoluong()*400;
        return super.getDongia()*super.getSoluong()*800;
    }

    
    public String toString(){
        return super.getMa()+" \t "+super.getNgaygd()+" \t "+super.getDongia()+" \t "+
                super.getSoluong()+" \t "+loaidat;
    }
    
}
