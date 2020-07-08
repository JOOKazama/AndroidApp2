package com.androidapp2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie>movies=new ArrayList<>();
        movies.add(new Movie("The Thing","Horror","June 25, 1982"));
        movies.add(new Movie("Hereditary","Horror","June 8, 2018"));
        movies.add(new Movie("Whiplash","Drama","June 25, 1982"));
        movies.add(new Movie("Minority Report","Sci-Fi","June 21, 2002"));
        movies.add(new Movie("Blade Runner","Sci-Fi","June 25, 1982"));

        RecyclerView recycler_view=findViewById(R.id.recycler_view);
        CustomAdapter custom_adapter=new CustomAdapter(movies);
        recycler_view.setAdapter(custom_adapter);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
    }
}