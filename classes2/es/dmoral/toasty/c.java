// 
// Decompiled by Procyon v0.5.36
// 

package es.dmoral.toasty;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import androidx.annotation.w0;
import androidx.annotation.j;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.Toast;
import android.graphics.Typeface;
import android.annotation.SuppressLint;

@SuppressLint({ "InflateParams" })
public class c
{
    private static final Typeface a;
    private static Typeface b;
    private static int c = 0;
    private static boolean d = false;
    private static boolean e = false;
    private static Toast f;
    public static final int g = 0;
    public static final int h = 1;
    
    static {
        es.dmoral.toasty.c.b = (a = Typeface.create("sans-serif-condensed", 0));
        es.dmoral.toasty.c.c = 16;
        es.dmoral.toasty.c.d = true;
        es.dmoral.toasty.c.e = true;
        es.dmoral.toasty.c.f = null;
    }
    
    private c() {
    }
    
    @j
    public static Toast A(@j0 final Context context, @j0 final CharSequence charSequence, final int n, final boolean b) {
        return n(context, charSequence, es.dmoral.toasty.d.b(context, es.dmoral.toasty.b.f.x0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.X), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n, b, true);
    }
    
    @j
    public static Toast B(@j0 final Context context, @w0 final int n) {
        return J(context, context.getString(n), 0, null, false);
    }
    
    @j
    public static Toast C(@j0 final Context context, @w0 final int n, final int n2) {
        return J(context, context.getString(n), n2, null, false);
    }
    
    @j
    public static Toast D(@j0 final Context context, @w0 final int n, final int n2, final Drawable drawable) {
        return J(context, context.getString(n), n2, drawable, true);
    }
    
    @j
    public static Toast E(@j0 final Context context, @w0 final int n, final int n2, final Drawable drawable, final boolean b) {
        return n(context, context.getString(n), drawable, es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.k0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n2, b, true);
    }
    
    @j
    public static Toast F(@j0 final Context context, @w0 final int n, final Drawable drawable) {
        return J(context, context.getString(n), 0, drawable, true);
    }
    
    @j
    public static Toast G(@j0 final Context context, @j0 final CharSequence charSequence) {
        return J(context, charSequence, 0, null, false);
    }
    
    @j
    public static Toast H(@j0 final Context context, @j0 final CharSequence charSequence, final int n) {
        return J(context, charSequence, n, null, false);
    }
    
    @j
    public static Toast I(@j0 final Context context, @j0 final CharSequence charSequence, final int n, final Drawable drawable) {
        return J(context, charSequence, n, drawable, true);
    }
    
    @j
    public static Toast J(@j0 final Context context, @j0 final CharSequence charSequence, final int n, final Drawable drawable, final boolean b) {
        return n(context, charSequence, drawable, es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.k0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n, b, true);
    }
    
    @j
    public static Toast K(@j0 final Context context, @j0 final CharSequence charSequence, final Drawable drawable) {
        return J(context, charSequence, 0, drawable, true);
    }
    
    @j
    public static Toast L(@j0 final Context context, @w0 final int n) {
        return Q(context, context.getString(n), 0, true);
    }
    
    @j
    public static Toast M(@j0 final Context context, @w0 final int n, final int n2) {
        return Q(context, context.getString(n), n2, true);
    }
    
