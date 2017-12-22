package com.example.acer.spnj1;

/**
 * Created by rizky.pratama98988 on 22/12/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class ProjectSpnj7 extends AppCompatActivity implements SearchView.OnQueryTextListener {

    ListView lv;
    Context context;
    SearchView searchView;
    ArrayAdapter<String> adapter;
    int [] img={
            R.drawable.img_nasiayam,
            R.drawable.img_nasilele,
            R.drawable.img_nasigoreng,
            R.drawable.img_kwetiaw,
            R.drawable.img_seafood,
            R.drawable.img_esteh,
            R.drawable.img_jus,
            R.drawable.img_softdrink};
    String [] menu={"Nasi Ayam", "Pecel Lele", "Nasi Goreng Spesial", "Kwetiaw", "Aneka Seafood", "Teh Manis", "Aneka Juice", "Aneka Soft Drink"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_spnj7);
        context=this;

        searchView = (SearchView) findViewById(R.id.searchView);
        lv=(ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,menu);
        lv.setAdapter(new CustomAdapter(this, menu ,img));
        searchView.setOnQueryTextListener(this);

        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this, menu, img));

    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.getFilter().filter(newText);
        return false;
    }

}

class CustomAdapter extends BaseAdapter{
    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public  CustomAdapter( ProjectSpnj7 mainActivity, String[] menu, int[] img) {
        // TODO Auto-generated constructor stub
        result=menu;
        context=mainActivity;
        imageId=img;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.img_searchview, null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

}

