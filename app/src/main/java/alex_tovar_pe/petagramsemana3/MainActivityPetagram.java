package alex_tovar_pe.petagramsemana3;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import android.content.Intent;
import android.view.View;

import java.util.ArrayList;


public class MainActivityPetagram extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascota;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_petagram);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        getSupportActionBar().setTitle(null);


        listaMascota=(RecyclerView) findViewById(R.id.Mostrar_mascotas_p);

        LinearLayoutManager mas =new LinearLayoutManager(this);
        mas.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascota.setLayoutManager(mas);
        inicializarListaMascotas();
        inicializarAdaptador();
    }


    public void inicializarAdaptador(){

        MascotaAdaptador adaptador =new MascotaAdaptador(mascotas,this);
        listaMascota.setAdapter(adaptador);

    }


    public void inicializarListaMascotas(){

        mascotas=new ArrayList<Mascota>();


        mascotas.add(new Mascota(R.drawable.perro1,"Neron" ));
        mascotas.add(new Mascota(R.drawable.perro2,"Lazy" ));
        mascotas.add(new Mascota(R.drawable.perro3,"Toby" ));
        mascotas.add(new Mascota(R.drawable.perro4,"Ceniza" ));
        mascotas.add(new Mascota(R.drawable.perro5,"Doky" ));
        mascotas.add(new Mascota(R.drawable.perro6,"Bambi" ));
        mascotas.add(new Mascota(R.drawable.perro7,"Chester" ));
        mascotas.add(new Mascota(R.drawable.perro8,"Cookie" ));
        mascotas.add(new Mascota(R.drawable.perro9,"Goliat" ));
        mascotas.add(new Mascota(R.drawable.perro10,"Atlas" ));


    }

    public void iractivitypetagram2(View v){
        Intent intent = new Intent(this,petagram2.class );
        startActivity(intent);
    }





}
