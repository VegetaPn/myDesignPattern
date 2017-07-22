package me.yanhaonan.template;

/**
 * Created by Vegeta on 7/22/17.
 */
public abstract class Trip {
    public void performTrip() {
        doComingTransport();
        doDayA();
        doDayB();
        doDayC();
        doReturningTransport();
    }

    public abstract void doComingTransport();

    public abstract void doDayA();

    public abstract void doDayB();

    public abstract void doDayC();

    public abstract void doReturningTransport();
}
