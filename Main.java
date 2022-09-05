import java.util.Scanner;

/**
 * Клас для демонстрації функціональності класу Fib
 * @author Fitsay Vadim
 */
public class Main {
    /**
     * Демонстрація методів класу Fib
     * @param args масив параметрів командного рядка
     * @exception IllegalArgumentException Введення некоректного N-того числа Фібоначчі
     */
    public static void main(String[] args) {
        System.out.print("N: ");
        fib x = new fib();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N<0) throw new IllegalArgumentException("You entered an incorrect number");
        System.out.println(N + " число Фібоначчі - "+x.fibo(N));
        System.out.println("An: "+x.geti());
    }
}