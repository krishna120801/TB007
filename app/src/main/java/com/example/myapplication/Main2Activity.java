package com.example.myapplication;
import java.util.Random;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    int attempts = 0;
    final int maxAttempts = 3;
    Random randGen = new Random();
    int ranNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView textResponse = (TextView) findViewById(R.id.textView4);
        final TextView guessText = (TextView) findViewById(R.id.textView5);
        final EditText userGuess = (EditText) findViewById(R.id.editText);

        Button pressMe = (Button) findViewById(R.id.button5);

        randGen = new Random();
        ranNum = randGen.nextInt(5);
        pressMe.setOnClickListener(new View.OnClickListener()
                                   {
                                       public void onClick(View v) {
                                           String randText = "";
                                           Random randGen = new Random();
                                           int ranNum = randGen.nextInt(5);
                                           int userNumber = Integer.parseInt(userGuess.getText().toString());


                                           if (userNumber > 19) {
                                               guessText.setText("Please guess between 0 and 20");
                                           } else if (userNumber < ranNum) {
                                               guessText.setText("Your answer is low. Guess again!");
                                               guessText.setBackgroundColor(Color.CYAN);
                                           } else if (userNumber > ranNum) {
                                               guessText.setText("Your answer is high.  Guess again!");
                                               guessText.setBackgroundColor(Color.RED);
                                           } else if (userNumber == ranNum) {
                                               ranNum = randGen.nextInt(5);
                                               guessText.setText("You did it!");
                                               guessText.setBackgroundColor(Color.WHITE);
                                           }

                                           while (ranNum != userNumber && ++attempts < maxAttempts) {

                                               if (attempts == maxAttempts) {

                                                   guessText.setText("You have guessed three times.  The answer was " + ranNum);
                                              guessText.setBackgroundColor(Color.GREEN); }
                                           }
                                           randText = Integer.toString(ranNum);
                                           textResponse.setText("");

                                           userGuess.setText("");
                                       }
                                   }
        );
    }
}

