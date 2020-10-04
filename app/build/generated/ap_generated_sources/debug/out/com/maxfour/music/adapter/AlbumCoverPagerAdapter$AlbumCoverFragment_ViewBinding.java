// Generated code from Butter Knife. Do not modify!
package com.maxfour.music.adapter;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.maxfour.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlbumCoverPagerAdapter$AlbumCoverFragment_ViewBinding implements Unbinder {
  private AlbumCoverPagerAdapter.AlbumCoverFragment target;

  @UiThread
  public AlbumCoverPagerAdapter$AlbumCoverFragment_ViewBinding(
      AlbumCoverPagerAdapter.AlbumCoverFragment target, View source) {
    this.target = target;

    target.albumCover = Utils.findRequiredViewAsType(source, R.id.player_image, "field 'albumCover'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AlbumCoverPagerAdapter.AlbumCoverFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.albumCover = null;
  }
}
