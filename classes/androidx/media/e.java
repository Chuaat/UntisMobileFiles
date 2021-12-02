// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import android.os.IInterface;
import android.os.Binder;
import java.util.Collection;
import android.os.Message;
import android.text.TextUtils;
import android.media.browse.MediaBrowser$MediaItem;
import android.service.media.MediaBrowserService$Result;
import android.annotation.SuppressLint;
import android.service.media.MediaBrowserService$BrowserRoot;
import android.media.session.MediaSession$Token;
import android.os.Parcel;
import androidx.core.app.i;
import android.os.Handler;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import androidx.annotation.p0;
import java.util.HashMap;
import android.os.IBinder$DeathRecipient;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.b;
import android.os.Build$VERSION;
import android.content.Intent;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.content.Context;
import java.util.Collections;
import android.support.v4.media.MediaBrowserCompat;
import java.util.Iterator;
import androidx.core.util.j;
import java.util.List;
import android.os.Bundle;
import android.util.Log;
import android.support.v4.media.session.MediaSessionCompat;
import android.os.IBinder;
import androidx.collection.a;
import java.util.ArrayList;
import androidx.annotation.t0;
import android.app.Service;

public abstract class e extends Service
{
    static final String N = "MBServiceCompat";
    static final boolean O;
    private static final float P = 1.0E-5f;
    public static final String Q = "android.media.browse.MediaBrowserService";
    @t0({ t0.a.G })
    public static final String R = "media_item";
    @t0({ t0.a.G })
    public static final String S = "search_results";
    static final int T = 1;
    static final int U = 2;
    static final int V = 4;
    @t0({ t0.a.G })
    public static final int W = -1;
    @t0({ t0.a.G })
    public static final int X = 0;
    @t0({ t0.a.G })
    public static final int Y = 1;
    private g G;
    final f H;
    final ArrayList<f> I;
    final a<IBinder, f> J;
    f K;
    final r L;
    MediaSessionCompat.Token M;
    
    static {
        O = Log.isLoggable("MBServiceCompat", 3);
    }
    
    public e() {
        this.H = new f("android.media.session.MediaController", -1, -1, null, null);
        this.I = new ArrayList<f>();
        this.J = new a<IBinder, f>();
        this.L = new r();
    }
    
    void a(final String s, final f k, final IBinder binder, final Bundle bundle) {
        List<androidx.core.util.j<IBinder, Bundle>> value;
        if ((value = k.g.get(s)) == null) {
            value = new ArrayList<androidx.core.util.j<IBinder, Bundle>>();
        }
        for (final androidx.core.util.j<IBinder, Bundle> j : value) {
            if (binder == j.a && c.a(bundle, j.b)) {
                return;
            }
        }
        value.add(new androidx.core.util.j<IBinder, Bundle>(binder, bundle));
        k.g.put(s, value);
        this.t(s, k, bundle, null);
        this.K = k;
        this.q(s, bundle);
        this.K = null;
    }
    
    List<MediaBrowserCompat.MediaItem> b(final List<MediaBrowserCompat.MediaItem> list, final Bundle bundle) {
        if (list == null) {
            return null;
        }
        final int int1 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        final int int2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (int1 == -1 && int2 == -1) {
            return list;
        }
        final int n = int2 * int1;
        final int n2 = n + int2;
        if (int1 >= 0 && int2 >= 1 && n < list.size()) {
            int size;
            if ((size = n2) > list.size()) {
                size = list.size();
            }
            return list.subList(n, size);
        }
        return Collections.emptyList();
    }
    
    @t0({ t0.a.I })
    public void c(final Context context) {
        this.attachBaseContext(context);
    }
    
    public final Bundle d() {
        return this.G.a();
    }
    
    public void dump(final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
    }
    
    @j0
    public final androidx.media.f.b e() {
        return this.G.c();
    }
    
    @k0
    public MediaSessionCompat.Token f() {
        return this.M;
    }
    
    boolean g(final String anObject, int i) {
        if (anObject == null) {
            return false;
        }
        final String[] packagesForUid = this.getPackageManager().getPackagesForUid(i);
        int length;
        for (length = packagesForUid.length, i = 0; i < length; ++i) {
            if (packagesForUid[i].equals(anObject)) {
                return true;
            }
        }
        return false;
    }
    
