/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author KeyBin
 */
public class PhoneBook implements Chucnang{

    private List<PhoneNumber> list;
    private Scanner sc=new Scanner(System.in);
    public PhoneBook() {
        list=new ArrayList<>();
        list.add(new PhoneNumber("024","36407515"));
        list.add(new PhoneNumber("027","46407515"));
        list.add(new PhoneNumber("0228","36407516"));
        list.add(new PhoneNumber("0229","39407516"));
        list.add(new IntlPhoneNumber("084","0227","36407516"));
        list.add(new IntlPhoneNumber("087","040","46557516"));
        
    }
    public PhoneNumber nhap(){
        String mavung,sdt;
        System.out.println("Nhap ma vung:");
        mavung=sc.next();
        System.out.println("Nhap sdt:");
        sdt=sc.next();
        return (new PhoneNumber(mavung,sdt));
    }

    @Override
    public void Themsdt() {
        list.add(nhap());
    }
    
    @Override
    public void Themsdtquocte() {
        
        System.out.println("Nhap ma quoc gia:");
        String maquocgia=sc.next();
        PhoneNumber p=nhap();
        list.add(new IntlPhoneNumber(maquocgia,p.getMavung(),p.getSdt()));
    }

    @Override
    public void Timdttheovung() {
        System.out.println("Nhap ma vung:");
        String mavung=sc.next();
        System.out.println("Nhap ma So Dien thoai:");
        String sdt=sc.next();
        int tontai=0;
        for(PhoneNumber i : list){
            if(i.getMavung()==mavung&&i.getSdt()==sdt){
                System.out.println(i);
                tontai=1;
            }
        }
        if(tontai==0)System.out.println("Khong ton tai trong DS");
    }

    @Override
    public void Lietke() {
        for(PhoneNumber i : list){
//            if(i instanceof IntlPhoneNumber){
//                System.out.println((IntlPhoneNumber)i);
//            }
//            else{
//                System.out.println(i);
//            }
                System.out.println(i);
        }
        System.out.printf("Trong DS co %d \n",list.size());
            
    }

    @Override
    public void Tongsdttheovung() {
        Map<String,Long> m=list.stream().collect(Collectors.groupingBy(
                PhoneNumber::getMavung, Collectors.counting()));
        Iterator i=m.keySet().iterator();
        while(i.hasNext()){
            String key=(String)i.next();
            System.out.println(key);
            System.out.println(m.get(key));
        }
    }

    @Override
    public void timkiemtheoduoi() {
        
    }

    @Override
    public void sapxepdt() {
        Collections.sort(list,new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber p1, PhoneNumber p2) {
                return p1.getSdt().compareTo(p2.getSdt());
            }
        });
    }
    
}
