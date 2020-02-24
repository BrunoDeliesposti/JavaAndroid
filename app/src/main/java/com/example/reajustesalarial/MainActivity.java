package com.example.reajustesalarial;

        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.TextView;

//package com.example.calc_mercado;

        import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //Criando os Objetos
    private RadioButton btn40, btn45, btn50;
    private Button btnCalcular;
    private TextView edtSalarioAtual;
    private TextView edtSalarioReajustado;
    private Object plainText;

    double edtSalarioAtual1 = 0.0, edtSalarioReajustado1 = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionando JAVA com XML

        btn40 = (RadioButton)findViewById(R.id.btn40);
        btn45 = (RadioButton)findViewById(R.id.btn45);
        btn50 = (RadioButton)findViewById(R.id.btn50);

        edtSalarioAtual = (TextView) findViewById(R.id.edtSalarioAtual);;

        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        edtSalarioReajustado = (TextView) findViewById(R.id.top);


        btnCalcular.setOnClickListener(new View.OnClickListener() {


            //private double total;

            @Override
            public void onClick(View v) {


               //        Log.d(edtSalarioReajustado1);

                if (btn40.isChecked()) {
                    edtSalarioReajustado1 = edtSalarioAtual1 + ((edtSalarioAtual1*40)/100);
                     edtSalarioReajustado1 = Double.parseDouble(String.valueOf(edtSalarioReajustado1));
                } else if (btn45.isChecked()){
                    edtSalarioReajustado1 =  edtSalarioAtual1 + ((edtSalarioAtual1*45)/100);
                    edtSalarioReajustado1 = Double.parseDouble(String.valueOf(edtSalarioReajustado1));
                } else if(btn50.isChecked()){
                    edtSalarioReajustado1 =  edtSalarioAtual1 + ((edtSalarioAtual1*50)/100);
                    edtSalarioReajustado1 = Double.parseDouble(String.valueOf(edtSalarioReajustado1));
                }
            }
        });
    }
}