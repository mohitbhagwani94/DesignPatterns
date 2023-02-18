package BuilderDesignPattern;

public class Client {
    public static void main(String arg[]) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        Car car = builder.build();
        System.out.println(car);
    }

}
