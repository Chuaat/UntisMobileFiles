// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import android.util.Log;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri$Builder;
import androidx.annotation.k0;
import android.net.Uri;
import android.content.ServiceConnection;
import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@f2.a
public abstract class m
{
    private static int a = 4225;
    private static final Object b;
    private static m c;
    
    static {
        b = new Object();
    }
    
    @RecentlyNonNull
    @f2.a
    public static int c() {
        return m.a;
    }
    
    @RecentlyNonNull
    @f2.a
    public static m d(@RecentlyNonNull final Context context) {
        synchronized (m.b) {
            if (m.c == null) {
                m.c = new j1(context.getApplicationContext());
            }
            return m.c;
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean a(@RecentlyNonNull final ComponentName componentName, @RecentlyNonNull final ServiceConnection serviceConnection, @RecentlyNonNull final String s) {
        return this.h(new a(componentName, c()), serviceConnection, s);
    }
    
    @RecentlyNonNull
    @f2.a
    public boolean b(@RecentlyNonNull final String s, @RecentlyNonNull final ServiceConnection serviceConnection, @RecentlyNonNull final String s2) {
        return this.h(new a(s, c()), serviceConnection, s2);
    }
    
    @f2.a
    public void e(@RecentlyNonNull final ComponentName componentName, @RecentlyNonNull final ServiceConnection serviceConnection, @RecentlyNonNull final String s) {
        this.i(new a(componentName, c()), serviceConnection, s);
    }
    
    @f2.a
    public void f(@RecentlyNonNull final String s, @RecentlyNonNull final ServiceConnection serviceConnection, @RecentlyNonNull final String s2) {
        this.i(new a(s, c()), serviceConnection, s2);
    }
    
    public final void g(@RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final int n, @RecentlyNonNull final ServiceConnection serviceConnection, @RecentlyNonNull final String s3, @RecentlyNonNull final boolean b) {
        this.i(new a(s, s2, n, b), serviceConnection, s3);
    }
    
    protected abstract boolean h(final a p0, final ServiceConnection p1, final String p2);
    
    protected abstract void i(final a p0, final ServiceConnection p1, final String p2);
    
    protected static final class a
    {
        private static final Uri f;
        @k0
        private final String a;
        @k0
        private final String b;
        @k0
        private final ComponentName c;
        private final int d;
        private final boolean e;
        
        static {
            f = new Uri$Builder().scheme("content").authority("com.google.android.gms.chimera").build();
        }
        
        public a(final ComponentName componentName, final int d) {
            this.a = null;
            this.b = null;
            this.c = x.k(componentName);
            this.d = d;
            this.e = false;
        }
        
        public a(final String s, final int n) {
            this(s, "com.google.android.gms", n);
        }
        
        private a(final String s, final String s2, final int n) {
            this(s, s2, n, false);
        }
        
        public a(final String s, final String s2, final int d, final boolean e) {
            this.a = x.g(s);
            this.b = x.g(s2);
            this.c = null;
            this.d = d;
            this.e = e;
        }
        
        @k0
        private final Intent d(final Context context) {
            final Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.a);
            final Intent intent = null;
            Bundle call;
            try {
                call = context.getContentResolver().call(m.a.f, "serviceIntentCall", (String)null, bundle);
            }
            catch (IllegalArgumentException obj) {
                final String value = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(value.length() + 34);
                sb.append("Dynamic intent resolution failed: ");
                sb.append(value);
                Log.w("ConnectionStatusConfig", sb.toString());
                call = null;
            }
            Intent intent2;
            if (call == null) {
                intent2 = intent;
            }
            else {
                intent2 = (Intent)call.getParcelable("serviceResponseIntentKey");
            }
            if (intent2 == null) {
                final String value2 = String.valueOf(this.a);
                String concat;
                if (value2.length() != 0) {
                    concat = "Dynamic lookup for intent failed for action: ".concat(value2);
                }
                else {
                    concat = new String("Dynamic lookup for intent failed for action: ");
                }
                Log.w("ConnectionStatusConfig", concat);
            }
            return intent2;
        }
        
        public final Intent a(final Context context) {
            Intent intent;
            if (this.a != null) {
                Intent d;
                if (this.e) {
                    d = this.d(context);
                }
                else {
                    d = null;
                }
                intent = d;
                if (d == null) {
                    intent = new Intent(this.a).setPackage(this.b);
                }
            }
            else {
                intent = new Intent().setComponent(this.c);
            }
            return intent;
        }
        
        @k0
        public final String b() {
            return this.b;
        }
        
        @k0
        public final ComponentName c() {
            return this.c;
        }
        
        public final int e() {
            return this.d;
        }
        
        @Override
        public final boolean equals(@k0 final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return v.b(this.a, a.a) && v.b(this.b, a.b) && v.b(this.c, a.c) && this.d == a.d && this.e == a.e;
        }
        
        @Override
        public final int hashCode() {
            return v.c(this.a, this.b, this.c, this.d, this.e);
        }
        
        @Override
        public final String toString() {
            String s;
            if ((s = this.a) == null) {
                x.k(this.c);
                s = this.c.flattenToString();
            }
            return s;
        }
    }
}
