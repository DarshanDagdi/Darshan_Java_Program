import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;
public class StringClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String ");
        String name=sc.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.replace(" ","_"));
    }
}
