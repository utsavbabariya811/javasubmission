package Java_Self_Study;

public class Operator {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Division: " + (a / b));

        System.out.println("a > b : " + (a > b));

        
        System.out.println("a & b (Bitwise AND): " + (a & b));
        a += 3; 
        System.out.println("a after += : " + a);
        int max = (a > b) ? a : b;
        System.out.println("Max = " + max);
    }
}
