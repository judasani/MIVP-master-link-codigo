package com.alejo_zr.manual;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button BtnManual;
    Button bPFlex;
    Button bPRigi;
    Button bLink;
    ImageButton bInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bPFlex = (Button) findViewById(R.id.bPFlex);
        bPRigi = (Button) findViewById(R.id.bPRigi);
        bInfo = (ImageButton) findViewById(R.id.bInfo) ;
        BtnManual = (Button) findViewById(R.id.BtnManual);
        bLink = (Button) findViewById(R.id.link);

        bPFlex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent confirmacion = new Intent(MainActivity.this, PavimentoFlexible.class);

                //confirmacion.putExtra("nombre", etNombre.getText().toString());
                startActivity(confirmacion);
            }
        });

        bLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://hermes.invias.gov.co/carreteras/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //confirmacion.putExtra("nombre", etNombre.getText().toString());
                startActivity(intent);
            }
        });


        bPRigi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent confirmacion = new Intent(MainActivity.this, PavimentoRigido.class);

                //confirmacion.putExtra("nombre", etNombre.getText().toString());
                startActivity(confirmacion);
            }
        });

        bInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"La informacion contenida en esta aplicación es propiedad del Instituto Nacional de Vias (INVIAS), sección documentos tecnicos, Manuales de inspección visual de pavimentos.",Toast.LENGTH_LONG ).show();
            }
        });
        BtnManual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent confirmacion = new Intent(MainActivity.this, ManualActivity.class);
                startActivity(confirmacion);

            }

            });
        }
}
