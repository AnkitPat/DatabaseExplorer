package com.example.bbim1041.databaseexplorer;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by BBIM1043 on 19/09/17.
 */

public class TableChooserFragment extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View layoutView = inflater.inflate(R.layout.guideline_chooser,container,false);

        ListView listView = (ListView)layoutView.findViewById(R.id.guidelineList);


        ArrayList<String> tableArrayList= (ArrayList<String>)getArguments().getStringArrayList("TableArray");






        return layoutView;
    }


}
