// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import java.util.Iterator;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.util.Log;
import android.text.TextUtils;
import androidx.annotation.c1;
import java.util.concurrent.Executor;
import androidx.annotation.w;
import java.util.ArrayDeque;
import android.content.SharedPreferences;

final class w0
{
    private final SharedPreferences a;
    private final String b;
    private final String c;
    @w("internalQueue")
    private final ArrayDeque<String> d;
    private final Executor e;
    @w("internalQueue")
    private boolean f;
    
    private w0(final SharedPreferences a, final String s, final String s2, final Executor e) {
        this.d = new ArrayDeque<String>();
        this.f = false;
        this.a = a;
        this.b = "topic_operation_queue";
        this.c = ",";
        this.e = e;
    }
    
    @w("internalQueue")
    private boolean c(final boolean b) {
        boolean b2 = b;
        if (b) {
            b2 = b;
            if (!this.f) {
                this.j();
                b2 = true;
            }
        }
        return b2;
    }
    
    @c1
    static w0 d(final SharedPreferences sharedPreferences, final String s, final String s2, final Executor executor) {
        final w0 w0 = new w0(sharedPreferences, "topic_operation_queue", ",", executor);
        w0.e();
        return w0;
    }
    
    @c1
    private void e() {
        synchronized (this.d) {
            this.d.clear();
            final String string = this.a.getString(this.b, "");
            if (!TextUtils.isEmpty((CharSequence)string) && string.contains(this.c)) {
                final String[] split = string.split(this.c, -1);
                final int length = split.length;
                int i;
                final int n = i = 0;
                if (length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    i = n;
                }
                while (i < length) {
                    final String e = split[i];
                    if (!TextUtils.isEmpty((CharSequence)e)) {
                        this.d.add(e);
                    }
                    ++i;
                }
            }
        }
    }
    
    @c1
    private void i() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, this.h()).commit();
        }
    }
    
    private void j() {
        this.e.execute(new v0(this));
    }
    
    public boolean a(@j0 final String e) {
        if (!TextUtils.isEmpty((CharSequence)e)) {
            if (!e.contains(this.c)) {
                synchronized (this.d) {
                    final boolean add = this.d.add(e);
                    this.c(add);
                    return add;
                }
            }
        }
        return false;
    }
    
    @k0
    public String f() {
        synchronized (this.d) {
            return this.d.peek();
        }
    }
    
    public boolean g(@k0 final Object o) {
        synchronized (this.d) {
            final boolean remove = this.d.remove(o);
            this.c(remove);
            return remove;
        }
    }
    
    @j0
    @w("internalQueue")
    public String h() {
        final StringBuilder sb = new StringBuilder();
        final Iterator<String> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append(this.c);
        }
        return sb.toString();
    }
}
