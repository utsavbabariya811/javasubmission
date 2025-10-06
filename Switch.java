package Java_Self_Study;

public class Switch {
    public static void main(String[] args) {
        int day = 3;

        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other Day");
        }

        
        System.out.println("Loop with continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // skip 3
            System.out.print(i + " ");
        }

        System.out.println("\nUsing return in method:");
        printMessage();
    }

    static void printMessage() {
        System.out.println("Hello, this method ends here.");
        return; 
    }
}
