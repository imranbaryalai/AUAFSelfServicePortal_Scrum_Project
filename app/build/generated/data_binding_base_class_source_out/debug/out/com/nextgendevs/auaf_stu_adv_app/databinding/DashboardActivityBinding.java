// Generated by view binder compiler. Do not edit!
package com.nextgendevs.auaf_stu_adv_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.nextgendevs.auaf_stu_adv_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DashboardActivityBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final CardView Card1;

  @NonNull
  public final CardView Card2;

  @NonNull
  public final ImageView imageView;

  private DashboardActivityBinding(@NonNull ScrollView rootView, @NonNull CardView Card1,
      @NonNull CardView Card2, @NonNull ImageView imageView) {
    this.rootView = rootView;
    this.Card1 = Card1;
    this.Card2 = Card2;
    this.imageView = imageView;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DashboardActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DashboardActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dashboard_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DashboardActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Card1;
      CardView Card1 = ViewBindings.findChildViewById(rootView, id);
      if (Card1 == null) {
        break missingId;
      }

      id = R.id.Card2;
      CardView Card2 = ViewBindings.findChildViewById(rootView, id);
      if (Card2 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      return new DashboardActivityBinding((ScrollView) rootView, Card1, Card2, imageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
