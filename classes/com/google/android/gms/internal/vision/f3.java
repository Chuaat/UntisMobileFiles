// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Iterator;
import java.util.Set;

public final class f3
{
    static int a(final Set<?> set) {
        final Iterator<?> iterator = set.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            }
            else {
                hashCode = 0;
            }
            n = ~(~(n + hashCode));
        }
        return n;
    }
    
    static boolean b(final Set<?> set, @NullableDecl final Object o) {
        if (set == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set2 = (Set)o;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        }
        catch (NullPointerException | ClassCastException ex) {
            return false;
        }
    }
}
