// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/i;", "", "", "G", "I", "d", "()I", "position", "<init>", "(Ljava/lang/String;II)V", "H", "a", "ALL", "ABSENT", "PRESENT", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum i
{
    @e
    public static final a H;
    
    I(0), 
    J(1), 
    K(2);
    
    private final int G;
    
    static {
        L = b();
        H = new a(null);
    }
    
    private i(final int g) {
        this.G = g;
    }
    
    private static final /* synthetic */ i[] b() {
        return new i[] { i.I, i.J, i.K };
    }
    
    public final int d() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/classbook/i$a", "", "", "value", "Lcom/untis/mobile/ui/activities/classbook/i;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final i a(final int n) {
            while (true) {
                for (final i j : i.values()) {
                    if (j.d() == n) {
                        i k = j;
                        if (j == null) {
                            k = i.I;
                        }
                        return k;
                    }
                }
                i j = null;
                continue;
            }
        }
    }
}
