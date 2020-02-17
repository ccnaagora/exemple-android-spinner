package agora.ccna.exempledespinner.sp2;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import agora.ccna.exempledespinner.*;

public class adapterSeptNains extends BaseAdapter {
    septNains[] tab;
    Context context;
    public adapterSeptNains(Context c , septNains[] t){
        tab = t;
        context = c;
    }
    @Override
    public int getCount() {
        return tab.length;
    }
    @Override
    public Object getItem(int position) {
        return tab[position];
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        ImageView im;
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = mInflater.inflate(R.layout.itemsp2, parent, false);
        tv = view.findViewById(R.id.tvsp2) ;//new TextView(context);
        im = view.findViewById(R.id.imsp2);
        tv.setText(tab[position].getNom());
        im.setImageResource(tab[position].getIdRessourceImage());
        return view;
    }
}
