package br.edu.unis.blogapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolder> {
    private List<Post> posts;
    public PostsAdapter(List<Post> posts) { this.posts = posts; }

    @NonNull
    @Override
    public PostsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.post_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Post post = this.posts.get(position);
        holder.bind(post);
    }

    @Override
    public int getItemCount() { return this.posts.size(); }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) { super(itemView); }

        public void bind(Post post) {
            TextView txtTitle = itemView.findViewById(R.id.txt_post_title);
            TextView txtContent = itemView.findViewById(R.id.txt_post_content);
            //LinearLayout linearLayout = itemView.findViewById(R.id.linear_post_item);

            txtTitle.setText(post.getTitle());
            txtContent.setText(post.getContent());
            //linearLayout.setBackgroundResource();
        }
    }
}
