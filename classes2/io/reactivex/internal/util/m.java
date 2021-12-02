// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public enum m implements Callable<Map<Object, Object>>
{
    G;
    
    public static <K, V> Callable<Map<K, V>> b() {
        return (Callable<Map<K, V>>)m.G;
    }
    
    public Map<Object, Object> d() throws Exception {
        return new HashMap<Object, Object>();
    }
}
