/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4;

/**
 *
 * @author KeyBin
 */
public class GVCoHuu extends GiangVien implements ITinhLuong{

    private int giodinhmuc;
    @Override
    public double getTienlinh() {
        double hv=1;
        if(super.getHocvi()==1)hv=1;
        if(super.getHocvi()==2)hv=1.2;
        if(super.getHocvi()==3)hv=1.5;
        return giodinhmuc*hv*140;
    }
    public GVCoHuu( String ma, String hoten, int hocvi,int giodinhmuc) {
        super(ma, hoten, hocvi);
        this.giodinhmuc = giodinhmuc;
        
    }

    public double getGiodinhmuc() {
        return giodinhmuc;
    }

    public void setGiodinhmuc(int giodinhmuc) {
        this.giodinhmuc = giodinhmuc;
    }
    
    
    public String toString(){
        return super.getMa()+" \t "+super.getHoten()+" \t "+String.valueOf(super.getHocvi())+" \t "+
                String.valueOf(getTienlinh())+" \t "+String.valueOf(giodinhmuc);
    }
    
}
