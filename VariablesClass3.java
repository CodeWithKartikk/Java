public class VariablesClass3 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Variables - These are the buckets where we can store the values of any
        // dataType.
        // datatype varriableName = Value; ---> General way of creating variables
      
        String stringVariable = "Hello"; // String Variable
        System.out.println(stringVariable);

        int integerVariable = 7; // variableName --> Camelcasing // Integer Variable
        System.out.println(integerVariable);

        float floatVariable = 55.9f;
        // In case of Java it simply stores decimal numbers in double datatype but if we
        // want to store as float
        // then we have to write 'f' after the value like this 55.5f.
        System.out.println(floatVariable);

        char characterVariable = 'A'; // "" -> String, '' -> Character
        System.out.println(characterVariable);

        boolean booleanVariable = true; // true and false
        System.out.println(booleanVariable);

        String strVariable = "John";
        System.out.println(strVariable);

        // create the variable in the first line and after creating store the value in
        // the next line
        int myNum;
        myNum = 87;
        System.out.println(myNum);

        boolean myBoolean;
        myBoolean = false;
        System.out.println(myBoolean);
    }
}
