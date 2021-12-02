// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.notifications;

import kotlin.jvm.internal.k0;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import com.untis.mobile.persistence.models.MessageOfDay;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/ui/core/notifications/e;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "b", "Ljava/util/List;", "a", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "contactHours", "Lcom/untis/mobile/persistence/models/MessageOfDay;", "d", "messages", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e
{
    @org.jetbrains.annotations.e
    private List<MessageOfDay> a;
    @org.jetbrains.annotations.e
    private List<DashboardContactHour> b;
    
    public e(@org.jetbrains.annotations.e final List<MessageOfDay> a, @org.jetbrains.annotations.e final List<DashboardContactHour> b) {
        k0.p(a, "messages");
        k0.p(b, "contactHours");
        this.a = a;
        this.b = b;
    }
    
    @org.jetbrains.annotations.e
    public final List<DashboardContactHour> a() {
        return this.b;
    }
    
    @org.jetbrains.annotations.e
    public final List<MessageOfDay> b() {
        return this.a;
    }
    
    public final void c(@org.jetbrains.annotations.e final List<DashboardContactHour> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void d(@org.jetbrains.annotations.e final List<MessageOfDay> a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
}
