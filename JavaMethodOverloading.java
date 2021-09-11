public class MethodOverloading {
    // Method Overloading -> Multiple methods can have the same name with different parameters

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static float plusMethod(float x, float y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        System.out.println("Int: " + myNum1);
        float myNum2 = plusMethod(8, 7);
        System.out.println("Float: " + myNum2);
        double myNum3 = plusMethod(7, 5);
        System.out.println("Double: " + myNum3);
    }
}
