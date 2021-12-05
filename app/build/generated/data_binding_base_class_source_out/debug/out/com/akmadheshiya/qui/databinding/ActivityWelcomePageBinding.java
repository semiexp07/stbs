// Generated by view binder compiler. Do not edit!
package com.akmadheshiya.qui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.akmadheshiya.qui.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ActivityWelcomePageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout splash;

  private ActivityWelcomePageBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout splash) {
    this.rootView = rootView;
    this.splash = splash;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWelcomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWelcomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_welcome_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWelcomePageBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    LinearLayout splash = (LinearLayout) rootView;

    return new ActivityWelcomePageBinding((LinearLayout) rootView, splash);
  }
}