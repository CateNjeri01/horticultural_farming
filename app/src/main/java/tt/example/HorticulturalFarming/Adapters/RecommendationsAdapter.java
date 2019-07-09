package tt.example.HorticulturalFarming.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import tt.example.HorticulturalFarming.R;
import tt.example.HorticulturalFarming.models.Recommendation;

public class RecommendationsAdapter extends RecyclerView.Adapter<RecommendationsAdapter.RecHolder> {

    private List<Recommendation> recommendationList;
    private Context ctx;

    public RecommendationsAdapter(List<Recommendation> recommendationList) {
        this.recommendationList = recommendationList;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ctx = viewGroup.getContext();
        View view = LayoutInflater.from(ctx).inflate(R.layout.single_rec_view, viewGroup, false);
        return new RecHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder recHolder, int i) {

        Recommendation rec = recommendationList.get(i);
        recHolder.cropName.setText(rec.getName());

        Glide.with(ctx)
                .load(rec.getImage())
                .into(recHolder.cropImage);

    }

    @Override
    public int getItemCount() {
        return recommendationList.size();
    }

    class RecHolder extends RecyclerView.ViewHolder {

        ImageView cropImage;
        TextView cropName;

        public RecHolder(@NonNull View itemView) {
            super(itemView);

            cropImage = itemView.findViewById(R.id.cropImage);
            cropName = itemView.findViewById(R.id.cropName);
        }
    }
}
