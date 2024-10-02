package br.ulbra.calculadorasimples;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.*;
import android.app.*;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText ednumero1, ednumero2;
    Button btsomar, btsubtrair, btmultiplicar, btdividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);
        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar = (Button) findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);

        btsomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double soma = num1 + num2;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado soma");
                dialogo.setMessage("A soma é: " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btsubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double subtracao = num1 - num2;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da subtração");
                dialogo.setMessage("A subtração é: " + subtracao);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double multiplicacao = num1 * num2;
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado da multiplicação");
                dialogo.setMessage("A multiplicação é: " + multiplicacao);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });

        btdividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());

                if (num2 == 0) {
                    // Caso o divisor seja zero, mostramos uma mensagem de erro
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Erro");
                    dialogo.setMessage("Não é possível dividir por zero.");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                } else {
                    // Caso o divisor seja diferente de zero, fazemos a divisão
                    double divisao = num1 / num2;
                    AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                    dialogo.setTitle("Resultado da divisão");
                    dialogo.setMessage("A divisão é: " + divisao);
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();
                }
            }
        });

    }
}