package com.example.biologyquizapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import com.example.biologyquizapplication.model.Question;
import com.example.biologyquizapplication.model.UserAnswersModule;

import java.util.ArrayList;

public class EndGameActivity extends AppCompatActivity {

    private LinearLayoutCompat container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_game);

        TextView textViewEndGameScore = findViewById(R.id.textViewEndGameScore);
        container = findViewById(R.id.linearLayoutContainer);


        ArrayList<Question> questions = UserAnswersModule.usedQuestions;

        for (Question q : questions ) {
            addCard(q);

        }

        String scoreText = UserAnswersModule.score + "PT";
        textViewEndGameScore.setText(scoreText);
    }

    private void addCard(Question question){
        String questionText = question.getQuestion();
        String correctAnswer = question.getAnswers()[question.getRightAnswer()];

        @SuppressLint("InflateParams")
        View view = getLayoutInflater().inflate(R.layout.question_overview, null);
        TextView textViewQuestion = view.findViewById(R.id.textViewEndGameQuestion);
        TextView textViewAnswer = view.findViewById(R.id.textViewEndGameAnswer);

        textViewQuestion.setText(questionText);
        textViewAnswer.setText(correctAnswer);

        container.addView(view);
    }
}