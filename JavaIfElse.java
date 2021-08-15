public class JavaIfElse {
    public static void main(String[] args) {
        // Java Condtional statementss
        /*
         * 1. Less than: a < b 2. Less than or equal to: a <= b 3. Greater than: a > b
         * 4. Greater than or equal to: a>=b 5. Equal to: a == b 6. Not Equal to: a != b
         */

        // If Statement Syntax
        // if (Condition) {
        // statements
        // }

        if (20 > 18) {
        System.out.println("20 is greater than 18");
        }

        int x = 20;
        int y = 18;
        if (x > y) {
        System.out.println("x is greater than y");
        }

        // Else statement syntaxx
        // if(condition) {
        // statements
        // }
        // else {
        // statements
        // }

        int time = 20;
        if (time < 18) {
        System.out.println("Good Day");
        } else {
        System.out.println("Good Evening");
        }

        // Else if Statement Syntax

        // if(condition 1) {
        // statements
        // }
        // else if(condition 2) {
        // statements
        // }
        // else if (cindition 3) {
        // statements
        // }
        // else {
        // statements
        // }

        int time1 = 22;
        if (time1 < 12) {
        System.out.println("good Morning");
        } else if (time1 < 18) {
        System.out.println("Good Noon");
        } else if (time1 < 20) {
        System.out.println("Good Day");
        } else {
        System.out.println("Good Evening");
        }

        // Ternary Operator
        // variable = (condition) ? expressionTrue : expressionFalse;
        int tim = 20;
        String m = (tim > 22) ? "Good Day" : "Good Evening"; // Ternary Operator
        System.out.println(m);

        // 1. WAP in Java to check whether the given number is even or odd 
        // 2. WAP in Java to check whether an alphabet is vowel or consonats
        // 3. WAP in Java to check whether it is leap year
        // 4. WAP in Java to check whether the person is eligible to vote or not
        // 5. WAP in Java to check whether the given number is positive or not
    }
}
