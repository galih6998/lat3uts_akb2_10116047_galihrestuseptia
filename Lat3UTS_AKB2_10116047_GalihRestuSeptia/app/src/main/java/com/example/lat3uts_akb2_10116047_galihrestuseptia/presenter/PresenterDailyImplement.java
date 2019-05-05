package com.example.lat3uts_akb2_10116047_galihrestuseptia.presenter;

import com.example.lat3uts_akb2_10116047_galihrestuseptia.model.ModelDaily;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.model.ModelHome;
import com.example.lat3uts_akb2_10116047_galihrestuseptia.view.InterfaceDaily;

import java.util.ArrayList;
import java.util.List;

public class PresenterDailyImplement implements PresenterDaily {
    private InterfaceDaily interfaceDaily;
    private List<ModelDaily> modelDailist = new ArrayList<>();


    public PresenterDailyImplement(InterfaceDaily interfaceDaily){
        this.interfaceDaily = interfaceDaily;
        setData();
    }

    public void setData(){
        ModelDaily daily    = new ModelDaily();
        daily.setWaktu("04:30");
        daily.setKegiatan("Bangun pagi, sholat subuh, dan mandi pagi ");
        modelDailist.add(daily);

        ModelDaily daily1   = new ModelDaily();
        daily1.setWaktu("05:00");
        daily1.setKegiatan("Sarapan pagi");
        modelDailist.add(daily1);
    }

    @Override
    public void load() {
        interfaceDaily.onLoad(modelDailist);
    }
}
