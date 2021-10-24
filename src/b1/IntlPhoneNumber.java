/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1;

import java.math.BigInteger;

/**
 *
 * @author KeyBin
 */
public class IntlPhoneNumber extends PhoneNumber{
    private String maquocgia;

    public IntlPhoneNumber(String maquocgia, String mavung, String sdt) {
        super(mavung, sdt);
        this.maquocgia = maquocgia;
    }

    public String getMaquocgia() {
        return maquocgia;
    }

    public void setMaquocgia(String maquocgia) {
        this.maquocgia = maquocgia;
    }
    public String toString(){
        Integer mqg=Integer.parseInt(maquocgia);
        Integer sdt=Integer.parseInt(super.getSdt());
        Integer mv=Integer.parseInt(super.getMavung());
        String kq=String.valueOf(mqg)+" - "+String.valueOf(mv)+" - "+String.valueOf(sdt);
        return kq;
    }
    
}
