public class Arrays {
    public static void main(String[] args) {
        // datatype[] variableName;
        // dattype[] variableName = {____, _____, ______, ______}

        String[] cars = { "Volvo", "Ferrari", "Volkswagen", "Skoda", "Rolls Royce" };
        System.out.println(cars[4]);
        cars[0] = "lamborghini";
        System.out.println(cars[0]);

        // Length of an Array
        String[] cars = { "Volvo", "Ferrari", "Volkswagen", "Skoda", "Rolls Royce" };
        System.out.println(cars.length);

        String[] cars = { "Volvo ", "Ferrari ", "Volkswagen ", "Skoda ", "Rolls Royce" };
        for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
        }

        String[] cars = { "Volvo ", "Ferrari ", "Volkswagen ", "Skoda ", "Rolls Royce
        " };
        for (String i : cars) {
        System.out.println(i);
        }

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9, 0 } };
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers.length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
