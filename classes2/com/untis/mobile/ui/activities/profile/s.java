// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0003\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u001c" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/s;", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "a", "Lcom/untis/mobile/persistence/models/profile/Profile;", "b", "()Lcom/untis/mobile/persistence/models/profile/Profile;", "f", "(Lcom/untis/mobile/persistence/models/profile/Profile;)V", "profile", "", "c", "Z", "()Z", "g", "(Z)V", "showToken", "", "Ljava/lang/Throwable;", "d", "()Ljava/lang/Throwable;", "h", "(Ljava/lang/Throwable;)V", "throwable", "e", "enableLogin", "<init>", "(Lcom/untis/mobile/persistence/models/profile/Profile;Ljava/lang/Throwable;ZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class s
{
    @f
    private Profile a;
    @f
    private Throwable b;
    private boolean c;
    private boolean d;
    
    public s() {
        this(null, null, false, false, 15, null);
    }
    
    public s(@f final Profile a, @f final Throwable b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a() {
        return this.d;
    }
    
    @f
    public final Profile b() {
        return this.a;
    }
    
    public final boolean c() {
        return this.c;
    }
    
    @f
    public final Throwable d() {
        return this.b;
    }
    
    public final void e(final boolean d) {
        this.d = d;
    }
    
    public final void f(@f final Profile a) {
        this.a = a;
    }
    
    public final void g(final boolean c) {
        this.c = c;
    }
    
    public final void h(@f final Throwable b) {
        this.b = b;
    }
}
