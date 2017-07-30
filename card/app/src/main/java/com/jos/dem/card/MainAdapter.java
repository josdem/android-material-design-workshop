package com.jos.dem.card;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
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
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
    ViewHolder viewHolder = new ViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    Fruit fruit = dataset.get(position);
    holder.name.setText(fruit.getName());
    Glide.with(context).load(fruit.getThumbnail()).into(holder.thumbnail);
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