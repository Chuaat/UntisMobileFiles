// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.work.impl.model.r;
import android.os.Build$VERSION;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.j0;

public final class s extends f0
{
    s(final a a) {
        super(a.b, a.c, a.d);
    }
    
    @j0
    public static s e(@j0 final Class<? extends ListenableWorker> clazz) {
        return ((f0.a<B, s>)new a(clazz)).b();
    }
    
    @j0
    public static List<s> f(@j0 final List<Class<? extends ListenableWorker>> list) {
        final ArrayList<s> list2 = new ArrayList<s>(list.size());
        final Iterator<Class<? extends ListenableWorker>> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new a(iterator.next()).b());
        }
        return list2;
    }
    
    public static final class a extends f0.a<a, s>
    {
        public a(@j0 final Class<? extends ListenableWorker> clazz) {
            super(clazz);
            super.c.d = OverwritingInputMerger.class.getName();
        }
        
        @j0
        s q() {
            if (super.a && Build$VERSION.SDK_INT >= 23 && super.c.j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            final r c = super.c;
            if (c.q && Build$VERSION.SDK_INT >= 23 && c.j.h()) {
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
            return new s(this);
        }
        
        @j0
        a r() {
            return this;
        }
        
        @j0
        public a s(@j0 final Class<? extends o> clazz) {
            super.c.d = clazz.getName();
            return this;
        }
    }
}
