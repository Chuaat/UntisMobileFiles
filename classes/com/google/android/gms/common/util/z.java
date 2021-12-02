// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.HashSet;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import androidx.annotation.RecentlyNonNull;
import java.util.Collection;
import f2.a;

@a
public final class z
{
    private z() {
    }
    
    @RecentlyNonNull
    @a
    public static Set<Scope> a(@RecentlyNonNull final Collection<String> collection) {
        x.l(collection, "scopeStrings can't be null.");
        return b((String[])collection.toArray(new String[collection.size()]));
    }
    
    @RecentlyNonNull
    @a
    public static Set<Scope> b(@RecentlyNonNull final String... array) {
        x.l(array, "scopeStrings can't be null.");
        final HashSet<Scope> set = new HashSet<Scope>(array.length);
        for (final String s : array) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                set.add(new Scope(s));
            }
        }
        return set;
    }
    
    @RecentlyNonNull
    @a
    public static String[] c(@RecentlyNonNull final Set<Scope> set) {
        x.l(set, "scopes can't be null.");
        return d(set.toArray(new Scope[set.size()]));
    }
    
    @RecentlyNonNull
    @a
    public static String[] d(@RecentlyNonNull final Scope[] array) {
        x.l(array, "scopes can't be null.");
        final String[] array2 = new String[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i].M();
        }
        return array2;
    }
}
