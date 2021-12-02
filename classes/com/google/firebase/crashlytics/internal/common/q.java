// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.f;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.firebase.crashlytics.internal.settings.e;

class q implements UncaughtExceptionHandler
{
    private final a a;
    private final e b;
    private final UncaughtExceptionHandler c;
    private final AtomicBoolean d;
    
    public q(final a a, final e b, final UncaughtExceptionHandler c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = new AtomicBoolean(false);
    }
    
    boolean a() {
        return this.d.get();
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        this.d.set(true);
        Label_0037: {
            if (thread != null) {
                break Label_0037;
            }
        Label_0067_Outer:
            while (true) {
                try {
                    try {
                        final f f = com.google.firebase.crashlytics.internal.f.f();
                        final String s = "Could not handle uncaught exception; null thread";
                        f.d(s);
                    }
                    finally {}
                }
                catch (Exception ex) {
                    f.f().e("An error occurred in the uncaught exception handler", ex);
                Block_5_Outer:
                    while (true) {
                        f.f().b("Completed exception processing. Invoking default exception handler.");
                        this.c.uncaughtException(thread, t);
                        this.d.set(false);
                        return;
                        while (true) {
                            final f f = com.google.firebase.crashlytics.internal.f.f();
                            final String s = "Could not handle uncaught exception; null throwable";
                            continue Label_0067_Outer;
                            continue;
                        }
                        Label_0052: {
                            this.a.a(this.b, thread, t);
                        }
                        continue Block_5_Outer;
                    }
                }
                // iftrue(Label_0052:, t != null)
                break;
            }
        }
        return;
        f.f().b("Completed exception processing. Invoking default exception handler.");
        this.c.uncaughtException(thread, t);
        this.d.set(false);
    }
    
    interface a
    {
        void a(final e p0, final Thread p1, final Throwable p2);
    }
}
