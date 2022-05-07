// Generated by view binder compiler. Do not edit!
package com.nextgendevs.auaf_stu_adv_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.nextgendevs.auaf_stu_adv_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RegisterActivityBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-sw600dp/</li>
   * </ul>
   */
  @Nullable
  public final TextInputEditText emailInput;

  @NonNull
  public final ImageButton facebookBtn;

  @NonNull
  public final TextInputEditText idTextInput;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageButton instagramBtn;

  @NonNull
  public final ImageButton linkedinBtn;

  @NonNull
  public final TextView loginBtn;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-sw600dp/</li>
   * </ul>
   */
  @Nullable
  public final TextView loginText;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout-sw600dp/</li>
   * </ul>
   */
  @Nullable
  public final TextInputEditText passwordInput;

  @NonNull
  public final Button registerBtn;

  /**
   * This binding is not available in all configurations.
   * <p>
   * Present:
   * <ul>
   *   <li>layout-sw600dp/</li>
   * </ul>
   *
   * Absent:
   * <ul>
   *   <li>layout/</li>
   * </ul>
   */
  @Nullable
  public final TextView registerText;

  @NonNull
  public final ImageButton twitterBtn;

  @NonNull
  public final TextView welcomeText;

  private RegisterActivityBinding(@NonNull ScrollView rootView,
      @Nullable TextInputEditText emailInput, @NonNull ImageButton facebookBtn,
      @NonNull TextInputEditText idTextInput, @NonNull ImageView imageView,
      @NonNull ImageButton instagramBtn, @NonNull ImageButton linkedinBtn,
      @NonNull TextView loginBtn, @Nullable TextView loginText,
      @Nullable TextInputEditText passwordInput, @NonNull Button registerBtn,
      @Nullable TextView registerText, @NonNull ImageButton twitterBtn,
      @NonNull TextView welcomeText) {
    this.rootView = rootView;
    this.emailInput = emailInput;
    this.facebookBtn = facebookBtn;
    this.idTextInput = idTextInput;
    this.imageView = imageView;
    this.instagramBtn = instagramBtn;
    this.linkedinBtn = linkedinBtn;
    this.loginBtn = loginBtn;
    this.loginText = loginText;
    this.passwordInput = passwordInput;
    this.registerBtn = registerBtn;
    this.registerText = registerText;
    this.twitterBtn = twitterBtn;
    this.welcomeText = welcomeText;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static RegisterActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RegisterActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.register_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RegisterActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emailInput;
      TextInputEditText emailInput = ViewBindings.findChildViewById(rootView, id);

      id = R.id.facebookBtn;
      ImageButton facebookBtn = ViewBindings.findChildViewById(rootView, id);
      if (facebookBtn == null) {
        break missingId;
      }

      id = R.id.idTextInput;
      TextInputEditText idTextInput = ViewBindings.findChildViewById(rootView, id);
      if (idTextInput == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.instagramBtn;
      ImageButton instagramBtn = ViewBindings.findChildViewById(rootView, id);
      if (instagramBtn == null) {
        break missingId;
      }

      id = R.id.linkedinBtn;
      ImageButton linkedinBtn = ViewBindings.findChildViewById(rootView, id);
      if (linkedinBtn == null) {
        break missingId;
      }

      id = R.id.loginBtn;
      TextView loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.loginText;
      TextView loginText = ViewBindings.findChildViewById(rootView, id);

      id = R.id.passwordInput;
      TextInputEditText passwordInput = ViewBindings.findChildViewById(rootView, id);

      id = R.id.registerBtn;
      Button registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      id = R.id.registerText;
      TextView registerText = ViewBindings.findChildViewById(rootView, id);

      id = R.id.twitterBtn;
      ImageButton twitterBtn = ViewBindings.findChildViewById(rootView, id);
      if (twitterBtn == null) {
        break missingId;
      }

      id = R.id.welcomeText;
      TextView welcomeText = ViewBindings.findChildViewById(rootView, id);
      if (welcomeText == null) {
        break missingId;
      }

      return new RegisterActivityBinding((ScrollView) rootView, emailInput, facebookBtn,
          idTextInput, imageView, instagramBtn, linkedinBtn, loginBtn, loginText, passwordInput,
          registerBtn, registerText, twitterBtn, welcomeText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
