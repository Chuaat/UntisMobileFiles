// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.annotation.p0;
import android.os.Bundle;
import android.app.PendingIntent;
import androidx.annotation.k0;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.util.Pair;
import androidx.core.util.j;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.annotation.j0;
import android.app.ActivityOptions;
import android.os.Build$VERSION;

public class c
{
    public static final String a = "android.activity.usage_time";
    public static final String b = "android.usage_time_packages";
    
    protected c() {
    }
    
    @j0
    public static c b() {
        if (Build$VERSION.SDK_INT >= 23) {
            return new a(ActivityOptions.makeBasic());
        }
        return new c();
    }
    
    @j0
    public static c c(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT >= 23) {
            return new a(ActivityOptions.makeClipRevealAnimation(view, n, n2, n3, n4));
        }
        return new c();
    }
    
    @j0
    public static c d(@j0 final Context context, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 16) {
            return new a(ActivityOptions.makeCustomAnimation(context, n, n2));
        }
        return new c();
    }
    
    @j0
    public static c e(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT >= 16) {
            return new a(ActivityOptions.makeScaleUpAnimation(view, n, n2, n3, n4));
        }
        return new c();
    }
    
    @j0
    public static c f(@j0 final Activity activity, @j0 final View view, @j0 final String s) {
        if (Build$VERSION.SDK_INT >= 21) {
            return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, s));
        }
        return new c();
    }
    
    @j0
    public static c g(@j0 final Activity activity, final j<View, String>... array) {
        if (Build$VERSION.SDK_INT >= 21) {
            Pair[] array2 = null;
            if (array != null) {
                final Pair[] array3 = new Pair[array.length];
                int n = 0;
                while (true) {
                    array2 = array3;
                    if (n >= array.length) {
                        break;
                    }
                    array3[n] = Pair.create((Object)array[n].a, (Object)array[n].b);
                    ++n;
                }
            }
            return new a(ActivityOptions.makeSceneTransitionAnimation(activity, array2));
        }
        return new c();
    }
    
    @j0
    public static c h() {
        if (Build$VERSION.SDK_INT >= 21) {
            return new a(ActivityOptions.makeTaskLaunchBehind());
        }
        return new c();
    }
    
    @j0
    public static c i(@j0 final View view, @j0 final Bitmap bitmap, final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 16) {
            return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, n, n2));
        }
        return new c();
    }
    
    @k0
    public Rect a() {
        return null;
    }
    
    public void j(@j0 final PendingIntent pendingIntent) {
    }
    
    @j0
    public c k(@k0 final Rect rect) {
        return this;
    }
    
    @k0
    public Bundle l() {
        return null;
    }
    
    public void m(@j0 final c c) {
    }
    
    @p0(16)
    private static class a extends c
    {
        private final ActivityOptions c;
        
        a(final ActivityOptions c) {
            this.c = c;
        }
        
        @Override
        public Rect a() {
            if (Build$VERSION.SDK_INT < 24) {
                return null;
            }
            return this.c.getLaunchBounds();
        }
        
        @Override
        public void j(@j0 final PendingIntent pendingIntent) {
            if (Build$VERSION.SDK_INT >= 23) {
                this.c.requestUsageTimeReport(pendingIntent);
            }
        }
        
        @j0
        @Override
        public c k(@k0 final Rect launchBounds) {
            if (Build$VERSION.SDK_INT < 24) {
                return this;
            }
            return new a(this.c.setLaunchBounds(launchBounds));
        }
        
        @Override
        public Bundle l() {
            return this.c.toBundle();
        }
        
        @Override
        public void m(@j0 final c c) {
            if (c instanceof a) {
                this.c.update(((a)c).c);
            }
        }
    }
}
