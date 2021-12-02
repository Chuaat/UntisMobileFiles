// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.PrintStream;

public final class m3
{
    private static final l3 a;
    private static final int b;
    
    static {
        int intValue = 1;
        Integer n = null;
        final a a4;
        Label_0146: {
            try {
                final Integer a2 = a();
                Label_0030: {
                    if (a2 == null) {
                        break Label_0030;
                    }
                    try {
                        if (a2 >= 19) {
                            final r3 r3 = new r3();
                            break Label_0146;
                        }
                        if (Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true) {
                            final p3 p3 = new p3();
                            break Label_0146;
                        }
                        final a a3 = new a();
                        break Label_0146;
                    }
                    finally {}
                }
            }
            finally {
                n = null;
            }
            final PrintStream err = System.err;
            final String name = a.class.getName();
            final StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            err.println(sb.toString());
            ((Throwable)a4).printStackTrace(System.err);
            a4 = new a();
        }
        a = a4;
        if (n != null) {
            intValue = n;
        }
        b = intValue;
    }
    
    private static Integer a() {
        try {
            return (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        }
        catch (Exception ex) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            ex.printStackTrace(System.err);
            return null;
        }
    }
    
    public static void b(final Throwable t) {
        m3.a.a(t);
    }
    
    public static void c(final Throwable t, final Throwable t2) {
        m3.a.b(t, t2);
    }
    
    static final class a extends l3
    {
        @Override
        public final void a(final Throwable t) {
            t.printStackTrace();
        }
        
        @Override
        public final void b(final Throwable t, final Throwable t2) {
        }
    }
}
