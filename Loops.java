public class JavaLoops {
    public static void main(String[] args) {
        // What are loops?
        // Loops can execute a block of codeas long as specified condition is reached
        // -> While loop
        // -> For loop
        // -> Do/while loop
        // -> For-Each loop

        // While loop syntax

        // while (condition)
        // Code block that I want

        int i = 0;
        while (i < 5){
        System.out.println(i);
        i++;
        }

        // Java do/while loop syntax
        // do {
        // code
        // }
        // while (condition);

        int i = 0;
        do {
        System.out.println(i);
        i++;
        } while (i < 5);

        // Java For Loop Syntax
        // for(statement 1 (declaration); statement 2 (condition); statement
        // 3(increment/decrement)) {
        // code block
        // }

        for (int i = 0; i < 5; i++) {
        System.out.println(i);
        }3

        for (int i = 0; i <= 10; i = i + 2) {
        System.out.println(i);
        }

        // For-Each Loop Syntax
        // for(type variableName : arrayName) {
        // // code block to be executed
        // }

        String[] cars = { "volvo", "BMW", "Ford", "Lamborghini", "Rolls Royce" };
        for (String i : cars) {
        System.out.println(i);
        }

        /*
         * 1. WAP in java to swap two numbers by using temporaray variable. (Take input
         * from user) 
         * 2. WAP in java to swap two numbers by using arithmetic operator.
         * (With +/- operator) 3. WAP in java to swap two numbers by using arithmetic
         * operator. (With multiply/divison operator) 4. WAP in java to check whether
         * the no. is even or not 5. WAP in java to check whether the given no. is
         * palindrome or not 6. WAP in java to check whether the give no. is armstrong
         * or not 7. WAP in java to check whether the person is eligible to vote or not
         * 
         */
    }
}
