// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public class r1 extends IOException
{
    private s2 G;
    
    public r1(final String message) {
        super(message);
        this.G = null;
    }
    
    static r1 a() {
        return new r1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    
    static r1 b() {
        return new r1("Protocol message contained an invalid tag (zero).");
    }
    
    static s1 c() {
        return new s1("Protocol message tag had invalid wire type.");
    }
    
    static r1 d() {
        return new r1("Failed to parse the message.");
    }
    
    static r1 e() {
        return new r1("Protocol message had invalid UTF-8.");
    }
    
    public final r1 f(final s2 g) {
        this.G = g;
        return this;
    }
}
