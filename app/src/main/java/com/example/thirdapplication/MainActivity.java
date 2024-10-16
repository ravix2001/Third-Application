package com.example.thirdapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView autoComplete;
    ArrayList<String> items = new ArrayList<>();
    ArrayList<String> cities = new ArrayList<>();
    ArrayList<String> langs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = findViewById(R.id.listView);

        items.add("Ram");
        items.add("Ramesh");
        items.add("Shyam");
        items.add("Hari");
        items.add("Gopal");
        items.add("Manish");
        items.add("Ram");
        items.add("Ramesh");
        items.add("Shyam");
        items.add("Hari");
        items.add("Gopal");
        items.add("Manish");
        items.add("Ram");
        items.add("Ramesh");
        items.add("Shyam");
        items.add("Hari");
        items.add("Gopal");
        items.add("Manish");
        items.add("Ram");
        items.add("Ramesh");
        items.add("Shyam");
        items.add("Hari");
        items.add("Gopal");
        items.add("Manish");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this, "1st item clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        spinner = findViewById(R.id.spinner);

        cities.add("biratnagar");
        cities.add("dharan");
        cities.add("kathmandu");
        cities.add("birgunj");
        cities.add("biratnagar");
        cities.add("dharan");
        cities.add("kathmandu");
        cities.add("birgunj");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, cities);

        spinner.setAdapter(spinnerAdapter);

        autoComplete = findViewById(R.id.autoComplete);

        langs.add("C");
        langs.add("C++");
        langs.add("C#");
        langs.add("Java");
        langs.add("Python");

        ArrayAdapter<String> autoCompleteAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, langs);
        autoComplete.setAdapter(autoCompleteAdapter);
        autoComplete.setThreshold(1);

    }
}