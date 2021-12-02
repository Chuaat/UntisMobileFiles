// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;

public abstract class l implements kotlin.reflect.jvm.internal.impl.util.b
{
    @e
    private final String a;
    
    private l(final String a) {
        this.a = a;
    }
    
    @f
    @Override
    public String a(@e final y y) {
        return kotlin.reflect.jvm.internal.impl.util.b.a.a(this, y);
    }
    
    @e
    @Override
    public String getDescription() {
        return this.a;
    }
    
    public static final class a extends l
    {
        private final int b;
        
        public a(final int n) {
            final StringBuilder sb = new StringBuilder();
            sb.append("must have at least ");
            sb.append(n);
            sb.append(" value parameter");
            String str;
            if (n > 1) {
                str = "s";
            }
            else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), null);
            this.b = n;
        }
        
        @Override
        public boolean b(@e final y y) {
            k0.p((Object)y, "functionDescriptor");
            return ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m().size() >= this.b;
        }
    }
    
    public static final class b extends l
    {
        private final int b;
        
        public b(final int n) {
            final StringBuilder sb = new StringBuilder();
            sb.append("must have exactly ");
            sb.append(n);
            sb.append(" value parameters");
            super(sb.toString(), null);
            this.b = n;
        }
        
        @Override
        public boolean b(@e final y y) {
            k0.p((Object)y, "functionDescriptor");
            return ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m().size() == this.b;
        }
    }
    
    public static final class c extends l
    {
        @e
        public static final c b;
        
        static {
            b = new c();
        }
        
        private c() {
            super("must have no value parameters", null);
        }
        
        @Override
        public boolean b(@e final y y) {
            k0.p((Object)y, "functionDescriptor");
            return ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m().isEmpty();
        }
    }
    
    public static final class d extends l
    {
        @e
        public static final d b;
        
        static {
            b = new d();
        }
        
        private d() {
            super("must have a single value parameter", null);
        }
        
        @Override
        public boolean b(@e final y y) {
            k0.p((Object)y, "functionDescriptor");
            final int size = ((kotlin.reflect.jvm.internal.impl.descriptors.a)y).m().size();
            boolean b = true;
            if (size != 1) {
                b = false;
            }
            return b;
        }
    }
}
