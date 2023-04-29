package com.example.biologyquizapplication.model;

import java.util.ArrayList;
import java.util.Random;

public class QuestionDataAccess {
    private ArrayList<Question> questions;

    public QuestionDataAccess() {
        questions = new ArrayList<>();
        questions.add(new Question("What is the capital of the United States of America?",
                new String[]{"New York City", "Washington D.C", "Los Angeles", "Chicago"},1));
        questions.add(new Question("What is the largest planet in our solar system?",
                new String[]{"Venus", "Mars", "Jupiter", "Saturn"},2));
        questions.add(new Question("Which continent is the largest in the world?",
                new String[]{"Asia", "North America", "Africa", "Europe"},0));
        questions.add(new Question("What is the name of the closest star to our planet Earth?",
                new String[]{"The Sun", "Sirius", "Alpha Centauri", "Betelgeuse"},0));
        questions.add(new Question("Which animal is the fastest on land?",
                new String[]{"Giraffe", "Lion", "Elephant", "Cheetah"},3));
    }

    public Question getRandomQuestion(){
        if (questions.isEmpty()){
            return null;
        }
        Question question = questions.get(new Random().nextInt(questions.size()));
        questions.remove(question);
        return question;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
