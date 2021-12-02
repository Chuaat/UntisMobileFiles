// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load.resource.bitmap;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import com.bumptech.glide.util.k;
import android.graphics.Path$Direction;
import android.graphics.Path;
import androidx.annotation.b1;
import android.os.Build$VERSION;
import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import android.graphics.Canvas;
import android.graphics.Matrix;
import androidx.annotation.j0;
import android.graphics.Bitmap;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import java.util.concurrent.locks.ReentrantLock;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.Set;
import android.graphics.Paint;

public final class g0
{
    private static final String a = "TransformationUtils";
    public static final int b = 6;
    private static final Paint c;
    private static final int d = 7;
    private static final Paint e;
    private static final Paint f;
    private static final Set<String> g;
    private static final Lock h;
    
    static {
        c = new Paint(6);
        e = new Paint(7);
        Lock h2;
        if ((g = new HashSet<String>(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"))).contains(Build.MODEL)) {
            h2 = new ReentrantLock();
        }
        else {
            h2 = new d();
        }
        h = h2;
        (f = new Paint(7)).setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
    }
    
    private g0() {
    }
    
    private static void a(@j0 final Bitmap bitmap, @j0 final Bitmap bitmap2, final Matrix matrix) {
        final Lock h = g0.h;
        h.lock();
        try {
            final Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, g0.c);
            e(canvas);
            h.unlock();
        }
        finally {
            g0.h.unlock();
        }
    }
    
    public static Bitmap b(@j0 final e e, @j0 final Bitmap bitmap, final int n, final int n2) {
        if (bitmap.getWidth() == n && bitmap.getHeight() == n2) {
            return bitmap;
        }
        final Matrix matrix = new Matrix();
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        float n3 = 0.0f;
        float n4;
        float n5;
        if (width * n2 > height * n) {
            n4 = n2 / (float)bitmap.getHeight();
            n3 = (n - bitmap.getWidth() * n4) * 0.5f;
            n5 = 0.0f;
        }
        else {
            n4 = n / (float)bitmap.getWidth();
            n5 = (n2 - bitmap.getHeight() * n4) * 0.5f;
        }
        matrix.setScale(n4, n4);
        matrix.postTranslate((float)(int)(n3 + 0.5f), (float)(int)(n5 + 0.5f));
        final Bitmap f = e.f(n, n2, k(bitmap));
        t(bitmap, f);
        a(bitmap, f, matrix);
        return f;
    }
    
    public static Bitmap c(@j0 final e e, @j0 final Bitmap bitmap, final int n, final int n2) {
        if (bitmap.getWidth() <= n && bitmap.getHeight() <= n2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            }
            return bitmap;
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
        }
        return f(e, bitmap, n, n2);
    }
    
    public static Bitmap d(@j0 final e e, @j0 final Bitmap obj, int min, int width) {
        min = Math.min(min, width);
        final float n = (float)min;
        final float n2 = n / 2.0f;
        width = obj.getWidth();
        final int height = obj.getHeight();
        final float n3 = (float)width;
        final float a = n / n3;
        final float n4 = (float)height;
        final float max = Math.max(a, n / n4);
        final float n5 = n3 * max;
        final float n6 = max * n4;
        final float n7 = (n - n5) / 2.0f;
        final float n8 = (n - n6) / 2.0f;
        final RectF rectF = new RectF(n7, n8, n5 + n7, n6 + n8);
        final Bitmap g = g(e, obj);
        final Bitmap f = e.f(min, min, h(obj));
        f.setHasAlpha(true);
        final Lock h = g0.h;
        h.lock();
        try {
            final Canvas canvas = new Canvas(f);
            canvas.drawCircle(n2, n2, n2, g0.e);
            canvas.drawBitmap(g, (Rect)null, rectF, g0.f);
            e(canvas);
            h.unlock();
            if (!g.equals(obj)) {
                e.d(g);
            }
            return f;
        }
        finally {
            g0.h.unlock();
        }
    }
    
    private static void e(final Canvas canvas) {
        canvas.setBitmap((Bitmap)null);
    }
    
