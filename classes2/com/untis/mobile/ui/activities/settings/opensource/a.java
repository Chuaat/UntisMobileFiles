// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.settings.opensource;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B!\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bj\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/ui/activities/settings/opensource/a;", "", "", "G", "I", "g", "()I", "value", "", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "url", "H", "d", "title", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "J", "a", "APACHE_2_0", "MIT", "NONE", "REALM", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public enum a
{
    @e
    public static final a J;
    
    K(1, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0.html"), 
    L(2, "MIT", "https://opensource.org/licenses/MIT"), 
    M(0, "None", "https://www.untis.at/HTML/impressum.php"), 
    N(3, "License", "https://realm.io/legal/developer-license-terms/");
    
    private final int G;
    @e
    private final String H;
    @e
    private final String I;
    
    static {
        O = b();
        J = new a(null);
    }
    
    private a(final int g, final String h, final String i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    private static final /* synthetic */ a[] b() {
        return new a[] { a.K, a.L, a.M, a.N };
    }
    
    @e
    public final String d() {
        return this.H;
    }
    
    @e
    public final String f() {
        return this.I;
    }
    
    public final int g() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/ui/activities/settings/opensource/a$a", "", "", "value", "Lcom/untis/mobile/ui/activities/settings/opensource/a;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final com.untis.mobile.ui.activities.settings.opensource.a a(final int n) {
            while (true) {
                for (final com.untis.mobile.ui.activities.settings.opensource.a a : com.untis.mobile.ui.activities.settings.opensource.a.values()) {
                    if (a.g() == n) {
                        com.untis.mobile.ui.activities.settings.opensource.a m = a;
                        if (a == null) {
                            m = com.untis.mobile.ui.activities.settings.opensource.a.M;
                        }
                        return m;
                    }
                }
                com.untis.mobile.ui.activities.settings.opensource.a a = null;
                continue;
            }
        }
    }
}
