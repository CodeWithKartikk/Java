public class JavaScope {
    // Java Scope - In Java, variables are omly accessible inside the block/reigon
    // where we had created

    // Methods Scope - Variable declared directly inside a method are available in
    // the method following the line of code in which they had declared.
    public static void main(String[] args) {
        // code can't use x here
        // System.out.println(x);

        int x = 5; // here

        // code can use x here
        System.out.println(x);

        // Block Scope - A block of code refers to all of the code beteen curly
        // braces{}. Variable that are declared inside the blocks that can be accessible
        // inside the blocks of code b/w curly braces.
        {
            // System.out.println(y);

            int y = 100;

            System.out.println(y);

        }
    }
}
