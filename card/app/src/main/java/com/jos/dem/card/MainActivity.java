package com.jos.dem.card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jos.dem.card.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private MainAdapter adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.card_view);
    recyclerView.setHasFixedSize(true);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    adapter = new MainAdapter(getDataSet());

  }

  private List<Fruit> getDataSet() {
    List<Fruit> fruits = new ArrayList<Fruit>();
    fruits.add(new Fruit(0, "Lime"));
    fruits.add(new Fruit(1, "Apple"));
    fruits.add(new Fruit(2, "Pineaple"));
    fruits.add(new Fruit(3, "Melon"));
    return fruits;
  }

}
