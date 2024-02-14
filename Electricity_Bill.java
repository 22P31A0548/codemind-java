import java.util.Scanner;
public class Bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n = sc.nextLine();
        int u = sc.nextInt();
        Double c;
        if(u<199){
            c = u*1.20;
        }
        else if(u>=200 && u<400){
            c = u*1.50;
        }
        else if(u>=400 && u<600){
             c=u*1.80;
        }
        else{
           c=u*2.00;
        }
        if(u>400){
            c=(15/100.0)*c+c;
        }
        else{
            c=100+c;
        }
        System.out.format("%.2f",c);
    }
}