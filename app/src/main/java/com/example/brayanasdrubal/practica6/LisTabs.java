package com.example.brayanasdrubal.practica6;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class LisTabs extends AppCompatActivity {
    TabHost TbH;
    private int l=0,p,c1t, c2t, c3t, c1, c2, c3, t1t, t2t, te1, te2, r1t, r2t, r3t, r1, r2, r3, ru1t, ru2t, ru3t, ru1, ru2, ru3, tu1t, tu2t, tu3t, tu1, tu2, tu3;
    private String[] lugares={"Royal Films","CineMArk","Procinal","Pequeño Teatro","Aguila Descalza",
            "El Barco","A lá Sazón","Verdeo","Prizma","Kukaramakara","Dulce Jesus Mio","Museo de Antioquia","Las Palmas","Metro de Medellín"};
    private String[] tit={"Cine","Teatro","Restaurante","Rumba","Turismo","Cinema", "Theatre", "Restaurant", "Rumba", "Tourism"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LisTabs.this, "Mapa", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(LisTabs.this, MapsActivity.class);
                startActivity(i);
            }
        });
        TbH = (TabHost) findViewById(R.id.tabHost); //llamamos al Tabhost
        TbH.setup();                                                         //lo activamos

        TabHost.TabSpec tab1 = TbH.newTabSpec("tab1");  //aspectos de cada Tab (pestaña)
        TabHost.TabSpec tab2 = TbH.newTabSpec("tab2");
        TabHost.TabSpec tab3 = TbH.newTabSpec("tab3");


        if(MainActivity.num ==1){
            l=3;
        }else if(MainActivity.num ==2){
            l=5;
        }else if(MainActivity.num ==3){
            l=8;
        }else if(MainActivity.num ==4){
            l=11;
        }
        if (MainActivity.idm ==1){
            p=5;
         /*   c1t=R.string.cine1ti;
            c2t=R.string.cine2ti;
            c3t=R.string.cine3ti;
            c1=R.string.cine1i;
            c2=R.string.cine2i;
            c3=R.string.cine3i;
            t1t=R.string.teatro1ti;
            t2t=R.string.teatro2ti;
            te1=R.string.teatro1i;
            te2=R.string.teatro2i;
            r1t=R.string.rest1ti;
            r2t=R.string.rest2ti;
            r3t=R.string.rest3ti;
            r1=R.string.rest1i;
            r2=R.string.rest2i;
            r3=R.string.rest3i;
            ru1t=R.string.rumba1ti;
            ru2t=R.string.rumba2ti;
            ru3t=R.string.rumba3ti;
            ru1=R.string.rumba1i;
            ru2=R.string.rumba2i;
            ru3=R.string.rumba3i;
            tu1t=R.string.turis1ti;
            tu2t=R.string.turis2ti;
            tu3t=R.string.turis3ti;
            tu1=R.string.turis1i;
            tu2=R.string.turis2i;
            tu3=R.string.turis3i;*/
        }else {
            p=0;
            c1t=R.string.cine1t;
            c2t=R.string.cine2t;
            c3t=R.string.cine3t;
            c1=R.string.cine1;
            c2=R.string.cine2;
            c3=R.string.cine3;
            t1t=R.string.teatro1t;
            t2t=R.string.teatro2t;
            te1=R.string.teatro1;
            te2=R.string.teatro2;
            r1t=R.string.rest1t;
            r2t=R.string.rest2t;
            r3t=R.string.rest3t;
            r1=R.string.rest1;
            r2=R.string.rest2;
            r3=R.string.rest3;
            ru1t=R.string.rumba1t;
            ru2t=R.string.rumba2t;
            ru3t=R.string.rumba3t;
            ru1=R.string.rumba1;
            ru2=R.string.rumba2;
            ru3=R.string.rumba3;
            tu1t=R.string.turis1t;
            tu2t=R.string.turis2t;
            tu3t=R.string.turis3t;
            tu1=R.string.turis1;
            tu2=R.string.turis2;
            tu3=R.string.turis3;
        }

        tab1.setIndicator(lugares[l]);    //qué queremos que aparezca en las pestañas
        tab1.setContent(R.id.ejemplo1); //definimos el id de cada Tab (pestaña)
        tab2.setIndicator(lugares[l+1]);
        tab2.setContent(R.id.ejemplo2);
        tab3.setIndicator(lugares[l+2]);
        tab3.setContent(R.id.ejemplo3);

        TbH.addTab(tab1); //añadimos los tabs ya programados
        TbH.addTab(tab2);
        if (MainActivity.num !=1){
            TbH.addTab(tab3);
        }

        ImageView sit1 = (ImageView) findViewById(R.id.drw1);
        ImageView sit2 = (ImageView) findViewById(R.id.drw2);
        ImageView sit3 = (ImageView) findViewById(R.id.drw3);
        TextView t1 = (TextView) findViewById(R.id.tit1);
        TextView tx1 = (TextView) findViewById(R.id.tex1);
        TextView t2 = (TextView) findViewById(R.id.tit2);
        TextView tx2 = (TextView) findViewById(R.id.tex2);
        TextView t3 = (TextView) findViewById(R.id.tit3);
        TextView tx3 = (TextView) findViewById(R.id.tex3);

        if(MainActivity.num ==0){
            setTitle(getText(R.string.Cine));
            sit1.setImageResource(R.drawable.cine1);
            t1.setText(c1t);
            tx1.setText(c1);
            MapsActivity.lat1=6.241011267877558;
            MapsActivity.lon1=-75.57766955;
            MapsActivity.ubica1=getString(c1t);
            sit2.setImageResource(R.drawable.cine2);
            t2.setText(c2t);
            tx2.setText(c2);
            MapsActivity.lat2=6.1980703;
            MapsActivity.lon2=-75.5613467;
            MapsActivity.ubica2=getString(c2t);
            sit3.setImageResource(R.drawable.cine3);
            t3.setText(c3t);
            tx3.setText(c3);
            MapsActivity.lat3=6.3387582;
            MapsActivity.lon3=-75.5443311;
            MapsActivity.ubica3=getString(c3t);
        }else if(MainActivity.num ==1){
            setTitle(getText(R.string.Teatro));
            sit1.setImageResource(R.drawable.teatro1);
            t1.setText(t1t);
            tx1.setText(te1);
            MapsActivity.lat1=6.2475587;
            MapsActivity.lon1=-75.5617345;
            MapsActivity.ubica1=getString(t1t);
            sit2.setImageResource(R.drawable.teatro2);
            t2.setText(t2t);
            tx2.setText(te2);
            MapsActivity.lat2=6.254683;
            MapsActivity.lon2=-75.560682;
            MapsActivity.ubica2=getString(t2t);
        }else if(MainActivity.num ==2){
            setTitle(getText(R.string.Restaurante));
            sit1.setImageResource(R.drawable.rest1);
            t1.setText(r1t);
            tx1.setText(r1);
            MapsActivity.lat1=6.1909656;
            MapsActivity.lon1=-75.5891475;
            MapsActivity.ubica1=getString(r1t);
            sit2.setImageResource(R.drawable.rest2);
            t2.setText(r2t);
            tx2.setText(r2);
            MapsActivity.lat2=6.2106231;
            MapsActivity.lon2=-75.5677216;
            MapsActivity.ubica2=getString(r2t);
            sit3.setImageResource(R.drawable.rest3);
            t3.setText(r3t);
            tx3.setText(r3);
            MapsActivity.lat3=6.207538;
            MapsActivity.lon3=-75.5662842;
            MapsActivity.ubica3=getString(r3t);
        }else if(MainActivity.num ==3){
            setTitle(getText(R.string.Rumba));
            sit1.setImageResource(R.drawable.rumba1);
            t1.setText(ru1t);
            tx1.setText(ru1);
            MapsActivity.lat1=6.2243618;
            MapsActivity.lon1=-75.5703363;
            MapsActivity.ubica1=getString(ru1t);
            sit2.setImageResource(R.drawable.rumba2);
            t2.setText(ru2t);
            tx2.setText(ru2);
            MapsActivity.lat2=6.1984366;
            MapsActivity.lon2=-75.5735943;
            MapsActivity.ubica2=getString(ru2t);
            sit3.setImageResource(R.drawable.rumba3);
            t3.setText(ru3t);
            tx3.setText(ru3);
            MapsActivity.lat3=6.2231504;
            MapsActivity.lon3=-75.5653274;
            MapsActivity.ubica3=getString(ru3t);
        }else if(MainActivity.num == 4) {
            setTitle(getText(R.string.Turismo));
            sit1.setImageResource(R.drawable.turi1);
            t1.setText(tu1t);
            tx1.setText(tu1);
            MapsActivity.lat1=6.2521817;
            MapsActivity.lon1=-75.569335;
            MapsActivity.ubica1=getString(tu1t);
            sit2.setImageResource(R.drawable.turi2);
            t2.setText(tu2t);
            tx2.setText(tu2);
            MapsActivity.lat2=6.2363565;
            MapsActivity.lon2=-75.5684804;
            MapsActivity.ubica2=getString(tu2t);
            sit3.setImageResource(R.drawable.turi3);
            t3.setText(tu3t);
            tx3.setText(tu3);
            MapsActivity.lat3=6.24714;
            MapsActivity.lon3=-75.57019;
            MapsActivity.ubica3=getString(tu3t);
        }
        /*if (TbH.getCurrentTab()==null){
            MapsActivity.lat=23;
            MapsActivity.lon=-75;
            MapsActivity.ubica="Funciono";
        }else {
            MapsActivity.lat=23;
            MapsActivity.lon=-20;
            MapsActivity.ubica="Tambien Funciono";

        }*/


    }
}
