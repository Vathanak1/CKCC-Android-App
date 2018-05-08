package kh.edu.rupp.ckcc.ckcc;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

    private RecyclerView rclEvent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_home, container, false);
        return fragmentView;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rclEvent = view.findViewById(R.id.rcl_event);

        // Create a layout manager object
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        rclEvent.setLayoutManager(layoutManager);

        // Create an adapter object
        HorizontalEventAdapter adapter = new HorizontalEventAdapter();
        Event[] events = getEvents();
        adapter.setEvents(events);
        rclEvent.setAdapter(adapter);

    }

    private Event[] getEvents() {
        // Temporary event lists
        Event[] events = new Event[3];
        events[0] = new Event("3rd Engineering Day", "16 November 2017", "CKCC", "", "");
        events[1] = new Event("Taekwando Show", "18 January 2018", "CKCC", "", "");
        events[2] = new Event("Korean Culture", "05 April 2018", "CKCC", "", "");
        return events;
    }

}


















