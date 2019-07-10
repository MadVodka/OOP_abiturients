package generators;

import holder.NameHolder;

import java.util.Random;

public class NameGenerator {
    private Random random = new Random();

    public String generateFirstName() {
        return NameHolder.firstName[random.nextInt(NameHolder.firstName.length)];

    }

    public String generateSecondName() {
        return NameHolder.secondName[random.nextInt(NameHolder.secondName.length)];
    }
}
