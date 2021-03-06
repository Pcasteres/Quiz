package es.hotmail.pcasteres.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

        private TextView answerText, questionText;
        private Button trueButton, falseButton, cheatButton, nextButton;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //fijar layout activity
        setContentView(R.layout.activity_main);

        //acceder a componente del layout
        answerText = findViewById(R.id.answerText);
        questionText = findViewById(R.id.questionText);
        trueButton = findViewById(R.id.trueButton);
        falseButton = findViewById(R.id.falseButton);
        nextButton = findViewById(R.id.nextButton);
        cheatButton = findViewById(R.id.cheatButton);

        }
    public void onFalseButtonClicked(View view) {
        Log.e("MainActivity",  "onFalseButtonClicked()");

        answerText.setText(R.string.falseButtonLabel);
    }

    public void onTrueButtonClicked(View view) {
        Log.e("MainActivity", "onTrueButtonClicked()");

        answerText.setText(R.string.trueButtonLabel);

    }

//Metodo del boton next
public void onNextButtonClicked(View view) {
    Log.e("MainActivity", "onNextButtonClicked");



}




}




