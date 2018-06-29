package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Score is the score for the answers answered correctly
    int score = 0;
    Button submitB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitB =(Button) findViewById(R.id.submit_button);
        submitB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){


                if (((RadioButton) findViewById(R.id.question1_radio3_button)).isChecked()){score++;}

                if (((CheckBox)findViewById(R.id.question2_check_box2)).isChecked()) {score++;}
                if (((CheckBox)findViewById(R.id.question2_check_box4)).isChecked()) {score++;}
                if (((RadioButton)findViewById(R.id.question3_radio1_button)).isChecked()) {score++;}
                if (((RadioButton)findViewById(R.id.question4_radio3_button)).isChecked()) {score++;}
                if (((RadioButton)findViewById(R.id.question5_radio4_button)).isChecked()) {score++;}
                if (((RadioButton) findViewById(R.id.question6_radio4_button)).isChecked()){score++;}
                if (((RadioButton) findViewById(R.id.question7_radio2_button)).isChecked()){score++;}
                if (((RadioButton) findViewById(R.id.question8_radio2_button)).isChecked()){score++;}


                /**
                 * Checks the Text Input from user as againts the text expected
                 * The case is ignored
                 *
                 */

                EditText textForHiv = (EditText)findViewById(R.id.edit1_text_view);
                String textReceived =  textForHiv.getText().toString();
                if (textReceived .equalsIgnoreCase ("Human immunodeficiency virus")){score++;}


                EditText textForAids = (EditText)findViewById(R.id.edit2_text_view);
                String textReceived2 =  textForAids.getText().toString();
                if (textReceived2 .equalsIgnoreCase ("Acquired Immune Deficiency Syndrome")){score++;}

                /**
                 * Displays the Score
                The TextView Displays the Score, scored from the quiz
                 */
                TextView quantityTextView = (TextView) findViewById(R.id.answer_text_view);
                quantityTextView.setText("You Answered " + score +" Correctly");


                //Sets or makes the submit button unclickable, to avoid iterating the process
                submitB.setEnabled(false);
            }

        });

        }
    /**
     * This method is called when the restart button is clicked.
     */
        public  void restart(View view){
            //Sets or makes the submit button clickable
            submitB.setEnabled(true);
            //The next line of code clears the value of score and makes it zero
            score = 0;

            //The lines of code clears the checked state of the Checkboxes, RadioButtons and EditText Views

            RadioGroup q1 = (RadioGroup) findViewById(R.id.question1_radio_group);
            q1.clearCheck();

            CheckBox ck1 = (CheckBox)findViewById(R.id.question2_check_box1);
            ck1.setChecked(false);
            CheckBox ck2 = (CheckBox)findViewById(R.id.question2_check_box2);
            ck2.setChecked(false);
            CheckBox ck3 = (CheckBox)findViewById(R.id.question2_check_box3);
            ck3.setChecked(false);
            CheckBox ck4 = (CheckBox)findViewById(R.id.question2_check_box4);
            ck4.setChecked(false);

            RadioGroup q3 = (RadioGroup) findViewById(R.id.question3_radio_group);
            q3.clearCheck();
            RadioGroup q4 = (RadioGroup) findViewById(R.id.question4_radio_group);
            q3.clearCheck();
            RadioGroup q5 = (RadioGroup) findViewById(R.id.question5_radio_group);
            q5.clearCheck();
            RadioGroup q6 = (RadioGroup) findViewById(R.id.question6_radio_group);
            q6.clearCheck();
            RadioGroup q7 = (RadioGroup) findViewById(R.id.question7_radio_group);
            q7.clearCheck();
            RadioGroup q8 = (RadioGroup) findViewById(R.id.question8_radio_group);
            q8.clearCheck();
            EditText text1 = (EditText) findViewById(R.id.edit1_text_view);
            text1.setText("");
            EditText text2 = (EditText) findViewById(R.id.edit1_text_view);
            text2.setText("");

            TextView quantityTextView = (TextView) findViewById(R.id.answer_text_view);
            quantityTextView.setText("");
}
    /**
     * This method changes the color of the RadioButtons, CheckBoxes that contains the correct
     * text and also displays the correct text for the the EditText
     * */
    public  void checkAnswers(View view) {
        RadioButton newButton1 = (RadioButton) findViewById(R.id.question1_radio3_button);
        newButton1.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        CheckBox newCheckBox1 = (CheckBox) findViewById(R.id.question2_check_box2);
        newCheckBox1.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        CheckBox newCheckBox2 = (CheckBox) findViewById(R.id.question2_check_box4);
        newCheckBox2.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        RadioButton newButton3 = (RadioButton) findViewById(R.id.question3_radio1_button);
        newButton3.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        RadioButton newButton4 = (RadioButton) findViewById(R.id.question4_radio3_button);
        newButton4.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        RadioButton newButton5 = (RadioButton) findViewById(R.id.question5_radio4_button);
        newButton5.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        RadioButton newButton6 = (RadioButton) findViewById(R.id.question6_radio4_button);
        newButton6.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        RadioButton newButton7 = (RadioButton) findViewById(R.id.question7_radio2_button);
        newButton7.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        RadioButton newButton8 = (RadioButton) findViewById(R.id.question8_radio2_button);
        newButton8.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        EditText textForHiv = (EditText)findViewById(R.id.edit1_text_view);
        textForHiv.setText("Human immunodeficiency virus");
        textForHiv.setTextColor(getResources().getColor(R.color.colorPrimaryDark));


        EditText textForAids = (EditText)findViewById(R.id.edit2_text_view);
        textForAids.setText("Acquired Immune Deficiency Syndrome");
        textForAids.setTextColor(getResources().getColor(R.color.colorPrimaryDark));


    }


    }
