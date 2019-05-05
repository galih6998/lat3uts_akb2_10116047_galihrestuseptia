package com.example.lat3uts_akb2_10116047_galihrestuseptia.presenter;

import com.example.lat3uts_akb2_10116047_galihrestuseptia.model.ModelHome;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.view.InterfaceHome;

import java.util.ArrayList;
import java.util.List;

public class PresenterHomeImplement implements PresenterHome {
    private InterfaceHome interfaceHome;
    private List<ModelHome> modelHomes = new ArrayList<>();

    public PresenterHomeImplement(InterfaceHome interfaceHome){
        this.interfaceHome = interfaceHome;
        setData();
    }


    private void setData(){
        ModelHome modelHome = new ModelHome();
        modelHome.setNimKelas("10116047 (IF-2)");

        modelHome.setNama("GALIH RESTU SEPTIA");
        modelHome.setJurusan("TEKNIK INFORMATIKA");
        modelHome.setDeskripsi("Galih lahir di Sukabumi ,6 September 1998. Aku dibesarkan di Kalimantan Barat dan sekarang merantau diBandung untuk kuliah diUniversitas Komputer Indonesia (UNIKOM) Jurusan Teknik Informatika pada tingkat 3 semester 6.");
        modelHome.setHalLain("Aku Orang yang tidak suka terlalu diam dirumah/kosan, jadi Hobby Aku adalah Fotografi, Food, dan Travelling. Dan kegiatan aku sekarang menjadi freelance fotografi produk sembari mengisi waktu kosong dan untuk menambah biaya untuk diri sendiri.");
        modelHomes.add(modelHome);
    }

    @Override
    public void load() {
        interfaceHome.onLoad(modelHomes);
    }

}
