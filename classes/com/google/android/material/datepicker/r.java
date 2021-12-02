// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import androidx.core.util.j;
import java.text.SimpleDateFormat;
import android.widget.EditText;
import com.google.android.material.internal.b0;
import android.text.TextWatcher;
import java.text.DateFormat;
import com.google.android.material.textfield.TextInputLayout;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import com.google.android.material.resources.b;
import o2.a;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import androidx.annotation.j0;
import android.os.Parcel;
import androidx.annotation.k0;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class r implements f<Long>
{
    public static final Parcelable$Creator<r> CREATOR;
    @k0
    private Long G;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<r>() {
            @j0
            public r a(@j0 final Parcel parcel) {
                final r r = new r();
                r.G = (Long)parcel.readValue(Long.class.getClassLoader());
                return r;
            }
            
            @j0
            public r[] b(final int n) {
                return new r[n];
            }
        };
    }
    
    private void c() {
        this.G = null;
    }
    
    @j0
    @Override
    public Collection<Long> A4() {
        final ArrayList<Long> list = new ArrayList<Long>();
        final Long g = this.G;
        if (g != null) {
            list.add(g);
        }
        return list;
    }
    
    @Override
    public int L3(final Context context) {
        return b.g(context, a.c.J9, MaterialDatePicker.class.getCanonicalName());
    }
    
    @j0
    @Override
    public String N0(@j0 final Context context) {
        final Resources resources = context.getResources();
        final Long g = this.G;
        if (g == null) {
            return resources.getString(a.m.v0);
        }
        return resources.getString(a.m.t0, new Object[] { com.google.android.material.datepicker.g.j(g) });
    }
    
    @Override
    public View V2(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle, final com.google.android.material.datepicker.a a, @j0 final p<Long> p5) {
        final View inflate = layoutInflater.inflate(a.k.H0, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout)inflate.findViewById(a.h.j3);
        final EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.g.a()) {
            editText.setInputType(17);
        }
        final SimpleDateFormat p6 = u.p();
        final String q = u.q(inflate.getResources(), p6);
        textInputLayout.setPlaceholderText(q);
        final Long g = this.G;
        if (g != null) {
            editText.setText((CharSequence)p6.format(g));
        }
        editText.addTextChangedListener((TextWatcher)new e(q, p6, textInputLayout, a) {
            @Override
            void e() {
                p5.a();
            }
            
            @Override
            void f(@k0 final Long n) {
                if (n == null) {
                    r.this.c();
                }
                else {
                    r.this.z5(n);
                }
                p5.b(r.this.d());
            }
        });
        b0.o((View)editText);
        return inflate;
    }
    
    @Override
    public int X2() {
        return a.m.u0;
    }
    
    @j0
    @Override
    public Collection<j<Long, Long>> Z0() {
        return new ArrayList<j<Long, Long>>();
    }
    
    @k0
    public Long d() {
        return this.G;
    }
    
    @Override
    public boolean d4() {
        return this.G != null;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void e(@k0 Long value) {
        if (value == null) {
            value = null;
        }
        else {
            value = u.a(value);
        }
        this.G = value;
    }
    
    public void writeToParcel(@j0 final Parcel parcel, final int n) {
        parcel.writeValue((Object)this.G);
    }
    
    @Override
    public void z5(final long l) {
        this.G = l;
    }
}
