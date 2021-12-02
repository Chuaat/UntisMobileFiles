// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.annotation.k0;
import androidx.annotation.j0;
import androidx.annotation.b0;
import java.util.Locale;

interface k
{
    @b0(from = -1L)
    int a(final Locale p0);
    
    String b();
    
    Object c();
    
    @k0
    Locale d(@j0 final String[] p0);
    
    Locale get(final int p0);
    
    boolean isEmpty();
    
    @b0(from = 0L)
    int size();
}
