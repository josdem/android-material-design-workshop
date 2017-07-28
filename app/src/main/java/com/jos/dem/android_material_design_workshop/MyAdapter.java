package com.jos.dem.android_material_design_workshop;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
  private List<String> dataset;
  private LayoutInflater inflater;
  private ItemClickListener clickListener;

  public MyAdapter(Context context, List<String> dataset) {
    this.inflater = LayoutInflater.from(context);
    this.dataset = dataset;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = inflater.inflate(R.layout.my_text_view, parent, false);
    ViewHolder viewHolder = new ViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    holder.myTextView.setText(dataset.get(position));
  }

  @Override
  public int getItemCount() {
    return dataset.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView myTextView;

    public ViewHolder(View itemView) {
      super(itemView);
      myTextView = (TextView) itemView.findViewById(R.id.nicknames);
      itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
      if (clickListener != null) clickListener.onItemClick(view, getAdapterPosition());
    }
  }

  public String getItem(int id) {
    return dataset.get(id);
  }

  public void setClickListener(ItemClickListener itemClickListener) {
    this.clickListener = itemClickListener;
  }

  public interface ItemClickListener {
    void onItemClick(View view, int position);
  }

}

