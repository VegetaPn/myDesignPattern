package me.yanhaonan.chainofresponsibility;

/**
 * Created by Vegeta on 7/23/17.
 */
public class ConcreateHandlerThree extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getM_value() == 0) {
            System.out.println("Zero values are handled by ConcreteHandlerThree:");
            System.out.println("\tConcreteHandlerThree.HandleRequest : " + request.getM_description() + request.getM_value());
        } else {
            m_successor.handleRequest(request);
        }
    }
}
