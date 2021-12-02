// 
// Decompiled by Procyon v0.5.36
// 

package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import android.graphics.Region;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import java.util.Collection;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import androidx.collection.a;
import android.animation.Animator;
import androidx.annotation.p0;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.util.Log;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import androidx.core.content.res.g;
import androidx.annotation.s;
import androidx.annotation.j0;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build$VERSION;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$Callback;
import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import android.animation.ArgbEvaluator;
import android.content.Context;

public class c extends h implements b
{
    private static final String O = "AnimatedVDCompat";
    private static final String P = "animated-vector";
    private static final String Q = "target";
    private static final boolean R = false;
    private c H;
    private Context I;
    private ArgbEvaluator J;
    d K;
    private Animator$AnimatorListener L;
    ArrayList<a> M;
    final Drawable$Callback N;
    
    c() {
        this(null, null, null);
    }
    
    private c(@k0 final Context context) {
        this(context, null, null);
    }
    
    private c(@k0 final Context i, @k0 final c h, @k0 final Resources resources) {
        this.J = null;
        this.L = null;
        this.M = null;
        final Drawable$Callback n = (Drawable$Callback)new Drawable$Callback() {
            public void invalidateDrawable(final Drawable drawable) {
                c.this.invalidateSelf();
            }
            
            public void scheduleDrawable(final Drawable drawable, final Runnable runnable, final long n) {
                c.this.scheduleSelf(runnable, n);
            }
            
            public void unscheduleDrawable(final Drawable drawable, final Runnable runnable) {
                c.this.unscheduleSelf(runnable);
            }
        };
        this.N = (Drawable$Callback)n;
        this.I = i;
        if (h != null) {
            this.H = h;
        }
        else {
            this.H = new c(i, h, (Drawable$Callback)n, resources);
        }
    }
    
    public static void a(final Drawable drawable) {
        if (!(drawable instanceof Animatable)) {
            return;
        }
        if (Build$VERSION.SDK_INT >= 24) {
            ((AnimatedVectorDrawable)drawable).clearAnimationCallbacks();
        }
        else {
            ((c)drawable).c();
        }
    }
    
    @k0
    public static c e(@j0 Context ex, @s int next) {
        if (Build$VERSION.SDK_INT >= 24) {
            final c c = new c((Context)ex);
            (c.G = g.f(((Context)ex).getResources(), next, ((Context)ex).getTheme())).setCallback(c.N);
            c.K = new d(c.G.getConstantState());
            return c;
        }
        final Resources resources = ((Context)ex).getResources();
        try {
            final XmlResourceParser xml = resources.getXml(next);
            final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
            do {
                next = ((XmlPullParser)xml).next();
            } while (next != 2 && next != 1);
            if (next == 2) {
                return f((Context)ex, ((Context)ex).getResources(), (XmlPullParser)xml, attributeSet, ((Context)ex).getTheme());
            }
            ex = (IOException)new XmlPullParserException("No start tag found");
            throw ex;
        }
        catch (IOException ex) {}
        catch (XmlPullParserException ex2) {}
        Log.e("AnimatedVDCompat", "parser error", (Throwable)ex);
        return null;
    }
    
    public static c f(final Context context, final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final c c = new c(context);
        c.inflate(resources, xmlPullParser, set, resources$Theme);
        return c;
    }
    
    public static void g(final Drawable drawable, final a a) {
        if (drawable != null) {
            if (a != null) {
                if (!(drawable instanceof Animatable)) {
                    return;
                }
                if (Build$VERSION.SDK_INT >= 24) {
                    h((AnimatedVectorDrawable)drawable, a);
                }
                else {
                    ((c)drawable).b(a);
                }
            }
        }
    }
    
    @p0(23)
    private static void h(@j0 final AnimatedVectorDrawable animatedVectorDrawable, @j0 final a a) {
        animatedVectorDrawable.registerAnimationCallback(a.a());
    }
    
    private void i() {
        final Animator$AnimatorListener l = this.L;
        if (l != null) {
            this.H.c.removeListener(l);
            this.L = null;
        }
    }
    
