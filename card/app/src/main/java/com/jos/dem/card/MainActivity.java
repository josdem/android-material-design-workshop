package com.jos.dem.card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

  private MainAdapter adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    recyclerView.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
    adapter = new MainAdapter(this, getDataSet());
    adapter.setClickListener(this);
    recyclerView.setAdapter(adapter);
  }

  private List<Fruit> getDataSet() {
    List<Fruit> fruits = new ArrayList<Fruit>();
    fruits.add(new Fruit("Lime", R.drawable.lime));
    fruits.add(new Fruit("Apple", R.drawable.apple));
    fruits.add(new Fruit("Watermelon", R.drawable.watermelon));
    fruits.add(new Fruit("Pear", R.drawable.pear));
    return fruits;
  }

  @Override
  public void onItemClick(View view, int position) {
    Toast.makeText(this, "You clicked " + adapter.getItem(position), Toast.LENGTH_SHORT).show();
  }

}
