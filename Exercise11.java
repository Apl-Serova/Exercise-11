import java.util.Scanner;
public class Exercise11 {
    public static void main (String[ ] args) {
        Scanner str =new Scanner (System.in);
        System.out.println("Введите строку: ");
        String s= str.nextLine();
        String [] ss = s.split(" ");
        for (String element: ss) {
            System.out.print(element);
        }
    }
}

