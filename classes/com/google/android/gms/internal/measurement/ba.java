// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

final class ba extends fa
{
    private static final Class<?> c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    private ba() {
        super(null);
    }
    
    @Override
    final void a(final Object o, final long n) {
        final List list = (List)fc.k(o, n);
        List<Object> list2;
        if (list instanceof z9) {
            list2 = (List<Object>)((z9)list).e();
        }
        else {
            if (ba.c.isAssignableFrom(((r9<? extends T>)list).getClass())) {
                return;
            }
            if (list instanceof za && list instanceof r9) {
                final r9<? extends T> r9 = (r9<? extends T>)list;
                if (r9.a()) {
                    r9.zzb();
                }
                return;
            }
            list2 = Collections.unmodifiableList((List<?>)list);
        }
        fc.x(o, n, list2);
    }
    
    @Override
    final <E> void b(final Object o, final Object o2, final long n) {
        final List list = (List)fc.k(o2, n);
        final int size = list.size();
        final List c = (List)fc.k(o, n);
        Object o3 = null;
        Label_0269: {
            Label_0102: {
                if (!c.isEmpty()) {
                    if (ba.c.isAssignableFrom(((ArrayList<String>)c).getClass())) {
                        o3 = new ArrayList<Object>(c.size() + size);
                        ((ArrayList<Object>)o3).addAll(c);
                    }
                    else if (c instanceof ac) {
                        o3 = new y9(c.size() + size);
                        ((r7<Object>)o3).addAll(((y9)o3).size(), c);
                    }
                    else {
                        o3 = c;
                        if (!(c instanceof za)) {
                            break Label_0269;
                        }
                        o3 = c;
                        if (!(c instanceof r9)) {
                            break Label_0269;
                        }
                        final y9 y9 = (y9)c;
                        o3 = c;
                        if (!y9.a()) {
                            o3 = ((r9<Object>)y9).s0(c.size() + size);
                            break Label_0102;
                        }
                        break Label_0269;
                    }
                    fc.x(o, n, o3);
                    break Label_0269;
                }
                if (c instanceof z9) {
                    o3 = new y9(size);
                }
                else if (c instanceof za && c instanceof r9) {
                    o3 = ((r9<Object>)c).s0(size);
                }
                else {
                    o3 = new ArrayList<Object>(size);
                }
            }
            fc.x(o, n, o3);
        }
        final int size2 = ((List)o3).size();
        final int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            ((List<Object>)o3).addAll(list);
        }
        if (size2 <= 0) {
            o3 = list;
        }
        fc.x(o, n, o3);
    }
}
