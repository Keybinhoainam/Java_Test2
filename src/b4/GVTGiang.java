/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4;

/**
 *
 * @author KeyBin
 */
public class GVTGiang extends GiangVien implements ITinhLuong{
    private int giogiangday;

    @Override
    public double getTienlinh() {
        double hv=1;
        if(super.getHocvi()==1)hv=1;
        if(super.getHocvi()==2)hv=1.2;
        if(super.getHocvi()==3)hv=1.5;
       return giogiangday*hv*160;
    }
    public GVTGiang( String ma, String hoten, int hocvi, int giogiangday) {
        super(ma, hoten, hocvi);
        this.giogiangday = giogiangday;
        
    }

    public double getGiogiangday() {
        return giogiangday;
    }

    public void setGiogiangday(int giogiangday) {
        this.giogiangday = giogiangday;
    }
    
   
    public String toString(){
        return super.getMa()+" \t "+super.getHoten()+" \t "+String.valueOf(super.getHocvi())+" \t "+
                String.valueOf(getTienlinh())+" \t "+String.valueOf(giogiangday);
    }
    
}
