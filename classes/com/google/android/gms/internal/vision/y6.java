// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;

public class y6 extends IOException
{
    private z7 G;
    
    public y6(final String message) {
        super(message);
        this.G = null;
    }
    
    static y6 a() {
        return new y6("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    
    static y6 c() {
        return new y6("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    
    static y6 d() {
        return new y6("CodedInputStream encountered a malformed varint.");
    }
    
    static y6 e() {
        return new y6("Protocol message contained an invalid tag (zero).");
    }
    
    static y6 f() {
        return new y6("Protocol message end-group tag did not match expected tag.");
    }
    
    static b7 g() {
        return new b7("Protocol message tag had invalid wire type.");
    }
    
    static y6 h() {
        return new y6("Failed to parse the message.");
    }
    
    static y6 i() {
        return new y6("Protocol message had invalid UTF-8.");
    }
    
    public final y6 b(final z7 g) {
        this.G = g;
        return this;
    }
}
