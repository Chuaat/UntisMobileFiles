// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.app.Notification$Action$Builder;
import android.os.SystemClock;
import java.text.NumberFormat;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Bitmap$Config;
import android.app.Notification$MessagingStyle$Message;
import android.app.Notification$MessagingStyle;
import android.text.SpannableStringBuilder;
import android.content.res.ColorStateList;
import android.text.style.TextAppearanceSpan;
import java.util.Collections;
import android.app.Notification$InboxStyle;
import android.app.Notification$Style;
import android.app.Notification$DecoratedCustomViewStyle;
import android.app.RemoteInput$Builder;
import android.media.AudioAttributes$Builder;
import android.net.Uri;
import androidx.core.content.pm.e;
import android.app.Notification$Builder;
import k.a;
import android.widget.RemoteViews;
import android.text.TextUtils;
import android.app.Notification$BubbleMetadata$Builder;
import androidx.annotation.q;
import android.app.Notification$BubbleMetadata;
import androidx.annotation.p;
import android.app.Notification$BigTextStyle;
import android.content.Context;
import android.app.Notification$BigPictureStyle;
import android.graphics.drawable.Icon;
import android.graphics.Bitmap;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.Collection;
import java.util.Arrays;
import android.content.res.Resources;
import android.app.PendingIntent;
import java.util.Iterator;
import android.app.Person;
import android.os.Parcelable;
import android.content.LocusId;
import androidx.core.content.g;
import java.util.ArrayList;
import java.util.List;
import androidx.annotation.t0;
import android.app.RemoteInput;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;
import android.util.SparseArray;
import android.app.Notification$Action;
import android.os.Bundle;
import androidx.annotation.p0;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.app.Notification;
import androidx.annotation.l;
import android.annotation.SuppressLint;

public class r
{
    @SuppressLint({ "ActionValue" })
    public static final String A = "android.title";
    public static final String A0 = "reminder";
    @SuppressLint({ "ActionValue" })
    public static final String B = "android.title.big";
    public static final String B0 = "recommendation";
    @SuppressLint({ "ActionValue" })
    public static final String C = "android.text";
    public static final String C0 = "status";
    @SuppressLint({ "ActionValue" })
    public static final String D = "android.subText";
    public static final String D0 = "workout";
    @SuppressLint({ "ActionValue" })
    public static final String E = "android.remoteInputHistory";
    public static final String E0 = "location_sharing";
    @SuppressLint({ "ActionValue" })
    public static final String F = "android.infoText";
    public static final String F0 = "stopwatch";
    @SuppressLint({ "ActionValue" })
    public static final String G = "android.summaryText";
    public static final String G0 = "missed_call";
    @SuppressLint({ "ActionValue" })
    public static final String H = "android.bigText";
    public static final int H0 = 0;
    @SuppressLint({ "ActionValue" })
    public static final String I = "android.icon";
    public static final int I0 = 1;
    @SuppressLint({ "ActionValue" })
    public static final String J = "android.largeIcon";
    public static final int J0 = 2;
    @SuppressLint({ "ActionValue" })
    public static final String K = "android.largeIcon.big";
    public static final int K0 = 0;
    @SuppressLint({ "ActionValue" })
    public static final String L = "android.progress";
    public static final int L0 = 1;
    @SuppressLint({ "ActionValue" })
    public static final String M = "android.progressMax";
    public static final int M0 = 2;
    @SuppressLint({ "ActionValue" })
    public static final String N = "android.progressIndeterminate";
    public static final String N0 = "silent";
    @SuppressLint({ "ActionValue" })
    public static final String O = "android.showChronometer";
    @SuppressLint({ "ActionValue" })
    public static final String P = "android.chronometerCountDown";
    @SuppressLint({ "ActionValue" })
    public static final String Q = "android.colorized";
    @SuppressLint({ "ActionValue" })
    public static final String R = "android.showWhen";
    @SuppressLint({ "ActionValue" })
    public static final String S = "android.picture";
    @SuppressLint({ "ActionValue" })
    public static final String T = "android.textLines";
    @SuppressLint({ "ActionValue" })
    public static final String U = "android.template";
    public static final String V = "androidx.core.app.extra.COMPAT_TEMPLATE";
    @Deprecated
    @SuppressLint({ "ActionValue" })
    public static final String W = "android.people";
    @SuppressLint({ "ActionValue" })
    public static final String X = "android.people.list";
    @SuppressLint({ "ActionValue" })
    public static final String Y = "android.backgroundImageUri";
    @SuppressLint({ "ActionValue" })
    public static final String Z = "android.mediaSession";
    @SuppressLint({ "ActionValue" })
    public static final String a = "android.intent.category.NOTIFICATION_PREFERENCES";
    @SuppressLint({ "ActionValue" })
    public static final String a0 = "android.compactActions";
    @SuppressLint({ "ActionValue" })
    public static final String b = "android.intent.extra.CHANNEL_ID";
    @SuppressLint({ "ActionValue" })
    public static final String b0 = "android.selfDisplayName";
    @SuppressLint({ "ActionValue" })
    public static final String c = "android.intent.extra.CHANNEL_GROUP_ID";
    @SuppressLint({ "ActionValue" })
    public static final String c0 = "android.messagingStyleUser";
    @SuppressLint({ "ActionValue" })
    public static final String d = "android.intent.extra.NOTIFICATION_TAG";
    @SuppressLint({ "ActionValue" })
    public static final String d0 = "android.conversationTitle";
    @SuppressLint({ "ActionValue" })
    public static final String e = "android.intent.extra.NOTIFICATION_ID";
    @SuppressLint({ "ActionValue" })
    public static final String e0 = "android.messages";
    public static final int f = -1;
    @SuppressLint({ "ActionValue" })
    public static final String f0 = "android.messages.historic";
    public static final int g = 1;
    @SuppressLint({ "ActionValue" })
    public static final String g0 = "android.isGroupConversation";
    public static final int h = 2;
    @SuppressLint({ "ActionValue" })
    public static final String h0 = "android.hiddenConversationTitle";
    public static final int i = 4;
    @SuppressLint({ "ActionValue" })
    public static final String i0 = "android.audioContents";
    public static final int j = -1;
    @androidx.annotation.l
    public static final int j0 = 0;
    public static final int k = 1;
    public static final int k0 = 1;
    public static final int l = 2;
    public static final int l0 = 0;
    public static final int m = 4;
    public static final int m0 = -1;
    public static final int n = 8;
    public static final String n0 = "call";
    public static final int o = 16;
    public static final String o0 = "navigation";
    public static final int p = 32;
    public static final String p0 = "msg";
    public static final int q = 64;
    public static final String q0 = "email";
    @Deprecated
    public static final int r = 128;
    public static final String r0 = "event";
    public static final int s = 256;
    public static final String s0 = "promo";
    public static final int t = 512;
    public static final String t0 = "alarm";
    public static final int u = 4096;
    public static final String u0 = "progress";
    public static final int v = 0;
    public static final String v0 = "social";
    public static final int w = -1;
    public static final String w0 = "err";
    public static final int x = -2;
    public static final String x0 = "transport";
    public static final int y = 1;
    public static final String y0 = "sys";
    public static final int z = 2;
    public static final String z0 = "service";
    
    @Deprecated
    public r() {
    }
    
    @k0
    public static String A(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }
    
    @p0(19)
    public static boolean B(@j0 final Notification notification) {
        return notification.extras.getBoolean("android.showWhen");
    }
    
