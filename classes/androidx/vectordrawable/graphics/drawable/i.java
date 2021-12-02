// 
// Decompiled by Procyon v0.5.36
// 

package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.VectorDrawable;
import androidx.annotation.p0;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import android.graphics.Path$FillType;
import android.graphics.PathMeasure;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import androidx.annotation.l;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import androidx.core.content.res.b;
import androidx.core.graphics.o;
import android.graphics.Region;
import androidx.annotation.t0;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.c;
import java.util.ArrayDeque;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import androidx.core.content.res.g;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.content.res.Resources$Theme;
import androidx.annotation.s;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.annotation.j0;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

public class i extends androidx.vectordrawable.graphics.drawable.h
{
    static final String Q = "VectorDrawableCompat";
    static final PorterDuff$Mode R;
    private static final String S = "clip-path";
    private static final String T = "group";
    private static final String U = "path";
    private static final String V = "vector";
    private static final int W = 0;
    private static final int X = 1;
    private static final int Y = 2;
    private static final int Z = 0;
    private static final int a0 = 1;
    private static final int b0 = 2;
    private static final int c0 = 2048;
    private static final boolean d0 = false;
    private h H;
    private PorterDuffColorFilter I;
    private ColorFilter J;
    private boolean K;
    private boolean L;
    private Drawable$ConstantState M;
    private final float[] N;
    private final Matrix O;
    private final Rect P;
    
    static {
        R = PorterDuff$Mode.SRC_IN;
    }
    
    i() {
        this.L = true;
        this.N = new float[9];
        this.O = new Matrix();
        this.P = new Rect();
        this.H = new h();
    }
    
    i(@j0 final h h) {
        this.L = true;
        this.N = new float[9];
        this.O = new Matrix();
        this.P = new Rect();
        this.H = h;
        this.I = this.o(this.I, h.c, h.d);
    }
    
    static int a(final int n, final float n2) {
        return (n & 0xFFFFFF) | (int)(Color.alpha(n) * n2) << 24;
    }
    
    @k0
    public static i e(@j0 Resources ex, @s int next, @k0 final Resources$Theme resources$Theme) {
        if (Build$VERSION.SDK_INT >= 24) {
            final i i = new i();
            i.G = androidx.core.content.res.g.f((Resources)ex, next, resources$Theme);
            i.M = new i(i.G.getConstantState());
            return i;
        }
        try {
            final XmlResourceParser xml = ((Resources)ex).getXml(next);
            final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
            do {
                next = ((XmlPullParser)xml).next();
            } while (next != 2 && next != 1);
            if (next == 2) {
                return f((Resources)ex, (XmlPullParser)xml, attributeSet, resources$Theme);
            }
            ex = (IOException)new XmlPullParserException("No start tag found");
            throw ex;
        }
        catch (IOException ex) {}
        catch (XmlPullParserException ex2) {}
        Log.e("VectorDrawableCompat", "parser error", (Throwable)ex);
        return null;
    }
    
    public static i f(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final i i = new i();
        i.inflate(resources, xmlPullParser, set, resources$Theme);
        return i;
    }
    
    private void i(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final h h = this.H;
        final g b = h.b;
        final ArrayDeque<d> arrayDeque = new ArrayDeque<d>();
        arrayDeque.push(b.h);
        int n = xmlPullParser.getEventType();
        final int depth = xmlPullParser.getDepth();
        int n2 = 1;
        while (n != 1 && (xmlPullParser.getDepth() >= depth + 1 || n != 3)) {
            int n4 = 0;
            Label_0419: {
                if (n == 2) {
                    final String name = xmlPullParser.getName();
                    final d d = arrayDeque.peek();
                    int n5 = 0;
                    int k = 0;
                    Label_0272: {
                        f e;
                        int n3;
                        if ("path".equals(name)) {
                            e = new c();
                            ((c)e).k(resources, set, resources$Theme, xmlPullParser);
                            d.b.add(e);
                            if (e.getPathName() != null) {
                                b.p.put(e.getPathName(), e);
                            }
                            n3 = 0;
                        }
                        else if ("clip-path".equals(name)) {
                            final b e2 = new b();
                            e2.i(resources, set, resources$Theme, xmlPullParser);
                            d.b.add(e2);
                            e = e2;
                            n3 = n2;
                            if (((f)e2).getPathName() != null) {
                                b.p.put(((f)e2).getPathName(), e2);
                                n3 = n2;
                                e = e2;
                            }
                        }
                        else {
                            n4 = n2;
                            if ("group".equals(name)) {
                                final d d2 = new d();
                                d2.c(resources, set, resources$Theme, xmlPullParser);
                                d.b.add(d2);
                                arrayDeque.push(d2);
                                if (d2.getGroupName() != null) {
                                    b.p.put(d2.getGroupName(), d2);
                                }
                                n5 = h.a;
                                k = d2.k;
                                break Label_0272;
                            }
                            break Label_0419;
                        }
                        n5 = h.a;
                        final int d3 = e.d;
                        n2 = n3;
                        k = d3;
                    }
                    h.a = (k | n5);
                    n4 = n2;
                }
                else {
                    n4 = n2;
                    if (n == 3) {
                        n4 = n2;
                        if ("group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                            n4 = n2;
                        }
                    }
                }
            }
            n = xmlPullParser.next();
            n2 = n4;
        }
        if (n2 == 0) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }
    
