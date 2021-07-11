public class OperatorsClass6 {
    // Java Operators
    // Operators : Operators are used to perform operations on variables and values
    // a = 5, b = 7, c = a + b => c = 5 + 7 (performing operations on variables and
    // values)
    public static void main(String[] args) {
        int x = 100 + 50;
        System.out.println(x);   

        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        /*
        Java divides the operators into the following groups:
           > Arithmetic Operators
           > Assignment Operators
           > Comparison Operators
           > Logical Operators
           > Bitwise Operators
        */
        
        /* Arithmetic Operators
    
        Operator     Name            Example          Description
            +      Addition            x+y          Adds together two values
            -     Subtraction          x-y          Subtracts one value from another 
            *     Multiplication       x*y          Muliplies two values
            /        Division          x/y          Divides one value by another
            %        Modulus           x%y          Returns the Division remainder
            ++       Increment       ++x or x++     increases the value of a variable by 1
            --       Decrement       --x or x--     decreases the value of a variable by 1
        */

        // Addition
        int x = 9;
        int y = 6;
        System.out.println(x+y);

        // Subtraction
        System.out.println(x-y);

        // Multiplication
        System.out.println(x*y);

        // Division
        System.out.println((float)x/y);

        // Modulus
        System.out.println(x%y);

        // Increment Operator
        // We have two types of Increment operators
        // Pre Increment (++x => First inc the value by 1 and then update or assign the value to a given variable)
        // Post Increment (x++ => First assign the value and then increase the value by 1)

        int k = 7;
        System.out.println(++k);
        System.out.println(k++);
        System.out.println(k);

        // Decrement 
        System.out.println(--k);
        System.out.println(k--);
        System.out.println(k);

        /* 
        Assignment Operator (= is the assignment operator)
        Operator     Example     Same as
           =          x = 5       x = 5
          +=          x += 5     x = x + 5
          -=          x -= 5     x = x - 5
          *=          x *= 5     x = x * 5
          /=          x /= 5     x = x / 5
          %=          x %= 5     x = x % 5 
          &=          x &= 5     x = x & 5 
          |=          x |= 5     x = x | 5 
          ^=          x ^= 5     x = x ^ 5 
        >>=          x >>= 5     x = x >> 5 
        <<=          x <<= 5     x = x << 5
        */
    }
}
