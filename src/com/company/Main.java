package com.company;

public class Main {

    public static void main(String[] args) {
        Topic topic = new Topic();

        Observer obs1 = new TopicSubscriber("Reader 01");
        Observer obs2 = new TopicSubscriber("Reader 02");
        Observer obs3 = new TopicSubscriber("Reader 03");

        topic.subscribe(obs1);
        topic.subscribe(obs2);
        topic.subscribe(obs3);

        topic.setTopic("Breaking News Covid 19 strikes");

        topic.setTopic("Elections in Bulgaria 2021");
    }
}
