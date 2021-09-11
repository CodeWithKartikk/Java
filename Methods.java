public class Methods {

    static void myMethod() {
        System.out.println("Calling A Method");
    }

    public static void main(String[] args) {
        // A method is a block of code which only runs when it is called.

        // Methods are used to perform certain actions, and that's why we also call it
        // as functions.
        // A method is alays declared within a class. It is defined with the name of the
        // method, folloed by paranthesis().
        // Java Pre defined Methods
        // > System.out.println()

        // Create a Method
        // static void myMethod() {
        // // code to be execute
        // }

        /**
         * myMethod() -> name of the method static -> static means that the method
         * belongs to the main class and not an object of the main class. void -> method
         * doesn't have a return value.
         */
        myMethod();
        myMethod();
        myMethod();
        myMethod();
    }
}
