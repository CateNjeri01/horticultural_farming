package tt.example.HorticulturalFarming.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

import tt.example.HorticulturalFarming.Adapters.UserAdapter;
import tt.example.HorticulturalFarming.R;
import tt.example.HorticulturalFarming.models.User;

public class UsersFragment extends Fragment {
    private static final String TAG = "UsersFragment";

    private UserAdapter userAdapter;
    private List<User> mUsers;

    EditText search_users;

    private FirebaseFirestore mDb;
    private FirebaseAuth mAuth;

    public UsersFragment() {
        mAuth = FirebaseAuth.getInstance();
        mDb = FirebaseFirestore.getInstance();
        mUsers = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_users, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        userAdapter = new UserAdapter(getContext(), mUsers, false);
        recyclerView.setAdapter(userAdapter);

        readUsers();

        search_users = view.findViewById(R.id.search_users);
        search_users.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                searchUsers(charSequence.toString().toLowerCase());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        return view;
    }

    private void searchUsers(String s) {

        mDb.collection("users")
                .whereEqualTo("name", s)
                .addSnapshotListener(
                        (queryDocumentSnapshots, e) -> {
                            if (e != null) {
                                Log.e(TAG, "readUsers: ", e);
                                return;
                            }

                            if (queryDocumentSnapshots.isEmpty()) {
                                mUsers.clear();

                                DocumentSnapshot doc = queryDocumentSnapshots.getDocuments().get(0);
                                if (doc.exists()) {
                                    User user = doc.toObject(User.class);
                                    userAdapter.notifyDataSetChanged();
                                }

                            } else {
                                Toast.makeText(getActivity(), "No users yet", Toast.LENGTH_SHORT).show();
                            }
                        }
                );
    }

    private void readUsers() {

        mDb.collection("users")
                .addSnapshotListener(
                        (queryDocumentSnapshots, e) -> {
                            if (e != null) {
                                Log.e(TAG, "readUsers: ", e);
                                return;
                            }

                            if (!queryDocumentSnapshots.isEmpty()) {
                                mUsers.clear();
                                for (DocumentSnapshot doc : queryDocumentSnapshots.getDocuments()) {
                                    User user = doc.toObject(User.class);
                                    user.setId(doc.getId());
                                    mUsers.add(user);
                                    userAdapter.notifyDataSetChanged();
                                }
                            } else {
                                Toast.makeText(getActivity(), "No users yet", Toast.LENGTH_SHORT).show();
                            }
                        }
                );
    }
}
