package questions;

public class Question1 {

    public static boolean isFibonnaci(int num) {
        if (num <= 0) {
            System.out.println(num + " não pertence a sequência");
            return false;
        }

        int a = 0;
        int b = 1;

        while (a <= num) {
            if (a == num) {
                System.out.println(num + " pertence a sequência");
                return true;
            }
            
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(num + " não pertence a sequência");
        return false;
    }
    
}
