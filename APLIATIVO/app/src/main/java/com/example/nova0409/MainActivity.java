
package com.example.nova0409;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDialog = findViewById(R.id.btnDialog);
        Button btnMensagem = findViewById(R.id.bntMensagem);
        Button btnEscreve = findViewById(R.id.btnescreve);
        TextView txtMensagem = findViewById(R.id.txtMensagem);
        TextView fldTexto = findViewById(R.id.flbTexto);

        TextView btnToast = findViewById(R.id.btnToast);
        //EditText fldText

        String AAbertura = "Criar App Android com Android Studio";
        txtMensagem.setText(AAbertura);
        Toast.makeText(getApplicationContext(),AAbertura,Toast.LENGTH_LONG).show();
        //botao toast
        btnEscreve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoEscrito = fldTexto.getText().toString().toUpperCase().trim();
                txtMensagem.setText(textoEscrito);
            }
        });
        btnMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Texto = "BOM DIAAAA!!";
                txtMensagem.setText(Texto);
            }
        });
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msgToast = "Minha notification";
                Toast.makeText(getApplicationContext(),msgToast,Toast.LENGTH_LONG).show();
            }
        });
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext());
                dialog.setMessage("como esta o clima")
                        .setCancelable(false)
                        .setPositiveButton("CHUVA", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                    Toast.makeText(getApplicationContext(), "CHUVA e FRIO",Toast.LENGTH_LONG).show();
                            }
                        })
                .setNegativeButton("sol", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Sol e quente",Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

    }

}
//Botão caputura tex