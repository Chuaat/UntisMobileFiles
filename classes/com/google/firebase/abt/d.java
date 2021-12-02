// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.abt;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import android.os.Bundle;
import java.util.Set;
import androidx.annotation.c1;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayDeque;
import java.util.List;
import android.content.Context;
import androidx.annotation.k0;
import com.google.firebase.analytics.connector.a;
import androidx.annotation.b1;

public class d
{
    @b1
    static final String d = "com.google.firebase.abt";
    @b1
    static final String e = "%s_lastKnownExperimentStartTime";
    private final com.google.firebase.analytics.connector.a a;
    private final String b;
    @k0
    private Integer c;
    
    public d(final Context context, final com.google.firebase.analytics.connector.a a, final String b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    private void a(final com.google.firebase.analytics.connector.a.c c) {
        this.a.b(c);
    }
    
    private void b(final List<b> list) {
        final ArrayDeque<com.google.firebase.analytics.connector.a.c> arrayDeque = new ArrayDeque<com.google.firebase.analytics.connector.a.c>(this.e());
        final int h = this.h();
        for (final b b : list) {
            while (arrayDeque.size() >= h) {
                this.j(((com.google.firebase.analytics.connector.a.c)arrayDeque.pollFirst()).b);
            }
            final com.google.firebase.analytics.connector.a.c i = b.i(this.b);
            this.a(i);
            arrayDeque.offer(i);
        }
    }
    
    private static List<b> c(final List<Map<String, String>> list) throws com.google.firebase.abt.a {
        final ArrayList<b> list2 = new ArrayList<b>();
        final Iterator<Map<String, String>> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(b.b(iterator.next()));
        }
        return list2;
    }
    
    @c1
    private List<com.google.firebase.analytics.connector.a.c> e() {
        return this.a.e(this.b, "");
    }
    
    private ArrayList<b> f(final List<b> list, final Set<String> set) {
        final ArrayList<b> list2 = new ArrayList<b>();
        for (final b e : list) {
            if (!set.contains(e.c())) {
                list2.add(e);
            }
        }
        return list2;
    }
    
    private ArrayList<com.google.firebase.analytics.connector.a.c> g(final List<com.google.firebase.analytics.connector.a.c> list, final Set<String> set) {
        final ArrayList<com.google.firebase.analytics.connector.a.c> list2 = new ArrayList<com.google.firebase.analytics.connector.a.c>();
        for (final com.google.firebase.analytics.connector.a.c e : list) {
            if (!set.contains(e.b)) {
                list2.add(e);
            }
        }
        return list2;
    }
    
    @c1
    private int h() {
        if (this.c == null) {
            this.c = this.a.d(this.b);
        }
        return this.c;
    }
    
    private void j(final String s) {
        this.a.clearConditionalUserProperty(s, null, null);
    }
    
    private void k(final Collection<com.google.firebase.analytics.connector.a.c> collection) {
        final Iterator<com.google.firebase.analytics.connector.a.c> iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.j(iterator.next().b);
        }
    }
    
    private void m(final List<b> list) throws com.google.firebase.abt.a {
        if (list.isEmpty()) {
            this.i();
            return;
        }
        final HashSet<String> set = new HashSet<String>();
        final Iterator<b> iterator = list.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().c());
        }
        final List<com.google.firebase.analytics.connector.a.c> e = this.e();
        final HashSet<String> set2 = new HashSet<String>();
        final Iterator<com.google.firebase.analytics.connector.a.c> iterator2 = e.iterator();
        while (iterator2.hasNext()) {
            set2.add(iterator2.next().b);
        }
        this.k(this.g(e, set));
        this.b(this.f(list, set2));
    }
    
    private void o() throws com.google.firebase.abt.a {
        if (this.a != null) {
            return;
        }
        throw new com.google.firebase.abt.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }
    
    @c1
    public List<b> d() throws com.google.firebase.abt.a {
        this.o();
        final List<com.google.firebase.analytics.connector.a.c> e = this.e();
        final ArrayList<b> list = new ArrayList<b>();
        final Iterator<com.google.firebase.analytics.connector.a.c> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(com.google.firebase.abt.b.a(iterator.next()));
        }
        return list;
    }
    
    @c1
    public void i() throws com.google.firebase.abt.a {
        this.o();
        this.k(this.e());
    }
    
    @c1
    public void l(final List<Map<String, String>> list) throws com.google.firebase.abt.a {
        this.o();
        if (list != null) {
            this.m(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
    
    @c1
    public void n(final b b) throws com.google.firebase.abt.a {
        this.o();
        b.k(b);
        final ArrayList<b> list = new ArrayList<b>();
        final Map<String, String> j = b.j();
        j.remove("triggerEvent");
        list.add(b.b(j));
        this.b(list);
    }
    
    @c1
    public void p(final List<b> list) throws com.google.firebase.abt.a {
        this.o();
        final HashSet<String> set = new HashSet<String>();
        final Iterator<b> iterator = list.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().c());
        }
        this.k(this.g(this.e(), set));
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final String D0 = "frc";
        public static final String E0 = "fiam";
    }
}
