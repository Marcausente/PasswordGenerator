
import java.util.Random;
import java.util.Scanner;

public class contrasenagen {
    private static Scanner input = new Scanner(System.in);
    static String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    static String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    public static void main(String[] args) {
        int digitos = 0;
        int menu = 0;
        printmenu();
    }

    private static void printmenu() {
        System.out.println("=======================");
        System.out.println(" MY PASSWORD GENERATOR ");
        System.out.println("=======================");
        System.out.println(letras[2]);
    }

}