// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import java.nio.ByteBuffer;
import java.io.InputStream;
import androidx.annotation.p0;
import android.os.ParcelFileDescriptor;
import androidx.annotation.k0;
import android.annotation.TargetApi;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace$Named;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j;
import android.graphics.Bitmap$Config;
import java.io.IOException;
import android.util.Log;
import android.os.Build$VERSION;
import com.bumptech.glide.util.m;
import java.util.EnumSet;
import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import android.graphics.BitmapFactory$Options;
import java.util.Queue;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.Set;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.i;

public final class q
{
    static final String f = "Downsampler";
    public static final i<com.bumptech.glide.load.b> g;
    public static final i<k> h;
    @Deprecated
    public static final i<p> i;
    public static final i<Boolean> j;
    public static final i<Boolean> k;
    private static final String l = "image/vnd.wap.wbmp";
    private static final String m = "image/x-ico";
    private static final Set<String> n;
    private static final b o;
    private static final Set<ImageHeaderParser.ImageType> p;
    private static final Queue<BitmapFactory$Options> q;
    private final e a;
    private final DisplayMetrics b;
    private final com.bumptech.glide.load.engine.bitmap_recycle.b c;
    private final List<ImageHeaderParser> d;
    private final w e;
    
    static {
        g = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", com.bumptech.glide.load.b.I);
        h = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", com.bumptech.glide.load.k.G);
        i = com.bumptech.glide.load.resource.bitmap.p.h;
        final Boolean false = Boolean.FALSE;
        j = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
        k = com.bumptech.glide.load.i.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
        n = Collections.unmodifiableSet((Set<? extends String>)new HashSet<String>(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        o = (b)new b() {
            @Override
            public void a(final e e, final Bitmap bitmap) {
            }
            
            @Override
            public void b() {
            }
        };
        p = Collections.unmodifiableSet((Set<? extends ImageHeaderParser.ImageType>)EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        q = com.bumptech.glide.util.m.f(0);
    }
    
    public q(final List<ImageHeaderParser> d, final DisplayMetrics displayMetrics, final e e, final com.bumptech.glide.load.engine.bitmap_recycle.b b) {
        this.e = w.a();
        this.d = d;
        this.b = com.bumptech.glide.util.k.d(displayMetrics);
        this.a = com.bumptech.glide.util.k.d(e);
        this.c = com.bumptech.glide.util.k.d(b);
    }
    
    private static int a(final double n) {
        final int l = l(n);
        final int x = x(l * n);
        return x(n / (x / (float)l) * x);
    }
    
    private void b(final x x, final com.bumptech.glide.load.b obj, final boolean b, boolean b2, final BitmapFactory$Options bitmapFactory$Options, final int n, final int n2) {
        if (this.e.e(n, n2, bitmapFactory$Options, b, b2)) {
            return;
        }
        if (obj != b.G && Build$VERSION.SDK_INT != 16) {
            b2 = false;
            boolean hasAlpha;
            try {
                hasAlpha = x.d().hasAlpha();
            }
            catch (IOException ex) {
                hasAlpha = b2;
                if (Log.isLoggable("Downsampler", 3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Cannot determine whether the image has alpha or not from header, format ");
                    sb.append(obj);
                    Log.d("Downsampler", sb.toString(), (Throwable)ex);
                    hasAlpha = b2;
                }
            }
            Bitmap$Config inPreferredConfig;
            if (hasAlpha) {
                inPreferredConfig = Bitmap$Config.ARGB_8888;
            }
            else {
                inPreferredConfig = Bitmap$Config.RGB_565;
            }
            bitmapFactory$Options.inPreferredConfig = inPreferredConfig;
            if (inPreferredConfig == Bitmap$Config.RGB_565) {
                bitmapFactory$Options.inDither = true;
            }
            return;
        }
        bitmapFactory$Options.inPreferredConfig = Bitmap$Config.ARGB_8888;
    }
    
    private static void c(final ImageHeaderParser.ImageType obj, final x x, final b b, final e e, final p obj2, final int i, final int n, final int n2, final int j, final int k, final BitmapFactory$Options bitmapFactory$Options) throws IOException {
        if (n <= 0 || n2 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(obj);
                sb.append(" with target [");
                sb.append(j);
                sb.append("x");
                sb.append(k);
                sb.append("]");
                Log.d("Downsampler", sb.toString());
            }
            return;
        }
        int n3;
        int n4;
        if (r(i)) {
            n3 = n;
            n4 = n2;
        }
        else {
            n4 = n;
            n3 = n2;
        }
        final float b2 = obj2.b(n4, n3, j, k);
        if (b2 <= 0.0f) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot scale with factor: ");
            sb2.append(b2);
            sb2.append(" from: ");
            sb2.append(obj2);
            sb2.append(", source: [");
            sb2.append(n);
            sb2.append("x");
            sb2.append(n2);
            sb2.append("], target: [");
            sb2.append(j);
            sb2.append("x");
            sb2.append(k);
            sb2.append("]");
            throw new IllegalArgumentException(sb2.toString());
        }
        final p.g a = obj2.a(n4, n3, j, k);
        if (a != null) {
            final float n5 = (float)n4;
            final int x2 = x(b2 * n5);
            final float n6 = (float)n3;
            final int x3 = x(b2 * n6);
            final int n7 = n4 / x2;
            final int n8 = n3 / x3;
            final p.g g = com.bumptech.glide.load.resource.bitmap.p.g.G;
            int l;
            if (a == g) {
                l = Math.max(n7, n8);
            }
            else {
                l = Math.min(n7, n8);
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            int m;
            if (sdk_INT <= 23 && com.bumptech.glide.load.resource.bitmap.q.n.contains(bitmapFactory$Options.outMimeType)) {
                m = 1;
            }
            else {
                int max;
                final int n9 = max = Math.max(1, Integer.highestOneBit(l));
                if (a == g) {
                    max = n9;
                    if (n9 < 1.0f / b2) {
                        max = n9 << 1;
                    }
                }
                m = max;
            }
            bitmapFactory$Options.inSampleSize = m;
            int round = 0;
            int round2 = 0;
            Label_0487: {
                if (obj == ImageHeaderParser.ImageType.JPEG) {
                    final float n10 = (float)Math.min(m, 8);
                    final int n11 = (int)Math.ceil(n5 / n10);
                    final int n12 = (int)Math.ceil(n6 / n10);
                    final int n13 = m / 8;
                    round = n12;
                    round2 = n11;
                    if (n13 > 0) {
                        round2 = n11 / n13;
                        round = n12 / n13;
                    }
                }
                else {
                    if (obj != ImageHeaderParser.ImageType.PNG) {
                        if (obj != ImageHeaderParser.ImageType.PNG_A) {
                            if (obj != ImageHeaderParser.ImageType.WEBP && obj != ImageHeaderParser.ImageType.WEBP_A) {
                                if (n4 % m == 0 && n3 % m == 0) {
                                    final int n14 = n4 / m;
                                    round = n3 / m;
                                    round2 = n14;
                                    break Label_0487;
                                }
                                final int[] m2 = m(x, bitmapFactory$Options, b, e);
                                round2 = m2[0];
                                round = m2[1];
                                break Label_0487;
                            }
                            else if (sdk_INT >= 24) {
                                final float n15 = (float)m;
                                round2 = Math.round(n5 / n15);
                                round = Math.round(n6 / n15);
                                break Label_0487;
                            }
                        }
                    }
                    final float n16 = (float)m;
                    round2 = (int)Math.floor(n5 / n16);
                    round = (int)Math.floor(n6 / n16);
                }
            }
            final double d = obj2.b(round2, round, j, k);
            if (sdk_INT >= 19) {
                bitmapFactory$Options.inTargetDensity = a(d);
                bitmapFactory$Options.inDensity = l(d);
            }
            if (s(bitmapFactory$Options)) {
                bitmapFactory$Options.inScaled = true;
            }
            else {
                bitmapFactory$Options.inTargetDensity = 0;
                bitmapFactory$Options.inDensity = 0;
            }
            if (Log.isLoggable("Downsampler", 2)) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Calculate scaling, source: [");
                sb3.append(n);
                sb3.append("x");
                sb3.append(n2);
                sb3.append("], degreesToRotate: ");
                sb3.append(i);
                sb3.append(", target: [");
                sb3.append(j);
                sb3.append("x");
                sb3.append(k);
                sb3.append("], power of two scaled: [");
                sb3.append(round2);
                sb3.append("x");
                sb3.append(round);
                sb3.append("], exact scale factor: ");
                sb3.append(b2);
                sb3.append(", power of 2 sample size: ");
                sb3.append(m);
                sb3.append(", adjusted scale factor: ");
                sb3.append(d);
                sb3.append(", target density: ");
                sb3.append(bitmapFactory$Options.inTargetDensity);
                sb3.append(", density: ");
                sb3.append(bitmapFactory$Options.inDensity);
                Log.v("Downsampler", sb3.toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot round with null rounding");
    }
    
    private v<Bitmap> e(final x x, final int n, final int n2, final j j, final b b) throws IOException {
        final byte[] inTempStorage = this.c.f(65536, byte[].class);
        final BitmapFactory$Options k = k();
        k.inTempStorage = inTempStorage;
        final com.bumptech.glide.load.b b2 = j.c(com.bumptech.glide.load.resource.bitmap.q.g);
        final k i = j.c(com.bumptech.glide.load.resource.bitmap.q.h);
        final p p5 = j.c(com.bumptech.glide.load.resource.bitmap.p.h);
        final boolean booleanValue = j.c(com.bumptech.glide.load.resource.bitmap.q.j);
        final i<Boolean> l = com.bumptech.glide.load.resource.bitmap.q.k;
        boolean b3;
        if (j.c((i<Object>)l) != null && j.c(l)) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        try {
            return com.bumptech.glide.load.resource.bitmap.g.d(this.h(x, k, p5, b2, i, b3, n, n2, booleanValue, b), this.a);
        }
        finally {
            v(k);
            this.c.d(inTempStorage);
        }
    }
    
    private Bitmap h(final x x, final BitmapFactory$Options bitmapFactory$Options, final p p10, final com.bumptech.glide.load.b b, final k k, boolean b2, final int n, final int n2, final boolean b3, final b b4) throws IOException {
        final long b5 = com.bumptech.glide.util.g.b();
        final int[] m = m(x, bitmapFactory$Options, b4, this.a);
        final boolean b6 = false;
        final int i = m[0];
        final int j = m[1];
        final String outMimeType = bitmapFactory$Options.outMimeType;
        if (i == -1 || j == -1) {
            b2 = false;
        }
        final int a = x.a();
        final int l = g0.j(a);
        final boolean m2 = g0.m(a);
        int n3;
        if (n == Integer.MIN_VALUE) {
            if (r(l)) {
                n3 = j;
            }
            else {
                n3 = i;
            }
        }
        else {
            n3 = n;
        }
        int n4 = n2;
        if (n4 == Integer.MIN_VALUE) {
            if (r(l)) {
                n4 = i;
            }
            else {
                n4 = j;
            }
        }
        final ImageHeaderParser.ImageType d = x.d();
        c(d, x, b4, this.a, p10, l, i, j, n3, n4, bitmapFactory$Options);
        this.b(x, b, b2, m2, bitmapFactory$Options, n3, n4);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b7 = sdk_INT >= 19;
        if (bitmapFactory$Options.inSampleSize == 1 || b7) {
            if (this.z(d)) {
                if (i < 0 || j < 0 || !b3 || !b7) {
                    float f;
                    if (s(bitmapFactory$Options)) {
                        f = bitmapFactory$Options.inTargetDensity / (float)bitmapFactory$Options.inDensity;
                    }
                    else {
                        f = 1.0f;
                    }
                    final int inSampleSize = bitmapFactory$Options.inSampleSize;
                    final float n5 = (float)i;
                    final float n6 = (float)inSampleSize;
                    final int n7 = (int)Math.ceil(n5 / n6);
                    final int n8 = (int)Math.ceil(j / n6);
                    final int round = Math.round(n7 * f);
                    final int round2 = Math.round(n8 * f);
                    n3 = round;
                    n4 = round2;
                    if (Log.isLoggable("Downsampler", 2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Calculated target [");
                        sb.append(round);
                        sb.append("x");
                        sb.append(round2);
                        sb.append("] for source [");
                        sb.append(i);
                        sb.append("x");
                        sb.append(j);
                        sb.append("], sampleSize: ");
                        sb.append(inSampleSize);
                        sb.append(", targetDensity: ");
                        sb.append(bitmapFactory$Options.inTargetDensity);
                        sb.append(", density: ");
                        sb.append(bitmapFactory$Options.inDensity);
                        sb.append(", density multiplier: ");
                        sb.append(f);
                        Log.v("Downsampler", sb.toString());
                        n4 = round2;
                        n3 = round;
                    }
                }
                if (n3 > 0 && n4 > 0) {
                    y(bitmapFactory$Options, this.a, n3, n4);
                }
            }
        }
        Label_0648: {
            ColorSpace$Named colorSpace$Named = null;
            Label_0640: {
                if (sdk_INT >= 28) {
                    int n9 = b6 ? 1 : 0;
                    if (k == k.H) {
                        final ColorSpace outColorSpace = bitmapFactory$Options.outColorSpace;
                        n9 = (b6 ? 1 : 0);
                        if (outColorSpace != null) {
                            n9 = (b6 ? 1 : 0);
                            if (outColorSpace.isWideGamut()) {
                                n9 = 1;
                            }
                        }
                    }
                    if (n9 != 0) {
                        colorSpace$Named = ColorSpace$Named.DISPLAY_P3;
                        break Label_0640;
                    }
                }
                else if (sdk_INT < 26) {
                    break Label_0648;
                }
                colorSpace$Named = ColorSpace$Named.SRGB;
            }
            bitmapFactory$Options.inPreferredColorSpace = ColorSpace.get(colorSpace$Named);
        }
        final Bitmap i2 = i(x, bitmapFactory$Options, b4, this.a);
        b4.a(this.a, i2);
        if (Log.isLoggable("Downsampler", 2)) {
            t(i, j, outMimeType, bitmapFactory$Options, i2, n, n2, b5);
        }
        Bitmap o = null;
        if (i2 != null) {
            i2.setDensity(this.b.densityDpi);
            final Bitmap obj = o = g0.o(this.a, i2, a);
            if (!i2.equals(obj)) {
                this.a.d(i2);
                o = obj;
            }
        }
        return o;
    }
    
    private static Bitmap i(final x x, final BitmapFactory$Options bitmapFactory$Options, final b b, final e e) throws IOException {
        if (!bitmapFactory$Options.inJustDecodeBounds) {
            b.b();
            x.c();
        }
        final int outWidth = bitmapFactory$Options.outWidth;
        final int outHeight = bitmapFactory$Options.outHeight;
        final String outMimeType = bitmapFactory$Options.outMimeType;
        g0.i().lock();
        try {
            try {
                final Bitmap b2 = x.b(bitmapFactory$Options);
                g0.i().unlock();
                return b2;
            }
            finally {}
        }
        catch (IllegalArgumentException ex) {
            final IOException u = u(ex, outWidth, outHeight, outMimeType, bitmapFactory$Options);
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", (Throwable)u);
            }
            final Bitmap inBitmap = bitmapFactory$Options.inBitmap;
            if (inBitmap != null) {
                try {
                    e.d(inBitmap);
                    bitmapFactory$Options.inBitmap = null;
                    final Bitmap i = i(x, bitmapFactory$Options, b, e);
                    g0.i().unlock();
                    return i;
                }
                catch (IOException ex2) {
                    throw u;
                }
            }
            throw u;
        }
        g0.i().unlock();
    }
    
    @TargetApi(19)
    @k0
    private static String j(final Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String string;
        if (Build$VERSION.SDK_INT >= 19) {
            final StringBuilder sb = new StringBuilder();
            sb.append(" (");
            sb.append(bitmap.getAllocationByteCount());
            sb.append(")");
            string = sb.toString();
        }
        else {
            string = "";
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(string);
        return sb2.toString();
    }
    
    private static BitmapFactory$Options k() {
        synchronized (q.class) {
            Object q = com.bumptech.glide.load.resource.bitmap.q.q;
            synchronized (q) {
                final BitmapFactory$Options bitmapFactory$Options = ((Queue<BitmapFactory$Options>)q).poll();
                // monitorexit(q)
                q = bitmapFactory$Options;
                if (bitmapFactory$Options == null) {
                    q = new BitmapFactory$Options();
                    w((BitmapFactory$Options)q);
                }
                return (BitmapFactory$Options)q;
            }
        }
    }
    
    private static int l(double n) {
        if (n > 1.0) {
            n = 1.0 / n;
        }
        return (int)Math.round(n * 2.147483647E9);
    }
    
    private static int[] m(final x x, final BitmapFactory$Options bitmapFactory$Options, final b b, final e e) throws IOException {
        bitmapFactory$Options.inJustDecodeBounds = true;
        i(x, bitmapFactory$Options, b, e);
        bitmapFactory$Options.inJustDecodeBounds = false;
        return new int[] { bitmapFactory$Options.outWidth, bitmapFactory$Options.outHeight };
    }
    
    private static String n(final BitmapFactory$Options bitmapFactory$Options) {
        return j(bitmapFactory$Options.inBitmap);
    }
    
    private static boolean r(final int n) {
        return n == 90 || n == 270;
    }
    
    private static boolean s(final BitmapFactory$Options bitmapFactory$Options) {
        final int inTargetDensity = bitmapFactory$Options.inTargetDensity;
        if (inTargetDensity > 0) {
            final int inDensity = bitmapFactory$Options.inDensity;
            if (inDensity > 0 && inTargetDensity != inDensity) {
                return true;
            }
        }
        return false;
    }
    
    private static void t(final int i, final int j, final String str, final BitmapFactory$Options bitmapFactory$Options, final Bitmap bitmap, final int k, final int l, final long n) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(j(bitmap));
        sb.append(" from [");
        sb.append(i);
        sb.append("x");
        sb.append(j);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(n(bitmapFactory$Options));
        sb.append(" for [");
        sb.append(k);
        sb.append("x");
        sb.append(l);
        sb.append("], sample size: ");
        sb.append(bitmapFactory$Options.inSampleSize);
        sb.append(", density: ");
        sb.append(bitmapFactory$Options.inDensity);
        sb.append(", target density: ");
        sb.append(bitmapFactory$Options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(com.bumptech.glide.util.g.a(n));
        Log.v("Downsampler", sb.toString());
    }
    
    private static IOException u(final IllegalArgumentException cause, final int i, final int j, final String str, final BitmapFactory$Options bitmapFactory$Options) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Exception decoding bitmap, outWidth: ");
        sb.append(i);
        sb.append(", outHeight: ");
        sb.append(j);
        sb.append(", outMimeType: ");
        sb.append(str);
        sb.append(", inBitmap: ");
        sb.append(n(bitmapFactory$Options));
        return new IOException(sb.toString(), cause);
    }
    
    private static void v(final BitmapFactory$Options bitmapFactory$Options) {
        w(bitmapFactory$Options);
        final Queue<BitmapFactory$Options> q = com.bumptech.glide.load.resource.bitmap.q.q;
        synchronized (q) {
            q.offer(bitmapFactory$Options);
        }
    }
    
    private static void w(final BitmapFactory$Options bitmapFactory$Options) {
        bitmapFactory$Options.inTempStorage = null;
        bitmapFactory$Options.inDither = false;
        bitmapFactory$Options.inScaled = false;
        bitmapFactory$Options.inSampleSize = 1;
        bitmapFactory$Options.inPreferredConfig = null;
        bitmapFactory$Options.inJustDecodeBounds = false;
        bitmapFactory$Options.inDensity = 0;
        bitmapFactory$Options.inTargetDensity = 0;
        if (Build$VERSION.SDK_INT >= 26) {
            bitmapFactory$Options.inPreferredColorSpace = null;
            bitmapFactory$Options.outColorSpace = null;
            bitmapFactory$Options.outConfig = null;
        }
        bitmapFactory$Options.outWidth = 0;
        bitmapFactory$Options.outHeight = 0;
        bitmapFactory$Options.outMimeType = null;
        bitmapFactory$Options.inBitmap = null;
        bitmapFactory$Options.inMutable = true;
    }
    
    private static int x(final double n) {
        return (int)(n + 0.5);
    }
    
    @TargetApi(26)
    private static void y(final BitmapFactory$Options bitmapFactory$Options, final e e, final int n, final int n2) {
        Bitmap$Config outConfig;
        if (Build$VERSION.SDK_INT >= 26) {
            if (bitmapFactory$Options.inPreferredConfig == Bitmap$Config.HARDWARE) {
                return;
            }
            outConfig = bitmapFactory$Options.outConfig;
        }
        else {
            outConfig = null;
        }
        Bitmap$Config inPreferredConfig = outConfig;
        if (outConfig == null) {
            inPreferredConfig = bitmapFactory$Options.inPreferredConfig;
        }
        bitmapFactory$Options.inBitmap = e.g(n, n2, inPreferredConfig);
    }
    
    private boolean z(final ImageHeaderParser.ImageType imageType) {
        return Build$VERSION.SDK_INT >= 19 || com.bumptech.glide.load.resource.bitmap.q.p.contains(imageType);
    }
    
    @p0(21)
    public v<Bitmap> d(final ParcelFileDescriptor parcelFileDescriptor, final int n, final int n2, final j j) throws IOException {
        return this.e(new x.b(parcelFileDescriptor, this.d, this.c), n, n2, j, com.bumptech.glide.load.resource.bitmap.q.o);
    }
    
    public v<Bitmap> f(final InputStream inputStream, final int n, final int n2, final j j) throws IOException {
        return this.g(inputStream, n, n2, j, com.bumptech.glide.load.resource.bitmap.q.o);
    }
    
    public v<Bitmap> g(final InputStream inputStream, final int n, final int n2, final j j, final b b) throws IOException {
        return this.e(new x.a(inputStream, this.d, this.c), n, n2, j, b);
    }
    
    public boolean o(final ParcelFileDescriptor parcelFileDescriptor) {
        return com.bumptech.glide.load.data.m.c();
    }
    
    public boolean p(final InputStream inputStream) {
        return true;
    }
    
    public boolean q(final ByteBuffer byteBuffer) {
        return true;
    }
    
    public interface b
    {
        void a(final e p0, final Bitmap p1) throws IOException;
        
        void b();
    }
}
