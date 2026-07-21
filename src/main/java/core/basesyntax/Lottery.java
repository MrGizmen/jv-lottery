package core.basesyntax;

import java.util.Random;

public class Lottery {

    private static final int MAX_RANDOM_BOUND = 101;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomNumberSupplier = new Random();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int number = randomNumberSupplier.nextInt(MAX_RANDOM_BOUND);
        return new Ball(color, number);
    }
}
