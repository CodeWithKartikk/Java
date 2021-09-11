public class MethodParameters {
    // Methods and Parameters (Single Parameter)
    static void myMethod(String fname) {
        System.out.println(fname + " Oberoi");
    }

    // Methods with multiple parameters
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    // Methods with return value
    static int myMethod(int x) {
        return 5 + x;
    }

    // Methods with multiple parameters/multiple return value
    static int myMethod(int x, int y) {
        return x + y;
    }

    // Method with If..Else
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access Denied");
        } else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        myMethod("Kartik");
        myMethod("Ishaan");
        myMethod("Gaurav");
        myMethod("Jatin", 18);
        System.out.println(myMethod(5));
        System.out.println(myMethod(5, 4));
        int z = myMethod(4, 3);
        System.out.println(z);
        checkAge(20);
    }
}
