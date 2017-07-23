package me.yanhaonan.chainofresponsibility;

/**
 * Created by Vegeta on 7/23/17.
 */
public class ConcreateHandlerTwo extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getM_value() > 0) {
            System.out.println("Positive values are handled by ConcreteHandlerTwo:");
            System.out.println("\tConcreteHandlerTwo.HandleRequest: " + request.getM_description() + request.getM_value());
        } else {
            m_successor.handleRequest(request);
        }
    }
}
