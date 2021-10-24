
package luyentap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLPTGT ql=new QLPTGT();
        System.out.println("-------MENU-------");
            System.out.println("1. Nhap oto");
            System.out.println("2. Tong xe tai");
            System.out.println("3. Viet Danh Sach");
            System.out.println("4. Sua Phuong tien");
            System.out.println("5. Sap xep giam dan theo gia");
            System.out.println("6. Phuong tien dat do nhat theo tung hang");
            System.out.println("7. Cac uoc cua n");
            System.out.println("8. Cac uoc nguyen to nho hon n");
            System.out.println("9. So fibonaci thu n");
            System.out.println("10. Day so fibonaci nho hon n");
            System.out.println("11. Day so fibonaci la so nguyen to nho hon n");
            System.out.println("12. Day so nho hon n chia het cho 1 so");
            System.out.println("13. Day so nho hon n chia het cho 2 so");
            System.out.println("14. Xau nhi phan do dai n");
            System.out.println("15. Hoan vi do dai n");
            System.out.println("16. Cac so nguyen to co n chu so");
            System.out.println("17. Cac so thuan nghich co n chu so");
            System.out.println("0. Thoat");
        while(true){
            System.out.print("Nhap lua chon cua ban: ");
            int chon;
            Scanner sc = new Scanner(System.in);
            chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 0: System.out.println("BYE!!");
                        System.exit(0);
                case 1: ql.nhapOto();
                        break;
                case 2: ql.nhapXeTai();
                        break;
                case 3: ql.vietDs();
                        break;
                case 4: ql.Sua();
                        break;
                case 5: ql.Sapxepgiamdan();
                        break;
                case 6: ql.PTDatDoTheoHang();
                        break;
                case 7: 
                        break;  
                case 8: 
                        break;  
                case 9: 
                        break;
                case 10: 
                        break;    
                    
                default: System.out.println("Chi chon 0 -> 13");
                         break;
           }
       }
    }
    
}
