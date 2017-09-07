package com.cdi.mymorpion;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    boolean toggle = true;
    String isWin;

    TextView tv;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, bNP;

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
        bNP = (Button) findViewById(R.id.button10);

        //enableAllButtons();
        cl.setBackgroundColor(Color.rgb(118, 152, 231));
        tv.setText("Joueur O, à vous de jouer !");

    }

    public void onClickB(View v) {
        if (((Button) v).getText().toString().isEmpty()) {
            if (toggle) {
                ((Button) v).setText("O");
                toggle = false;
                tv.setText("Joueur X, à vous de jouer !");
                cl.setBackgroundColor(Color.rgb(224, 134, 124));

            } else {
                ((Button) v).setText("X");
                toggle = true;
                tv.setText("Joueur O, à vous de jouer !");
                cl.setBackgroundColor(Color.rgb(118, 152, 231));
            }
        }

        if (verif_win_O()) {
            tv.setText("Joueur O, vous avez gagné !");
            cl.setBackgroundColor(Color.rgb(118, 152, 231));
            disableAllButtons();
            bNP.setVisibility(View.VISIBLE);

        } else if (verif_win_X()) {
            tv.setText("Joueur X, vous avez gagné !");
            cl.setBackgroundColor(Color.rgb(224, 134, 124));
            disableAllButtons();
            bNP.setVisibility(View.VISIBLE);
        } else if (verif_draw()){
            tv.setText("Match nul !");
            disableAllButtons();
            bNP.setVisibility(View.VISIBLE);
        }

    }

    public boolean verif_win_O() {
        //1ere ligne
        if ((b1.getText() == "O") && (b1.getText() == b2.getText()) && (b1.getText() == b3.getText()))
            return true;
        //2eme ligne
        if ((b4.getText() == "O") && (b4.getText() == b5.getText()) && (b4.getText() == b6.getText()))
            return true;
        //3eme ligne
        if ((b7.getText() == "O") && (b7.getText() == b8.getText()) && (b7.getText() == b9.getText()))
            return true;
        //1ere colonne
        if ((b1.getText() == "O") && (b1.getText() == b4.getText()) && (b1.getText() == b7.getText()))
            return true;
        //2eme colonne
        if ((b2.getText() == "O") && (b2.getText() == b5.getText()) && (b2.getText() == b8.getText()))
            return true;
        //3eme colonne
        if ((b3.getText() == "O") && (b3.getText() == b6.getText()) && (b3.getText() == b9.getText()))
            return true;
        //1ere diagonale
        if ((b1.getText() == "O") && (b1.getText() == b5.getText()) && (b1.getText() == b9.getText()))
            return true;
        //2eme diagonale
        if ((b3.getText() == "O") && (b3.getText() == b5.getText()) && (b3.getText() == b7.getText()))
            return true;

        return false;
    }

    public boolean verif_win_X() {

        //1ere ligne
        if ((b1.getText() == "X") && (b1.getText() == b2.getText()) && (b1.getText() == b3.getText()))
            return true;
        //2eme ligne
        if ((b4.getText() == "X") && (b4.getText() == b5.getText()) && (b4.getText() == b6.getText()))
            return true;
        //3eme ligne
        if ((b7.getText() == "X") && (b7.getText() == b8.getText()) && (b7.getText() == b9.getText()))
            return true;
        //1ere colonne
        if ((b1.getText() == "X") && (b1.getText() == b4.getText()) && (b1.getText() == b7.getText()))
            return true;
        //2eme colonne
        if ((b2.getText() == "X") && (b2.getText() == b5.getText()) && (b2.getText() == b8.getText()))
            return true;
        //3eme colonne
        if ((b3.getText() == "X") && (b3.getText() == b6.getText()) && (b3.getText() == b9.getText()))
            return true;
        //1ere diagonale
        if ((b1.getText() == "X") && (b1.getText() == b5.getText()) && (b1.getText() == b9.getText()))
            return true;
        //2eme diagonale
        if ((b3.getText() == "X") && (b3.getText() == b5.getText()) && (b3.getText() == b7.getText()))
            return true;

        return false;
    }

    public boolean verif_draw() {
        if ((!b1.getText().toString().isEmpty()) &&
                (!b2.getText().toString().isEmpty()) &&
                (!b3.getText().toString().isEmpty()) &&
                (!b4.getText().toString().isEmpty()) &&
                (!b5.getText().toString().isEmpty()) &&
                (!b6.getText().toString().isEmpty()) &&
                (!b7.getText().toString().isEmpty()) &&
                (!b8.getText().toString().isEmpty()) &&
                (!b9.getText().toString().isEmpty())) {
            return true;
        }
        return false;
    }

    public void disableAllButtons() {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);

    }

    public void enableAllButtons() {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

    }

    public void onClickNP(View v) {
        enableAllButtons();
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        if (toggle) {
            tv.setText("Joueur O, à vous de jouer !");
            cl.setBackgroundColor(Color.rgb(118, 152, 231));
        } else {
            tv.setText("Joueur X, à vous de jouer !");
            cl.setBackgroundColor(Color.rgb(224, 134, 124));
        }

        bNP.setVisibility(View.INVISIBLE);
    }
}
