// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import kotlin.jvm.internal.k0;
import androidx.appcompat.app.d;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/utils/a0;", "", "Landroidx/appcompat/app/d;", "dialog", "Lkotlin/j2;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a0
{
    @e
    public static final a0 a;
    
    static {
        a = new a0();
    }
    
    private a0() {
    }
    
    public final void a(@e final d d) {
        k0.p(d, "dialog");
        final WindowManager$LayoutParams attributes = new WindowManager$LayoutParams();
        final Window window = ((Dialog)d).getWindow();
        WindowManager$LayoutParams attributes2;
        if (window == null) {
            attributes2 = null;
        }
        else {
            attributes2 = window.getAttributes();
        }
        attributes.copyFrom(attributes2);
        attributes.width = -2;
        attributes.height = -2;
        final Window window2 = ((Dialog)d).getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
    }
}
