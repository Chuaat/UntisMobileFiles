// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class q8 implements x7
{
    private final z7 a;
    private final String b;
    private final Object[] c;
    private final int d;
    
    q8(final z7 a, final String b, final Object[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final char char1 = b.charAt(0);
        if (char1 < '\ud800') {
            this.d = char1;
            return;
        }
        int n = char1 & '\u1fff';
        int n2 = 13;
        int index = 1;
        char char2;
        while (true) {
            char2 = b.charAt(index);
            if (char2 < '\ud800') {
                break;
            }
            n |= (char2 & '\u1fff') << n2;
            n2 += 13;
            ++index;
        }
        this.d = (n | char2 << n2);
    }
    
    @Override
    public final z7 a() {
        return this.a;
    }
    
    final String b() {
        return this.b;
    }
    
    final Object[] c() {
        return this.c;
    }
    
    @Override
    public final int zza() {
        if ((this.d & 0x1) == 0x1) {
            return o8.a;
        }
        return o8.b;
    }
    
    @Override
    public final boolean zzb() {
        return (this.d & 0x2) == 0x2;
    }
}
