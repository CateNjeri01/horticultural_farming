package tt.example.HorticulturalFarming.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import tt.example.HorticulturalFarming.Adapters.BlogPostAdapter;
import tt.example.HorticulturalFarming.R;
import tt.example.HorticulturalFarming.models.BlogPost;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrendingPostFragment extends Fragment {

    private static final String TAG = "TrendingPostFragment";

    private RecyclerView blog_list_view;
    private List<BlogPost> blog_list;
    private FirebaseFirestore firebaseFirestore;
    private BlogPostAdapter blogPostAdapter;

    public TrendingPostFragment() {
        // Required empty public constructor

        blog_list= new ArrayList<>();
        firebaseFirestore = FirebaseFirestore.getInstance();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trending_post, container, false);
        blog_list_view = view.findViewById(R.id.posts_rv);

        blogPostAdapter = new BlogPostAdapter(blog_list);
        blog_list_view.setLayoutManager(new LinearLayoutManager(getActivity()));
        blog_list_view.setAdapter(blogPostAdapter);
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        firebaseFirestore.collection("posts")
                .orderBy("date", Query.Direction.DESCENDING)
                .addSnapshotListener(
                        this::onEvent
                );
    }

    public void onEvent(QuerySnapshot queryDocumentSnapshots, FirebaseFirestoreException e) {
        if (e != null) {
            Log.e(TAG, "Fetchpost: Error", e);
            return;
        }

        if (!queryDocumentSnapshots.isEmpty()) {

            for (DocumentSnapshot doc : queryDocumentSnapshots.getDocuments()) {

                String blogPostId = doc.getId();
                BlogPost post = doc.toObject(BlogPost.class).withId(blogPostId);
                post.setId(doc.getId());

                blog_list.add(post);

                blogPostAdapter.notifyDataSetChanged();
            }

        } else {
            Toast.makeText(getActivity(), "No posts yet", Toast.LENGTH_SHORT).show();
        }
    }


}
