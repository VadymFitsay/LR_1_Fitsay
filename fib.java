/**
 * Клас для знаходження N-того числа Фібоначчі
 * @author Fitsay Vadim
 */
public class fib {
    /**
     * i - кількість додаванинь при рекурсивному знаходженні N-тошо ччисла Фібоначчі
     */
    private int i = 0;

    /**
     * Метод для знаходження N-того числа Фібоначчі
     * @param n порядковий номер Фібоначчі
     * @return - метод повертає N-те число фібоначчі
     */
    public int fibo(int n){
        if (n == 0){return 0;}
        if (n == 1){return 1;}
        else{
            i += 1;
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public int geti(){return i;}
}
