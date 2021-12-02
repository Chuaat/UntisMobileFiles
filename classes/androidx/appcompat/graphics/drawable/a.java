// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.graphics.drawable;

import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.util.StateSet;
import androidx.collection.n;
import androidx.collection.h;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.Canvas;
import androidx.annotation.p0;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import androidx.vectordrawable.graphics.drawable.c;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.content.res.Resources$Theme;
import androidx.annotation.s;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.k0;
import android.content.res.Resources;
import android.annotation.SuppressLint;
import androidx.core.graphics.drawable.i;

@SuppressLint({ "RestrictedAPI" })
public class a extends androidx.appcompat.graphics.drawable.e implements i
{
    private static final String e0;
    private static final String f0 = "transition";
    private static final String g0 = "item";
    private static final String h0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final String i0 = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private static final String j0 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private c Z;
    private g a0;
    private int b0;
    private int c0;
    private boolean d0;
    
    static {
        e0 = a.class.getSimpleName();
    }
    
    public a() {
        this((c)null, null);
    }
    
    a(@k0 final c c, @k0 final Resources resources) {
        super(null);
        this.b0 = -1;
        this.c0 = -1;
        this.i(new c(c, this, resources));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }
    
    @k0
    public static a B(@j0 Context ex, @s int next, @k0 final Resources$Theme resources$Theme) {
        try {
            final Resources resources = ((Context)ex).getResources();
            final XmlResourceParser xml = resources.getXml(next);
            final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
            do {
                next = ((XmlPullParser)xml).next();
            } while (next != 2 && next != 1);
            if (next == 2) {
                return C((Context)ex, resources, (XmlPullParser)xml, attributeSet, resources$Theme);
            }
            ex = (IOException)new XmlPullParserException("No start tag found");
            throw ex;
        }
        catch (IOException ex) {}
        catch (XmlPullParserException ex2) {}
        Log.e(a.e0, "parser error", (Throwable)ex);
        return null;
    }
    
