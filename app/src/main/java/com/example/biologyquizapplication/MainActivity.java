package com.example.biologyquizapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.biologyquizapplication.model.Question;
import com.example.biologyquizapplication.model.QuestionDataAccess;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    private TextView textViewQuestion;
    private AppCompatButton buttonAnswer0;
    private AppCompatButton buttonAnswer1;
    private AppCompatButton buttonAnswer2;
    private AppCompatButton buttonAnswer3;

    QuestionDataAccess questionDataAccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewQuestion = findViewById(R.id.textViewQuestion);
        buttonAnswer0 = findViewById(R.id.buttonAnswer1);
        buttonAnswer1 = findViewById(R.id.buttonAnswer2);
        buttonAnswer2 = findViewById(R.id.buttonAnswer3);
        buttonAnswer3 = findViewById(R.id.buttonAnswer4);

        questionDataAccess = new QuestionDataAccess();

        // Get a random question
        Question question = questionDataAccess.getRandomQuestion();
        String questionString = question.getQuestion();
        String[] questionAnswers = question.getAnswers();
        AtomicInteger correctAnswer = new AtomicInteger(question.getRightAnswer());

        textViewQuestion.setText(questionString);
        buttonAnswer0.setText(questionAnswers[0]);
        buttonAnswer1.setText(questionAnswers[1]);
        buttonAnswer2.setText(questionAnswers[2]);
        buttonAnswer3.setText(questionAnswers[3]);

        buttonAnswer0.setOnClickListener(e -> {
            if (correctAnswer.get() == 0)
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        });
        buttonAnswer1.setOnClickListener(e -> {
            if (correctAnswer.get() == 1)
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        });
        buttonAnswer2.setOnClickListener(e -> {
            if (correctAnswer.get() == 2)
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        });
        buttonAnswer3.setOnClickListener(e -> {
            if (correctAnswer.get() == 3)
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        });

    }
}