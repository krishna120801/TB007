package com.example.myapplication;
import java.util.Random;
import java.util.Scanner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public class GussingGame
    {
        public void game(View view)
        { int i;

            Random rand= new Random();
            int g=rand.nextInt(100);
            int t=8;
            Scanner input= new Scanner(System.in);
            String message="";
            System.out.println("Guess a number between 1 to 100:");

            while(t>0)
            {
                System.out.println("\nEnter Your Guess Number \n");
                i= input.nextInt();
                if(i==g)
                {
                    message="Congragulation your guess is right You have won the game \n";
                }

                if(g>i)
                {
                    message="HINT: your guess is low \n";
                }
                if(g <i)
                {
                    message="HINT :Your guess is high \n";
                }
                t--;
            }
            message="\n\nYou have loose the game\n";
              message="the nu. is " + "ParseInt(rand)";

        }


        EditText i=(EditText)findViewById(R.id.editText);
    }
}
