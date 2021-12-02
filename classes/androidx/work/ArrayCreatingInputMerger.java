// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import androidx.annotation.j0;
import java.util.List;
import java.lang.reflect.Array;

public final class ArrayCreatingInputMerger extends o
{
    private Object c(final Object o, final Object o2) {
        final int length = Array.getLength(o);
        final Object instance = Array.newInstance(o2.getClass(), length + 1);
        System.arraycopy(o, 0, instance, 0, length);
        Array.set(instance, length, o2);
        return instance;
    }
    
    private Object d(final Object o, final Object o2) {
        final int length = Array.getLength(o);
        final int length2 = Array.getLength(o2);
        final Object instance = Array.newInstance(o.getClass().getComponentType(), length + length2);
        System.arraycopy(o, 0, instance, 0, length);
        System.arraycopy(o2, 0, instance, length, length2);
        return instance;
    }
    
    private Object e(final Object o, final Object o2) {
        final Object instance = Array.newInstance(o.getClass(), 2);
        Array.set(instance, 0, o);
        Array.set(instance, 1, o2);
        return instance;
    }
    
    private Object f(final Object o) {
        final Object instance = Array.newInstance(o.getClass(), 1);
        Array.set(instance, 0, o);
        return instance;
    }
    
    @j0
    @Override
    public f b(@j0 final List<f> list) {
        final f.a a = new f.a();
        final HashMap<String, Object> hashMap = (HashMap<String, Object>)new HashMap<Object, Object>();
        final Iterator<f> iterator = list.iterator();
        while (iterator.hasNext()) {
            for (final Map.Entry<String, Object> entry : iterator.next().r().entrySet()) {
                final String s = entry.getKey();
                Object o = entry.getValue();
                final Class<?> class1 = o.getClass();
                final Object value = hashMap.get(s);
                if (value == null) {
                    if (!class1.isArray()) {
                        o = this.f(o);
                    }
                }
                else {
                    final Class<?> class2 = value.getClass();
                    if (class2.equals(class1)) {
                        if (class2.isArray()) {
                            o = this.d(value, o);
                        }
                        else {
                            o = this.e(value, o);
                        }
                    }
                    else if (class2.isArray() && class2.getComponentType().equals(class1)) {
                        o = this.c(value, o);
                    }
                    else {
                        if (!class1.isArray() || !class1.getComponentType().equals(class2)) {
                            throw new IllegalArgumentException();
                        }
                        o = this.c(o, value);
                    }
                }
                hashMap.put(s, o);
            }
        }
        a.d(hashMap);
        return a.a();
    }
}