    @j
    public static Toast N(@j0 final Context context, @w0 final int n, final int n2, final boolean b) {
        return n(context, context.getString(n), es.dmoral.toasty.d.b(context, es.dmoral.toasty.b.f.u0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.B0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n2, b, true);
    }
    
    @j
    public static Toast O(@j0 final Context context, @j0 final CharSequence charSequence) {
        return Q(context, charSequence, 0, true);
    }
    
    @j
    public static Toast P(@j0 final Context context, @j0 final CharSequence charSequence, final int n) {
        return Q(context, charSequence, n, true);
    }
    
    @j
    public static Toast Q(@j0 final Context context, @j0 final CharSequence charSequence, final int n, final boolean b) {
        return n(context, charSequence, es.dmoral.toasty.d.b(context, es.dmoral.toasty.b.f.u0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.B0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n, b, true);
    }
    
    @j
    public static Toast R(@j0 final Context context, @w0 final int n) {
        return W(context, context.getString(n), 0, true);
    }
    
    @j
    public static Toast S(@j0 final Context context, @w0 final int n, final int n2) {
        return W(context, context.getString(n), n2, true);
    }
    
    @j
    public static Toast T(@j0 final Context context, @w0 final int n, final int n2, final boolean b) {
        return n(context, context.getString(n), es.dmoral.toasty.d.b(context, es.dmoral.toasty.b.f.w0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.K0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n2, b, true);
    }
    
    @j
    public static Toast U(@j0 final Context context, @j0 final CharSequence charSequence) {
        return W(context, charSequence, 0, true);
    }
    
    @j
    public static Toast V(@j0 final Context context, @j0 final CharSequence charSequence, final int n) {
        return W(context, charSequence, n, true);
    }
    
    @j
    public static Toast W(@j0 final Context context, @j0 final CharSequence charSequence, final int n, final boolean b) {
        return n(context, charSequence, es.dmoral.toasty.d.b(context, es.dmoral.toasty.b.f.w0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.K0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n, b, true);
    }
    
    @j
    public static Toast i(@j0 final Context context, @w0 final int n, @s final int n2, @n final int n3, final int n4, final boolean b, final boolean b2) {
        return n(context, context.getString(n), es.dmoral.toasty.d.b(context, n2), es.dmoral.toasty.d.a(context, n3), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n4, b, b2);
    }
    
    @j
    public static Toast j(@j0 final Context context, @w0 final int n, final Drawable drawable, @n final int n2, @n final int n3, final int n4, final boolean b, final boolean b2) {
        return n(context, context.getString(n), drawable, es.dmoral.toasty.d.a(context, n2), es.dmoral.toasty.d.a(context, n3), n4, b, b2);
    }
    
    @j
    public static Toast k(@j0 final Context context, @w0 final int n, final Drawable drawable, @n final int n2, final int n3, final boolean b, final boolean b2) {
        return n(context, context.getString(n), drawable, es.dmoral.toasty.d.a(context, n2), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n3, b, b2);
    }
    
    @j
    public static Toast l(@j0 final Context context, @w0 final int n, final Drawable drawable, final int n2, final boolean b) {
        return n(context, context.getString(n), drawable, -1, es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n2, b, false);
    }
    
    @j
    public static Toast m(@j0 final Context context, @j0 final CharSequence charSequence, @s final int n, @n final int n2, final int n3, final boolean b, final boolean b2) {
        return n(context, charSequence, es.dmoral.toasty.d.b(context, n), es.dmoral.toasty.d.a(context, n2), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n3, b, b2);
    }
    
    @SuppressLint({ "ShowToast" })
    @j
    public static Toast n(@j0 final Context context, @j0 final CharSequence text, final Drawable drawable, @l final int n, @l final int textColor, final int n2, final boolean b, final boolean b2) {
        final Toast text2 = Toast.makeText(context, (CharSequence)"", n2);
        final View inflate = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(b.i.M, (ViewGroup)null);
        final ImageView imageView = (ImageView)inflate.findViewById(es.dmoral.toasty.b.g.W0);
        final TextView textView = (TextView)inflate.findViewById(es.dmoral.toasty.b.g.Y0);
        Drawable drawable2;
        if (b2) {
            drawable2 = es.dmoral.toasty.d.d(context, n);
        }
        else {
            drawable2 = es.dmoral.toasty.d.b(context, es.dmoral.toasty.b.f.K0);
        }
        es.dmoral.toasty.d.c(inflate, drawable2);
        if (b) {
            if (drawable == null) {
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            }
            Drawable e = drawable;
            if (es.dmoral.toasty.c.d) {
                e = es.dmoral.toasty.d.e(drawable, textColor);
            }
            es.dmoral.toasty.d.c((View)imageView, e);
        }
        else {
            imageView.setVisibility(8);
        }
        textView.setText(text);
        textView.setTextColor(textColor);
        textView.setTypeface(es.dmoral.toasty.c.b);
        textView.setTextSize(2, (float)es.dmoral.toasty.c.c);
        text2.setView(inflate);
        if (!es.dmoral.toasty.c.e) {
            final Toast f = es.dmoral.toasty.c.f;
            if (f != null) {
                f.cancel();
            }
            es.dmoral.toasty.c.f = text2;
        }
        return text2;
    }
    
    @j
    public static Toast o(@j0 final Context context, @j0 final CharSequence charSequence, final Drawable drawable, final int n, final boolean b) {
        return n(context, charSequence, drawable, -1, es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n, b, false);
    }
    
    @j
    public static Toast p(@j0 final Context context, @w0 final int n) {
        return u(context, context.getString(n), 0, true);
    }
    
    @j
    public static Toast q(@j0 final Context context, @w0 final int n, final int n2) {
        return u(context, context.getString(n), n2, true);
    }
    
    @j
    public static Toast r(@j0 final Context context, @w0 final int n, final int n2, final boolean b) {
        return n(context, context.getString(n), es.dmoral.toasty.d.b(context, es.dmoral.toasty.b.f.v0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.Q), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n2, b, true);
    }
    
    @j
    public static Toast s(@j0 final Context context, @j0 final CharSequence charSequence) {
        return u(context, charSequence, 0, true);
    }
    
    @j
    public static Toast t(@j0 final Context context, @j0 final CharSequence charSequence, final int n) {
        return u(context, charSequence, n, true);
    }
    
    @j
    public static Toast u(@j0 final Context context, @j0 final CharSequence charSequence, final int n, final boolean b) {
        return n(context, charSequence, es.dmoral.toasty.d.b(context, es.dmoral.toasty.b.f.v0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.Q), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n, b, true);
    }
    
    @j
    public static Toast v(@j0 final Context context, @w0 final int n) {
        return A(context, context.getString(n), 0, true);
    }
    
    @j
    public static Toast w(@j0 final Context context, @w0 final int n, final int n2) {
        return A(context, context.getString(n), n2, true);
    }
    
    @j
    public static Toast x(@j0 final Context context, @w0 final int n, final int n2, final boolean b) {
        return n(context, context.getString(n), es.dmoral.toasty.d.b(context, es.dmoral.toasty.b.f.x0), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.X), es.dmoral.toasty.d.a(context, es.dmoral.toasty.b.d.L), n2, b, true);
    }
    
    @j
    public static Toast y(@j0 final Context context, @j0 final CharSequence charSequence) {
        return A(context, charSequence, 0, true);
    }
    
    @j
    public static Toast z(@j0 final Context context, @j0 final CharSequence charSequence, final int n) {
        return A(context, charSequence, n, true);
    }
    
    public static class a
    {
        private Typeface a;
        private int b;
        private boolean c;
        private boolean d;
        
        private a() {
            this.a = es.dmoral.toasty.c.b;
            this.b = es.dmoral.toasty.c.c;
            this.c = es.dmoral.toasty.c.d;
            this.d = true;
        }
        
        @j
        public static a c() {
            return new a();
        }
        
        public static void d() {
            es.dmoral.toasty.c.b = es.dmoral.toasty.c.a;
            es.dmoral.toasty.c.c = 16;
            es.dmoral.toasty.c.d = true;
            es.dmoral.toasty.c.e = true;
        }
        
        @j
        public a a(final boolean d) {
            this.d = d;
            return this;
        }
        
        public void b() {
            es.dmoral.toasty.c.b = this.a;
            es.dmoral.toasty.c.c = this.b;
            es.dmoral.toasty.c.d = this.c;
            es.dmoral.toasty.c.e = this.d;
        }
        
        @j
        public a e(final int b) {
            this.b = b;
            return this;
        }
        
        @j
        public a f(@j0 final Typeface a) {
            this.a = a;
            return this;
        }
        
        @j
        public a g(final boolean c) {
            this.c = c;
            return this;
        }
    }
}
