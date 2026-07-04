package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    Random randomNumberSupplier = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = randomNumberSupplier.nextInt(101);
        return new Ball(color, number);
    }

}
