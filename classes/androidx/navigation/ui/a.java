// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import androidx.annotation.w0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import androidx.navigation.i;
import android.os.Bundle;
import androidx.navigation.a0;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import android.animation.ValueAnimator;
import androidx.appcompat.graphics.drawable.d;
import androidx.annotation.k0;
import androidx.customview.widget.c;
import java.lang.ref.WeakReference;
import java.util.Set;
import android.content.Context;
import androidx.annotation.t0;
import androidx.navigation.NavController;

@t0({ t0.a.G })
abstract class a implements b
{
    private final Context a;
    private final Set<Integer> b;
    @k0
    private final WeakReference<c> c;
    private d d;
    private ValueAnimator e;
    
    a(@j0 final Context a, @j0 final androidx.navigation.ui.d d) {
        this.a = a;
        this.b = d.d();
        final c c = d.c();
        if (c != null) {
            this.c = new WeakReference<c>(c);
        }
        else {
            this.c = null;
        }
    }
    
    private void b(final boolean b) {
        boolean b2;
        if (this.d == null) {
            this.d = new d(this.a);
            b2 = false;
        }
        else {
            b2 = true;
        }
        final d d = this.d;
        int n;
        if (b) {
            n = androidx.navigation.ui.n.l.K;
        }
        else {
            n = androidx.navigation.ui.n.l.J;
        }
        this.c(d, n);
        float progress;
        if (b) {
            progress = 0.0f;
        }
        else {
            progress = 1.0f;
        }
        if (b2) {
            final float i = this.d.i();
            final ValueAnimator e = this.e;
            if (e != null) {
                e.cancel();
            }
            (this.e = (ValueAnimator)ObjectAnimator.ofFloat((Object)this.d, "progress", new float[] { i, progress })).start();
        }
        else {
            this.d.setProgress(progress);
        }
    }
    
    @Override
    public void a(@j0 final NavController navController, @j0 final a0 a0, @k0 final Bundle obj) {
        if (a0 instanceof i) {
            return;
        }
        final WeakReference<c> c = this.c;
        c c2;
        if (c != null) {
            c2 = c.get();
        }
        else {
            c2 = null;
        }
        if (this.c != null && c2 == null) {
            navController.L((NavController.b)this);
            return;
        }
        final CharSequence q = a0.q();
        boolean b = true;
        if (q != null) {
            final StringBuffer sb = new StringBuffer();
            final Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(q);
            while (matcher.find()) {
                final String group = matcher.group(1);
                if (obj == null || !obj.containsKey(group)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Could not find ");
                    sb2.append(group);
                    sb2.append(" in ");
                    sb2.append(obj);
                    sb2.append(" to fill label ");
                    sb2.append((Object)q);
                    throw new IllegalArgumentException(sb2.toString());
                }
                matcher.appendReplacement(sb, "");
                sb.append(obj.get(group).toString());
            }
            matcher.appendTail(sb);
            this.d(sb);
        }
        final boolean d = androidx.navigation.ui.l.d(a0, this.b);
        if (c2 == null && d) {
            this.c(null, 0);
        }
        else {
            if (c2 == null || !d) {
                b = false;
            }
            this.b(b);
        }
    }
    
    protected abstract void c(final Drawable p0, @w0 final int p1);
    
    protected abstract void d(final CharSequence p0);
}
