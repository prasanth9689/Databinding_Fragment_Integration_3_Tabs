package com.skyblue.databindingfragmentintegration3tabs.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skyblue.databindingfragmentintegration3tabs.R;
import com.skyblue.databindingfragmentintegration3tabs.databinding.FragmentSignupBinding;


public class SignupFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentSignupBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_signup, container, false);

        return binding.getRoot();
    }
}