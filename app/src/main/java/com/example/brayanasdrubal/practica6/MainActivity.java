package com.example.brayanasdrubal.practica6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static int num=0,idm=0,p=0;
    TabHost TbH;
    private int l=0,c1t, c2t, c3t, c1, c2, c3, t1t, t2t, te1, te2, r1t, r2t, r3t, r1, r2, r3, ru1t, ru2t, ru3t, ru1, ru2, ru3, tu1t, tu2t, tu3t, tu1, tu2, tu3;
    private String[] lugares={"Royal Films","CineMArk","Procinal","Pequeño Teatro","Aguila Descalza",
            "El Barco","A lá Sazón","Verdeo","Prizma","Kukaramakara","Dulce Jesus Mio","Museo de Antioquia","Las Palmas","Metro de Medellín"};


    ListView lstNombres;
    static String titl,can, c;
    public String[] tit={"Cine","Teatro","Restaurante","Rumba","Turismo","Cinema", "Theatre", "Restaurant", "Rumba", "Tourism"};

    private Lista_Entrada[] datos ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos= new Lista_Entrada[]{
                new Lista_Entrada(R.drawable.cine, getString(R.string.Cine), "3 "+getString(R.string.L),"Cinema","3 Places"),
                new Lista_Entrada(R.drawable.teatro, getString(R.string.Teatro), "2 "+getString(R.string.L), "Theatre","2 Places"),
                new Lista_Entrada(R.drawable.rest,getString(R.string.Restaurante), "3 "+getString(R.string.L), "Restaurant","3 Places"),
                new Lista_Entrada(R.drawable.rumba,getString(R.string.Rumba),"3 "+getString(R.string.L), "Rumba","3 Places"),
                new Lista_Entrada(R.drawable.turi,getString(R.string.Turismo),"3 "+getString(R.string.L), "Tourism","3 Places")};

        Adapter adaptador = new Adapter(this, datos);

        lstNombres = (ListView) findViewById(R.id.Lst);

        lstNombres.setAdapter(adaptador);
        /*if(findViewById(R.id.Lst)!=null){
            Animal animal = new Animal();
            animal.setName("Penguin");
            animal.setImageUrl("http://www.emperor-penguin.com/penguin-chick.jpg");
            animal.setDescription("Penguin Penguin Penguin Penguin Penguin Penguin Penguin Penguin Penguin Penguin Penguin Penguin Penguin ");

            Bundle bundle = new Bundle();
            bundle.putSerializable("animal",animal);

            AnimalDetailFragment animalDetailFragment = new AnimalDetailFragment();
            animalDetailFragment.setArguments(bundle);
            fragmentTransaction.add(R.id.framelayout_right,animalDetailFragment);
        }*/

            if (findViewById(R.id.lay2) != null){


            /*    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
                fab.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Mapa", Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(MainActivity.this, MapsActivity.class);
                        startActivity(i);
                    }
                });
                TbH = (TabHost) findViewById(R.id.tabHost); //llamamos al Tabhost
                TbH.setup();                                                         //lo activamos
                TabHost.TabSpec tab1 = TbH.newTabSpec("tab1");  //aspectos de cada Tab (pestaña)
                TabHost.TabSpec tab2 = TbH.newTabSpec("tab2");
                TabHost.TabSpec tab3 = TbH.newTabSpec("tab3");

                if(num ==1){
                    l=3;
                }else if(num ==2){
                    l=5;
                }else if(num ==3){
                    l=8;
                }else if(num ==4){
                    l=11;
                }

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



                tab1.setIndicator(lugares[l]);    //qué queremos que aparezca en las pestañas
                tab1.setContent(R.id.ejemplo1); //definimos el id de cada Tab (pestaña)
                tab2.setIndicator(lugares[l + 1]);
                tab2.setContent(R.id.ejemplo2);
                tab3.setIndicator(lugares[l + 2]);
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
                    sit2.setImageResource(R.drawable.cine2);
                    t2.setText(c2t);
                    tx2.setText(c2);
                    sit3.setImageResource(R.drawable.cine3);
                    t3.setText(c3t);
                    tx3.setText(c3);
                }else if(MainActivity.num ==1){
                    setTitle(getText(R.string.Teatro));
                    sit1.setImageResource(R.drawable.teatro1);
                    t1.setText(t1t);
                    tx1.setText(te1);
                    sit2.setImageResource(R.drawable.teatro2);
                    t2.setText(t2t);
                    tx2.setText(te2);
                }else if(MainActivity.num ==2){
                    setTitle(getText(R.string.Restaurante));
                    sit1.setImageResource(R.drawable.rest1);
                    t1.setText(r1t);
                    tx1.setText(r1);
                    sit2.setImageResource(R.drawable.rest2);
                    t2.setText(r2t);
                    tx2.setText(r2);
                    sit3.setImageResource(R.drawable.rest3);
                    t3.setText(r3t);
                    tx3.setText(r3);
                }else if(MainActivity.num ==3){
                    setTitle(getText(R.string.Rumba));
                    sit1.setImageResource(R.drawable.rumba1);
                    t1.setText(ru1t);
                    tx1.setText(ru1);
                    sit2.setImageResource(R.drawable.rumba2);
                    t2.setText(ru2t);
                    tx2.setText(ru2);
                    sit3.setImageResource(R.drawable.rumba3);
                    t3.setText(ru3t);
                    tx3.setText(ru3);
                }else if(MainActivity.num ==4){
                    setTitle(getText(R.string.Turismo));
                    sit1.setImageResource(R.drawable.turi1);
                    t1.setText(tu1t);
                    tx1.setText(tu1);
                    sit2.setImageResource(R.drawable.turi2);
                    t2.setText(tu2t);
                    tx2.setText(tu2);
                    sit3.setImageResource(R.drawable.turi3);
                    t3.setText(tu3t);
                    tx3.setText(tu3);

                }*/
            }
        lstNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String seleccion = tit[position+p];
                num=position;
                if (findViewById(R.id.lay2) != null){
                    Intent i = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();

                 /*   TbH.getTabWidget().removeView(TbH.getTabWidget().getChildTabViewAt(2));

                    TbH.getTabWidget().removeView(TbH.getTabWidget().getChildTabViewAt(1));

                    TbH.getTabWidget().removeView(TbH.getTabWidget().getChildTabViewAt(0));*/


                }else{
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this, seleccion, Toast.LENGTH_SHORT).show();
                        //Abrir la actividad
                        Intent i = new Intent(MainActivity.this, LisTabs.class);
                        startActivity(i);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, seleccion, Toast.LENGTH_SHORT).show();
                        //Abrir la actividad
                        Intent i1 = new Intent(MainActivity.this, LisTabs.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, seleccion, Toast.LENGTH_SHORT).show();
                        //Abrir la actividad
                        Intent i2 = new Intent(MainActivity.this, LisTabs.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, seleccion, Toast.LENGTH_SHORT).show();
                        //Abrir la actividad
                        Intent i3 = new Intent(MainActivity.this, LisTabs.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, seleccion, Toast.LENGTH_SHORT).show();
                        //Abrir la actividad
                        Intent i4 = new Intent(MainActivity.this, LisTabs.class);
                        startActivity(i4);
                        break;
                }}
            }
        });

     /*   lstNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(MainActivity.this, String.valueOf(parent.getItemAtPosition(position)),Toast.LENGTH_SHORT).show();
            }
        });*/

    }


    public class Adapter extends ArrayAdapter<Lista_Entrada> {

        public Adapter(Context context, Lista_Entrada[] datos) {
            super(context, R.layout.activity_lista, datos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(p==0){
                titl=datos[position].getNombre();
                can=datos[position].getNombrePila();
            }else{
                titl=datos[position].getNombrei();
                can=datos[position].getCant();
            }
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.activity_lista, null);

            TextView nombre = (TextView) item.findViewById(R.id.tNombre);
            nombre.setText(titl);

            TextView nombrePila = (TextView) item.findViewById(R.id.tNombrePila);
            nombrePila.setText(can);

            // TextView fecha = (TextView) item.findViewById(R.id.fecha);
            //fecha.setText(datos[position].getFecha());

            ImageView imagen = (ImageView) item.findViewById(R.id.imagen);
            imagen.setImageResource(datos[position].getIdImagen());

            return item;
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement



        if (id == R.id.acerca) {
            //Abrir la actividad
            Intent i = new Intent(this, Acercade.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
