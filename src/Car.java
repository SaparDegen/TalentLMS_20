import java.io.IOException;

public class Car implements AutoCloseable{

    public void drive() {
        System.out.println("Mashina jurup jatat");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Mashina jabylyp jatat");
    }
}
