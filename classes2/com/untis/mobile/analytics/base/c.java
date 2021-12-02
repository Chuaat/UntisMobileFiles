// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.analytics.base;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b" }, d2 = { "Lcom/untis/mobile/analytics/base/c;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    @org.jetbrains.annotations.e
    public static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e" }, d2 = { "com/untis/mobile/analytics/base/c$a", "", "Lcom/untis/mobile/analytics/base/c$a;", "", "G", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Role", "Right", "Premium", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum a
    {
        H("role"), 
        I("right"), 
        J("premium");
        
        @e
        private final String G;
        
        static {
            K = b();
        }
        
        private a(final String g) {
            this.G = g;
        }
        
        private static final /* synthetic */ a[] b() {
            return new a[] { a.H, a.I, a.J };
        }
        
        @e
        public final String d() {
            return this.G;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000b¨\u0006\f" }, d2 = { "com/untis/mobile/analytics/base/c$b", "", "Lcom/untis/mobile/analytics/base/c$b;", "", "G", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Offline", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum b
    {
        H("offline");
        
        @e
        private final String G;
        
        static {
            I = b();
        }
        
        private b(final String g) {
            this.G = g;
        }
        
        private static final /* synthetic */ b[] b() {
            return new b[] { b.H };
        }
        
        @e
        public final String d() {
            return this.G;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014" }, d2 = { "com/untis/mobile/analytics/base/c$c", "", "Lcom/untis/mobile/analytics/base/c$c;", "Lcom/untis/mobile/analytics/base/a;", "", "G", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "TouchPeriodDetailsTimetable", "TouchCalendarDetailsTimetable", "AddLocalPeriodInfoPeriodDetails", "AddLocalHomeworkPeriodDetails", "UpdateSubjectColourPeriodDetails", "TouchShowTimetablePeriodDetails", "TouchShowRoomsPeriodDetails", "AddPeriodReminderPeriodDetails", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum c implements com.untis.mobile.analytics.base.a
    {
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N, 
        O;
        
        @org.jetbrains.annotations.e
        private final String G;
        
        static {
            P = d();
        }
        
        private c(final String g) {
            this.G = g;
        }
        
        private static final /* synthetic */ c[] d() {
            return new c[] { c.H, c.I, c.J, c.K, c.L, c.M, c.N, c.O };
        }
        
        @org.jetbrains.annotations.e
        public final String f() {
            return this.G;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$c$a", "Lcom/untis/mobile/analytics/base/c$c;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class a extends c
        {
            a(final String s, final int n) {
                super(s, n, "add_localHomework_period", null);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$c$b", "Lcom/untis/mobile/analytics/base/c$c;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class b extends c
        {
            b(final String s, final int n) {
                super(s, n, "add_localPeriodInfo_period", null);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$c$c", "Lcom/untis/mobile/analytics/base/c$c;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class c extends com.untis.mobile.analytics.base.c.c
        {
            c(final String s, final int n) {
                super(s, n, "add_periodReminder_period", null);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$c$d", "Lcom/untis/mobile/analytics/base/c$c;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class d extends c
        {
            d(final String s, final int n) {
                super(s, n, "touch_calendarDetails_timetable", null);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$c$e", "Lcom/untis/mobile/analytics/base/c$c;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class e extends c
        {
            e(final String s, final int n) {
                super(s, n, "touch_period_timetable", null);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$c$f", "Lcom/untis/mobile/analytics/base/c$c;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class f extends c
        {
            f(final String s, final int n) {
                super(s, n, "touch_showRooms_period", null);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$c$g", "Lcom/untis/mobile/analytics/base/c$c;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class g extends c
        {
            g(final String s, final int n) {
                super(s, n, "touch_showTimetable_period", null);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$c$h", "Lcom/untis/mobile/analytics/base/c$c;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class h extends c
        {
            h(final String s, final int n) {
                super(s, n, "update_subjectColour_period", null);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public String b() {
                return this.f();
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "com/untis/mobile/analytics/base/c$d", "", "Lcom/untis/mobile/analytics/base/c$d;", "Lcom/untis/mobile/analytics/base/a;", "", "G", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "TouchLoginLogin", "TouchLoginManuallyLogin", "TouchQrCodeLoginManuallyLogin", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum d implements com.untis.mobile.analytics.base.a
    {
        H, 
        I, 
        J;
        
        @e
        private final String G;
        
        static {
            K = d();
        }
        
        private d(final String g) {
            this.G = g;
        }
        
        private static final /* synthetic */ d[] d() {
            return new d[] { d.H, d.I, d.J };
        }
        
        @e
        public final String f() {
            return this.G;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$d$a", "Lcom/untis/mobile/analytics/base/c$d;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class a extends d
        {
            a(final String s, final int n) {
                super(s, n, "touch_login_login", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$d$b", "Lcom/untis/mobile/analytics/base/c$d;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class b extends d
        {
            b(final String s, final int n) {
                super(s, n, "touch_login_manuallyLogin", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$d$c", "Lcom/untis/mobile/analytics/base/c$d;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class c extends d
        {
            c(final String s, final int n) {
                super(s, n, "touch_qrCodeLogin_manuallyLogin", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015" }, d2 = { "com/untis/mobile/analytics/base/c$e", "", "Lcom/untis/mobile/analytics/base/c$e;", "Lcom/untis/mobile/analytics/base/a;", "", "G", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ViewTimetable", "TouchPeriodDetailsTimetable", "UpdateTeachingContentPeriodDetails", "UpdateDetailsOfPeriodPeriodDetails", "TouchHomeworkListPeriodDetails", "TouchStudentsPeriodDetails", "UpdateHomeworkHomework", "UpdateAbsencesStudents", "UpdateClassbookEntriesStudents", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum e implements com.untis.mobile.analytics.base.a
    {
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N, 
        O, 
        P;
        
        @e
        private final String G;
        
        static {
            Q = d();
        }
        
        private e(final String g) {
            this.G = g;
        }
        
        private static final /* synthetic */ com.untis.mobile.analytics.base.c.e[] d() {
            return new com.untis.mobile.analytics.base.c.e[] { com.untis.mobile.analytics.base.c.e.H, com.untis.mobile.analytics.base.c.e.I, com.untis.mobile.analytics.base.c.e.J, com.untis.mobile.analytics.base.c.e.K, com.untis.mobile.analytics.base.c.e.L, com.untis.mobile.analytics.base.c.e.M, com.untis.mobile.analytics.base.c.e.N, com.untis.mobile.analytics.base.c.e.O, com.untis.mobile.analytics.base.c.e.P };
        }
        
        @e
        public final String f() {
            return this.G;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$e$a", "Lcom/untis/mobile/analytics/base/c$e;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class a extends com.untis.mobile.analytics.base.c.e
        {
            a(final String s, final int n) {
                super(s, n, "touch_homeworkList_period", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$e$b", "Lcom/untis/mobile/analytics/base/c$e;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class b extends com.untis.mobile.analytics.base.c.e
        {
            b(final String s, final int n) {
                super(s, n, "touch_period_timetable", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$e$c", "Lcom/untis/mobile/analytics/base/c$e;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class c extends com.untis.mobile.analytics.base.c.e
        {
            c(final String s, final int n) {
                super(s, n, "touch_students_period", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$e$d", "Lcom/untis/mobile/analytics/base/c$e;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class d extends com.untis.mobile.analytics.base.c.e
        {
            d(final String s, final int n) {
                super(s, n, "update_absences_students", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$e$e", "Lcom/untis/mobile/analytics/base/c$e;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class e extends com.untis.mobile.analytics.base.c.e
        {
            e(final String s, final int n) {
                super(s, n, "update_classbookEntries_students", null);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$e$f", "Lcom/untis/mobile/analytics/base/c$e;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class f extends com.untis.mobile.analytics.base.c.e
        {
            f(final String s, final int n) {
                super(s, n, "update_detailsOfPeriod_period", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$e$g", "Lcom/untis/mobile/analytics/base/c$e;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class g extends com.untis.mobile.analytics.base.c.e
        {
            g(final String s, final int n) {
                super(s, n, "update_homework_homework", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$e$h", "Lcom/untis/mobile/analytics/base/c$e;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class h extends com.untis.mobile.analytics.base.c.e
        {
            h(final String s, final int n) {
                super(s, n, "update_teachingContent_period", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004" }, d2 = { "com/untis/mobile/analytics/base/c$e$i", "Lcom/untis/mobile/analytics/base/c$e;", "", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
        static final class i extends com.untis.mobile.analytics.base.c.e
        {
            i(final String s, final int n) {
                super(s, n, "view_timetable", null);
            }
            
            @e
            @Override
            public String b() {
                return this.f();
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000b¨\u0006\f" }, d2 = { "com/untis/mobile/analytics/base/c$f", "", "Lcom/untis/mobile/analytics/base/c$f;", "", "G", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ClassRegister", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum f
    {
        H("classRegister");
        
        @e
        private final String G;
        
        static {
            I = b();
        }
        
        private f(final String g) {
            this.G = g;
        }
        
        private static final /* synthetic */ f[] b() {
            return new f[] { f.H };
        }
        
        @e
        public final String d() {
            return this.G;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013" }, d2 = { "com/untis/mobile/analytics/base/c$g", "", "Lcom/untis/mobile/analytics/base/c$g;", "", "G", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Teacher", "Student", "Parent", "Anonymous", "ClassUser", "Room", "Subject", "Unknown", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public enum g
    {
        H("teacher"), 
        I("student"), 
        J("parent"), 
        K("anonymous"), 
        L("classUser"), 
        M("room"), 
        N("subject"), 
        O("unknown");
        
        @e
        private final String G;
        
        static {
            P = b();
        }
        
        private g(final String g) {
            this.G = g;
        }
        
        private static final /* synthetic */ g[] b() {
            return new g[] { g.H, g.I, g.J, g.K, g.L, g.M, g.N, g.O };
        }
        
        @e
        public final String d() {
            return this.G;
        }
    }
}
