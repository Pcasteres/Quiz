package es.hotmail.pcasteres.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private TextView answerText, questionText;
    private Button trueButton, falseButton, cheatButton, nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //fijar layout activity
        setContentView(R.layout.activity_main);

        //me da el objeto componente "answer"
        findViewById(R.id.answerText);

        //acceder a componente del layout
        answerText = findViewById(R.id.answerText);
        questionText = findViewById(R.id.questionText);

        trueButton = findViewById(R.id.trueButton);
        falseButton = findViewById(R.id.falseButton);
        nextButton = findViewById(R.id.nextButton);
        cheatButton = findViewById(R.id.cheatButton);



    }
    public void onFalseButtonClicked(View view){
        Log.e( tag: "MainActivity", msg: "onFalseButtonClicked()");
        answerText.setText(R.string.falseButtomLabel);
    }
    public void onTrueButtonClicked(View view){
        Log.e( tag: "MainActivity", msg: "onTrueButtonClicked()");
        answerText.setText(R.string.trueButtomLabel);

    }

}
