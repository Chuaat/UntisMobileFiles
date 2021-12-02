// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.util.logging.Level;
import c6.a;
import java.io.InputStream;
import java.util.logging.Logger;

public final class s
{
    static final Logger a;
    
    static {
        a = Logger.getLogger(s.class.getName());
    }
    
    private s() {
    }
    
    public static void a(@a final InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        }
        catch (IOException thrown) {
            try {
                s.a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", thrown);
            }
            catch (IOException detailMessage) {
                throw new AssertionError((Object)detailMessage);
            }
        }
    }
}
