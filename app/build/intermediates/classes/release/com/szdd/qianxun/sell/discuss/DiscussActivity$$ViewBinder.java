// Generated code from Butter Knife. Do not modify!
package com.szdd.qianxun.sell.discuss;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DiscussActivity$$ViewBinder<T extends com.szdd.qianxun.sell.discuss.DiscussActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131428424, "field 'sellDiscussList'");
    target.sellDiscussList = finder.castView(view, 2131428424, "field 'sellDiscussList'");
    view = finder.findRequiredView(source, 2131428425, "field 'sellDiscussEdit'");
    target.sellDiscussEdit = finder.castView(view, 2131428425, "field 'sellDiscussEdit'");
    view = finder.findRequiredView(source, 2131428426, "field 'sellDiscussBtn' and method 'onClick'");
    target.sellDiscussBtn = finder.castView(view, 2131428426, "field 'sellDiscussBtn'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick();
        }
      });
  }

  @Override public void unbind(T target) {
    target.sellDiscussList = null;
    target.sellDiscussEdit = null;
    target.sellDiscussBtn = null;
  }
}
