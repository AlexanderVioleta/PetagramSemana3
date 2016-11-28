package alex_tovar_pe.petagramsemana3;

/**
 * Created by Alexander on 27/11/2016.
 */

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MascotaAdaptador  extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    int like;
    String Like_S;
    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador (ArrayList<Mascota>mascotas,Activity activity){
        this.mascotas=mascotas;
        this.activity=activity;



    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(V);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewholder, int position) {

        final Mascota mascota = mascotas.get(position);
        mascotaViewholder.imagen.setImageResource(mascota.getFoto());
        mascotaViewholder.nombre_mascota.setText(mascota.getNombre());


        mascotaViewholder.hueso_blanco_rec.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {





                String  almacenar=mascotaViewholder.num_likes_mascota_rec.getText().toString();

                if (almacenar.equals("0")){
                    like++;
                    Like_S= Integer.toString(like);
                    mascotaViewholder.num_likes_mascota_rec.setText(Like_S);
                    Toast.makeText(activity,"Diste Like a "+mascota.getNombre(),
                            Toast.LENGTH_SHORT).show();
                    like=0;
                }


                if (almacenar.equals("1")){

                    Toast.makeText(activity,"Cada usuario solo puedes dar un like por perro",
                            Toast.LENGTH_LONG).show();

                }





            }
        } );

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imagen;
        private TextView nombre_mascota;


        private TextView num_likes_mascota_rec;
        private ImageButton hueso_blanco_rec;


        public MascotaViewHolder(View itemView) {
            super(itemView);

            imagen= (ImageView) itemView.findViewById(R.id.imagen_n);
            nombre_mascota= (TextView ) itemView.findViewById(R.id.nombre_mascota);

            num_likes_mascota_rec= (TextView ) itemView.findViewById(R.id.num_likes_mascota);
            hueso_blanco_rec= (ImageButton ) itemView.findViewById(R.id.hueso_blanco);




        }





    }

}
