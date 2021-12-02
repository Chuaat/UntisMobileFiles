// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import f2.a;
import com.google.android.gms.common.api.internal.y;

@a
public class m implements y
{
    @RecentlyNonNull
    @Override
    public Exception a(@RecentlyNonNull final Status status) {
        if (status.q1() == 8) {
            return new l(status.U3());
        }
        return new c(status.U3());
    }
}
