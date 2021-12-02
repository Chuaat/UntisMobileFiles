// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\"\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J&\u0010\u0019\u001a\u00020\r\"\u0004\b\u0000\u0010\u00172\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/utils/settings/g;", "", "Lcom/untis/mobile/utils/settings/i;", "setting", "", "string", "", "userId", "Lkotlin/j2;", "b", "k", "e", "Lcom/untis/mobile/utils/settings/a;", "", "boolean", "a", "d", "i", "Lcom/untis/mobile/utils/settings/d;", "long", "j", "h", "c", "T", "Lcom/untis/mobile/utils/settings/f;", "g", "f", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface g
{
    @e
    public static final a a = g.a.a;
    
    void a(@e final com.untis.mobile.utils.settings.a p0, final boolean p1, final long p2);
    
    void b(@e final i p0, @e final String p1, final long p2);
    
    void c(@e final d p0, final long p1);
    
    boolean d(@e final com.untis.mobile.utils.settings.a p0, final long p1);
    
    void e(@e final i p0, final long p1);
    
    void f(final long p0);
    
     <T> boolean g(@e final f<T> p0, final long p1);
    
    long h(@e final d p0, final long p1);
    
    void i(@e final com.untis.mobile.utils.settings.a p0, final long p1);
    
    void j(@e final d p0, final long p1, final long p2);
    
    @e
    String k(@e final i p0, final long p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0003\u0010\fR\u0019\u0010\u0013\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0019\u0010\u0016\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u001c\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001d\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u001e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u001f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010!\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b \u0010\f¨\u0006$" }, d2 = { "com/untis/mobile/utils/settings/g$a", "", "Lcom/untis/mobile/utils/settings/a;", "f", "Lcom/untis/mobile/utils/settings/a;", "e", "()Lcom/untis/mobile/utils/settings/a;", "DashboardStudentAbsenceShowOnlyUnexcused", "Lcom/untis/mobile/utils/settings/d;", "h", "Lcom/untis/mobile/utils/settings/d;", "k", "()Lcom/untis/mobile/utils/settings/d;", "RemoteConfigTimetableRefreshSeconds", "RemoteConfigDataUpdateWithoutSchoolyearSeconds", "d", "DashboardUpcomingEventDateRange", "l", "i", "RemoteConfigSpVersion", "j", "g", "RemoteConfigDataUpdateSeconds", "Lcom/untis/mobile/utils/settings/i;", "b", "Lcom/untis/mobile/utils/settings/i;", "c", "()Lcom/untis/mobile/utils/settings/i;", "DashboardContactHourStart", "DashboardContactHourKlassenId", "RemoteConfigTimetableForceReloadSeconds", "DashboardStudentAbsenceDateRange", "a", "DashboardClassLeadDateRange", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        static final /* synthetic */ a a;
        @e
        private static final i b;
        @e
        private static final d c;
        @e
        private static final d d;
        @e
        private static final d e;
        @e
        private static final com.untis.mobile.utils.settings.a f;
        @e
        private static final d g;
        @e
        private static final d h;
        @e
        private static final d i;
        @e
        private static final d j;
        @e
        private static final d k;
        @e
        private static final d l;
        
        static {
            a = new a();
            final String string = new t().toString();
            k0.o(string, "LocalDate().toString()");
            b = new i("dashboard_contacthour_start", string, false, 4, null);
            c = new d("dashboard_contacthour_klassenid", -1L, false, 4, null);
            d = new d("dashboard_upcoming_event_range", -1L, false, 4, null);
            e = new d("dashboard_student_absence_range", -1L, false, 4, null);
            f = new com.untis.mobile.utils.settings.a("dashboard_student_absence_excused", false, false, 4, null);
            g = new d("dashboard_class_lead_range", -1L, false, 4, null);
            h = new d("remote_config_timetableRefreshSeconds", 600L, false, 4, null);
            i = new d("remote_config_timetableForceReloadSeconds", 3600L, false, 4, null);
            j = new d("remote_config_dataUpdateSeconds", 86400L, false, 4, null);
            k = new d("remote_config_dataUpdateWithoutSchoolyearSeconds", 86400L, false, 4, null);
            l = new d("spVersion", 1L, false, 4, null);
        }
        
        private a() {
        }
        
        @e
        public final d a() {
            return com.untis.mobile.utils.settings.g.a.g;
        }
        
        @e
        public final d b() {
            return com.untis.mobile.utils.settings.g.a.c;
        }
        
        @e
        public final i c() {
            return com.untis.mobile.utils.settings.g.a.b;
        }
        
        @e
        public final d d() {
            return com.untis.mobile.utils.settings.g.a.e;
        }
        
        @e
        public final com.untis.mobile.utils.settings.a e() {
            return com.untis.mobile.utils.settings.g.a.f;
        }
        
        @e
        public final d f() {
            return com.untis.mobile.utils.settings.g.a.d;
        }
        
        @e
        public final d g() {
            return com.untis.mobile.utils.settings.g.a.j;
        }
        
        @e
        public final d h() {
            return com.untis.mobile.utils.settings.g.a.k;
        }
        
        @e
        public final d i() {
            return com.untis.mobile.utils.settings.g.a.l;
        }
        
        @e
        public final d j() {
            return com.untis.mobile.utils.settings.g.a.i;
        }
        
        @e
        public final d k() {
            return com.untis.mobile.utils.settings.g.a.h;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class b
    {
    }
}
