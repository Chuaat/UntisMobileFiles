// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.collection.j;
import androidx.annotation.k0;
import android.content.res.Resources$Theme;
import androidx.core.content.d;
import android.graphics.ColorFilter;
import androidx.core.graphics.drawable.c;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import android.util.Log;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import androidx.vectordrawable.graphics.drawable.i;
import android.os.Build$VERSION;
import android.graphics.PorterDuffColorFilter;
import d.a;
import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.graphics.drawable.Drawable$ConstantState;
import java.lang.ref.WeakReference;
import androidx.collection.h;
import androidx.collection.m;
import android.content.res.ColorStateList;
import androidx.collection.n;
import android.content.Context;
import java.util.WeakHashMap;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.t0;

@t0({ t0.a.I })
public final class j0
{
    private static final String h = "ResourceManagerInternal";
    private static final boolean i = false;
    private static final PorterDuff$Mode j;
    private static final String k = "appcompat_skip_skip";
    private static final String l = "android.graphics.drawable.VectorDrawable";
    private static j0 m;
    private static final c n;
    private WeakHashMap<Context, n<ColorStateList>> a;
    private m<String, e> b;
    private n<String> c;
    private final WeakHashMap<Context, h<WeakReference<Drawable$ConstantState>>> d;
    private TypedValue e;
    private boolean f;
    private f g;
    
    static {
        j = PorterDuff$Mode.SRC_IN;
        n = new c(6);
    }
    
    public j0() {
        this.d = new WeakHashMap<Context, h<WeakReference<Drawable$ConstantState>>>(0);
    }
    
    private void a(@androidx.annotation.j0 final String s, @androidx.annotation.j0 final e e) {
        if (this.b == null) {
            this.b = new m<String, e>();
        }
        this.b.put(s, e);
    }
    
