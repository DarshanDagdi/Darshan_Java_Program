import java.util.Scanner;
public class If_Else_Statement_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income :");
        float income = sc.nextFloat();
        float tax = 0;
        if (tax < 2.5f) {
            tax = tax + 0;
        } else if (tax > 2.5f && tax < 5.0f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (tax > 5.0f && tax < 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 2.5f);

        } else if (tax > 10.0f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("you have to pay " + tax + "tax");
    }

}