/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

/**
 *
 * @author KeyBin
 */
public class Bao extends TaiLieu{
    private String ngayphathanh;

    public Bao( String ma, String nhaxuatban, int soban,String ngayphathanh) {
        super(ma, nhaxuatban, soban);
        this.ngayphathanh = ngayphathanh;
    }
    
    public String getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(String ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }
    public String toString(){
        return super.getMa()+"\t"+super.getNhaxuatban()+"\t"+String.valueOf(super.getSoban())+
                "\t"+ngayphathanh;
    }
}
