package kh.edu.rupp.ckcc.ckcc;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * CKCC
 * Created by leapkh on 3/27/18.
 */

public class NewsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // Build view and return to Fragment
        View fragmentView = inflater.inflate(R.layout.fragment_news, container, false);
        return fragmentView;

    }
}
