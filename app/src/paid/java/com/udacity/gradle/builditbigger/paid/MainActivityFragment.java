package com.udacity.gradle.builditbigger.paid;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.udacity.gradle.builditbigger.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


  public MainActivityFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView( LayoutInflater inflater,  ViewGroup container,
       Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_main, container, false);

  }
}
