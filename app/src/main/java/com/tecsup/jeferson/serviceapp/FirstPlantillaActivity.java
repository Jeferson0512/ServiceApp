package com.tecsup.jeferson.serviceapp;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FirstPlantillaActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Usuarios d1 = new Usuarios();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_plantilla);

        // Setear Toolbar como action bar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String nombre = "Jeferson";
        String nombre2 = "Rodriguez";

        // Set DrawerLayout
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        if(nombre.equals(d1.getUsuario_uno())){
            Toast.makeText(this, "Bienvenido ustedes se encuentra en modo Administrador", Toast.LENGTH_SHORT).show();
        }else if (nombre2.equals(d1.getUsuario_dos())){
            Toast.makeText(this, "Bienvenido ustedes se encuentra en modo Tecnico", Toast.LENGTH_SHORT).show();
        }


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, android.R.string.ok, android.R.string.cancel);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Set NavigationItemSelectedListener
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        // Change navigation header information
        ImageView photoImage = (ImageView) navigationView.getHeaderView(0).findViewById(R.id.menu_photo);
        photoImage.setBackgroundResource(R.drawable.ic_profile);

        TextView fullnameText = (TextView) navigationView.getHeaderView(0).findViewById(R.id.menu_fullname);
        fullnameText.setText("Administrador");

        TextView emailText = (TextView) navigationView.getHeaderView(0).findViewById(R.id.menu_email);
        emailText.setText("admin@tecsup.edu.pe");


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                // Do action by menu item id
                switch (menuItem.getItemId()){
                    case R.id.nav_home:
                        Toast.makeText(FirstPlantillaActivity.this, "Go home...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_calendar:
                        Toast.makeText(FirstPlantillaActivity.this, "Go calendar...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_gallery:
                        Toast.makeText(FirstPlantillaActivity.this, "Go gallery...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_locations:
                        Toast.makeText(FirstPlantillaActivity.this, "Go locations...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_settings:
                        Toast.makeText(FirstPlantillaActivity.this, "Go settings...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_logout:
                        Intent intent = new Intent(FirstPlantillaActivity.this,PrincipalActivity.class);
                        startActivity(intent);
                        finish();
                        break;
                }

                // Close drawer
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: // Option open drawer
                if(!drawerLayout.isDrawerOpen(GravityCompat.START))
                    drawerLayout.openDrawer(GravityCompat.START);   // Open drawer
                else
                    drawerLayout.closeDrawer(GravityCompat.START);    // Close drawer
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
