package com.example.dsoutofernandez.aplicacion2fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

/**
 * A placeholder fragment containing a simple view.
 */
public class Activity2Fragment extends Fragment {

    public Activity2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2, container, false);
    }
}
