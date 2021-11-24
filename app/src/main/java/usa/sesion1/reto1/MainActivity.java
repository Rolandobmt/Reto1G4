package usa.sesion1.reto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCassoulet;
    private Button btnGraten;
    private Button btnRatatouille;
    private Button btnBullabesa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Maison Gourmet");
        getSupportActionBar().setSubtitle("Lista de menús");

        getSupportActionBar().setLogo(R.mipmap.gourmet);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        btnCassoulet = (Button) findViewById(R.id.btnCassoulet);
        btnGraten = (Button) findViewById(R.id.btnGraten);
        btnRatatouille = (Button) findViewById(R.id.btnRatatouille);
        btnBullabesa = (Button) findViewById(R.id.btnBullabesa);



        btnCassoulet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cassoulet se ha añadido " , Toast.LENGTH_LONG).show();
            }
        });

        btnGraten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Gratén Delfinés se ha añadido " , Toast.LENGTH_LONG).show();
            }
        });

        btnRatatouille.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ratatouille se ha añadido " , Toast.LENGTH_LONG).show();
            }
        });

        btnBullabesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ratatouille se ha añadido " , Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menudeopciones, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.registro:
                Toast.makeText(getApplicationContext(), "Enviar a página de registro", Toast.LENGTH_LONG).show();
                return true;
            case R.id.productos:
                Toast.makeText(getApplicationContext(), "Estos son nuestros Productos", Toast.LENGTH_LONG).show();
                return true;
            case R.id.servicios:
                Toast.makeText(getApplicationContext(), "Estos son nuestros Servicios", Toast.LENGTH_LONG).show();
                return true;
            case R.id.sucursales:
                Toast.makeText(getApplicationContext(), "Estas son nuestras Sucursales", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
