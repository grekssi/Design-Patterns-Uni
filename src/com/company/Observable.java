package com.company;

public interface Observable {

    void subscribe(Observer observer);
    void unSubscribe(Observer observer);

    void notifyObservers();
    String getUpdate();

}
