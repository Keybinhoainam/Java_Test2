/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1;

/**
 *
 * @author KeyBin
 */
public class PhoneNumber {
    private String mavung,sdt;

    public PhoneNumber(String mavung, String sdt) {
        this.mavung = mavung;
        this.sdt = sdt;
    }
    
    public String getMavung() {
        return mavung;
    }

    public void setMavung(String mavung) {
        this.mavung = mavung;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String toString(){
        return mavung+" - "+sdt;
    }
    
    
}
