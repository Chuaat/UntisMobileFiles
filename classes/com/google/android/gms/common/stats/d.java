// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.stats;

import java.util.List;
import android.content.Intent;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.d0;
import f2.a;

@Deprecated
@a
public class d
{
    private static d a;
    @d0
    private static boolean b;
    
    static {
        d.a = new d();
        d.b = false;
    }
    
    @RecentlyNonNull
    @a
    public static d a() {
        return d.a;
    }
    
    @a
    public void b(@RecentlyNonNull final Context context, @RecentlyNonNull final Intent intent, @RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final String s3, @RecentlyNonNull final int n, @RecentlyNonNull final String s4) {
    }
    
    @a
    public void c(@RecentlyNonNull final Context context, @RecentlyNonNull final String s, @RecentlyNonNull final String s2, @RecentlyNonNull final String s3, @RecentlyNonNull final int n, @RecentlyNonNull final List<String> list, @RecentlyNonNull final boolean b, @RecentlyNonNull final long n2) {
    }
    
    @a
    public void d(@RecentlyNonNull final Context context, @RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final String s2, @RecentlyNonNull final String s3, @RecentlyNonNull final String s4, @RecentlyNonNull final int n2, @RecentlyNonNull final List<String> list) {
    }
    
    @a
    public void e(@RecentlyNonNull final Context context, @RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final String s2, @RecentlyNonNull final String s3, @RecentlyNonNull final String s4, @RecentlyNonNull final int n2, @RecentlyNonNull final List<String> list, @RecentlyNonNull final long n3) {
    }
    
    @a
    public void f(@RecentlyNonNull final Context context, @RecentlyNonNull final Intent intent) {
    }
}
