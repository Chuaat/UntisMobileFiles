// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import x1.i;
import e6.f;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import x1.h;

@h
abstract class j
{
    @f
    @i
    static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
