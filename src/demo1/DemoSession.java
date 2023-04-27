package demo1;

import java.util.Scanner;

public class DemoSession {
   public static void main(String args[]) {
       int x = 10;
       x++;
       if (x > 10) {
           //A
       } else if (x > 5) {
           //B
       } else if (x > 15) {
           //C
       } else {
           // D
       }
       switch (x) {
           case 1:
               break; //A
           case 5:
               break; //B
           case 10:
               break; //C
           case 15:
               break; //D
           default:
               break;//E
       }
       int y = 0;
       while (y > 0) {
           //A
           x++;
       }
       do {
           x++;
       } while (y > 0);
       for (int i = 0; i < 10; i++) {

       }

       int arr[] = new int[5];//Mảng 5 số nguyên
       arr[0]= 10;
       arr[1] = 2;
       arr[2] = 21;
       arr[3] = 11;
       arr[4] = 56;
       for(int i = 0; i < arr.length; i++) {
           //arr[i]
       }
       // forEach
       for(int a:arr) {
           System. out. println(a);
       }

       int n;
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap 1 so tu ban phim");
       n = sc.nextInt();
       System.out.println("So vua nhap: "+n);
       // Kiểm tra n có phải số nguyên tố hay không?

       // đã đếm xong số ước
       if(checkSNT(n)) {
           System.out.println(n+" la so nto");
       } else {
           System.out.println(n+" khong la so nto");
       }
       //Nhâp 1 mảng n số nguyên, tìm các số nguyên tó trong mảng

       int arrNST[] = new int[n];
       for(int i=0;i<arrNST.length;i++){
           arrNST[i] = sc.nextInt();
       }
       for(int a: arrNST){
           if(checkSNT(a)){
               System.out.println("NST: "+a);
           }
       }
   }

   public static boolean checkSNT(int a){
       if(a < 2) return false;
       if(a < 4) return true;
       for(int i = 2; i<a/2; i++) {
           if(a%i==0){
               return false;
           }
       }
       return true;
   }
}
// btvn
//Viết các ctrinh
// 1. Nhập 2 số nguyên n, ktra nó có p
