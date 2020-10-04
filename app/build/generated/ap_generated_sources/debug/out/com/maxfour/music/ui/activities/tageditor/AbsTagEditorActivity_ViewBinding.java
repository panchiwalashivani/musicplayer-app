// Generated code from Butter Knife. Do not modify!
package com.maxfour.music.ui.activities.tageditor;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.maxfour.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AbsTagEditorActivity_ViewBinding implements Unbinder {
  private AbsTagEditorActivity target;

  @UiThread
  public AbsTagEditorActivity_ViewBinding(AbsTagEditorActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AbsTagEditorActivity_ViewBinding(AbsTagEditorActivity target, View source) {
    this.target = target;

    target.fab = Utils.findRequiredViewAsType(source, R.id.play_pause_fab, "field 'fab'", FloatingActionButton.class);
    target.observableScrollView = Utils.findRequiredViewAsType(source, R.id.observableScrollView, "field 'observableScrollView'", ObservableScrollView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.image = Utils.findRequiredViewAsType(source, R.id.image, "field 'image'", ImageView.class);
    target.header = Utils.findRequiredViewAsType(source, R.id.header, "field 'header'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AbsTagEditorActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fab = null;
    target.observableScrollView = null;
    target.toolbar = null;
    target.image = null;
    target.header = null;
  }
}
