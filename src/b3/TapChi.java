/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

/**
 *
 * @author KeyBin
 */
public class TapChi extends TaiLieu{
    private  int sophathanh;
    private String thangphathanh;

    public TapChi( String ma, String nhaxuatban, int soban,int sophathanh, String thangphathanh) {
        super(ma, nhaxuatban, soban);
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public String getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(String thangphathanh) {
        this.thangphathanh = thangphathanh;
    }
    
    public String toString(){
        return super.getMa()+"\t"+super.getNhaxuatban()+"\t"+String.valueOf(super.getSoban())+
                "\t"+sophathanh+"\t"+thangphathanh;
    }
    
    
    
}
