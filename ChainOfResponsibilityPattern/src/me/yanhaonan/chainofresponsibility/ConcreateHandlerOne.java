package me.yanhaonan.chainofresponsibility;

/**
 * Created by Vegeta on 7/23/17.
 */
public class ConcreateHandlerOne extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getM_value() < 0) {
            System.out.println("Negative values are handled by ConcreteHandlerOne:");
            System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getM_description() + request.getM_value());
        } else {
            m_successor.handleRequest(request);
        }
    }
}