    @k0
    public static String C(@j0 final Notification notification) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 20) {
            return notification.getSortKey();
        }
        Bundle bundle;
        if (sdk_INT >= 19) {
            bundle = notification.extras;
        }
        else {
            if (sdk_INT < 16) {
                return null;
            }
            bundle = androidx.core.app.u.k(notification);
        }
        return bundle.getString("android.support.sortKey");
    }
    
    @k0
    @p0(19)
    public static CharSequence D(@j0 final Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }
    
    public static long E(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0L;
    }
    
    @p0(19)
    public static boolean F(@j0 final Notification notification) {
        return notification.extras.getBoolean("android.showChronometer");
    }
    
    public static int G(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 21) {
            return notification.visibility;
        }
        return 0;
    }
    
    public static boolean H(@j0 final Notification notification) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT >= 20) {
            if ((notification.flags & 0x200) != 0x0) {
                b = true;
            }
            return b;
        }
        Bundle bundle;
        if (sdk_INT >= 19) {
            bundle = notification.extras;
        }
        else {
            if (sdk_INT < 16) {
                return false;
            }
            bundle = androidx.core.app.u.k(notification);
        }
        return bundle.getBoolean("android.support.isGroupSummary");
    }
    
    @k0
    public static b a(@j0 final Notification notification, final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 20) {
            return b(notification.actions[n]);
        }
        final Bundle bundle = null;
        if (sdk_INT >= 19) {
            final Notification$Action notification$Action = notification.actions[n];
            final SparseArray sparseParcelableArray = notification.extras.getSparseParcelableArray("android.support.actionExtras");
            Bundle bundle2 = bundle;
            if (sparseParcelableArray != null) {
                bundle2 = (Bundle)sparseParcelableArray.get(n);
            }
            return androidx.core.app.u.l(notification$Action.icon, notification$Action.title, notification$Action.actionIntent, bundle2);
        }
        if (sdk_INT >= 16) {
            return androidx.core.app.u.e(notification, n);
        }
        return null;
    }
    
    @j0
    @p0(20)
    static b b(@j0 final Notification$Action notification$Action) {
        final RemoteInput[] remoteInputs = notification$Action.getRemoteInputs();
        IconCompat n = null;
        y[] array;
        if (remoteInputs == null) {
            array = null;
        }
        else {
            array = new y[remoteInputs.length];
            for (int i = 0; i < remoteInputs.length; ++i) {
                final RemoteInput remoteInput = remoteInputs[i];
                final String resultKey = remoteInput.getResultKey();
                final CharSequence label = remoteInput.getLabel();
                final CharSequence[] choices = remoteInput.getChoices();
                final boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                int editChoicesBeforeSending;
                if (Build$VERSION.SDK_INT >= 29) {
                    editChoicesBeforeSending = remoteInput.getEditChoicesBeforeSending();
                }
                else {
                    editChoicesBeforeSending = 0;
                }
                array[i] = new y(resultKey, label, choices, allowFreeFormInput, editChoicesBeforeSending, remoteInput.getExtras(), null);
            }
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean boolean1;
        if (sdk_INT >= 24) {
            boolean1 = (notification$Action.getExtras().getBoolean("android.support.allowGeneratedReplies") || notification$Action.getAllowGeneratedReplies());
        }
        else {
            boolean1 = notification$Action.getExtras().getBoolean("android.support.allowGeneratedReplies");
        }
        final boolean boolean2 = notification$Action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int n2;
        if (sdk_INT >= 28) {
            n2 = notification$Action.getSemanticAction();
        }
        else {
            n2 = notification$Action.getExtras().getInt("android.support.action.semanticAction", 0);
        }
        final boolean b = sdk_INT >= 29 && notification$Action.isContextual();
        if (sdk_INT >= 23) {
            if (notification$Action.getIcon() == null) {
                final int icon = notification$Action.icon;
                if (icon != 0) {
                    return new b(icon, notification$Action.title, notification$Action.actionIntent, notification$Action.getExtras(), array, null, boolean1, n2, boolean2, b);
                }
            }
            if (notification$Action.getIcon() != null) {
                n = IconCompat.n(notification$Action.getIcon());
            }
            return new b(n, notification$Action.title, notification$Action.actionIntent, notification$Action.getExtras(), array, null, boolean1, n2, boolean2, b);
        }
        return new b(notification$Action.icon, notification$Action.title, notification$Action.actionIntent, notification$Action.getExtras(), array, null, boolean1, n2, boolean2, b);
    }
    
    public static int c(@j0 final Notification notification) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        int length = 0;
        if (sdk_INT >= 19) {
            final Notification$Action[] actions = notification.actions;
            if (actions != null) {
                length = actions.length;
            }
            return length;
        }
        if (sdk_INT >= 16) {
            return androidx.core.app.u.f(notification);
        }
        return 0;
    }
    
    public static boolean d(@j0 final Notification notification) {
        return Build$VERSION.SDK_INT >= 29 && notification.getAllowSystemGeneratedContextualActions();
    }
    
    public static boolean e(@j0 final Notification notification) {
        return (notification.flags & 0x10) != 0x0;
    }
    
    public static int f(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }
    
    @k0
    public static f g(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 29) {
            return androidx.core.app.r.f.a(notification.getBubbleMetadata());
        }
        return null;
    }
    
    @k0
    public static String h(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 21) {
            return notification.category;
        }
        return null;
    }
    
    @k0
    public static String i(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }
    
    public static int j(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 21) {
            return notification.color;
        }
        return 0;
    }
    
    @k0
    @p0(19)
    public static CharSequence k(@j0 final Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }
    
    @k0
    @p0(19)
    public static CharSequence l(@j0 final Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }
    
    @k0
    @p0(19)
    public static CharSequence m(@j0 final Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }
    
    @k0
    public static Bundle n(@j0 final Notification notification) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 19) {
            return notification.extras;
        }
        if (sdk_INT >= 16) {
            return androidx.core.app.u.k(notification);
        }
        return null;
    }
    
    @k0
    public static String o(@j0 final Notification notification) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 20) {
            return notification.getGroup();
        }
        Bundle bundle;
        if (sdk_INT >= 19) {
            bundle = notification.extras;
        }
        else {
            if (sdk_INT < 16) {
                return null;
            }
            bundle = androidx.core.app.u.k(notification);
        }
        return bundle.getString("android.support.groupKey");
    }
    
    public static int p(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    static boolean q(@j0 final Notification notification) {
        return (notification.flags & 0x80) != 0x0;
    }
    
    @j0
    @p0(21)
    public static List<b> r(@j0 final Notification notification) {
        final ArrayList<b> list = new ArrayList<b>();
        if (Build$VERSION.SDK_INT >= 19) {
            final Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
            if (bundle == null) {
                return list;
            }
            final Bundle bundle2 = bundle.getBundle("invisible_actions");
            if (bundle2 != null) {
                for (int i = 0; i < bundle2.size(); ++i) {
                    list.add(androidx.core.app.u.g(bundle2.getBundle(Integer.toString(i))));
                }
            }
        }
        return list;
    }
    
    public static boolean s(@j0 final Notification notification) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = false;
        if (sdk_INT >= 20) {
            if ((notification.flags & 0x100) != 0x0) {
                b = true;
            }
            return b;
        }
        Bundle bundle;
        if (sdk_INT >= 19) {
            bundle = notification.extras;
        }
        else {
            if (sdk_INT < 16) {
                return false;
            }
            bundle = androidx.core.app.u.k(notification);
        }
        return bundle.getBoolean("android.support.localOnly");
    }
    
    @k0
    public static androidx.core.content.g t(@j0 final Notification notification) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        androidx.core.content.g d = null;
        if (sdk_INT >= 29) {
            final LocusId locusId = notification.getLocusId();
            if (locusId == null) {
                d = d;
            }
            else {
                d = androidx.core.content.g.d(locusId);
            }
        }
        return d;
    }
    
    @j0
    static Notification[] u(@j0 final Bundle bundle, @j0 final String s) {
        final Parcelable[] parcelableArray = bundle.getParcelableArray(s);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            final Notification[] array = new Notification[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; ++i) {
                array[i] = (Notification)parcelableArray[i];
            }
            bundle.putParcelableArray(s, (Parcelable[])array);
            return array;
        }
        return (Notification[])parcelableArray;
    }
    
    public static boolean v(@j0 final Notification notification) {
        return (notification.flags & 0x2) != 0x0;
    }
    
    public static boolean w(@j0 final Notification notification) {
        return (notification.flags & 0x8) != 0x0;
    }
    
    @j0
    public static List<x> x(@j0 final Notification notification) {
        final ArrayList<x> list = new ArrayList<x>();
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            final ArrayList parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                final Iterator<Person> iterator = parcelableArrayList.iterator();
                while (iterator.hasNext()) {
                    list.add(androidx.core.app.x.a(iterator.next()));
                }
            }
        }
        else if (sdk_INT >= 19) {
            final String[] stringArray = notification.extras.getStringArray("android.people");
            if (stringArray != null && stringArray.length != 0) {
                for (int length = stringArray.length, i = 0; i < length; ++i) {
                    list.add(new x.a().g(stringArray[i]).a());
                }
            }
        }
        return list;
    }
    
    @k0
    public static Notification y(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 21) {
            return notification.publicVersion;
        }
        return null;
    }
    
    @k0
    public static CharSequence z(@j0 final Notification notification) {
        if (Build$VERSION.SDK_INT >= 26) {
            return notification.getSettingsText();
        }
        return null;
    }
    
    public static class b
    {
        public static final int l = 0;
        public static final int m = 1;
        public static final int n = 2;
        public static final int o = 3;
        public static final int p = 4;
        public static final int q = 5;
        public static final int r = 6;
        public static final int s = 7;
        public static final int t = 8;
        public static final int u = 9;
        public static final int v = 10;
        static final String w = "android.support.action.showsUserInterface";
        static final String x = "android.support.action.semanticAction";
        final Bundle a;
        @k0
        private IconCompat b;
        private final y[] c;
        private final y[] d;
        private boolean e;
        boolean f;
        private final int g;
        private final boolean h;
        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;
        
        public b(final int n, @k0 final CharSequence charSequence, @k0 final PendingIntent pendingIntent) {
            IconCompat y = null;
            if (n != 0) {
                y = IconCompat.y(null, "", n);
            }
            this(y, charSequence, pendingIntent);
        }
        
        b(final int n, @k0 final CharSequence charSequence, @k0 final PendingIntent pendingIntent, @k0 final Bundle bundle, @k0 final y[] array, @k0 final y[] array2, final boolean b, final int n2, final boolean b2, final boolean b3) {
            IconCompat y = null;
            if (n != 0) {
                y = IconCompat.y(null, "", n);
            }
            this(y, charSequence, pendingIntent, bundle, array, array2, b, n2, b2, b3);
        }
        
        public b(@k0 final IconCompat iconCompat, @k0 final CharSequence charSequence, @k0 final PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }
        
        b(@k0 final IconCompat b, @k0 final CharSequence charSequence, @k0 final PendingIntent k, @k0 Bundle a, @k0 final y[] c, @k0 final y[] d, final boolean e, final int g, final boolean f, final boolean h) {
            this.f = true;
            this.b = b;
            if (b != null && b.F() == 2) {
                this.i = b.A();
            }
            this.j = androidx.core.app.r.g.z(charSequence);
            this.k = k;
            if (a == null) {
                a = new Bundle();
            }
            this.a = a;
            this.c = c;
            this.d = d;
            this.e = e;
            this.g = g;
            this.f = f;
            this.h = h;
        }
        
        @k0
        public PendingIntent a() {
            return this.k;
        }
        
        public boolean b() {
            return this.e;
        }
        
        @k0
        public y[] c() {
            return this.d;
        }
        
        @j0
        public Bundle d() {
            return this.a;
        }
        
        @Deprecated
        public int e() {
            return this.i;
        }
        
        @k0
        public IconCompat f() {
            if (this.b == null) {
                final int i = this.i;
                if (i != 0) {
                    this.b = IconCompat.y(null, "", i);
                }
            }
            return this.b;
        }
        
        @k0
        public y[] g() {
            return this.c;
        }
        
        public int h() {
            return this.g;
        }
        
        public boolean i() {
            return this.f;
        }
        
        @k0
        public CharSequence j() {
            return this.j;
        }
        
        public boolean k() {
            return this.h;
        }
        
        public static final class a
        {
            private final IconCompat a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d;
            private final Bundle e;
            private ArrayList<y> f;
            private int g;
            private boolean h;
            private boolean i;
            
            public a(final int n, @k0 final CharSequence charSequence, @k0 final PendingIntent pendingIntent) {
                IconCompat y = null;
                if (n != 0) {
                    y = IconCompat.y(null, "", n);
                }
                this(y, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }
            
            public a(@j0 final r.b b) {
                this(b.f(), b.j, b.k, new Bundle(b.a), b.g(), b.b(), b.h(), b.f, b.k());
            }
            
            public a(@k0 final IconCompat iconCompat, @k0 final CharSequence charSequence, @k0 final PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }
            
            private a(@k0 final IconCompat a, @k0 final CharSequence charSequence, @k0 final PendingIntent c, @j0 final Bundle e, @k0 final y[] a2, final boolean d, final int g, final boolean h, final boolean i) {
                this.d = true;
                this.h = true;
                this.a = a;
                this.b = androidx.core.app.r.g.z(charSequence);
                this.c = c;
                this.e = e;
                ArrayList<y> f;
                if (a2 == null) {
                    f = null;
                }
                else {
                    f = new ArrayList<y>(Arrays.asList(a2));
                }
                this.f = f;
                this.d = d;
                this.g = g;
                this.h = h;
                this.i = i;
            }
            
            private void d() {
                if (!this.i) {
                    return;
                }
                Objects.requireNonNull(this.c, "Contextual Actions must contain a valid PendingIntent");
            }
            
            @j0
            @p0(19)
            @t0({ androidx.annotation.t0.a.I })
            public static a f(@j0 final Notification$Action notification$Action) {
                final int sdk_INT = Build$VERSION.SDK_INT;
                a a;
                if (sdk_INT >= 23 && notification$Action.getIcon() != null) {
                    a = new a(IconCompat.m(notification$Action.getIcon()), notification$Action.title, notification$Action.actionIntent);
                }
                else {
                    a = new a(notification$Action.icon, notification$Action.title, notification$Action.actionIntent);
                }
                if (sdk_INT >= 20) {
                    final RemoteInput[] remoteInputs = notification$Action.getRemoteInputs();
                    if (remoteInputs != null && remoteInputs.length != 0) {
                        for (int length = remoteInputs.length, i = 0; i < length; ++i) {
                            a.b(androidx.core.app.y.e(remoteInputs[i]));
                        }
                    }
                }
                final int sdk_INT2 = Build$VERSION.SDK_INT;
                if (sdk_INT2 >= 24) {
                    a.d = notification$Action.getAllowGeneratedReplies();
                }
                if (sdk_INT2 >= 28) {
                    a.j(notification$Action.getSemanticAction());
                }
                if (sdk_INT2 >= 29) {
                    a.i(notification$Action.isContextual());
                }
                return a;
            }
            
            @j0
            public a a(@k0 final Bundle bundle) {
                if (bundle != null) {
                    this.e.putAll(bundle);
                }
                return this;
            }
            
            @j0
            public a b(@k0 final y e) {
                if (this.f == null) {
                    this.f = new ArrayList<y>();
                }
                if (e != null) {
                    this.f.add(e);
                }
                return this;
            }
            
            @j0
            public r.b c() {
                this.d();
                final ArrayList<y> list = new ArrayList<y>();
                final ArrayList<y> list2 = new ArrayList<y>();
                final ArrayList<y> f = this.f;
                if (f != null) {
                    for (final y y : f) {
                        if (y.r()) {
                            list.add(y);
                        }
                        else {
                            list2.add(y);
                        }
                    }
                }
                final boolean empty = list.isEmpty();
                y[] array = null;
                y[] array2;
                if (empty) {
                    array2 = null;
                }
                else {
                    array2 = list.toArray(new y[list.size()]);
                }
                if (!list2.isEmpty()) {
                    array = list2.toArray(new y[list2.size()]);
                }
                return new r.b(this.a, this.b, this.c, this.e, array, array2, this.d, this.g, this.h, this.i);
            }
            
            @j0
            public a e(@j0 final r.b.b b) {
                b.a(this);
                return this;
            }
            
            @j0
            public Bundle g() {
                return this.e;
            }
            
            @j0
            public a h(final boolean d) {
                this.d = d;
                return this;
            }
            
            @j0
            public a i(final boolean i) {
                this.i = i;
                return this;
            }
            
            @j0
            public a j(final int g) {
                this.g = g;
                return this;
            }
            
            @j0
            public a k(final boolean h) {
                this.h = h;
                return this;
            }
        }
        
        public interface b
        {
            @j0
            a a(@j0 final a p0);
        }
        
        @Retention(RetentionPolicy.SOURCE)
        public @interface c {
        }
        
        public static final class d implements r.b.b
        {
            private static final String e = "android.wearable.EXTENSIONS";
            private static final String f = "flags";
            private static final String g = "inProgressLabel";
            private static final String h = "confirmLabel";
            private static final String i = "cancelLabel";
            private static final int j = 1;
            private static final int k = 2;
            private static final int l = 4;
            private static final int m = 1;
            private int a;
            private CharSequence b;
            private CharSequence c;
            private CharSequence d;
            
            public d() {
                this.a = 1;
            }
            
            public d(@j0 final r.b b) {
                this.a = 1;
                final Bundle bundle = b.d().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.a = bundle.getInt("flags", 1);
                    this.b = bundle.getCharSequence("inProgressLabel");
                    this.c = bundle.getCharSequence("confirmLabel");
                    this.d = bundle.getCharSequence("cancelLabel");
                }
            }
            
            private void l(int a, final boolean b) {
                if (b) {
                    a |= this.a;
                }
                else {
                    a = (~a & this.a);
                }
                this.a = a;
            }
            
            @j0
            @Override
            public a a(@j0 final a a) {
                final Bundle bundle = new Bundle();
                final int a2 = this.a;
                if (a2 != 1) {
                    bundle.putInt("flags", a2);
                }
                final CharSequence b = this.b;
                if (b != null) {
                    bundle.putCharSequence("inProgressLabel", b);
                }
                final CharSequence c = this.c;
                if (c != null) {
                    bundle.putCharSequence("confirmLabel", c);
                }
                final CharSequence d = this.d;
                if (d != null) {
                    bundle.putCharSequence("cancelLabel", d);
                }
                a.g().putBundle("android.wearable.EXTENSIONS", bundle);
                return a;
            }
            
            @j0
            public d b() {
                final d d = new d();
                d.a = this.a;
                d.b = this.b;
                d.c = this.c;
                d.d = this.d;
                return d;
            }
            
            @Deprecated
            @k0
            public CharSequence c() {
                return this.d;
            }
            
            @Deprecated
            @k0
            public CharSequence d() {
                return this.c;
            }
            
            public boolean e() {
                return (this.a & 0x4) != 0x0;
            }
            
            public boolean f() {
                return (this.a & 0x2) != 0x0;
            }
            
            @Deprecated
            @k0
            public CharSequence g() {
                return this.b;
            }
            
            public boolean h() {
                final int a = this.a;
                boolean b = true;
                if ((a & 0x1) == 0x0) {
                    b = false;
                }
                return b;
            }
            
            @j0
            public d i(final boolean b) {
                this.l(1, b);
                return this;
            }
            
            @Deprecated
            @j0
            public d j(@k0 final CharSequence d) {
                this.d = d;
                return this;
            }
            
            @Deprecated
            @j0
            public d k(@k0 final CharSequence c) {
                this.c = c;
                return this;
            }
            
            @j0
            public d m(final boolean b) {
                this.l(4, b);
                return this;
            }
            
            @j0
            public d n(final boolean b) {
                this.l(2, b);
                return this;
            }
            
            @Deprecated
            @j0
            public d o(@k0 final CharSequence b) {
                this.b = b;
                return this;
            }
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface c {
    }
    
    public static class d extends p
    {
        private static final String h = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private Bitmap e;
        private IconCompat f;
        private boolean g;
        
        public d() {
        }
        
        public d(@k0 final g g) {
            ((p)this).z(g);
        }
        
        @k0
        private static IconCompat A(@k0 final Parcelable parcelable) {
            if (parcelable != null) {
                if (Build$VERSION.SDK_INT >= 23 && parcelable instanceof Icon) {
                    return IconCompat.m((Icon)parcelable);
                }
                if (parcelable instanceof Bitmap) {
                    return IconCompat.s((Bitmap)parcelable);
                }
            }
            return null;
        }
        
        @j0
        public d B(@k0 final Bitmap bitmap) {
            IconCompat s;
            if (bitmap == null) {
                s = null;
            }
            else {
                s = IconCompat.s(bitmap);
            }
            this.f = s;
            this.g = true;
            return this;
        }
        
        @j0
        public d C(@k0 final Bitmap e) {
            this.e = e;
            return this;
        }
        
        @j0
        public d D(@k0 final CharSequence charSequence) {
            super.b = androidx.core.app.r.g.z(charSequence);
            return this;
        }
        
        @j0
        public d E(@k0 final CharSequence charSequence) {
            super.c = androidx.core.app.r.g.z(charSequence);
            super.d = true;
            return this;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public void b(final androidx.core.app.o o) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 16) {
                final Notification$BigPictureStyle bigPicture = new Notification$BigPictureStyle(o.a()).setBigContentTitle(super.b).bigPicture(this.e);
                Label_0125: {
                    if (this.g) {
                        final IconCompat f = this.f;
                        Context f2 = null;
                        if (f != null) {
                            if (sdk_INT >= 23) {
                                if (o instanceof s) {
                                    f2 = ((s)o).f();
                                }
                                b.a(bigPicture, this.f.R(f2));
                                break Label_0125;
                            }
                            if (f.F() == 1) {
                                a.a(bigPicture, this.f.z());
                                break Label_0125;
                            }
                        }
                        a.a(bigPicture, null);
                    }
                }
                if (super.d) {
                    a.b(bigPicture, super.c);
                }
            }
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected void g(@j0 final Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
        }
        
        @j0
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected String t() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected void y(@j0 final Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f = A(bundle.getParcelable("android.largeIcon.big"));
                this.g = true;
            }
            this.e = (Bitmap)bundle.getParcelable("android.picture");
        }
        
        @p0(16)
        private static class a
        {
            @p0(16)
            static void a(final Notification$BigPictureStyle notification$BigPictureStyle, final Bitmap bitmap) {
                notification$BigPictureStyle.bigLargeIcon(bitmap);
            }
            
            @p0(16)
            static void b(final Notification$BigPictureStyle notification$BigPictureStyle, final CharSequence summaryText) {
                notification$BigPictureStyle.setSummaryText(summaryText);
            }
        }
        
        @p0(23)
        private static class b
        {
            @p0(23)
            static void a(final Notification$BigPictureStyle notification$BigPictureStyle, final Icon icon) {
                notification$BigPictureStyle.bigLargeIcon(icon);
            }
        }
    }
    
    public static class e extends p
    {
        private static final String f = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence e;
        
        public e() {
        }
        
        public e(@k0 final g g) {
            ((p)this).z(g);
        }
        
        @j0
        public e A(@k0 final CharSequence charSequence) {
            this.e = androidx.core.app.r.g.z(charSequence);
            return this;
        }
        
        @j0
        public e B(@k0 final CharSequence charSequence) {
            super.b = androidx.core.app.r.g.z(charSequence);
            return this;
        }
        
        @j0
        public e C(@k0 final CharSequence charSequence) {
            super.c = androidx.core.app.r.g.z(charSequence);
            super.d = true;
            return this;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public void a(@j0 final Bundle bundle) {
            super.a(bundle);
            if (Build$VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.e);
            }
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public void b(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 16) {
                final Notification$BigTextStyle bigText = new Notification$BigTextStyle(o.a()).setBigContentTitle(super.b).bigText(this.e);
                if (super.d) {
                    bigText.setSummaryText(super.c);
                }
            }
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected void g(@j0 final Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.bigText");
        }
        
        @j0
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected String t() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected void y(@j0 final Bundle bundle) {
            super.y(bundle);
            this.e = bundle.getCharSequence("android.bigText");
        }
    }
    
    public static final class f
    {
        private static final int h = 1;
        private static final int i = 2;
        private PendingIntent a;
        private PendingIntent b;
        private IconCompat c;
        private int d;
        @androidx.annotation.p
        private int e;
        private int f;
        private String g;
        
        private f(@k0 final PendingIntent a, @k0 final PendingIntent b, @k0 final IconCompat c, final int d, @androidx.annotation.p final int e, final int f, @k0 final String g) {
            this.a = a;
            this.c = c;
            this.d = d;
            this.e = e;
            this.b = b;
            this.f = f;
            this.g = g;
        }
        
        @k0
        public static f a(@k0 final Notification$BubbleMetadata notification$BubbleMetadata) {
            if (notification$BubbleMetadata == null) {
                return null;
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 30) {
                return b.a(notification$BubbleMetadata);
            }
            if (sdk_INT == 29) {
                return a.a(notification$BubbleMetadata);
            }
            return null;
        }
        
        @k0
        public static Notification$BubbleMetadata k(@k0 final f f) {
            if (f == null) {
                return null;
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 30) {
                return b.b(f);
            }
            if (sdk_INT == 29) {
                return a.b(f);
            }
            return null;
        }
        
        public boolean b() {
            final int f = this.f;
            boolean b = true;
            if ((f & 0x1) == 0x0) {
                b = false;
            }
            return b;
        }
        
        @k0
        public PendingIntent c() {
            return this.b;
        }
        
        @androidx.annotation.q(unit = 0)
        public int d() {
            return this.d;
        }
        
        @androidx.annotation.p
        public int e() {
            return this.e;
        }
        
        @SuppressLint({ "InvalidNullConversion" })
        @k0
        public IconCompat f() {
            return this.c;
        }
        
        @SuppressLint({ "InvalidNullConversion" })
        @k0
        public PendingIntent g() {
            return this.a;
        }
        
        @k0
        public String h() {
            return this.g;
        }
        
        public boolean i() {
            return (this.f & 0x2) != 0x0;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public void j(final int f) {
            this.f = f;
        }
        
        @p0(29)
        private static class a
        {
            @k0
            @p0(29)
            static f a(@k0 final Notification$BubbleMetadata notification$BubbleMetadata) {
                if (notification$BubbleMetadata == null) {
                    return null;
                }
                if (notification$BubbleMetadata.getIntent() == null) {
                    return null;
                }
                final c i = new c(notification$BubbleMetadata.getIntent(), IconCompat.m(notification$BubbleMetadata.getIcon())).b(notification$BubbleMetadata.getAutoExpandBubble()).c(notification$BubbleMetadata.getDeleteIntent()).i(notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    i.d(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    i.e(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return i.a();
            }
            
            @k0
            @p0(29)
            static Notification$BubbleMetadata b(@k0 final f f) {
                if (f == null) {
                    return null;
                }
                if (f.g() == null) {
                    return null;
                }
                final Notification$BubbleMetadata$Builder setSuppressNotification = new Notification$BubbleMetadata$Builder().setIcon(f.f().Q()).setIntent(f.g()).setDeleteIntent(f.c()).setAutoExpandBubble(f.b()).setSuppressNotification(f.i());
                if (f.d() != 0) {
                    setSuppressNotification.setDesiredHeight(f.d());
                }
                if (f.e() != 0) {
                    setSuppressNotification.setDesiredHeightResId(f.e());
                }
                return setSuppressNotification.build();
            }
        }
        
        @p0(30)
        private static class b
        {
            @k0
            @p0(30)
            static f a(@k0 final Notification$BubbleMetadata notification$BubbleMetadata) {
                if (notification$BubbleMetadata == null) {
                    return null;
                }
                c c;
                if (notification$BubbleMetadata.getShortcutId() != null) {
                    c = new c(notification$BubbleMetadata.getShortcutId());
                }
                else {
                    c = new c(notification$BubbleMetadata.getIntent(), IconCompat.m(notification$BubbleMetadata.getIcon()));
                }
                c.b(notification$BubbleMetadata.getAutoExpandBubble()).c(notification$BubbleMetadata.getDeleteIntent()).i(notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    c.d(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    c.e(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return c.a();
            }
            
            @k0
            @p0(30)
            static Notification$BubbleMetadata b(@k0 final f f) {
                if (f == null) {
                    return null;
                }
                Notification$BubbleMetadata$Builder notification$BubbleMetadata$Builder;
                if (f.h() != null) {
                    notification$BubbleMetadata$Builder = new Notification$BubbleMetadata$Builder(f.h());
                }
                else {
                    notification$BubbleMetadata$Builder = new Notification$BubbleMetadata$Builder(f.g(), f.f().Q());
                }
                notification$BubbleMetadata$Builder.setDeleteIntent(f.c()).setAutoExpandBubble(f.b()).setSuppressNotification(f.i());
                if (f.d() != 0) {
                    notification$BubbleMetadata$Builder.setDesiredHeight(f.d());
                }
                if (f.e() != 0) {
                    notification$BubbleMetadata$Builder.setDesiredHeightResId(f.e());
                }
                return notification$BubbleMetadata$Builder.build();
            }
        }
        
        public static final class c
        {
            private PendingIntent a;
            private IconCompat b;
            private int c;
            @androidx.annotation.p
            private int d;
            private int e;
            private PendingIntent f;
            private String g;
            
            @Deprecated
            public c() {
            }
            
            public c(@j0 final PendingIntent pendingIntent, @j0 final IconCompat iconCompat) {
                Objects.requireNonNull(pendingIntent, "Bubble requires non-null pending intent");
                Objects.requireNonNull(iconCompat, "Bubbles require non-null icon");
                this.a = pendingIntent;
                this.b = iconCompat;
            }
            
            @p0(30)
            public c(@j0 final String g) {
                if (!TextUtils.isEmpty((CharSequence)g)) {
                    this.g = g;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }
            
            @j0
            private c f(int e, final boolean b) {
                if (b) {
                    e |= this.e;
                }
                else {
                    e = (~e & this.e);
                }
                this.e = e;
                return this;
            }
            
            @SuppressLint({ "SyntheticAccessor" })
            @j0
            public f a() {
                final String g = this.g;
                if (g == null) {
                    Objects.requireNonNull(this.a, "Must supply pending intent or shortcut to bubble");
                }
                if (g == null) {
                    Objects.requireNonNull(this.b, "Must supply an icon or shortcut for the bubble");
                }
                final f f = new f(this.a, this.f, this.b, this.c, this.d, this.e, g);
                f.j(this.e);
                return f;
            }
            
            @j0
            public c b(final boolean b) {
                this.f(1, b);
                return this;
            }
            
            @j0
            public c c(@k0 final PendingIntent f) {
                this.f = f;
                return this;
            }
            
            @j0
            public c d(@androidx.annotation.q(unit = 0) final int a) {
                this.c = Math.max(a, 0);
                this.d = 0;
                return this;
            }
            
            @j0
            public c e(@androidx.annotation.p final int d) {
                this.d = d;
                this.c = 0;
                return this;
            }
            
            @j0
            public c g(@j0 final IconCompat iconCompat) {
                if (this.g == null) {
                    Objects.requireNonNull(iconCompat, "Bubbles require non-null icon");
                    this.b = iconCompat;
                    return this;
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }
            
            @j0
            public c h(@j0 final PendingIntent pendingIntent) {
                if (this.g == null) {
                    Objects.requireNonNull(pendingIntent, "Bubble requires non-null pending intent");
                    this.a = pendingIntent;
                    return this;
                }
                throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
            }
            
            @j0
            public c i(final boolean b) {
                this.f(2, b);
                return this;
            }
        }
    }
    
    public static class g
    {
        private static final int X = 5120;
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        androidx.core.content.g O;
        long P;
        int Q;
        boolean R;
        f S;
        Notification T;
        boolean U;
        Icon V;
        @Deprecated
        public ArrayList<String> W;
        @t0({ androidx.annotation.t0.a.I })
        public Context a;
        @t0({ androidx.annotation.t0.a.I })
        public ArrayList<r.b> b;
        @j0
        @t0({ androidx.annotation.t0.a.I })
        public ArrayList<x> c;
        ArrayList<r.b> d;
        CharSequence e;
        CharSequence f;
        PendingIntent g;
        PendingIntent h;
        RemoteViews i;
        Bitmap j;
        CharSequence k;
        int l;
        int m;
        boolean n;
        boolean o;
        boolean p;
        p q;
        CharSequence r;
        CharSequence s;
        CharSequence[] t;
        int u;
        int v;
        boolean w;
        String x;
        boolean y;
        String z;
        
        @Deprecated
        public g(@j0 final Context context) {
            this(context, (String)null);
        }
        
        @p0(19)
        public g(@j0 final Context context, @j0 final Notification notification) {
            this(context, androidx.core.app.r.i(notification));
            final Bundle extras = notification.extras;
            final p s = androidx.core.app.r.p.s(notification);
            this.O(androidx.core.app.r.m(notification)).N(androidx.core.app.r.l(notification)).L(androidx.core.app.r.k(notification)).y0(androidx.core.app.r.D(notification)).m0(androidx.core.app.r.z(notification)).x0(s).M(notification.contentIntent).X(androidx.core.app.r.o(notification)).Z(androidx.core.app.r.H(notification)).d0(androidx.core.app.r.t(notification)).F0(notification.when).p0(androidx.core.app.r.B(notification)).C0(androidx.core.app.r.F(notification)).C(androidx.core.app.r.e(notification)).h0(androidx.core.app.r.w(notification)).g0(androidx.core.app.r.v(notification)).c0(androidx.core.app.r.s(notification)).a0(notification.largeIcon).D(androidx.core.app.r.f(notification)).F(androidx.core.app.r.h(notification)).E(androidx.core.app.r.g(notification)).f0(notification.number).z0(notification.tickerText).M(notification.contentIntent).T(notification.deleteIntent).W(notification.fullScreenIntent, androidx.core.app.r.q(notification)).w0(notification.sound, notification.audioStreamType).D0(notification.vibrate).b0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).S(notification.defaults).i0(notification.priority).I(androidx.core.app.r.j(notification)).E0(androidx.core.app.r.G(notification)).k0(androidx.core.app.r.y(notification)).u0(androidx.core.app.r.C(notification)).B0(androidx.core.app.r.E(notification)).n0(androidx.core.app.r.A(notification)).j0(extras.getInt("android.progressMax"), extras.getInt("android.progress"), extras.getBoolean("android.progressIndeterminate")).B(androidx.core.app.r.d(notification)).s0(notification.icon, notification.iconLevel).c(u(notification, s));
            if (Build$VERSION.SDK_INT >= 23) {
                this.V = notification.getSmallIcon();
            }
            final Notification$Action[] actions = notification.actions;
            final int n = 0;
            if (actions != null && actions.length != 0) {
                for (int length = actions.length, i = 0; i < length; ++i) {
                    this.b(androidx.core.app.r.b.a.f(actions[i]).c());
                }
            }
            if (Build$VERSION.SDK_INT >= 21) {
                final List<r.b> r = androidx.core.app.r.r(notification);
                if (!r.isEmpty()) {
                    final Iterator<r.b> iterator = r.iterator();
                    while (iterator.hasNext()) {
                        this.e(iterator.next());
                    }
                }
            }
            final String[] stringArray = notification.extras.getStringArray("android.people");
            if (stringArray != null && stringArray.length != 0) {
                for (int length2 = stringArray.length, j = n; j < length2; ++j) {
                    this.g(stringArray[j]);
                }
            }
            if (Build$VERSION.SDK_INT >= 28) {
                final ArrayList parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list");
                if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                    final Iterator<Person> iterator2 = parcelableArrayList.iterator();
                    while (iterator2.hasNext()) {
                        this.f(androidx.core.app.x.a(iterator2.next()));
                    }
                }
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 24 && extras.containsKey("android.chronometerCountDown")) {
                this.H(extras.getBoolean("android.chronometerCountDown"));
            }
            if (sdk_INT >= 26 && extras.containsKey("android.colorized")) {
                this.J(extras.getBoolean("android.colorized"));
            }
        }
        
        public g(@j0 final Context a, @j0 final String l) {
            this.b = new ArrayList<r.b>();
            this.c = new ArrayList<x>();
            this.d = new ArrayList<r.b>();
            this.n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            final Notification t = new Notification();
            this.T = t;
            this.a = a;
            this.L = l;
            t.when = System.currentTimeMillis();
            this.T.audioStreamType = -1;
            this.m = 0;
            this.W = new ArrayList<String>();
            this.R = true;
        }
        
        @k0
        private Bitmap A(@k0 final Bitmap bitmap) {
            Bitmap scaledBitmap = bitmap;
            if (bitmap != null) {
                if (Build$VERSION.SDK_INT >= 27) {
                    scaledBitmap = bitmap;
                }
                else {
                    final Resources resources = this.a.getResources();
                    final int dimensionPixelSize = resources.getDimensionPixelSize(k.a.c.g);
                    final int dimensionPixelSize2 = resources.getDimensionPixelSize(k.a.c.f);
                    if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                        return bitmap;
                    }
                    final double min = Math.min(dimensionPixelSize / (double)Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / (double)Math.max(1, bitmap.getHeight()));
                    scaledBitmap = Bitmap.createScaledBitmap(bitmap, (int)Math.ceil(bitmap.getWidth() * min), (int)Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            return scaledBitmap;
        }
        
        private boolean G0() {
            final p q = this.q;
            return q == null || !q.r();
        }
        
        private void V(int flags, final boolean b) {
            Notification notification;
            if (b) {
                notification = this.T;
                flags |= notification.flags;
            }
            else {
                notification = this.T;
                flags = (~flags & notification.flags);
            }
            notification.flags = flags;
        }
        
        @k0
        @p0(19)
        private static Bundle u(@j0 final Notification notification, @k0 final p p2) {
            if (notification.extras == null) {
                return null;
            }
            final Bundle bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            bundle.remove("android.people");
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            final Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                final Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (p2 != null) {
                p2.g(bundle);
            }
            return bundle;
        }
        
        @k0
        protected static CharSequence z(@k0 final CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            CharSequence subSequence = charSequence;
            if (charSequence.length() > 5120) {
                subSequence = charSequence.subSequence(0, 5120);
            }
            return subSequence;
        }
        
        @Deprecated
        @j0
        public g A0(@k0 final CharSequence charSequence, @k0 final RemoteViews i) {
            this.T.tickerText = z(charSequence);
            this.i = i;
            return this;
        }
        
        @j0
        public g B(final boolean r) {
            this.R = r;
            return this;
        }
        
        @j0
        public g B0(final long p) {
            this.P = p;
            return this;
        }
        
        @j0
        public g C(final boolean b) {
            this.V(16, b);
            return this;
        }
        
        @j0
        public g C0(final boolean o) {
            this.o = o;
            return this;
        }
        
        @j0
        public g D(final int m) {
            this.M = m;
            return this;
        }
        
        @j0
        public g D0(@k0 final long[] vibrate) {
            this.T.vibrate = vibrate;
            return this;
        }
        
        @j0
        public g E(@k0 final f s) {
            this.S = s;
            return this;
        }
        
        @j0
        public g E0(final int g) {
            this.G = g;
            return this;
        }
        
        @j0
        public g F(@k0 final String d) {
            this.D = d;
            return this;
        }
        
        @j0
        public g F0(final long when) {
            this.T.when = when;
            return this;
        }
        
        @j0
        public g G(@j0 final String l) {
            this.L = l;
            return this;
        }
        
        @j0
        @p0(24)
        public g H(final boolean p) {
            this.p = p;
            this.t().putBoolean("android.chronometerCountDown", p);
            return this;
        }
        
        @j0
        public g I(@androidx.annotation.l final int f) {
            this.F = f;
            return this;
        }
        
        @j0
        public g J(final boolean b) {
            this.B = b;
            this.C = true;
            return this;
        }
        
        @j0
        public g K(@k0 final RemoteViews contentView) {
            this.T.contentView = contentView;
            return this;
        }
        
        @j0
        public g L(@k0 final CharSequence charSequence) {
            this.k = z(charSequence);
            return this;
        }
        
        @j0
        public g M(@k0 final PendingIntent g) {
            this.g = g;
            return this;
        }
        
        @j0
        public g N(@k0 final CharSequence charSequence) {
            this.f = z(charSequence);
            return this;
        }
        
        @j0
        public g O(@k0 final CharSequence charSequence) {
            this.e = z(charSequence);
            return this;
        }
        
        @j0
        public g P(@k0 final RemoteViews j) {
            this.J = j;
            return this;
        }
        
        @j0
        public g Q(@k0 final RemoteViews i) {
            this.I = i;
            return this;
        }
        
        @j0
        public g R(@k0 final RemoteViews k) {
            this.K = k;
            return this;
        }
        
        @j0
        public g S(final int defaults) {
            final Notification t = this.T;
            t.defaults = defaults;
            if ((defaults & 0x4) != 0x0) {
                t.flags |= 0x1;
            }
            return this;
        }
        
        @j0
        public g T(@k0 final PendingIntent deleteIntent) {
            this.T.deleteIntent = deleteIntent;
            return this;
        }
        
        @j0
        public g U(@k0 final Bundle e) {
            this.E = e;
            return this;
        }
        
        @j0
        public g W(@k0 final PendingIntent h, final boolean b) {
            this.h = h;
            this.V(128, b);
            return this;
        }
        
        @j0
        public g X(@k0 final String x) {
            this.x = x;
            return this;
        }
        
        @j0
        public g Y(final int q) {
            this.Q = q;
            return this;
        }
        
        @j0
        public g Z(final boolean y) {
            this.y = y;
            return this;
        }
        
        @j0
        public g a(final int n, @k0 final CharSequence charSequence, @k0 final PendingIntent pendingIntent) {
            this.b.add(new r.b(n, charSequence, pendingIntent));
            return this;
        }
        
        @j0
        public g a0(@k0 final Bitmap bitmap) {
            this.j = this.A(bitmap);
            return this;
        }
        
        @j0
        public g b(@k0 final r.b e) {
            if (e != null) {
                this.b.add(e);
            }
            return this;
        }
        
        @j0
        public g b0(@androidx.annotation.l int ledARGB, final int ledOnMS, final int ledOffMS) {
            final Notification t = this.T;
            t.ledARGB = ledARGB;
            t.ledOnMS = ledOnMS;
            t.ledOffMS = ledOffMS;
            if (ledOnMS != 0 && ledOffMS != 0) {
                ledARGB = 1;
            }
            else {
                ledARGB = 0;
            }
            t.flags = (ledARGB | (t.flags & 0xFFFFFFFE));
            return this;
        }
        
        @j0
        public g c(@k0 final Bundle bundle) {
            if (bundle != null) {
                final Bundle e = this.E;
                if (e == null) {
                    this.E = new Bundle(bundle);
                }
                else {
                    e.putAll(bundle);
                }
            }
            return this;
        }
        
        @j0
        public g c0(final boolean a) {
            this.A = a;
            return this;
        }
        
        @j0
        @p0(21)
        public g d(final int n, @k0 final CharSequence charSequence, @k0 final PendingIntent pendingIntent) {
            this.d.add(new r.b(n, charSequence, pendingIntent));
            return this;
        }
        
        @j0
        public g d0(@k0 final androidx.core.content.g o) {
            this.O = o;
            return this;
        }
        
        @j0
        @p0(21)
        public g e(@k0 final r.b e) {
            if (e != null) {
                this.d.add(e);
            }
            return this;
        }
        
        @Deprecated
        @j0
        public g e0() {
            this.U = true;
            return this;
        }
        
        @j0
        public g f(@k0 final x e) {
            if (e != null) {
                this.c.add(e);
            }
            return this;
        }
        
        @j0
        public g f0(final int l) {
            this.l = l;
            return this;
        }
        
        @Deprecated
        @j0
        public g g(@k0 final String e) {
            if (e != null && !e.isEmpty()) {
                this.W.add(e);
            }
            return this;
        }
        
        @j0
        public g g0(final boolean b) {
            this.V(2, b);
            return this;
        }
        
        @j0
        public Notification h() {
            return new s(this).c();
        }
        
        @j0
        public g h0(final boolean b) {
            this.V(8, b);
            return this;
        }
        
        @j0
        public g i() {
            this.b.clear();
            return this;
        }
        
        @j0
        public g i0(final int m) {
            this.m = m;
            return this;
        }
        
        @j0
        public g j() {
            this.d.clear();
            final Bundle bundle = this.E.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                final Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.E.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }
        
        @j0
        public g j0(final int u, final int v, final boolean w) {
            this.u = u;
            this.v = v;
            this.w = w;
            return this;
        }
        
        @j0
        public g k() {
            this.c.clear();
            this.W.clear();
            return this;
        }
        
        @j0
        public g k0(@k0 final Notification h) {
            this.H = h;
            return this;
        }
        
        @SuppressLint({ "BuilderSetStyle" })
        @k0
        public RemoteViews l() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT < 16) {
                return null;
            }
            if (this.J != null && this.G0()) {
                return this.J;
            }
            final s s = new s(this);
            final p q = this.q;
            if (q != null) {
                final RemoteViews v = q.v(s);
                if (v != null) {
                    return v;
                }
            }
            final Notification c = s.c();
            if (sdk_INT >= 24) {
                return Notification$Builder.recoverBuilder(this.a, c).createBigContentView();
            }
            return c.bigContentView;
        }
        
        @j0
        public g l0(@k0 final CharSequence[] t) {
            this.t = t;
            return this;
        }
        
        @SuppressLint({ "BuilderSetStyle" })
        @k0
        public RemoteViews m() {
            if (this.I != null && this.G0()) {
                return this.I;
            }
            final s s = new s(this);
            final p q = this.q;
            if (q != null) {
                final RemoteViews w = q.w(s);
                if (w != null) {
                    return w;
                }
            }
            final Notification c = s.c();
            if (Build$VERSION.SDK_INT >= 24) {
                return Notification$Builder.recoverBuilder(this.a, c).createContentView();
            }
            return c.contentView;
        }
        
        @j0
        public g m0(@k0 final CharSequence charSequence) {
            this.s = z(charSequence);
            return this;
        }
        
        @SuppressLint({ "BuilderSetStyle" })
        @k0
        public RemoteViews n() {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT < 21) {
                return null;
            }
            if (this.K != null && this.G0()) {
                return this.K;
            }
            final s s = new s(this);
            final p q = this.q;
            if (q != null) {
                final RemoteViews x = q.x(s);
                if (x != null) {
                    return x;
                }
            }
            final Notification c = s.c();
            if (sdk_INT >= 24) {
                return Notification$Builder.recoverBuilder(this.a, c).createHeadsUpContentView();
            }
            return c.headsUpContentView;
        }
        
        @j0
        public g n0(@k0 final String n) {
            this.N = n;
            return this;
        }
        
        @j0
        public g o(@j0 final j j) {
            j.a(this);
            return this;
        }
        
        @j0
        public g o0(@k0 final androidx.core.content.pm.e e) {
            if (e == null) {
                return this;
            }
            this.N = e.j();
            Label_0063: {
                if (this.O == null) {
                    androidx.core.content.g n;
                    if (e.n() != null) {
                        n = e.n();
                    }
                    else {
                        if (e.j() == null) {
                            break Label_0063;
                        }
                        n = new androidx.core.content.g(e.j());
                    }
                    this.O = n;
                }
            }
            if (this.e == null) {
                this.O(e.v());
            }
            return this;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public RemoteViews p() {
            return this.J;
        }
        
        @j0
        public g p0(final boolean n) {
            this.n = n;
            return this;
        }
        
        @k0
        @t0({ androidx.annotation.t0.a.I })
        public f q() {
            return this.S;
        }
        
        @j0
        public g q0(final boolean u) {
            this.U = u;
            return this;
        }
        
        @androidx.annotation.l
        @t0({ androidx.annotation.t0.a.I })
        public int r() {
            return this.F;
        }
        
        @j0
        public g r0(final int icon) {
            this.T.icon = icon;
            return this;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public RemoteViews s() {
            return this.I;
        }
        
        @j0
        public g s0(final int icon, final int iconLevel) {
            final Notification t = this.T;
            t.icon = icon;
            t.iconLevel = iconLevel;
            return this;
        }
        
        @j0
        public Bundle t() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }
        
        @j0
        @p0(23)
        public g t0(@j0 final IconCompat iconCompat) {
            this.V = iconCompat.R(this.a);
            return this;
        }
        
        @j0
        public g u0(@k0 final String z) {
            this.z = z;
            return this;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public RemoteViews v() {
            return this.K;
        }
        
        @j0
        public g v0(@k0 final Uri sound) {
            final Notification t = this.T;
            t.sound = sound;
            t.audioStreamType = -1;
            if (Build$VERSION.SDK_INT >= 21) {
                t.audioAttributes = new AudioAttributes$Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }
        
        @Deprecated
        @j0
        public Notification w() {
            return this.h();
        }
        
        @j0
        public g w0(@k0 final Uri sound, final int n) {
            final Notification t = this.T;
            t.sound = sound;
            t.audioStreamType = n;
            if (Build$VERSION.SDK_INT >= 21) {
                t.audioAttributes = new AudioAttributes$Builder().setContentType(4).setLegacyStreamType(n).build();
            }
            return this;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public int x() {
            return this.m;
        }
        
        @j0
        public g x0(@k0 final p q) {
            if (this.q != q && (this.q = q) != null) {
                q.z(this);
            }
            return this;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public long y() {
            long when;
            if (this.n) {
                when = this.T.when;
            }
            else {
                when = 0L;
            }
            return when;
        }
        
        @j0
        public g y0(@k0 final CharSequence charSequence) {
            this.r = z(charSequence);
            return this;
        }
        
        @j0
        public g z0(@k0 final CharSequence charSequence) {
            this.T.tickerText = z(charSequence);
            return this;
        }
    }
    
    public static final class h implements j
    {
        @t0({ androidx.annotation.t0.a.I })
        static final String d = "android.car.EXTENSIONS";
        private static final String e = "large_icon";
        private static final String f = "car_conversation";
        private static final String g = "app_color";
        @t0({ androidx.annotation.t0.a.I })
        static final String h = "invisible_actions";
        private static final String i = "author";
        private static final String j = "text";
        private static final String k = "messages";
        private static final String l = "remote_input";
        private static final String m = "on_reply";
        private static final String n = "on_read";
        private static final String o = "participants";
        private static final String p = "timestamp";
        private Bitmap a;
        private a b;
        private int c;
        
        public h() {
            this.c = 0;
        }
        
        public h(@j0 final Notification notification) {
            this.c = 0;
            if (Build$VERSION.SDK_INT < 21) {
                return;
            }
            Bundle bundle;
            if (androidx.core.app.r.n(notification) == null) {
                bundle = null;
            }
            else {
                bundle = androidx.core.app.r.n(notification).getBundle("android.car.EXTENSIONS");
            }
            if (bundle != null) {
                this.a = (Bitmap)bundle.getParcelable("large_icon");
                this.c = bundle.getInt("app_color", 0);
                this.b = f(bundle.getBundle("car_conversation"));
            }
        }
        
        @p0(21)
        private static Bundle b(@j0 final a a) {
            final Bundle bundle = new Bundle();
            final String[] d = a.d();
            int i = 0;
            String s;
            if (d != null && a.d().length > 1) {
                s = a.d()[0];
            }
            else {
                s = null;
            }
            final int length = a.b().length;
            final Parcelable[] array = new Parcelable[length];
            while (i < length) {
                final Bundle bundle2 = new Bundle();
                bundle2.putString("text", a.b()[i]);
                bundle2.putString("author", s);
                array[i] = (Parcelable)bundle2;
                ++i;
            }
            bundle.putParcelableArray("messages", array);
            final y f = a.f();
            if (f != null) {
                bundle.putParcelable("remote_input", (Parcelable)new RemoteInput$Builder(f.o()).setLabel(f.n()).setChoices(f.h()).setAllowFreeFormInput(f.f()).addExtras(f.m()).build());
            }
            bundle.putParcelable("on_reply", (Parcelable)a.g());
            bundle.putParcelable("on_read", (Parcelable)a.e());
            bundle.putStringArray("participants", a.d());
            bundle.putLong("timestamp", a.a());
            return bundle;
        }
        
        @p0(21)
        private static a f(@k0 final Bundle bundle) {
            final a a = null;
            final y y = null;
            if (bundle == null) {
                return null;
            }
            final Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            String[] array = null;
            Label_0108: {
                if (parcelableArray != null) {
                    final int length = parcelableArray.length;
                    array = new String[length];
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            if (parcelableArray[i] instanceof Bundle) {
                                array[i] = ((Bundle)parcelableArray[i]).getString("text");
                                if (array[i] != null) {
                                    ++i;
                                    continue;
                                }
                            }
                            final boolean b = false;
                            if (b) {
                                break Label_0108;
                            }
                            return null;
                        }
                        final boolean b = true;
                        continue;
                    }
                }
                array = null;
            }
            final PendingIntent pendingIntent = (PendingIntent)bundle.getParcelable("on_read");
            final PendingIntent pendingIntent2 = (PendingIntent)bundle.getParcelable("on_reply");
            final RemoteInput remoteInput = (RemoteInput)bundle.getParcelable("remote_input");
            final String[] stringArray = bundle.getStringArray("participants");
            a a2 = a;
            if (stringArray != null) {
                if (stringArray.length != 1) {
                    a2 = a;
                }
                else {
                    y y2 = y;
                    if (remoteInput != null) {
                        final String resultKey = remoteInput.getResultKey();
                        final CharSequence label = remoteInput.getLabel();
                        final CharSequence[] choices = remoteInput.getChoices();
                        final boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                        int editChoicesBeforeSending;
                        if (Build$VERSION.SDK_INT >= 29) {
                            editChoicesBeforeSending = remoteInput.getEditChoicesBeforeSending();
                        }
                        else {
                            editChoicesBeforeSending = 0;
                        }
                        y2 = new y(resultKey, label, choices, allowFreeFormInput, editChoicesBeforeSending, remoteInput.getExtras(), null);
                    }
                    a2 = new a(array, y2, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
                }
            }
            return a2;
        }
        
        @j0
        @Override
        public g a(@j0 final g g) {
            if (Build$VERSION.SDK_INT < 21) {
                return g;
            }
            final Bundle bundle = new Bundle();
            final Bitmap a = this.a;
            if (a != null) {
                bundle.putParcelable("large_icon", (Parcelable)a);
            }
            final int c = this.c;
            if (c != 0) {
                bundle.putInt("app_color", c);
            }
            final a b = this.b;
            if (b != null) {
                bundle.putBundle("car_conversation", b(b));
            }
            g.t().putBundle("android.car.EXTENSIONS", bundle);
            return g;
        }
        
        @androidx.annotation.l
        public int c() {
            return this.c;
        }
        
        @k0
        public Bitmap d() {
            return this.a;
        }
        
        @Deprecated
        @k0
        public a e() {
            return this.b;
        }
        
        @j0
        public h g(@androidx.annotation.l final int c) {
            this.c = c;
            return this;
        }
        
        @j0
        public h h(@k0 final Bitmap a) {
            this.a = a;
            return this;
        }
        
        @Deprecated
        @j0
        public h i(@k0 final a b) {
            this.b = b;
            return this;
        }
        
        @Deprecated
        public static class a
        {
            private final String[] a;
            private final y b;
            private final PendingIntent c;
            private final PendingIntent d;
            private final String[] e;
            private final long f;
            
            a(@k0 final String[] a, @k0 final y b, @k0 final PendingIntent c, @k0 final PendingIntent d, @k0 final String[] e, final long f) {
                this.a = a;
                this.b = b;
                this.d = d;
                this.c = c;
                this.e = e;
                this.f = f;
            }
            
            public long a() {
                return this.f;
            }
            
            @k0
            public String[] b() {
                return this.a;
            }
            
            @k0
            public String c() {
                final String[] e = this.e;
                String s;
                if (e.length > 0) {
                    s = e[0];
                }
                else {
                    s = null;
                }
                return s;
            }
            
            @k0
            public String[] d() {
                return this.e;
            }
            
            @k0
            public PendingIntent e() {
                return this.d;
            }
            
            @k0
            public y f() {
                return this.b;
            }
            
            @k0
            public PendingIntent g() {
                return this.c;
            }
            
            public static class a
            {
                private final List<String> a;
                private final String b;
                private y c;
                private PendingIntent d;
                private PendingIntent e;
                private long f;
                
                public a(@j0 final String b) {
                    this.a = new ArrayList<String>();
                    this.b = b;
                }
                
                @j0
                public a a(@k0 final String s) {
                    if (s != null) {
                        this.a.add(s);
                    }
                    return this;
                }
                
                @j0
                public h.a b() {
                    final List<String> a = this.a;
                    return new h.a(a.toArray(new String[a.size()]), this.c, this.e, this.d, new String[] { this.b }, this.f);
                }
                
                @j0
                public a c(final long f) {
                    this.f = f;
                    return this;
                }
                
                @j0
                public a d(@k0 final PendingIntent d) {
                    this.d = d;
                    return this;
                }
                
                @j0
                public a e(@k0 final PendingIntent e, @k0 final y c) {
                    this.c = c;
                    this.e = e;
                    return this;
                }
            }
        }
    }
    
    public static class i extends p
    {
        private static final String e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        private static final int f = 3;
        
        private RemoteViews A(final RemoteViews remoteViews, final boolean b) {
            final int d = k.a.g.d;
            final int n = 1;
            final int n2 = 0;
            final RemoteViews c = ((p)this).c(true, d, false);
            c.removeAllViews(k.a.e.L);
            final List<r.b> c2 = C(super.a.b);
            int n4 = 0;
            Label_0114: {
                if (b && c2 != null) {
                    final int min = Math.min(c2.size(), 3);
                    if (min > 0) {
                        int n3 = 0;
                        while (true) {
                            n4 = n;
                            if (n3 >= min) {
                                break Label_0114;
                            }
                            c.addView(k.a.e.L, this.B(c2.get(n3)));
                            ++n3;
                        }
                    }
                }
                n4 = 0;
            }
            int n5;
            if (n4 != 0) {
                n5 = n2;
            }
            else {
                n5 = 8;
            }
            c.setViewVisibility(k.a.e.L, n5);
            c.setViewVisibility(k.a.e.I, n5);
            ((p)this).e(c, remoteViews);
            return c;
        }
        
        private RemoteViews B(final r.b b) {
            final boolean b2 = b.k == null;
            final String packageName = super.a.a.getPackageName();
            int n;
            if (b2) {
                n = k.a.g.c;
            }
            else {
                n = k.a.g.b;
            }
            final RemoteViews remoteViews = new RemoteViews(packageName, n);
            final IconCompat f = b.f();
            if (f != null) {
                remoteViews.setImageViewBitmap(k.a.e.J, ((p)this).o(f, super.a.a.getResources().getColor(a.b.c)));
            }
            remoteViews.setTextViewText(k.a.e.K, b.j);
            if (!b2) {
                remoteViews.setOnClickPendingIntent(k.a.e.H, b.k);
            }
            if (Build$VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(k.a.e.H, b.j);
            }
            return remoteViews;
        }
        
        private static List<r.b> C(final List<r.b> list) {
            if (list == null) {
                return null;
            }
            final ArrayList<r.b> list2 = new ArrayList<r.b>();
            for (final r.b b : list) {
                if (!b.k()) {
                    list2.add(b);
                }
            }
            return list2;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public void b(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 24) {
                o.a().setStyle((Notification$Style)new Notification$DecoratedCustomViewStyle());
            }
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public boolean r() {
            return true;
        }
        
        @j0
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected String t() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public RemoteViews v(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViews = super.a.p();
            if (remoteViews == null) {
                remoteViews = super.a.s();
            }
            if (remoteViews == null) {
                return null;
            }
            return this.A(remoteViews, true);
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public RemoteViews w(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 24) {
                return null;
            }
            if (super.a.s() == null) {
                return null;
            }
            return this.A(super.a.s(), false);
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public RemoteViews x(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 24) {
                return null;
            }
            final RemoteViews v = super.a.v();
            RemoteViews s;
            if (v != null) {
                s = v;
            }
            else {
                s = super.a.s();
            }
            if (v == null) {
                return null;
            }
            return this.A(s, true);
        }
    }
    
    public interface j
    {
        @j0
        g a(@j0 final g p0);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface k {
    }
    
    public static class l extends p
    {
        private static final String f = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> e;
        
        public l() {
            this.e = new ArrayList<CharSequence>();
        }
        
        public l(@k0 final g g) {
            this.e = new ArrayList<CharSequence>();
            ((p)this).z(g);
        }
        
        @j0
        public l A(@k0 final CharSequence charSequence) {
            if (charSequence != null) {
                this.e.add(androidx.core.app.r.g.z(charSequence));
            }
            return this;
        }
        
        @j0
        public l B(@k0 final CharSequence charSequence) {
            super.b = androidx.core.app.r.g.z(charSequence);
            return this;
        }
        
        @j0
        public l C(@k0 final CharSequence charSequence) {
            super.c = androidx.core.app.r.g.z(charSequence);
            super.d = true;
            return this;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public void b(final androidx.core.app.o o) {
            if (Build$VERSION.SDK_INT >= 16) {
                final Notification$InboxStyle setBigContentTitle = new Notification$InboxStyle(o.a()).setBigContentTitle(super.b);
                if (super.d) {
                    setBigContentTitle.setSummaryText(super.c);
                }
                final Iterator<CharSequence> iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    setBigContentTitle.addLine((CharSequence)iterator.next());
                }
            }
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected void g(@j0 final Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.textLines");
        }
        
        @j0
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected String t() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected void y(@j0 final Bundle bundle) {
            super.y(bundle);
            this.e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.e, bundle.getCharSequenceArray("android.textLines"));
            }
        }
    }
    
    public static class m extends p
    {
        private static final String j = "androidx.core.app.NotificationCompat$MessagingStyle";
        public static final int k = 25;
        private final List<a> e;
        private final List<a> f;
        private x g;
        @k0
        private CharSequence h;
        @k0
        private Boolean i;
        
        m() {
            this.e = new ArrayList<a>();
            this.f = new ArrayList<a>();
        }
        
        public m(@j0 final x g) {
            this.e = new ArrayList<a>();
            this.f = new ArrayList<a>();
            if (!TextUtils.isEmpty(g.f())) {
                this.g = g;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
        
        @Deprecated
        public m(@j0 final CharSequence charSequence) {
            this.e = new ArrayList<a>();
            this.f = new ArrayList<a>();
            this.g = new x.a().f(charSequence).a();
        }
        
        @k0
        public static m E(@j0 final Notification notification) {
            final p s = androidx.core.app.r.p.s(notification);
            if (s instanceof m) {
                return (m)s;
            }
            return null;
        }
        
        @k0
        private a F() {
            for (int i = this.e.size() - 1; i >= 0; --i) {
                final a a = this.e.get(i);
                if (a.g() != null && !TextUtils.isEmpty(a.g().f())) {
                    return a;
                }
            }
            if (!this.e.isEmpty()) {
                final List<a> e = this.e;
                return e.get(e.size() - 1);
            }
            return null;
        }
        
        private boolean L() {
            for (int i = this.e.size() - 1; i >= 0; --i) {
                final a a = this.e.get(i);
                if (a.g() != null && a.g().f() == null) {
                    return true;
                }
            }
            return false;
        }
        
        @j0
        private TextAppearanceSpan N(final int n) {
            return new TextAppearanceSpan((String)null, 0, 0, ColorStateList.valueOf(n), (ColorStateList)null);
        }
        
        private CharSequence O(@j0 final a a) {
            final androidx.core.text.a c = androidx.core.text.a.c();
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            final boolean b = Build$VERSION.SDK_INT >= 21;
            int n;
            if (b) {
                n = -16777216;
            }
            else {
                n = -1;
            }
            final x g = a.g();
            final String s = "";
            CharSequence f;
            if (g == null) {
                f = "";
            }
            else {
                f = a.g().f();
            }
            int r = n;
            CharSequence charSequence = f;
            if (TextUtils.isEmpty(f)) {
                final CharSequence f2 = this.g.f();
                r = n;
                charSequence = f2;
                if (b) {
                    r = n;
                    charSequence = f2;
                    if (super.a.r() != 0) {
                        r = super.a.r();
                        charSequence = f2;
                    }
                }
            }
            final CharSequence m = c.m(charSequence);
            spannableStringBuilder.append(m);
            spannableStringBuilder.setSpan((Object)this.N(r), spannableStringBuilder.length() - m.length(), spannableStringBuilder.length(), 33);
            CharSequence i;
            if (a.i() == null) {
                i = s;
            }
            else {
                i = a.i();
            }
            spannableStringBuilder.append((CharSequence)"  ").append(c.m(i));
            return (CharSequence)spannableStringBuilder;
        }
        
        @j0
        public m A(@k0 final a a) {
            if (a != null) {
                this.f.add(a);
                if (this.f.size() > 25) {
                    this.f.remove(0);
                }
            }
            return this;
        }
        
        @j0
        public m B(@k0 final a a) {
            if (a != null) {
                this.e.add(a);
                if (this.e.size() > 25) {
                    this.e.remove(0);
                }
            }
            return this;
        }
        
        @j0
        public m C(@k0 final CharSequence charSequence, final long n, @k0 final x x) {
            this.B(new a(charSequence, n, x));
            return this;
        }
        
        @Deprecated
        @j0
        public m D(@k0 final CharSequence charSequence, final long n, @k0 final CharSequence charSequence2) {
            this.e.add(new a(charSequence, n, new x.a().f(charSequence2).a()));
            if (this.e.size() > 25) {
                this.e.remove(0);
            }
            return this;
        }
        
        @k0
        public CharSequence G() {
            return this.h;
        }
        
        @j0
        public List<a> H() {
            return this.f;
        }
        
        @j0
        public List<a> I() {
            return this.e;
        }
        
        @j0
        public x J() {
            return this.g;
        }
        
        @Deprecated
        @k0
        public CharSequence K() {
            return this.g.f();
        }
        
        public boolean M() {
            final g a = super.a;
            final boolean b = false;
            boolean b2 = false;
            if (a != null && a.a.getApplicationInfo().targetSdkVersion < 28 && this.i == null) {
                if (this.h != null) {
                    b2 = true;
                }
                return b2;
            }
            final Boolean i = this.i;
            boolean booleanValue = b;
            if (i != null) {
                booleanValue = i;
            }
            return booleanValue;
        }
        
        @j0
        public m P(@k0 final CharSequence h) {
            this.h = h;
            return this;
        }
        
        @j0
        public m Q(final boolean b) {
            this.i = b;
            return this;
        }
        
        @Override
        public void a(@j0 final Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.g.f());
            bundle.putBundle("android.messagingStyleUser", this.g.m());
            bundle.putCharSequence("android.hiddenConversationTitle", this.h);
            if (this.h != null && this.i) {
                bundle.putCharSequence("android.conversationTitle", this.h);
            }
            if (!this.e.isEmpty()) {
                bundle.putParcelableArray("android.messages", (Parcelable[])a.a(this.e));
            }
            if (!this.f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", (Parcelable[])a.a(this.f));
            }
            final Boolean i = this.i;
            if (i != null) {
                bundle.putBoolean("android.isGroupConversation", (boolean)i);
            }
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        public void b(final androidx.core.app.o o) {
            this.Q(this.M());
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 24) {
                Notification$MessagingStyle notification$MessagingStyle;
                if (sdk_INT >= 28) {
                    notification$MessagingStyle = new Notification$MessagingStyle(this.g.k());
                }
                else {
                    notification$MessagingStyle = new Notification$MessagingStyle(this.g.f());
                }
                final Iterator<a> iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    notification$MessagingStyle.addMessage(iterator.next().l());
                }
                if (Build$VERSION.SDK_INT >= 26) {
                    final Iterator<a> iterator2 = this.f.iterator();
                    while (iterator2.hasNext()) {
                        notification$MessagingStyle.addHistoricMessage(iterator2.next().l());
                    }
                }
                if (this.i || Build$VERSION.SDK_INT >= 28) {
                    notification$MessagingStyle.setConversationTitle(this.h);
                }
                if (Build$VERSION.SDK_INT >= 28) {
                    notification$MessagingStyle.setGroupConversation((boolean)this.i);
                }
                notification$MessagingStyle.setBuilder(o.a());
            }
            else {
                final a f = this.F();
                Label_0301: {
                    Notification$Builder notification$Builder;
                    CharSequence contentTitle;
                    if (this.h != null && this.i) {
                        notification$Builder = o.a();
                        contentTitle = this.h;
                    }
                    else {
                        if (f == null) {
                            break Label_0301;
                        }
                        o.a().setContentTitle((CharSequence)"");
                        if (f.g() == null) {
                            break Label_0301;
                        }
                        notification$Builder = o.a();
                        contentTitle = f.g().f();
                    }
                    notification$Builder.setContentTitle(contentTitle);
                }
                if (f != null) {
                    final Notification$Builder a = o.a();
                    CharSequence contentText;
                    if (this.h != null) {
                        contentText = this.O(f);
                    }
                    else {
                        contentText = f.i();
                    }
                    a.setContentText(contentText);
                }
                if (sdk_INT >= 16) {
                    final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    final boolean b = this.h != null || this.L();
                    for (int i = this.e.size() - 1; i >= 0; --i) {
                        final a a2 = this.e.get(i);
                        CharSequence charSequence;
                        if (b) {
                            charSequence = this.O(a2);
                        }
                        else {
                            charSequence = a2.i();
                        }
                        if (i != this.e.size() - 1) {
                            spannableStringBuilder.insert(0, (CharSequence)"\n");
                        }
                        spannableStringBuilder.insert(0, charSequence);
                    }
                    new Notification$BigTextStyle(o.a()).setBigContentTitle((CharSequence)null).bigText((CharSequence)spannableStringBuilder);
                }
            }
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected void g(@j0 final Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.messagingStyleUser");
            bundle.remove("android.selfDisplayName");
            bundle.remove("android.conversationTitle");
            bundle.remove("android.hiddenConversationTitle");
            bundle.remove("android.messages");
            bundle.remove("android.messages.historic");
            bundle.remove("android.isGroupConversation");
        }
        
        @j0
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected String t() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }
        
        @t0({ androidx.annotation.t0.a.I })
        @Override
        protected void y(@j0 final Bundle bundle) {
            super.y(bundle);
            this.e.clear();
            x g;
            if (bundle.containsKey("android.messagingStyleUser")) {
                g = androidx.core.app.x.b(bundle.getBundle("android.messagingStyleUser"));
            }
            else {
                g = new x.a().f(bundle.getString("android.selfDisplayName")).a();
            }
            this.g = g;
            final CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.h = charSequence;
            if (charSequence == null) {
                this.h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            final Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.e.addAll(a.f(parcelableArray));
            }
            final Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f.addAll(a.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.i = bundle.getBoolean("android.isGroupConversation");
            }
        }
        
        public static final class a
        {
            static final String g = "text";
            static final String h = "time";
            static final String i = "sender";
            static final String j = "type";
            static final String k = "uri";
            static final String l = "extras";
            static final String m = "person";
            static final String n = "sender_person";
            private final CharSequence a;
            private final long b;
            @k0
            private final x c;
            private Bundle d;
            @k0
            private String e;
            @k0
            private Uri f;
            
            public a(@k0 final CharSequence a, final long b, @k0 final x c) {
                this.d = new Bundle();
                this.a = a;
                this.b = b;
                this.c = c;
            }
            
            @Deprecated
            public a(@k0 final CharSequence charSequence, final long n, @k0 final CharSequence charSequence2) {
                this(charSequence, n, new x.a().f(charSequence2).a());
            }
            
            @j0
            static Bundle[] a(@j0 final List<a> list) {
                final Bundle[] array = new Bundle[list.size()];
                for (int size = list.size(), i = 0; i < size; ++i) {
                    array[i] = list.get(i).m();
                }
                return array;
            }
            
            @k0
            static a e(@j0 final Bundle bundle) {
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            x x;
                            if (bundle.containsKey("person")) {
                                x = androidx.core.app.x.b(bundle.getBundle("person"));
                            }
                            else if (bundle.containsKey("sender_person") && Build$VERSION.SDK_INT >= 28) {
                                x = androidx.core.app.x.a((Person)bundle.getParcelable("sender_person"));
                            }
                            else if (bundle.containsKey("sender")) {
                                x = new x.a().f(bundle.getCharSequence("sender")).a();
                            }
                            else {
                                x = null;
                            }
                            final a a = new a(bundle.getCharSequence("text"), bundle.getLong("time"), x);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                a.k(bundle.getString("type"), (Uri)bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                a.d().putAll(bundle.getBundle("extras"));
                            }
                            return a;
                        }
                    }
                    return null;
                }
                catch (ClassCastException ex) {
                    return null;
                }
            }
            
            @j0
            static List<a> f(@j0 final Parcelable[] array) {
                final ArrayList<a> list = new ArrayList<a>(array.length);
                for (int i = 0; i < array.length; ++i) {
                    if (array[i] instanceof Bundle) {
                        final a e = e((Bundle)array[i]);
                        if (e != null) {
                            list.add(e);
                        }
                    }
                }
                return list;
            }
            
            @j0
            private Bundle m() {
                final Bundle bundle = new Bundle();
                final CharSequence a = this.a;
                if (a != null) {
                    bundle.putCharSequence("text", a);
                }
                bundle.putLong("time", this.b);
                final x c = this.c;
                if (c != null) {
                    bundle.putCharSequence("sender", c.f());
                    if (Build$VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", (Parcelable)this.c.k());
                    }
                    else {
                        bundle.putBundle("person", this.c.m());
                    }
                }
                final String e = this.e;
                if (e != null) {
                    bundle.putString("type", e);
                }
                final Uri f = this.f;
                if (f != null) {
                    bundle.putParcelable("uri", (Parcelable)f);
                }
                final Bundle d = this.d;
                if (d != null) {
                    bundle.putBundle("extras", d);
                }
                return bundle;
            }
            
            @k0
            public String b() {
                return this.e;
            }
            
            @k0
            public Uri c() {
                return this.f;
            }
            
            @j0
            public Bundle d() {
                return this.d;
            }
            
            @k0
            public x g() {
                return this.c;
            }
            
            @Deprecated
            @k0
            public CharSequence h() {
                final x c = this.c;
                CharSequence f;
                if (c == null) {
                    f = null;
                }
                else {
                    f = c.f();
                }
                return f;
            }
            
            @k0
            public CharSequence i() {
                return this.a;
            }
            
            public long j() {
                return this.b;
            }
            
            @j0
            public a k(@k0 final String e, @k0 final Uri f) {
                this.e = e;
                this.f = f;
                return this;
            }
            
            @j0
            @p0(24)
            @t0({ androidx.annotation.t0.a.I })
            Notification$MessagingStyle$Message l() {
                final x g = this.g();
                final int sdk_INT = Build$VERSION.SDK_INT;
                final CharSequence charSequence = null;
                Person k = null;
                Notification$MessagingStyle$Message notification$MessagingStyle$Message;
                if (sdk_INT >= 28) {
                    final CharSequence i = this.i();
                    final long j = this.j();
                    if (g != null) {
                        k = g.k();
                    }
                    notification$MessagingStyle$Message = new Notification$MessagingStyle$Message(i, j, k);
                }
                else {
                    final CharSequence l = this.i();
                    final long m = this.j();
                    CharSequence f;
                    if (g == null) {
                        f = charSequence;
                    }
                    else {
                        f = g.f();
                    }
                    notification$MessagingStyle$Message = new Notification$MessagingStyle$Message(l, m, f);
                }
                if (this.b() != null) {
                    notification$MessagingStyle$Message.setData(this.b(), this.c());
                }
                return notification$MessagingStyle$Message;
            }
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface n {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface o {
    }
    
    public abstract static class p
    {
        @t0({ androidx.annotation.t0.a.I })
        protected g a;
        CharSequence b;
        CharSequence c;
        boolean d;
        
        public p() {
            this.d = false;
        }
        
        private int f() {
            final Resources resources = this.a.a.getResources();
            final int dimensionPixelSize = resources.getDimensionPixelSize(k.a.c.u);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(k.a.c.v);
            final float n = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round((1.0f - n) * dimensionPixelSize + n * dimensionPixelSize2);
        }
        
        private static float h(final float n, float n2, final float n3) {
            if (n >= n2) {
                n2 = n;
                if (n > n3) {
                    n2 = n3;
                }
            }
            return n2;
        }
        
        @k0
        static p i(@k0 final String s) {
            if (s != null) {
                int n = -1;
                switch (s) {
                    case "androidx.core.app.NotificationCompat$MessagingStyle": {
                        n = 4;
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$BigTextStyle": {
                        n = 3;
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$InboxStyle": {
                        n = 2;
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$BigPictureStyle": {
                        n = 1;
                        break;
                    }
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle": {
                        n = 0;
                        break;
                    }
                    default:
                        break;
                }
                switch (n) {
                    case 4: {
                        return (p)new m();
                    }
                    case 3: {
                        return (p)new e();
                    }
                    case 2: {
                        return (p)new l();
                    }
                    case 1: {
                        return (p)new r.d();
                    }
                    case 0: {
                        return (p)new i();
                    }
                }
            }
            return null;
        }
        
        @k0
        private static p j(@k0 final String s) {
            if (s == null) {
                return null;
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 16) {
                if (s.equals(Notification$BigPictureStyle.class.getName())) {
                    return (p)new r.d();
                }
                if (s.equals(Notification$BigTextStyle.class.getName())) {
                    return (p)new e();
                }
                if (s.equals(Notification$InboxStyle.class.getName())) {
                    return (p)new l();
                }
                if (sdk_INT >= 24) {
                    if (s.equals(Notification$MessagingStyle.class.getName())) {
                        return (p)new m();
                    }
                    if (s.equals(Notification$DecoratedCustomViewStyle.class.getName())) {
                        return (p)new i();
                    }
                }
            }
            return null;
        }
        
        @k0
        static p k(@j0 final Bundle bundle) {
            final p i = i(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            if (i != null) {
                return i;
            }
            if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
                return (p)new m();
            }
            if (bundle.containsKey("android.picture")) {
                return (p)new r.d();
            }
            if (bundle.containsKey("android.bigText")) {
                return (p)new e();
            }
            if (bundle.containsKey("android.textLines")) {
                return (p)new l();
            }
            return j(bundle.getString("android.template"));
        }
        
        @k0
        static p l(@j0 final Bundle bundle) {
            final p k = k(bundle);
            if (k == null) {
                return null;
            }
            try {
                k.y(bundle);
                return k;
            }
            catch (ClassCastException ex) {
                return null;
            }
        }
        
        private Bitmap n(final int n, final int n2, final int n3) {
            return this.p(IconCompat.x(this.a.a, n), n2, n3);
        }
        
        private Bitmap p(@j0 final IconCompat iconCompat, final int n, final int n2) {
            final Drawable k = iconCompat.K(this.a.a);
            int intrinsicWidth;
            if (n2 == 0) {
                intrinsicWidth = k.getIntrinsicWidth();
            }
            else {
                intrinsicWidth = n2;
            }
            int intrinsicHeight = n2;
            if (n2 == 0) {
                intrinsicHeight = k.getIntrinsicHeight();
            }
            final Bitmap bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap$Config.ARGB_8888);
            k.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (n != 0) {
                k.mutate().setColorFilter((ColorFilter)new PorterDuffColorFilter(n, PorterDuff$Mode.SRC_IN));
            }
            k.draw(new Canvas(bitmap));
            return bitmap;
        }
        
        private Bitmap q(int n, int n2, final int n3, final int n4) {
            final int h = k.a.d.h;
            int n5 = n4;
            if (n4 == 0) {
                n5 = 0;
            }
            final Bitmap n6 = this.n(h, n5, n2);
            final Canvas canvas = new Canvas(n6);
            final Drawable mutate = this.a.a.getResources().getDrawable(n).mutate();
            mutate.setFilterBitmap(true);
            n = (n2 - n3) / 2;
            n2 = n3 + n;
            mutate.setBounds(n, n, n2, n2);
            mutate.setColorFilter((ColorFilter)new PorterDuffColorFilter(-1, PorterDuff$Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n6;
        }
        
        @k0
        @t0({ androidx.annotation.t0.a.I })
        public static p s(@j0 final Notification notification) {
            final Bundle n = androidx.core.app.r.n(notification);
            if (n == null) {
                return null;
            }
            return l(n);
        }
        
        private void u(final RemoteViews remoteViews) {
            remoteViews.setViewVisibility(k.a.e.t0, 8);
            remoteViews.setViewVisibility(k.a.e.r0, 8);
            remoteViews.setViewVisibility(k.a.e.q0, 8);
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public void a(@j0 final Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            final CharSequence b = this.b;
            if (b != null) {
                bundle.putCharSequence("android.title.big", b);
            }
            final String t = this.t();
            if (t != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", t);
            }
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public void b(final androidx.core.app.o o) {
        }
        
        @j0
        @t0({ androidx.annotation.t0.a.I })
        public RemoteViews c(final boolean b, int n, final boolean b2) {
            final Resources resources = this.a.a.getResources();
            final RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), n);
            n = this.a.x();
            final int n2 = 1;
            final int n3 = 0;
            if (n < -1) {
                n = 1;
            }
            else {
                n = 0;
            }
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 16 && sdk_INT < 21) {
                int n4;
                if (n != 0) {
                    remoteViews.setInt(k.a.e.Y, "setBackgroundResource", k.a.d.c);
                    n = k.a.e.R;
                    n4 = k.a.d.j;
                }
                else {
                    remoteViews.setInt(k.a.e.Y, "setBackgroundResource", k.a.d.b);
                    n = k.a.e.R;
                    n4 = k.a.d.i;
                }
                remoteViews.setInt(n, "setBackgroundResource", n4);
            }
            final g a = this.a;
            if (a.j != null) {
                n = k.a.e.R;
                if (sdk_INT >= 16) {
                    remoteViews.setViewVisibility(n, 0);
                    remoteViews.setImageViewBitmap(n, this.a.j);
                }
                else {
                    remoteViews.setViewVisibility(n, 8);
                }
                if (b && this.a.T.icon != 0) {
                    n = resources.getDimensionPixelSize(k.a.c.p);
                    final int dimensionPixelSize = resources.getDimensionPixelSize(k.a.c.r);
                    if (sdk_INT >= 21) {
                        final g a2 = this.a;
                        remoteViews.setImageViewBitmap(k.a.e.b0, this.q(a2.T.icon, n, n - dimensionPixelSize * 2, a2.r()));
                    }
                    else {
                        remoteViews.setImageViewBitmap(k.a.e.b0, this.m(this.a.T.icon, -1));
                    }
                    remoteViews.setViewVisibility(k.a.e.b0, 0);
                }
            }
            else if (b && a.T.icon != 0) {
                n = k.a.e.R;
                remoteViews.setViewVisibility(n, 0);
                Bitmap bitmap;
                if (sdk_INT >= 21) {
                    final int dimensionPixelSize2 = resources.getDimensionPixelSize(k.a.c.m);
                    final int dimensionPixelSize3 = resources.getDimensionPixelSize(k.a.c.j);
                    final int dimensionPixelSize4 = resources.getDimensionPixelSize(k.a.c.s);
                    final g a3 = this.a;
                    bitmap = this.q(a3.T.icon, dimensionPixelSize2 - dimensionPixelSize3, dimensionPixelSize4, a3.r());
                }
                else {
                    bitmap = this.m(this.a.T.icon, -1);
                }
                remoteViews.setImageViewBitmap(n, bitmap);
            }
            final CharSequence e = this.a.e;
            if (e != null) {
                remoteViews.setTextViewText(k.a.e.t0, e);
            }
            final CharSequence f = this.a.f;
            if (f != null) {
                remoteViews.setTextViewText(k.a.e.q0, f);
                n = 1;
            }
            else {
                n = 0;
            }
            int n5;
            if (sdk_INT < 21 && this.a.j != null) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            final g a4 = this.a;
            final CharSequence k = a4.k;
            int n7 = 0;
            Label_0669: {
                if (k != null) {
                    n = k.a.e.T;
                    remoteViews.setTextViewText(n, k);
                }
                else {
                    if (a4.l <= 0) {
                        remoteViews.setViewVisibility(k.a.e.T, 8);
                        final int n6 = n;
                        n = n5;
                        n7 = n6;
                        break Label_0669;
                    }
                    n = resources.getInteger(k.a.f.a);
                    if (this.a.l > n) {
                        remoteViews.setTextViewText(k.a.e.T, (CharSequence)resources.getString(k.a.h.a));
                    }
                    else {
                        remoteViews.setTextViewText(k.a.e.T, (CharSequence)NumberFormat.getIntegerInstance().format(this.a.l));
                    }
                    n = k.a.e.T;
                }
                remoteViews.setViewVisibility(n, 0);
                n7 = 1;
                n = 1;
            }
            final CharSequence r = this.a.r;
            boolean b3 = false;
            Label_0755: {
                if (r != null && sdk_INT >= 16) {
                    remoteViews.setTextViewText(k.a.e.q0, r);
                    final CharSequence f2 = this.a.f;
                    if (f2 != null) {
                        final int r2 = k.a.e.r0;
                        remoteViews.setTextViewText(r2, f2);
                        remoteViews.setViewVisibility(r2, 0);
                        b3 = true;
                        break Label_0755;
                    }
                    remoteViews.setViewVisibility(k.a.e.r0, 8);
                }
                b3 = false;
            }
            if (b3 && sdk_INT >= 16) {
                if (b2) {
                    remoteViews.setTextViewTextSize(k.a.e.q0, 0, (float)resources.getDimensionPixelSize(k.a.c.t));
                }
                remoteViews.setViewPadding(k.a.e.V, 0, 0, 0, 0);
            }
            if (this.a.y() != 0L) {
                if (this.a.o && sdk_INT >= 16) {
                    final int o = k.a.e.O;
                    remoteViews.setViewVisibility(o, 0);
                    remoteViews.setLong(o, "setBase", this.a.y() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                    remoteViews.setBoolean(o, "setStarted", true);
                    final boolean p3 = this.a.p;
                    n = n2;
                    if (p3) {
                        n = n2;
                        if (sdk_INT >= 24) {
                            remoteViews.setChronometerCountDown(o, p3);
                            n = n2;
                        }
                    }
                }
                else {
                    n = k.a.e.s0;
                    remoteViews.setViewVisibility(n, 0);
                    remoteViews.setLong(n, "setTime", this.a.y());
                    n = n2;
                }
            }
            final int c0 = k.a.e.c0;
            if (n != 0) {
                n = 0;
            }
            else {
                n = 8;
            }
            remoteViews.setViewVisibility(c0, n);
            final int w = k.a.e.W;
            if (n7 != 0) {
                n = n3;
            }
            else {
                n = 8;
            }
            remoteViews.setViewVisibility(w, n);
            return remoteViews;
        }
        
        @k0
        public Notification d() {
            final g a = this.a;
            Notification h;
            if (a != null) {
                h = a.h();
            }
            else {
                h = null;
            }
            return h;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public void e(final RemoteViews remoteViews, final RemoteViews remoteViews2) {
            this.u(remoteViews);
            final int z = k.a.e.Z;
            remoteViews.removeAllViews(z);
            remoteViews.addView(z, remoteViews2.clone());
            remoteViews.setViewVisibility(z, 0);
            if (Build$VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(k.a.e.a0, 0, this.f(), 0, 0);
            }
        }
        
        @t0({ androidx.annotation.t0.a.I })
        protected void g(@j0 final Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public Bitmap m(final int n, final int n2) {
            return this.n(n, n2, 0);
        }
        
        Bitmap o(@j0 final IconCompat iconCompat, final int n) {
            return this.p(iconCompat, n, 0);
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public boolean r() {
            return false;
        }
        
        @k0
        @t0({ androidx.annotation.t0.a.I })
        protected String t() {
            return null;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public RemoteViews v(final androidx.core.app.o o) {
            return null;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public RemoteViews w(final androidx.core.app.o o) {
            return null;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        public RemoteViews x(final androidx.core.app.o o) {
            return null;
        }
        
        @t0({ androidx.annotation.t0.a.I })
        protected void y(@j0 final Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.c = bundle.getCharSequence("android.summaryText");
                this.d = true;
            }
            this.b = bundle.getCharSequence("android.title.big");
        }
        
        public void z(@k0 final g a) {
            if (this.a != a && (this.a = a) != null) {
                a.x0(this);
            }
        }
    }
    
    public static final class q implements j
    {
        private static final String A = "displayIntent";
        private static final String B = "pages";
        private static final String C = "background";
        private static final String D = "contentIcon";
        private static final String E = "contentIconGravity";
        private static final String F = "contentActionIndex";
        private static final String G = "customSizePreset";
        private static final String H = "customContentHeight";
        private static final String I = "gravity";
        private static final String J = "hintScreenTimeout";
        private static final String K = "dismissalId";
        private static final String L = "bridgeTag";
        private static final int M = 1;
        private static final int N = 2;
        private static final int O = 4;
        private static final int P = 8;
        private static final int Q = 16;
        private static final int R = 32;
        private static final int S = 64;
        private static final int T = 1;
        private static final int U = 8388613;
        private static final int V = 80;
        public static final int o = -1;
        @Deprecated
        public static final int p = 0;
        @Deprecated
        public static final int q = 1;
        @Deprecated
        public static final int r = 2;
        @Deprecated
        public static final int s = 3;
        @Deprecated
        public static final int t = 4;
        @Deprecated
        public static final int u = 5;
        @Deprecated
        public static final int v = 0;
        @Deprecated
        public static final int w = -1;
        private static final String x = "android.wearable.EXTENSIONS";
        private static final String y = "actions";
        private static final String z = "flags";
        private ArrayList<r.b> a;
        private int b;
        private PendingIntent c;
        private ArrayList<Notification> d;
        private Bitmap e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private String m;
        private String n;
        
        public q() {
            this.a = new ArrayList<r.b>();
            this.b = 1;
            this.d = new ArrayList<Notification>();
            this.g = 8388613;
            this.h = -1;
            this.i = 0;
            this.k = 80;
        }
        
        public q(@j0 final Notification notification) {
            this.a = new ArrayList<r.b>();
            this.b = 1;
            this.d = new ArrayList<Notification>();
            this.g = 8388613;
            this.h = -1;
            this.i = 0;
            this.k = 80;
            final Bundle n = androidx.core.app.r.n(notification);
            Bundle bundle;
            if (n != null) {
                bundle = n.getBundle("android.wearable.EXTENSIONS");
            }
            else {
                bundle = null;
            }
            if (bundle != null) {
                final ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (Build$VERSION.SDK_INT >= 16 && parcelableArrayList != null) {
                    final int size = parcelableArrayList.size();
                    final r.b[] elements = new r.b[size];
                    for (int i = 0; i < size; ++i) {
                        final int sdk_INT = Build$VERSION.SDK_INT;
                        if (sdk_INT >= 20) {
                            elements[i] = androidx.core.app.r.b(parcelableArrayList.get(i));
                        }
                        else if (sdk_INT >= 16) {
                            elements[i] = androidx.core.app.u.g((Bundle)parcelableArrayList.get(i));
                        }
                    }
                    Collections.addAll(this.a, elements);
                }
                this.b = bundle.getInt("flags", 1);
                this.c = (PendingIntent)bundle.getParcelable("displayIntent");
                final Notification[] u = androidx.core.app.r.u(bundle, "pages");
                if (u != null) {
                    Collections.addAll(this.d, u);
                }
                this.e = (Bitmap)bundle.getParcelable("background");
                this.f = bundle.getInt("contentIcon");
                this.g = bundle.getInt("contentIconGravity", 8388613);
                this.h = bundle.getInt("contentActionIndex", -1);
                this.i = bundle.getInt("customSizePreset", 0);
                this.j = bundle.getInt("customContentHeight");
                this.k = bundle.getInt("gravity", 80);
                this.l = bundle.getInt("hintScreenTimeout");
                this.m = bundle.getString("dismissalId");
                this.n = bundle.getString("bridgeTag");
            }
        }
        
        private void N(int b, final boolean b2) {
            if (b2) {
                b |= this.b;
            }
            else {
                b = (~b & this.b);
            }
            this.b = b;
        }
        
        @p0(20)
        private static Notification$Action i(final r.b b) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final int n = 0;
            Notification$Action$Builder notification$Action$Builder;
            if (sdk_INT >= 23) {
                final IconCompat f = b.f();
                Icon q;
                if (f == null) {
                    q = null;
                }
                else {
                    q = f.Q();
                }
                notification$Action$Builder = new Notification$Action$Builder(q, b.j(), b.a());
            }
            else {
                final IconCompat f2 = b.f();
                int a;
                if (f2 != null && f2.F() == 2) {
                    a = f2.A();
                }
                else {
                    a = 0;
                }
                notification$Action$Builder = new Notification$Action$Builder(a, b.j(), b.a());
            }
            Bundle bundle;
            if (b.d() != null) {
                bundle = new Bundle(b.d());
            }
            else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", b.b());
            if (sdk_INT >= 24) {
                notification$Action$Builder.setAllowGeneratedReplies(b.b());
            }
            notification$Action$Builder.addExtras(bundle);
            final y[] g = b.g();
            if (g != null) {
                final RemoteInput[] d = androidx.core.app.y.d(g);
                for (int length = d.length, i = n; i < length; ++i) {
                    notification$Action$Builder.addRemoteInput(d[i]);
                }
            }
            return notification$Action$Builder.build();
        }
        
        @Deprecated
        public boolean A() {
            return (this.b & 0x4) != 0x0;
        }
        
        @Deprecated
        @j0
        public List<Notification> B() {
            return this.d;
        }
        
        public boolean C() {
            return (this.b & 0x8) != 0x0;
        }
        
        @Deprecated
        @j0
        public q D(@k0 final Bitmap e) {
            this.e = e;
            return this;
        }
        
        @j0
        public q E(@k0 final String n) {
            this.n = n;
            return this;
        }
        
        @j0
        public q F(final int h) {
            this.h = h;
            return this;
        }
        
        @Deprecated
        @j0
        public q G(final int f) {
            this.f = f;
            return this;
        }
        
        @Deprecated
        @j0
        public q H(final int g) {
            this.g = g;
            return this;
        }
        
        @j0
        public q I(final boolean b) {
            this.N(1, b);
            return this;
        }
        
        @Deprecated
        @j0
        public q J(final int j) {
            this.j = j;
            return this;
        }
        
        @Deprecated
        @j0
        public q K(final int i) {
            this.i = i;
            return this;
        }
        
        @j0
        public q L(@k0 final String m) {
            this.m = m;
            return this;
        }
        
        @Deprecated
        @j0
        public q M(@k0 final PendingIntent c) {
            this.c = c;
            return this;
        }
        
        @Deprecated
        @j0
        public q O(final int k) {
            this.k = k;
            return this;
        }
        
        @Deprecated
        @j0
        public q P(final boolean b) {
            this.N(32, b);
            return this;
        }
        
        @Deprecated
        @j0
        public q Q(final boolean b) {
            this.N(16, b);
            return this;
        }
        
        @j0
        public q R(final boolean b) {
            this.N(64, b);
            return this;
        }
        
        @Deprecated
        @j0
        public q S(final boolean b) {
            this.N(2, b);
            return this;
        }
        
        @Deprecated
        @j0
        public q T(final int l) {
            this.l = l;
            return this;
        }
        
        @Deprecated
        @j0
        public q U(final boolean b) {
            this.N(4, b);
            return this;
        }
        
        @j0
        public q V(final boolean b) {
            this.N(8, b);
            return this;
        }
        
        @j0
        @Override
        public g a(@j0 final g g) {
            final Bundle bundle = new Bundle();
            if (!this.a.isEmpty()) {
                ArrayList<Notification$Action> list2;
                if (Build$VERSION.SDK_INT >= 16) {
                    final ArrayList<Notification$Action> list = new ArrayList<Notification$Action>(this.a.size());
                    final Iterator<r.b> iterator = this.a.iterator();
                    while (true) {
                        list2 = list;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final r.b b = iterator.next();
                        final int sdk_INT = Build$VERSION.SDK_INT;
                        Object e;
                        if (sdk_INT >= 20) {
                            e = i(b);
                        }
                        else {
                            if (sdk_INT < 16) {
                                continue;
                            }
                            e = androidx.core.app.u.j(b);
                        }
                        list.add((Notification$Action)e);
                    }
                }
                else {
                    list2 = null;
                }
                bundle.putParcelableArrayList("actions", (ArrayList)list2);
            }
            final int b2 = this.b;
            if (b2 != 1) {
                bundle.putInt("flags", b2);
            }
            final PendingIntent c = this.c;
            if (c != null) {
                bundle.putParcelable("displayIntent", (Parcelable)c);
            }
            if (!this.d.isEmpty()) {
                final ArrayList<Notification> d = this.d;
                bundle.putParcelableArray("pages", (Parcelable[])d.toArray((Parcelable[])new Notification[d.size()]));
            }
            final Bitmap e2 = this.e;
            if (e2 != null) {
                bundle.putParcelable("background", (Parcelable)e2);
            }
            final int f = this.f;
            if (f != 0) {
                bundle.putInt("contentIcon", f);
            }
            final int g2 = this.g;
            if (g2 != 8388613) {
                bundle.putInt("contentIconGravity", g2);
            }
            final int h = this.h;
            if (h != -1) {
                bundle.putInt("contentActionIndex", h);
            }
            final int i = this.i;
            if (i != 0) {
                bundle.putInt("customSizePreset", i);
            }
            final int j = this.j;
            if (j != 0) {
                bundle.putInt("customContentHeight", j);
            }
            final int k = this.k;
            if (k != 80) {
                bundle.putInt("gravity", k);
            }
            final int l = this.l;
            if (l != 0) {
                bundle.putInt("hintScreenTimeout", l);
            }
            final String m = this.m;
            if (m != null) {
                bundle.putString("dismissalId", m);
            }
            final String n = this.n;
            if (n != null) {
                bundle.putString("bridgeTag", n);
            }
            g.t().putBundle("android.wearable.EXTENSIONS", bundle);
            return g;
        }
        
        @j0
        public q b(@j0 final r.b e) {
            this.a.add(e);
            return this;
        }
        
        @j0
        public q c(@j0 final List<r.b> c) {
            this.a.addAll(c);
            return this;
        }
        
        @Deprecated
        @j0
        public q d(@j0 final Notification e) {
            this.d.add(e);
            return this;
        }
        
        @Deprecated
        @j0
        public q e(@j0 final List<Notification> c) {
            this.d.addAll(c);
            return this;
        }
        
        @j0
        public q f() {
            this.a.clear();
            return this;
        }
        
        @Deprecated
        @j0
        public q g() {
            this.d.clear();
            return this;
        }
        
        @j0
        public q h() {
            final q q = new q();
            q.a = new ArrayList<r.b>(this.a);
            q.b = this.b;
            q.c = this.c;
            q.d = new ArrayList<Notification>(this.d);
            q.e = this.e;
            q.f = this.f;
            q.g = this.g;
            q.h = this.h;
            q.i = this.i;
            q.j = this.j;
            q.k = this.k;
            q.l = this.l;
            q.m = this.m;
            q.n = this.n;
            return q;
        }
        
        @j0
        public List<r.b> j() {
            return this.a;
        }
        
        @Deprecated
        @k0
        public Bitmap k() {
            return this.e;
        }
        
        @k0
        public String l() {
            return this.n;
        }
        
        public int m() {
            return this.h;
        }
        
        @Deprecated
        public int n() {
            return this.f;
        }
        
        @Deprecated
        public int o() {
            return this.g;
        }
        
        public boolean p() {
            final int b = this.b;
            boolean b2 = true;
            if ((b & 0x1) == 0x0) {
                b2 = false;
            }
            return b2;
        }
        
        @Deprecated
        public int q() {
            return this.j;
        }
        
        @Deprecated
        public int r() {
            return this.i;
        }
        
        @k0
        public String s() {
            return this.m;
        }
        
        @Deprecated
        @k0
        public PendingIntent t() {
            return this.c;
        }
        
        @Deprecated
        public int u() {
            return this.k;
        }
        
        @Deprecated
        public boolean v() {
            return (this.b & 0x20) != 0x0;
        }
        
        @Deprecated
        public boolean w() {
            return (this.b & 0x10) != 0x0;
        }
        
        public boolean x() {
            return (this.b & 0x40) != 0x0;
        }
        
        @Deprecated
        public boolean y() {
            return (this.b & 0x2) != 0x0;
        }
        
        @Deprecated
        public int z() {
            return this.l;
        }
    }
}
