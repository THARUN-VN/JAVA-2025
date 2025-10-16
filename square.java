import java.util.Scanner;

public class square {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
         System.out.println("square is :"+n*n);
        sc.close();
    }
}