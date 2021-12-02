// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import androidx.appcompat.widget.r0;
import androidx.annotation.k0;
import androidx.appcompat.widget.y;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.e;
import androidx.appcompat.view.d;
import android.util.Log;
import c.a;
import android.view.InflateException;
import android.content.res.TypedArray;
import android.view.View$OnClickListener;
import androidx.core.view.j0;
import android.os.Build$VERSION;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.lang.reflect.Constructor;
import androidx.collection.m;

public class j
{
    private static final Class<?>[] b;
    private static final int[] c;
    private static final String[] d;
    private static final String e = "AppCompatViewInflater";
    private static final m<String, Constructor<? extends View>> f;
    private final Object[] a;
    
    static {
        b = new Class[] { Context.class, AttributeSet.class };
        c = new int[] { 16843375 };
        d = new String[] { "android.widget.", "android.view.", "android.webkit." };
        f = new m<String, Constructor<? extends View>>();
    }
    
    public j() {
        this.a = new Object[2];
    }
    
    private void a(final View view, final AttributeSet set) {
        final Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build$VERSION.SDK_INT < 15 || j0.J0(view)) {
                final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, j.c);
                final String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener((View$OnClickListener)new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }
    
    private View r(final Context context, final String str, String string) throws ClassNotFoundException, InflateException {
        final m<String, Constructor<? extends View>> f = j.f;
        Label_0095: {
            Constructor<? extends View> constructor;
            if ((constructor = f.get(str)) != null) {
                break Label_0095;
            }
            Label_0062: {
                if (string == null) {
                    break Label_0062;
                }
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str);
                    string = sb.toString();
                    while (true) {
                        constructor = Class.forName(string, false, context.getClassLoader()).asSubclass(View.class).getConstructor(j.b);
                        f.put(str, constructor);
                        constructor.setAccessible(true);
                        return constructor.newInstance(this.a);
                        string = str;
                        continue;
                    }
                }
                catch (Exception ex) {
                    return null;
                }
            }
        }
    }
    
    private View s(final Context context, final String s, final AttributeSet set) {
        String attributeValue = s;
        if (s.equals("view")) {
            attributeValue = set.getAttributeValue((String)null, "class");
        }
        try {
            final Object[] a = this.a;
            a[0] = context;
            a[1] = set;
            if (-1 != attributeValue.indexOf(46)) {
                return this.r(context, attributeValue, null);
            }
            int n = 0;
            while (true) {
                final String[] d = j.d;
                if (n >= d.length) {
                    return null;
                }
                final View r = this.r(context, attributeValue, d[n]);
                if (r != null) {
                    return r;
                }
                ++n;
            }
        }
        catch (Exception ex) {
            return null;
        }
        finally {
            final Object[] a2 = this.a;
            a2[1] = (a2[0] = null);
        }
    }
    
    private static Context t(final Context context, final AttributeSet set, final boolean b, final boolean b2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, c.a.n.V7, 0, 0);
        int resourceId;
        if (b) {
            resourceId = obtainStyledAttributes.getResourceId(c.a.n.W7, 0);
        }
        else {
            resourceId = 0;
        }
        int n = resourceId;
        if (b2 && (n = resourceId) == 0) {
            final int resourceId2 = obtainStyledAttributes.getResourceId(c.a.n.a8, 0);
            if ((n = resourceId2) != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
                n = resourceId2;
            }
        }
        obtainStyledAttributes.recycle();
        Object o = context;
        if (n != 0) {
            if (context instanceof d) {
                o = context;
                if (((d)context).c() == n) {
                    return (Context)o;
                }
            }
            o = new d(context, n);
        }
        return (Context)o;
    }
    
    private void u(final View view, final String str) {
        if (view != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(" asked to inflate view for <");
        sb.append(str);
        sb.append(">, but returned null");
        throw new IllegalStateException(sb.toString());
    }
    
    @androidx.annotation.j0
    protected e b(final Context context, final AttributeSet set) {
        return new e(context, set);
    }
    
    @androidx.annotation.j0
    protected AppCompatButton c(final Context context, final AttributeSet set) {
        return new AppCompatButton(context, set);
    }
    
    @androidx.annotation.j0
    protected g d(final Context context, final AttributeSet set) {
        return new g(context, set);
    }
    
    @androidx.annotation.j0
    protected h e(final Context context, final AttributeSet set) {
        return new h(context, set);
    }
    
    @androidx.annotation.j0
    protected AppCompatEditText f(final Context context, final AttributeSet set) {
        return new AppCompatEditText(context, set);
    }
    
    @androidx.annotation.j0
    protected AppCompatImageButton g(final Context context, final AttributeSet set) {
        return new AppCompatImageButton(context, set);
    }
    
    @androidx.annotation.j0
    protected AppCompatImageView h(final Context context, final AttributeSet set) {
        return new AppCompatImageView(context, set);
    }
    
    @androidx.annotation.j0
    protected androidx.appcompat.widget.m i(final Context context, final AttributeSet set) {
        return new androidx.appcompat.widget.m(context, set);
    }
    
    @androidx.annotation.j0
    protected p j(final Context context, final AttributeSet set) {
        return new p(context, set);
    }
    
    @androidx.annotation.j0
    protected q k(final Context context, final AttributeSet set) {
        return new q(context, set);
    }
    
    @androidx.annotation.j0
    protected s l(final Context context, final AttributeSet set) {
        return new s(context, set);
    }
    
    @androidx.annotation.j0
    protected u m(final Context context, final AttributeSet set) {
        return new u(context, set);
    }
    
    @androidx.annotation.j0
    protected AppCompatTextView n(final Context context, final AttributeSet set) {
        return new AppCompatTextView(context, set);
    }
    
    @androidx.annotation.j0
    protected y o(final Context context, final AttributeSet set) {
        return new y(context, set);
    }
    
    @k0
    protected View p(final Context context, final String s, final AttributeSet set) {
        return null;
    }
    
    final View q(View o, final String s, @androidx.annotation.j0 final Context context, @androidx.annotation.j0 final AttributeSet set, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        Context context2;
        if (b && o != null) {
            context2 = ((View)o).getContext();
        }
        else {
            context2 = context;
        }
        Context t = null;
        Label_0046: {
            if (!b2) {
                t = context2;
                if (!b3) {
                    break Label_0046;
                }
            }
            t = t(context2, set, b2, b3);
        }
        Context b5 = t;
        if (b4) {
            b5 = r0.b(t);
        }
        s.hashCode();
        int n = -1;
        switch (s) {
            case "Button": {
                n = 13;
                break;
            }
            case "EditText": {
                n = 12;
                break;
            }
            case "CheckBox": {
                n = 11;
                break;
            }
            case "AutoCompleteTextView": {
                n = 10;
                break;
            }
            case "ImageView": {
                n = 9;
                break;
            }
            case "ToggleButton": {
                n = 8;
                break;
            }
            case "RadioButton": {
                n = 7;
                break;
            }
            case "Spinner": {
                n = 6;
                break;
            }
            case "SeekBar": {
                n = 5;
                break;
            }
            case "ImageButton": {
                n = 4;
                break;
            }
            case "TextView": {
                n = 3;
                break;
            }
            case "MultiAutoCompleteTextView": {
                n = 2;
                break;
            }
            case "CheckedTextView": {
                n = 1;
                break;
            }
            case "RatingBar": {
                n = 0;
                break;
            }
            default:
                break;
        }
        Label_0731: {
            switch (n) {
                default: {
                    o = this.p(b5, s, set);
                    break Label_0731;
                }
                case 13: {
                    o = this.c(b5, set);
                    break;
                }
                case 12: {
                    o = this.f(b5, set);
                    break;
                }
                case 11: {
                    o = this.d(b5, set);
                    break;
                }
                case 10: {
                    o = this.b(b5, set);
                    break;
                }
                case 9: {
                    o = this.h(b5, set);
                    break;
                }
                case 8: {
                    o = this.o(b5, set);
                    break;
                }
                case 7: {
                    o = this.j(b5, set);
                    break;
                }
                case 6: {
                    o = this.m(b5, set);
                    break;
                }
                case 5: {
                    o = this.l(b5, set);
                    break;
                }
                case 4: {
                    o = this.g(b5, set);
                    break;
                }
                case 3: {
                    o = this.n(b5, set);
                    break;
                }
                case 2: {
                    o = this.i(b5, set);
                    break;
                }
                case 1: {
                    o = this.e(b5, set);
                    break;
                }
                case 0: {
                    o = this.k(b5, set);
                    break;
                }
            }
            this.u((View)o, s);
        }
        Object s2 = o;
        if (o == null) {
            s2 = o;
            if (context != b5) {
                s2 = this.s(b5, s, set);
            }
        }
        if (s2 != null) {
            this.a((View)s2, set);
        }
        return (View)s2;
    }
    
    private static class a implements View$OnClickListener
    {
        private final View G;
        private final String H;
        private Method I;
        private Context J;
        
        public a(@androidx.annotation.j0 final View g, @androidx.annotation.j0 final String h) {
            this.G = g;
            this.H = h;
        }
        
        private void a(@k0 Context baseContext) {
            while (baseContext != null) {
                try {
                    if (!baseContext.isRestricted()) {
                        final Method method = baseContext.getClass().getMethod(this.H, View.class);
                        if (method != null) {
                            this.I = method;
                            this.J = baseContext;
                            return;
                        }
                    }
                }
                catch (NoSuchMethodException ex) {}
                if (baseContext instanceof ContextWrapper) {
                    baseContext = ((ContextWrapper)baseContext).getBaseContext();
                }
                else {
                    baseContext = null;
                }
            }
            final int id = this.G.getId();
            String string;
            if (id == -1) {
                string = "";
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(" with id '");
                sb.append(this.G.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                string = sb.toString();
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find method ");
            sb2.append(this.H);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.G.getClass());
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        public void onClick(@androidx.annotation.j0 final View view) {
            if (this.I == null) {
                this.a(this.G.getContext());
            }
            try {
                this.I.invoke(this.J, view);
            }
            catch (InvocationTargetException cause) {
                throw new IllegalStateException("Could not execute method for android:onClick", cause);
            }
            catch (IllegalAccessException cause2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", cause2);
            }
        }
    }
}
