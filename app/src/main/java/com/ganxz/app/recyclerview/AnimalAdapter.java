package com.ganxz.app.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ganxz.app.R;
import com.ganxz.app.listview.AnimalVo;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private List<AnimalVo> animalVos;
    public AnimalAdapter(List<AnimalVo> animalVos) {
        this.animalVos = animalVos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.complex_recycler_view_item, null, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AnimalVo animalVo = animalVos.get(position);
        holder.imageView.setImageResource(animalVo.getIconId());
        holder.textView.setText(animalVo.getName());
    }

    @Override
    public int getItemCount() {
        return animalVos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.complex_item_image_view);
            textView = (TextView) itemView.findViewById(R.id.complex_item_text_view);
        }
    }
}
