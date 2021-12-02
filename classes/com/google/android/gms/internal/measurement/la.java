// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.List;

public final class la extends n
{
    private final c H;
    
    public la(final c h) {
        this.H = h;
    }
    
    @Override
    public final q i(String s, final g5 g5, final List<q> list) {
        int n = 0;
        Label_0160: {
            switch (s.hashCode()) {
                case 1570616835: {
                    if (s.equals("setEventName")) {
                        n = 4;
                        break Label_0160;
                    }
                    break;
                }
                case 920706790: {
                    if (s.equals("setParamValue")) {
                        n = 5;
                        break Label_0160;
                    }
                    break;
                }
                case 700587132: {
                    if (s.equals("getParams")) {
                        n = 2;
                        break Label_0160;
                    }
                    break;
                }
                case 146575578: {
                    if (s.equals("getParamValue")) {
                        n = 1;
                        break Label_0160;
                    }
                    break;
                }
                case 45521504: {
                    if (s.equals("getTimestamp")) {
                        n = 3;
                        break Label_0160;
                    }
                    break;
                }
                case 21624207: {
                    if (s.equals("getEventName")) {
                        n = 0;
                        break Label_0160;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            h6.h("getEventName", 0, list);
            return new u(this.H.b().d());
        }
        if (n == 1) {
            h6.h("getParamValue", 1, list);
            s = g5.b(list.get(0)).k();
            return i7.b(this.H.b().c(s));
        }
        if (n == 2) {
            h6.h("getParams", 0, list);
            final Map<String, Object> e = this.H.b().e();
            final n n2 = new n();
            for (final String s2 : e.keySet()) {
                n2.f(s2, i7.b(e.get(s2)));
            }
            return n2;
        }
        if (n == 3) {
            h6.h("getTimestamp", 0, list);
            return new i(Double.valueOf(this.H.b().a()));
        }
        if (n != 4) {
            if (n != 5) {
                return super.i(s, g5, list);
            }
            h6.h("setParamValue", 2, list);
            s = g5.b(list.get(0)).k();
            final q b = g5.b(list.get(1));
            this.H.b().g(s, h6.f(b));
            return b;
        }
        else {
            h6.h("setEventName", 1, list);
            final q b2 = g5.b(list.get(0));
            if (!q.f.equals(b2) && !q.g.equals(b2)) {
                this.H.b().f(b2.k());
                return new u(b2.k());
            }
            throw new IllegalArgumentException("Illegal event name");
        }
    }
}
