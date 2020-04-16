package com.dimastm.pendemi;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPendemiAdapter extends RecyclerView.Adapter<ListPendemiAdapter.ListViewHolder> {

    private ArrayList<Pendemi> listnamap;


    public ListPendemiAdapter(ArrayList<Pendemi>list){
        this.listnamap = list;

    }

    @NonNull
    @Override
    public ListPendemiAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListPendemiAdapter.ListViewHolder holder, int position) {
        final Pendemi pendemi = listnamap.get(position);
        Glide.with(holder.itemView.getContext())
                .load(pendemi.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgFoto);
        holder.tvNamap.setText(pendemi.getNamap());
        holder.tvDetail.setText(pendemi.getDetail());
        holder.tvTotal.setText(pendemi.getTotal());
        holder.tvTahun.setText(pendemi.getTahun());
        holder.kedetail(listnamap.get(position));


    }

    @Override
    public int getItemCount() {
        return listnamap.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNamap, tvDetail,tvTotal,tvTahun;

        public ListViewHolder(View itemView){
            super(itemView);
            imgFoto = itemView.findViewById(R.id.img_item_photo);
            tvNamap = itemView.findViewById(R.id.tv_namap);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            tvTotal = itemView.findViewById(R.id.tv_total);
            tvTahun = itemView.findViewById(R.id.tv_tahun);


        }
        public void kedetail(final Pendemi item){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);

                    intent.putExtra(DetailActivity.NAMAP, item.getNamap());
                    intent.putExtra(DetailActivity.DETAIL, item.getDetail());
                    intent.putExtra(DetailActivity.TOTAL, item.getTotal());
                    intent.putExtra(DetailActivity.TAHUN, item.getTahun());
                    intent.putExtra("value", item.getFoto());
                    itemView.getContext().startActivity(intent);
                }
            });
        }

    }


}
