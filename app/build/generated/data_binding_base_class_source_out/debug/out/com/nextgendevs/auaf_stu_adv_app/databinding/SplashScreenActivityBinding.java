// Generated by view binder compiler. Do not edit!
package com.nextgendevs.auaf_stu_adv_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nextgendevs.auaf_stu_adv_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SplashScreenActivityBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout consLayout1;

  @NonNull
  public final ImageView imageView;

  private SplashScreenActivityBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout consLayout1, @NonNull ImageView imageView) {
    this.rootView = rootView;
    this.consLayout1 = consLayout1;
    this.imageView = imageView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SplashScreenActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SplashScreenActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.splash_screen_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SplashScreenActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.consLayout1;
      ConstraintLayout consLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (consLayout1 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      return new SplashScreenActivityBinding((ConstraintLayout) rootView, consLayout1, imageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
