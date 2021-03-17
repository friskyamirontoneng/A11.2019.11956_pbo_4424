import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        double num1,num2;

        System.out.println("Masukkan angka pertama :");
        num1 = inp.nextDouble();
        System.out.println("Masukkan angka kedua :");
        num2 = inp.nextDouble();

        System.out.println("Masukkan operator [tambah (+), kurang (-), kali (*), bagi (/), modulus (%)] ");
        char operator = inp.next().charAt(0);
        double output = 0.0;
        switch (operator){
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            case '%':
                output = num1 % num2;
                break;
            default:
                System.out.println("maaf inputan anda salah!");

        }
        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}
