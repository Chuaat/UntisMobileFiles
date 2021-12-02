// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class o8 extends IOException
{
    o8() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
    
    o8(String message, final Throwable cause) {
        message = String.valueOf(message);
        if (message.length() != 0) {
            message = "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(message);
        }
        else {
            message = new String("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        }
        super(message, cause);
    }
    
    o8(final Throwable cause) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", cause);
    }
}
