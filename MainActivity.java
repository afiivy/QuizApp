package com.example.android.quizapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    /**
     * This method is called when the submitAnswer button is clicked
     */
    public void submitAnswer(View view) {
        /* Quiz taker's name.*/
        EditText nameField = findViewById ( R.id.name_field );
        String name = nameField.getText ().toString ();
        /* Question 1, button 1. Score of 1 is applied when correct answer Flash is selected.*/
        RadioButton flashRadioButton = findViewById ( R.id.flash );
        boolean hasFlash = flashRadioButton.isChecked ();
        if (hasFlash) {
            score++;
        }
        /* Question 1, button 2. Score of 0 is applied for incorrect answer.*/
        RadioButton supermanRadioButton = findViewById ( R.id.superman );
        boolean hasSuperman = supermanRadioButton.isChecked ();
        if (hasSuperman) {
            score = 0;
        }
        /* Question 1, button 3. Score of 0 is applied for incorrect answer.*/
        RadioButton ironmanRadioButton = findViewById ( R.id.ironMan );
        boolean hasIronman = ironmanRadioButton.isChecked ();
        if (hasIronman) {
            score = 0;
        }
        /* Question 2 with correct answer. A score of 1 is added when correct answer is typed*/
        EditText answerBField = findViewById ( R.id.answerBField );
        String answerB = answerBField.getText ().toString ();
        if (answerB.equalsIgnoreCase ( "Superman" )) {
            score++;
        }
        /* Question 3,button 1. Score of 1 is applied when correct answer KillerFrost is selected*/
        RadioButton killerFrostRadioButton = findViewById ( R.id.killerFrost );
        boolean hasKillerFrost = killerFrostRadioButton.isChecked ();
        if (hasKillerFrost) {
            score++;
        }
        /* Question 3,button 2. Score of 0 is applied for incorrect answer.*/
        RadioButton captainColdRadioButton = findViewById ( R.id.captainCold );
        boolean hasCaptainCold = captainColdRadioButton.isChecked ();
        if (hasCaptainCold) {
            score = 0;
        }
        /* Question 3,button 3. Score of 0 is applied for incorrect answer.*/
        RadioButton icemanRadioButton = findViewById ( R.id.iceman );
        boolean hasIceman = icemanRadioButton.isChecked ();
        if (hasIceman) {
            score = 0;
        }
        /* Question 4,box 1 and 2. When boxes 1 and 2 are picked the score of 1 is applied, otherwise the score is 0 */
        CheckBox lokiCheckBox = findViewById ( R.id.loki );
        boolean hasLoki = lokiCheckBox.isChecked ();
        CheckBox thorCheckBox = findViewById ( R.id.thor );
        boolean hasThor = thorCheckBox.isChecked ();
        CheckBox odinCheckBox = findViewById ( R.id.odin );
        boolean hasOdin = odinCheckBox.isChecked ();
        if (hasThor && hasLoki) {
            score++;
            if (hasOdin) {
                score = 0;
            }
        }
        /* Question 5,with correct answer. A score of 1 is added when correct answer is typed*/
        EditText answerField = findViewById ( R.id.answerField );
        String answer = answerField.getText ().toString ();
        if (answer.equalsIgnoreCase ( "Jessica Jones" )) {
            score++;
        }
        /* Question 6,checkbox 1 and 3. When correct boxes 1 and 3 are checked a score of 1 is applied.Otherwise the score is 0*/
        CheckBox oyaCheckBox = findViewById ( R.id.oya );
        boolean hasOya = oyaCheckBox.isChecked ();
        CheckBox stormCheckBox = findViewById ( R.id.storm );
        boolean hasStorm = stormCheckBox.isChecked ();
        CheckBox thunderCheckBox = findViewById ( R.id.thunder );
        boolean hasThunder = thunderCheckBox.isChecked ();
        if (hasOya && hasStorm) {
            score++;
            if (hasThunder) {
                score = 0;
            }
        }
        /*Toast message to reflect score for each question as well as total score for the quiz**/
        if (score == 6) {
            Toast.makeText ( this, "6/6 Great!", Toast.LENGTH_SHORT ).show ();
        }
        if (score == 5) {
            Toast.makeText ( this, "5/6 Please try again", Toast.LENGTH_SHORT ).show ();
        }
        if (score == 4) {
            Toast.makeText ( this, "4/6 Please try again", Toast.LENGTH_SHORT ).show ();
        }
        if (score == 3) {
            Toast.makeText ( this, "3/6 Please try again", Toast.LENGTH_SHORT ).show ();
        }
        if (score == 2) {
            Toast.makeText ( this, "2/6 Please try again", Toast.LENGTH_SHORT ).show ();
        }
        if (score == 1) {
            Toast.makeText ( this, "1/6 Please try again", Toast.LENGTH_SHORT ).show ();
        }
        if (score == 0) {
            Toast.makeText ( this, "0/6 Please try again", Toast.LENGTH_SHORT ).show ();
        }
        score = 0;

    }

    /**
     * This clears all answers and resets quiz
     */
    public void resetScore(View view) {
        Intent i = new Intent ( this, MainActivity.class );
        startActivity ( i );

        Toast.makeText ( this, "Correct Answers \nFlash \nSuperman \nKiller Frost\nLoki&Thor" +
                " \nJessica Jones \nOya&Storm", Toast.LENGTH_LONG ).show ();
    }


}

