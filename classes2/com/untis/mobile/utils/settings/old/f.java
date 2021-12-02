// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings.old;

import com.untis.mobile.persistence.models.widget.ScheduleWidgetContext;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\nJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H&J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H&¨\u0006\u000e" }, d2 = { "Lcom/untis/mobile/utils/settings/old/f;", "", "Landroid/content/Context;", "context", "", "id", "Lcom/untis/mobile/persistence/models/widget/ScheduleWidgetContext;", "b", "widgetContext", "Lkotlin/j2;", "a", "widgetId", "c", "n", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface f
{
    @e
    public static final a n = a.a;
    @e
    public static final String o = "schedule_widget_settings";
    
    void a(@e final Context p0, @e final ScheduleWidgetContext p1);
    
    @org.jetbrains.annotations.f
    ScheduleWidgetContext b(@e final Context p0, final int p1);
    
    void c(@e final Context p0, final int p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "com/untis/mobile/utils/settings/old/f$a", "", "", "b", "Ljava/lang/String;", "SETTINGS", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        static final /* synthetic */ a a;
        @e
        public static final String b = "schedule_widget_settings";
        
        static {
            a = new a();
        }
        
        private a() {
        }
    }
}
