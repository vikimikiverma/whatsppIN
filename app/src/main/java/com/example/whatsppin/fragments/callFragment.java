package com.example.whatsppin.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.whatsppin.R;

public class callFragment extends Fragment {

             public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                 View v=inflater.inflate(R.layout.chatfragment,container,false);
                 return v;
             }
    }
