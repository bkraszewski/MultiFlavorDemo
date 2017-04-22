package io.bkraszewski.multiflavordemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class AdFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmen_ad, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        int[] ads = new int[]{R.id.adView_1, R.id.adView_2, R.id.adView_3, R.id.adView_4};

        MobileAds.initialize(getActivity().getApplicationContext(), "ca-app-pub-3940256099942544~3347511713");

        for (Integer adId : ads) {
            AdView banner = (AdView) view.findViewById(adId);
            AdRequest adRequest = new AdRequest.Builder()
                    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                    .build();
            banner.loadAd(adRequest);
        }

    }
}
