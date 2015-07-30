package com.reciprocity.recipes.events;

public interface EventChannel {

    void sinkEvent(Event event);

}
