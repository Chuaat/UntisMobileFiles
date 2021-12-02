// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.io.PrintStream;

public final class z
{
    static final t a;
    
    static {
        final Integer n = null;
        Integer n2 = null;
        Integer n3 = n;
        x a2 = null;
        Label_0202: {
            try {
                try {
                    n2 = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                }
                catch (Exception ex) {
                    n3 = n;
                    System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                    n3 = n;
                    ex.printStackTrace(System.err);
                }
                if (n2 != null) {
                    n3 = n2;
                    if (n2 >= 19) {
                        n3 = n2;
                        n3 = n2;
                        final y y = new y();
                        n3 = n2;
                        break Label_0202;
                    }
                }
                n3 = n2;
                if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                    n3 = n2;
                    final w w = new w();
                    n3 = n2;
                }
                else {
                    n3 = n2;
                    final x x = new x();
                    n3 = n2;
                }
            }
            finally {
                final PrintStream err = System.err;
                final String name = x.class.getName();
                final StringBuilder sb = new StringBuilder(name.length() + 133);
                sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb.append(name);
                sb.append("will be used. The error is: ");
                err.println(sb.toString());
                final Throwable t;
                t.printStackTrace(System.err);
                a2 = new x();
            }
        }
        a = a2;
        if (n3 == null) {
            return;
        }
        n3;
    }
    
    public static void a(final Throwable t, final Throwable t2) {
        z.a.a(t, t2);
    }
}
