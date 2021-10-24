/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktr2;

import java.util.Calendar;

/**
 *
 * @author ADMIN
 */
public class XeMay extends PTGT implements TinhGia{
    private double congsuat;

    public XeMay() {
    }

    public XeMay(String ma, String hang, int nam, double gia, String mau,
            double congsuat) {
        super(ma, hang, nam, gia, mau);
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }
    public double getGia(){
        //if(2021-super.getNam()>2){
        Calendar c=Calendar.getInstance();//nam hien thoi
        int y=c.get(Calendar.YEAR);
        if(y-super.getNam()>2){
            return super.getGia()*0.95;
        }else
            return super.getGia();
    }
    public String toString(){
        return getMa()+"\t"+getHang()+"\t"+getNam()+"\t"+
                getMau()+"\t"+congsuat+"\t"+getGia();
    }
}
