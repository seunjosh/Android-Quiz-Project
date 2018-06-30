package com.example.josh.quizmeapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity {




    /**
     * Variable declaration
     **/
    final int qANSWER1 = R.id.question_1_fourth;
    final int qAnswer2 = R.id.question_2_second_ansa;
    final int qANSWER3 = R.id.questionThree;
    final int qANSWER4 = R.id.question_4_2option;
    final int qANSWER5 = R.id.question_5_pr;
    final int qANSWER6 = R.id.question_6_cy;
    final int q7ANSWER = R.id.question_7_first;

    /**
     * End Variable declaration
     **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Method for quiz button
     **/
    public void quizChecker(View view) {

        ArrayList<String> badAnswers = new ArrayList<String>();
        int correctAnswers = 0;

        if (questionOne()) {
            correctAnswers++;
        } else {
            badAnswers.add("questionOne");
        }

        if (questionTwo()) {
            correctAnswers++;
        } else {
            badAnswers.add("questionTwo");
        }


        if (questionThree()) {
            correctAnswers++;
        } else {
            badAnswers.add("questionThree");
        }


        if (questionFour()) {
            correctAnswers++;
        } else {
            badAnswers.add("questionFour");
        }


        if (questionFive()) {
            correctAnswers++;
        } else {
            badAnswers.add("questionFive");
        }


        if (questionSix()) {
            correctAnswers++;
        } else {
            badAnswers.add("questionSix");
        }

        if (questionSeven()) {
            correctAnswers++;
        } else {
            badAnswers.add("questionSeven");
        }

        StringBuilder storeResult = new StringBuilder();
        for (String s : badAnswers) {
            storeResult.append(s);
            storeResult.append("\n");
        }

        //text field for name
        EditText nameField = (EditText) findViewById(R.id.text_input);
        String stName = nameField.getText().toString();
        Context ctext = getApplicationContext();

        CharSequence text = stName +"  " + "You got " + correctAnswers + "/7 answers right.\n \n Wrong Answers :\n" + storeResult.toString();
        int duration = Toast.LENGTH_SHORT;

        Toast shToast = Toast.makeText(ctext,   text, duration);
        shToast.show();

    }


    private boolean questionOne() {
        RadioGroup raGp = (RadioGroup) findViewById(R.id.question1_group);

        if (raGp.getCheckedRadioButtonId() == qANSWER1) {

            return true;
        }
        return false;
    }


    private boolean questionTwo() {

        RadioGroup radgp = (RadioGroup) findViewById(R.id.question_2_group);

        if (radgp.getCheckedRadioButtonId() == qAnswer2) {

            return true;
        }
        return false;
    }


    private boolean questionThree() {

        RadioGroup radg = (RadioGroup) findViewById(R.id.question_3_group);

        if (radg.getCheckedRadioButtonId() == qANSWER3) {

            return true;
        }
        return false;
    }


    private boolean questionFour() {

        RadioGroup radgRP = (RadioGroup) findViewById(R.id.question_4_group);

        if (radgRP.getCheckedRadioButtonId() == qANSWER4) {

            return true;
        }
        return false;
    }


    private boolean questionFive() {

        RadioGroup radgRP = (RadioGroup) findViewById(R.id.question_5_Rg);

        if (radgRP.getCheckedRadioButtonId() == qANSWER5) {

            return true;
        }
        return false;
    }


    private boolean questionSix() {

        RadioGroup radgRP = (RadioGroup) findViewById(R.id.question_6_radGrp);

        if (radgRP.getCheckedRadioButtonId() == qANSWER6) {

            return true;
        }
        return false;
    }


    private boolean questionSeven() {

        RadioGroup radgRP = (RadioGroup) findViewById(R.id.question_7_radGrp);

        if (radgRP.getCheckedRadioButtonId() == q7ANSWER) {

            return true;
        }
        return false;
    }

}
