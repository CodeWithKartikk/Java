import java.util.Scanner; //Import th Scanner class

public class Input {
    public static void main(String[] args) {
        /*
         Input Types
             Method                Description
        * 1. nextByte()      -> Reads a byte value from the user
        * 2. nextInt()       -> Reads a int value from the user 
        * 3. nextShort()     -> Reads a short value from the user
        * 4. nextLong()      -> Reads a long value from the user
        * 5. nextFloat()     -> Reads a float value from the user
        * 6. nextDouble()    -> Reads a double value from the user
         7. nextBoolean()   -> Reads a boolean value from the user
         8. nextLine()      -> Reads a char or string value from the user
        */

        
        // ClassName Variable = new Scanner(System)
        // Taking Input as an Byte
        Scanner scanByte = new Scanner(System.in);
        System.out.print("Enter your lucky number in byte: ");
        byte luckyNumberByte = scanByte.nextByte();
        System.out.println(luckyNumberByte);

        
        // Taking Input as a Short
        Scanner scanShort = new Scanner(System.in);
        System.out.print("Enter your lucky number in Short: ");
        short luckyNumberShort = scanShort.nextShort();
        System.out.println(luckyNumberShort);


        // Taking Input as an Integer

        Scanner scanInt = new Scanner(System.in);
        System.out.print("Enter your lucky number in int: ");
        int luckyNumberInt = scanInt.nextInt();
        System.out.println(luckyNumberInt);

        // Taking Input as long

        Scanner scanLong = new Scanner(System.in);
        System.out.print("Enter your lucky number in long: ");
        long luckyNumberLong = scanLong.nextLong();
        System.out.println(luckyNumberLong);

        // Taking Input as float

        Scanner scanFloat = new Scanner(System.in);
        System.out.print("Enter your lucky number in float: ");
        float luckyNumberFloat = scanFloat.nextFloat();
        System.out.println(luckyNumberFloat);

        // Taking Input as Double

        Scanner scanDouble = new Scanner(System.in);
        System.out.print("Enter your lucky number in double: ");
        double luckyNumberDouble = scanDouble.nextDouble();
        System.out.println(luckyNumberDouble);

        // Taking Input as Boolean

        Scanner scanBool = new Scanner(System.in);
        System.out.print("Is Lucky Number really matters: ");
        Boolean luckyNumberBoolean = scanBool.nextBoolean();
        System.out.println(luckyNumberBoolean);

        // Taking Input as Char or String

        Scanner scanString = new Scanner(System.in);
        System.out.print("What is  the first word of your lucky number: ");
        String luckyNumberString = scanString.nextLine();
        System.out.println(luckyNumberString);
    }
}
