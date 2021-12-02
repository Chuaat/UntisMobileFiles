// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import java.util.Iterator;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Parcelable;
import android.os.Bundle;
import androidx.annotation.j0;
import androidx.annotation.k0;
import androidx.annotation.x0;
import androidx.annotation.t0;

@t0({ t0.a.H })
public final class MaterialTextInputPicker<S> extends PickerFragment<S>
{
    private static final String K = "THEME_RES_ID_KEY";
    private static final String L = "DATE_SELECTOR_KEY";
    private static final String M = "CALENDAR_CONSTRAINTS_KEY";
    @x0
    private int H;
    @k0
    private f<S> I;
    @k0
    private a J;
    
    @j0
    static <T> MaterialTextInputPicker<T> v(final f<T> f, @x0 final int n, @j0 final a a) {
        final MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<T>();
        final Bundle arguments = new Bundle();
        arguments.putInt("THEME_RES_ID_KEY", n);
        arguments.putParcelable("DATE_SELECTOR_KEY", (Parcelable)f);
        arguments.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)a);
        materialTextInputPicker.setArguments(arguments);
        return materialTextInputPicker;
    }
    
    @Override
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        this.H = arguments.getInt("THEME_RES_ID_KEY");
        this.I = (f<S>)arguments.getParcelable("DATE_SELECTOR_KEY");
        this.J = (a)arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
    
    @j0
    @Override
    public View onCreateView(@j0 LayoutInflater cloneInContext, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        cloneInContext = cloneInContext.cloneInContext((Context)new ContextThemeWrapper(this.getContext(), this.H));
        return this.I.V2(cloneInContext, viewGroup, bundle, this.J, new p<S>() {
            @Override
            public void a() {
                final Iterator<p> iterator = MaterialTextInputPicker.this.G.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a();
                }
            }
            
            @Override
            public void b(final S n) {
                final Iterator<p<S>> iterator = MaterialTextInputPicker.this.G.iterator();
                while (iterator.hasNext()) {
                    iterator.next().b((S)n);
                }
            }
        });
    }
    
    @Override
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.H);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable)this.I);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)this.J);
    }
    
    @j0
    public f<S> t() {
        final f<S> i = this.I;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("dateSelector should not be null. Use MaterialTextInputPicker#newInstance() to create this fragment with a DateSelector, and call this method after the fragment has been created.");
    }
}
