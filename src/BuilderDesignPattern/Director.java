package BuilderDesignPattern;

public class Director {
    public void buildBugatti(Builder builder) {
        builder.brand("bugatti")
                .color("blue")
                .id(123)
                .model("abc");
    }

    public void buildLambo(CarBuilder builder) {
        builder.brand("lamborghini")
                .model("xyz")
                .id(456)
                .color("black");

    }
    public static void main(String arg[]) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        Car car = builder.build();
        System.out.println(car);
    }
}
