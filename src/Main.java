import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try(Car car = new Car()) {
            car.drive();
            System.out.println(Integer.parseInt("g"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("The number format is required, exception ignored");
        }
        System.out.println("Mashina jabyk turat");
    }
}