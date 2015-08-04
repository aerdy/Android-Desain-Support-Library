package com.example.jarod.desainsupportlibraryanna;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jarod on 8/4/15.
 */
public class DataActivity extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View tampil = inflater.inflate(R.layout.activity_data,container,false);

        return tampil;
    }
}
