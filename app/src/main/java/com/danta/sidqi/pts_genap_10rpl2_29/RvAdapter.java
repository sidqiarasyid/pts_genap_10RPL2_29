package com.danta.sidqi.pts_genap_10rpl2_29;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvViewHolder>{
    private ArrayList<Data> datalist;
    public RvAdapter(ArrayList<Data> datalist){
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item, parent, false);
        return new RvViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {
        holder.txtttl.setText(datalist.get(position).getTtl());
        holder.txtupdate.setText(datalist.get(position).getUpdate());
        holder.txtartist.setText(datalist.get(position).getArtist());
        holder.imgpaintings.setImageResource(datalist.get(position).getImgurl());

    }

    @Override
    public int getItemCount() {
        return (datalist != null) ? datalist.size() : 0;
    }

    public class RvViewHolder extends RecyclerView.ViewHolder{
        private TextView txtttl, txtupdate, txtartist;
        private ImageView imgpaintings;
        public RvViewHolder(@NonNull View itemView) {
            super(itemView);
            txtttl = (TextView) itemView.findViewById(R.id.ttltxt);
            txtupdate = (TextView) itemView.findViewById(R.id.udtxt);
            txtartist = (TextView) itemView.findViewById(R.id.artisttxt);
            imgpaintings = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}
