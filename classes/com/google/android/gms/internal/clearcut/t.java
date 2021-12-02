// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public abstract class t<MessageType extends t<MessageType, BuilderType>, BuilderType extends u<MessageType, BuilderType>> implements s2
{
    private static boolean zzey = false;
    protected int zzex;
    
    public t() {
        this.zzex = 0;
    }
    
    void e(final int n) {
        throw new UnsupportedOperationException();
    }
    
    int h() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final d0 l() {
        try {
            final i0 q = d0.q(this.f());
            this.c(q.b());
            return q.a();
        }
        catch (IOException cause) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
}
