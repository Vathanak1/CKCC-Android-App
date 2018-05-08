package kh.edu.rupp.ckcc.ckcc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HorizontalEventAdapter extends RecyclerView.Adapter<HorizontalEventAdapter.EventViewHolder> {

    private Event[] events;

    public void setEvents(Event[] events) {
        this.events = events;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Load view holder layout file
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.view_holder_event_horizontal, parent, false);
        EventViewHolder viewHolder = new EventViewHolder(itemView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        Event event = events[position];
        holder.txtTitle.setText(event.getTitle());
        holder.txtDate.setText(event.getDate());
    }

    @Override
    public int getItemCount() {
        return events.length;
    }

    class EventViewHolder extends RecyclerView.ViewHolder {

        private TextView txtTitle;
        private TextView txtDate;

        public EventViewHolder(View itemView) {
            super(itemView);

            txtTitle = itemView.findViewById(R.id.txt_title);
            txtDate = itemView.findViewById(R.id.txt_date);
        }
    }

}
