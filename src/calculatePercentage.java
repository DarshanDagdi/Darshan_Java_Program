import java.util.Scanner;
public class calculatePercentage {
    public static void main(String[] args) {
        System.out.println("Percentage of your 12th exam ");
        Scanner sc=new Scanner(System.in);
        float marks=100;
        System.out.println("enter your marks of Physics :");
        float marks1=sc.nextFloat();
        System.out.println("enter your marks of Chemistry :");
        float marks2=sc.nextFloat();
        System.out.println("enter your marks of Maths :");
        float marks3=sc.nextFloat();
        System.out.println("enter your marks of English :");
        float marks4=sc.nextFloat();
        System.out.println("enter your marks of Computer :");
        float marks5=sc.nextFloat();
        float P=(marks1 + marks2 + marks3 + marks4 + marks5)/5;
        System.out.print("percentage :");
        System.out.println(P);

    }
}




