package com.example.gato;

import static android.widget.Toast.LENGTH_SHORT;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;
public class MainActivity2 extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnhuir;
    int turno, contador;
    String letra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnhuir = findViewById(R.id.btnabandonar);
        btn1.setOnClickListener(this::onClick);
        btn2.setOnClickListener(this::onClick);
        btn3.setOnClickListener(this::onClick);
        btn4.setOnClickListener(this::onClick);
        btn5.setOnClickListener(this::onClick);
        btn6.setOnClickListener(this::onClick);
        btn7.setOnClickListener(this::onClick);
        btn8.setOnClickListener(this::onClick);
        btn9.setOnClickListener(this::onClick);
        btnhuir.setOnClickListener(this::onClick);

    }

    public void onClick(View view) {

        contador ++;
        turno = contador % 2;

        if (contador >=9)
        {
            Intent intent;
            intent = new Intent(getApplicationContext(), Enpate.class);
            startActivity(intent);
        }
        else {
            if (turno == 1)
            {
                letra = "x";
                int id_boton = view.getId();
                switch (id_boton) {
                    case (R.id.btn1): {
                        btn1.setText(letra);
                        btn1.setEnabled(false);
                    }
                    break;
                    case (R.id.btn2): {
                        btn2.setText(letra);
                        btn2.setEnabled(false);
                    }
                    break;
                    case (R.id.btn3): {
                        btn3.setText(letra);
                        btn3.setEnabled(false);
                    }
                    break;
                    case (R.id.btn4): {
                        btn4.setText(letra);
                        btn4.setEnabled(false);
                    }
                    break;
                    case (R.id.btn5): {
                        btn5.setText(letra);
                        btn5.setEnabled(false);
                    }
                    break;
                    case (R.id.btn6): {
                        btn6.setText(letra);
                        btn6.setEnabled(false);
                    }
                    break;
                    case (R.id.btn7): {
                        btn7.setText(letra);
                        btn7.setEnabled(false);
                    }
                    break;
                    case (R.id.btn8): {
                        btn8.setText(letra);
                        btn8.setEnabled(false);
                    }
                    break;
                    case (R.id.btn9): {
                        btn9.setText(letra);
                        btn9.setEnabled(false);

                    }
                    break;
                    case (R.id.btnabandonar): {
                        Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent1);
                    }
                    break;
                    default: {
                        Snackbar mySnackbar = Snackbar.make(view, "lol algo salio mal", LENGTH_SHORT);
                        mySnackbar.show();
                    }

                }
                Ganar(letra);
                turno = 2;
            }
            else
            {
                int id_boton2 = view.getId();
                letra = "o";
                switch (id_boton2) {
                    case (R.id.btn1): {
                        btn1.setText(letra);
                        btn1.setEnabled(false);
                    }
                    break;
                    case (R.id.btn2): {
                        btn2.setText(letra);
                        btn2.setEnabled(false);
                    }
                    break;
                    case (R.id.btn3): {
                        btn3.setText(letra);
                        btn3.setEnabled(false);
                    }
                    break;
                    case (R.id.btn4): {
                        btn4.setText(letra);
                        btn4.setEnabled(false);
                    }
                    break;
                    case (R.id.btn5): {
                        btn5.setText(letra);
                        btn5.setEnabled(false);
                    }
                    break;
                    case (R.id.btn6): {
                        btn6.setText(letra);
                        btn6.setEnabled(false);
                    }
                    break;
                    case (R.id.btn7): {
                        btn7.setText(letra);
                        btn7.setEnabled(false);
                    }
                    break;
                    case (R.id.btn8): {
                        btn8.setText(letra);
                        btn8.setEnabled(false);
                    }
                    break;
                    case (R.id.btn9): {
                        btn9.setText(letra);
                        btn9.setEnabled(false);
                    }
                    break;
                    case (R.id.btnabandonar): {
                        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent2);
                    }
                    break;
                    default: {
                        Snackbar mySnackbar2 = Snackbar.make(view, "lol algo salio mal", LENGTH_SHORT);
                        mySnackbar2.show();
                    }

                }
                Ganar(letra);
                turno = 1;
            }
        }


    }

    public void Ganar(String letra1){

        if ((btn1.getText().toString().equals(letra1+"")) && (btn2.getText().toString().equals(letra1+"")) && (btn3.getText().toString().equals(letra1+"")))
        {
            Ganador(letra1);
        }
        else
        if ((btn4.getText().toString().equals(letra1+"")) && (btn5.getText().toString().equals(letra1+"")) && (btn6.getText().toString().equals(letra1+"")))
        {
            Ganador(letra1);
        }
        else
        if ((btn7.getText().toString().equals(letra1+"")) && (btn8.getText().toString().equals(letra1+"")) && (btn9.getText().toString().equals(letra1+"")))
        {
            Ganador(letra1);
        }
// separacion1
        else
        if ((btn1.getText().toString().equals(letra1+"")) && (btn4.getText().toString().equals(letra1+"")) && (btn7.getText().toString().equals(letra1+"")))
        {
            Ganador(letra1);
        }
        else
        if ((btn2.getText().toString().equals(letra1+"")) && (btn5.getText().toString().equals(letra1+"")) && (btn8.getText().toString().equals(letra1+"")))
        {
            Ganador(letra1);
        }
        else
        if ((btn3.getText().toString().equals(letra1+"")) && (btn6.getText().toString().equals(letra1+"")) && (btn9.getText().toString().equals(letra1+"")))
        {
            Ganador(letra1);
        }
        // separacion2
        else
        if ((btn1.getText().toString().equals(letra1+"")) && (btn5.getText().toString().equals(letra1+"")) && (btn9.getText().toString().equals(letra1+"")))
        {
            Ganador(letra1);
        }
        else
        if ((btn3.getText().toString().equals(letra1+"")) && (btn5.getText().toString().equals(letra1+"")) && (btn7.getText().toString().equals(letra1+"")))
        {
            Ganador(letra1);
        }
    }

    public void Ganador (String letra2)
    {

        Intent intent;
        if (letra2 == "x") {
            intent = new Intent(getApplicationContext(), GanadorX.class);
        } else {
            intent = new Intent(getApplicationContext(), GanadorO.class);
        }
        startActivity(intent);
    }

    }
