/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4;

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
            System.out.println("1. nhap GV co huu ");
            System.out.println("2. nhap GV thinh giang");
            System.out.println("3. Viet ra ds");
            
            System.out.println("4. sx theo tien linh");
            System.out.println("5. xoa giang vien thinh giang");
            System.out.println("6. tong tien tra theo hoc vi");
            
//            System.out.println("7. Tim theo ma");
//            System.out.println("8. tim theo hang");
//            
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
                case 1:q.nhapGVCH();
                       break;
                case 2:q.nhapGVTG();
                       break;
                case 3:q.lietke();
                       break;
                case 4:q.sxtheotienlinhgiamdan();
                    break;
                case 5:q.xoa();
                       break; 
                case 6:q.tongtientheohocvi();
                    break;
//                case 7:q.timTheoMa();
//                break;
//                case 8:q.timTheoHang();
//                break;
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
                default:System.out.println("chi chon 0->6");
                      break; 
            }
        }
        
    }
}
