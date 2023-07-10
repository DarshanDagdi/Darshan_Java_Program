import java.util.Scanner;
public class StringClass2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a name");
        String name=sc.next();
        String letter="Dear <name>, Thanks a'lot";
        System.out.println(letter.replace("<name>",name));
    }
}
