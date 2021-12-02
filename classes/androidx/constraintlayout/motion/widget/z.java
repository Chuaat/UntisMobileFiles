// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.e;

public class z
{
    private static final String a = "TransitionBuilder";
    
    public static u.b a(final u u, final int n, final int n2, final e e, final int n3, final e e2) {
        final u.b b = new u.b(n, u, n2, n3);
        b(u, b, e, e2);
        return b;
    }
    
    private static void b(final u u, final u.b b, final e e, final e e2) {
        final int i = b.I();
        final int b2 = b.B();
        u.j0(i, e);
        u.j0(b2, e2);
    }
    
    public static void c(final s s) {
        final u r0 = s.r0;
        if (r0 == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        }
        if (!r0.s0(s)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        }
        if (r0.c != null && !r0.s().isEmpty()) {
            return;
        }
        throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
    }
}
