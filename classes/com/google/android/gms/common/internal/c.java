// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import androidx.annotation.j0;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.b;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import f2.a;

@a
public class c
{
    @j0
    @a
    public static b a(@RecentlyNonNull final Status status) {
        if (status.j2()) {
            return new q(status);
        }
        return new b(status);
    }
}