    @t0({ t0.a.I })
    public void h(@j0 final androidx.media.f.b b, @j0 final String s, @j0 final Bundle bundle) {
        if (b == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        }
        if (s == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.G.b(b, s, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }
    
    public void i(@j0 final String s) {
        if (s != null) {
            this.G.e(s, null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }
    
    public void j(@j0 final String s, @j0 final Bundle bundle) {
        if (s == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle != null) {
            this.G.e(s, bundle);
            return;
        }
        throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }
    
    public void k(@j0 final String s, final Bundle bundle, @j0 final m<Bundle> m) {
        m.h(null);
    }
    
    @k0
    public abstract e l(@j0 final String p0, final int p1, @k0 final Bundle p2);
    
    public abstract void m(@j0 final String p0, @j0 final m<List<MediaBrowserCompat.MediaItem>> p1);
    
    public void n(@j0 final String s, @j0 final m<List<MediaBrowserCompat.MediaItem>> m, @j0 final Bundle bundle) {
        m.k(1);
        this.m(s, m);
    }
    
    public void o(final String s, @j0 final m<MediaBrowserCompat.MediaItem> m) {
        m.k(2);
        m.j(null);
    }
    
    public IBinder onBind(final Intent intent) {
        return this.G.d(intent);
    }
    
    public void onCreate() {
        super.onCreate();
        final int sdk_INT = Build$VERSION.SDK_INT;
        g g;
        if (sdk_INT >= 28) {
            g = new k();
        }
        else if (sdk_INT >= 26) {
            g = new j();
        }
        else if (sdk_INT >= 23) {
            g = new i();
        }
        else if (sdk_INT >= 21) {
            g = new h();
        }
        else {
            g = new l();
        }
        (this.G = g).onCreate();
    }
    
    public void p(@j0 final String s, final Bundle bundle, @j0 final m<List<MediaBrowserCompat.MediaItem>> m) {
        m.k(4);
        m.j(null);
    }
    
    @t0({ t0.a.G })
    public void q(final String s, final Bundle bundle) {
    }
    
    @t0({ t0.a.G })
    public void r(final String s) {
    }
    
    void s(final String str, final Bundle obj, final f k, final b b) {
        final m<Bundle> m = new m<Bundle>(str) {
            @Override
            void e(@k0 final Bundle bundle) {
                b.b(-1, bundle);
            }
            
            @Override
            void f(@k0 final Bundle bundle) {
                b.b(1, bundle);
            }
            
            void l(@k0 final Bundle bundle) {
                b.b(0, bundle);
            }
        };
        this.K = k;
        this.k(str, obj, (m<Bundle>)m);
        this.K = null;
        if (((m)m).d()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
        sb.append(str);
        sb.append(" extras=");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }
    
    void t(final String str, final f k, final Bundle bundle, final Bundle bundle2) {
        final m<List<MediaBrowserCompat.MediaItem>> m = new m<List<MediaBrowserCompat.MediaItem>>(str) {
            void l(@k0 final List<MediaBrowserCompat.MediaItem> list) {
                if (e.this.J.get(k.f.asBinder()) != k) {
                    if (e.O) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                        sb.append(k.a);
                        sb.append(" id=");
                        sb.append(str);
                        Log.d("MBServiceCompat", sb.toString());
                    }
                    return;
                }
                List<MediaBrowserCompat.MediaItem> b = list;
                if ((((m)this).c() & 0x1) != 0x0) {
                    b = e.this.b(list, bundle);
                }
                try {
                    k.f.a(str, b, bundle, bundle2);
                }
                catch (RemoteException ex) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calling onLoadChildren() failed for id=");
                    sb2.append(str);
                    sb2.append(" package=");
                    sb2.append(k.a);
                    Log.w("MBServiceCompat", sb2.toString());
                }
            }
        };
        this.K = k;
        if (bundle == null) {
            this.m(str, (m<List<MediaBrowserCompat.MediaItem>>)m);
        }
        else {
            this.n(str, (m<List<MediaBrowserCompat.MediaItem>>)m, bundle);
        }
        this.K = null;
        if (((m)m).d()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("onLoadChildren must call detach() or sendResult() before returning for package=");
        sb.append(k.a);
        sb.append(" id=");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
    
    void u(final String str, final f k, final b b) {
        final m<MediaBrowserCompat.MediaItem> m = new m<MediaBrowserCompat.MediaItem>(str) {
            void l(@k0 final MediaBrowserCompat.MediaItem mediaItem) {
                if ((((m)this).c() & 0x2) != 0x0) {
                    b.b(-1, null);
                    return;
                }
                final Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", (Parcelable)mediaItem);
                b.b(0, bundle);
            }
        };
        this.K = k;
        this.o(str, (m<MediaBrowserCompat.MediaItem>)m);
        this.K = null;
        if (((m)m).d()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("onLoadItem must call detach() or sendResult() before returning for id=");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
    
    void v(final String str, final Bundle bundle, final f k, final b b) {
        final m<List<MediaBrowserCompat.MediaItem>> m = new m<List<MediaBrowserCompat.MediaItem>>(str) {
            void l(@k0 final List<MediaBrowserCompat.MediaItem> list) {
                if ((((m)this).c() & 0x4) == 0x0 && list != null) {
                    final Bundle bundle = new Bundle();
                    bundle.putParcelableArray("search_results", (Parcelable[])list.toArray((Parcelable[])new MediaBrowserCompat.MediaItem[0]));
                    b.b(0, bundle);
                    return;
                }
                b.b(-1, null);
            }
        };
        this.K = k;
        this.p(str, bundle, (m<List<MediaBrowserCompat.MediaItem>>)m);
        this.K = null;
        if (((m)m).d()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("onSearch must call detach() or sendResult() before returning for query=");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }
    
    boolean w(final String key, final f k, final IBinder binder) {
        final boolean b = true;
        final boolean b2 = false;
        boolean b3 = false;
        Label_0054: {
            if (binder != null) {
                break Label_0054;
            }
            try {
                return k.g.remove(key) != null && b;
                // iftrue(Label_0152:, list.size() != 0)
                // iftrue(Label_0125:, !iterator.hasNext())
                // iftrue(Label_0152:, list == null)
                while (true) {
                Label_0085:
                    while (true) {
                        Iterator<androidx.core.util.j<IBinder, Bundle>> iterator;
                        while (true) {
                            final List<androidx.core.util.j<IBinder, Bundle>> list;
                            iterator = list.iterator();
                            break Label_0085;
                            Label_0125: {
                                final boolean b4 = b3;
                            }
                            Block_7: {
                                break Block_7;
                                final boolean b4;
                                Label_0152:
                                return b4;
                            }
                            k.g.remove(key);
                            return b3;
                            break Label_0085;
                            list = k.g.get(key);
                            b4 = b2;
                            continue;
                        }
                        iterator.remove();
                        b3 = true;
                        continue Label_0085;
                    }
                    continue;
                }
            }
            // iftrue(Label_0085:, binder != (j<IBinder, Bundle>)iterator.next().a)
            finally {
                this.K = k;
                this.r(key);
                this.K = null;
            }
        }
    }
    
    public void x(final MediaSessionCompat.Token m) {
        if (m == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.M == null) {
            this.M = m;
            this.G.f(m);
            return;
        }
        throw new IllegalStateException("The session token has already been set");
    }
    
    public static final class e
    {
        public static final String c = "android.service.media.extra.RECENT";
        public static final String d = "android.service.media.extra.OFFLINE";
        public static final String e = "android.service.media.extra.SUGGESTED";
        @Deprecated
        public static final String f = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final String a;
        private final Bundle b;
        
        public e(@j0 final String a, @k0 final Bundle b) {
            if (a != null) {
                this.a = a;
                this.b = b;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
        
        public Bundle c() {
            return this.b;
        }
        
        public String d() {
            return this.a;
        }
    }
    
    private class f implements IBinder$DeathRecipient
    {
        public final String a;
        public final int b;
        public final int c;
        public final androidx.media.f.b d;
        public final Bundle e;
        public final p f;
        public final HashMap<String, List<androidx.core.util.j<IBinder, Bundle>>> g;
        public e h;
        final /* synthetic */ e i;
        
        f(final String a, final int b, final int c, final Bundle e, final p f) {
            this.g = new HashMap<String, List<androidx.core.util.j<IBinder, Bundle>>>();
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = new androidx.media.f.b(a, b, c);
            this.e = e;
            this.f = f;
        }
        
        public void binderDied() {
            androidx.media.e.this.L.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    final f g = androidx.media.e.f.this;
                    g.i.J.remove(g.f.asBinder());
                }
            });
        }
    }
    
    interface g
    {
        Bundle a();
        
        void b(final androidx.media.f.b p0, final String p1, final Bundle p2);
        
        androidx.media.f.b c();
        
        IBinder d(final Intent p0);
        
        void e(final String p0, final Bundle p1);
        
        void f(final MediaSessionCompat.Token p0);
        
        void onCreate();
    }
    
    @p0(21)
    class h implements g
    {
        final List<Bundle> a;
        MediaBrowserService b;
        Messenger c;
        
        h() {
            this.a = new ArrayList<Bundle>();
        }
        
        @Override
        public Bundle a() {
            final Messenger c = this.c;
            Bundle bundle = null;
            if (c == null) {
                return null;
            }
            final f k = androidx.media.e.this.K;
            if (k != null) {
                if (k.e != null) {
                    bundle = new Bundle(androidx.media.e.this.K.e);
                }
                return bundle;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        
        @Override
        public void b(final androidx.media.f.b b, final String s, final Bundle bundle) {
            this.g(b, s, bundle);
        }
        
        @Override
        public androidx.media.f.b c() {
            final f k = androidx.media.e.this.K;
            if (k != null) {
                return k.d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        
        @Override
        public IBinder d(final Intent intent) {
            return this.b.onBind(intent);
        }
        
        @Override
        public void e(final String s, final Bundle bundle) {
            this.j(s, bundle);
            this.h(s, bundle);
        }
        
        @Override
        public void f(final MediaSessionCompat.Token token) {
            androidx.media.e.this.L.a(new Runnable() {
                @Override
                public void run() {
                    h.this.m(token);
                }
            });
        }
        
        void g(final androidx.media.f.b b, final String s, final Bundle bundle) {
            androidx.media.e.this.L.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < androidx.media.e.this.J.size(); ++i) {
                        final f f = androidx.media.e.this.J.o(i);
                        if (f.d.equals(b)) {
                            h.this.i(f, s, bundle);
                        }
                    }
                }
            });
        }
        
        void h(final String s, final Bundle bundle) {
            androidx.media.e.this.L.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    final Iterator<IBinder> iterator = androidx.media.e.this.J.keySet().iterator();
                    while (iterator.hasNext()) {
                        h.this.i((f)androidx.media.e.this.J.get(iterator.next()), s, bundle);
                    }
                }
            });
        }
        
        void i(final f f, final String key, final Bundle bundle) {
            final List<androidx.core.util.j<IBinder, Bundle>> list = f.g.get(key);
            if (list != null) {
                for (final androidx.core.util.j<IBinder, Bundle> j : list) {
                    if (androidx.media.c.b(bundle, j.b)) {
                        androidx.media.e.this.t(key, f, j.b, bundle);
                    }
                }
            }
        }
        
        void j(final String s, final Bundle bundle) {
            this.b.notifyChildrenChanged(s);
        }
        
        public androidx.media.e.e k(final String s, final int n, final Bundle bundle) {
            int int1;
            Bundle bundle3;
            if (bundle != null && bundle.getInt("extra_client_version", 0) != 0) {
                bundle.remove("extra_client_version");
                this.c = new Messenger((Handler)androidx.media.e.this.L);
                final Bundle bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                androidx.core.app.i.b(bundle2, "extra_messenger", this.c.getBinder());
                final MediaSessionCompat.Token m = androidx.media.e.this.M;
                if (m != null) {
                    final android.support.v4.media.session.b d = m.d();
                    IBinder binder;
                    if (d == null) {
                        binder = null;
                    }
                    else {
                        binder = ((IInterface)d).asBinder();
                    }
                    androidx.core.app.i.b(bundle2, "extra_session_binder", binder);
                }
                else {
                    this.a.add(bundle2);
                }
                int1 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                bundle3 = bundle2;
            }
            else {
                bundle3 = null;
                int1 = -1;
            }
            final f f = new f(s, int1, n, bundle, null);
            final androidx.media.e d2 = androidx.media.e.this;
            d2.K = f;
            final androidx.media.e.e l = d2.l(s, n, bundle);
            final androidx.media.e d3 = androidx.media.e.this;
            d3.K = null;
            if (l == null) {
                return null;
            }
            if (this.c != null) {
                d3.I.add(f);
            }
            Bundle c;
            if (bundle3 == null) {
                c = l.c();
            }
            else {
                c = bundle3;
                if (l.c() != null) {
                    bundle3.putAll(l.c());
                    c = bundle3;
                }
            }
            return new androidx.media.e.e(l.d(), c);
        }
        
        public void l(final String s, final n<List<Parcel>> n) {
            final m<List<MediaBrowserCompat.MediaItem>> m = new m<List<MediaBrowserCompat.MediaItem>>(s) {
                @Override
                public void b() {
                    n.a();
                }
                
                void l(@k0 final List<MediaBrowserCompat.MediaItem> list) {
                    ArrayList<Parcel> list3;
                    if (list != null) {
                        final ArrayList<Parcel> list2 = new ArrayList<Parcel>();
                        final Iterator<MediaBrowserCompat.MediaItem> iterator = list.iterator();
                        while (true) {
                            list3 = list2;
                            if (!iterator.hasNext()) {
                                break;
                            }
                            final MediaBrowserCompat.MediaItem mediaItem = iterator.next();
                            final Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            list2.add(obtain);
                        }
                    }
                    else {
                        list3 = null;
                    }
                    n.c(list3);
                }
            };
            final androidx.media.e d = androidx.media.e.this;
            d.K = d.H;
            d.m(s, (m<List<MediaBrowserCompat.MediaItem>>)m);
            androidx.media.e.this.K = null;
        }
        
        void m(final MediaSessionCompat.Token token) {
            if (!this.a.isEmpty()) {
                final android.support.v4.media.session.b d = token.d();
                if (d != null) {
                    final Iterator<Bundle> iterator = this.a.iterator();
                    while (iterator.hasNext()) {
                        androidx.core.app.i.b(iterator.next(), "extra_session_binder", ((IInterface)d).asBinder());
                    }
                }
                this.a.clear();
            }
            this.b.setSessionToken((MediaSession$Token)token.f());
        }
        
        @Override
        public void onCreate() {
            (this.b = new e((Context)androidx.media.e.this)).onCreate();
        }
        
        @p0(21)
        class e extends MediaBrowserService
        {
            e(final Context context) {
                this.attachBaseContext(context);
            }
            
            @SuppressLint({ "SyntheticAccessor" })
            public MediaBrowserService$BrowserRoot onGetRoot(final String s, final int n, Bundle bundle) {
                MediaSessionCompat.b(bundle);
                final h g = h.this;
                final MediaBrowserService$BrowserRoot mediaBrowserService$BrowserRoot = null;
                if (bundle == null) {
                    bundle = null;
                }
                else {
                    bundle = new Bundle(bundle);
                }
                final androidx.media.e.e k = g.k(s, n, bundle);
                MediaBrowserService$BrowserRoot mediaBrowserService$BrowserRoot2;
                if (k == null) {
                    mediaBrowserService$BrowserRoot2 = mediaBrowserService$BrowserRoot;
                }
                else {
                    mediaBrowserService$BrowserRoot2 = new MediaBrowserService$BrowserRoot(k.a, k.b);
                }
                return mediaBrowserService$BrowserRoot2;
            }
            
            public void onLoadChildren(final String s, final MediaBrowserService$Result<List<MediaBrowser$MediaItem>> mediaBrowserService$Result) {
                h.this.l(s, (n<List<Parcel>>)new n(mediaBrowserService$Result));
            }
        }
    }
    
    @p0(23)
    class i extends h
    {
        public void n(final String s, final n<Parcel> n) {
            final m<MediaBrowserCompat.MediaItem> m = new m<MediaBrowserCompat.MediaItem>(s) {
                @Override
                public void b() {
                    n.a();
                }
                
                void l(@k0 final MediaBrowserCompat.MediaItem mediaItem) {
                    n n;
                    Parcel parcel;
                    if (mediaItem == null) {
                        n = n;
                        parcel = null;
                    }
                    else {
                        final Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        n = n;
                        parcel = obtain;
                    }
                    n.c(parcel);
                }
            };
            final e e = androidx.media.e.this;
            e.K = e.H;
            e.o(s, (m<MediaBrowserCompat.MediaItem>)m);
            androidx.media.e.this.K = null;
        }
        
        @Override
        public void onCreate() {
            (super.b = new b((Context)androidx.media.e.this)).onCreate();
        }
        
        class b extends h.e
        {
            b(final Context context) {
                (h)i.this.super(context);
            }
            
            public void onLoadItem(final String s, final MediaBrowserService$Result<MediaBrowser$MediaItem> mediaBrowserService$Result) {
                i.this.n(s, (n<Parcel>)new n(mediaBrowserService$Result));
            }
        }
    }
    
    @p0(26)
    class j extends i
    {
        final /* synthetic */ e f;
        
        @Override
        public Bundle a() {
            final e f = e.this;
            final f k = f.K;
            if (k == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (k == f.H) {
                return super.b.getBrowserRootHints();
            }
            Bundle bundle;
            if (k.e == null) {
                bundle = null;
            }
            else {
                bundle = new Bundle(e.this.K.e);
            }
            return bundle;
        }
        
        @Override
        void j(final String s, final Bundle bundle) {
            if (bundle != null) {
                super.b.notifyChildrenChanged(s, bundle);
            }
            else {
                super.j(s, bundle);
            }
        }
        
        public void o(final String s, final n<List<Parcel>> n, final Bundle bundle) {
            final m<List<MediaBrowserCompat.MediaItem>> m = new m<List<MediaBrowserCompat.MediaItem>>(s) {
                @Override
                public void b() {
                    n.a();
                }
                
                void l(@k0 final List<MediaBrowserCompat.MediaItem> list) {
                    n<Object> f;
                    Object o;
                    if (list == null) {
                        f = (n<Object>)n;
                        o = null;
                    }
                    else {
                        List<MediaBrowserCompat.MediaItem> b = list;
                        if ((((m)this).c() & 0x1) != 0x0) {
                            b = e.this.b(list, bundle);
                        }
                        final ArrayList<Parcel> list2 = new ArrayList<Parcel>();
                        for (final MediaBrowserCompat.MediaItem mediaItem : b) {
                            final Parcel obtain = Parcel.obtain();
                            mediaItem.writeToParcel(obtain, 0);
                            list2.add(obtain);
                        }
                        final n f2 = n;
                        o = list2;
                        f = (n<Object>)f2;
                    }
                    f.c(o);
                }
            };
            final e f = e.this;
            f.K = f.H;
            f.n(s, (m<List<MediaBrowserCompat.MediaItem>>)m, bundle);
            e.this.K = null;
        }
        
        @Override
        public void onCreate() {
            (super.b = new b((Context)e.this)).onCreate();
        }
        
        class b extends i.b
        {
            b(final Context context) {
                (i)j.this.super(context);
            }
            
            public void onLoadChildren(final String s, final MediaBrowserService$Result<List<MediaBrowser$MediaItem>> mediaBrowserService$Result, final Bundle bundle) {
                MediaSessionCompat.b(bundle);
                final j i = j.this;
                final e f = i.f;
                f.K = f.H;
                i.o(s, (n<List<Parcel>>)new n(mediaBrowserService$Result), bundle);
                e.this.K = null;
            }
        }
    }
    
    @p0(28)
    class k extends j
    {
        @Override
        public androidx.media.f.b c() {
            final e g = e.this;
            final f k = g.K;
            if (k == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            }
            if (k == g.H) {
                return new androidx.media.f.b(super.b.getCurrentBrowserInfo());
            }
            return k.d;
        }
    }
    
    class l implements g
    {
        private Messenger a;
        
        @Override
        public Bundle a() {
            final f k = e.this.K;
            if (k != null) {
                Bundle bundle;
                if (k.e == null) {
                    bundle = null;
                }
                else {
                    bundle = new Bundle(e.this.K.e);
                }
                return bundle;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        
        @Override
        public void b(@j0 final androidx.media.f.b b, @j0 final String s, final Bundle bundle) {
            e.this.L.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < e.this.J.size(); ++i) {
                        final f f = e.this.J.o(i);
                        if (f.d.equals(b)) {
                            l.this.g(f, s, bundle);
                            break;
                        }
                    }
                }
            });
        }
        
        @Override
        public androidx.media.f.b c() {
            final f k = e.this.K;
            if (k != null) {
                return k.d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        
        @Override
        public IBinder d(final Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.a.getBinder();
            }
            return null;
        }
        
        @Override
        public void e(@j0 final String s, final Bundle bundle) {
            e.this.L.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    final Iterator<IBinder> iterator = e.this.J.keySet().iterator();
                    while (iterator.hasNext()) {
                        l.this.g((f)e.this.J.get(iterator.next()), s, bundle);
                    }
                }
            });
        }
        
        @Override
        public void f(final MediaSessionCompat.Token token) {
            e.this.L.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    final Iterator<f> iterator = e.this.J.values().iterator();
                    while (iterator.hasNext()) {
                        final f f = iterator.next();
                        try {
                            f.f.c(f.h.d(), token, f.h.c());
                        }
                        catch (RemoteException ex) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Connection for ");
                            sb.append(f.a);
                            sb.append(" is no longer valid.");
                            Log.w("MBServiceCompat", sb.toString());
                            iterator.remove();
                        }
                    }
                }
            });
        }
        
        void g(final f f, final String key, final Bundle bundle) {
            final List<androidx.core.util.j<IBinder, Bundle>> list = f.g.get(key);
            if (list != null) {
                for (final androidx.core.util.j<IBinder, Bundle> j : list) {
                    if (c.b(bundle, j.b)) {
                        e.this.t(key, f, j.b, bundle);
                    }
                }
            }
        }
        
        @Override
        public void onCreate() {
            this.a = new Messenger((Handler)e.this.L);
        }
    }
    
    public static class m<T>
    {
        private final Object a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        
        m(final Object a) {
            this.a = a;
        }
        
        private void a(@k0 final Bundle bundle) {
            if (bundle == null) {
                return;
            }
            if (bundle.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS")) {
                final float float1 = bundle.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
                if (float1 < -1.0E-5f || float1 > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]");
                }
            }
        }
        
        public void b() {
            if (this.b) {
                final StringBuilder sb = new StringBuilder();
                sb.append("detach() called when detach() had already been called for: ");
                sb.append(this.a);
                throw new IllegalStateException(sb.toString());
            }
            if (this.c) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("detach() called when sendResult() had already been called for: ");
                sb2.append(this.a);
                throw new IllegalStateException(sb2.toString());
            }
            if (!this.d) {
                this.b = true;
                return;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("detach() called when sendError() had already been called for: ");
            sb3.append(this.a);
            throw new IllegalStateException(sb3.toString());
        }
        
        int c() {
            return this.e;
        }
        
        boolean d() {
            return this.b || this.c || this.d;
        }
        
        void e(@k0 final Bundle bundle) {
            final StringBuilder sb = new StringBuilder();
            sb.append("It is not supported to send an error for ");
            sb.append(this.a);
            throw new UnsupportedOperationException(sb.toString());
        }
        
        void f(@k0 final Bundle bundle) {
            final StringBuilder sb = new StringBuilder();
            sb.append("It is not supported to send an interim update for ");
            sb.append(this.a);
            throw new UnsupportedOperationException(sb.toString());
        }
        
        void g(@k0 final T t) {
        }
        
        public void h(@k0 final Bundle bundle) {
            if (!this.c && !this.d) {
                this.d = true;
                this.e(bundle);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("sendError() called when either sendResult() or sendError() had already been called for: ");
            sb.append(this.a);
            throw new IllegalStateException(sb.toString());
        }
        
        public void i(@k0 final Bundle bundle) {
            if (!this.c && !this.d) {
                this.a(bundle);
                this.f(bundle);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
            sb.append(this.a);
            throw new IllegalStateException(sb.toString());
        }
        
        public void j(@k0 final T t) {
            if (!this.c && !this.d) {
                this.c = true;
                this.g(t);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
            sb.append(this.a);
            throw new IllegalStateException(sb.toString());
        }
        
        void k(final int e) {
            this.e = e;
        }
    }
    
    @p0(21)
    static class n<T>
    {
        MediaBrowserService$Result a;
        
        n(final MediaBrowserService$Result a) {
            this.a = a;
        }
        
        public void a() {
            this.a.detach();
        }
        
        List<MediaBrowser$MediaItem> b(final List<Parcel> list) {
            if (list == null) {
                return null;
            }
            final ArrayList<MediaBrowser$MediaItem> list2 = new ArrayList<MediaBrowser$MediaItem>();
            for (final Parcel parcel : list) {
                parcel.setDataPosition(0);
                list2.add((MediaBrowser$MediaItem)MediaBrowser$MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return list2;
        }
        
        public void c(final T t) {
            if (t instanceof List) {
                this.a.sendResult((Object)this.b((List<Parcel>)t));
            }
            else if (t instanceof Parcel) {
                final Parcel parcel = (Parcel)t;
                parcel.setDataPosition(0);
                this.a.sendResult(MediaBrowser$MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            else {
                this.a.sendResult((Object)null);
            }
        }
    }
    
    private class o
    {
        o() {
        }
        
        public void a(final String s, final IBinder binder, final Bundle bundle, final p p4) {
            e.this.L.a(new Runnable() {
                @Override
                public void run() {
                    final f f = e.this.J.get(p4.asBinder());
                    if (f == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("addSubscription for callback that isn't registered id=");
                        sb.append(s);
                        Log.w("MBServiceCompat", sb.toString());
                        return;
                    }
                    e.this.a(s, f, binder, bundle);
                }
            });
        }
        
        public void b(final String str, final int n, final int i, final Bundle bundle, final p p5) {
            if (e.this.g(str, i)) {
                e.this.L.a(new Runnable() {
                    @Override
                    public void run() {
                        final IBinder binder = p5.asBinder();
                        e.this.J.remove(binder);
                        final f k = new f(str, n, i, bundle, p5);
                        final e a = e.this;
                        a.K = k;
                        final e l = a.l(str, i, bundle);
                        k.h = l;
                        final e a2 = e.this;
                        a2.K = null;
                        if (l == null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("No root for client ");
                            sb.append(str);
                            sb.append(" from service ");
                            sb.append(this.getClass().getName());
                            Log.i("MBServiceCompat", sb.toString());
                            try {
                                p5.b();
                            }
                            catch (RemoteException ex) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                                sb2.append(str);
                                Log.w("MBServiceCompat", sb2.toString());
                            }
                        }
                        else {
                            try {
                                a2.J.put(binder, k);
                                binder.linkToDeath((IBinder$DeathRecipient)k, 0);
                                if (e.this.M != null) {
                                    p5.c(k.h.d(), e.this.M, k.h.c());
                                }
                            }
                            catch (RemoteException ex2) {
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("Calling onConnect() failed. Dropping client. pkg=");
                                sb3.append(str);
                                Log.w("MBServiceCompat", sb3.toString());
                                e.this.J.remove(binder);
                            }
                        }
                    }
                });
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Package/uid mismatch: uid=");
            sb.append(i);
            sb.append(" package=");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public void c(final p p) {
            e.this.L.a(new Runnable() {
                @Override
                public void run() {
                    final f f = e.this.J.remove(p.asBinder());
                    if (f != null) {
                        f.f.asBinder().unlinkToDeath((IBinder$DeathRecipient)f, 0);
                    }
                }
            });
        }
        
        public void d(final String s, final b b, final p p3) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                if (b != null) {
                    e.this.L.a(new Runnable() {
                        @Override
                        public void run() {
                            final f f = e.this.J.get(p3.asBinder());
                            if (f == null) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("getMediaItem for callback that isn't registered id=");
                                sb.append(s);
                                Log.w("MBServiceCompat", sb.toString());
                                return;
                            }
                            e.this.u(s, f, b);
                        }
                    });
                }
            }
        }
        
        public void e(final p p5, final String s, final int n, final int n2, final Bundle bundle) {
            e.this.L.a(new Runnable() {
                @Override
                public void run() {
                    final IBinder binder = p5.asBinder();
                    e.this.J.remove(binder);
                    final Iterator<f> iterator = e.this.I.iterator();
                    while (true) {
                        f f;
                        IBinder$DeathRecipient binder$DeathRecipient;
                        do {
                            final boolean hasNext = iterator.hasNext();
                            final Object o = null;
                            binder$DeathRecipient = null;
                            if (!hasNext) {
                                Object o2;
                                if ((o2 = o) == null) {
                                    o2 = new f(s, n, n2, bundle, p5);
                                }
                                e.this.J.put(binder, (f)o2);
                                try {
                                    binder.linkToDeath((IBinder$DeathRecipient)o2, 0);
                                }
                                catch (RemoteException ex) {
                                    Log.w("MBServiceCompat", "IBinder is already dead.");
                                }
                                return;
                            }
                            f = (f)iterator.next();
                        } while (f.c != n2);
                        Label_0139: {
                            if (!TextUtils.isEmpty((CharSequence)s)) {
                                final Object o = binder$DeathRecipient;
                                if (n > 0) {
                                    break Label_0139;
                                }
                            }
                            final Object o = new f(f.a, f.b, f.c, bundle, p5);
                        }
                        iterator.remove();
                        continue;
                    }
                }
            });
        }
        
        public void f(final String s, final IBinder binder, final p p3) {
            e.this.L.a(new Runnable() {
                @Override
                public void run() {
                    final f f = e.this.J.get(p3.asBinder());
                    if (f == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("removeSubscription for callback that isn't registered id=");
                        sb.append(s);
                        Log.w("MBServiceCompat", sb.toString());
                        return;
                    }
                    if (!e.this.w(s, f, binder)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("removeSubscription called for ");
                        sb2.append(s);
                        sb2.append(" which is not subscribed");
                        Log.w("MBServiceCompat", sb2.toString());
                    }
                }
            });
        }
        
        public void g(final String s, final Bundle bundle, final b b, final p p4) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                if (b != null) {
                    e.this.L.a(new Runnable() {
                        @Override
                        public void run() {
                            final f f = e.this.J.get(p4.asBinder());
                            if (f == null) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("search for callback that isn't registered query=");
                                sb.append(s);
                                Log.w("MBServiceCompat", sb.toString());
                                return;
                            }
                            e.this.v(s, bundle, f, b);
                        }
                    });
                }
            }
        }
        
        public void h(final String s, final Bundle bundle, final b b, final p p4) {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                if (b != null) {
                    e.this.L.a(new Runnable() {
                        @Override
                        public void run() {
                            final f f = e.this.J.get(p4.asBinder());
                            if (f == null) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("sendCustomAction for callback that isn't registered action=");
                                sb.append(s);
                                sb.append(", extras=");
                                sb.append(bundle);
                                Log.w("MBServiceCompat", sb.toString());
                                return;
                            }
                            e.this.s(s, bundle, f, b);
                        }
                    });
                }
            }
        }
        
        public void i(final p p) {
            e.this.L.a(new Runnable() {
                @Override
                public void run() {
                    final IBinder binder = p.asBinder();
                    final f f = e.this.J.remove(binder);
                    if (f != null) {
                        binder.unlinkToDeath((IBinder$DeathRecipient)f, 0);
                    }
                }
            });
        }
    }
    
    private interface p
    {
        void a(final String p0, final List<MediaBrowserCompat.MediaItem> p1, final Bundle p2, final Bundle p3) throws RemoteException;
        
        IBinder asBinder();
        
        void b() throws RemoteException;
        
        void c(final String p0, final MediaSessionCompat.Token p1, final Bundle p2) throws RemoteException;
    }
    
    private static class q implements p
    {
        final Messenger a;
        
        q(final Messenger a) {
            this.a = a;
        }
        
        private void d(final int what, final Bundle data) throws RemoteException {
            final Message obtain = Message.obtain();
            obtain.what = what;
            obtain.arg1 = 2;
            obtain.setData(data);
            this.a.send(obtain);
        }
        
        @Override
        public void a(final String s, final List<MediaBrowserCompat.MediaItem> c, final Bundle bundle, final Bundle bundle2) throws RemoteException {
            final Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", s);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (c != null) {
                ArrayList list;
                if (c instanceof ArrayList) {
                    list = (ArrayList<? extends E>)c;
                }
                else {
                    list = new ArrayList((Collection<? extends E>)c);
                }
                bundle3.putParcelableArrayList("data_media_item_list", list);
            }
            this.d(3, bundle3);
        }
        
        @Override
        public IBinder asBinder() {
            return this.a.getBinder();
        }
        
        @Override
        public void b() throws RemoteException {
            this.d(2, null);
        }
        
        @Override
        public void c(final String s, final MediaSessionCompat.Token token, final Bundle bundle) throws RemoteException {
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putInt("extra_service_version", 2);
            final Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", s);
            bundle3.putParcelable("data_media_session_token", (Parcelable)token);
            bundle3.putBundle("data_root_hints", bundle2);
            this.d(1, bundle3);
        }
    }
    
    private final class r extends Handler
    {
        private final o a;
        
        r() {
            this.a = new o();
        }
        
        public void a(final Runnable runnable) {
            if (Thread.currentThread() == this.getLooper().getThread()) {
                runnable.run();
            }
            else {
                this.post(runnable);
            }
        }
        
        public void handleMessage(final Message obj) {
            final Bundle data = obj.getData();
            switch (obj.what) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unhandled message: ");
                    sb.append(obj);
                    sb.append("\n  Service version: ");
                    sb.append(2);
                    sb.append("\n  Client version: ");
                    sb.append(obj.arg1);
                    Log.w("MBServiceCompat", sb.toString());
                    break;
                }
                case 9: {
                    final Bundle bundle = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.b(bundle);
                    this.a.h(data.getString("data_custom_action"), bundle, (b)data.getParcelable("data_result_receiver"), new q(obj.replyTo));
                    break;
                }
                case 8: {
                    final Bundle bundle2 = data.getBundle("data_search_extras");
                    MediaSessionCompat.b(bundle2);
                    this.a.g(data.getString("data_search_query"), bundle2, (b)data.getParcelable("data_result_receiver"), new q(obj.replyTo));
                    break;
                }
                case 7: {
                    this.a.i(new q(obj.replyTo));
                    break;
                }
                case 6: {
                    final Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.b(bundle3);
                    this.a.e(new q(obj.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    break;
                }
                case 5: {
                    this.a.d(data.getString("data_media_item_id"), (b)data.getParcelable("data_result_receiver"), new q(obj.replyTo));
                    break;
                }
                case 4: {
                    this.a.f(data.getString("data_media_item_id"), androidx.core.app.i.a(data, "data_callback_token"), new q(obj.replyTo));
                    break;
                }
                case 3: {
                    final Bundle bundle4 = data.getBundle("data_options");
                    MediaSessionCompat.b(bundle4);
                    this.a.a(data.getString("data_media_item_id"), androidx.core.app.i.a(data, "data_callback_token"), bundle4, new q(obj.replyTo));
                    break;
                }
                case 2: {
                    this.a.c(new q(obj.replyTo));
                    break;
                }
                case 1: {
                    final Bundle bundle5 = data.getBundle("data_root_hints");
                    MediaSessionCompat.b(bundle5);
                    this.a.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle5, new q(obj.replyTo));
                    break;
                }
            }
        }
        
        public boolean sendMessageAtTime(final Message message, final long n) {
            final Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid <= 0) {
                if (data.containsKey("data_calling_pid")) {
                    return super.sendMessageAtTime(message, n);
                }
                callingPid = -1;
            }
            data.putInt("data_calling_pid", callingPid);
            return super.sendMessageAtTime(message, n);
        }
    }
}
