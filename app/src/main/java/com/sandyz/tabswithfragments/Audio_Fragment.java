package com.sandyz.tabswithfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by santosh on 28-01-2017.
 */

public class Audio_Fragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;


    public static Audio_Fragment newInstance(int page){


        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        Audio_Fragment fragment = new Audio_Fragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.audio,container,false);
        TextView textview = (TextView)view.findViewById(R.id.audio);

        return view;
    }
}
