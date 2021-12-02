// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import x1.a;
import x1.i;
import e6.b;
import x1.h;

@h
public abstract class e
{
    @b("SQLITE_DB_NAME")
    @i
    static String a() {
        return "com.google.android.datatransport.events";
    }
    
    @b("SCHEMA_VERSION")
    @i
    static int c() {
        return i0.T;
    }
    
    @i
    static d d() {
        return d.f;
    }
    
    @a
    abstract c b(final c0 p0);
    
    @a
    abstract b2.b e(final c0 p0);
}
