package siwithcollection;

import java.util.List;

public class Question {
    private int id;
    private String name;
    private List<String> answers;


    public void displayInfo(){
        System.out.println(id+" "+name);
        System.out.println(answers);

    }

}