    private boolean b(@androidx.annotation.j0 final Context context, final long n, @androidx.annotation.j0 final Drawable drawable) {
        synchronized (this) {
            final Drawable$ConstantState constantState = drawable.getConstantState();
            boolean b;
            if (constantState != null) {
                h<WeakReference<Drawable$ConstantState>> value;
                if ((value = this.d.get(context)) == null) {
                    value = new h<WeakReference<Drawable$ConstantState>>();
                    this.d.put(context, value);
                }
                value.s(n, new WeakReference<Drawable$ConstantState>(constantState));
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
    }
    
    private void c(@androidx.annotation.j0 final Context context, @s final int n, @androidx.annotation.j0 final ColorStateList list) {
        if (this.a == null) {
            this.a = new WeakHashMap<Context, n<ColorStateList>>();
        }
        n<ColorStateList> value;
        if ((value = this.a.get(context)) == null) {
            value = new n<ColorStateList>();
            this.a.put(context, value);
        }
        value.a(n, list);
    }
    
    private void d(@androidx.annotation.j0 final Context context) {
        if (this.f) {
            return;
        }
        this.f = true;
        final Drawable j = this.j(context, d.a.d.a);
        if (j != null && q(j)) {
            return;
        }
        this.f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }
    
    private static long e(final TypedValue typedValue) {
        return (long)typedValue.assetCookie << 32 | (long)typedValue.data;
    }
    
    private Drawable f(@androidx.annotation.j0 final Context context, @s final int n) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        final TypedValue e = this.e;
        context.getResources().getValue(n, e, true);
        final long e2 = e(e);
        final Drawable i = this.i(context, e2);
        if (i != null) {
            return i;
        }
        final f g = this.g;
        Drawable c;
        if (g == null) {
            c = null;
        }
        else {
            c = g.c(this, context, n);
        }
        if (c != null) {
            c.setChangingConfigurations(e.changingConfigurations);
            this.b(context, e2, c);
        }
        return c;
    }
    
    private static PorterDuffColorFilter g(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode, final int[] array) {
        if (list != null && porterDuff$Mode != null) {
            return l(list.getColorForState(array, 0), porterDuff$Mode);
        }
        return null;
    }
    
    public static j0 h() {
        synchronized (j0.class) {
            if (j0.m == null) {
                p(j0.m = new j0());
            }
            return j0.m;
        }
    }
    
    private Drawable i(@androidx.annotation.j0 final Context key, final long n) {
        synchronized (this) {
            final h<WeakReference<Drawable$ConstantState>> h = this.d.get(key);
            if (h == null) {
                return null;
            }
            final WeakReference<Drawable$ConstantState> weakReference = h.j(n);
            if (weakReference != null) {
                final Drawable$ConstantState drawable$ConstantState = weakReference.get();
                if (drawable$ConstantState != null) {
                    return drawable$ConstantState.newDrawable(key.getResources());
                }
                h.v(n);
            }
            return null;
        }
    }
    
    public static PorterDuffColorFilter l(final int n, final PorterDuff$Mode porterDuff$Mode) {
        synchronized (j0.class) {
            final c n2 = j0.n;
            PorterDuffColorFilter t;
            if ((t = n2.t(n, porterDuff$Mode)) == null) {
                t = new PorterDuffColorFilter(n, porterDuff$Mode);
                n2.u(n, porterDuff$Mode, t);
            }
            return t;
        }
    }
    
    private ColorStateList n(@androidx.annotation.j0 final Context key, @s final int n) {
        final WeakHashMap<Context, n<ColorStateList>> a = this.a;
        ColorStateList list = null;
        if (a != null) {
            final n<ColorStateList> n2 = a.get(key);
            list = list;
            if (n2 != null) {
                list = n2.j(n);
            }
        }
        return list;
    }
    
    private static void p(@androidx.annotation.j0 final j0 j0) {
        if (Build$VERSION.SDK_INT < 24) {
            j0.a("vector", (e)new g());
            j0.a("animated-vector", (e)new b());
            j0.a("animated-selector", (e)new a());
            j0.a("drawable", (e)new d());
        }
    }
    
    private static boolean q(@androidx.annotation.j0 final Drawable drawable) {
        return drawable instanceof i || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }
    
    private Drawable r(@androidx.annotation.j0 final Context context, @s final int n) {
        final m<String, e> b = this.b;
        if (b == null || b.isEmpty()) {
            return null;
        }
        final n<String> c = this.c;
        if (c != null) {
            final String anObject = c.j(n);
            if ("appcompat_skip_skip".equals(anObject) || (anObject != null && this.b.get(anObject) == null)) {
                return null;
            }
        }
        else {
            this.c = new n<String>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        final TypedValue e = this.e;
        final Resources resources = context.getResources();
        resources.getValue(n, e, true);
        final long e2 = e(e);
        final Drawable i = this.i(context, e2);
        if (i != null) {
            return i;
        }
        final CharSequence string = e.string;
        Drawable drawable = i;
        if (string != null) {
            drawable = i;
            if (string.toString().endsWith(".xml")) {
                drawable = i;
                try {
                    final XmlResourceParser xml = resources.getXml(n);
                    drawable = i;
                    final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                    int next;
                    do {
                        drawable = i;
                        next = ((XmlPullParser)xml).next();
                    } while (next != 2 && next != 1);
                    if (next != 2) {
                        drawable = i;
                        drawable = i;
                        final XmlPullParserException ex = new XmlPullParserException("No start tag found");
                        drawable = i;
                        throw ex;
                    }
                    drawable = i;
                    final String name = ((XmlPullParser)xml).getName();
                    drawable = i;
                    this.c.a(n, name);
                    drawable = i;
                    final e e3 = this.b.get(name);
                    Drawable a = i;
                    if (e3 != null) {
                        drawable = i;
                        a = e3.a(context, (XmlPullParser)xml, attributeSet, context.getTheme());
                    }
                    if ((drawable = a) != null) {
                        drawable = a;
                        a.setChangingConfigurations(e.changingConfigurations);
                        drawable = a;
                        this.b(context, e2, a);
                        drawable = a;
                    }
                }
                catch (Exception ex2) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", (Throwable)ex2);
                }
            }
        }
        if (drawable == null) {
            this.c.a(n, "appcompat_skip_skip");
        }
        return drawable;
    }
    
    private Drawable v(@androidx.annotation.j0 final Context context, @s final int n, final boolean b, @androidx.annotation.j0 final Drawable drawable) {
        final ColorStateList m = this.m(context, n);
        Drawable drawable2;
        if (m != null) {
            Drawable mutate = drawable;
            if (b0.a(drawable)) {
                mutate = drawable.mutate();
            }
            final Drawable r = androidx.core.graphics.drawable.c.r(mutate);
            androidx.core.graphics.drawable.c.o(r, m);
            final PorterDuff$Mode o = this.o(n);
            drawable2 = r;
            if (o != null) {
                androidx.core.graphics.drawable.c.p(r, o);
                drawable2 = r;
            }
        }
        else {
            final f g = this.g;
            if (g != null && g.e(context, n, drawable)) {
                drawable2 = drawable;
            }
            else {
                drawable2 = drawable;
                if (!this.x(context, n, drawable)) {
                    drawable2 = drawable;
                    if (b) {
                        drawable2 = null;
                    }
                }
            }
        }
        return drawable2;
    }
    
    static void w(final Drawable drawable, final s0 s0, final int[] array) {
        if (b0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        final boolean d = s0.d;
        if (!d && !s0.c) {
            drawable.clearColorFilter();
        }
        else {
            ColorStateList a;
            if (d) {
                a = s0.a;
            }
            else {
                a = null;
            }
            PorterDuff$Mode porterDuff$Mode;
            if (s0.c) {
                porterDuff$Mode = s0.b;
            }
            else {
                porterDuff$Mode = j0.j;
            }
            drawable.setColorFilter((ColorFilter)g(a, porterDuff$Mode, array));
        }
        if (Build$VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }
    
    public Drawable j(@androidx.annotation.j0 final Context context, @s final int n) {
        synchronized (this) {
            return this.k(context, n, false);
        }
    }
    
    Drawable k(@androidx.annotation.j0 final Context context, @s final int n, final boolean b) {
        synchronized (this) {
            this.d(context);
            Drawable drawable;
            if ((drawable = this.r(context, n)) == null) {
                drawable = this.f(context, n);
            }
            Drawable i;
            if ((i = drawable) == null) {
                i = androidx.core.content.d.i(context, n);
            }
            Drawable v;
            if ((v = i) != null) {
                v = this.v(context, n, b, i);
            }
            if (v != null) {
                b0.b(v);
            }
            return v;
        }
    }
    
    ColorStateList m(@androidx.annotation.j0 final Context context, @s final int n) {
        synchronized (this) {
            ColorStateList n2;
            if ((n2 = this.n(context, n)) == null) {
                final f g = this.g;
                ColorStateList d;
                if (g == null) {
                    d = null;
                }
                else {
                    d = g.d(context, n);
                }
                n2 = d;
                if (d != null) {
                    this.c(context, n, d);
                    n2 = d;
                }
            }
            return n2;
        }
    }
    
    PorterDuff$Mode o(final int n) {
        final f g = this.g;
        PorterDuff$Mode b;
        if (g == null) {
            b = null;
        }
        else {
            b = g.b(n);
        }
        return b;
    }
    
    public void s(@androidx.annotation.j0 final Context key) {
        synchronized (this) {
            final h<WeakReference<Drawable$ConstantState>> h = this.d.get(key);
            if (h != null) {
                h.b();
            }
        }
    }
    
    Drawable t(@androidx.annotation.j0 final Context context, @androidx.annotation.j0 final z0 z0, @s final int n) {
        synchronized (this) {
            Drawable drawable;
            if ((drawable = this.r(context, n)) == null) {
                drawable = z0.d(n);
            }
            if (drawable != null) {
                return this.v(context, n, false, drawable);
            }
            return null;
        }
    }
    
    public void u(final f g) {
        synchronized (this) {
            this.g = g;
        }
    }
    
    boolean x(@androidx.annotation.j0 final Context context, @s final int n, @androidx.annotation.j0 final Drawable drawable) {
        final f g = this.g;
        return g != null && g.a(context, n, drawable);
    }
    
    static class a implements e
    {
        @Override
        public Drawable a(@androidx.annotation.j0 final Context context, @androidx.annotation.j0 final XmlPullParser xmlPullParser, @androidx.annotation.j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) {
            try {
                return androidx.appcompat.graphics.drawable.a.C(context, context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (Exception ex) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", (Throwable)ex);
                return null;
            }
        }
    }
    
    private static class b implements e
    {
        b() {
        }
        
        @Override
        public Drawable a(@androidx.annotation.j0 final Context context, @androidx.annotation.j0 final XmlPullParser xmlPullParser, @androidx.annotation.j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.f(context, context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (Exception ex) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", (Throwable)ex);
                return null;
            }
        }
    }
    
    private static class c extends j<Integer, PorterDuffColorFilter>
    {
        public c(final int n) {
            super(n);
        }
        
        private static int s(final int n, final PorterDuff$Mode porterDuff$Mode) {
            return (n + 31) * 31 + porterDuff$Mode.hashCode();
        }
        
        PorterDuffColorFilter t(final int n, final PorterDuff$Mode porterDuff$Mode) {
            return this.f(s(n, porterDuff$Mode));
        }
        
        PorterDuffColorFilter u(final int n, final PorterDuff$Mode porterDuff$Mode, final PorterDuffColorFilter porterDuffColorFilter) {
            return this.j(s(n, porterDuff$Mode), porterDuffColorFilter);
        }
    }
    
    static class d implements e
    {
        @Override
        public Drawable a(@androidx.annotation.j0 final Context context, @androidx.annotation.j0 final XmlPullParser xmlPullParser, @androidx.annotation.j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) {
            final String classAttribute = set.getClassAttribute();
            if (classAttribute != null) {
                try {
                    final Drawable drawable = (Drawable)d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                    if (Build$VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, set, resources$Theme);
                    }
                    else {
                        drawable.inflate(context.getResources(), xmlPullParser, set);
                    }
                    return drawable;
                }
                catch (Exception ex) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", (Throwable)ex);
                }
            }
            return null;
        }
    }
    
    private interface e
    {
        Drawable a(@androidx.annotation.j0 final Context p0, @androidx.annotation.j0 final XmlPullParser p1, @androidx.annotation.j0 final AttributeSet p2, @k0 final Resources$Theme p3);
    }
    
    @t0({ t0.a.I })
    public interface f
    {
        boolean a(@androidx.annotation.j0 final Context p0, @s final int p1, @androidx.annotation.j0 final Drawable p2);
        
        @k0
        PorterDuff$Mode b(final int p0);
        
        @k0
        Drawable c(@androidx.annotation.j0 final j0 p0, @androidx.annotation.j0 final Context p1, @s final int p2);
        
        @k0
        ColorStateList d(@androidx.annotation.j0 final Context p0, @s final int p1);
        
        boolean e(@androidx.annotation.j0 final Context p0, @s final int p1, @androidx.annotation.j0 final Drawable p2);
    }
    
    private static class g implements e
    {
        g() {
        }
        
        @Override
        public Drawable a(@androidx.annotation.j0 final Context context, @androidx.annotation.j0 final XmlPullParser xmlPullParser, @androidx.annotation.j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.f(context.getResources(), xmlPullParser, set, resources$Theme);
            }
            catch (Exception ex) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", (Throwable)ex);
                return null;
            }
        }
    }
}
