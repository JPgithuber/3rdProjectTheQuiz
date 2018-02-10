package com.example.android.quizzapplesson12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int totalScore = 0;
    int q1 = 0;
    int q2 = 0;
    int q3 = 0;
    int q4 = 0;
    int q5 = 0;
    int q6 = 0;
    int q7 = 0;
    int q8 = 0;

    //this method adds 1 or zero points to question one (RadioButton1 is the correct answer).
    public void q1() {
        RadioButton q1RadioButton1 = findViewById(R.id.q1RadioButton1);
        q1 = 0;
        if (q1RadioButton1.isChecked()) {
            q1 = 1;
        }
    }

    //this method adds one or zero points to question two (RadioButton1 is the correct answer).
    public void q2() {
        RadioButton q2RadioButton1 = findViewById(R.id.q2RadioButton1);
        q2 = 0;
        if (q2RadioButton1.isChecked()) {
            q2 = 1;
        }
    }

    //this method adds one or zero points to question three (RadioButton1 is the correct answer).
    public void q3() {
        RadioButton q3RadioButton1 = findViewById(R.id.q3RadioButton1);
        q3 = 0;
        if (q3RadioButton1.isChecked()) {
            q3 = 1;
        }
    }

    //this method adds one or zero points to question four (RadioButton1 is the correct answer).
    public void q4() {
        RadioButton q4RadioButton1 = findViewById(R.id.q4RadioButton1);
        q4 = 0;
        if (q4RadioButton1.isChecked()) {
            q4 = 1;
        }
    }

    //this method adds one or zero points to question five (RadioButton1 is the correct answer).
    public void q5() {
        RadioButton q5RadioButton1 = findViewById(R.id.q5RadioButton1);
        q5 = 0;
        if (q5RadioButton1.isChecked()) {
            q5 = 1;
        }
    }

    //this method adds one or zero points to question six ("Android" is the correct answer).
    public void q6() {
        //finds the answer of question 6 and stores it in variable answer6
        EditText answerForQ6 = (EditText) findViewById(R.id.answer6);
        String stringForAnswer6 = answerForQ6.getText().toString();
        String correctAnswer = getResources().getString(R.string.correct_answer);
        q6 = 0;
        if (stringForAnswer6.equals(correctAnswer)) {
            q6 = 1;
        }
    }

    //ads one or zero points to question seven (Checkbox1 and/or Checkbox2 are correct)
    public void q7() {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        if (checkBox1.isChecked()) {
            q7 = 1;
        } else if (checkBox2.isChecked()) {
            q7 = 1;
        }
        if (checkBox3.isChecked()) {
            q7 = 0;
        }
        if (checkBox4.isChecked()) {
            q7 = 0;
        }
    }

    //ads one or zero points to question eight (RadioButton1 is the correct one)
    public void q8() {
        RadioButton q8RadioButton1 = findViewById(R.id.q8RadioButton1);
        q8 = 0;
        if (q8RadioButton1.isChecked()) {
            q8 = 1;
        }
    }

    //this method calculates the number of right answers/points.
    public void totalRightAnswers(View view) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        totalScore = q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8;
        String totalRightAnswers = getString(R.string.tresult);
        switch (totalScore) {
            // adds all the scenarios of right answers and assigns a string that will be displayed depending on the totalScore
            case 0:
                totalScore = 0;
                totalRightAnswers = ("ZERO right answers...You are a TOTAL FAKE ANDROIDER ! Move on !");
                break;
            case 1:
                totalScore = 1;
                totalRightAnswers = ("1 Right answer :( FAKE ANDROIDER DETECTED, calling Security Staff!");
                break;
            case 2:
                totalScore = 2;
                totalRightAnswers = ("2 right answers only. You may own one Iphone. Keep off!");
                break;
            case 3:
                totalScore = 3;
                totalRightAnswers = ("3 right answers, sorry you are on the way to hell, no way back");
                break;
            case 4:
                totalScore = 4;
                totalRightAnswers = ("4 right answers, Good job but you are at risk of getting infected by iOS. Avoid Iphone users");
                break;
            case 5:
                totalScore = 5;
                totalRightAnswers = ("5 right answers ! You are on the right way");
                break;
            case 6:
                totalScore = 6;
                totalRightAnswers = ("6 right answers ! well done!, you are almost next to master it ");
                break;
            case 7:
                totalScore = 7;
                totalRightAnswers = ("7 right answers ! Excellent! you are next to master it !");
                break;
            case 8:
                totalScore = 8;
                totalRightAnswers = ("8 right answers ! Thats Perfection! Congrats! You've mastered it!");
                break;
        }
        displayTotalRightAnswers(totalRightAnswers);
    }

    //this method displays a message with the result and name of the user (I wish!!).
    public void displayTotalRightAnswers(String totalRightAnswers) {


        // finds result and stores it in TextView totalRightAnswers
        TextView totalRightAnswersTextView = (TextView) findViewById(R.id.result);
        totalRightAnswersTextView.setText("" + totalRightAnswers);
    }
    //this method resets the scores, and show a toast message

    public void resetThequizz(View view) {

        RadioGroup q1 = findViewById(R.id.RadioGroup1);
        q1.clearCheck();
        RadioGroup q2 = findViewById(R.id.RadioGroup2);
        q2.clearCheck();
        RadioGroup q3 = findViewById(R.id.RadioGroup3);
        q3.clearCheck();
        RadioGroup q4 = findViewById(R.id.RadioGroup4);
        q4.clearCheck();
        RadioGroup q5 = findViewById(R.id.RadioGroup5);
        q5.clearCheck();
        EditText answerForQ6 = (EditText) findViewById(R.id.answer6);
        answerForQ6.setText(null);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox1);
        checkBox1.setChecked(false);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox2);
        checkBox2.setChecked(false);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkBox3.setChecked(false);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkbox4);
        checkBox4.setChecked(false);
        RadioGroup q8 = findViewById(R.id.RadioGroup7);
        q8.clearCheck();
        String tresult = "Your result will be shown here once you submit your answers";
        displayTotalRightAnswers(tresult);
        Toast.makeText(this, "This quizz has been reseted!", Toast.LENGTH_LONG).show();
    }
}
