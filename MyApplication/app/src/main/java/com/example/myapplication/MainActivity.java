 package com.example.myapplication;

 import android.app.Activity;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.ArrayAdapter;
 import android.widget.EditText;
 import android.widget.ListView;

 import java.util.ArrayList;


 public class MainActivity extends Activity {
     private ArrayList<String> items;
     private ArrayAdapter<String> itemsAdapter;
     private ListView lvItems;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         // ADD HERE
         lvItems = (ListView) findViewById(R.id.lvItems);
         items = new ArrayList<String>();
         itemsAdapter = new ArrayAdapter<String>(this,
                 android.R.layout.simple_list_item_1, items);
         lvItems.setAdapter(itemsAdapter);
         items.add("First Item");
         items.add("Second Item");
     }
     public void onAddItem(View v) {
         EditText etNewItem = (EditText) findViewById(R.id.etNewItem);
         String itemText = etNewItem.getText().toString();
         itemsAdapter.add(itemText);
         etNewItem.setText("");
     }
 }