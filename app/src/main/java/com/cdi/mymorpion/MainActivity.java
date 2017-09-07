package com.cdi.mymorpion;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean toggle = true;

    TextView tv;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;

    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl = (ConstraintLayout) findViewById(R.id.constraintLayout);

        tv = (TextView) findViewById(R.id.textView);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);

        tv.setText("Joueur O, à vous de jouer !");
        cl.setBackgroundColor(Color.rgb(118, 152, 231));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().isEmpty()) {
                    if (toggle) {
                        b1.setText("O");
                        toggle = false;
                        tv.setText("Joueur X, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(224, 134, 124));
                    } else {
                        b1.setText("X");
                        toggle = true;
                        tv.setText("Joueur O, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(118, 152, 231));
                    }
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().isEmpty()) {
                    if (toggle) {
                        b2.setText("O");
                        toggle = false;
                        tv.setText("Joueur X, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(224, 134, 124));
                    } else {
                        b2.setText("X");
                        toggle = true;
                        tv.setText("Joueur O, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(118, 152, 231));
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().isEmpty()) {
                    if (toggle) {
                        b3.setText("O");
                        toggle = false;
                        tv.setText("Joueur X, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(224, 134, 124));
                    } else {
                        b3.setText("X");
                        toggle = true;
                        tv.setText("Joueur O, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(118, 152, 231));
                    }
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().isEmpty()) {
                    if (toggle) {
                        b4.setText("O");
                        toggle = false;
                        tv.setText("Joueur X, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(224, 134, 124));
                    } else {
                        b4.setText("X");
                        toggle = true;
                        tv.setText("Joueur O, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(118, 152, 231));
                    }
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().isEmpty()) {
                    if (toggle) {
                        b5.setText("O");
                        toggle = false;
                        tv.setText("Joueur X, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(224, 134, 124));
                    } else {
                        b5.setText("X");
                        toggle = true;
                        tv.setText("Joueur O, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(118, 152, 231));
                    }
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().isEmpty()) {
                    if (toggle) {
                        b6.setText("O");
                        toggle = false;
                        tv.setText("Joueur X, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(224, 134, 124));
                    } else {
                        b6.setText("X");
                        toggle = true;
                        tv.setText("Joueur O, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(118, 152, 231));
                    }
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().isEmpty()) {
                    if (toggle) {
                        b7.setText("O");
                        toggle = false;
                        tv.setText("Joueur X, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(224, 134, 124));
                    } else {
                        b7.setText("X");
                        toggle = true;
                        tv.setText("Joueur O, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(118, 152, 231));
                    }
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().isEmpty()) {
                    if (toggle) {
                        b8.setText("O");
                        toggle = false;
                        tv.setText("Joueur X, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(224, 134, 124));
                    } else {
                        b8.setText("X");
                        toggle = true;
                        tv.setText("Joueur O, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(118, 152, 231));
                    }
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().isEmpty()) {
                    if (toggle) {
                        b9.setText("O");
                        toggle = false;
                        tv.setText("Joueur X, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(224, 134, 124));
                    } else {
                        b9.setText("X");
                        toggle = true;
                        tv.setText("Joueur O, à vous de jouer !");
                        cl.setBackgroundColor(Color.rgb(118, 152, 231));

                    }
                }

            }
        });
    }

    public boolean verif_win(String player) {
        if (! player.isEmpty()) {
            //1ere ligne
            if ((b1.getText().toString() == b2.getText().toString()) && (b1.getText().toString() == b3.getText().toString()))
                return true;
            //2eme ligne
            if ((b4.getText().toString() == b5.getText().toString()) && (b4.getText().toString() == b6.getText().toString()))
                return true;
            //3eme ligne
            if ((b7.getText().toString() == b8.getText().toString()) && (b7.getText().toString() == b9.getText().toString()))
                return true;
            //1ere colonne
            if ((b1.getText().toString() == b4.getText().toString()) && (b1.getText().toString() == b7.getText().toString()))
                return true;
            //2eme colonne
            if ((b2.getText().toString() == b5.getText().toString()) && (b2.getText().toString() == b8.getText().toString()))
                return true;
            //3eme colonne
            if ((b3.getText().toString() == b6.getText().toString()) && (b3.getText().toString() == b9.getText().toString()))
                return true;
            //1ere diagonale
            if ((b1.getText().toString() == b5.getText().toString()) && (b1.getText().toString() == b9.getText().toString()))
                return true;
            //1ere diagonale
            if ((b3.getText().toString() == b5.getText().toString()) && (b3.getText().toString() == b7.getText().toString()))
                return true;
        }
        return false;
    }
}
