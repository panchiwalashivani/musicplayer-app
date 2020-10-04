// Generated code from Butter Knife. Do not modify!
package com.maxfour.music.ui.activities;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.maxfour.music.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AboutActivity_ViewBinding implements Unbinder {
  private AboutActivity target;

  @UiThread
  public AboutActivity_ViewBinding(AboutActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AboutActivity_ViewBinding(AboutActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.appVersion = Utils.findRequiredViewAsType(source, R.id.app_version, "field 'appVersion'", TextView.class);
    target.intro = Utils.findRequiredViewAsType(source, R.id.intro, "field 'intro'", LinearLayout.class);
    target.writeAnEmail = Utils.findRequiredViewAsType(source, R.id.write_an_email, "field 'writeAnEmail'", LinearLayout.class);
    target.forkOnGitHub = Utils.findRequiredViewAsType(source, R.id.fork_on_github, "field 'forkOnGitHub'", LinearLayout.class);
    target.webmoney = Utils.findRequiredViewAsType(source, R.id.webmoney, "field 'webmoney'", LinearLayout.class);
    target.rubleButton = Utils.findRequiredViewAsType(source, R.id.ruble_button, "field 'rubleButton'", Button.class);
    target.dollarButton = Utils.findRequiredViewAsType(source, R.id.dollar_button, "field 'dollarButton'", Button.class);
    target.yandexMoney = Utils.findRequiredViewAsType(source, R.id.yandex_money, "field 'yandexMoney'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.appVersion = null;
    target.intro = null;
    target.writeAnEmail = null;
    target.forkOnGitHub = null;
    target.webmoney = null;
    target.rubleButton = null;
    target.dollarButton = null;
    target.yandexMoney = null;
  }
}
