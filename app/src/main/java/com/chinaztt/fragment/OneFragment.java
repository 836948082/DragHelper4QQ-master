package com.chinaztt.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chinaztt.viewdrag4qq.R;

/**
 * 当前类注释:第一个Fragment
 * 项目名：FastDev4Android
 * 包名：com.chinaztt.fda.fragment
 */
public class OneFragment extends Fragment {
    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.one_frag_layout, container, false);
        }
        return mView;
    }
}
