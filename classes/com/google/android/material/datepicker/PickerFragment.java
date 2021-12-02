// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import java.util.LinkedHashSet;
import androidx.fragment.app.Fragment;

abstract class PickerFragment<S> extends Fragment
{
    protected final LinkedHashSet<p<S>> G;
    
    PickerFragment() {
        this.G = new LinkedHashSet<p<S>>();
    }
    
    boolean r(final p<S> e) {
        return this.G.add(e);
    }
    
    void s() {
        this.G.clear();
    }
    
    abstract f<S> t();
    
    boolean u(final p<S> o) {
        return this.G.remove(o);
    }
}
