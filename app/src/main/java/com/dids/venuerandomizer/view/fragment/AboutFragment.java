package com.dids.venuerandomizer.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dids.venuerandomizer.BuildConfig;
import com.dids.venuerandomizer.R;

public class AboutFragment extends Fragment {

    public static AboutFragment newInstance() {
        return new AboutFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        TextView version = (TextView) view.findViewById(R.id.version);
        version.setText(String.format(getString(R.string.version), BuildConfig.VERSION_NAME));
        return view;
    }
}