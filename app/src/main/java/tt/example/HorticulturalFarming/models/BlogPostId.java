package tt.example.HorticulturalFarming.models;

import android.support.annotation.NonNull;

public class BlogPostId {
    public String BlogPostId;

    public <T extends BlogPostId> T withId(@NonNull final String id) {
        this.BlogPostId = id;
        return (T) this;
    }
}

