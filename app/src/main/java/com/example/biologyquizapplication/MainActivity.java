package com.example.biologyquizapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

import com.example.biologyquizapplication.model.Question;
import com.example.biologyquizapplication.model.QuestionDataAccess;

import org.w3c.dom.Text;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    private TextView textViewQuestion;
    private TextView textViewScore;
    private AppCompatButton buttonAnswer0;
    private AppCompatButton buttonAnswer1;
    private AppCompatButton buttonAnswer2;
    private AppCompatButton buttonAnswer3;
    private AppCompatButton buttonNext;

    private QuestionDataAccess questionDataAccess;

    private boolean canAdvance = false;
    private String scoreText = "Score: 0";
    private int SCORE = 0;


    private final int MAX_QUESTIONS = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewQuestion = findViewById(R.id.textViewQuestion);
        textViewScore = findViewById(R.id.textViewScore);
        buttonAnswer0 = findViewById(R.id.buttonAnswer1);
        buttonAnswer1 = findViewById(R.id.buttonAnswer2);
        buttonAnswer2 = findViewById(R.id.buttonAnswer3);
        buttonAnswer3 = findViewById(R.id.buttonAnswer4);
        buttonNext = findViewById(R.id.buttonNext);


        questionDataAccess = new QuestionDataAccess();

        buttonNext.setOnClickListener(e -> {
            if (canAdvance)
                setNewQuestion();
        });

        startGame();

    }

    private void startGame() {
        textViewScore.setText(scoreText);
        setNewQuestion();
    }

    private void setNewQuestion() {
        Question question = questionDataAccess.getRandomQuestion();
        if (question == null){
            endGame();
            return;
        }
        String questionString = question.getQuestion();
        String[] questionAnswers = question.getAnswers();
        AtomicInteger atomicCorrectAnswer = new AtomicInteger(question.getRightAnswer());

        textViewQuestion.setText(questionString);

        AppCompatButton[] answerButtons = {buttonAnswer0, buttonAnswer1, buttonAnswer2, buttonAnswer3 };
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i].setText(questionAnswers[i]);
            answerButtons[i].setBackgroundResource(R.drawable.answer_button);
            answerButtons[i].setTextColor(getResources().getColor(R.color.my_white));

        }


        for (int i = 0; i < answerButtons.length; i++) {
            int answerIndex = i;
            int finalI = i;
            answerButtons[i].setOnClickListener(e -> {
                int correctAnswer = atomicCorrectAnswer.get();
                if (correctAnswer == answerIndex)
                    answeredCorrect(answerButtons[finalI]);
                else
                    answeredWrong(answerButtons[finalI],answerButtons[correctAnswer]);
                canAdvance = true;
                scoreText = "Score: " + SCORE;
                textViewScore.setText(scoreText);
            });
        }
    }

    private void answeredWrong(AppCompatButton thisButton, AppCompatButton correctButton) {
        Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
        thisButton.setBackgroundResource(R.drawable.answer_button_wrong);
        thisButton.setTextColor(getResources().getColor(R.color.red));
        correctButton.setBackgroundResource(R.drawable.answer_button_correct);
        correctButton.setTextColor(getResources().getColor(R.color.aqua));

    }

    private void answeredCorrect(AppCompatButton thisButton) {
        Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        thisButton.setBackgroundResource(R.drawable.answer_button_correct);
        thisButton.setTextColor(getResources().getColor(R.color.aqua));
        SCORE += 10;

    }

    private void endGame() {
        Toast.makeText(this, "Finished All Questions", Toast.LENGTH_SHORT).show();
    }
}