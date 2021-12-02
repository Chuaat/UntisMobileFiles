// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import org.bson.types.Decimal128;

class c0
{
    private final Object a;
    private final d0 b;
    
    c0(final d0 b, final Object a) {
        this.a = a;
        this.b = b;
    }
    
    public d0 a() {
        return this.b;
    }
    
    public Object b() {
        return this.a;
    }
    
    public <T> T c(final Class<T> clazz) {
        Label_0052: {
            if (Long.class != clazz) {
                break Label_0052;
            }
            try {
                final Object a = this.a;
                if (a instanceof Integer) {
                    return (T)clazz.cast((long)a);
                }
                if (a instanceof String) {
                    return (T)clazz.cast(Long.valueOf((String)a));
                }
                Label_0236: {
                    return (T)clazz.cast(this.a);
                }
                // iftrue(Label_0082:, Integer.class != clazz)
                // iftrue(Label_0155:, !a2 instanceof Integer)
                // iftrue(Label_0236:, !a3 instanceof String)
                // iftrue(Label_0236:, Decimal128.class != clazz)
                // iftrue(Label_0236:, !a2 instanceof String)
                // iftrue(Label_0186:, !a2 instanceof Long)
                while (true) {
                    Block_5: {
                        break Block_5;
                        Object a2;
                        while (true) {
                            a2 = this.a;
                            return (T)clazz.cast(new Decimal128((int)this.a));
                            final Object a3 = this.a;
                            return (T)clazz.cast(Double.valueOf((String)a3));
                            Label_0112:
                            continue;
                        }
                        Label_0217:
                        return (T)clazz.cast(Decimal128.y((String)a2));
                        Label_0155:
                        return (T)clazz.cast(new Decimal128((long)this.a));
                    }
                    final Object a4 = this.a;
                    return (T)clazz.cast(Integer.valueOf((String)a4));
                    Object a2 = null;
                    Label_0186:
                    return (T)clazz.cast(new org.bson.c0((double)a2).X0());
                    Label_0082:
                    continue;
                }
            }
            // iftrue(Label_0236:, !a4 instanceof String)
            // iftrue(Label_0217:, !a2 instanceof Double)
            // iftrue(Label_0112:, Double.class != clazz)
            catch (Exception ex) {
                throw new v(String.format("Exception converting value '%s' to type %s", this.a, clazz.getName()), new Object[] { ex });
            }
        }
    }
}
