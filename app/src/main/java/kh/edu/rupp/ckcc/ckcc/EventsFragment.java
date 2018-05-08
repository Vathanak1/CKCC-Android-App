package kh.edu.rupp.ckcc.ckcc;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * CKCC
 * Created by leapkh on 3/27/18.
 */

public class EventsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        // Build view and return to Fragment
        View fragmentView = inflater.inflate(R.layout.fragment_events, container, false);
        return fragmentView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rclEvent = view.findViewById(R.id.rcl_event);

        // Create a layout manager object
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rclEvent.setLayoutManager(layoutManager);

        // Create an adapter
        EventAdater adater = new EventAdater();
        rclEvent.setAdapter(adater);
    }
}













