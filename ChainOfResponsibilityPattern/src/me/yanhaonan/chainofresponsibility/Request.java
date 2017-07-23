package me.yanhaonan.chainofresponsibility;

/**
 * Created by Vegeta on 7/23/17.
 */
public class Request {
    private int m_value;
    private String m_description;

    public Request(String description, int value) {
        m_description = description;
        m_value = value;
    }

    public int getM_value() {
        return m_value;
    }

    public void setM_value(int m_value) {
        this.m_value = m_value;
    }

    public String getM_description() {
        return m_description;
    }

    public void setM_description(String m_description) {
        this.m_description = m_description;
    }
}
