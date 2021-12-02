// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.util.SparseArray;
import java.util.Collection;
import androidx.collection.c;
import androidx.annotation.k0;
import android.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import android.app.Notification$Action$Builder;
import androidx.core.content.g;
import android.graphics.drawable.Icon;
import java.util.Iterator;
import android.app.Notification;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.List;
import android.widget.RemoteViews;
import android.app.Notification$Builder;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.I })
class s implements o
{
    private final Context a;
    private final Notification$Builder b;
    private final r.g c;
    private RemoteViews d;
    private RemoteViews e;
    private final List<Bundle> f;
    private final Bundle g;
    private int h;
    private RemoteViews i;
    
    s(final r.g c) {
        this.f = new ArrayList<Bundle>();
        this.g = new Bundle();
        this.c = c;
        this.a = c.a;
        final int sdk_INT = Build$VERSION.SDK_INT;
        final Context a = c.a;
        Notification$Builder b;
        if (sdk_INT >= 26) {
            b = new Notification$Builder(a, c.L);
        }
        else {
            b = new Notification$Builder(a);
        }
        this.b = b;
        final Notification t = c.T;
        this.b.setWhen(t.when).setSmallIcon(t.icon, t.iconLevel).setContent(t.contentView).setTicker(t.tickerText, c.i).setVibrate(t.vibrate).setLights(t.ledARGB, t.ledOnMS, t.ledOffMS).setOngoing((t.flags & 0x2) != 0x0).setOnlyAlertOnce((t.flags & 0x8) != 0x0).setAutoCancel((t.flags & 0x10) != 0x0).setDefaults(t.defaults).setContentTitle(c.e).setContentText(c.f).setContentInfo(c.k).setContentIntent(c.g).setDeleteIntent(t.deleteIntent).setFullScreenIntent(c.h, (t.flags & 0x80) != 0x0).setLargeIcon(c.j).setNumber(c.l).setProgress(c.u, c.v, c.w);
        if (sdk_INT < 21) {
            this.b.setSound(t.sound, t.audioStreamType);
        }
        if (sdk_INT >= 16) {
            this.b.setSubText(c.r).setUsesChronometer(c.o).setPriority(c.m);
            final Iterator<r.b> iterator = c.b.iterator();
            while (iterator.hasNext()) {
                this.b(iterator.next());
            }
            final Bundle e = c.E;
            if (e != null) {
                this.g.putAll(e);
            }
            if (Build$VERSION.SDK_INT < 20) {
                if (c.A) {
                    this.g.putBoolean("android.support.localOnly", true);
                }
                final String x = c.x;
                if (x != null) {
                    this.g.putString("android.support.groupKey", x);
                    Bundle bundle;
                    String s;
                    if (c.y) {
                        bundle = this.g;
                        s = "android.support.isGroupSummary";
                    }
                    else {
                        bundle = this.g;
                        s = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(s, true);
                }
                final String z = c.z;
                if (z != null) {
                    this.g.putString("android.support.sortKey", z);
                }
            }
            this.d = c.I;
            this.e = c.J;
        }
        final int sdk_INT2 = Build$VERSION.SDK_INT;
        if (sdk_INT2 >= 17) {
            this.b.setShowWhen(c.n);
        }
        if (sdk_INT2 >= 19 && sdk_INT2 < 21) {
            final List<String> e2 = e(g(c.c), c.W);
            if (e2 != null && !e2.isEmpty()) {
                this.g.putStringArray("android.people", (String[])e2.toArray(new String[e2.size()]));
            }
        }
        if (sdk_INT2 >= 20) {
            this.b.setLocalOnly(c.A).setGroup(c.x).setGroupSummary(c.y).setSortKey(c.z);
            this.h = c.Q;
        }
        if (sdk_INT2 >= 21) {
            this.b.setCategory(c.D).setColor(c.F).setVisibility(c.G).setPublicVersion(c.H).setSound(t.sound, t.audioAttributes);
            List<String> list;
            if (sdk_INT2 < 28) {
                list = e(g(c.c), c.W);
            }
            else {
                list = c.W;
            }
            if (list != null && !list.isEmpty()) {
                final Iterator<String> iterator2 = list.iterator();
                while (iterator2.hasNext()) {
                    this.b.addPerson((String)iterator2.next());
                }
            }
            this.i = c.K;
            if (c.d.size() > 0) {
                Bundle bundle2;
                if ((bundle2 = c.t().getBundle("android.car.EXTENSIONS")) == null) {
                    bundle2 = new Bundle();
                }
                final Bundle bundle3 = new Bundle(bundle2);
                final Bundle bundle4 = new Bundle();
                for (int i = 0; i < c.d.size(); ++i) {
                    bundle4.putBundle(Integer.toString(i), u.j(c.d.get(i)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                c.t().putBundle("android.car.EXTENSIONS", bundle2);
                this.g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        final int sdk_INT3 = Build$VERSION.SDK_INT;
        if (sdk_INT3 >= 23) {
            final Icon v = c.V;
            if (v != null) {
                this.b.setSmallIcon(v);
            }
        }
        if (sdk_INT3 >= 24) {
            this.b.setExtras(c.E).setRemoteInputHistory(c.t);
            final RemoteViews j = c.I;
            if (j != null) {
                this.b.setCustomContentView(j);
            }
            final RemoteViews k = c.J;
            if (k != null) {
                this.b.setCustomBigContentView(k);
            }
            final RemoteViews l = c.K;
            if (l != null) {
                this.b.setCustomHeadsUpContentView(l);
            }
        }
        if (sdk_INT3 >= 26) {
            this.b.setBadgeIconType(c.M).setSettingsText(c.s).setShortcutId(c.N).setTimeoutAfter(c.P).setGroupAlertBehavior(c.Q);
            if (c.C) {
                this.b.setColorized(c.B);
            }
            if (!TextUtils.isEmpty((CharSequence)c.L)) {
                this.b.setSound((Uri)null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[])null);
            }
        }
        if (sdk_INT3 >= 28) {
            final Iterator<x> iterator3 = c.c.iterator();
            while (iterator3.hasNext()) {
                this.b.addPerson(iterator3.next().k());
            }
        }
        final int sdk_INT4 = Build$VERSION.SDK_INT;
        if (sdk_INT4 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(c.R);
            this.b.setBubbleMetadata(r.f.k(c.S));
            final g o = c.O;
            if (o != null) {
                this.b.setLocusId(o.c());
            }
        }
        if (c.U) {
            if (this.c.y) {
                this.h = 2;
            }
            else {
                this.h = 1;
            }
            this.b.setVibrate((long[])null);
            this.b.setSound((Uri)null);
            final int defaults = t.defaults & 0xFFFFFFFE;
            t.defaults = defaults;
            final int n = defaults & 0xFFFFFFFD;
            t.defaults = n;
            this.b.setDefaults(n);
            if (sdk_INT4 >= 26) {
                if (TextUtils.isEmpty((CharSequence)this.c.x)) {
                    this.b.setGroup("silent");
                }
                this.b.setGroupAlertBehavior(this.h);
            }
        }
    }
    
    private void b(final r.b b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 20) {
            final IconCompat f = b.f();
            final int n = 0;
            Notification$Action$Builder notification$Action$Builder;
            if (sdk_INT >= 23) {
                Icon q;
                if (f != null) {
                    q = f.Q();
                }
                else {
                    q = null;
                }
                notification$Action$Builder = new Notification$Action$Builder(q, b.j(), b.a());
            }
            else {
                int a;
                if (f != null) {
                    a = f.A();
                }
                else {
                    a = 0;
                }
                notification$Action$Builder = new Notification$Action$Builder(a, b.j(), b.a());
            }
            if (b.g() != null) {
                final RemoteInput[] d = y.d(b.g());
                for (int length = d.length, i = n; i < length; ++i) {
                    notification$Action$Builder.addRemoteInput(d[i]);
                }
            }
            Bundle bundle;
            if (b.d() != null) {
                bundle = new Bundle(b.d());
            }
            else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", b.b());
            final int sdk_INT2 = Build$VERSION.SDK_INT;
            if (sdk_INT2 >= 24) {
                notification$Action$Builder.setAllowGeneratedReplies(b.b());
            }
            bundle.putInt("android.support.action.semanticAction", b.h());
            if (sdk_INT2 >= 28) {
                notification$Action$Builder.setSemanticAction(b.h());
            }
            if (sdk_INT2 >= 29) {
                notification$Action$Builder.setContextual(b.k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", b.i());
            notification$Action$Builder.addExtras(bundle);
            this.b.addAction(notification$Action$Builder.build());
        }
        else if (sdk_INT >= 16) {
            this.f.add(u.o(this.b, b));
        }
    }
    
    @k0
    private static List<String> e(@k0 final List<String> list, @k0 final List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        final c c = new c<String>(list.size() + list2.size());
        c.addAll(list);
        c.addAll(list2);
        return new ArrayList<String>(c);
    }
    
    @k0
    private static List<String> g(@k0 final List<x> list) {
        if (list == null) {
            return null;
        }
        final ArrayList<String> list2 = new ArrayList<String>(list.size());
        final Iterator<x> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(iterator.next().j());
        }
        return list2;
    }
    
    private void h(final Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        final int defaults = notification.defaults & 0xFFFFFFFE;
        notification.defaults = defaults;
        notification.defaults = (defaults & 0xFFFFFFFD);
    }
    
    @Override
    public Notification$Builder a() {
        return this.b;
    }
    
    public Notification c() {
        final r.p q = this.c.q;
        if (q != null) {
            q.b(this);
        }
        RemoteViews contentView;
        if (q != null) {
            contentView = q.w(this);
        }
        else {
            contentView = null;
        }
        final Notification d = this.d();
        Label_0064: {
            if (contentView == null) {
                contentView = this.c.I;
                if (contentView == null) {
                    break Label_0064;
                }
            }
            d.contentView = contentView;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 16 && q != null) {
            final RemoteViews v = q.v(this);
            if (v != null) {
                d.bigContentView = v;
            }
        }
        if (sdk_INT >= 21 && q != null) {
            final RemoteViews x = this.c.q.x(this);
            if (x != null) {
                d.headsUpContentView = x;
            }
        }
        if (sdk_INT >= 16 && q != null) {
            final Bundle n = r.n(d);
            if (n != null) {
                q.a(n);
            }
        }
        return d;
    }
    
    protected Notification d() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            return this.b.build();
        }
        if (sdk_INT >= 24) {
            final Notification build = this.b.build();
            if (this.h != 0) {
                if (build.getGroup() != null && (build.flags & 0x200) != 0x0 && this.h == 2) {
                    this.h(build);
                }
                if (build.getGroup() != null && (build.flags & 0x200) == 0x0 && this.h == 1) {
                    this.h(build);
                }
            }
            return build;
        }
        if (sdk_INT >= 21) {
            this.b.setExtras(this.g);
            final Notification build2 = this.b.build();
            final RemoteViews d = this.d;
            if (d != null) {
                build2.contentView = d;
            }
            final RemoteViews e = this.e;
            if (e != null) {
                build2.bigContentView = e;
            }
            final RemoteViews i = this.i;
            if (i != null) {
                build2.headsUpContentView = i;
            }
            if (this.h != 0) {
                if (build2.getGroup() != null && (build2.flags & 0x200) != 0x0 && this.h == 2) {
                    this.h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 0x200) == 0x0 && this.h == 1) {
                    this.h(build2);
                }
            }
            return build2;
        }
        if (sdk_INT >= 20) {
            this.b.setExtras(this.g);
            final Notification build3 = this.b.build();
            final RemoteViews d2 = this.d;
            if (d2 != null) {
                build3.contentView = d2;
            }
            final RemoteViews e2 = this.e;
            if (e2 != null) {
                build3.bigContentView = e2;
            }
            if (this.h != 0) {
                if (build3.getGroup() != null && (build3.flags & 0x200) != 0x0 && this.h == 2) {
                    this.h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 0x200) == 0x0 && this.h == 1) {
                    this.h(build3);
                }
            }
            return build3;
        }
        if (sdk_INT >= 19) {
            final SparseArray<Bundle> a = u.a(this.f);
            if (a != null) {
                this.g.putSparseParcelableArray("android.support.actionExtras", (SparseArray)a);
            }
            this.b.setExtras(this.g);
            final Notification build4 = this.b.build();
            final RemoteViews d3 = this.d;
            if (d3 != null) {
                build4.contentView = d3;
            }
            final RemoteViews e3 = this.e;
            if (e3 != null) {
                build4.bigContentView = e3;
            }
            return build4;
        }
        if (sdk_INT >= 16) {
            final Notification build5 = this.b.build();
            final Bundle n = r.n(build5);
            final Bundle bundle = new Bundle(this.g);
            for (final String s : this.g.keySet()) {
                if (n.containsKey(s)) {
                    bundle.remove(s);
                }
            }
            n.putAll(bundle);
            final SparseArray<Bundle> a2 = u.a(this.f);
            if (a2 != null) {
                r.n(build5).putSparseParcelableArray("android.support.actionExtras", (SparseArray)a2);
            }
            final RemoteViews d4 = this.d;
            if (d4 != null) {
                build5.contentView = d4;
            }
            final RemoteViews e4 = this.e;
            if (e4 != null) {
                build5.bigContentView = e4;
            }
            return build5;
        }
        return this.b.getNotification();
    }
    
    Context f() {
        return this.a;
    }
}
