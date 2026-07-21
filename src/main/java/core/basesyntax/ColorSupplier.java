package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private DifferentColor[] differentColor = DifferentColor.values();

    public String getRandomColor() {

        int colorSupplier = random.nextInt(differentColor.length);
        return differentColor[colorSupplier].name();
    }
}
