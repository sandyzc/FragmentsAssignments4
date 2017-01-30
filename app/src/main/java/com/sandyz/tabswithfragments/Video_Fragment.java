package com.sandyz.tabswithfragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by santosh on 28-01-2017.
 */

public class Video_Fragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private int mPage;

    public static Video_Fragment newInstance(int page){

        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);

        Video_Fragment fragment2 = new Video_Fragment();
        fragment2.setArguments(args);
        return  fragment2;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage=getArguments().getInt(ARG_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.video,container,false);
        TextView textView = (TextView)view.findViewById(R.id.video);

        return view;
    }
}
