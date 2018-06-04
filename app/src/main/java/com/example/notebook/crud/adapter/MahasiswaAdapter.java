package com.example.notebook.crud.adapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.notebook.crud.R;
import com.example.notebook.crud.model.Mahasiswa;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NOTEBOOK on 04/06/2018.
 */

public class MahasiswaAdapter extends ArrayAdapter<Mahasiswa> {
    public MahasiswaAdapter(@NonNull Context context,
                            int resource,
                            @NonNull List<Mahasiswa> objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position,
                        @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_mahasiswa, parent, false);
        }

//        String user = getItem(position);
        Mahasiswa mahasiswa = getItem(position);
        TextView tvNama = convertView.findViewById(R.id.iv_nama);
        tvNama.setText(mahasiswa.getNama());

        TextView tvNim = convertView.findViewById(R.id.iv_nim);
        tvNim.setText(mahasiswa.getNim());

        TextView tvEmail = convertView.findViewById(R.id.iv_email);
        tvEmail.setText(mahasiswa.getEmail());

        ImageView ivFoto = convertView.findViewById(R.id.iv_foto);
        Log.e("CRUD", "Foto: http://172.16.136.239/laravel/LaraPpbIK3A/" + mahasiswa.getFoto());
        //Picasso.get().load("http://172.16.136.239/laravel/LaraPpbIK3A/" + mahasiswa.getFoto()).into(ivFoto);


        return convertView;
    }
}