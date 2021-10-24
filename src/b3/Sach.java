/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

/**
 *
 * @author KeyBin
 */
public class Sach extends TaiLieu{
    private String tacgia,tensach;
    private int sotrang;


    public Sach( String ma, String nhaxuatban, int soban,String tacgia, String tensach, int sotrang) {
        super(ma, nhaxuatban, soban);
        this.tacgia = tacgia;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }
    
    
    
    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
    public String toString(){
        return super.getMa()+"\t"+super.getNhaxuatban()+"\t"+String.valueOf(super.getSoban())+
                "\t"+tacgia+"\t"+tensach+"\t"+sotrang;
    }
}
