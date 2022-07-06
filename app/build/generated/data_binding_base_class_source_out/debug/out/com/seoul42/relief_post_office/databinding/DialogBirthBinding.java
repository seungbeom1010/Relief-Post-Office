// Generated by view binder compiler. Do not edit!
package com.seoul42.relief_post_office.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.seoul42.relief_post_office.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogBirthBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final NumberPicker birthDay;

  @NonNull
  public final NumberPicker birthMonth;

  @NonNull
  public final Button birthSave;

  @NonNull
  public final NumberPicker birthYear;

  private DialogBirthBinding(@NonNull LinearLayout rootView, @NonNull NumberPicker birthDay,
      @NonNull NumberPicker birthMonth, @NonNull Button birthSave,
      @NonNull NumberPicker birthYear) {
    this.rootView = rootView;
    this.birthDay = birthDay;
    this.birthMonth = birthMonth;
    this.birthSave = birthSave;
    this.birthYear = birthYear;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogBirthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogBirthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_birth, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogBirthBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.birth_day;
      NumberPicker birthDay = ViewBindings.findChildViewById(rootView, id);
      if (birthDay == null) {
        break missingId;
      }

      id = R.id.birth_month;
      NumberPicker birthMonth = ViewBindings.findChildViewById(rootView, id);
      if (birthMonth == null) {
        break missingId;
      }

      id = R.id.birth_save;
      Button birthSave = ViewBindings.findChildViewById(rootView, id);
      if (birthSave == null) {
        break missingId;
      }

      id = R.id.birth_year;
      NumberPicker birthYear = ViewBindings.findChildViewById(rootView, id);
      if (birthYear == null) {
        break missingId;
      }

      return new DialogBirthBinding((LinearLayout) rootView, birthDay, birthMonth, birthSave,
          birthYear);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
