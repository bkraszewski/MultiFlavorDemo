package io.bkraszewski.multiflavordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.login_button)
    protected View loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
        loginButton.setOnClickListener(v -> {
            MainActivity.start(LoginActivity.this);
            finish();
        });

        if (BuildConfig.DEBUG) {
            showToast("Its a debug!");
        }

        if(BuildConfig.FEATURE_ENABLED){
            addFeatureFragment();
        }

    }

    private void addFeatureFragment() {

    }

    private void showToast(String s) {
    }
}
