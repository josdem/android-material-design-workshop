package com.jos.dem.card;

import android.app.Activity;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.jos.dem.card.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private MainAdapter adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    adapter = new MainAdapter(this, getDataSet());
    recyclerView.setAdapter(adapter);
  }

  private List<Fruit> getDataSet() {
    List<Fruit> fruits = new ArrayList<Fruit>();
    fruits.add(new Fruit(R.drawable.lime, "Lime"));
    fruits.add(new Fruit(R.drawable.apple, "Apple"));
    fruits.add(new Fruit(R.drawable.watermelon, "Watermelon"));
    fruits.add(new Fruit(R.drawable.pear, "Pear"));
    return fruits;
  }

}
