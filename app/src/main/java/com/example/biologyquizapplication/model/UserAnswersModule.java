package com.example.biologyquizapplication.model;

import java.util.ArrayList;

public class UserAnswersModule {
    public static ArrayList<Question> usedQuestions = new ArrayList<>();
    public static ArrayList<Question> correctQuestions = new ArrayList<>();
    public static ArrayList<Question> wrongQuestions = new ArrayList<>();

    public static int score = 0;
}
