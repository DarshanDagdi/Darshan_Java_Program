import java.util.Scanner;
public class Switch_Case_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numberfrom 1 to 7 to know day :");
        int a= sc.nextInt();
        switch (a){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednersday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("enter a valid number");

        }
    }
}
