package com.learn2crack.loginregistration;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.learn2crack.loginregistration.models.Antrian;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<Antrian> android;

    public DataAdapter(ArrayList<Antrian> android) {
        this.android = android;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.antrian_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.nama_antrian.setText(android.get(i).getNamaAntrian());
        viewHolder.sekarang.setText(android.get(i).getNoAntrianUser());
        viewHolder.no_anda.setText(android.get(i).getNoAntrian());

    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nama_antrian,sekarang,no_anda;
        public ViewHolder(View view) {
            super(view);

            nama_antrian = (TextView)view.findViewById(R.id.nama_antrian);
            sekarang = (TextView)view.findViewById(R.id.sekarang);
            no_anda = (TextView)view.findViewById(R.id.no_anda);

        }
    }

}