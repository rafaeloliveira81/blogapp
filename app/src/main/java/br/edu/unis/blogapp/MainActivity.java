package br.edu.unis.blogapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPosts = findViewById(R.id.rv_posts);
        rvPosts.setLayoutManager(new LinearLayoutManager(this));

        String lorem = "Lorem ipsum dolor sit amet. Sit illo fuga ad doloremque autem et ipsum tenetur ea commodi consequatur est eveniet doloremque. Eum mollitia quae et consequatur tempore At architecto sapiente sit vitae aperiam quo soluta temporibus ab voluptatem voluptatem. Non adipisci nobis ut velit autem est rerum rerum et optio animi aut omnis quae eum eveniet sunt. A quia quae ea dicta reprehenderit rem amet nihil.";
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Desenvolvendo aplicações Android!", lorem));
        posts.add(new Post("Utilizando Recycler View", lorem));
        posts.add(new Post("Android Studio, primeiros passos", lorem));
        posts.add(new Post("Java x Kotlin", lorem));
        posts.add(new Post("Desenvolvimento Mobile com API", lorem));
        posts.add(new Post("Outras Ferramentas", lorem));
        posts.add(new Post("Versionamento de projetos Android", lorem));

        PostsAdapter adapter = new PostsAdapter(posts);
        rvPosts.setAdapter(adapter);
    }
}