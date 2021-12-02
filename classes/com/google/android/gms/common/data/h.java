// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;
import java.util.ArrayList;
import f2.a;
import androidx.annotation.RecentlyNonNull;

public final class h
{
    @RecentlyNonNull
    @a
    public static final String a = "next_page_token";
    @RecentlyNonNull
    @a
    public static final String b = "prev_page_token";
    
    private h() {
    }
    
    @RecentlyNonNull
    public static <T, E extends j<T>> ArrayList<T> a(@RecentlyNonNull final b<E> b) {
        final ArrayList<T> list = new ArrayList<T>(b.getCount());
        try {
            final Iterator<E> iterator = b.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().B1());
            }
            return list;
        }
        finally {
            b.close();
        }
    }
    
    @RecentlyNonNull
    public static boolean b(@RecentlyNonNull final b<?> b) {
        return b != null && b.getCount() > 0;
    }
    
    @RecentlyNonNull
    public static boolean c(@RecentlyNonNull final b<?> b) {
        final Bundle u = b.u();
        return u != null && u.getString("next_page_token") != null;
    }
    
    @RecentlyNonNull
    public static boolean d(@RecentlyNonNull final b<?> b) {
        final Bundle u = b.u();
        return u != null && u.getString("prev_page_token") != null;
    }
}
