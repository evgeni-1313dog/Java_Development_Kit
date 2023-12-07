package SemDz2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Developer> developers = new ArrayList<>();

        int tempInt = rand.nextInt(0, 100);
        for (int i = 0; i < tempInt; i++) {
            if (rand.nextBoolean()) {
                developers.add(new Frontender());
            } else {
                developers.add(new Backender());
            }

        }

        for (Developer developer : developers) {
            checkSpec(developer);
        }

        var test1 = new BackendAction() {
            @Override
            public void back() {

            }

        };


        var test2 = new BackendAction() {
            @Override
            public void back() {

            }

       };

        System.out.println(test1.getClass().toString());
        System.out.println(test2.getClass().toString());
    }

    static void checkSpec(Developer developer) {
        if (developer instanceof FrontAction) {
            ((FrontAction) developer).developGUI();
        } else {
            System.out.println("Create GUI not supported by this Developer");
        }

    }
}