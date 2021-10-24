/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author KeyBin
 */
public class QLTL implements ChucNang{
    private List<TaiLieu>list;
    private Scanner sc=new Scanner(System.in);
    public QLTL() {
        list=new ArrayList<>();
        list.add(new Sach("S123","Hoai Ninh",123,"Hoai Nam","Get More",123));
        list.add(new Sach("S124","Hoai Nam",500,"Hoai Ninh","Become More",123));
        list.add(new TapChi("TC123","Hoai Lam",5100,1,"8/2020"));
        list.add(new Bao("B1245","Hoai Ninh",160,"1/1/2010"));
        list.add(new Bao("B1246","Hoai Nam",190,"23/1/2007"));
        list.add(new Bao("B1247","Hoai Nam",890,"23/1/2011"));
    }
    public int tontai(String ma){
        for(int i=0;i<list.size();i++){
            if(ma.compareToIgnoreCase(list.get(i).getMa())==0)return i;
        }
        return -1;
    }
    
    public TaiLieu nhap(){
        String ma,nhaxuatban;
        int soban;
        while(true){
            System.out.println("nhap ma:");
            ma=sc.next();
            if(tontai(ma)==-1)break;
            System.err.println("nhap lai !!!");
        }
        sc.nextLine();
        System.out.println("nhap nha xuat ban:");
        nhaxuatban=sc.nextLine();
        System.out.println("nhap so ban:");
        soban=sc.nextInt();
        
        return new TaiLieu(ma,nhaxuatban,soban);
    }
    
 
    @Override
    public void nhapsach() {
        TaiLieu tl=nhap();
        String tacgia,tensach;
        int sotrang;
        sc.nextLine();
        System.out.println("nhap tac gia:");
        tacgia=sc.nextLine();
        System.out.println("nhap ten sach:");
        tensach=sc.nextLine();
        System.out.println("nhap so trang:");
        sotrang=sc.nextInt();
        list.add(new Sach(tl.getMa(),tl.getNhaxuatban(),tl.getSoban(),tacgia,tensach,sotrang));
        
    }

    @Override
    public void nhaptapchi() {
        int sophathanh;
        String thangphathanh;
         TaiLieu tl=nhap();
         System.out.println("nhap so phat hanh:");
         sophathanh=sc.nextInt();
         sc.nextLine();
         System.out.println("nhap thang phat hanh:");
         thangphathanh=sc.nextLine();
         list.add(new TapChi(tl.getMa(),tl.getNhaxuatban(),tl.getSoban(),sophathanh,thangphathanh));
    }

    @Override
    public void nhapbao() {
        TaiLieu tl=nhap();
        System.out.println("nhap ngay phat hanh:");
        
        sc.nextLine();
        String ngayphathanh;
        ngayphathanh=sc.nextLine();
        list.add(new Bao(tl.getMa(),tl.getNhaxuatban(),tl.getSoban(),ngayphathanh));
    }
    
    @Override
    public void lietke(){
        for(TaiLieu i : list){
            System.out.println(i);
        }
    }
    
    @Override
    public void xoa() {
        String ma;
        int vt;
        System.out.println("nhap ma:");
            ma=sc.next();
            vt=tontai(ma);
        if(vt==-1)System.out.println("Khong co ma trong DS");
        else{
            list.remove(vt);
            System.out.println("Xoa thanh cong!");
        }
        
    }

    @Override
    public void sua() {
        String ma,nhaxuatban;
        int soban;
        int vt;
        System.out.println("nhap ma:");
        ma=sc.next();
        sc.nextLine();
        vt=tontai(ma);
        if(vt==-1)System.out.println("Khong co ma trong DS");
        else{
            System.out.println("nhap nha xuat ban:");
            nhaxuatban=sc.nextLine();
            System.out.println("nhap so ban:");
            soban=sc.nextInt();
            list.get(vt).setNhaxuatban(nhaxuatban);
            list.get(vt).setSoban(soban);
            System.out.println("Sua thanh cong!");
        }
    }
    public int cmpngay(String ngay1,String ngay2){
        String n1[]=ngay1.split("/");
        int tmp1=Integer.parseInt(n1[0])+Integer.parseInt(n1[1])*31+Integer.parseInt(n1[2])*366;
        String n2[]=ngay2.split("/");
        int tmp2=Integer.parseInt(n2[0])+Integer.parseInt(n2[1])*31+Integer.parseInt(n2[2])*366;
        return tmp1-tmp2;
    }
    @Override
    public void sxngayphathanh() {
        List<Bao> b=new ArrayList<>();
        for(TaiLieu i:list){
            if(i instanceof Bao){
                b.add((Bao)i);
            }
            
        }
        Collections.sort(b,new Comparator<>() {
            @Override
            public int compare(Bao b1, Bao b2) {
                return cmpngay(b1.getNgayphathanh(),b2.getNgayphathanh());
            }
        });
        for(TaiLieu i:b){
            System.out.println(i);
            
        }
    }

    @Override
    public void maxsobanphathanh() {
        Optional<TaiLieu> o=list.stream().collect(Collectors.maxBy(
        Comparator.comparing(TaiLieu::getSoban)));
        System.out.println(o.isPresent()?o.get():"DS rong");
    }

    @Override
    public void tongsobantheonhaxb() {
        Map<String,Integer> m =list.stream().collect(Collectors.groupingBy( 
                TaiLieu::getNhaxuatban,Collectors.summingInt(TaiLieu::getSoban)));
        
        
        Iterator i= m.keySet().iterator();
        while(i.hasNext()){
            String key=(String)i.next();
            System.out.println(key);
            System.out.println(m.get(key));
        }
    }

    @Override
    public void sobanlonnhattheonhaxb() {
        Map<String,TaiLieu> m=list.stream().collect(Collectors.groupingBy( 
                TaiLieu::getNhaxuatban,Collectors.collectingAndThen(
                        Collectors.reducing((TaiLieu tl1,TaiLieu tl2)->tl1.getSoban()>tl2.getSoban()?tl1:tl2), Optional::get)));
        Iterator i= m.keySet().iterator();
        while(i.hasNext()){
            String key=(String)i.next();
            System.out.println(key);
            System.out.println(m.get(key));
                 
        }
        
    }
    
    
    
}