    public static Bitmap f(@j0 final e e, @j0 final Bitmap bitmap, final int i, final int j) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == j) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        final float min = Math.min(i / (float)bitmap.getWidth(), j / (float)bitmap.getHeight());
        final int round = Math.round(bitmap.getWidth() * min);
        final int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        final Bitmap f = e.f((int)(bitmap.getWidth() * min), (int)(bitmap.getHeight() * min), k(bitmap));
        t(bitmap, f);
        if (Log.isLoggable("TransformationUtils", 2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            sb.append("x");
            sb.append(j);
            Log.v("TransformationUtils", sb.toString());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            Log.v("TransformationUtils", sb2.toString());
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(f.getWidth());
            sb3.append("x");
            sb3.append(f.getHeight());
            Log.v("TransformationUtils", sb3.toString());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
            Log.v("TransformationUtils", sb4.toString());
        }
        final Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, f, matrix);
        return f;
    }
    
    private static Bitmap g(@j0 final e e, @j0 final Bitmap bitmap) {
        final Bitmap$Config h = h(bitmap);
        if (h.equals((Object)bitmap.getConfig())) {
            return bitmap;
        }
        final Bitmap f = e.f(bitmap.getWidth(), bitmap.getHeight(), h);
        new Canvas(f).drawBitmap(bitmap, 0.0f, 0.0f, (Paint)null);
        return f;
    }
    
    @j0
    private static Bitmap$Config h(@j0 final Bitmap bitmap) {
        if (Build$VERSION.SDK_INT >= 26 && Bitmap$Config.RGBA_F16.equals((Object)bitmap.getConfig())) {
            return Bitmap$Config.RGBA_F16;
        }
        return Bitmap$Config.ARGB_8888;
    }
    
    public static Lock i() {
        return g0.h;
    }
    
    public static int j(int n) {
        switch (n) {
            default: {
                n = 0;
                break;
            }
            case 7:
            case 8: {
                n = 270;
                break;
            }
            case 5:
            case 6: {
                n = 90;
                break;
            }
            case 3:
            case 4: {
                n = 180;
                break;
            }
        }
        return n;
    }
    
    @j0
    private static Bitmap$Config k(@j0 final Bitmap bitmap) {
        Bitmap$Config bitmap$Config;
        if (bitmap.getConfig() != null) {
            bitmap$Config = bitmap.getConfig();
        }
        else {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        return bitmap$Config;
    }
    
    @b1
    static void l(final int n, final Matrix matrix) {
        switch (n) {
            default: {
                return;
            }
            case 8: {
                matrix.setRotate(-90.0f);
                return;
            }
            case 7: {
                matrix.setRotate(-90.0f);
                break;
            }
            case 6: {
                matrix.setRotate(90.0f);
                return;
            }
            case 5: {
                matrix.setRotate(90.0f);
                break;
            }
            case 4: {
                matrix.setRotate(180.0f);
                break;
            }
            case 3: {
                matrix.setRotate(180.0f);
                return;
            }
            case 2: {
                matrix.setScale(-1.0f, 1.0f);
                return;
            }
        }
        matrix.postScale(-1.0f, 1.0f);
    }
    
    public static boolean m(final int n) {
        switch (n) {
            default: {
                return false;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                return true;
            }
        }
    }
    
    public static Bitmap n(@j0 final Bitmap bitmap, final int n) {
        Bitmap bitmap2 = bitmap;
        if (n != 0) {
            try {
                final Matrix matrix = new Matrix();
                matrix.setRotate((float)n);
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            catch (Exception ex) {
                bitmap2 = bitmap;
                if (Log.isLoggable("TransformationUtils", 6)) {
                    Log.e("TransformationUtils", "Exception when trying to orient image", (Throwable)ex);
                    bitmap2 = bitmap;
                }
            }
        }
        return bitmap2;
    }
    
    public static Bitmap o(@j0 final e e, @j0 final Bitmap bitmap, final int n) {
        if (!m(n)) {
            return bitmap;
        }
        final Matrix matrix = new Matrix();
        l(n, matrix);
        final RectF rectF = new RectF(0.0f, 0.0f, (float)bitmap.getWidth(), (float)bitmap.getHeight());
        matrix.mapRect(rectF);
        final Bitmap f = e.f(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        f.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, f, matrix);
        return f;
    }
    
    public static Bitmap p(@j0 final e e, @j0 final Bitmap bitmap, final float n, final float n2, final float n3, final float n4) {
        return s(e, bitmap, (c)new c() {
            @Override
            public void a(final Canvas canvas, final Paint paint, final RectF rectF) {
                final Path path = new Path();
                final float a = n;
                final float b = n2;
                final float c = n3;
                final float d = n4;
                path.addRoundRect(rectF, new float[] { a, a, b, b, c, c, d, d }, Path$Direction.CW);
                canvas.drawPath(path, paint);
            }
        });
    }
    
    public static Bitmap q(@j0 final e e, @j0 final Bitmap bitmap, final int n) {
        k.a(n > 0, "roundingRadius must be greater than 0.");
        return s(e, bitmap, (c)new c() {
            @Override
            public void a(final Canvas canvas, final Paint paint, final RectF rectF) {
                final int a = n;
                canvas.drawRoundRect(rectF, (float)a, (float)a, paint);
            }
        });
    }
    
    @Deprecated
    public static Bitmap r(@j0 final e e, @j0 final Bitmap bitmap, final int n, final int n2, final int n3) {
        return q(e, bitmap, n3);
    }
    
    private static Bitmap s(@j0 final e e, @j0 final Bitmap obj, final c c) {
        final Bitmap$Config h = h(obj);
        final Bitmap g = g(e, obj);
        final Bitmap f = e.f(g.getWidth(), g.getHeight(), h);
        f.setHasAlpha(true);
        final Shader$TileMode clamp = Shader$TileMode.CLAMP;
        final BitmapShader shader = new BitmapShader(g, clamp, clamp);
        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader((Shader)shader);
        final RectF rectF = new RectF(0.0f, 0.0f, (float)f.getWidth(), (float)f.getHeight());
        final Lock h2 = g0.h;
        h2.lock();
        try {
            final Canvas canvas = new Canvas(f);
            canvas.drawColor(0, PorterDuff$Mode.CLEAR);
            c.a(canvas, paint, rectF);
            e(canvas);
            h2.unlock();
            if (!g.equals(obj)) {
                e.d(g);
            }
            return f;
        }
        finally {
            g0.h.unlock();
        }
    }
    
    public static void t(final Bitmap bitmap, final Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
    
    private interface c
    {
        void a(final Canvas p0, final Paint p1, final RectF p2);
    }
    
    private static final class d implements Lock
    {
        d() {
        }
        
        @Override
        public void lock() {
        }
        
        @Override
        public void lockInterruptibly() throws InterruptedException {
        }
        
        @j0
        @Override
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }
        
        @Override
        public boolean tryLock() {
            return true;
        }
        
        @Override
        public boolean tryLock(final long n, @j0 final TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
        
        @Override
        public void unlock() {
        }
    }
}
