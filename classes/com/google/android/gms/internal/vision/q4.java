// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;

public abstract class q4<MessageType extends r4<MessageType, BuilderType>, BuilderType extends q4<MessageType, BuilderType>> implements c8
{
    public abstract BuilderType b();
    
    protected abstract BuilderType c(final MessageType p0);
    
    public abstract BuilderType d(final s5 p0, final b6 p1) throws IOException;
    
    public BuilderType f(final byte[] array, final int n, final int n2, final b6 b6) throws y6 {
        try {
            final s5 c = s5.c(array, 0, n2, false);
            this.d(c, b6);
            c.d(0);
            return (BuilderType)this;
        }
        catch (IOException cause) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder(name.length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), cause);
        }
        catch (y6 y6) {
            throw y6;
        }
    }
}