    private boolean j() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b2;
        final boolean b = b2 = false;
        if (sdk_INT >= 17) {
            b2 = b;
            if (this.isAutoMirrored()) {
                b2 = b;
                if (androidx.core.graphics.drawable.c.f(this) == 1) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    private static PorterDuff$Mode k(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
    
    private void l(final d d, final int n) {
        final int n2 = 0;
        String string = "";
        for (int i = 0; i < n; ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("    ");
            string = sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("current group is :");
        sb2.append(d.getGroupName());
        sb2.append(" rotation is ");
        sb2.append(d.c);
        Log.v("VectorDrawableCompat", sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append("matrix is :");
        sb3.append(d.getLocalMatrix().toString());
        Log.v("VectorDrawableCompat", sb3.toString());
        for (int j = n2; j < d.b.size(); ++j) {
            final e e = d.b.get(j);
            if (e instanceof d) {
                this.l((d)e, n + 1);
            }
            else {
                ((f)e).g(n + 1);
            }
        }
    }
    
    private void n(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) throws XmlPullParserException {
        final h h = this.H;
        final g b = h.b;
        h.d = k(i.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff$Mode.SRC_IN);
        final ColorStateList g = i.g(typedArray, xmlPullParser, resources$Theme, "tint", 1);
        if (g != null) {
            h.c = g;
        }
        h.e = i.e(typedArray, xmlPullParser, "autoMirrored", 5, h.e);
        b.k = i.j(typedArray, xmlPullParser, "viewportWidth", 7, b.k);
        final float j = i.j(typedArray, xmlPullParser, "viewportHeight", 8, b.l);
        b.l = j;
        if (b.k <= 0.0f) {
            final StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        }
        if (j <= 0.0f) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(typedArray.getPositionDescription());
            sb2.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb2.toString());
        }
        b.i = typedArray.getDimension(3, b.i);
        final float dimension = typedArray.getDimension(2, b.j);
        b.j = dimension;
        if (b.i <= 0.0f) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(typedArray.getPositionDescription());
            sb3.append("<vector> tag requires width > 0");
            throw new XmlPullParserException(sb3.toString());
        }
        if (dimension > 0.0f) {
            b.setAlpha(i.j(typedArray, xmlPullParser, "alpha", 4, b.getAlpha()));
            final String string = typedArray.getString(0);
            if (string != null) {
                b.n = string;
                b.p.put(string, b);
            }
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(typedArray.getPositionDescription());
        sb4.append("<vector> tag requires height > 0");
        throw new XmlPullParserException(sb4.toString());
    }
    
    public boolean canApplyTheme() {
        final Drawable g = super.G;
        if (g != null) {
            androidx.core.graphics.drawable.c.b(g);
        }
        return false;
    }
    
    public void draw(final Canvas canvas) {
        final Drawable g = super.G;
        if (g != null) {
            g.draw(canvas);
            return;
        }
        this.copyBounds(this.P);
        if (this.P.width() > 0) {
            if (this.P.height() > 0) {
                Object o;
                if ((o = this.J) == null) {
                    o = this.I;
                }
                canvas.getMatrix(this.O);
                this.O.getValues(this.N);
                float abs = Math.abs(this.N[0]);
                float abs2 = Math.abs(this.N[4]);
                final float abs3 = Math.abs(this.N[1]);
                final float abs4 = Math.abs(this.N[3]);
                if (abs3 != 0.0f || abs4 != 0.0f) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                final int b = (int)(this.P.width() * abs);
                final int b2 = (int)(this.P.height() * abs2);
                final int min = Math.min(2048, b);
                final int min2 = Math.min(2048, b2);
                if (min > 0) {
                    if (min2 > 0) {
                        final int save = canvas.save();
                        final Rect p = this.P;
                        canvas.translate((float)p.left, (float)p.top);
                        if (this.j()) {
                            canvas.translate((float)this.P.width(), 0.0f);
                            canvas.scale(-1.0f, 1.0f);
                        }
                        this.P.offsetTo(0, 0);
                        this.H.c(min, min2);
                        if (!this.L) {
                            this.H.j(min, min2);
                        }
                        else if (!this.H.b()) {
                            this.H.j(min, min2);
                            this.H.i();
                        }
                        this.H.d(canvas, (ColorFilter)o, this.P);
                        canvas.restoreToCount(save);
                    }
                }
            }
        }
    }
    
    @t0({ t0.a.I })
    public float g() {
        final h h = this.H;
        if (h != null) {
            final g b = h.b;
            if (b != null) {
                final float i = b.i;
                if (i != 0.0f) {
                    final float j = b.j;
                    if (j != 0.0f) {
                        final float l = b.l;
                        if (l != 0.0f) {
                            final float k = b.k;
                            if (k != 0.0f) {
                                return Math.min(k / i, l / j);
                            }
                        }
                    }
                }
            }
        }
        return 1.0f;
    }
    
    public int getAlpha() {
        final Drawable g = super.G;
        if (g != null) {
            return androidx.core.graphics.drawable.c.d(g);
        }
        return this.H.b.getRootAlpha();
    }
    
    public int getChangingConfigurations() {
        final Drawable g = super.G;
        if (g != null) {
            return g.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.H.getChangingConfigurations();
    }
    
    public ColorFilter getColorFilter() {
        final Drawable g = super.G;
        if (g != null) {
            return androidx.core.graphics.drawable.c.e(g);
        }
        return this.J;
    }
    
    public Drawable$ConstantState getConstantState() {
        if (super.G != null && Build$VERSION.SDK_INT >= 24) {
            return new i(super.G.getConstantState());
        }
        this.H.a = this.getChangingConfigurations();
        return this.H;
    }
    
    public int getIntrinsicHeight() {
        final Drawable g = super.G;
        if (g != null) {
            return g.getIntrinsicHeight();
        }
        return (int)this.H.b.j;
    }
    
    public int getIntrinsicWidth() {
        final Drawable g = super.G;
        if (g != null) {
            return g.getIntrinsicWidth();
        }
        return (int)this.H.b.i;
    }
    
    public int getOpacity() {
        final Drawable g = super.G;
        if (g != null) {
            return g.getOpacity();
        }
        return -3;
    }
    
    Object h(final String s) {
        return this.H.b.p.get(s);
    }
    
    public void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) throws XmlPullParserException, IOException {
        final Drawable g = super.G;
        if (g != null) {
            g.inflate(resources, xmlPullParser, set);
            return;
        }
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final Drawable g = super.G;
        if (g != null) {
            androidx.core.graphics.drawable.c.g(g, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        final h h = this.H;
        h.b = new g();
        final TypedArray s = i.s(resources, resources$Theme, set, a.a);
        this.n(s, xmlPullParser, resources$Theme);
        s.recycle();
        h.a = this.getChangingConfigurations();
        h.l = true;
        this.i(resources, xmlPullParser, set, resources$Theme);
        this.I = this.o(this.I, h.c, h.d);
    }
    
    public void invalidateSelf() {
        final Drawable g = super.G;
        if (g != null) {
            g.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }
    
    public boolean isAutoMirrored() {
        final Drawable g = super.G;
        if (g != null) {
            return androidx.core.graphics.drawable.c.h(g);
        }
        return this.H.e;
    }
    
    public boolean isStateful() {
        final Drawable g = super.G;
        if (g != null) {
            return g.isStateful();
        }
        if (!super.isStateful()) {
            final h h = this.H;
            if (h != null) {
                if (h.g()) {
                    return true;
                }
                final ColorStateList c = this.H.c;
                if (c != null && c.isStateful()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    void m(final boolean l) {
        this.L = l;
    }
    
    public Drawable mutate() {
        final Drawable g = super.G;
        if (g != null) {
            g.mutate();
            return this;
        }
        if (!this.K && super.mutate() == this) {
            this.H = new h(this.H);
            this.K = true;
        }
        return this;
    }
    
    PorterDuffColorFilter o(final PorterDuffColorFilter porterDuffColorFilter, final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
    
    @Override
    protected void onBoundsChange(final Rect bounds) {
        final Drawable g = super.G;
        if (g != null) {
            g.setBounds(bounds);
        }
    }
    
    protected boolean onStateChange(final int[] state) {
        final Drawable g = super.G;
        if (g != null) {
            return g.setState(state);
        }
        final boolean b = false;
        final h h = this.H;
        final ColorStateList c = h.c;
        final boolean b2 = true;
        boolean b3 = b;
        if (c != null) {
            final PorterDuff$Mode d = h.d;
            b3 = b;
            if (d != null) {
                this.I = this.o(this.I, c, d);
                this.invalidateSelf();
                b3 = true;
            }
        }
        if (h.g() && h.h(state)) {
            this.invalidateSelf();
            b3 = b2;
        }
        return b3;
    }
    
    public void scheduleSelf(final Runnable runnable, final long n) {
        final Drawable g = super.G;
        if (g != null) {
            g.scheduleSelf(runnable, n);
            return;
        }
        super.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int n) {
        final Drawable g = super.G;
        if (g != null) {
            g.setAlpha(n);
            return;
        }
        if (this.H.b.getRootAlpha() != n) {
            this.H.b.setRootAlpha(n);
            this.invalidateSelf();
        }
    }
    
    public void setAutoMirrored(final boolean e) {
        final Drawable g = super.G;
        if (g != null) {
            androidx.core.graphics.drawable.c.j(g, e);
            return;
        }
        this.H.e = e;
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        final Drawable g = super.G;
        if (g != null) {
            g.setColorFilter(colorFilter);
            return;
        }
        this.J = colorFilter;
        this.invalidateSelf();
    }
    
    public void setTint(final int n) {
        final Drawable g = super.G;
        if (g != null) {
            androidx.core.graphics.drawable.c.n(g, n);
            return;
        }
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public void setTintList(final ColorStateList c) {
        final Drawable g = super.G;
        if (g != null) {
            c.o(g, c);
            return;
        }
        final h h = this.H;
        if (h.c != c) {
            h.c = c;
            this.I = this.o(this.I, c, h.d);
            this.invalidateSelf();
        }
    }
    
    public void setTintMode(final PorterDuff$Mode d) {
        final Drawable g = super.G;
        if (g != null) {
            androidx.core.graphics.drawable.c.p(g, d);
            return;
        }
        final h h = this.H;
        if (h.d != d) {
            h.d = d;
            this.I = this.o(this.I, h.c, d);
            this.invalidateSelf();
        }
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final Drawable g = super.G;
        if (g != null) {
            return g.setVisible(b, b2);
        }
        return super.setVisible(b, b2);
    }
    
    public void unscheduleSelf(final Runnable runnable) {
        final Drawable g = super.G;
        if (g != null) {
            g.unscheduleSelf(runnable);
            return;
        }
        super.unscheduleSelf(runnable);
    }
    
    private static class b extends f
    {
        b() {
        }
        
        b(final b b) {
            super((f)b);
        }
        
        private void j(final TypedArray typedArray, final XmlPullParser xmlPullParser) {
            final String string = typedArray.getString(0);
            if (string != null) {
                super.b = string;
            }
            final String string2 = typedArray.getString(1);
            if (string2 != null) {
                super.a = o.d(string2);
            }
            super.c = i.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }
        
        @Override
        public boolean e() {
            return true;
        }
        
        public void i(final Resources resources, final AttributeSet set, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser) {
            if (!i.r(xmlPullParser, "pathData")) {
                return;
            }
            final TypedArray s = i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.I);
            this.j(s, xmlPullParser);
            s.recycle();
        }
    }
    
    private static class c extends f
    {
        private int[] f;
        androidx.core.content.res.b g;
        float h;
        androidx.core.content.res.b i;
        float j;
        float k;
        float l;
        float m;
        float n;
        Paint$Cap o;
        Paint$Join p;
        float q;
        
        c() {
            this.h = 0.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = 1.0f;
            this.n = 0.0f;
            this.o = Paint$Cap.BUTT;
            this.p = Paint$Join.MITER;
            this.q = 4.0f;
        }
        
        c(final c c) {
            super((f)c);
            this.h = 0.0f;
            this.j = 1.0f;
            this.k = 1.0f;
            this.l = 0.0f;
            this.m = 1.0f;
            this.n = 0.0f;
            this.o = Paint$Cap.BUTT;
            this.p = Paint$Join.MITER;
            this.q = 4.0f;
            this.f = c.f;
            this.g = c.g;
            this.h = c.h;
            this.j = c.j;
            this.i = c.i;
            super.c = c.c;
            this.k = c.k;
            this.l = c.l;
            this.m = c.m;
            this.n = c.n;
            this.o = c.o;
            this.p = c.p;
            this.q = c.q;
        }
        
        private Paint$Cap i(final int n, final Paint$Cap paint$Cap) {
            if (n == 0) {
                return Paint$Cap.BUTT;
            }
            if (n == 1) {
                return Paint$Cap.ROUND;
            }
            if (n != 2) {
                return paint$Cap;
            }
            return Paint$Cap.SQUARE;
        }
        
        private Paint$Join j(final int n, final Paint$Join paint$Join) {
            if (n == 0) {
                return Paint$Join.MITER;
            }
            if (n == 1) {
                return Paint$Join.ROUND;
            }
            if (n != 2) {
                return paint$Join;
            }
            return Paint$Join.BEVEL;
        }
        
        private void l(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
            this.f = null;
            if (!androidx.core.content.res.i.r(xmlPullParser, "pathData")) {
                return;
            }
            final String string = typedArray.getString(0);
            if (string != null) {
                super.b = string;
            }
            final String string2 = typedArray.getString(2);
            if (string2 != null) {
                super.a = androidx.core.graphics.o.d(string2);
            }
            this.i = androidx.core.content.res.i.i(typedArray, xmlPullParser, resources$Theme, "fillColor", 1, 0);
            this.k = androidx.core.content.res.i.j(typedArray, xmlPullParser, "fillAlpha", 12, this.k);
            this.o = this.i(androidx.core.content.res.i.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.o);
            this.p = this.j(androidx.core.content.res.i.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.p);
            this.q = androidx.core.content.res.i.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.q);
            this.g = androidx.core.content.res.i.i(typedArray, xmlPullParser, resources$Theme, "strokeColor", 3, 0);
            this.j = androidx.core.content.res.i.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.j);
            this.h = androidx.core.content.res.i.j(typedArray, xmlPullParser, "strokeWidth", 4, this.h);
            this.m = androidx.core.content.res.i.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.m);
            this.n = androidx.core.content.res.i.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.n);
            this.l = androidx.core.content.res.i.j(typedArray, xmlPullParser, "trimPathStart", 5, this.l);
            super.c = androidx.core.content.res.i.k(typedArray, xmlPullParser, "fillType", 13, super.c);
        }
        
        @Override
        public boolean a() {
            return this.i.i() || this.g.i();
        }
        
        @Override
        public boolean b(final int[] array) {
            return this.g.j(array) | this.i.j(array);
        }
        
        @Override
        public void c(final Resources$Theme resources$Theme) {
        }
        
        @Override
        public boolean d() {
            return this.f != null;
        }
        
        float getFillAlpha() {
            return this.k;
        }
        
        @l
        int getFillColor() {
            return this.i.e();
        }
        
        float getStrokeAlpha() {
            return this.j;
        }
        
        @l
        int getStrokeColor() {
            return this.g.e();
        }
        
        float getStrokeWidth() {
            return this.h;
        }
        
        float getTrimPathEnd() {
            return this.m;
        }
        
        float getTrimPathOffset() {
            return this.n;
        }
        
        float getTrimPathStart() {
            return this.l;
        }
        
        public void k(final Resources resources, final AttributeSet set, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser) {
            final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.t);
            this.l(s, xmlPullParser, resources$Theme);
            s.recycle();
        }
        
        void setFillAlpha(final float k) {
            this.k = k;
        }
        
        void setFillColor(final int n) {
            this.i.k(n);
        }
        
        void setStrokeAlpha(final float j) {
            this.j = j;
        }
        
        void setStrokeColor(final int n) {
            this.g.k(n);
        }
        
        void setStrokeWidth(final float h) {
            this.h = h;
        }
        
        void setTrimPathEnd(final float m) {
            this.m = m;
        }
        
        void setTrimPathOffset(final float n) {
            this.n = n;
        }
        
        void setTrimPathStart(final float l) {
            this.l = l;
        }
    }
    
    private static class d extends e
    {
        final Matrix a;
        final ArrayList<e> b;
        float c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private float i;
        final Matrix j;
        int k;
        private int[] l;
        private String m;
        
        public d() {
            this.a = new Matrix();
            this.b = new ArrayList<e>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }
        
        public d(d d, final androidx.collection.a<String, Object> a) {
            this.a = new Matrix();
            this.b = new ArrayList<e>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            final Matrix j = new Matrix();
            this.j = j;
            this.m = null;
            this.c = d.c;
            this.d = d.d;
            this.e = d.e;
            this.f = d.f;
            this.g = d.g;
            this.h = d.h;
            this.i = d.i;
            this.l = d.l;
            final String m = d.m;
            this.m = m;
            this.k = d.k;
            if (m != null) {
                a.put(m, this);
            }
            j.set(d.j);
            final ArrayList<e> b = d.b;
            for (int i = 0; i < b.size(); ++i) {
                final d value = b.get(i);
                if (value instanceof d) {
                    d = value;
                    this.b.add(new d(d, a));
                }
                else {
                    f e;
                    if (value instanceof c) {
                        e = new c((c)value);
                    }
                    else {
                        if (!(value instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        e = new b((b)value);
                    }
                    this.b.add(e);
                    final String b2 = e.b;
                    if (b2 != null) {
                        a.put(b2, e);
                    }
                }
            }
        }
        
        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }
        
        private void e(final TypedArray typedArray, final XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = androidx.core.content.res.i.j(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = androidx.core.content.res.i.j(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = androidx.core.content.res.i.j(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = androidx.core.content.res.i.j(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = androidx.core.content.res.i.j(typedArray, xmlPullParser, "translateY", 7, this.i);
            final String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            this.d();
        }
        
        @Override
        public boolean a() {
            for (int i = 0; i < this.b.size(); ++i) {
                if (this.b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public boolean b(final int[] array) {
            int i = 0;
            boolean b = false;
            while (i < this.b.size()) {
                b |= this.b.get(i).b(array);
                ++i;
            }
            return b;
        }
        
        public void c(final Resources resources, final AttributeSet set, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser) {
            final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.k);
            this.e(s, xmlPullParser);
            s.recycle();
        }
        
        public String getGroupName() {
            return this.m;
        }
        
        public Matrix getLocalMatrix() {
            return this.j;
        }
        
        public float getPivotX() {
            return this.d;
        }
        
        public float getPivotY() {
            return this.e;
        }
        
        public float getRotation() {
            return this.c;
        }
        
        public float getScaleX() {
            return this.f;
        }
        
        public float getScaleY() {
            return this.g;
        }
        
        public float getTranslateX() {
            return this.h;
        }
        
        public float getTranslateY() {
            return this.i;
        }
        
        public void setPivotX(final float d) {
            if (d != this.d) {
                this.d = d;
                this.d();
            }
        }
        
        public void setPivotY(final float e) {
            if (e != this.e) {
                this.e = e;
                this.d();
            }
        }
        
        public void setRotation(final float c) {
            if (c != this.c) {
                this.c = c;
                this.d();
            }
        }
        
        public void setScaleX(final float f) {
            if (f != this.f) {
                this.f = f;
                this.d();
            }
        }
        
        public void setScaleY(final float g) {
            if (g != this.g) {
                this.g = g;
                this.d();
            }
        }
        
        public void setTranslateX(final float h) {
            if (h != this.h) {
                this.h = h;
                this.d();
            }
        }
        
        public void setTranslateY(final float i) {
            if (i != this.i) {
                this.i = i;
                this.d();
            }
        }
    }
    
    private abstract static class e
    {
        public boolean a() {
            return false;
        }
        
        public boolean b(final int[] array) {
            return false;
        }
    }
    
    private abstract static class f extends e
    {
        protected static final int e = 0;
        protected o.b[] a;
        String b;
        int c;
        int d;
        
        public f() {
            this.a = null;
            this.c = 0;
        }
        
        public f(final f f) {
            this.a = null;
            this.c = 0;
            this.b = f.b;
            this.d = f.d;
            this.a = o.f(f.a);
        }
        
        public void c(final Resources$Theme resources$Theme) {
        }
        
        public boolean d() {
            return false;
        }
        
        public boolean e() {
            return false;
        }
        
        public String f(final o.b[] array) {
            String s = " ";
            for (int i = 0; i < array.length; ++i) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(array[i].a);
                sb.append(":");
                s = sb.toString();
                final float[] b = array[i].b;
                for (int j = 0; j < b.length; ++j) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s);
                    sb2.append(b[j]);
                    sb2.append(",");
                    s = sb2.toString();
                }
            }
            return s;
        }
        
        public void g(final int n) {
            String string = "";
            for (int i = 0; i < n; ++i) {
                final StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append("    ");
                string = sb.toString();
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("current path is :");
            sb2.append(this.b);
            sb2.append(" pathData is ");
            sb2.append(this.f(this.a));
            Log.v("VectorDrawableCompat", sb2.toString());
        }
        
        public o.b[] getPathData() {
            return this.a;
        }
        
        public String getPathName() {
            return this.b;
        }
        
        public void h(final Path path) {
            path.reset();
            final o.b[] a = this.a;
            if (a != null) {
                o.b.e(a, path);
            }
        }
        
        public void setPathData(final o.b[] array) {
            if (!o.b(this.a, array)) {
                this.a = o.f(array);
            }
            else {
                o.k(this.a, array);
            }
        }
    }
    
    private static class g
    {
        private static final Matrix q;
        private final Path a;
        private final Path b;
        private final Matrix c;
        Paint d;
        Paint e;
        private PathMeasure f;
        private int g;
        final d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final androidx.collection.a<String, Object> p;
        
        static {
            q = new Matrix();
        }
        
        public g() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new androidx.collection.a<String, Object>();
            this.h = new d();
            this.a = new Path();
            this.b = new Path();
        }
        
        public g(final g g) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            final androidx.collection.a<String, g> p = new androidx.collection.a<String, g>();
            this.p = (androidx.collection.a<String, Object>)p;
            this.h = new d(g.h, (androidx.collection.a<String, Object>)p);
            this.a = new Path(g.a);
            this.b = new Path(g.b);
            this.i = g.i;
            this.j = g.j;
            this.k = g.k;
            this.l = g.l;
            this.g = g.g;
            this.m = g.m;
            this.n = g.n;
            final String n = g.n;
            if (n != null) {
                p.put(n, this);
            }
            this.o = g.o;
        }
        
        private static float a(final float n, final float n2, final float n3, final float n4) {
            return n * n4 - n2 * n3;
        }
        
        private void c(final d d, final Matrix matrix, final Canvas canvas, final int n, final int n2, final ColorFilter colorFilter) {
            d.a.set(matrix);
            d.a.preConcat(d.j);
            canvas.save();
            for (int i = 0; i < d.b.size(); ++i) {
                final e e = d.b.get(i);
                if (e instanceof d) {
                    this.c((d)e, d.a, canvas, n, n2, colorFilter);
                }
                else if (e instanceof f) {
                    this.d(d, (f)e, canvas, n, n2, colorFilter);
                }
            }
            canvas.restore();
        }
        
        private void d(final d d, final f f, final Canvas canvas, final int n, final int n2, final ColorFilter colorFilter) {
            final float a = n / this.k;
            final float b = n2 / this.l;
            final float min = Math.min(a, b);
            final Matrix a2 = d.a;
            this.c.set(a2);
            this.c.postScale(a, b);
            final float e = this.e(a2);
            if (e == 0.0f) {
                return;
            }
            f.h(this.a);
            final Path a3 = this.a;
            this.b.reset();
            if (f.e()) {
                final Path b2 = this.b;
                Path$FillType fillType;
                if (f.c == 0) {
                    fillType = Path$FillType.WINDING;
                }
                else {
                    fillType = Path$FillType.EVEN_ODD;
                }
                b2.setFillType(fillType);
                this.b.addPath(a3, this.c);
                canvas.clipPath(this.b);
            }
            else {
                final c c = (c)f;
                final float l = c.l;
                if (l != 0.0f || c.m != 1.0f) {
                    final float n3 = c.n;
                    final float m = c.m;
                    if (this.f == null) {
                        this.f = new PathMeasure();
                    }
                    this.f.setPath(this.a, false);
                    final float length = this.f.getLength();
                    final float n4 = (l + n3) % 1.0f * length;
                    final float n5 = (m + n3) % 1.0f * length;
                    a3.reset();
                    if (n4 > n5) {
                        this.f.getSegment(n4, length, a3, true);
                        this.f.getSegment(0.0f, n5, a3, true);
                    }
                    else {
                        this.f.getSegment(n4, n5, a3, true);
                    }
                    a3.rLineTo(0.0f, 0.0f);
                }
                this.b.addPath(a3, this.c);
                if (c.i.l()) {
                    final androidx.core.content.res.b i = c.i;
                    if (this.e == null) {
                        (this.e = new Paint(1)).setStyle(Paint$Style.FILL);
                    }
                    final Paint e2 = this.e;
                    if (i.h()) {
                        final Shader f2 = i.f();
                        f2.setLocalMatrix(this.c);
                        e2.setShader(f2);
                        e2.setAlpha(Math.round(c.k * 255.0f));
                    }
                    else {
                        e2.setShader((Shader)null);
                        e2.setAlpha(255);
                        e2.setColor(androidx.vectordrawable.graphics.drawable.i.a(i.e(), c.k));
                    }
                    e2.setColorFilter(colorFilter);
                    final Path b3 = this.b;
                    Path$FillType fillType2;
                    if (c.c == 0) {
                        fillType2 = Path$FillType.WINDING;
                    }
                    else {
                        fillType2 = Path$FillType.EVEN_ODD;
                    }
                    b3.setFillType(fillType2);
                    canvas.drawPath(this.b, e2);
                }
                if (c.g.l()) {
                    final androidx.core.content.res.b g = c.g;
                    if (this.d == null) {
                        (this.d = new Paint(1)).setStyle(Paint$Style.STROKE);
                    }
                    final Paint d2 = this.d;
                    final Paint$Join p6 = c.p;
                    if (p6 != null) {
                        d2.setStrokeJoin(p6);
                    }
                    final Paint$Cap o = c.o;
                    if (o != null) {
                        d2.setStrokeCap(o);
                    }
                    d2.setStrokeMiter(c.q);
                    if (g.h()) {
                        final Shader f3 = g.f();
                        f3.setLocalMatrix(this.c);
                        d2.setShader(f3);
                        d2.setAlpha(Math.round(c.j * 255.0f));
                    }
                    else {
                        d2.setShader((Shader)null);
                        d2.setAlpha(255);
                        d2.setColor(androidx.vectordrawable.graphics.drawable.i.a(g.e(), c.j));
                    }
                    d2.setColorFilter(colorFilter);
                    d2.setStrokeWidth(c.h * (min * e));
                    canvas.drawPath(this.b, d2);
                }
            }
        }
        
        private float e(final Matrix matrix) {
            final float[] array2;
            final float[] array = array2 = new float[4];
            array2[0] = 0.0f;
            array2[2] = (array2[1] = 1.0f);
            array2[3] = 0.0f;
            matrix.mapVectors(array);
            final float a = (float)Math.hypot(array[0], array[1]);
            final float b = (float)Math.hypot(array[2], array[3]);
            final float a2 = a(array[0], array[1], array[2], array[3]);
            final float max = Math.max(a, b);
            float n = 0.0f;
            if (max > 0.0f) {
                n = Math.abs(a2) / max;
            }
            return n;
        }
        
        public void b(final Canvas canvas, final int n, final int n2, final ColorFilter colorFilter) {
            this.c(this.h, androidx.vectordrawable.graphics.drawable.i.g.q, canvas, n, n2, colorFilter);
        }
        
        public boolean f() {
            if (this.o == null) {
                this.o = this.h.a();
            }
            return this.o;
        }
        
        public boolean g(final int[] array) {
            return this.h.b(array);
        }
        
        public float getAlpha() {
            return this.getRootAlpha() / 255.0f;
        }
        
        public int getRootAlpha() {
            return this.m;
        }
        
        public void setAlpha(final float n) {
            this.setRootAlpha((int)(n * 255.0f));
        }
        
        public void setRootAlpha(final int m) {
            this.m = m;
        }
    }
    
    private static class h extends Drawable$ConstantState
    {
        int a;
        g b;
        ColorStateList c;
        PorterDuff$Mode d;
        boolean e;
        Bitmap f;
        int[] g;
        ColorStateList h;
        PorterDuff$Mode i;
        int j;
        boolean k;
        boolean l;
        Paint m;
        
        public h() {
            this.c = null;
            this.d = i.R;
            this.b = new g();
        }
        
        public h(final h h) {
            this.c = null;
            this.d = i.R;
            if (h != null) {
                this.a = h.a;
                final g b = new g(h.b);
                this.b = b;
                if (h.b.e != null) {
                    b.e = new Paint(h.b.e);
                }
                if (h.b.d != null) {
                    this.b.d = new Paint(h.b.d);
                }
                this.c = h.c;
                this.d = h.d;
                this.e = h.e;
            }
        }
        
        public boolean a(final int n, final int n2) {
            return n == this.f.getWidth() && n2 == this.f.getHeight();
        }
        
        public boolean b() {
            return !this.l && this.h == this.c && this.i == this.d && this.k == this.e && this.j == this.b.getRootAlpha();
        }
        
        public void c(final int n, final int n2) {
            if (this.f == null || !this.a(n, n2)) {
                this.f = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
                this.l = true;
            }
        }
        
        public void d(final Canvas canvas, final ColorFilter colorFilter, final Rect rect) {
            canvas.drawBitmap(this.f, (Rect)null, rect, this.e(colorFilter));
        }
        
        public Paint e(final ColorFilter colorFilter) {
            if (!this.f() && colorFilter == null) {
                return null;
            }
            if (this.m == null) {
                (this.m = new Paint()).setFilterBitmap(true);
            }
            this.m.setAlpha(this.b.getRootAlpha());
            this.m.setColorFilter(colorFilter);
            return this.m;
        }
        
        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }
        
        public boolean g() {
            return this.b.f();
        }
        
        public int getChangingConfigurations() {
            return this.a;
        }
        
        public boolean h(final int[] array) {
            final boolean g = this.b.g(array);
            this.l |= g;
            return g;
        }
        
        public void i() {
            this.h = this.c;
            this.i = this.d;
            this.j = this.b.getRootAlpha();
            this.k = this.e;
            this.l = false;
        }
        
        public void j(final int n, final int n2) {
            this.f.eraseColor(0);
            this.b.b(new Canvas(this.f), n, n2, null);
        }
        
        @j0
        public Drawable newDrawable() {
            return new i(this);
        }
        
        @j0
        public Drawable newDrawable(final Resources resources) {
            return new i(this);
        }
    }
    
    @p0(24)
    private static class i extends Drawable$ConstantState
    {
        private final Drawable$ConstantState a;
        
        public i(final Drawable$ConstantState a) {
            this.a = a;
        }
        
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }
        
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }
        
        public Drawable newDrawable() {
            final androidx.vectordrawable.graphics.drawable.i i = new androidx.vectordrawable.graphics.drawable.i();
            i.G = this.a.newDrawable();
            return i;
        }
        
        public Drawable newDrawable(final Resources resources) {
            final androidx.vectordrawable.graphics.drawable.i i = new androidx.vectordrawable.graphics.drawable.i();
            i.G = this.a.newDrawable(resources);
            return i;
        }
        
        public Drawable newDrawable(final Resources resources, final Resources$Theme resources$Theme) {
            final androidx.vectordrawable.graphics.drawable.i i = new androidx.vectordrawable.graphics.drawable.i();
            i.G = this.a.newDrawable(resources, resources$Theme);
            return i;
        }
    }
}
