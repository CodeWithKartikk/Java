public class Switch {
    public static void main(String[] args) {
        /*
         * switch syntax
         * 
         * switch(expression) case 1: // code block break; case 2: // code block break;
         * case 3: // code block break; default: // code block
         */

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // break keyword -> when java compiler reaches a break keyword then it breaks
        // out of the switch block.
        // default keyword -> it specifies some code to run if there is no case match\

    }
}
