package com.reciprocity.recipes.events;

public interface Event {
    EventHeader getEventHeader();

    EventBody getEventBody();
}
