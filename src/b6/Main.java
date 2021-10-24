/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b6;

import java.util.Scanner;

/**
 *
 * @author KeyBin
 */
public class Main {
    public static void main(String[] args) {
        QLGD q=new QLGD();
        
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. nhap giao dich vang ");
            System.out.println("2. Nhap giao dich tien");
            System.out.println("3. Nhap giao dich dat");
            
            System.out.println("4. viet DS");
            System.out.println("5. sua");
            System.out.println("6. xoa");
            
            System.out.println("7. tong so luong theo ngay");
            System.out.println("8. so giao dich theo ngay");
            
//            System.out.println("9. Tim theo mau");
//            System.out.println("10. tim theo nam");
//            System.out.println("11. Tim oto theo so cho");
//           
//            System.out.println("12. Sap xep theo ma");
//            System.out.println("13. Sap xep theo nam");
//            System.out.println("14. Sap xep theo gia");
//            System.out.println("15. Sap xep theo nam va gia");
//            System.out.println("16. Sap xep theo cong suat xe may");
//            System.out.println("17. Sap xep theo gia giam dan");
//            System.out.println("18. PT đắt nhất theo từng hãng");
//            System.out.println("19. số PT theo từng năm ");
//            System.out.println("20. tong tien moi mau ");
//            System.out.println("21. tong tien moi nam ");
//            System.out.println("22. max theo gia ");
//            System.out.println("23. PT dat theo nam ");
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->10):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:q.themGDVang();
                       break;
                case 2:q.themGDTiente();
                       break;
                case 3:q.themGDDat();
                       break;
                case 4:q.vietDS();
                    break;
                case 5:q.sua();
                       break; 
                case 6:q.xoa();
                break;
                case 7:q.tongsoluongtheoNgay();
                break;
                case 8:q.GDtheongay();
                break;
//                case 9:
//                break;
//                case 10:q.timTheoNam();
//                    break;
//                case 11:q.timTheoSoCho();
//                    break;
//                case 12:q.sapxepTheoMa();
//                    break;
//                case 13:q.sapxepTheoNam();
//                    break;    
//                case 14:q.sapxepTheoGia();
//                   break;
//                case 15:q.sapxepTheoNamvaGia();
//                   break;   
//                case 16:q.sapXepCS();
//                   break; 
//                case 17:q.sapxepTheoGiaGiam();
//                   break; 
//                case 18:q.dattheotunghang();
//                   break; 
//                case 19:q.soPTmoinam();
//                   break; 
//                case 20:q.tongtienmoimau();
//                    break;
//                case 21:q.tongtienmoinam();
//                   break; 
//                case 22:q.maxtheogia();
//                   break; 
//                case 23:q.ptdattheonam();
//                    break;
                default:System.out.println("chi chon 0->8");
                      break; 
            }
        }
        
    }
}
