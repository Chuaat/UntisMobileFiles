// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.datepicker;

import androidx.core.util.j;
import androidx.annotation.w0;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import androidx.annotation.x0;
import android.content.Context;
import androidx.annotation.j0;
import java.util.Collection;
import androidx.annotation.t0;
import android.os.Parcelable;

@t0({ t0.a.H })
public interface f<S> extends Parcelable
{
    @j0
    Collection<Long> A4();
    
    @x0
    int L3(final Context p0);
    
    @j0
    String N0(final Context p0);
    
    @k0
    S O4();
    
    @j0
    View V2(@j0 final LayoutInflater p0, @k0 final ViewGroup p1, @k0 final Bundle p2, @j0 final a p3, @j0 final p<S> p4);
    
    @w0
    int X2();
    
    @j0
    Collection<j<Long, Long>> Z0();
    
    boolean d4();
    
    void o1(@j0 final S p0);
    
    void z5(final long p0);
}
