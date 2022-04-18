

public class Main {

    public static void sum(int a, int b){
        if (a+b < 20 && a+b > 10){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

    public static void sign(int a) {
        if (a >= 0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }

    }
    public static void sign2(int a) {
        if (a >= 0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }

    }

    public static void clone(String text, int i) {

        while (-i < 0){
            System.out.println(text);
            i = i-1;
        }

    }

    public static boolean year(int a) {
        if (a % 100 == 0 && a % 400 == 0){
            System.out.println("Год високосный");
                return true;
        }else if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("Год високосный");
            return true;

        }else{
            System.out.println("Год не високосный");
            return false;
        }

    }

    public static void main(String[] args) {
            sum(5, 8);
            sign(-13);
            sign2(9);
            clone("hello", 5);
            year(2114);
    }

}
