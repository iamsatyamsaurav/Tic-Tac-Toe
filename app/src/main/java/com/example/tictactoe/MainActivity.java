package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,restart;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9;
    int flag=0;
    int count=0;    //to count the no. of moves

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart();
            }
        });

    }

    private void initialize() {
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        restart=findViewById(R.id.restart);
    }
    public void Check(View view) {
        Button CurrentButton=(Button) view;

        if(CurrentButton.getText().toString().equals("")) {

            count++;

            if (flag == 0) {
                CurrentButton.setText("X");
                flag = 1;
            } else {
                CurrentButton.setText("O");
                flag = 0;
            }

            if (count > 4) {
                s1 = button1.getText().toString();
                s2 = button2.getText().toString();
                s3 = button3.getText().toString();
                s4 = button4.getText().toString();
                s5 = button5.getText().toString();
                s6 = button6.getText().toString();
                s7 = button7.getText().toString();
                s8 = button8.getText().toString();
                s9 = button9.getText().toString();

                //8 Conditions:-

                if (s1.equals(s2) && s2.equals(s3) && !s3.equals("")) {
                    Toast.makeText(this, "The Winner is " + s1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s4.equals(s5) && s5.equals(s6) && !s6.equals("")) {
                    Toast.makeText(this, "The Winner is " + s4, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s7.equals(s8) && s8.equals(s9) && !s9.equals("")) {
                    Toast.makeText(this, "The Winner is " + s7, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s1.equals(s4) && s4.equals(s7) && !s7.equals("")) {
                    Toast.makeText(this, "The Winner is " + s1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s2.equals(s5) && s5.equals(s8) && !s8.equals("")) {
                    Toast.makeText(this, "The Winner is " + s2, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s3.equals(s6) && s6.equals(s9) && !s9.equals("")) {
                    Toast.makeText(this, "The Winner is " + s3, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s1.equals(s5) && s5.equals(s9) && !s9.equals("")) {
                    Toast.makeText(this, "The Winner is " + s1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (s3.equals(s5) && s5.equals(s7) && !s7.equals("")) {
                    Toast.makeText(this, "The Winner is " + s3, Toast.LENGTH_SHORT).show();
                    restart();
                }else if(count==9)
                {
                    Toast.makeText(this, "Game is drawn", Toast.LENGTH_SHORT).show();
                    restart();
                }
            }
        }
    }
    public void restart()
    {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        flag=0;
        count=0;
    }
}