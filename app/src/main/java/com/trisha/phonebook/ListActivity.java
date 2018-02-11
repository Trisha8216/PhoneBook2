package com.trisha.phonebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends AppCompatActivity {

    TextView textView;
    ListView listView;
    String FrndName[]={"Friend1","Friend2","Friend3","Friend4","Friend5","Friend6","Friend7","Friend8","Friend9","Friend10","Friend11","Friend12"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        textView=(TextView)findViewById(R.id.textView2);
        listView=(ListView)findViewById(R.id.list);
        ArrayAdapter adapter=new ArrayAdapter(ListActivity.this,R.layout.support_simple_spinner_dropdown_item,FrndName);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent intent=new Intent(ListActivity.this,DetailsActivity.class);
                intent.putExtra("name",FrndName[position]);
                startActivity(intent);

            }
        });
    }
}
