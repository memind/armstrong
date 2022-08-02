import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int s, toplam = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı gir: ");
        s = inp.nextInt();

        while(s!=0){
            toplam += s%10;
            s /= 10;
        }
        System.out.print("Toplam: " + toplam);
    }
}