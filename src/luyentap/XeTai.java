/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap;

/**
 *
 * @author KeyBin
 */
public class XeTai extends PTGT implements IHangXe {
    
    private int taitrong;
    private boolean thungxe;

    public XeTai() {
    }

    public XeTai( String sokhung, String hang, String ngaylanbanh, double gia,
            int taitrong, boolean thungxe) {
        super(sokhung, hang, ngaylanbanh, gia);
        this.taitrong = taitrong;
        this.thungxe = thungxe;
    }

    public int getTaitrong() {
        return taitrong;
    }

    public void setTaitrong(int taitrong) {
        this.taitrong = taitrong;
    }

    public boolean isThungxe() {
        return thungxe;
    }

    public void setThungxe(boolean thungxe) {
        this.thungxe = thungxe;
    }

    
    
    public String getHang()
    {
        String tmp="TAI"+super.getHang().toUpperCase();
        return tmp;
    }
    public String toString(){
        return super.getSokhung()+"\t"+getHang()+"\t"+super.getGia()+
                "\t"+getTaitrong()+"\t"+isThungxe();
    }
    
}
