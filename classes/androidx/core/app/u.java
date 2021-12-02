// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.app.Notification$Builder;
import androidx.core.graphics.drawable.IconCompat;
import android.os.Parcelable;
import java.util.Arrays;
import android.app.PendingIntent;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.AnnotatedElement;
import android.util.Log;
import android.app.Notification;
import android.util.SparseArray;
import android.os.Bundle;
import java.util.List;
import java.lang.reflect.Field;
import androidx.annotation.p0;

@p0(16)
class u
{
    public static final String a = "NotificationCompat";
    static final String b = "android.support.dataRemoteInputs";
    static final String c = "android.support.allowGeneratedReplies";
    private static final String d = "icon";
    private static final String e = "title";
    private static final String f = "actionIntent";
    private static final String g = "extras";
    private static final String h = "remoteInputs";
    private static final String i = "dataOnlyRemoteInputs";
    private static final String j = "resultKey";
    private static final String k = "label";
    private static final String l = "choices";
    private static final String m = "allowFreeFormInput";
    private static final String n = "allowedDataTypes";
    private static final String o = "semanticAction";
    private static final String p = "showsUserInterface";
    private static final Object q;
    private static Field r;
    private static boolean s;
    private static final Object t;
    private static Field u;
    private static Field v;
    private static Field w;
    private static Field x;
    private static boolean y;
    
    static {
        q = new Object();
        t = new Object();
    }
    
    private u() {
    }
    
    public static SparseArray<Bundle> a(final List<Bundle> list) {
        final int size = list.size();
        SparseArray sparseArray = null;
        SparseArray sparseArray2;
        for (int i = 0; i < size; ++i, sparseArray = sparseArray2) {
            final Bundle bundle = list.get(i);
            sparseArray2 = sparseArray;
            if (bundle != null) {
                if ((sparseArray2 = sparseArray) == null) {
                    sparseArray2 = new SparseArray();
                }
                sparseArray2.put(i, (Object)bundle);
            }
        }
        return (SparseArray<Bundle>)sparseArray;
    }
    
    private static boolean b() {
        if (androidx.core.app.u.y) {
            return false;
        }
        AnnotatedElement u = null;
        try {
            if (androidx.core.app.u.u == null) {
                u = Class.forName("android.app.Notification$Action");
                androidx.core.app.u.v = ((Class)u).getDeclaredField("icon");
                androidx.core.app.u.w = ((Class)u).getDeclaredField("title");
                androidx.core.app.u.x = ((Class)u).getDeclaredField("actionIntent");
                u = Notification.class.getDeclaredField("actions");
                (androidx.core.app.u.u = (Field)u).setAccessible(true);
                return androidx.core.app.u.y ^ true;
            }
            return androidx.core.app.u.y ^ true;
        }
        catch (NoSuchFieldException u) {}
        catch (ClassNotFoundException ex) {}
        Log.e("NotificationCompat", "Unable to access notification actions", (Throwable)u);
        androidx.core.app.u.y = true;
        return androidx.core.app.u.y ^ true;
    }
    
