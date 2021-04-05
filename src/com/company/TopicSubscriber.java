package com.company;

public class TopicSubscriber implements Observer{

    private String name;
    private Observable topic;

    public TopicSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(){
        if (this.topic == null){
            System.out.println(this.getName() + " has no topic yet" );
            return;
        }
       String latestTopic = this.topic.getUpdate();
       System.out.println(this.name + "received update:" + latestTopic);
    }

    @Override
    public void setTopic(Observable topic){
        this.topic = topic;
    }

    public String getName(){
        return name;
    }
}
