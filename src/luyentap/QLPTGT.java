/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QLPTGT implements IChucNang{
    private List<PTGT> list;
    private Scanner sc=new Scanner(System.in);
    public QLPTGT() {
        list=new ArrayList<>();
        list.add(new Oto("AB02C", "Toyota", "2/2021", 2000, 4, 200));
        list.add(new Oto("AB03C", "Kia", "3/2021", 2500, 4, 500));
       list.add(new Oto("AB04C", "Honda", "2/2021", 2000, 4, 200));
       list.add(new Oto("AB05C", "Hyundai", "2/2021", 5000, 4, 200));
   
       list.add(new XeTai("AB06C", "Toyota", "2/2021", 4000, 400, true));
        list.add(new XeTai("AB07C", "Kia", "3/2021", 2500, 400, false));
       list.add(new XeTai("AB08C", "Honda", "2/2021", 6000, 400, true));
       list.add(new XeTai("AB09C", "Hyundai", "2/2021", 8000, 400, false));
    }
    public int tontai(String sokhung){
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getSokhung().equalsIgnoreCase(sokhung))
                return i;
        }
        return -1;
    
    
    }
    public PTGT nhap(){
        String sokhung;
        String hang,ngaylanbanh;
        double gia;
        String regex="(AB)\\d{2}C";
        while(true){
            System.out.printf("\nSo Khung xe: ");
            sokhung=sc.next().toUpperCase();
            if(tontai(sokhung)==-1 && sokhung.matches(regex))
                break;
            System.err.println("Nhap lai !!!");
        }
        
        
        System.out.printf("\nHang: ");
            hang=sc.next();
        System.out.printf("\nNgay Lan Banh: ");
            ngaylanbanh=sc.next();
        System.out.printf("\nGia: ");
            gia=sc.nextDouble();
        System.out.println("");
        return new PTGT(sokhung,hang,ngaylanbanh,gia);
    }
        
        
    
    
    
    @Override
    public void nhapOto() {
       PTGT p=nhap();
       int socho,tocdomax;
        System.out.print("So cho ngoi: ");
        socho=sc.nextInt();
        System.out.print("\ntoc do toi da: ");
        tocdomax=sc.nextInt();
        System.out.println("");
        list.add(new Oto(p.getSokhung(), p.getHang(),
                p.getNgaylanbanh(), p.getGia(), socho, tocdomax));
        
    }

    @Override
    public void nhapXeTai() {
        PTGT p=nhap();
        int taitrong;
        boolean thungxe;
        System.out.print("tai trongi: ");
        taitrong=sc.nextInt();
        System.out.print("\n co thung xe: ");
        thungxe=sc.nextBoolean();
        System.out.println("");
        list.add(new XeTai(p.getSokhung(), p.getHang(),
                p.getNgaylanbanh(), p.getGia(), taitrong, thungxe));
    }

    @Override
    public void vietDs() {
        System.out.println("DS Oto:");
        for(PTGT i: list)
        {
            if(i instanceof Oto)
            {
                System.out.println(i);
            }
        }
        System.out.println("DS xe Tai:");
        for(PTGT i: list)
        {
            if(i instanceof XeTai)
            {
                System.out.println(i);
            }
        }
        
    }

    @Override
    public void Sua() {
        System.out.println("Nhap khung xe can sua:");
        String sokhung=sc.next();
        int index=tontai(sokhung);
        if(index==-1)
            System.out.println("khong ton tai so khung xe");
        else{
            PTGT p=list.get(index);
            String hang,ngaylanbanh;
            double gia;

            System.out.printf("\nHang: ");
                hang=sc.next();
            System.out.printf("\nNgay Lan Banh: ");
                ngaylanbanh=sc.next();
            System.out.printf("\nGia: ");
                gia=sc.nextDouble();
            System.out.println("");
            p.setHang(hang);
            p.setNgaylanbanh(ngaylanbanh);
            p.setGia(gia);
            
        }
        
        
    }

    @Override
    public void Sapxepgiamdan() {
        Collections.sort(list,new Comparator<PTGT>() {
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return (int)(o2.getGia()- o1.getGia());
            }
        });
    }

    @Override
    public void PTDatDoTheoHang() {
        List<String> h=new ArrayList<String>();
        for(PTGT i: list)
        {
            if(!h.contains(i.getHang()))
            {
                h.add(i.getHang());
            }
                 
        }
        System.out.println("Cac Phuong Tien dat nhat theo tung hang:");
        for(String i: h)
        {
            
            double max1=-1;
            int vtm = 0;
            
            for(int j=1;j<list.size();j++)
            {
                if(i.contains(list.get(j).getHang())&& list.get(j).getGia()>max1)
                {
                    max1=list.get(j).getGia();
                    vtm=j;
                }
            }
            System.out.println(list.get(vtm));
                 
        }
            
    }
    
}
