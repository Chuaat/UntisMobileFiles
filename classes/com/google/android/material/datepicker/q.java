// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import androidx.core.util.n;
import java.text.SimpleDateFormat;
import android.widget.EditText;
import com.google.android.material.internal.b0;
import android.text.TextWatcher;
import java.text.DateFormat;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import com.google.android.material.resources.b;
import o2.a;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import com.google.android.material.textfield.TextInputLayout;
import androidx.annotation.j0;
import android.os.Parcel;
import androidx.annotation.k0;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;
import androidx.core.util.j;

@t0({ t0.a.H })
public class q implements f<j<Long, Long>>
{
    public static final Parcelable$Creator<q> CREATOR;
    private String G;
    private final String H;
    @k0
    private Long I;
    @k0
    private Long J;
    @k0
    private Long K;
    @k0
    private Long L;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<q>() {
            @j0
            public q a(@j0 final Parcel parcel) {
                final q q = new q();
                q.I = (Long)parcel.readValue(Long.class.getClassLoader());
                q.J = (Long)parcel.readValue(Long.class.getClassLoader());
                return q;
            }
            
            @j0
            public q[] b(final int n) {
                return new q[n];
            }
        };
    }
    
    public q() {
        this.H = " ";
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
    }
    
    private void f(@j0 final TextInputLayout textInputLayout, @j0 final TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.G.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError(null);
        }
    }
    
    private boolean h(final long n, final long n2) {
        return n <= n2;
    }
    
    private void i(@j0 final TextInputLayout textInputLayout, @j0 final TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.G);
        textInputLayout2.setError(" ");
    }
    
    private void k(@j0 final TextInputLayout textInputLayout, @j0 final TextInputLayout textInputLayout2, @j0 final p<j<Long, Long>> p3) {
        final Long k = this.K;
        if (k != null && this.L != null) {
            if (this.h(k, this.L)) {
                this.I = this.K;
                this.J = this.L;
                p3.b(this.g());
            }
            else {
                this.i(textInputLayout, textInputLayout2);
                p3.a();
            }
            return;
        }
        this.f(textInputLayout, textInputLayout2);
        p3.a();
    }
    
    @j0
    @Override
    public Collection<Long> A4() {
        final ArrayList<Long> list = new ArrayList<Long>();
        final Long i = this.I;
        if (i != null) {
            list.add(i);
        }
        final Long j = this.J;
        if (j != null) {
            list.add(j);
        }
        return list;
    }
    
    @Override
    public int L3(@j0 final Context context) {
        final Resources resources = context.getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int n;
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(a.f.V3)) {
            n = a.c.J9;
        }
        else {
            n = a.c.y9;
        }
        return b.g(context, n, MaterialDatePicker.class.getCanonicalName());
    }
    
    @j0
    @Override
    public String N0(@j0 final Context context) {
        final Resources resources = context.getResources();
        final Long i = this.I;
        if (i == null && this.J == null) {
            return resources.getString(a.m.H0);
        }
        final Long j = this.J;
        if (j == null) {
            return resources.getString(a.m.E0, new Object[] { g.c(i) });
        }
        if (i == null) {
            return resources.getString(a.m.D0, new Object[] { g.c(j) });
        }
        final j<String, String> a = g.a(i, j);
        return resources.getString(o2.a.m.F0, new Object[] { a.a, a.b });
    }
    
    @Override
    public View V2(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle, final com.google.android.material.datepicker.a a, @j0 final p<j<Long, Long>> p5) {
        final View inflate = layoutInflater.inflate(a.k.I0, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout)inflate.findViewById(a.h.l3);
        final TextInputLayout textInputLayout2 = (TextInputLayout)inflate.findViewById(a.h.k3);
        final EditText editText = textInputLayout.getEditText();
        final EditText editText2 = textInputLayout2.getEditText();
        if (com.google.android.material.internal.g.a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.G = inflate.getResources().getString(a.m.A0);
        final SimpleDateFormat p6 = u.p();
        final Long i = this.I;
        if (i != null) {
            editText.setText((CharSequence)p6.format(i));
            this.K = this.I;
        }
        final Long j = this.J;
        if (j != null) {
            editText2.setText((CharSequence)p6.format(j));
            this.L = this.J;
        }
        final String q = u.q(inflate.getResources(), p6);
        textInputLayout.setPlaceholderText(q);
        textInputLayout2.setPlaceholderText(q);
        editText.addTextChangedListener((TextWatcher)new e(q, p6, textInputLayout, a) {
            @Override
            void e() {
                q.this.K = null;
                q.this.k(textInputLayout, textInputLayout2, p5);
            }
            
            @Override
            void f(@k0 final Long n) {
                q.this.K = n;
                q.this.k(textInputLayout, textInputLayout2, p5);
            }
        });
        editText2.addTextChangedListener((TextWatcher)new e(q, p6, textInputLayout2, a) {
            @Override
            void e() {
                q.this.L = null;
                q.this.k(textInputLayout, textInputLayout2, p5);
            }
            
            @Override
            void f(@k0 final Long n) {
                q.this.L = n;
                q.this.k(textInputLayout, textInputLayout2, p5);
            }
        });
        b0.o((View)editText);
        return inflate;
    }
    
    @Override
    public int X2() {
        return a.m.G0;
    }
    
    @j0
    @Override
    public Collection<j<Long, Long>> Z0() {
        if (this.I != null && this.J != null) {
            final ArrayList<j<Long, Long>> list = new ArrayList<j<Long, Long>>();
            list.add(new j<Long, Long>(this.I, this.J));
            return list;
        }
        return new ArrayList<j<Long, Long>>();
    }
    
    @Override
    public boolean d4() {
        final Long i = this.I;
        return i != null && this.J != null && this.h(i, this.J);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @j0
    public j<Long, Long> g() {
        return new j<Long, Long>(this.I, this.J);
    }
    
    public void j(@j0 final j<Long, Long> j) {
        final Long a = j.a;
        if (a != null && j.b != null) {
            n.a(this.h(a, j.b));
        }
        final Long a2 = j.a;
        final Long n = null;
        Long value;
        if (a2 == null) {
            value = null;
        }
        else {
            value = u.a(a2);
        }
        this.I = value;
        final Long b = j.b;
        Long value2;
        if (b == null) {
            value2 = n;
        }
        else {
            value2 = u.a(b);
        }
        this.J = value2;
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.I);
        parcel.writeValue((Object)this.J);
    }
    
    @Override
    public void z5(final long n) {
        final Long i = this.I;
        if (i != null) {
            if (this.J == null && this.h(i, n)) {
                this.J = n;
                return;
            }
            this.J = null;
        }
        this.I = n;
    }
}
