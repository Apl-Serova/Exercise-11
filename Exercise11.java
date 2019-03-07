import java.util.Scanner;
public class Exercise12 {
    public static void main (String[ ] args) {
        Scanner str = new Scanner (System.in);
        System.out.println("Введите строку: ");
        String s = str.nextLine();
        s = s.replace(" ","");
        System.out.println(s);
    }
}

