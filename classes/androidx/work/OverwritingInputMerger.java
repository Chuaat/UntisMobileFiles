// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import androidx.annotation.j0;
import java.util.List;

public final class OverwritingInputMerger extends o
{
    @j0
    @Override
    public f b(@j0 final List<f> list) {
        final f.a a = new f.a();
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        final Iterator<f> iterator = list.iterator();
        while (iterator.hasNext()) {
            hashMap.putAll(iterator.next().r());
        }
        a.d((Map<String, Object>)hashMap);
        return a.a();
    }
}
