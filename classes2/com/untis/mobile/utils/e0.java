// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.view.ViewGroup$LayoutParams;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import android.view.View;
import android.view.View$MeasureSpec;
import kotlin.jvm.internal.k0;
import android.widget.ListView;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Lcom/untis/mobile/utils/e0;", "", "<init>", "()V", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e0
{
    @e
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/utils/e0$a", "", "Landroid/widget/ListView;", "listView", "Lkotlin/j2;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final void a(@e final ListView listView) {
            k0.p(listView, "listView");
            final ListAdapter adapter = listView.getAdapter();
            if (adapter == null) {
                return;
            }
            final int width = listView.getWidth();
            int n = 0;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(width, 0);
            final int count = adapter.getCount();
            if (count > 0) {
                int n2 = 0;
                n = 0;
                while (true) {
                    final int n3 = n2 + 1;
                    final View view = adapter.getView(n2, (View)null, (ViewGroup)listView);
                    view.measure(measureSpec, 0);
                    n += view.getMeasuredHeight();
                    if (n3 >= count) {
                        break;
                    }
                    n2 = n3;
                }
            }
            final ViewGroup$LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = n + listView.getDividerHeight() * (adapter.getCount() - 1) + listView.getPaddingBottom() + listView.getPaddingTop();
            listView.setLayoutParams(layoutParams);
            listView.requestLayout();
        }
    }
}
