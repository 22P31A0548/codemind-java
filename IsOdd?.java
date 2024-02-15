import java.util.Scanner;
public class Odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2!=0){
            System.out.println("2");
        }
        else{
            System.out.println("1");
        }
    }
}