package com.example.parsearjson.SubDatos;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.parsearjson.R;
import com.squareup.picasso.Picasso;

public class BioActivity extends AppCompatActivity {
    TextView nombre;
    TextView dni;
    TextView bio;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

      // nombre= (TextView) findViewById(R.id.nombre);
      //  dni=(TextView) findViewById(R.id.dni);
       // bio=(TextView) findViewById(R.id.biografia);
       // imagen=(ImageView)findViewById(R.id.Imagen);

        nombre.setText(getIntent().getExtras().getString("curNombre"));
        dni.setText(getIntent().getExtras().getString("curDni"));
        bio.setText(getIntent().getExtras().getString("curBio"));
        //imagen.setImageResource(getIntent().getExtras().getInt("curImagen"));

        Picasso.with(imagen.getContext())
                .load(getIntent().getExtras().getString("curImagen")).into(imagen);
    }

}
