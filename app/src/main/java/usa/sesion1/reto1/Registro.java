package usa.sesion1.reto1;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    private TextView tvwMensaje;
    private EditText edtNuevoUsuario;
    private EditText edtNuevaClave;
    private Button btnRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        tvwMensaje =(TextView)findViewById(R.id.tvwMensaje);
        edtNuevoUsuario =(EditText) findViewById(R.id.edtNuevoUsuario);
        edtNuevaClave =(EditText)  findViewById(R.id.edtNuevaClave);
        btnRegistro =(Button) findViewById(R.id.btnRegistro);

btnRegistro.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String usuario = edtNuevoUsuario.getText().toString();
        String clave = edtNuevaClave.getText().toString();
        Toast.makeText(getApplicationContext(), "Usuario: " + usuario + " - Clave: " + clave, Toast.LENGTH_LONG).show();
    }
});
    }

}
