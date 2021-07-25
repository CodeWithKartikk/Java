// Java Strings

public class Strings {
    public static void main(String[] args) {
        // A string is collection of characters surrounded by the double quotes.
        // String greet =  "Hello Ishaan";
        String txt = "KartiK KathuriA is a Web Developer";

        // Length string Function
        System.out.println("The length of the string is: " + txt.length());

        // Upper Case String Function
        System.out.println(txt.toUpperCase());

        // Lower Case String Function
        System.out.println(txt.toLowerCase());

        // indexOf() String Function 
        System.out.println(txt.indexOf("Web"));

        // String Concatenation 

        // First way of String Concatenation
        String a = "Good Afternoon";
        String b = " Ishaan";
        String c = a + b;
        System.out.println(c);

        // Second Way of String Concatenation
        System.out.println(a.concat(b));
    
        // a = "Ishaan's Mood is very "sleepy" today because today is sunday"
        // (\) -> \', \", \\
        String escChar = "Ishaan\'s Mood is very \"sleepy\"  today because today is \"sunday\"";
        System.out.println(escChar);
    }
}
