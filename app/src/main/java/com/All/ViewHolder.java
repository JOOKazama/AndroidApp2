package com.All;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder
{
    private final TextView title;
    private final TextView genre;
    private final TextView year;

    public TextView getTitle() { return title; }
    public void setTitle(String title) { this.title.setText(title); }
    public TextView getGenre() { return genre; }
    public void setGenre(String genre) { this.genre.setText(genre); }
    public TextView getYear() { return year; }
    public void setYear(String year) { this.year.setText(year); }

    public ViewHolder(@NonNull View itemView)
    {
        super(itemView);
        title=itemView.findViewById(R.id.title);
        genre=itemView.findViewById(R.id.genre);
        year=itemView.findViewById(R.id.year);
    }
}