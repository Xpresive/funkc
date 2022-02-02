package com.example.egz_funkcijos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_first2, container, false);

        SecondActivity mainActivity = (SecondActivity) getActivity();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SecondFragment fragment = new SecondFragment();

        Bundle args = new Bundle();
        args.putString("data", "s");

        fragment.setArguments(args);
        fragmentTransaction.replace(R.id.graphPlaceHolder, fragment);
        fragmentTransaction.addToBackStack("");
        fragmentTransaction.commit();

        return rootView;
    }
}