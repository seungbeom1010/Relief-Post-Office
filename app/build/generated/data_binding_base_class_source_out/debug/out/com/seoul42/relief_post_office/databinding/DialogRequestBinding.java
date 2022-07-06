// Generated by view binder compiler. Do not edit!
package com.seoul42.relief_post_office.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.seoul42.relief_post_office.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogRequestBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button requestButton;

  @NonNull
  public final EditText requestEdit;

  private DialogRequestBinding(@NonNull LinearLayout rootView, @NonNull Button requestButton,
      @NonNull EditText requestEdit) {
    this.rootView = rootView;
    this.requestButton = requestButton;
    this.requestEdit = requestEdit;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogRequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_request, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogRequestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.request_button;
      Button requestButton = ViewBindings.findChildViewById(rootView, id);
      if (requestButton == null) {
        break missingId;
      }

      id = R.id.request_edit;
      EditText requestEdit = ViewBindings.findChildViewById(rootView, id);
      if (requestEdit == null) {
        break missingId;
      }

      return new DialogRequestBinding((LinearLayout) rootView, requestButton, requestEdit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
