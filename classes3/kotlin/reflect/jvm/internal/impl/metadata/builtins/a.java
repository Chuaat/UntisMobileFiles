// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.t0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.ranges.k;
import java.io.DataInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import m6.d;
import org.jetbrains.annotations.e;

public final class a extends a
{
    @e
    public static final a g;
    @d
    @e
    public static final a h;
    @d
    @e
    public static final a i;
    
    static {
        g = new a(null);
        h = new a(new int[] { 1, 0, 7 });
        i = new a(new int[0]);
    }
    
    public a(@e final int... array) {
        k0.p((Object)array, "numbers");
        final int[] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        super(array2);
    }
    
    public boolean h() {
        return this.f(a.h);
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.metadata.builtins.a a(@e final InputStream in) {
            k0.p((Object)in, "stream");
            final DataInputStream dataInputStream = new DataInputStream(in);
            final k k = new k(1, dataInputStream.readInt());
            final ArrayList list = new ArrayList<Integer>(v.Y((Iterable)k, 10));
            final Iterator iterator = ((Iterable)k).iterator();
            while (iterator.hasNext()) {
                ((t0)iterator).b();
                list.add(Integer.valueOf(dataInputStream.readInt()));
            }
            final int[] h5 = v.H5((Collection)list);
            final int[] array = new int[h5.length];
            System.arraycopy(h5, 0, array, 0, h5.length);
            return new kotlin.reflect.jvm.internal.impl.metadata.builtins.a(array);
        }
    }
}
