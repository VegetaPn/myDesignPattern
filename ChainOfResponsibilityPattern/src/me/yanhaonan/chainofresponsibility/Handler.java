package me.yanhaonan.chainofresponsibility;

/**
 * Created by Vegeta on 7/23/17.
 */
public abstract class Handler {
    protected Handler m_successor;

    public abstract void handleRequest(Request request);

    public Handler getM_successor() {
        return m_successor;
    }

    public void setM_successor(Handler m_successor) {
        this.m_successor = m_successor;
    }
}
