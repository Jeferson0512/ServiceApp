package com.tecsup.jeferson.serviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    private EditText usuario,contraseña;
    private Button ingresar;
    private Usuarios d1 = new Usuarios();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        usuario = (EditText)findViewById(R.id.edit_usuario);
        contraseña = (EditText)findViewById(R.id.edit_contraseña);
        ingresar = (Button)findViewById(R.id.btn_ingresar);

    }

    public void Ingresar(View view){
        String user = usuario.getText().toString();
        String contra = contraseña.getText().toString();

        d1.setUsuario_uno("Jeferson");
        d1.setUsuario_dos("Roberto");
        d1.setUsuario_dos("Cliente");
        d1.setContraseña_uno("123456");
        d1.setContraseña_dos("123456");
        d1.setContraseña_dos("123456");

        if(user.isEmpty() || contra.isEmpty()){
            Toast.makeText(this, "Debe de ingresar valores !", Toast.LENGTH_SHORT).show();
        }else if(user.equals(d1.getUsuario_uno().toString()) || user.equals("jeferson")){
            if (contra.equals(d1.getContraseña_uno().toString())){
            Intent intent = new Intent(PrincipalActivity.this,FirstPlantillaActivity.class);
            startActivity(intent);
            finish();
            }else{
                Toast.makeText(this, "contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }
        }else if (user.equals(d1.getUsuario_dos()) || user.equals("roberto")){
            if(contra.equals(d1.getContraseña_dos())) {
                Intent intent = new Intent(PrincipalActivity.this, SecondPlantillaActivity.class);
                startActivity(intent);
                finish();
            }else{
                Toast.makeText(this, "contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }
        }else if(user.equals(d1.getUsuario_dos().toString()) || user.equals("cliente")){
            if (contra.equals(d1.getContraseña_dos().toString())){
                Intent intent = new Intent(PrincipalActivity.this,ClienteActivity.class);
                startActivity(intent);
                finish();
            }else{
                Toast.makeText(this, "contraseña incorrecta", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
        }
    }

}
