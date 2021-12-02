// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory$Options;
import android.os.Build;
import android.util.Log;
import android.os.Build$VERSION;
import java.io.File;
import androidx.annotation.b1;

public final class w
{
    @b1
    static final int f = 128;
    private static final int g = 0;
    private static final File h;
    private static final int i = 50;
    private static final int j = 700;
    private static final int k = 20000;
    private static volatile w l;
    private final boolean a;
    private final int b;
    private final int c;
    @androidx.annotation.w("this")
    private int d;
    @androidx.annotation.w("this")
    private boolean e;
    
    static {
        h = new File("/proc/self/fd");
    }
    
    @b1
    w() {
        this.e = true;
        this.a = d();
        int c;
        if (Build$VERSION.SDK_INT >= 28) {
            this.b = 20000;
            c = 0;
        }
        else {
            this.b = 700;
            c = 128;
        }
        this.c = c;
    }
    
    public static w a() {
        if (w.l == null) {
            synchronized (w.class) {
                if (w.l == null) {
                    w.l = new w();
                }
            }
        }
        return w.l;
    }
    
    private boolean b() {
        synchronized (this) {
            int d = this.d;
            boolean e = true;
            ++d;
            this.d = d;
            if (d >= 50) {
                this.d = 0;
                final int length = w.h.list().length;
                if (length >= this.b) {
                    e = false;
                }
                this.e = e;
                if (!e && Log.isLoggable("Downsampler", 5)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                    sb.append(length);
                    sb.append(", limit ");
                    sb.append(this.b);
                    Log.w("Downsampler", sb.toString());
                }
            }
            return this.e;
        }
    }
    
    private static boolean d() {
        final String model = Build.MODEL;
        boolean b2;
        final boolean b = b2 = true;
        if (model != null) {
            if (model.length() < 7) {
                b2 = b;
            }
            else {
                final String substring = model.substring(0, 7);
                substring.hashCode();
                int n = -1;
                switch (substring) {
                    case "SM-N935": {
                        n = 6;
                        break;
                    }
                    case "SM-J720": {
                        n = 5;
                        break;
                    }
                    case "SM-G965": {
                        n = 4;
                        break;
                    }
                    case "SM-G960": {
                        n = 3;
                        break;
                    }
                    case "SM-G935": {
                        n = 2;
                        break;
                    }
                    case "SM-G930": {
                        n = 1;
                        break;
                    }
                    case "SM-A520": {
                        n = 0;
                        break;
                    }
                    default:
                        break;
                }
                switch (n) {
                    default: {
                        return true;
                    }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6: {
                        b2 = (Build$VERSION.SDK_INT != 26 && b);
                        break;
                    }
                }
            }
        }
        return b2;
    }
    
    public boolean c(final int n, final int n2, final boolean b, final boolean b2) {
        boolean b4;
        final boolean b3 = b4 = false;
        if (b) {
            b4 = b3;
            if (this.a) {
                b4 = b3;
                if (Build$VERSION.SDK_INT >= 26) {
                    if (b2) {
                        b4 = b3;
                    }
                    else {
                        final int c = this.c;
                        b4 = b3;
                        if (n >= c) {
                            b4 = b3;
                            if (n2 >= c) {
                                b4 = b3;
                                if (this.b()) {
                                    b4 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b4;
    }
    
    @TargetApi(26)
    boolean e(final int n, final int n2, final BitmapFactory$Options bitmapFactory$Options, final boolean b, final boolean b2) {
        final boolean c = this.c(n, n2, b, b2);
        if (c) {
            bitmapFactory$Options.inPreferredConfig = Bitmap$Config.HARDWARE;
            bitmapFactory$Options.inMutable = false;
        }
        return c;
    }
}
