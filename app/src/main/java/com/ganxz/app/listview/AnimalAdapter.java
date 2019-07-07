package com.ganxz.app.listview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.ganxz.app.R;

import java.util.List;

public class AnimalAdapter extends ArrayAdapter<AnimalVo> {
    private int resource;

    private final int VIEW_HOLDER_TAG = 1;
    public AnimalAdapter(Context context, int resource, List<AnimalVo> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // return super.getView(position, convertView, parent);
        AnimalVo animalVo = getItem(position);
        View view ;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(this.resource, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) view.findViewById(R.id.complex_item_image_view);
            viewHolder.textView =(TextView) view.findViewById(R.id.complex_item_text_view);

            view.setTag( viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.imageView.setImageResource(animalVo.getIconId());
        viewHolder.textView.setText(animalVo.getName());

        return view;
    }

    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