    private static y c(final Bundle bundle) {
        final ArrayList stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        final HashSet<String> set = new HashSet<String>();
        if (stringArrayList != null) {
            final Iterator<String> iterator = stringArrayList.iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next());
            }
        }
        return new y(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), set);
    }
    
    private static y[] d(final Bundle[] array) {
        if (array == null) {
            return null;
        }
        final y[] array2 = new y[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = c(array[i]);
        }
        return array2;
    }
    
    public static r.b e(final Notification notification, final int n) {
        final Object t = androidx.core.app.u.t;
        // monitorenter(t)
        try {
            Label_0107: {
                try {
                    final Object[] h = h(notification);
                    if (h != null) {
                        final Object obj = h[n];
                        final Bundle k = k(notification);
                        Bundle bundle = null;
                        Label_0053: {
                            if (k != null) {
                                final SparseArray sparseParcelableArray = k.getSparseParcelableArray("android.support.actionExtras");
                                if (sparseParcelableArray != null) {
                                    bundle = (Bundle)sparseParcelableArray.get(n);
                                    break Label_0053;
                                }
                            }
                            bundle = null;
                        }
                        // monitorexit(t)
                        return l(androidx.core.app.u.v.getInt(obj), (CharSequence)androidx.core.app.u.w.get(obj), (PendingIntent)androidx.core.app.u.x.get(obj), bundle);
                    }
                    break Label_0107;
                }
                finally {
                    // monitorexit(t)
                    // monitorexit(t)
                    return null;
                }
            }
        }
        catch (IllegalAccessException ex) {}
    }
    
    public static int f(final Notification notification) {
        synchronized (androidx.core.app.u.t) {
            final Object[] h = h(notification);
            int length;
            if (h != null) {
                length = h.length;
            }
            else {
                length = 0;
            }
            return length;
        }
    }
    
    static r.b g(final Bundle bundle) {
        final Bundle bundle2 = bundle.getBundle("extras");
        return new r.b(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent)bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), d(i(bundle, "remoteInputs")), d(i(bundle, "dataOnlyRemoteInputs")), bundle2 != null && bundle2.getBoolean("android.support.allowGeneratedReplies", false), bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false);
    }
    
    private static Object[] h(final Notification obj) {
        synchronized (androidx.core.app.u.t) {
            if (!b()) {
                return null;
            }
            try {
                return (Object[])androidx.core.app.u.u.get(obj);
            }
            catch (IllegalAccessException ex) {
                Log.e("NotificationCompat", "Unable to access notification actions", (Throwable)ex);
                androidx.core.app.u.y = true;
                return null;
            }
        }
    }
    
    private static Bundle[] i(final Bundle bundle, final String s) {
        final Parcelable[] parcelableArray = bundle.getParcelableArray(s);
        if (!(parcelableArray instanceof Bundle[]) && parcelableArray != null) {
            final Bundle[] array = Arrays.copyOf(parcelableArray, parcelableArray.length, (Class<? extends Bundle[]>)Bundle[].class);
            bundle.putParcelableArray(s, (Parcelable[])array);
            return array;
        }
        return (Bundle[])parcelableArray;
    }
    
    static Bundle j(final r.b b) {
        final Bundle bundle = new Bundle();
        final IconCompat f = b.f();
        int a;
        if (f != null) {
            a = f.A();
        }
        else {
            a = 0;
        }
        bundle.putInt("icon", a);
        bundle.putCharSequence("title", b.j());
        bundle.putParcelable("actionIntent", (Parcelable)b.a());
        Bundle bundle2;
        if (b.d() != null) {
            bundle2 = new Bundle(b.d());
        }
        else {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("android.support.allowGeneratedReplies", b.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", (Parcelable[])n(b.g()));
        bundle.putBoolean("showsUserInterface", b.i());
        bundle.putInt("semanticAction", b.h());
        return bundle;
    }
    
    public static Bundle k(final Notification ex) {
        synchronized (androidx.core.app.u.q) {
            if (androidx.core.app.u.s) {
                return null;
            }
            try {
                if (androidx.core.app.u.r == null) {
                    final Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        androidx.core.app.u.s = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    androidx.core.app.u.r = declaredField;
                }
                Bundle value;
                if ((value = (Bundle)androidx.core.app.u.r.get(ex)) == null) {
                    value = new Bundle();
                    androidx.core.app.u.r.set(ex, value);
                }
                return value;
            }
            catch (NoSuchFieldException ex2) {}
            catch (IllegalAccessException ex) {
                goto Label_0106;
            }
            androidx.core.app.u.s = true;
            return null;
        }
    }
    
    public static r.b l(final int n, final CharSequence charSequence, final PendingIntent pendingIntent, final Bundle bundle) {
        y[] d;
        y[] d2;
        boolean boolean1;
        if (bundle != null) {
            d = d(i(bundle, "android.support.remoteInputs"));
            d2 = d(i(bundle, "android.support.dataRemoteInputs"));
            boolean1 = bundle.getBoolean("android.support.allowGeneratedReplies");
        }
        else {
            d = (d2 = null);
            boolean1 = false;
        }
        return new r.b(n, charSequence, pendingIntent, bundle, d, d2, boolean1, 0, true, false);
    }
    
    private static Bundle m(final y y) {
        final Bundle bundle = new Bundle();
        bundle.putString("resultKey", y.o());
        bundle.putCharSequence("label", y.n());
        bundle.putCharSequenceArray("choices", y.h());
        bundle.putBoolean("allowFreeFormInput", y.f());
        bundle.putBundle("extras", y.m());
        final Set<String> g = y.g();
        if (g != null && !g.isEmpty()) {
            final ArrayList list = new ArrayList<String>(g.size());
            final Iterator<String> iterator = g.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next());
            }
            bundle.putStringArrayList("allowedDataTypes", list);
        }
        return bundle;
    }
    
    private static Bundle[] n(final y[] array) {
        if (array == null) {
            return null;
        }
        final Bundle[] array2 = new Bundle[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = m(array[i]);
        }
        return array2;
    }
    
    public static Bundle o(final Notification$Builder notification$Builder, final r.b b) {
        final IconCompat f = b.f();
        int a;
        if (f != null) {
            a = f.A();
        }
        else {
            a = 0;
        }
        notification$Builder.addAction(a, b.j(), b.a());
        final Bundle bundle = new Bundle(b.d());
        if (b.g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", (Parcelable[])n(b.g()));
        }
        if (b.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", (Parcelable[])n(b.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", b.b());
        return bundle;
    }
}
