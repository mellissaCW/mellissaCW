package P08_Loops_version1.L01_ForLoops.Tasks02;

public class Task02_09 {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın
        // ama yazarken ilk harf büyük olsun ve sonrası bir küçük, bir büyük harf olarak devam etsin

        String str = "SelaMLAR";

        String harf;
        for (int i = 0 ; i < str.length(); i++) {
         harf = str;
         if (i%2 == 0){
             harf.toUpperCase();
         } else {
             harf.toLowerCase();
             System.out.println();
         }

        }


    }
}
