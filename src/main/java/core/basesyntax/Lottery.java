package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    Random randomNumberSupplier = new Random();
    private static final int MAX_RANDOM_BOUND = 101;

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = randomNumberSupplier.nextInt(MAX_RANDOM_BOUND);
        return new Ball(color, number);
    }
}
