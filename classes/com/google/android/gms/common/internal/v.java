// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import androidx.annotation.k0;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;
import androidx.annotation.RecentlyNonNull;
import android.os.Bundle;
import f2.a;

@f2.a
public final class v
{
    private v() {
        throw new AssertionError((Object)"Uninstantiable");
    }
    
    @RecentlyNonNull
    @f2.a
    public static boolean a(@RecentlyNonNull final Bundle bundle, @RecentlyNonNull final Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        final Set keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (final String s : keySet) {
            if (!b(bundle.get(s), bundle2.get(s))) {
                return false;
            }
        }
        return true;
    }
    
    @RecentlyNonNull
    @f2.a
    public static boolean b(@k0 final Object o, @k0 final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    @RecentlyNonNull
    @f2.a
    public static int c(@RecentlyNonNull final Object... a) {
        return Arrays.hashCode(a);
    }
    
    @RecentlyNonNull
    @f2.a
    public static a d(@RecentlyNonNull final Object o) {
        return new a(o, null);
    }
    
    @f2.a
    public static final class a
    {
        private final List<String> a;
        private final Object b;
        
        private a(final Object o) {
            this.b = x.k(o);
            this.a = new ArrayList<String>();
        }
        
        @RecentlyNonNull
        @f2.a
        public final a a(@RecentlyNonNull String s, @k0 final Object obj) {
            final List<String> a = this.a;
            s = x.k(s);
            final String value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 1 + value.length());
            sb.append(s);
            sb.append("=");
            sb.append(value);
            a.add(sb.toString());
            return this;
        }
        
        @RecentlyNonNull
        @f2.a
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder(100);
            sb.append(this.b.getClass().getSimpleName());
            sb.append('{');
            for (int size = this.a.size(), i = 0; i < size; ++i) {
                sb.append(this.a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }
}
