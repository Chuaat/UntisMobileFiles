// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.animation;

import android.util.Property;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import android.animation.AnimatorSet;
import android.animation.AnimatorInflater;
import androidx.annotation.b;
import androidx.annotation.k0;
import androidx.annotation.y0;
import android.content.res.TypedArray;
import android.content.Context;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import androidx.annotation.j0;
import android.animation.PropertyValuesHolder;
import androidx.collection.m;

public class h
{
    private static final String c = "MotionSpec";
    private final m<String, i> a;
    private final m<String, PropertyValuesHolder[]> b;
    
    public h() {
        this.a = new m<String, i>();
        this.b = new m<String, PropertyValuesHolder[]>();
    }
    
    private static void a(@j0 final h h, final Animator obj) {
        if (obj instanceof ObjectAnimator) {
            final ObjectAnimator objectAnimator = (ObjectAnimator)obj;
            h.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            h.m(objectAnimator.getPropertyName(), i.b((ValueAnimator)objectAnimator));
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Animator must be an ObjectAnimator: ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @j0
    private PropertyValuesHolder[] b(@j0 final PropertyValuesHolder[] array) {
        final PropertyValuesHolder[] array2 = new PropertyValuesHolder[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i].clone();
        }
        return array2;
    }
    
    @k0
    public static h c(@j0 final Context context, @j0 final TypedArray typedArray, @y0 int resourceId) {
        if (typedArray.hasValue(resourceId)) {
            resourceId = typedArray.getResourceId(resourceId, 0);
            if (resourceId != 0) {
                return d(context, resourceId);
            }
        }
        return null;
    }
    
    @k0
    public static h d(@j0 final Context context, @b final int i) {
        try {
            final Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet)loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                final ArrayList<Animator> list = new ArrayList<Animator>();
                list.add((AnimatorSet)loadAnimator);
                return e(list);
            }
            return null;
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            Log.w("MotionSpec", sb.toString(), (Throwable)ex);
            return null;
        }
    }
    
    @j0
    private static h e(@j0 final List<Animator> list) {
        final h h = new h();
        for (int size = list.size(), i = 0; i < size; ++i) {
            a(h, list.get(i));
        }
        return h;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof h && this.a.equals(((h)o).a));
    }
    
    @j0
    public <T> ObjectAnimator f(@j0 final String s, @j0 final T t, @j0 final Property<T, ?> property) {
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)t, this.g(s));
        ofPropertyValuesHolder.setProperty((Property)property);
        this.h(s).a((Animator)ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }
    
    @j0
    public PropertyValuesHolder[] g(final String s) {
        if (this.j(s)) {
            return this.b(this.b.get(s));
        }
        throw new IllegalArgumentException();
    }
    
    public i h(final String s) {
        if (this.k(s)) {
            return this.a.get(s);
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public long i() {
        final int size = this.a.size();
        long max = 0L;
        for (int i = 0; i < size; ++i) {
            final i j = this.a.o(i);
            max = Math.max(max, j.c() + j.d());
        }
        return max;
    }
    
    public boolean j(final String s) {
        return this.b.get(s) != null;
    }
    
    public boolean k(final String s) {
        return this.a.get(s) != null;
    }
    
    public void l(final String s, final PropertyValuesHolder[] array) {
        this.b.put(s, array);
    }
    
    public void m(final String s, @k0 final i i) {
        this.a.put(s, i);
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append(this.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" timings: ");
        sb.append(this.a);
        sb.append("}\n");
        return sb.toString();
    }
}
