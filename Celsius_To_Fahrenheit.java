import java.util.Scanner;
public class Convert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float c = sc.nextInt();
        double f = (c*9/5+32);
        System.out.printf("%.2f",f);
    }
}