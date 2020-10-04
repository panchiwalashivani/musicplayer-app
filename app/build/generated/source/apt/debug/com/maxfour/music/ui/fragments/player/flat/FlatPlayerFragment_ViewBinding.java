// Generated code from Butter Knife. Do not modify!
package com.maxfour.music.ui.fragments.player.flat;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.maxfour.music.R;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FlatPlayerFragment_ViewBinding implements Unbinder {
  private FlatPlayerFragment target;

  @UiThread
  public FlatPlayerFragment_ViewBinding(FlatPlayerFragment target, View source) {
    this.target = target;

    target.playerStatusBar = Utils.findRequiredView(source, R.id.player_status_bar, "field 'playerStatusBar'");
    target.toolbarContainer = Utils.findOptionalViewAsType(source, R.id.toolbar_container, "field 'toolbarContainer'", FrameLayout.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.player_toolbar, "field 'toolbar'", Toolbar.class);
    target.slidingUpPanelLayout = Utils.findOptionalViewAsType(source, R.id.player_sliding_layout, "field 'slidingUpPanelLayout'", SlidingUpPanelLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.player_recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.playerQueueSubHeader = Utils.findRequiredViewAsType(source, R.id.player_queue_sub_header, "field 'playerQueueSubHeader'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FlatPlayerFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.playerStatusBar = null;
    target.toolbarContainer = null;
    target.toolbar = null;
    target.slidingUpPanelLayout = null;
    target.recyclerView = null;
    target.playerQueueSubHeader = null;
  }
}
