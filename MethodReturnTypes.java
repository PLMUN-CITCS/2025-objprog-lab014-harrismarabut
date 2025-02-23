public class MethodReturnTypes {
    public static void main(String[] args) {
        welcomeMessage();
        double avg = calculateAverage(20, 30);
        System.out.println("The average is: " + avg);
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    public static double calculateAverage(int num1, int num2) {
        return (num1 + num2) / 2.0;
    }
}