package com.example.lat3uts_akb2_10116047_galihrestuseptia.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lat3uts_akb2_10116047_galihrestuseptia.R;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.model.ModelDaily;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<ModelDaily> modelDailies;

    public RecyclerViewAdapter(List<ModelDaily> modelDailies){
        this.modelDailies   = modelDailies;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView txtWaktu;
        public TextView txtKegiatan;

        public ViewHolder(View v) {
            super(v);
            txtWaktu = (TextView) v.findViewById(R.id.txt_waktu);
            txtKegiatan = (TextView) v.findViewById(R.id.txt_kegiatan);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily_activity, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelDaily modelDaily = modelDailies.get(position);
        holder.txtWaktu.setText(modelDaily.getWaktu());
        holder.txtKegiatan.setText(modelDaily.getKegiatan());
    }



    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return modelDailies.size();
    }

}
