package me.yanhaonan.template;

/**
 * Created by Vegeta on 7/22/17.
 */
public class Main {
    public static void main(String[] args) {
        Trip tripA = new PackageA();
        tripA.performTrip();

        Trip tripB = new PackageB();
        tripB.performTrip();
    }
}
