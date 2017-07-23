package me.yanhaonan.chainofresponsibility;

/**
 * Created by Vegeta on 7/23/17.
 */
public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreateHandlerOne();
        Handler handler2 = new ConcreateHandlerTwo();
        Handler handler3 = new ConcreateHandlerThree();
        handler1.setM_successor(handler2);
        handler2.setM_successor(handler3);

        handler1.handleRequest(new Request("", -1));
        handler1.handleRequest(new Request("", 0));
        handler1.handleRequest(new Request("", 1));
        handler1.handleRequest(new Request("", 3));
        handler1.handleRequest(new Request("", 5));
    }
}
