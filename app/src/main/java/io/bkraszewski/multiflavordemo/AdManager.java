package io.bkraszewski.multiflavordemo;

import android.content.Context;

public interface AdManager {
    void onCreate(Context context);
    void onDestroy();
}
