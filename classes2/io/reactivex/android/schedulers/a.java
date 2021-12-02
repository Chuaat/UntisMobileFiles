// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.Build$VERSION;
import java.util.Objects;
import android.os.Looper;
import java.util.concurrent.Callable;
import io.reactivex.j0;

public final class a
{
    private static final j0 a;
    
    static {
        a = io.reactivex.android.plugins.a.f(new Callable<j0>() {
            public j0 a() throws Exception {
                return b.a;
            }
        });
    }
    
    private a() {
        throw new AssertionError((Object)"No instances.");
    }
    
    public static j0 a(final Looper looper) {
        return b(looper, false);
    }
    
    @SuppressLint({ "NewApi" })
    public static j0 b(final Looper obj, boolean b) {
        Objects.requireNonNull(obj, "looper == null");
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b2;
        if (sdk_INT < 16) {
            b2 = false;
        }
        else if (b2 = b) {
            b2 = b;
            if (sdk_INT < 22) {
                final Message obtain = Message.obtain();
                try {
                    obtain.setAsynchronous(true);
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    b = false;
                }
                obtain.recycle();
                b2 = b;
            }
        }
        return new io.reactivex.android.schedulers.b(new Handler(obj), b2);
    }
    
    public static j0 c() {
        return io.reactivex.android.plugins.a.g(io.reactivex.android.schedulers.a.a);
    }
    
    private static final class b
    {
        static final j0 a;
        
        static {
            a = new io.reactivex.android.schedulers.b(new Handler(Looper.getMainLooper()), false);
        }
    }
}
