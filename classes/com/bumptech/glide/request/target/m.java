// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import com.bumptech.glide.request.transition.f;
import androidx.annotation.j0;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import com.bumptech.glide.l;
import android.os.Handler;

public final class m<Z> extends e<Z>
{
    private static final int K = 1;
    private static final Handler L;
    private final l J;
    
    static {
        L = new Handler(Looper.getMainLooper(), (Handler$Callback)new Handler$Callback() {
            public boolean handleMessage(final Message message) {
                if (message.what == 1) {
                    ((m)message.obj).d();
                    return true;
                }
                return false;
            }
        });
    }
    
    private m(final l j, final int n, final int n2) {
        super(n, n2);
        this.J = j;
    }
    
    public static <Z> m<Z> g(final l l, final int n, final int n2) {
        return new m<Z>(l, n, n2);
    }
    
    @Override
    public void c(@j0 final Z b, @k0 final f<? super Z> f) {
        m.L.obtainMessage(1, (Object)this).sendToTarget();
    }
    
    void d() {
        this.J.B(this);
    }
    
    @Override
    public void p(@k0 final Drawable drawable) {
    }
}
