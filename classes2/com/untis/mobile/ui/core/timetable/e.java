// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.timetable;

import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\r\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010R\u0019\u0010\u0016\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/ui/core/timetable/e;", "", "", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "d", "Ljava/util/List;", "b", "()Ljava/util/List;", "searchEntities", "", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "title", "", "Z", "()Z", "isPremium", "Lcom/untis/mobile/persistence/models/profile/Profile;", "a", "Lcom/untis/mobile/persistence/models/profile/Profile;", "()Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "(Lcom/untis/mobile/persistence/models/profile/Profile;Ljava/lang/String;ZLjava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e
{
    @org.jetbrains.annotations.e
    private final Profile a;
    @org.jetbrains.annotations.e
    private final String b;
    private final boolean c;
    @org.jetbrains.annotations.e
    private final List<DisplayableEntity> d;
    
    public e(@org.jetbrains.annotations.e final Profile a, @org.jetbrains.annotations.e final String b, final boolean c, @org.jetbrains.annotations.e final List<? extends DisplayableEntity> d) {
        k0.p(a, "profile");
        k0.p(b, "title");
        k0.p(d, "searchEntities");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (List<DisplayableEntity>)d;
    }
    
    @org.jetbrains.annotations.e
    public final Profile a() {
        return this.a;
    }
    
    @org.jetbrains.annotations.e
    public final List<DisplayableEntity> b() {
        return this.d;
    }
    
    @org.jetbrains.annotations.e
    public final String c() {
        return this.b;
    }
    
    public final boolean d() {
        return this.c;
    }
}
