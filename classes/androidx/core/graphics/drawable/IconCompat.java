// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.app.ActivityManager;
import androidx.core.content.d;
import android.content.Intent$ShortcutIconResource;
import android.content.Intent;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import androidx.annotation.l;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import android.graphics.Shader;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.content.res.Resources$NotFoundException;
import androidx.core.util.n;
import android.os.Bundle;
import java.io.InputStream;
import androidx.core.content.res.g;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.Resources;
import android.content.Context;
import androidx.annotation.k0;
import androidx.annotation.y;
import androidx.annotation.s;
import androidx.annotation.p0;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.graphics.drawable.Icon;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.t0;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.b1;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable
{
    @b1
    static final String A = "obj";
    @b1
    static final String B = "int1";
    @b1
    static final String C = "int2";
    @b1
    static final String D = "tint_list";
    @b1
    static final String E = "tint_mode";
    @b1
    static final String F = "string1";
    static final PorterDuff$Mode G;
    private static final String k = "IconCompat";
    public static final int l = -1;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 3;
    public static final int p = 4;
    public static final int q = 5;
    public static final int r = 6;
    private static final float s = 0.25f;
    private static final float t = 0.6666667f;
    private static final float u = 0.9166667f;
    private static final float v = 0.010416667f;
    private static final float w = 0.020833334f;
    private static final int x = 61;
    private static final int y = 30;
    @b1
    static final String z = "type";
    @t0({ t0.a.I })
    public int a;
    Object b;
    @t0({ t0.a.G })
    public byte[] c;
    @t0({ t0.a.G })
    public Parcelable d;
    @t0({ t0.a.G })
    public int e;
    @t0({ t0.a.G })
    public int f;
    @t0({ t0.a.G })
    public ColorStateList g;
    PorterDuff$Mode h;
    @t0({ t0.a.G })
    public String i;
    @t0({ t0.a.G })
    public String j;
    
    static {
        G = PorterDuff$Mode.SRC_IN;
    }
    
    @t0({ t0.a.G })
    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.G;
        this.i = null;
    }
    
    private IconCompat(final int a) {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = IconCompat.G;
        this.i = null;
        this.a = a;
    }
    
    @p0(23)
    @s
    @y
    private static int B(@j0 final Icon obj) {
        if (Build$VERSION.SDK_INT >= 28) {
            return obj.getResId();
        }
        try {
            return (int)obj.getClass().getMethod("getResId", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
        }
        catch (NoSuchMethodException ex) {
            Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex);
            return 0;
        }
        catch (InvocationTargetException ex2) {
            Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex2);
            return 0;
        }
        catch (IllegalAccessException ex3) {
            Log.e("IconCompat", "Unable to get icon resource", (Throwable)ex3);
            return 0;
        }
    }
    
    @k0
    @p0(23)
    private static String D(@j0 final Icon obj) {
        if (Build$VERSION.SDK_INT >= 28) {
            return obj.getResPackage();
        }
        try {
            return (String)obj.getClass().getMethod("getResPackage", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
        }
        catch (NoSuchMethodException ex) {
            Log.e("IconCompat", "Unable to get icon package", (Throwable)ex);
            return null;
        }
        catch (InvocationTargetException ex2) {
            Log.e("IconCompat", "Unable to get icon package", (Throwable)ex2);
            return null;
        }
        catch (IllegalAccessException ex3) {
            Log.e("IconCompat", "Unable to get icon package", (Throwable)ex3);
            return null;
        }
    }
    
    private static Resources E(final Context context, final String anObject) {
        if ("android".equals(anObject)) {
            return Resources.getSystem();
        }
        final PackageManager packageManager = context.getPackageManager();
        try {
            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(anObject, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", anObject), (Throwable)ex);
            return null;
        }
    }
    
    @p0(23)
    private static int G(@j0 final Icon obj) {
        if (Build$VERSION.SDK_INT >= 28) {
            return obj.getType();
        }
        try {
            return (int)obj.getClass().getMethod("getType", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
        }
        catch (NoSuchMethodException ex) {
            final StringBuilder sb = new StringBuilder();
        }
        catch (InvocationTargetException ex) {
            final StringBuilder sb = new StringBuilder();
            goto Label_0052;
        }
        catch (IllegalAccessException ex) {
            final StringBuilder sb = new StringBuilder();
            goto Label_0052;
        }
    }
    
    @k0
    @p0(23)
    private static Uri I(@j0 final Icon obj) {
        if (Build$VERSION.SDK_INT >= 28) {
            return obj.getUri();
        }
        try {
            return (Uri)obj.getClass().getMethod("getUri", (Class<?>[])new Class[0]).invoke(obj, new Object[0]);
        }
        catch (NoSuchMethodException ex) {
            Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex);
            return null;
        }
        catch (InvocationTargetException ex2) {
            Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex2);
            return null;
        }
        catch (IllegalAccessException ex3) {
            Log.e("IconCompat", "Unable to get icon uri", (Throwable)ex3);
            return null;
        }
    }
    
    private Drawable L(final Context context) {
        switch (this.a) {
            case 6: {
                final InputStream j = this.J(context);
                if (j == null) {
                    break;
                }
                if (Build$VERSION.SDK_INT >= 26) {
                    return (Drawable)new AdaptiveIconDrawable((Drawable)null, (Drawable)new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(j)));
                }
                return (Drawable)new BitmapDrawable(context.getResources(), o(BitmapFactory.decodeStream(j), false));
            }
            case 5: {
                return (Drawable)new BitmapDrawable(context.getResources(), o((Bitmap)this.b, false));
            }
            case 4: {
                final InputStream i = this.J(context);
                if (i != null) {
                    return (Drawable)new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(i));
                }
                break;
            }
            case 3: {
                return (Drawable)new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[])this.b, this.e, this.f));
            }
            case 2: {
                String s;
                if (TextUtils.isEmpty((CharSequence)(s = this.C()))) {
                    s = context.getPackageName();
                }
                final Resources e = E(context, s);
                try {
                    return androidx.core.content.res.g.f(e, this.e, context.getTheme());
                }
                catch (RuntimeException ex) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", this.e, this.b), (Throwable)ex);
                    break;
                }
            }
            case 1: {
                return (Drawable)new BitmapDrawable(context.getResources(), (Bitmap)this.b);
            }
        }
        return null;
    }
    
    private static String S(final int n) {
        switch (n) {
            default: {
                return "UNKNOWN";
            }
            case 6: {
                return "URI_MASKABLE";
            }
            case 5: {
                return "BITMAP_MASKABLE";
            }
            case 4: {
                return "URI";
            }
            case 3: {
                return "DATA";
            }
            case 2: {
                return "RESOURCE";
            }
            case 1: {
                return "BITMAP";
            }
        }
    }
    
    @k0
    public static IconCompat k(@j0 final Bundle bundle) {
        final int int1 = bundle.getInt("type");
        final IconCompat iconCompat = new IconCompat(int1);
        iconCompat.e = bundle.getInt("int1");
        iconCompat.f = bundle.getInt("int2");
        iconCompat.j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.g = (ColorStateList)bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.h = PorterDuff$Mode.valueOf(bundle.getString("tint_mode"));
        }
        Object b = null;
        switch (int1) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown type ");
                sb.append(int1);
                Log.w("IconCompat", sb.toString());
                return null;
            }
            case 3: {
                iconCompat.b = bundle.getByteArray("obj");
                return iconCompat;
            }
            case 2:
            case 4:
            case 6: {
                b = bundle.getString("obj");
                break;
            }
            case -1:
            case 1:
            case 5: {
                b = bundle.getParcelable("obj");
                break;
            }
        }
        iconCompat.b = b;
        return iconCompat;
    }
    
    @k0
    @p0(23)
    public static IconCompat l(@j0 final Context context, @j0 final Icon b) {
        androidx.core.util.n.g(b);
        final int g = G(b);
        if (g != 2) {
            if (g == 4) {
                return t(I(b));
            }
            if (g != 6) {
                final IconCompat iconCompat = new IconCompat(-1);
                iconCompat.b = b;
                return iconCompat;
            }
            return q(I(b));
        }
        else {
            final String d = D(b);
            try {
                return y(E(context, d), d, B(b));
            }
            catch (Resources$NotFoundException ex) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        }
    }
    
    @k0
    @p0(23)
    @t0({ t0.a.I })
    public static IconCompat m(@j0 final Icon b) {
        androidx.core.util.n.g(b);
        final int g = G(b);
        if (g == 2) {
            return y(null, D(b), B(b));
        }
        if (g == 4) {
            return t(I(b));
        }
        if (g != 6) {
            final IconCompat iconCompat = new IconCompat(-1);
            iconCompat.b = b;
            return iconCompat;
        }
        return q(I(b));
    }
    
    @k0
    @p0(23)
    @t0({ t0.a.I })
    public static IconCompat n(@j0 final Icon icon) {
        if (G(icon) == 2 && B(icon) == 0) {
            return null;
        }
        return m(icon);
    }
    
    @b1
    static Bitmap o(final Bitmap bitmap, final boolean b) {
        final int n = (int)(Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        final Bitmap bitmap2 = Bitmap.createBitmap(n, n, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap2);
        final Paint paint = new Paint(3);
        final float n2 = (float)n;
        final float n3 = 0.5f * n2;
        final float n4 = 0.9166667f * n3;
        if (b) {
            final float n5 = 0.010416667f * n2;
            paint.setColor(0);
            paint.setShadowLayer(n5, 0.0f, n2 * 0.020833334f, 1023410176);
            canvas.drawCircle(n3, n3, n4, paint);
            paint.setShadowLayer(n5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(n3, n3, n4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        final Shader$TileMode clamp = Shader$TileMode.CLAMP;
        final BitmapShader shader = new BitmapShader(bitmap, clamp, clamp);
        final Matrix localMatrix = new Matrix();
        localMatrix.setTranslate((float)(-(bitmap.getWidth() - n) / 2), (float)(-(bitmap.getHeight() - n) / 2));
        shader.setLocalMatrix(localMatrix);
        paint.setShader((Shader)shader);
        canvas.drawCircle(n3, n3, n4, paint);
        canvas.setBitmap((Bitmap)null);
        return bitmap2;
    }
    
    public static IconCompat p(final Bitmap b) {
        if (b != null) {
            final IconCompat iconCompat = new IconCompat(5);
            iconCompat.b = b;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }
    
    @j0
    public static IconCompat q(@j0 final Uri uri) {
        if (uri != null) {
            return r(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }
    
    @j0
    public static IconCompat r(@j0 final String b) {
        if (b != null) {
            final IconCompat iconCompat = new IconCompat(6);
            iconCompat.b = b;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }
    
    public static IconCompat s(final Bitmap b) {
        if (b != null) {
            final IconCompat iconCompat = new IconCompat(1);
            iconCompat.b = b;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }
    
    public static IconCompat t(final Uri uri) {
        if (uri != null) {
            return u(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }
    
    public static IconCompat u(final String b) {
        if (b != null) {
            final IconCompat iconCompat = new IconCompat(4);
            iconCompat.b = b;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }
    
    public static IconCompat v(final byte[] b, final int e, final int f) {
        if (b != null) {
            final IconCompat iconCompat = new IconCompat(3);
            iconCompat.b = b;
            iconCompat.e = e;
            iconCompat.f = f;
            return iconCompat;
        }
        throw new IllegalArgumentException("Data must not be null.");
    }
    
    public static IconCompat x(final Context context, @s final int n) {
        if (context != null) {
            return y(context.getResources(), context.getPackageName(), n);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }
    
    @t0({ t0.a.I })
    public static IconCompat y(final Resources resources, final String s, @s final int e) {
        if (s == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (e != 0) {
            final IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = e;
            Label_0055: {
                if (resources != null) {
                    try {
                        iconCompat.b = resources.getResourceName(e);
                        break Label_0055;
                    }
                    catch (Resources$NotFoundException ex) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                }
                iconCompat.b = s;
            }
            iconCompat.j = s;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }
    
    @y
    public int A() {
        final int a = this.a;
        if (a == -1 && Build$VERSION.SDK_INT >= 23) {
            return B((Icon)this.b);
        }
        if (a == 2) {
            return this.e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    @j0
    public String C() {
        final int a = this.a;
        if (a == -1 && Build$VERSION.SDK_INT >= 23) {
            return D((Icon)this.b);
        }
        if (a != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("called getResPackage() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        if (TextUtils.isEmpty((CharSequence)this.j)) {
            return ((String)this.b).split(":", -1)[0];
        }
        return this.j;
    }
    
    public int F() {
        int n2;
        final int n = n2 = this.a;
        if (n == -1) {
            n2 = n;
            if (Build$VERSION.SDK_INT >= 23) {
                n2 = G((Icon)this.b);
            }
        }
        return n2;
    }
    
    @j0
    public Uri H() {
        final int a = this.a;
        if (a == -1 && Build$VERSION.SDK_INT >= 23) {
            return I((Icon)this.b);
        }
        if (a != 4 && a != 6) {
            final StringBuilder sb = new StringBuilder();
            sb.append("called getUri() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        return Uri.parse((String)this.b);
    }
    
    @k0
    @t0({ t0.a.H })
    public InputStream J(@j0 final Context context) {
        final Uri h = this.H();
        final String scheme = h.getScheme();
        StringBuilder sb = null;
        String str = null;
        Label_0101: {
            if (!"content".equals(scheme)) {
                if (!"file".equals(scheme)) {
                    try {
                        return new FileInputStream(new File((String)this.b));
                    }
                    catch (FileNotFoundException ex) {
                        sb = new StringBuilder();
                        str = "Unable to load image from path: ";
                        break Label_0101;
                    }
                }
            }
            try {
                return context.getContentResolver().openInputStream(h);
            }
            catch (Exception ex) {
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        }
        sb.append(str);
        sb.append(h);
        final FileNotFoundException ex;
        Log.w("IconCompat", sb.toString(), (Throwable)ex);
        return null;
    }
    
    @k0
    public Drawable K(@j0 final Context context) {
        this.j(context);
        if (Build$VERSION.SDK_INT >= 23) {
            return this.R(context).loadDrawable(context);
        }
        final Drawable l = this.L(context);
        if (l != null && (this.g != null || this.h != IconCompat.G)) {
            l.mutate();
            androidx.core.graphics.drawable.c.o(l, this.g);
            androidx.core.graphics.drawable.c.p(l, this.h);
        }
        return l;
    }
    
    public IconCompat M(@l final int n) {
        return this.N(ColorStateList.valueOf(n));
    }
    
    public IconCompat N(final ColorStateList g) {
        this.g = g;
        return this;
    }
    
    public IconCompat O(final PorterDuff$Mode h) {
        this.h = h;
        return this;
    }
    
    @j0
    public Bundle P() {
        final Bundle bundle = new Bundle();
        Label_0129: {
            Object o = null;
            switch (this.a) {
                default: {
                    throw new IllegalArgumentException("Invalid icon");
                }
                case 3: {
                    bundle.putByteArray("obj", (byte[])this.b);
                    break Label_0129;
                }
                case 2:
                case 4:
                case 6: {
                    bundle.putString("obj", (String)this.b);
                    break Label_0129;
                }
                case 1:
                case 5: {
                    o = this.b;
                    break;
                }
                case -1: {
                    o = this.b;
                    break;
                }
            }
            bundle.putParcelable("obj", (Parcelable)o);
        }
        bundle.putInt("type", this.a);
        bundle.putInt("int1", this.e);
        bundle.putInt("int2", this.f);
        bundle.putString("string1", this.j);
        final ColorStateList g = this.g;
        if (g != null) {
            bundle.putParcelable("tint_list", (Parcelable)g);
        }
        final PorterDuff$Mode h = this.h;
        if (h != IconCompat.G) {
            bundle.putString("tint_mode", h.name());
        }
        return bundle;
    }
    
    @Deprecated
    @j0
    @p0(23)
    public Icon Q() {
        return this.R(null);
    }
    
    @j0
    @p0(23)
    public Icon R(@k0 final Context context) {
        Icon icon = null;
        Label_0293: {
            Bitmap o = null;
            Label_0288: {
                Bitmap decodeStream = null;
                Label_0220: {
                    Bitmap bitmap = null;
                    switch (this.a) {
                        default: {
                            throw new IllegalArgumentException("Unknown type");
                        }
                        case 6: {
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            if (sdk_INT >= 30) {
                                icon = Icon.createWithAdaptiveBitmapContentUri(this.H());
                                break Label_0293;
                            }
                            if (context == null) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Context is required to resolve the file uri of the icon: ");
                                sb.append(this.H());
                                throw new IllegalArgumentException(sb.toString());
                            }
                            final InputStream j = this.J(context);
                            if (j == null) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Cannot load adaptive icon from uri: ");
                                sb2.append(this.H());
                                throw new IllegalStateException(sb2.toString());
                            }
                            bitmap = (decodeStream = BitmapFactory.decodeStream(j));
                            if (sdk_INT >= 26) {
                                break;
                            }
                            break Label_0220;
                        }
                        case 5: {
                            if (Build$VERSION.SDK_INT >= 26) {
                                bitmap = (Bitmap)this.b;
                                break;
                            }
                            decodeStream = (Bitmap)this.b;
                            break Label_0220;
                        }
                        case 4: {
                            icon = Icon.createWithContentUri((String)this.b);
                            break Label_0293;
                        }
                        case 3: {
                            icon = Icon.createWithData((byte[])this.b, this.e, this.f);
                            break Label_0293;
                        }
                        case 2: {
                            icon = Icon.createWithResource(this.C(), this.e);
                            break Label_0293;
                        }
                        case 1: {
                            o = (Bitmap)this.b;
                            break Label_0288;
                        }
                        case -1: {
                            return (Icon)this.b;
                        }
                    }
                    icon = Icon.createWithAdaptiveBitmap(bitmap);
                    break Label_0293;
                }
                o = o(decodeStream, false);
            }
            icon = Icon.createWithBitmap(o);
        }
        final ColorStateList g = this.g;
        if (g != null) {
            icon.setTintList(g);
        }
        final PorterDuff$Mode h = this.h;
        if (h != IconCompat.G) {
            icon.setTintMode(h);
        }
        return icon;
    }
    
    @Override
    public void g() {
        this.h = PorterDuff$Mode.valueOf(this.i);
        Parcelable b2 = null;
        switch (this.a) {
            default: {
                return;
            }
            case 3: {
                this.b = this.c;
                return;
            }
            case 2:
            case 4:
            case 6: {
                final String b = new String(this.c, Charset.forName("UTF-16"));
                this.b = b;
                if (this.a == 2 && this.j == null) {
                    this.j = b.split(":", -1)[0];
                }
                return;
            }
            case 1:
            case 5: {
                b2 = this.d;
                if (b2 != null) {
                    break;
                }
                final byte[] c = this.c;
                this.b = c;
                this.a = 3;
                this.e = 0;
                this.f = c.length;
                return;
            }
            case -1: {
                b2 = this.d;
                if (b2 != null) {
                    break;
                }
                throw new IllegalArgumentException("Invalid icon");
            }
        }
        this.b = b2;
    }
    
    @Override
    public void h(final boolean b) {
        this.i = this.h.name();
        switch (this.a) {
            default: {
                return;
            }
            case 4:
            case 6: {
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 3: {
                this.c = (byte[])this.b;
                return;
            }
            case 2: {
                this.c = ((String)this.b).getBytes(Charset.forName("UTF-16"));
                return;
            }
            case 1:
            case 5: {
                if (b) {
                    final Bitmap bitmap = (Bitmap)this.b;
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap$CompressFormat.PNG, 90, (OutputStream)byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            }
            case -1: {
                if (!b) {
                    break;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            }
        }
        this.d = (Parcelable)this.b;
    }
    
    @t0({ t0.a.I })
    public void i(@j0 final Intent intent, @k0 final Drawable drawable, @j0 Context packageContext) {
        this.j(packageContext);
        final int a = this.a;
        Bitmap bitmap = null;
        Label_0264: {
            if (a != 1) {
                if (a != 2) {
                    if (a == 5) {
                        bitmap = o((Bitmap)this.b, true);
                        break Label_0264;
                    }
                    throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                }
                else {
                    try {
                        packageContext = packageContext.createPackageContext(this.C(), 0);
                        if (drawable == null) {
                            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", (Parcelable)Intent$ShortcutIconResource.fromContext(packageContext, this.e));
                            return;
                        }
                        final Drawable i = androidx.core.content.d.i(packageContext, this.e);
                        if (i.getIntrinsicWidth() > 0 && i.getIntrinsicHeight() > 0) {
                            bitmap = Bitmap.createBitmap(i.getIntrinsicWidth(), i.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
                        }
                        else {
                            final int launcherLargeIconSize = ((ActivityManager)packageContext.getSystemService("activity")).getLauncherLargeIconSize();
                            bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap$Config.ARGB_8888);
                        }
                        i.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        i.draw(new Canvas(bitmap));
                        break Label_0264;
                    }
                    catch (PackageManager$NameNotFoundException cause) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Can't find package ");
                        sb.append(this.b);
                        throw new IllegalArgumentException(sb.toString(), (Throwable)cause);
                    }
                }
            }
            final Bitmap bitmap2 = bitmap = (Bitmap)this.b;
            if (drawable != null) {
                bitmap = bitmap2.copy(bitmap2.getConfig(), true);
            }
        }
        if (drawable != null) {
            final int width = bitmap.getWidth();
            final int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)bitmap);
    }
    
    @t0({ t0.a.I })
    public void j(@j0 final Context context) {
        if (this.a == 2) {
            final Object b = this.b;
            if (b != null) {
                final String str = (String)b;
                if (!str.contains(":")) {
                    return;
                }
                final String s = str.split(":", -1)[1];
                final String s2 = s.split("/", -1)[0];
                final String anObject = s.split("/", -1)[1];
                final String s3 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(anObject)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                final String c = this.C();
                final int identifier = E(context, c).getIdentifier(anObject, s2, s3);
                if (this.e != identifier) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Id has changed for ");
                    sb.append(c);
                    sb.append(" ");
                    sb.append(str);
                    Log.i("IconCompat", sb.toString());
                    this.e = identifier;
                }
            }
        }
    }
    
    @j0
    @Override
    public String toString() {
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        final StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(S(this.a));
        Label_0244: {
            int i = 0;
            switch (this.a) {
                default: {
                    break Label_0244;
                }
                case 4:
                case 6: {
                    sb.append(" uri=");
                    sb.append(this.b);
                    break Label_0244;
                }
                case 3: {
                    sb.append(" len=");
                    sb.append(this.e);
                    if (this.f != 0) {
                        sb.append(" off=");
                        i = this.f;
                        break;
                    }
                    break Label_0244;
                }
                case 2: {
                    sb.append(" pkg=");
                    sb.append(this.j);
                    sb.append(" id=");
                    sb.append(String.format("0x%08x", this.A()));
                    break Label_0244;
                }
                case 1:
                case 5: {
                    sb.append(" size=");
                    sb.append(((Bitmap)this.b).getWidth());
                    sb.append("x");
                    i = ((Bitmap)this.b).getHeight();
                    break;
                }
            }
            sb.append(i);
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != IconCompat.G) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
    
    @k0
    @t0({ t0.a.I })
    public Bitmap z() {
        final int a = this.a;
        if (a == -1 && Build$VERSION.SDK_INT >= 23) {
            final Object b = this.b;
            if (b instanceof Bitmap) {
                return (Bitmap)b;
            }
            return null;
        }
        else {
            if (a == 1) {
                return (Bitmap)this.b;
            }
            if (a == 5) {
                return o((Bitmap)this.b, true);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("called getBitmap() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface a {
    }
}
