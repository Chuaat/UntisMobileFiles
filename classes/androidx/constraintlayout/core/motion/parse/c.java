// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.parse;

import java.io.PrintStream;
import androidx.constraintlayout.core.parser.f;
import androidx.constraintlayout.core.parser.h;
import androidx.constraintlayout.core.parser.d;
import androidx.constraintlayout.core.parser.g;
import androidx.constraintlayout.core.motion.utils.u;

public class c
{
    public static void a(final String[] array) {
        c("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }
    
    private static u b(String x, final b b, final a a) {
        final u u = new u();
        try {
            final f d = g.d(x);
            for (int size = d.size(), i = 0; i < size; ++i) {
                final d d2 = (d)d.E(i);
                x = d2.f();
                final androidx.constraintlayout.core.parser.c l0 = d2.l0();
                final int j = b.j(x);
                if (j == -1) {
                    final PrintStream err = System.err;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unknown type ");
                    sb.append(x);
                    err.println(sb.toString());
                }
                else {
                    final int value = a.get(j);
                    if (value != 1) {
                        PrintStream printStream;
                        if (value != 2) {
                            if (value != 4) {
                                if (value != 8) {
                                    continue;
                                }
                                u.c(j, l0.f());
                                printStream = System.out;
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("parse ");
                                sb2.append(x);
                                sb2.append(" STRING_MASK > ");
                                sb2.append(l0.f());
                                x = sb2.toString();
                            }
                            else {
                                u.a(j, l0.l());
                                printStream = System.out;
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("parse ");
                                sb3.append(x);
                                sb3.append(" FLOAT_MASK > ");
                                sb3.append(l0.l());
                                x = sb3.toString();
                            }
                        }
                        else {
                            u.b(j, l0.m());
                            printStream = System.out;
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("parse ");
                            sb4.append(x);
                            sb4.append(" INT_MASK > ");
                            sb4.append(l0.m());
                            x = sb4.toString();
                        }
                        printStream.println(x);
                    }
                    else {
                        u.d(j, d.J(i));
                    }
                }
            }
        }
        catch (h h) {
            h.printStackTrace();
        }
        return u;
    }
    
    public static u c(final String s) {
        return b(s, (b)androidx.constraintlayout.core.motion.parse.b.a, (a)androidx.constraintlayout.core.motion.parse.a.a);
    }
    
    private interface a
    {
        int get(final int p0);
    }
    
    private interface b
    {
        int j(final String p0);
    }
}
