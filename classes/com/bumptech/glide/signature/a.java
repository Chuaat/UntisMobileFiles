// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.signature;

import com.bumptech.glide.util.m;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import androidx.annotation.j0;
import android.content.Context;
import com.bumptech.glide.load.g;

public final class a implements g
{
    private final int c;
    private final g d;
    
    private a(final int c, final g d) {
        this.c = c;
        this.d = d;
    }
    
    @j0
    public static g c(@j0 final Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 0x30, com.bumptech.glide.signature.b.c(context));
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof a;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final a a = (a)o;
            b3 = b2;
            if (this.c == a.c) {
                b3 = b2;
                if (this.d.equals(a.d)) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        return m.p(this.d, this.c);
    }
}
