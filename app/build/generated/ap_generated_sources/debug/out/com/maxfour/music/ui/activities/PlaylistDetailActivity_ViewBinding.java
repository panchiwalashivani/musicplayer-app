// Generated code from Butter Knife. Do not modify!
package com.maxfour.music.ui.activities;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.Utils;
import com.maxfour.music.R;
import com.maxfour.music.ui.activities.base.AbsSlidingMusicPanelActivity_ViewBinding;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PlaylistDetailActivity_ViewBinding extends AbsSlidingMusicPanelActivity_ViewBinding {
  private PlaylistDetailActivity target;

  @UiThread
  public PlaylistDetailActivity_ViewBinding(PlaylistDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlaylistDetailActivity_ViewBinding(PlaylistDetailActivity target, View source) {
    super(target, source);

    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.empty = Utils.findRequiredViewAsType(source, android.R.id.empty, "field 'empty'", TextView.class);
  }

  @Override
  public void unbind() {
    PlaylistDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.toolbar = null;
    target.empty = null;

    super.unbind();
  }
}
