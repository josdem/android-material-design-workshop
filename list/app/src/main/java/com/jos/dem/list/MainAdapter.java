package com.jos.dem.list;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
  private List<String> dataset;
  private LayoutInflater inflater;
  private ItemClickListener clickListener;

  public MainAdapter(Context context, List<String> dataset) {
    this.inflater = LayoutInflater.from(context);
    this.dataset = dataset;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = inflater.inflate(R.layout.recycler_view, parent, false);
    ViewHolder viewHolder = new ViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    holder.textView.setText(dataset.get(position));
  }

  @Override
  public int getItemCount() {
    return dataset.size();
  }

  public String getItem(int id) {
    return dataset.get(id);
  }

  public void setClickListener(ItemClickListener itemClickListener) {
    this.clickListener = itemClickListener;
  }

  public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView textView;

    public ViewHolder(View itemView) {
      super(itemView);
      textView = (TextView) itemView.findViewById(R.id.nicknames);
      itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      clickListener.onItemClick(view, getAdapterPosition());
    }
  }

}

