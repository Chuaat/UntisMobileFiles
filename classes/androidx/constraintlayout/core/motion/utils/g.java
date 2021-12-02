// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

public class g
{
    HashMap<Object, HashMap<String, float[]>> a;
    
    public g() {
        this.a = new HashMap<Object, HashMap<String, float[]>>();
    }
    
    public float a(final Object o, final String s, final int n) {
        if (!this.a.containsKey(o)) {
            return Float.NaN;
        }
        final HashMap<String, float[]> hashMap = this.a.get(o);
        if (hashMap != null) {
            if (hashMap.containsKey(s)) {
                final float[] array = hashMap.get(s);
                if (array == null) {
                    return Float.NaN;
                }
                if (array.length > n) {
                    return array[n];
                }
            }
        }
        return Float.NaN;
    }
    
    public void b(final Object key, final String key2, final int n, final float n2) {
        HashMap<String, float[]> value;
        if (!this.a.containsKey(key)) {
            value = new HashMap<String, float[]>();
            final float[] value2 = new float[n + 1];
            value2[n] = n2;
            value.put(key2, value2);
        }
        else {
            if ((value = this.a.get(key)) == null) {
                value = new HashMap<String, float[]>();
            }
            if (value.containsKey(key2)) {
                float[] original;
                if ((original = value.get(key2)) == null) {
                    original = new float[0];
                }
                float[] copy = original;
                if (original.length <= n) {
                    copy = Arrays.copyOf(original, n + 1);
                }
                copy[n] = n2;
                value.put(key2, copy);
                return;
            }
            final float[] value3 = new float[n + 1];
            value3[n] = n2;
            value.put(key2, value3);
        }
        this.a.put(key, value);
    }
}
