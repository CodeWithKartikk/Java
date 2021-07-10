public class TypeCastingClass5 {
    /* 
    TypeCastng - Type Casting is when you assign a value of one primitive dataType to another dataType
    Two Types of Type Casting:
        > Widening TypeCasting  (Automatically) : Converting a smaller dataType to a larger type size.
        > Narrowing TypeCasting (Manually)      : Converting a larger dataType to a smaller size type.
    */
    public static void main(String[] args) {
        // Example of Widenening Typecasting (Automatically)
        int myInt = 5;
        double  myDouble = myInt; //  Automatically casted from int to double
        System.out.println(myInt);
        System.out.println(myDouble);

        char myChar = 'A';
        long myLong = myChar; // It just convert it into the ascii value
        System.out.println(myChar);
        System.out.println(myLong);

        Example of Narrowing Typecasting (Manually)
        double myDoubleVar = 9.875;
        int myIntVar = (int) myDoubleVar;
        System.out.println(myDoubleVar);
        System.out.println(myIntVar);

        long myLongVar = 5554215;
        char myCharVar = (char) myLongVar;
        System.out.println(myLongVar);
        System.out.println(myCharVar);
    }
}
