// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class u9 extends IOException
{
    public u9(final String message) {
        super(message);
    }
    
    static t9 a() {
        return new t9("Protocol message tag had invalid wire type.");
    }
    
    static u9 b() {
        return new u9("Protocol message contained an invalid tag (zero).");
    }
    
    static u9 c() {
        return new u9("Protocol message had invalid UTF-8.");
    }
    
    static u9 d() {
        return new u9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    
    static u9 e() {
        return new u9("Failed to parse the message.");
    }
    
    static u9 f() {
        return new u9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
