package com.example.lat3uts_akb2_10116047_galihrestuseptia;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lat3uts_akb2_10116047_galihrestuseptia.adapter.RecyclerViewAdapter;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.model.ModelDaily;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.presenter.PresenterDaily;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.presenter.PresenterDailyImplement;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.view.InterfaceDaily;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyActivityFragment extends Fragment implements InterfaceDaily {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private PresenterDaily presenterDaily;
    private List<ModelDaily> modelDailies = new ArrayList<>();


    public DailyActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view       = inflater.inflate(R.layout.fragment_daily_activity, container, false);
        presenterDaily  = new PresenterDailyImplement(this);
        recyclerView    = view.findViewById(R.id.recycler);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(modelDailies);
        recyclerView.setAdapter(recyclerViewAdapter);

        presenterDaily.load();
        return view;
    }


    @Override
    public void onLoad(List<ModelDaily> daily) {
        modelDailies.clear();
        modelDailies.addAll(daily);
    }
}
