import java.util.Scanner;

public class Simple_program01{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        int a = 45;
        int b = 67;
        int sum = a+b;
        System.out.println(sum);
        System.out.println("Enter the value of c:- ");
        int c = sc.nextInt();
        System.out.println("Enter the value of d:- ");
        int d = sc.nextInt();
        int add = c+d;
        System.out.println("The sum of a and b is:- " + add);
    }
}