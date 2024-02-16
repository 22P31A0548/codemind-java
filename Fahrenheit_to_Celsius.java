import java.util.Scanner;
public class Convert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float f = sc.nextInt();
        double c = ((f-32)*5)/9;
        System.out.printf("%.2f",c);
    }
}