import java.util.Scanner;
public class If_else_Statement_Example {
    public static void main(String[] args) {
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your physics marks :");
        m1 = sc.nextByte();
        System.out.println("enter your chemistry marks :");
        m2 = sc.nextByte();
        System.out.println("enter your maths marks :");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 4.0f;
        System.out.println("percentage" + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congrats, you have been promoted");
        }
        else{
            System.out.println("better luck next time");
        }
    }
}
