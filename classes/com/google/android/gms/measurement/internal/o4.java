// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.util.List;
import com.google.android.gms.internal.measurement.gg;

final class o4 implements gg
{
    final /* synthetic */ q4 a;
    
    o4(final q4 a) {
        this.a = a;
    }
    
    @Override
    public final void a(int size, final String s, final List<String> list, final boolean b, final boolean b2) {
        l3 l3;
        if (--size != 0) {
            if (size != 1) {
                if (size != 3) {
                    if (size != 4) {
                        l3 = this.a.a.c().r();
                    }
                    else {
                        final n3 c = this.a.a.c();
                        if (b) {
                            l3 = c.v();
                        }
                        else if (!b2) {
                            l3 = c.u();
                        }
                        else {
                            l3 = c.t();
                        }
                    }
                }
                else {
                    l3 = this.a.a.c().s();
                }
            }
            else {
                final n3 c2 = this.a.a.c();
                if (b) {
                    l3 = c2.q();
                }
                else if (!b2) {
                    l3 = c2.p();
                }
                else {
                    l3 = c2.o();
                }
            }
        }
        else {
            l3 = this.a.a.c().n();
        }
        size = list.size();
        if (size == 1) {
            l3.b(s, list.get(0));
            return;
        }
        if (size == 2) {
            l3.c(s, list.get(0), list.get(1));
            return;
        }
        if (size != 3) {
            l3.a(s);
            return;
        }
        l3.d(s, list.get(0), list.get(1), list.get(2));
    }
}
