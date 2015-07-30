package com.reciprocity.recipes.events;

public interface EventProcessingEngine {
    void notifyListeners();

    void registerListener(EventListener listener);
}
