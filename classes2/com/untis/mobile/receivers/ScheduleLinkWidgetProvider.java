// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.receivers;

import android.os.Bundle;
import org.jetbrains.annotations.e;
import android.app.PendingIntent;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.activities.widget.link.WidgetLinkActivity;
import com.untis.mobile.ui.activities.timetable.TimeTableActivity;
import com.untis.mobile.services.profile.legacy.j0;
import android.widget.RemoteViews;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.untis.mobile.persistence.models.DisplayableEntity;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.masterdata.a;
import kotlin.jvm.internal.k0;
import com.untis.mobile.services.masterdata.b;
import com.untis.mobile.persistence.models.widget.ScheduleLinkWidgetContext;
import kotlin.Metadata;
import android.appwidget.AppWidgetProvider;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0017" }, d2 = { "Lcom/untis/mobile/receivers/ScheduleLinkWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "Landroid/content/Context;", "context", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetId", "Lkotlin/j2;", "updateWidget", "Lcom/untis/mobile/persistence/models/widget/ScheduleLinkWidgetContext;", "widgetLinkContext", "", "getDisplayName", "", "appWidgetIds", "onUpdate", "Landroid/os/Bundle;", "newOptions", "onAppWidgetOptionsChanged", "onDeleted", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ScheduleLinkWidgetProvider extends AppWidgetProvider
{
    private final String getDisplayName(final ScheduleLinkWidgetContext scheduleLinkWidgetContext) {
        try {
            final b.a z = b.Z;
            final String profileId = scheduleLinkWidgetContext.getProfileId();
            k0.o(profileId, "widgetLinkContext.profileId");
            final a a = z.a(profileId);
            final EntityType entityType = scheduleLinkWidgetContext.getEntityType();
            k0.o(entityType, "widgetLinkContext.entityType");
            final DisplayableEntity v = a.v(entityType, scheduleLinkWidgetContext.getEntityId());
            if (v != null) {
                return v.getDisplayableTitle();
            }
            return "";
        }
        catch (Exception ex) {
            return "";
        }
    }
    
    private final void updateWidget(final Context context, final AppWidgetManager appWidgetManager, final int n) {
        final com.untis.mobile.utils.a a = com.untis.mobile.utils.a.a(context);
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131492954);
        final ScheduleLinkWidgetContext d = a.D(n);
        PendingIntent pendingIntent = null;
        Label_0152: {
            if (d != null) {
                final j0 g = j0.G;
                final String profileId = d.getProfileId();
                k0.o(profileId, "widgetLinkContext.profileId");
                if (g.l(profileId) != null) {
                    remoteViews.setTextViewText(2131298741, (CharSequence)this.getDisplayName(d));
                    final String profileId2 = d.getProfileId();
                    k0.o(profileId2, "widgetLinkContext.profileId");
                    final Profile l = g.l(profileId2);
                    final TimeTableActivity.a i = TimeTableActivity.L;
                    k0.m(l);
                    final EntityType entityType = d.getEntityType();
                    k0.o(entityType, "widgetLinkContext.entityType");
                    pendingIntent = i.f(context, n, l, entityType, d.getEntityId());
                    break Label_0152;
                }
            }
            pendingIntent = WidgetLinkActivity.t(context, n);
        }
        remoteViews.setOnClickPendingIntent(2131298740, pendingIntent);
        appWidgetManager.updateAppWidget(n, remoteViews);
    }
    
    public void onAppWidgetOptionsChanged(@e final Context context, @e final AppWidgetManager appWidgetManager, final int n, @e final Bundle bundle) {
        k0.p(context, "context");
        k0.p(appWidgetManager, "appWidgetManager");
        k0.p(bundle, "newOptions");
        super.onAppWidgetOptionsChanged(context, appWidgetManager, n, bundle);
        this.updateWidget(context, appWidgetManager, n);
    }
    
    public void onDeleted(@e final Context context, @e final int[] array) {
        k0.p(context, "context");
        k0.p(array, "appWidgetIds");
        super.onDeleted(context, array);
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final int n = array[i];
            ++i;
            com.untis.mobile.utils.a.a(context).V(n);
        }
    }
    
    public void onUpdate(@e final Context context, @e final AppWidgetManager appWidgetManager, @e final int[] array) {
        k0.p(context, "context");
        k0.p(appWidgetManager, "appWidgetManager");
        k0.p(array, "appWidgetIds");
        super.onUpdate(context, appWidgetManager, array);
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final int n = array[i];
            ++i;
            this.updateWidget(context, appWidgetManager, n);
        }
    }
}
