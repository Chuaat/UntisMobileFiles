// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.lang.annotation.Annotation;

final class a0 implements f0
{
    private final int N1;
    private final e0 O1;
    
    a0(final int n1, final e0 o1) {
        this.N1 = n1;
        this.O1 = o1;
    }
    
    @Override
    public final Class<? extends Annotation> annotationType() {
        return f0.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f0)) {
            return false;
        }
        final f0 f0 = (f0)o;
        return this.N1 == f0.zza() && this.O1.equals(f0.zzb());
    }
    
    @Override
    public final int hashCode() {
        return (this.N1 ^ 0xDE0D66) + (this.O1.hashCode() ^ 0x79AD669E);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf");
        sb.append("(tag=");
        sb.append(this.N1);
        sb.append("intEncoding=");
        sb.append(this.O1);
        sb.append(')');
        return sb.toString();
    }
    
    @Override
    public final int zza() {
        return this.N1;
    }
    
    @Override
    public final e0 zzb() {
        return this.O1;
    }
}