    public static a C(@j0 final Context context, @j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws IOException, XmlPullParserException {
        final String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            final a a = new a();
            a.v(context, resources, xmlPullParser, set, resources$Theme);
            return a;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    private void D() {
        this.onStateChange(this.getState());
    }
    
    private int E(@j0 final Context context, @j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, d.a.j.h);
        final int resourceId = s.getResourceId(d.a.j.i, 0);
        final int resourceId2 = s.getResourceId(d.a.j.j, -1);
        Drawable j;
        if (resourceId2 > 0) {
            j = androidx.appcompat.widget.j0.h().j(context, resourceId2);
        }
        else {
            j = null;
        }
        s.recycle();
        final int[] p5 = this.p(set);
        Drawable drawable = j;
        if (j == null) {
            int next;
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            }
            if (xmlPullParser.getName().equals("vector")) {
                drawable = androidx.vectordrawable.graphics.drawable.i.f(resources, xmlPullParser, set, resources$Theme);
            }
            else if (Build$VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, set, resources$Theme);
            }
            else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, set);
            }
        }
        if (drawable != null) {
            return this.Z.F(p5, drawable, resourceId);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }
    
    private int F(@j0 final Context context, @j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, d.a.j.k);
        final int resourceId = s.getResourceId(d.a.j.n, -1);
        final int resourceId2 = s.getResourceId(d.a.j.m, -1);
        final int resourceId3 = s.getResourceId(d.a.j.l, -1);
        Drawable j;
        if (resourceId3 > 0) {
            j = androidx.appcompat.widget.j0.h().j(context, resourceId3);
        }
        else {
            j = null;
        }
        final boolean boolean1 = s.getBoolean(d.a.j.o, false);
        s.recycle();
        Drawable drawable = j;
        if (j == null) {
            int next;
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            }
            if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = androidx.vectordrawable.graphics.drawable.c.f(context, resources, xmlPullParser, set, resources$Theme);
            }
            else if (Build$VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, set, resources$Theme);
            }
            else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, set);
            }
        }
        if (drawable == null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.Z.G(resourceId, resourceId2, drawable, boolean1);
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(xmlPullParser.getPositionDescription());
        sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
        throw new XmlPullParserException(sb3.toString());
    }
    
    private boolean G(final int n) {
        final g a0 = this.a0;
        int c0;
        if (a0 != null) {
            if (n == this.b0) {
                return true;
            }
            if (n == this.c0 && a0.a()) {
                a0.b();
                this.b0 = this.c0;
                this.c0 = n;
                return true;
            }
            c0 = this.b0;
            a0.d();
        }
        else {
            c0 = this.d();
        }
        this.a0 = null;
        this.c0 = -1;
        this.b0 = -1;
        final c z = this.Z;
        final int i = z.I(c0);
        final int j = z.I(n);
        if (j != 0) {
            if (i != 0) {
                final int k = z.K(i, j);
                if (k < 0) {
                    return false;
                }
                final boolean m = z.M(i, j);
                this.h(k);
                final Drawable current = this.getCurrent();
                g a2;
                if (current instanceof AnimationDrawable) {
                    a2 = new e((AnimationDrawable)current, z.L(i, j), m);
                }
                else if (current instanceof androidx.vectordrawable.graphics.drawable.c) {
                    a2 = new d((androidx.vectordrawable.graphics.drawable.c)current);
                }
                else {
                    if (!(current instanceof Animatable)) {
                        return false;
                    }
                    a2 = new b((Animatable)current);
                }
                a2.c();
                this.a0 = a2;
                this.c0 = c0;
                this.b0 = n;
                return true;
            }
        }
        return false;
    }
    
    private void w(@j0 final Context context, @j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final int n = xmlPullParser.getDepth() + 1;
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlPullParser.getDepth();
            if (depth < n && next == 3) {
                break;
            }
            if (next != 2) {
                continue;
            }
            if (depth > n) {
                continue;
            }
            if (xmlPullParser.getName().equals("item")) {
                this.E(context, resources, xmlPullParser, set, resources$Theme);
            }
            else {
                if (!xmlPullParser.getName().equals("transition")) {
                    continue;
                }
                this.F(context, resources, xmlPullParser, set, resources$Theme);
            }
        }
    }
    
    private void x(final TypedArray typedArray) {
        final c z = this.Z;
        if (Build$VERSION.SDK_INT >= 21) {
            z.d |= typedArray.getChangingConfigurations();
        }
        ((androidx.appcompat.graphics.drawable.b.d)z).B(typedArray.getBoolean(d.a.j.d, z.i));
        ((androidx.appcompat.graphics.drawable.b.d)z).x(typedArray.getBoolean(d.a.j.e, z.l));
        ((androidx.appcompat.graphics.drawable.b.d)z).y(typedArray.getInt(d.a.j.f, z.A));
        ((androidx.appcompat.graphics.drawable.b.d)z).z(typedArray.getInt(d.a.j.g, z.B));
        this.setDither(typedArray.getBoolean(d.a.j.b, z.x));
    }
    
    c A() {
        return new c(this.Z, this, null);
    }
    
    @Override
    void b() {
        super.b();
        this.d0 = false;
    }
    
    @Override
    void i(@j0 final androidx.appcompat.graphics.drawable.b.d d) {
        super.i(d);
        if (d instanceof c) {
            this.Z = (c)d;
        }
    }
    
    @Override
    public boolean isStateful() {
        return true;
    }
    
    @Override
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        final g a0 = this.a0;
        if (a0 != null) {
            a0.d();
            this.a0 = null;
            this.h(this.b0);
            this.b0 = -1;
            this.c0 = -1;
        }
    }
    
    @Override
    public Drawable mutate() {
        if (!this.d0 && super.mutate() == this) {
            this.Z.v();
            this.d0 = true;
        }
        return this;
    }
    
    @Override
    protected boolean onStateChange(final int[] state) {
        final int j = this.Z.J(state);
        final boolean b = j != this.d() && (this.G(j) || this.h(j));
        final Drawable current = this.getCurrent();
        boolean b2 = b;
        if (current != null) {
            b2 = (b | current.setState(state));
        }
        return b2;
    }
    
    @Override
    public boolean setVisible(final boolean b, final boolean b2) {
        final boolean setVisible = super.setVisible(b, b2);
        final g a0 = this.a0;
        if (a0 != null && (setVisible || b2)) {
            if (b) {
                a0.c();
            }
            else {
                this.jumpToCurrentState();
            }
        }
        return setVisible;
    }
    
    @Override
    public void v(@j0 final Context context, @j0 final Resources resources, @j0 final XmlPullParser xmlPullParser, @j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, d.a.j.a);
        this.setVisible(s.getBoolean(d.a.j.c, true), true);
        this.x(s);
        this.m(resources);
        s.recycle();
        this.w(context, resources, xmlPullParser, set, resources$Theme);
        this.D();
    }
    
    public void y(@j0 final int[] array, @j0 final Drawable drawable, final int n) {
        if (drawable != null) {
            this.Z.F(array, drawable, n);
            this.onStateChange(this.getState());
            return;
        }
        throw new IllegalArgumentException("Drawable must not be null");
    }
    
    public <T extends android.graphics.drawable.Drawable> void z(final int n, final int n2, @j0 final T t, final boolean b) {
        if (t != null) {
            this.Z.G(n, n2, (Drawable)t, b);
            return;
        }
        throw new IllegalArgumentException("Transition drawable must not be null");
    }
    
    private static class b extends g
    {
        private final Animatable a;
        
        b(final Animatable a) {
            this.a = a;
        }
        
        @Override
        public void c() {
            this.a.start();
        }
        
        @Override
        public void d() {
            this.a.stop();
        }
    }
    
    static class c extends a
    {
        private static final long M = 4294967296L;
        private static final long N = 8589934592L;
        h<Long> K;
        n<Integer> L;
        
        c(@k0 final c c, @j0 final a a, @k0 final Resources resources) {
            super((a)c, a, resources);
            n<Integer> l;
            if (c != null) {
                this.K = c.K;
                l = c.L;
            }
            else {
                this.K = new h<Long>();
                l = new n<Integer>();
            }
            this.L = l;
        }
        
        private static long H(final int n, final int n2) {
            return (long)n2 | (long)n << 32;
        }
        
        int F(@j0 final int[] array, @j0 final Drawable drawable, final int i) {
            final int d = super.D(array, drawable);
            this.L.s(d, i);
            return d;
        }
        
        int G(final int n, final int n2, @j0 final Drawable drawable, final boolean b) {
            final int a = super.a(drawable);
            final long h = H(n, n2);
            long n3;
            if (b) {
                n3 = 8589934592L;
            }
            else {
                n3 = 0L;
            }
            final h<Long> k = this.K;
            final long n4 = a;
            k.a(h, n4 | n3);
            if (b) {
                this.K.a(H(n2, n), 0x100000000L | n4 | n3);
            }
            return a;
        }
        
        int I(int intValue) {
            final int n = 0;
            if (intValue < 0) {
                intValue = n;
            }
            else {
                intValue = this.L.l(intValue, 0);
            }
            return intValue;
        }
        
        int J(@j0 final int[] array) {
            final int e = super.E(array);
            if (e >= 0) {
                return e;
            }
            return super.E(StateSet.WILD_CARD);
        }
        
        int K(final int n, final int n2) {
            return (int)(long)this.K.l(H(n, n2), -1L);
        }
        
        boolean L(final int n, final int n2) {
            return ((long)this.K.l(H(n, n2), -1L) & 0x100000000L) != 0x0L;
        }
        
        boolean M(final int n, final int n2) {
            return ((long)this.K.l(H(n, n2), -1L) & 0x200000000L) != 0x0L;
        }
        
        @j0
        @Override
        public Drawable newDrawable() {
            return new a(this, null);
        }
        
        @j0
        @Override
        public Drawable newDrawable(final Resources resources) {
            return new a(this, resources);
        }
        
        @Override
        void v() {
            this.K = this.K.c();
            this.L = this.L.c();
        }
    }
    
    private static class d extends g
    {
        private final androidx.vectordrawable.graphics.drawable.c a;
        
        d(final androidx.vectordrawable.graphics.drawable.c a) {
            this.a = a;
        }
        
        @Override
        public void c() {
            this.a.start();
        }
        
        @Override
        public void d() {
            this.a.stop();
        }
    }
    
    private static class e extends g
    {
        private final ObjectAnimator a;
        private final boolean b;
        
        e(final AnimationDrawable animationDrawable, final boolean b, final boolean b2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int n;
            if (b) {
                n = numberOfFrames - 1;
            }
            else {
                n = 0;
            }
            if (b) {
                numberOfFrames = 0;
            }
            else {
                --numberOfFrames;
            }
            final f interpolator = new f(animationDrawable, b);
            final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)animationDrawable, "currentIndex", new int[] { n, numberOfFrames });
            if (Build$VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long)interpolator.a());
            ofInt.setInterpolator((TimeInterpolator)interpolator);
            this.b = b2;
            this.a = ofInt;
        }
        
        @Override
        public boolean a() {
            return this.b;
        }
        
        @Override
        public void b() {
            this.a.reverse();
        }
        
        @Override
        public void c() {
            this.a.start();
        }
        
        @Override
        public void d() {
            this.a.cancel();
        }
    }
    
    private static class f implements TimeInterpolator
    {
        private int[] a;
        private int b;
        private int c;
        
        f(final AnimationDrawable animationDrawable, final boolean b) {
            this.b(animationDrawable, b);
        }
        
        int a() {
            return this.c;
        }
        
        int b(final AnimationDrawable animationDrawable, final boolean b) {
            final int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            final int[] a = this.a;
            if (a == null || a.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            final int[] a2 = this.a;
            int i = 0;
            int c = 0;
            while (i < numberOfFrames) {
                int n;
                if (b) {
                    n = numberOfFrames - i - 1;
                }
                else {
                    n = i;
                }
                final int duration = animationDrawable.getDuration(n);
                a2[i] = duration;
                c += duration;
                ++i;
            }
            return this.c = c;
        }
        
        public float getInterpolation(float n) {
            int n2;
            int b;
            int[] a;
            int n3;
            for (n2 = (int)(n * this.c + 0.5f), b = this.b, a = this.a, n3 = 0; n3 < b && n2 >= a[n3]; n2 -= a[n3], ++n3) {}
            if (n3 < b) {
                n = n2 / (float)this.c;
            }
            else {
                n = 0.0f;
            }
            return n3 / (float)b + n;
        }
    }
    
    private abstract static class g
    {
        public boolean a() {
            return false;
        }
        
        public void b() {
        }
        
        public abstract void c();
        
        public abstract void d();
    }
}
