
package benimsorum;

import java.util.Scanner;

/**
 *
 * @author RojdaTunc
 */
public class BenimSorum {

    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("Kart şifrenizi giriniz");
        int sifre=girdi.nextInt();
        
       
            if (sifre==1234){
                System.out.println("Giriş Yapıldı");
                System.out.println("Para yatırmak için 0'a basınız");
                System.out.println("Para çekmek için 1'e basınız");
                System.out.println("Kart şifrenizi değiştirmek için 2'ye basınız");
                int sayi=girdi.nextInt();
                if (sayi==0) {
                    System.out.println("Yatırılacak miktarı giriniz");
                    int yatırılacakMiktar=girdi.nextInt();
                    System.out.println("Hesabınızdaki para = "+ParaYatir(yatırılacakMiktar)+" TL"); 
                }
                else if (sayi==1) {
                    System.out.println("Çekilecek miktarı giriniz");
                    int cekilecekMiktar=girdi.nextInt();
                    System.out.println("Hesabınızdaki para = "+ParaCek(cekilecekMiktar)+" TL"); 

                    
                }
                else if (sayi==2) {
                    System.out.println("Şifrenizi tekrar giriniz");
                    int a=girdi.nextInt();
                    System.out.println("Yeni şifrenizi giriniz");
                    int yeniSifre=girdi.nextInt();
                    System.out.println(+sifreDegis(a,yeniSifre)); 
                    
                }
                    
             }
            else System.out.println("Şifrenizi yanlış girdiniz");
                
           }

        public static int ParaYatir (int a){
        int mevcutMiktar=1000;
        int yeniMiktar=mevcutMiktar+a;
        System.out.println("Başarıyla Para Yatırdınız");
        return yeniMiktar;

        }
        public static int ParaCek (int a){
        int mevcutMiktar=1000;
        int yeniMiktar=mevcutMiktar-a;

        if (yeniMiktar<0) {
            System.out.println("Hesabınızda olan paradan fazlasını çekemezsiniz");
            return mevcutMiktar;
        }
        else{
        System.out.println("Başarıyla Para Çekteniz");
        return yeniMiktar;
        }
     }
    public static int sifreDegis (int a, int b){
        if (a==1234) {
            int yenisifre=b;
            System.out.println("Şifreniz başarıyla değiştirildi");
            System.out.print("Yeni Şifreniz: ");
            return yenisifre;   
        }
        else
            System.out.println("Sifreyi yanlış girdiniz");
        return 0;
        
    
    }
}
    

