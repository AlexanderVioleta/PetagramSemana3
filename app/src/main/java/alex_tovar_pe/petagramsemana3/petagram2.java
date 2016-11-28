package alex_tovar_pe.petagramsemana3;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class petagram2 extends AppCompatActivity {
    ArrayList<Mascota> mascotas2= new ArrayList<>();
    private RecyclerView listaMascota2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petagram2);

        setContentView(R.layout.activity_petagram2);
        ImageView imagen1 = (ImageView) findViewById(R.id.id_estrella);
        imagen1.setVisibility(View.INVISIBLE);

        Toolbar miactionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miactionBar);


        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





        listaMascota2=(RecyclerView) findViewById(R.id.Mostrar_mascotas2);
        LinearLayoutManager mas2 =new LinearLayoutManager(this);
        mas2.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascota2.setLayoutManager(mas2);
        inicializarListaMascotas2();
        inicializarAdaptador2();






    }


    public void inicializarAdaptador2(){

        MascotaAdaptador adaptador2 =new MascotaAdaptador(mascotas2,this);
        listaMascota2.setAdapter(adaptador2);

    }


    public void inicializarListaMascotas2(){

        mascotas2=new ArrayList<Mascota>();

        mascotas2.add(new Mascota(R.drawable.perro3,"Toby" ));
        mascotas2.add(new Mascota(R.drawable.perro5,"Doky" ));
        mascotas2.add(new Mascota(R.drawable.perro7,"Chester" ));
        mascotas2.add(new Mascota(R.drawable.perro8,"Cookie" ));
        mascotas2.add(new Mascota(R.drawable.perro10,"Atlas" ));


    }






}
