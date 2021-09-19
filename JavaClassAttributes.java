package OOPS;

public class JavaClassAttributes {
    // car -> color, weight (attributes)
    // car -> drive, brake (methods)

    // How a programmer can access the atrributes

    // Accessing Attributes (By creating the object)\

    String fname = "John";
    String lname = "Doe";
    int age = 27;
    int x = 10; // overriding

    public static void main(String[] args) {
        // JavaClassAttributes myObj = new JavaClassAttributes();
        // System.out.println(myObj.x);

        // Modify the attributes
        // JavaClassAttributes myObj = new JavaClassAttributes();
        // myObj.x = 24;
        // System.out.println(myObj.x);
        // myObj.x = 31;
        // System.out.println(myObj.x);

        // Multiple Objects
        // JavaClassAttributes myObj1 = new JavaClassAttributes(); // Object 1
        // JavaClassAttributes myObj2 = new JavaClassAttributes(); // Object 2
        // myObj2.x = 25;
        // System.out.println(myObj1.x);
        // System.out.println(myObj2.x);

        // Multiple Attributes
        JavaClassAttributes myObj = new JavaClassAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
