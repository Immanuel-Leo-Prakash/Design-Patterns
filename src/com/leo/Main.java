package com.leo;

import com.leo.memento.Editor;
import com.leo.memento.History;

import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
       var editor = new Editor();
       var history = new History();
       editor.setContent("0");
       history.push(editor.createState());
       editor.setContent("1");
       history.push(editor.createState());
       editor.setContent("2");
       editor.restore(history.pop());
       System.out.println(editor.getContent());
    }
}