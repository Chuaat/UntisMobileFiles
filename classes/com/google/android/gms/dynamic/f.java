// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import android.os.IInterface;
import android.os.IBinder;
import com.google.android.gms.common.internal.x;
import java.lang.reflect.Field;
import androidx.annotation.RecentlyNonNull;
import f2.a;
import com.google.android.gms.common.util.y;

@y
@a
public final class f<T> extends d.a
{
    private final T f;
    
    private f(final T f) {
        this.f = f;
    }
    
    @RecentlyNonNull
    @a
    public static <T> T y2(@RecentlyNonNull final d d) {
        if (d instanceof f) {
            return (T)((f)d).f;
        }
        final IBinder binder = ((IInterface)d).asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        Field field = null;
        final int length = declaredFields.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            final Field field2 = declaredFields[i];
            int n2 = n;
            if (!field2.isSynthetic()) {
                n2 = n + 1;
                field = field2;
            }
            ++i;
            n = n2;
        }
        if (n == 1) {
            if (!x.k(field).isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T)field.get(binder);
                }
                catch (IllegalAccessException cause) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", cause);
                }
                catch (NullPointerException cause2) {
                    throw new IllegalArgumentException("Binder object is null.", cause2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        final int length2 = declaredFields.length;
        final StringBuilder sb = new StringBuilder(64);
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @RecentlyNonNull
    @a
    public static <T> d z2(@RecentlyNonNull final T t) {
        return new f<Object>(t);
    }
}
