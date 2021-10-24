/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6;

import java.util.ArrayList;
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
    List<GiaoDich>list;
    private Scanner sc=new Scanner(System.in);
    public QLGD() {
        list=new ArrayList<>();
        list.add(new GDVang("V1","1/12/2009",20,200,"999"));
        list.add(new GDVang("V2","1/12/2009",21,250,"999"));
        list.add(new GDTienTe("T1","1/12/2009",20,200,1,1));
        list.add(new GDTienTe("T2","1/2/2009",25,270,2,2));
        list.add(new GDDat("D1","14/05/2007",20,200,1));
        list.add(new GDDat("D2","14/05/2007",20,200,3));
    }
    private int tontai(String ma){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma))return i;
        }
        return -1;
    }
    private GiaoDich nhap(){
        String ma;
        while(true){
            System.out.print("ma:");
            ma=sc.nextLine().toUpperCase();
            if( tontai(ma)==-1)
                break;
            System.err.println("nhap lai!!");
        }
        System.out.print("ngay GD:");
        String ngaygd =sc.nextLine();
        System.out.print("Don gia:");
        double dongia =Double.parseDouble(sc.nextLine());
        System.out.print("so luong:");
        int soluong =Integer.parseInt(sc.nextLine());
        return new GiaoDich(ma,ngaygd,dongia,soluong);
    }
    @Override
    public void themGDVang() {
        GiaoDich g=nhap();
        System.out.print("loai vang:");
        String loaivang =sc.nextLine();
        list.add(new GDVang(g.getMa(),g.getNgaygd(),g.getDongia(),
        g.getSoluong(),loaivang));
    }

    @Override
    public void themGDTiente() {
        GiaoDich g=nhap();
        System.out.print("ti gia:");
        double tigia =Double.parseDouble(sc.nextLine());
        System.out.print("loai tien te (1-tien Viet Nam; 2-tien USD; 3-tien Euro):");
        int loaitiente =Integer.parseInt(sc.nextLine());
        list.add(new GDTienTe(g.getMa(),g.getNgaygd(),g.getDongia(),
        g.getSoluong(),tigia,loaitiente));
    }

    @Override
    public void themGDDat() {
        GiaoDich g=nhap();
        System.out.print("loai Dat (1 (200),2 (400),3 (800) ):");
        int loaidat =Integer.parseInt(sc.nextLine());
        list.add(new GDDat(g.getMa(),g.getNgaygd(),g.getDongia(),
        g.getSoluong(),loaidat));
    }

    @Override
    public void vietDS() {
        for(GiaoDich i:list){
            System.out.println(i);
        }
        System.out.printf("DS co: %d\n",list.size());
              
    }

    @Override
    public void sua() {
        String ma;
        System.out.print("ma:");
            ma=sc.nextLine().toUpperCase();
            
            int vt=tontai(ma);
            if( vt==-1) System.err.println("Khong ton tai!!");
            else{
                GiaoDich g=list.get(vt);
                System.out.print("ngay GD:");
                String ngaygd =sc.nextLine();
                g.setNgaygd(ngaygd);
                System.out.print("Don gia:");
                double dongia =Double.parseDouble(sc.nextLine());
                g.setDongia(dongia);
                System.out.print("so luong:");
                int soluong =Integer.parseInt(sc.nextLine());
                g.setSoluong(soluong);
                System.out.println("Sua thang cong !!");
            }
    }

    @Override
    public void xoa() {
        String ma;
        System.out.print("ma:");
            ma=sc.nextLine().toUpperCase();
            int vt=tontai(ma);
            if( vt==-1) System.err.println("Khong ton tai!!");
            else{
                list.remove(vt);
                System.out.println("Xoa Thanh Cong!!");
            }
    }

    @Override
    public void tongsoluongtheoNgay() {
        Map<String,Integer>m=list.stream().collect(Collectors.groupingBy(
                GiaoDich::getNgaygd,Collectors.summingInt(GiaoDich::getSoluong)));
        Iterator i=m.keySet().iterator();
        while(i.hasNext()){
            String key=(String)i.next();
            System.out.println(key);
            System.out.println(m.get(key));
        }
    }

    @Override
    public void GDtheongay() {
        Map<String,Long>m=list.stream().collect(Collectors.groupingBy(
                GiaoDich::getNgaygd,Collectors.counting()));
        Iterator i=m.keySet().iterator();
        while(i.hasNext()){
            String key=(String)i.next();
            System.out.println(key);
            System.out.println(m.get(key));
        }
    }

    
    
}
