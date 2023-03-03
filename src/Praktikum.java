import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09.2000");
        }
        else{
            System.out.println("13.09.2000");
        }
    }

    public static boolean isLeapYear(int year) {
        if(year % 400 == 0){
            return true;
        }
        else {
            if(year % 100 == 0) {
                return false;
            }
            else if(year % 4 == 0){
                return true;
            }
            else {
                return false;
            }

        }

    }
}