    private void j(final String s, final Animator e) {
        e.setTarget(this.H.b.h(s));
        if (Build$VERSION.SDK_INT < 21) {
            this.k(e);
        }
        final c h = this.H;
        if (h.d == null) {
            h.d = new ArrayList<Animator>();
            this.H.e = new androidx.collection.a<Animator, String>();
        }
        this.H.d.add(e);
        this.H.e.put(e, s);
    }
    
    private void k(final Animator animator) {
        if (animator instanceof AnimatorSet) {
            final ArrayList childAnimations = ((AnimatorSet)animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); ++i) {
                    this.k((Animator)childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            final ObjectAnimator objectAnimator = (ObjectAnimator)animator;
            final String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.J == null) {
                    this.J = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator((TypeEvaluator)this.J);
            }
        }
    }
    
    public static boolean l(final Drawable drawable, final a a) {
        if (drawable == null || a == null) {
            return false;
        }
        if (!(drawable instanceof Animatable)) {
            return false;
        }
        if (Build$VERSION.SDK_INT >= 24) {
            return m((AnimatedVectorDrawable)drawable, a);
        }
        return ((c)drawable).d(a);
    }
    
    @p0(23)
    private static boolean m(final AnimatedVectorDrawable animatedVectorDrawable, final a a) {
        return animatedVectorDrawable.unregisterAnimationCallback(a.a());
    }
    
    @Override
    public void applyTheme(final Resources$Theme resources$Theme) {
        final Drawable g = super.G;
        if (g != null) {
            c.a(g, resources$Theme);
        }
    }
    
