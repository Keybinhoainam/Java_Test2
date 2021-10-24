/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author KeyBin
 */
public class QLGD implements IChucNang{

    private List<GiangVien>list; 
    private Scanner in=new Scanner(System.in);
    public QLGD() {
        list=new ArrayList<>();
        list.add(new GVCoHuu("CH1", "Nguyen Van Thuy", 1, 200));
        list.add(new GVCoHuu("CH2", "Tran Van Cuong", 2, 210));
        list.add(new GVTGiang("TG3", "Vu Thi Lan Anh", 3, 230));
        list.add(new GVTGiang("TG4", "Pham Ngoc Lan", 2, 240));
    }
    
    private int tontai(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma))
                return i;
        }
        return -1;
    }
    private GiangVien nhap(){
        
        String ma;
        while(true){
            System.out.print("ma:");
            ma=in.nextLine().toUpperCase();
            if( tontai(ma)==-1)
                break;
            System.err.println("nhap lai!!");
        }
        System.out.print("ho ten:");
        String hoten =in.nextLine();
        System.out.print("hoc vi:");
        int hocvi =Integer.parseInt(in.nextLine());
        return new GiangVien(ma,hoten,hocvi);
        
    }    
    @Override
    public void nhapGVCH() {
        GiangVien gv=nhap();
        System.out.print("so gio dinh muc:");
        int gioDM =Integer.parseInt(in.nextLine());
        list.add(new GVCoHuu(gv.getMa(),gv.getHoten(),
                gv.getHocvi(),gioDM));
    }

    @Override
    public void nhapGVTG() {
        GiangVien gv=nhap();
        System.out.print("gio giang day:");
        int gioGD =Integer.parseInt(in.nextLine());
        list.add(new GVCoHuu(gv.getMa(),gv.getHoten(),
                gv.getHocvi(),gioGD));
    }

    @Override
    public void lietke() {
        System.out.println("DS giang vien Co huu");
        for(GiangVien i: list){
            if(i instanceof GVCoHuu){
                System.out.println(i);
            }
        }
        System.out.println("DS giang vien tro giang");
        for(GiangVien i: list){
            if(i instanceof GVTGiang){
                System.out.println(i);
            }
        }
        System.out.printf("Ds co %d giang vien\n",list.size());
    }

    @Override
    public void sxtheotienlinhgiamdan() {
        Collections.sort(list,new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien gv0, GiangVien gv1) {
                return Double.compare(gv1.getTienlinh(), gv0.getTienlinh());
            }
        });
    }
    private int tontai2(String ma){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMa().equalsIgnoreCase(ma) && (list.get(i) instanceof GVTGiang))
                return i;
        }
        return -1;
    }
    @Override
    public void xoa() {
        String ma;
        System.out.print("ma:");
            ma=in.nextLine().toUpperCase();
            int vt=tontai2(ma);
            if( vt!=-1){
                list.remove(vt);
                System.out.println("Xoa Thanh Cong");
            }
                
            else System.err.println("khong co trong DS thinh giang!!!");
    }
    
    @Override
    public void tongtientheohocvi() {
        Map<Integer,Double> m=list.stream().collect(Collectors.groupingBy( 
                GiangVien::getHocvi,Collectors.summingDouble(GiangVien::getTienlinh)));
        Iterator i=m.keySet().iterator();
        while(i.hasNext()){
            Integer key=(Integer)i.next();
            System.out.println(key);
            System.out.println(m.get(key));
        }
    }
    
}
