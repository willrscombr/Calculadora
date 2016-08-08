package br.com.willsystem.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private Button btncalc;
    private TextView expressao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncalc = (Button) findViewById(R.id.button);
        expressao = (TextView) findViewById(R.id.editText);
        btncalc.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.equals(btncalc)){
            expressao.setText("Clicou no botao de calcular");
        }else{
            expressao.setText("Nao clicou no calcular");
        }


    }
}
