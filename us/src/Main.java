import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        int taban=scanner.nextInt();
        System.out.println("Üs değerini giriniz : ");
        int us=scanner.nextInt();

        System.out.println("Sonuç = "+usBul(taban,us));
    }
    public static int usBul(int taban,int us){
        int sonuc= (int) Math.pow(taban,us);
        return sonuc;
    }
}
