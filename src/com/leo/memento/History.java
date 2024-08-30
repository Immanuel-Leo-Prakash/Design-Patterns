package com.leo.memento;
import java.util.List;
import java.util.ArrayList;

public class History {
    List<EditorState> states = new ArrayList<>();
    public void push(EditorState state){
        states.add(state);
    }
    public EditorState pop(){
        var lastIndex = states.size()-1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
