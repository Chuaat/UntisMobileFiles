// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.settings.old;

import android.content.SharedPreferences$Editor;
import com.google.gson.Gson;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.widget.ScheduleWidgetContext;
import com.untis.mobile.UntisMobileApplication;
import android.content.SharedPreferences;
import android.content.Context;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/utils/settings/old/e;", "Lcom/untis/mobile/utils/settings/old/f;", "Ljava/io/Serializable;", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "d", "", "id", "Lcom/untis/mobile/persistence/models/widget/ScheduleWidgetContext;", "b", "widgetContext", "Lkotlin/j2;", "a", "widgetId", "c", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e implements f, Serializable
{
    @org.jetbrains.annotations.e
    public static final e G;
    
    static {
        G = new e();
    }
    
    private e() {
    }
    
    private final SharedPreferences d(Context context) {
        final Object b = UntisMobileApplication.I.b();
        if (b != null) {
            context = (Context)b;
        }
        return context.getSharedPreferences("schedule_widget_settings", 0);
    }
    
    @Override
    public void a(@org.jetbrains.annotations.e final Context context, @org.jetbrains.annotations.e final ScheduleWidgetContext scheduleWidgetContext) {
        k0.p(context, "context");
        k0.p(scheduleWidgetContext, "widgetContext");
        final SharedPreferences d = this.d(context);
        if (d != null) {
            final SharedPreferences$Editor edit = d.edit();
            if (edit != null) {
                final SharedPreferences$Editor putString = edit.putString(String.valueOf(scheduleWidgetContext.widgetId), new Gson().toJson(scheduleWidgetContext));
                if (putString != null) {
                    putString.apply();
                }
            }
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public ScheduleWidgetContext b(@org.jetbrains.annotations.e final Context context, final int i) {
        k0.p(context, "context");
        final SharedPreferences d = this.d(context);
        final ScheduleWidgetContext scheduleWidgetContext = null;
        String string;
        if (d == null) {
            string = null;
        }
        else {
            string = d.getString(String.valueOf(i), (String)null);
        }
        if (string == null) {
            return null;
        }
        try {
            return new Gson().fromJson(string, ScheduleWidgetContext.class);
        }
        catch (Exception ex) {
            return scheduleWidgetContext;
        }
    }
    
    @Override
    public void c(@org.jetbrains.annotations.e final Context context, final int i) {
        k0.p(context, "context");
        final SharedPreferences d = this.d(context);
        if (d != null) {
            final SharedPreferences$Editor edit = d.edit();
            if (edit != null) {
                final SharedPreferences$Editor remove = edit.remove(String.valueOf(i));
                if (remove != null) {
                    remove.apply();
                }
            }
        }
    }
}
