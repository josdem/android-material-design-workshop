package com.jos.dem.list;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements ItemClickListener {

  private MainAdapter adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    List<String> dataset = new ArrayList<String>();
    dataset.add("josdem");
    dataset.add("skuarch");
    dataset.add("tgrip");
    dataset.add("erich");
    dataset.add("martinvillegas");

    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setHasFixedSize(true);
    adapter = new MainAdapter(this, dataset);
    adapter.setClickListener(this);
    recyclerView.setAdapter(adapter);
  }

  @Override
  public void onItemClick(View view, int position) {
    Toast.makeText(this, "You clicked " + adapter.getItem(position), Toast.LENGTH_SHORT).show();
  }

}
