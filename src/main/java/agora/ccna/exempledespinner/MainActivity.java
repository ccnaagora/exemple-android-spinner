package agora.ccna.exempledespinner;

import agora.ccna.exempledespinner.sp2.adapterSeptNains;
import agora.ccna.exempledespinner.sp2.septNains;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner sp1, sp2;
    TextView tv1, tv2;
    String[] nomSeptnains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1 = findViewById(R.id.sp1);
        sp2 = findViewById(R.id.sp2);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        //remplissage du tableau avec la ressources 'septnains'
        nomSeptnains = getResources().getStringArray(R.array.septnains);
        //remplissage et habillage de sp1
        ArrayAdapter adp1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, nomSeptnains);
        sp1.setAdapter(adp1);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tv1.setText("item : " + sp1.getSelectedItem());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //remplissage et habillage personnalisé de sp2
        //nécessite de créer un adapter personnalisé et une classe de gestion des items :
        //                  texte et images des septnains issus des ressources regroupées dans un tableau de septNains
        String[] nom = getResources().getStringArray(R.array.septnains);
        int[] id = {R.mipmap.atchoum,R.mipmap.dormeur, R.mipmap.grincheux , R.mipmap.joyeux};
        septNains[] tab = new septNains[4];
        for(int i=0 ; i<4 ; i++){
            tab[i] = new septNains(nom[i] , id[i]);
            Log.i("SPIN" , tab[i].toString());
        }


        sp2.setAdapter(new adapterSeptNains(this ,tab ));
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tv2.setText( ((septNains)sp2.getSelectedItem()).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}