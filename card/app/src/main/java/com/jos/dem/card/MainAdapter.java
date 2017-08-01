package com.jos.dem.card;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jos.dem.card.model.Fruit;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
  private List<Fruit> dataset;
  private Context context;

  public MainAdapter(Context context, List<Fruit> dataset) {
    this.context = context;
    this.dataset = dataset;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    Fruit fruit = dataset.get(position);
    holder.name.setText(fruit.getName());
    holder.thumbnail.setImageResource(fruit.getThumbnail());
  }

  @Override
  public int getItemCount() {
    return dataset.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public ImageView thumbnail;

    public ViewHolder(View itemView) {
      super(itemView);
      name = (TextView) itemView.findViewById(R.id.name);
      thumbnail = (ImageView) itemView.findViewById(R.id.thumbnail);
    }
  }

}