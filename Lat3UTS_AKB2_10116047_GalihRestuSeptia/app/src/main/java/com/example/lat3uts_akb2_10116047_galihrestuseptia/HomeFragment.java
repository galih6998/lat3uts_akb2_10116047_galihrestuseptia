package com.example.lat3uts_akb2_10116047_galihrestuseptia;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lat3uts_akb2_10116047_galihrestuseptia.model.ModelHome;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.presenter.PresenterHome;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.presenter.PresenterHomeImplement;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.view.InterfaceHome;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements InterfaceHome {
    private TextView txtNimKelas;
    private TextView txtNama;
    private TextView txtJurusan;
    private TextView txtDeskripsi;
    private TextView txtHalLain;
    private List<ModelHome> modelHomes = new ArrayList<>();
    private PresenterHome presenterHome;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view       = inflater.inflate(R.layout.fragment_home, container, false);
        presenterHome   = new PresenterHomeImplement(this);
        txtNimKelas     = view.findViewById(R.id.txt_nim);
        txtNama         = view.findViewById(R.id.txt_nama);
        txtJurusan      = view.findViewById(R.id.txt_jurusan);
        txtDeskripsi    = view.findViewById(R.id.txt_content_desc);
        txtHalLain      = view.findViewById(R.id.txt_content_interest);

        presenterHome.load();

        return view;
    }


    public void onLoad(List<ModelHome> homes){
        modelHomes.clear();
        modelHomes.addAll(homes);
        txtNimKelas.setText(homes.get(0).getNimKelas());
        txtNama.setText(homes.get(0).getNama());
        txtJurusan.setText(homes.get(0).getJurusan());
        txtDeskripsi.setText(homes.get(0).getDeskripsi());
        txtHalLain.setText(homes.get(0).getHalLain());
    }

}
