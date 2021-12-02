// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.graphics.drawable;

import android.util.StateSet;
import androidx.annotation.p0;
import java.io.IOException;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import org.xmlpull.v1.XmlPullParserException;
import androidx.appcompat.widget.j0;
import androidx.core.content.res.i;
import d.a;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import androidx.annotation.k0;
import android.content.res.Resources;
import androidx.annotation.t0;
import android.annotation.SuppressLint;

@SuppressLint({ "RestrictedAPI" })
@t0({ t0.a.I })
class e extends b
{
    private static final String X = "StateListDrawable";
    private static final boolean Y = false;
    private a V;
    private boolean W;
    
    e() {
        this(null, null);
    }
    
    e(@k0 final a a) {
        if (a != null) {
            this.i(a);
        }
    }
    
    e(final a a, final Resources resources) {
        this.i(new a(a, this, resources));
        this.onStateChange(this.getState());
    }
    
    private void w(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final a v = this.V;
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
            if (!xmlPullParser.getName().equals("item")) {
                continue;
            }
            final TypedArray s = i.s(resources, resources$Theme, set, d.a.j.j0);
            Drawable j = null;
            final int resourceId = s.getResourceId(d.a.j.k0, -1);
            if (resourceId > 0) {
                j = j0.h().j(context, resourceId);
            }
            s.recycle();
            final int[] p5 = this.p(set);
            Drawable drawable;
            if ((drawable = j) == null) {
                int next2;
                do {
                    next2 = xmlPullParser.next();
                } while (next2 == 4);
                if (next2 != 2) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(xmlPullParser.getPositionDescription());
                    sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    throw new XmlPullParserException(sb.toString());
                }
                if (Build$VERSION.SDK_INT >= 21) {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, set, resources$Theme);
                }
                else {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, set);
                }
            }
            v.D(p5, drawable);
        }
    }
    
    private void x(final TypedArray typedArray) {
        final a v = this.V;
        if (Build$VERSION.SDK_INT >= 21) {
            v.d |= typedArray.getChangingConfigurations();
        }
        v.i = typedArray.getBoolean(d.a.j.f0, v.i);
        v.l = typedArray.getBoolean(d.a.j.g0, v.l);
        v.A = typedArray.getInt(d.a.j.h0, v.A);
        v.B = typedArray.getInt(d.a.j.i0, v.B);
        v.x = typedArray.getBoolean(d.a.j.d0, v.x);
    }
    
    @p0(21)
    @Override
    public void applyTheme(@androidx.annotation.j0 final Resources$Theme resources$Theme) {
        super.applyTheme(resources$Theme);
        this.onStateChange(this.getState());
    }
    
    @Override
    void b() {
        super.b();
        this.W = false;
    }
    
    @Override
    void i(@androidx.annotation.j0 final d d) {
        super.i(d);
        if (d instanceof a) {
            this.V = (a)d;
        }
    }
    
    @Override
    public boolean isStateful() {
        return true;
    }
    
    @androidx.annotation.j0
    @Override
    public Drawable mutate() {
        if (!this.W && super.mutate() == this) {
            this.V.v();
            this.W = true;
        }
        return this;
    }
    
    public void n(final int[] array, final Drawable drawable) {
        if (drawable != null) {
            this.V.D(array, drawable);
            this.onStateChange(this.getState());
        }
    }
    
    a o() {
        return new a(this.V, this, null);
    }
    
    @Override
    protected boolean onStateChange(final int[] array) {
        final boolean onStateChange = super.onStateChange(array);
        int n;
        if ((n = this.V.E(array)) < 0) {
            n = this.V.E(StateSet.WILD_CARD);
        }
        return this.h(n) || onStateChange;
    }
    
    int[] p(final AttributeSet set) {
        final int attributeCount = set.getAttributeCount();
        final int[] array = new int[attributeCount];
        int i = 0;
        int n = 0;
        while (i < attributeCount) {
            final int attributeNameResource = set.getAttributeNameResource(i);
            int n2 = n;
            if (attributeNameResource != 0) {
                n2 = n;
                if (attributeNameResource != 16842960) {
                    n2 = n;
                    if (attributeNameResource != 16843161) {
                        int n3;
                        if (set.getAttributeBooleanValue(i, false)) {
                            n3 = attributeNameResource;
                        }
                        else {
                            n3 = -attributeNameResource;
                        }
                        array[n] = n3;
                        n2 = n + 1;
                    }
                }
            }
            ++i;
            n = n2;
        }
        return StateSet.trimStateSet(array, n);
    }
    
    int q() {
        return ((d)this.V).i();
    }
    
    Drawable r(final int n) {
        return ((d)this.V).h(n);
    }
    
    int s(final int[] array) {
        return this.V.E(array);
    }
    
    a t() {
        return this.V;
    }
    
    int[] u(final int n) {
        return this.V.J[n];
    }
    
    public void v(@androidx.annotation.j0 final Context context, @androidx.annotation.j0 final Resources resources, @androidx.annotation.j0 final XmlPullParser xmlPullParser, @androidx.annotation.j0 final AttributeSet set, @k0 final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final TypedArray s = i.s(resources, resources$Theme, set, d.a.j.c0);
        this.setVisible(s.getBoolean(d.a.j.e0, true), true);
        this.x(s);
        this.m(resources);
        s.recycle();
        this.w(context, resources, xmlPullParser, set, resources$Theme);
        this.onStateChange(this.getState());
    }
    
    static class a extends d
    {
        int[][] J;
        
        a(final a a, final e e, final Resources resources) {
            super((d)a, e, resources);
            if (a != null) {
                this.J = a.J;
            }
            else {
                this.J = new int[((d)this).g()][];
            }
        }
        
        int D(final int[] array, final Drawable drawable) {
            final int a = ((d)this).a(drawable);
            this.J[a] = array;
            return a;
        }
        
        int E(final int[] array) {
            final int[][] j = this.J;
            for (int i = ((d)this).i(), k = 0; k < i; ++k) {
                if (StateSet.stateSetMatches(j[k], array)) {
                    return k;
                }
            }
            return -1;
        }
        
        @androidx.annotation.j0
        public Drawable newDrawable() {
            return new e(this, null);
        }
        
        @androidx.annotation.j0
        public Drawable newDrawable(final Resources resources) {
            return new e(this, resources);
        }
        
        @Override
        public void r(final int n, final int n2) {
            super.r(n, n2);
            final int[][] j = new int[n2][];
            System.arraycopy(this.J, 0, j, 0, n);
            this.J = j;
        }
        
        @Override
        void v() {
            final int[][] j = this.J;
            final int[][] i = new int[j.length][];
            for (int k = j.length - 1; k >= 0; --k) {
                final int[][] l = this.J;
                int[] array;
                if (l[k] != null) {
                    array = l[k].clone();
                }
                else {
                    array = null;
                }
                i[k] = array;
            }
            this.J = i;
        }
    }
}
