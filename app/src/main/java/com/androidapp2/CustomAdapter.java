package com.androidapp2;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder>
{
    private final List<Movie>movies;
    private Context context;

    public CustomAdapter(List<Movie>movies) { this.movies=movies; }

    @NonNull @Override public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        context=parent.getContext();
        LayoutInflater layout_inflater=LayoutInflater.from(context);
        View contact_view=layout_inflater.inflate(R.layout.rowlayout, parent, false);
        return new ViewHolder((contact_view));
    }

    @Override public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        final Movie movie=movies.get(position);
        holder.setTitle(movie.getTitle());
        holder.setGenre(movie.getGenre());
        holder.setYear(movie.getYear());
        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override public void onClick(View v)
            { Toast.makeText(context,movie.getTitle()+"/"+movie.getGenre()+"/"+movie.getYear(), Toast.LENGTH_SHORT).show(); }
        });
    }

    @Override public int getItemCount() { return movies.size(); }
}