    @Override
    public void b(@j0 final a a) {
        final Drawable g = super.G;
        if (g != null) {
            h((AnimatedVectorDrawable)g, a);
            return;
        }
        if (a == null) {
            return;
        }
        if (this.M == null) {
            this.M = new ArrayList<a>();
        }
        if (this.M.contains(a)) {
            return;
        }
        this.M.add(a);
        if (this.L == null) {
            this.L = (Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator animator) {
                    final ArrayList<a> list = new ArrayList<a>(c.this.M);
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        list.get(i).b(c.this);
                    }
                }
                
                public void onAnimationStart(final Animator animator) {
                    final ArrayList<a> list = new ArrayList<a>(c.this.M);
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        list.get(i).c(c.this);
                    }
                }
            };
        }
        this.H.c.addListener(this.L);
    }
    
    @Override
    public void c() {
        final Drawable g = super.G;
        if (g != null) {
            ((AnimatedVectorDrawable)g).clearAnimationCallbacks();
            return;
        }
        this.i();
        final ArrayList<a> m = this.M;
        if (m == null) {
            return;
        }
        m.clear();
    }
    
    public boolean canApplyTheme() {
        final Drawable g = super.G;
        return g != null && c.b(g);
    }
    
    @Override
    public boolean d(@j0 final a o) {
        final Drawable g = super.G;
        if (g != null) {
            m((AnimatedVectorDrawable)g, o);
        }
        final ArrayList<a> m = this.M;
        if (m != null && o != null) {
            final boolean remove = m.remove(o);
            if (this.M.size() == 0) {
                this.i();
            }
            return remove;
        }
        return false;
    }
    
    public void draw(final Canvas canvas) {
        final Drawable g = super.G;
        if (g != null) {
            g.draw(canvas);
            return;
        }
        this.H.b.draw(canvas);
        if (this.H.c.isStarted()) {
            this.invalidateSelf();
        }
    }
    
    public int getAlpha() {
        final Drawable g = super.G;
        if (g != null) {
            return c.d(g);
        }
        return this.H.b.getAlpha();
    }
    
    public int getChangingConfigurations() {
        final Drawable g = super.G;
        if (g != null) {
            return g.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.H.a;
    }
    
    public ColorFilter getColorFilter() {
        final Drawable g = super.G;
        if (g != null) {
            return c.e(g);
        }
        return this.H.b.getColorFilter();
    }
    
    public Drawable$ConstantState getConstantState() {
        if (super.G != null && Build$VERSION.SDK_INT >= 24) {
            return new d(super.G.getConstantState());
        }
        return null;
    }
    
    public int getIntrinsicHeight() {
        final Drawable g = super.G;
        if (g != null) {
            return g.getIntrinsicHeight();
        }
        return this.H.b.getIntrinsicHeight();
    }
    
    public int getIntrinsicWidth() {
        final Drawable g = super.G;
        if (g != null) {
            return g.getIntrinsicWidth();
        }
        return this.H.b.getIntrinsicWidth();
    }
    
    public int getOpacity() {
        final Drawable g = super.G;
        if (g != null) {
            return g.getOpacity();
        }
        return this.H.b.getOpacity();
    }
    
    public void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) throws XmlPullParserException, IOException {
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final Drawable g = super.G;
        if (g != null) {
            c.g(g, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        for (int n = xmlPullParser.getEventType(), depth = xmlPullParser.getDepth(); n != 1 && (xmlPullParser.getDepth() >= depth + 1 || n != 3); n = xmlPullParser.next()) {
            if (n == 2) {
                final String name = xmlPullParser.getName();
                TypedArray typedArray;
                if ("animated-vector".equals(name)) {
                    final TypedArray s = androidx.core.content.res.i.s(resources, resources$Theme, set, androidx.vectordrawable.graphics.drawable.a.M);
                    final int resourceId = s.getResourceId(0, 0);
                    typedArray = s;
                    if (resourceId != 0) {
                        final androidx.vectordrawable.graphics.drawable.i e = androidx.vectordrawable.graphics.drawable.i.e(resources, resourceId, resources$Theme);
                        e.m(false);
                        e.setCallback(this.N);
                        final androidx.vectordrawable.graphics.drawable.i b = this.H.b;
                        if (b != null) {
                            b.setCallback((Drawable$Callback)null);
                        }
                        this.H.b = e;
                        typedArray = s;
                    }
                }
                else {
                    if (!"target".equals(name)) {
                        continue;
                    }
                    final TypedArray obtainAttributes = resources.obtainAttributes(set, androidx.vectordrawable.graphics.drawable.a.O);
                    final String string = obtainAttributes.getString(0);
                    final int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    typedArray = obtainAttributes;
                    if (resourceId2 != 0) {
                        final Context i = this.I;
                        if (i == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        this.j(string, e.j(i, resourceId2));
                        typedArray = obtainAttributes;
                    }
                }
                typedArray.recycle();
            }
        }
        this.H.a();
    }
    
    public boolean isAutoMirrored() {
        final Drawable g = super.G;
        if (g != null) {
            return c.h(g);
        }
        return this.H.b.isAutoMirrored();
    }
    
    public boolean isRunning() {
        final Drawable g = super.G;
        if (g != null) {
            return ((AnimatedVectorDrawable)g).isRunning();
        }
        return this.H.c.isRunning();
    }
    
    public boolean isStateful() {
        final Drawable g = super.G;
        if (g != null) {
            return g.isStateful();
        }
        return this.H.b.isStateful();
    }
    
    public Drawable mutate() {
        final Drawable g = super.G;
        if (g != null) {
            g.mutate();
        }
        return this;
    }
    
    @Override
    protected void onBoundsChange(final Rect rect) {
        final Drawable g = super.G;
        if (g != null) {
            g.setBounds(rect);
            return;
        }
        this.H.b.setBounds(rect);
    }
    
    @Override
    protected boolean onLevelChange(final int n) {
        final Drawable g = super.G;
        if (g != null) {
            return g.setLevel(n);
        }
        return this.H.b.setLevel(n);
    }
    
    protected boolean onStateChange(final int[] array) {
        final Drawable g = super.G;
        if (g != null) {
            return g.setState(array);
        }
        return this.H.b.setState(array);
    }
    
    public void setAlpha(final int n) {
        final Drawable g = super.G;
        if (g != null) {
            g.setAlpha(n);
            return;
        }
        this.H.b.setAlpha(n);
    }
    
    public void setAutoMirrored(final boolean autoMirrored) {
        final Drawable g = super.G;
        if (g != null) {
            c.j(g, autoMirrored);
            return;
        }
        this.H.b.setAutoMirrored(autoMirrored);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        final Drawable g = super.G;
        if (g != null) {
            g.setColorFilter(colorFilter);
            return;
        }
        this.H.b.setColorFilter(colorFilter);
    }
    
    public void setTint(final int tint) {
        final Drawable g = super.G;
        if (g != null) {
            c.n(g, tint);
            return;
        }
        this.H.b.setTint(tint);
    }
    
    public void setTintList(final ColorStateList tintList) {
        final Drawable g = super.G;
        if (g != null) {
            c.o(g, tintList);
            return;
        }
        this.H.b.setTintList(tintList);
    }
    
    public void setTintMode(final PorterDuff$Mode tintMode) {
        final Drawable g = super.G;
        if (g != null) {
            c.p(g, tintMode);
            return;
        }
        this.H.b.setTintMode(tintMode);
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final Drawable g = super.G;
        if (g != null) {
            return g.setVisible(b, b2);
        }
        this.H.b.setVisible(b, b2);
        return super.setVisible(b, b2);
    }
    
    public void start() {
        final Drawable g = super.G;
        if (g != null) {
            ((AnimatedVectorDrawable)g).start();
            return;
        }
        if (this.H.c.isStarted()) {
            return;
        }
        this.H.c.start();
        this.invalidateSelf();
    }
    
    public void stop() {
        final Drawable g = super.G;
        if (g != null) {
            ((AnimatedVectorDrawable)g).stop();
            return;
        }
        this.H.c.end();
    }
    
    private static class c extends Drawable$ConstantState
    {
        int a;
        androidx.vectordrawable.graphics.drawable.i b;
        AnimatorSet c;
        ArrayList<Animator> d;
        androidx.collection.a<Animator, String> e;
        
        public c(final Context context, final c c, final Drawable$Callback callback, final Resources resources) {
            if (c != null) {
                this.a = c.a;
                final androidx.vectordrawable.graphics.drawable.i b = c.b;
                int i = 0;
                if (b != null) {
                    final Drawable$ConstantState constantState = b.getConstantState();
                    Drawable drawable;
                    if (resources != null) {
                        drawable = constantState.newDrawable(resources);
                    }
                    else {
                        drawable = constantState.newDrawable();
                    }
                    this.b = (androidx.vectordrawable.graphics.drawable.i)drawable;
                    (this.b = (androidx.vectordrawable.graphics.drawable.i)this.b.mutate()).setCallback(callback);
                    this.b.setBounds(c.b.getBounds());
                    this.b.m(false);
                }
                final ArrayList<Animator> d = c.d;
                if (d != null) {
                    final int size = d.size();
                    this.d = new ArrayList<Animator>(size);
                    this.e = new androidx.collection.a<Animator, String>(size);
                    while (i < size) {
                        final Animator animator = c.d.get(i);
                        final Animator clone = animator.clone();
                        final String s = c.e.get(animator);
                        clone.setTarget(this.b.h(s));
                        this.d.add(clone);
                        this.e.put(clone, s);
                        ++i;
                    }
                    this.a();
                }
            }
        }
        
        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether((Collection)this.d);
        }
        
        public int getChangingConfigurations() {
            return this.a;
        }
        
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
        
        public Drawable newDrawable(final Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }
    
    @p0(24)
    private static class d extends Drawable$ConstantState
    {
        private final Drawable$ConstantState a;
        
        public d(final Drawable$ConstantState a) {
            this.a = a;
        }
        
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }
        
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }
        
        public Drawable newDrawable() {
            final c c = new c();
            (c.G = this.a.newDrawable()).setCallback(c.N);
            return c;
        }
        
        public Drawable newDrawable(final Resources resources) {
            final c c = new c();
            (c.G = this.a.newDrawable(resources)).setCallback(c.N);
            return c;
        }
        
        public Drawable newDrawable(final Resources resources, final Resources$Theme resources$Theme) {
            final c c = new c();
            (c.G = this.a.newDrawable(resources, resources$Theme)).setCallback(c.N);
            return c;
        }
    }
}
