// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.media;

import java.util.Collections;
import android.os.Binder;
import android.media.browse.MediaBrowser$SubscriptionCallback;
import androidx.media.c;
import android.content.ServiceConnection;
import android.content.Intent;
import java.util.Map;
import android.os.IBinder;
import androidx.core.app.i;
import android.os.RemoteException;
import android.os.Process;
import androidx.collection.a;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser$ItemCallback;
import android.media.browse.MediaBrowser$ConnectionCallback;
import android.os.BadParcelableException;
import android.os.Message;
import android.os.Messenger;
import java.lang.ref.WeakReference;
import androidx.annotation.r;
import android.media.MediaDescription;
import androidx.annotation.p0;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.media.browse.MediaBrowser$MediaItem;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.os.Handler;
import android.support.v4.os.b;
import android.text.TextUtils;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.t0;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

public final class MediaBrowserCompat
{
    static final String b = "MediaBrowserCompat";
    static final boolean c;
    public static final String d = "android.media.browse.extra.PAGE";
    public static final String e = "android.media.browse.extra.PAGE_SIZE";
    public static final String f = "android.media.browse.extra.MEDIA_ID";
    public static final String g = "android.media.browse.extra.DOWNLOAD_PROGRESS";
    public static final String h = "android.support.v4.media.action.DOWNLOAD";
    public static final String i = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    private final f a;
    
    static {
        c = Log.isLoggable("MediaBrowserCompat", 3);
    }
    
    public MediaBrowserCompat(final Context context, final ComponentName componentName, final c c, final Bundle bundle) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        f a;
        if (sdk_INT >= 26) {
            a = new i(context, componentName, c, bundle);
        }
        else if (sdk_INT >= 23) {
            a = new h(context, componentName, c, bundle);
        }
        else if (sdk_INT >= 21) {
            a = new g(context, componentName, c, bundle);
        }
        else {
            a = new j(context, componentName, c, bundle);
        }
        this.a = a;
    }
    
    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.a.k();
    }
    
    public void b() {
        this.a.d();
    }
    
    @k0
    public Bundle c() {
        return this.a.getExtras();
    }
    
    public void d(@j0 final String s, @j0 final e e) {
        this.a.i(s, e);
    }
    
    @k0
    @t0({ t0.a.I })
    public Bundle e() {
        return this.a.r();
    }
    
    @j0
    public String f() {
        return this.a.c();
    }
    
    @j0
    public ComponentName g() {
        return this.a.g();
    }
    
    @j0
    public MediaSessionCompat.Token h() {
        return this.a.b();
    }
    
    public boolean i() {
        return this.a.a();
    }
    
    public void j(@j0 final String s, final Bundle bundle, @j0 final l l) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        if (l != null) {
            this.a.q(s, bundle, l);
            return;
        }
        throw new IllegalArgumentException("callback cannot be null");
    }
    
    public void k(@j0 final String s, final Bundle bundle, @k0 final d d) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.a.e(s, bundle, d);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }
    
    public void l(@j0 final String s, @j0 final Bundle bundle, @j0 final o o) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (o == null) {
            throw new IllegalArgumentException("callback is null");
        }
        if (bundle != null) {
            this.a.l(s, bundle, o);
            return;
        }
        throw new IllegalArgumentException("options are null");
    }
    
    public void m(@j0 final String s, @j0 final o o) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (o != null) {
            this.a.l(s, null, o);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }
    
    public void n(@j0 final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.a.p(s, null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }
    
    public void o(@j0 final String s, @j0 final o o) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        if (o != null) {
            this.a.p(s, o);
            return;
        }
        throw new IllegalArgumentException("callback is null");
    }
    
    private static class CustomActionResultReceiver extends b
    {
        private final String J;
        private final Bundle K;
        private final d L;
        
        CustomActionResultReceiver(final String j, final Bundle k, final d l, final Handler handler) {
            super(handler);
            this.J = j;
            this.K = k;
            this.L = l;
        }
        
        @Override
        protected void a(final int i, final Bundle obj) {
            if (this.L == null) {
                return;
            }
            MediaSessionCompat.b(obj);
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unknown result code: ");
                        sb.append(i);
                        sb.append(" (extras=");
                        sb.append(this.K);
                        sb.append(", resultData=");
                        sb.append(obj);
                        sb.append(")");
                        Log.w("MediaBrowserCompat", sb.toString());
                    }
                    else {
                        this.L.b(this.J, this.K, obj);
                    }
                }
                else {
                    this.L.c(this.J, this.K, obj);
                }
            }
            else {
                this.L.a(this.J, this.K, obj);
            }
        }
    }
    
    private static class ItemReceiver extends b
    {
        private final String J;
        private final e K;
        
        ItemReceiver(final String j, final e k, final Handler handler) {
            super(handler);
            this.J = j;
            this.K = k;
        }
        
        @Override
        protected void a(final int n, final Bundle bundle) {
            Bundle f = bundle;
            if (bundle != null) {
                f = MediaSessionCompat.F(bundle);
            }
            if (n == 0 && f != null && f.containsKey("media_item")) {
                final Parcelable parcelable = f.getParcelable("media_item");
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    this.K.a(this.J);
                }
                else {
                    this.K.b((MediaItem)parcelable);
                }
                return;
            }
            this.K.a(this.J);
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static class MediaItem implements Parcelable
    {
        public static final Parcelable$Creator<MediaItem> CREATOR;
        public static final int I = 1;
        public static final int J = 2;
        private final int G;
        private final MediaDescriptionCompat H;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<MediaItem>() {
                public MediaItem a(final Parcel parcel) {
                    return new MediaItem(parcel);
                }
                
                public MediaItem[] b(final int n) {
                    return new MediaItem[n];
                }
            };
        }
        
        MediaItem(final Parcel parcel) {
            this.G = parcel.readInt();
            this.H = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
        
        public MediaItem(@j0 final MediaDescriptionCompat h, final int g) {
            if (h == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (!TextUtils.isEmpty((CharSequence)h.g())) {
                this.G = g;
                this.H = h;
                return;
            }
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        
        public static MediaItem a(final Object o) {
            if (o != null && Build$VERSION.SDK_INT >= 21) {
                final MediaBrowser$MediaItem mediaBrowser$MediaItem = (MediaBrowser$MediaItem)o;
                return new MediaItem(MediaDescriptionCompat.a(MediaBrowserCompat.a.a(mediaBrowser$MediaItem)), MediaBrowserCompat.a.b(mediaBrowser$MediaItem));
            }
            return null;
        }
        
        public static List<MediaItem> b(final List<?> list) {
            if (list != null && Build$VERSION.SDK_INT >= 21) {
                final ArrayList<MediaItem> list2 = new ArrayList<MediaItem>(list.size());
                final Iterator<?> iterator = list.iterator();
                while (iterator.hasNext()) {
                    list2.add(a(iterator.next()));
                }
                return list2;
            }
            return null;
        }
        
        @j0
        public MediaDescriptionCompat c() {
            return this.H;
        }
        
        public int d() {
            return this.G;
        }
        
        public int describeContents() {
            return 0;
        }
        
        @k0
        public String e() {
            return this.H.g();
        }
        
        public boolean f() {
            final int g = this.G;
            boolean b = true;
            if ((g & 0x1) == 0x0) {
                b = false;
            }
            return b;
        }
        
        public boolean g() {
            return (this.G & 0x2) != 0x0;
        }
        
        @j0
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.G);
            sb.append(", mDescription=");
            sb.append(this.H);
            sb.append('}');
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.G);
            this.H.writeToParcel(parcel, n);
        }
    }
    
    private static class SearchResultReceiver extends b
    {
        private final String J;
        private final Bundle K;
        private final l L;
        
        SearchResultReceiver(final String j, final Bundle k, final l l, final Handler handler) {
            super(handler);
            this.J = j;
            this.K = k;
            this.L = l;
        }
        
        @Override
        protected void a(int i, final Bundle bundle) {
            Bundle f = bundle;
            if (bundle != null) {
                f = MediaSessionCompat.F(bundle);
            }
            if (i == 0 && f != null && f.containsKey("search_results")) {
                final Parcelable[] parcelableArray = f.getParcelableArray("search_results");
                if (parcelableArray != null) {
                    final ArrayList<MediaItem> list = new ArrayList<MediaItem>();
                    int length;
                    for (length = parcelableArray.length, i = 0; i < length; ++i) {
                        list.add((MediaItem)parcelableArray[i]);
                    }
                    this.L.b(this.J, this.K, list);
                }
                else {
                    this.L.a(this.J, this.K);
                }
                return;
            }
            this.L.a(this.J, this.K);
        }
    }
    
    @p0(21)
    private static class a
    {
        @r
        static MediaDescription a(final MediaBrowser$MediaItem mediaBrowser$MediaItem) {
            return mediaBrowser$MediaItem.getDescription();
        }
        
        @r
        static int b(final MediaBrowser$MediaItem mediaBrowser$MediaItem) {
            return mediaBrowser$MediaItem.getFlags();
        }
    }
    
    private static class b extends Handler
    {
        private final WeakReference<k> a;
        private WeakReference<Messenger> b;
        
        b(final k referent) {
            this.a = new WeakReference<k>(referent);
        }
        
        void a(final Messenger referent) {
            this.b = new WeakReference<Messenger>(referent);
        }
        
        public void handleMessage(@j0 final Message obj) {
            final WeakReference<Messenger> b = this.b;
            if (b != null && b.get() != null) {
                if (this.a.get() != null) {
                    final Bundle data = obj.getData();
                    MediaSessionCompat.b(data);
                    final k k = this.a.get();
                    final Messenger messenger = this.b.get();
                    try {
                        final int what = obj.what;
                        if (what != 1) {
                            if (what != 2) {
                                if (what != 3) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Unhandled message: ");
                                    sb.append(obj);
                                    sb.append("\n  Client version: ");
                                    sb.append(1);
                                    sb.append("\n  Service version: ");
                                    sb.append(obj.arg1);
                                    Log.w("MediaBrowserCompat", sb.toString());
                                }
                                else {
                                    final Bundle bundle = data.getBundle("data_options");
                                    MediaSessionCompat.b(bundle);
                                    final Bundle bundle2 = data.getBundle("data_notify_children_changed_options");
                                    MediaSessionCompat.b(bundle2);
                                    k.h(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle, bundle2);
                                }
                            }
                            else {
                                k.m(messenger);
                            }
                        }
                        else {
                            final Bundle bundle3 = data.getBundle("data_root_hints");
                            MediaSessionCompat.b(bundle3);
                            k.f(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token)data.getParcelable("data_media_session_token"), bundle3);
                        }
                    }
                    catch (BadParcelableException ex) {
                        Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                        if (obj.what == 1) {
                            k.m(messenger);
                        }
                    }
                }
            }
        }
    }
    
    public static class c
    {
        final MediaBrowser$ConnectionCallback a;
        b b;
        
        public c() {
            a a;
            if (Build$VERSION.SDK_INT >= 21) {
                a = new a();
            }
            else {
                a = null;
            }
            this.a = a;
        }
        
        public void a() {
        }
        
        public void b() {
        }
        
        public void c() {
        }
        
        void d(final b b) {
            this.b = b;
        }
        
        @p0(21)
        private class a extends MediaBrowser$ConnectionCallback
        {
            a() {
            }
            
            public void onConnected() {
                final b b = c.this.b;
                if (b != null) {
                    b.n();
                }
                c.this.a();
            }
            
            public void onConnectionFailed() {
                final b b = c.this.b;
                if (b != null) {
                    b.o();
                }
                c.this.b();
            }
            
            public void onConnectionSuspended() {
                final b b = c.this.b;
                if (b != null) {
                    b.j();
                }
                c.this.c();
            }
        }
        
        interface b
        {
            void j();
            
            void n();
            
            void o();
        }
    }
    
    public abstract static class d
    {
        public void a(final String s, final Bundle bundle, final Bundle bundle2) {
        }
        
        public void b(final String s, final Bundle bundle, final Bundle bundle2) {
        }
        
        public void c(final String s, final Bundle bundle, final Bundle bundle2) {
        }
    }
    
    public abstract static class e
    {
        final MediaBrowser$ItemCallback a;
        
        public e() {
            a a;
            if (Build$VERSION.SDK_INT >= 23) {
                a = new a();
            }
            else {
                a = null;
            }
            this.a = a;
        }
        
        public void a(@j0 final String s) {
        }
        
        public void b(final MediaItem mediaItem) {
        }
        
        @p0(23)
        private class a extends MediaBrowser$ItemCallback
        {
            a() {
            }
            
            public void onError(@j0 final String s) {
                e.this.a(s);
            }
            
            public void onItemLoaded(final MediaBrowser$MediaItem mediaBrowser$MediaItem) {
                e.this.b(MediaItem.a(mediaBrowser$MediaItem));
            }
        }
    }
    
    interface f
    {
        boolean a();
        
        @j0
        MediaSessionCompat.Token b();
        
        @j0
        String c();
        
        void d();
        
        void e(@j0 final String p0, final Bundle p1, @k0 final d p2);
        
        ComponentName g();
        
        @k0
        Bundle getExtras();
        
        void i(@j0 final String p0, @j0 final e p1);
        
        void k();
        
        void l(@j0 final String p0, @k0 final Bundle p1, @j0 final o p2);
        
        void p(@j0 final String p0, final o p1);
        
        void q(@j0 final String p0, final Bundle p1, @j0 final l p2);
        
        @k0
        Bundle r();
    }
    
    @p0(21)
    static class g implements f, k, c.b
    {
        final Context a;
        protected final MediaBrowser b;
        protected final Bundle c;
        protected final MediaBrowserCompat.b d;
        private final a<String, n> e;
        protected int f;
        protected m g;
        protected Messenger h;
        private MediaSessionCompat.Token i;
        private Bundle j;
        
        g(final Context a, final ComponentName componentName, final c c, final Bundle bundle) {
            this.d = new MediaBrowserCompat.b(this);
            this.e = new a<String, n>();
            this.a = a;
            Bundle c2;
            if (bundle != null) {
                c2 = new Bundle(bundle);
            }
            else {
                c2 = new Bundle();
            }
            (this.c = c2).putInt("extra_client_version", 1);
            c2.putInt("extra_calling_pid", Process.myPid());
            c.d((c.b)this);
            this.b = new MediaBrowser(a, componentName, c.a, c2);
        }
        
        @Override
        public boolean a() {
            return this.b.isConnected();
        }
        
        @j0
        @Override
        public MediaSessionCompat.Token b() {
            if (this.i == null) {
                this.i = MediaSessionCompat.Token.b(this.b.getSessionToken());
            }
            return this.i;
        }
        
        @j0
        @Override
        public String c() {
            return this.b.getRoot();
        }
        
        @Override
        public void d() {
            final m g = this.g;
            if (g != null) {
                final Messenger h = this.h;
                if (h != null) {
                    try {
                        g.j(h);
                    }
                    catch (RemoteException ex) {
                        Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                    }
                }
            }
            this.b.disconnect();
        }
        
        @Override
        public void e(@j0 final String s, final Bundle bundle, @k0 final d d) {
            if (this.a()) {
                if (this.g == null) {
                    Log.i("MediaBrowserCompat", "The connected service doesn't support sendCustomAction.");
                    if (d != null) {
                        this.d.post((Runnable)new Runnable() {
                            @Override
                            public void run() {
                                d.a(s, bundle, null);
                            }
                        });
                    }
                }
                final CustomActionResultReceiver customActionResultReceiver = new CustomActionResultReceiver(s, bundle, d, this.d);
                try {
                    this.g.h(s, bundle, customActionResultReceiver, this.h);
                }
                catch (RemoteException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Remote error sending a custom action: action=");
                    sb.append(s);
                    sb.append(", extras=");
                    sb.append(bundle);
                    Log.i("MediaBrowserCompat", sb.toString(), (Throwable)ex);
                    if (d != null) {
                        this.d.post((Runnable)new Runnable() {
                            @Override
                            public void run() {
                                d.a(s, bundle, null);
                            }
                        });
                    }
                }
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot send a custom action (");
            sb2.append(s);
            sb2.append(") with extras ");
            sb2.append(bundle);
            sb2.append(" because the browser is not connected to the service.");
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public void f(final Messenger messenger, final String s, final MediaSessionCompat.Token token, final Bundle bundle) {
        }
        
        @Override
        public ComponentName g() {
            return this.b.getServiceComponent();
        }
        
        @k0
        @Override
        public Bundle getExtras() {
            return this.b.getExtras();
        }
        
        @Override
        public void h(final Messenger messenger, final String str, final List<MediaItem> list, final Bundle bundle, final Bundle bundle2) {
            if (this.h != messenger) {
                return;
            }
            final n n = this.e.get(str);
            if (n == null) {
                if (MediaBrowserCompat.c) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("onLoadChildren for id that isn't subscribed id=");
                    sb.append(str);
                    Log.d("MediaBrowserCompat", sb.toString());
                }
                return;
            }
            final o a = n.a(bundle);
            if (a != null) {
                if (bundle == null) {
                    if (list == null) {
                        a.c(str);
                        return;
                    }
                    this.j = bundle2;
                    a.a(str, list);
                }
                else {
                    if (list == null) {
                        a.d(str, bundle);
                        return;
                    }
                    this.j = bundle2;
                    a.b(str, list, bundle);
                }
                this.j = null;
            }
        }
        
        @Override
        public void i(@j0 final String str, @j0 final e e) {
            if (TextUtils.isEmpty((CharSequence)str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (e != null) {
                Runnable runnable;
                MediaBrowserCompat.b b;
                if (!this.b.isConnected()) {
                    Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
                    final MediaBrowserCompat.b d = this.d;
                    runnable = new Runnable() {
                        @Override
                        public void run() {
                            e.a(str);
                        }
                    };
                    b = d;
                }
                else {
                    if (this.g != null) {
                        final ItemReceiver itemReceiver = new ItemReceiver(str, e, this.d);
                        try {
                            this.g.d(str, itemReceiver, this.h);
                        }
                        catch (RemoteException ex) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Remote error getting media item: ");
                            sb.append(str);
                            Log.i("MediaBrowserCompat", sb.toString());
                            this.d.post((Runnable)new Runnable() {
                                @Override
                                public void run() {
                                    e.a(str);
                                }
                            });
                        }
                        return;
                    }
                    final MediaBrowserCompat.b d2 = this.d;
                    runnable = new Runnable() {
                        @Override
                        public void run() {
                            e.a(str);
                        }
                    };
                    b = d2;
                }
                b.post(runnable);
                return;
            }
            throw new IllegalArgumentException("cb is null");
        }
        
        @Override
        public void j() {
            this.g = null;
            this.h = null;
            this.i = null;
            this.d.a(null);
        }
        
        @Override
        public void k() {
            this.b.connect();
        }
        
        @Override
        public void l(@j0 final String str, final Bundle bundle, @j0 final o o) {
            n n;
            if ((n = this.e.get(str)) == null) {
                n = new n();
                this.e.put(str, n);
            }
            o.e(n);
            Bundle bundle2;
            if (bundle == null) {
                bundle2 = null;
            }
            else {
                bundle2 = new Bundle(bundle);
            }
            n.e(bundle2, o);
            final m g = this.g;
            if (g == null) {
                this.b.subscribe(str, o.a);
            }
            else {
                try {
                    g.a(str, o.b, bundle2, this.h);
                }
                catch (RemoteException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Remote error subscribing media item: ");
                    sb.append(str);
                    Log.i("MediaBrowserCompat", sb.toString());
                }
            }
        }
        
        @Override
        public void m(final Messenger messenger) {
        }
        
        @Override
        public void n() {
            try {
                final Bundle extras = this.b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f = extras.getInt("extra_service_version", 0);
                final IBinder a = androidx.core.app.i.a(extras, "extra_messenger");
                if (a != null) {
                    this.g = new m(a, this.c);
                    final Messenger h = new Messenger((Handler)this.d);
                    this.h = h;
                    this.d.a(h);
                    try {
                        this.g.e(this.a, this.h);
                    }
                    catch (RemoteException ex2) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                final android.support.v4.media.session.b h2 = android.support.v4.media.session.b.b.H(androidx.core.app.i.a(extras, "extra_session_binder"));
                if (h2 != null) {
                    this.i = MediaSessionCompat.Token.c(this.b.getSessionToken(), h2);
                }
            }
            catch (IllegalStateException ex) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", (Throwable)ex);
            }
        }
        
        @Override
        public void o() {
        }
        
        @Override
        public void p(@j0 final String str, final o o) {
            final n n = this.e.get(str);
            if (n == null) {
                return;
            }
            final m g = this.g;
            Label_0262: {
                if (g == null) {
                    if (o != null) {
                        final List<o> b = n.b();
                        final List<Bundle> c = n.c();
                        for (int i = b.size() - 1; i >= 0; --i) {
                            if (b.get(i) == o) {
                                b.remove(i);
                                c.remove(i);
                            }
                        }
                        if (b.size() != 0) {
                            break Label_0262;
                        }
                    }
                    this.b.unsubscribe(str);
                }
                else {
                    Label_0141: {
                        if (o != null) {
                            break Label_0141;
                        }
                        try {
                            g.f(str, null, this.h);
                            break Label_0262;
                            // iftrue(Label_0218:, b2.get(n2) != o)
                            while (true) {
                            Label_0164:
                                while (true) {
                                    int n2 = 0;
                                    --n2;
                                    break Label_0164;
                                    final List<o> b2;
                                    final List<Bundle> c2;
                                    Block_10: {
                                        break Block_10;
                                        b2 = n.b();
                                        c2 = n.c();
                                        n2 = b2.size() - 1;
                                        break Label_0164;
                                    }
                                    this.g.f(str, o.b, this.h);
                                    b2.remove(n2);
                                    c2.remove(n2);
                                    continue;
                                }
                                continue;
                            }
                        }
                        // iftrue(Label_0262:, n2 < 0)
                        catch (RemoteException ex) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("removeSubscription failed with RemoteException parentId=");
                            sb.append(str);
                            Log.d("MediaBrowserCompat", sb.toString());
                        }
                    }
                }
            }
            if (n.d() || o == null) {
                this.e.remove(str);
            }
        }
        
        @Override
        public void q(@j0 final String str, final Bundle bundle, @j0 final l l) {
            if (!this.a()) {
                throw new IllegalStateException("search() called while not connected");
            }
            if (this.g == null) {
                Log.i("MediaBrowserCompat", "The connected service doesn't support search.");
                this.d.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        l.a(str, bundle);
                    }
                });
                return;
            }
            final SearchResultReceiver searchResultReceiver = new SearchResultReceiver(str, bundle, l, this.d);
            try {
                this.g.g(str, bundle, searchResultReceiver, this.h);
            }
            catch (RemoteException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Remote error searching items with query: ");
                sb.append(str);
                Log.i("MediaBrowserCompat", sb.toString(), (Throwable)ex);
                this.d.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        l.a(str, bundle);
                    }
                });
            }
        }
        
        @Override
        public Bundle r() {
            return this.j;
        }
    }
    
    @p0(23)
    static class h extends MediaBrowserCompat.g
    {
        h(final Context context, final ComponentName componentName, final c c, final Bundle bundle) {
            super(context, componentName, c, bundle);
        }
        
        @Override
        public void i(@j0 final String s, @j0 final e e) {
            if (super.g == null) {
                super.b.getItem(s, e.a);
            }
            else {
                super.i(s, e);
            }
        }
    }
    
    @p0(26)
    static class i extends h
    {
        i(final Context context, final ComponentName componentName, final c c, final Bundle bundle) {
            super(context, componentName, c, bundle);
        }
        
        @Override
        public void l(@j0 final String s, @k0 final Bundle bundle, @j0 final o o) {
            if (super.g != null && super.f >= 2) {
                super.l(s, bundle, o);
            }
            else if (bundle == null) {
                super.b.subscribe(s, o.a);
            }
            else {
                super.b.subscribe(s, bundle, o.a);
            }
        }
        
        @Override
        public void p(@j0 final String s, final o o) {
            if (super.g != null && super.f >= 2) {
                super.p(s, o);
            }
            else if (o == null) {
                super.b.unsubscribe(s);
            }
            else {
                super.b.unsubscribe(s, o.a);
            }
        }
    }
    
    static class j implements f, k
    {
        static final int o = 0;
        static final int p = 1;
        static final int q = 2;
        static final int r = 3;
        static final int s = 4;
        final Context a;
        final ComponentName b;
        final c c;
        final Bundle d;
        final MediaBrowserCompat.b e;
        private final a<String, n> f;
        int g;
        g h;
        m i;
        Messenger j;
        private String k;
        private MediaSessionCompat.Token l;
        private Bundle m;
        private Bundle n;
        
        public j(final Context a, final ComponentName b, final c c, final Bundle bundle) {
            this.e = new MediaBrowserCompat.b(this);
            this.f = new a<String, n>();
            this.g = 1;
            if (a == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (b == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (c != null) {
                this.a = a;
                this.b = b;
                this.c = c;
                Bundle d;
                if (bundle == null) {
                    d = null;
                }
                else {
                    d = new Bundle(bundle);
                }
                this.d = d;
                return;
            }
            throw new IllegalArgumentException("connection callback must not be null");
        }
        
        private static String o(final int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i != 4) {
                final StringBuilder sb = new StringBuilder();
                sb.append("UNKNOWN/");
                sb.append(i);
                return sb.toString();
            }
            return "CONNECT_STATE_SUSPENDED";
        }
        
        private boolean s(final Messenger messenger, final String str) {
            if (this.j == messenger) {
                final int g = this.g;
                if (g != 0) {
                    if (g != 1) {
                        return true;
                    }
                }
            }
            final int g2 = this.g;
            if (g2 != 0 && g2 != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" for ");
                sb.append(this.b);
                sb.append(" with mCallbacksMessenger=");
                sb.append(this.j);
                sb.append(" this=");
                sb.append(this);
                Log.i("MediaBrowserCompat", sb.toString());
            }
            return false;
        }
        
        @Override
        public boolean a() {
            return this.g == 3;
        }
        
        @j0
        @Override
        public MediaSessionCompat.Token b() {
            if (this.a()) {
                return this.l;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("getSessionToken() called while not connected(state=");
            sb.append(this.g);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
        
        @j0
        @Override
        public String c() {
            if (this.a()) {
                return this.k;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("getRoot() called while not connected(state=");
            sb.append(o(this.g));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
        
        @Override
        public void d() {
            this.g = 0;
            this.e.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    final j g = MediaBrowserCompat.j.this;
                    final Messenger j = g.j;
                    if (j != null) {
                        try {
                            g.i.c(j);
                        }
                        catch (RemoteException ex) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("RemoteException during connect for ");
                            sb.append(MediaBrowserCompat.j.this.b);
                            Log.w("MediaBrowserCompat", sb.toString());
                        }
                    }
                    final j g2 = MediaBrowserCompat.j.this;
                    final int g3 = g2.g;
                    g2.n();
                    if (g3 != 0) {
                        MediaBrowserCompat.j.this.g = g3;
                    }
                    if (MediaBrowserCompat.c) {
                        Log.d("MediaBrowserCompat", "disconnect...");
                        MediaBrowserCompat.j.this.j();
                    }
                }
            });
        }
        
        @Override
        public void e(@j0 final String s, final Bundle bundle, @k0 final d d) {
            if (this.a()) {
                final CustomActionResultReceiver customActionResultReceiver = new CustomActionResultReceiver(s, bundle, d, this.e);
                try {
                    this.i.h(s, bundle, customActionResultReceiver, this.j);
                }
                catch (RemoteException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Remote error sending a custom action: action=");
                    sb.append(s);
                    sb.append(", extras=");
                    sb.append(bundle);
                    Log.i("MediaBrowserCompat", sb.toString(), (Throwable)ex);
                    if (d != null) {
                        this.e.post((Runnable)new Runnable() {
                            @Override
                            public void run() {
                                d.a(s, bundle, null);
                            }
                        });
                    }
                }
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot send a custom action (");
            sb2.append(s);
            sb2.append(") with extras ");
            sb2.append(bundle);
            sb2.append(" because the browser is not connected to the service.");
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public void f(final Messenger messenger, final String k, final MediaSessionCompat.Token l, final Bundle m) {
            if (!this.s(messenger, "onConnect")) {
                return;
            }
            if (this.g != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onConnect from service while mState=");
                sb.append(o(this.g));
                sb.append("... ignoring");
                Log.w("MediaBrowserCompat", sb.toString());
                return;
            }
            this.k = k;
            this.l = l;
            this.m = m;
            this.g = 3;
            if (MediaBrowserCompat.c) {
                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                this.j();
            }
            this.c.a();
            try {
                for (final Map.Entry<String, n> entry : this.f.entrySet()) {
                    final String s = entry.getKey();
                    final n n = entry.getValue();
                    final List<o> b = n.b();
                    final List<Bundle> c = n.c();
                    for (int i = 0; i < b.size(); ++i) {
                        this.i.a(s, b.get(i).b, c.get(i), this.j);
                    }
                }
            }
            catch (RemoteException ex) {
                Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
            }
        }
        
        @j0
        @Override
        public ComponentName g() {
            if (this.a()) {
                return this.b;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("getServiceComponent() called while not connected (state=");
            sb.append(this.g);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
        
        @k0
        @Override
        public Bundle getExtras() {
            if (this.a()) {
                return this.m;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("getExtras() called while not connected (state=");
            sb.append(o(this.g));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
        
        @Override
        public void h(final Messenger messenger, final String s, final List<MediaItem> list, final Bundle bundle, final Bundle bundle2) {
            if (!this.s(messenger, "onLoadChildren")) {
                return;
            }
            final boolean c = MediaBrowserCompat.c;
            if (c) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onLoadChildren for ");
                sb.append(this.b);
                sb.append(" id=");
                sb.append(s);
                Log.d("MediaBrowserCompat", sb.toString());
            }
            final n n = this.f.get(s);
            if (n == null) {
                if (c) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("onLoadChildren for id that isn't subscribed id=");
                    sb2.append(s);
                    Log.d("MediaBrowserCompat", sb2.toString());
                }
                return;
            }
            final o a = n.a(bundle);
            if (a != null) {
                if (bundle == null) {
                    if (list == null) {
                        a.c(s);
                        return;
                    }
                    this.n = bundle2;
                    a.a(s, list);
                }
                else {
                    if (list == null) {
                        a.d(s, bundle);
                        return;
                    }
                    this.n = bundle2;
                    a.b(s, list, bundle);
                }
                this.n = null;
            }
        }
        
        @Override
        public void i(@j0 final String str, @j0 final e e) {
            if (TextUtils.isEmpty((CharSequence)str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (e == null) {
                throw new IllegalArgumentException("cb is null");
            }
            if (!this.a()) {
                Log.i("MediaBrowserCompat", "Not connected, unable to retrieve the MediaItem.");
                this.e.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        e.a(str);
                    }
                });
                return;
            }
            final ItemReceiver itemReceiver = new ItemReceiver(str, e, this.e);
            try {
                this.i.d(str, itemReceiver, this.j);
            }
            catch (RemoteException ex) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Remote error getting media item: ");
                sb.append(str);
                Log.i("MediaBrowserCompat", sb.toString());
                this.e.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        e.a(str);
                    }
                });
            }
        }
        
        void j() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            final StringBuilder sb = new StringBuilder();
            sb.append("  mServiceComponent=");
            sb.append(this.b);
            Log.d("MediaBrowserCompat", sb.toString());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("  mCallback=");
            sb2.append(this.c);
            Log.d("MediaBrowserCompat", sb2.toString());
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("  mRootHints=");
            sb3.append(this.d);
            Log.d("MediaBrowserCompat", sb3.toString());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("  mState=");
            sb4.append(o(this.g));
            Log.d("MediaBrowserCompat", sb4.toString());
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("  mServiceConnection=");
            sb5.append(this.h);
            Log.d("MediaBrowserCompat", sb5.toString());
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("  mServiceBinderWrapper=");
            sb6.append(this.i);
            Log.d("MediaBrowserCompat", sb6.toString());
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("  mCallbacksMessenger=");
            sb7.append(this.j);
            Log.d("MediaBrowserCompat", sb7.toString());
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("  mRootId=");
            sb8.append(this.k);
            Log.d("MediaBrowserCompat", sb8.toString());
            final StringBuilder sb9 = new StringBuilder();
            sb9.append("  mMediaSessionToken=");
            sb9.append(this.l);
            Log.d("MediaBrowserCompat", sb9.toString());
        }
        
        @Override
        public void k() {
            final int g = this.g;
            if (g != 0 && g != 1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("connect() called while neigther disconnecting nor disconnected (state=");
                sb.append(o(this.g));
                sb.append(")");
                throw new IllegalStateException(sb.toString());
            }
            this.g = 2;
            this.e.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    final j g = MediaBrowserCompat.j.this;
                    if (g.g == 0) {
                        return;
                    }
                    g.g = 2;
                    if (MediaBrowserCompat.c && g.h != null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("mServiceConnection should be null. Instead it is ");
                        sb.append(MediaBrowserCompat.j.this.h);
                        throw new RuntimeException(sb.toString());
                    }
                    if (g.i != null) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("mServiceBinderWrapper should be null. Instead it is ");
                        sb2.append(MediaBrowserCompat.j.this.i);
                        throw new RuntimeException(sb2.toString());
                    }
                    if (g.j == null) {
                        final Intent intent = new Intent("android.media.browse.MediaBrowserService");
                        intent.setComponent(MediaBrowserCompat.j.this.b);
                        final j g2 = MediaBrowserCompat.j.this;
                        g2.h = g2.new g();
                        final int n = 0;
                        int bindService;
                        try {
                            final j g3 = MediaBrowserCompat.j.this;
                            bindService = (g3.a.bindService(intent, (ServiceConnection)g3.h, 1) ? 1 : 0);
                        }
                        catch (Exception ex) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Failed binding to service ");
                            sb3.append(MediaBrowserCompat.j.this.b);
                            Log.e("MediaBrowserCompat", sb3.toString());
                            bindService = n;
                        }
                        if (bindService == 0) {
                            MediaBrowserCompat.j.this.n();
                            MediaBrowserCompat.j.this.c.b();
                        }
                        if (MediaBrowserCompat.c) {
                            Log.d("MediaBrowserCompat", "connect...");
                            MediaBrowserCompat.j.this.j();
                        }
                        return;
                    }
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("mCallbacksMessenger should be null. Instead it is ");
                    sb4.append(MediaBrowserCompat.j.this.j);
                    throw new RuntimeException(sb4.toString());
                }
            });
        }
        
        @Override
        public void l(@j0 final String str, final Bundle bundle, @j0 final o o) {
            n n;
            if ((n = this.f.get(str)) == null) {
                n = new n();
                this.f.put(str, n);
            }
            Bundle bundle2;
            if (bundle == null) {
                bundle2 = null;
            }
            else {
                bundle2 = new Bundle(bundle);
            }
            n.e(bundle2, o);
            if (this.a()) {
                try {
                    this.i.a(str, o.b, bundle2, this.j);
                }
                catch (RemoteException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("addSubscription failed with RemoteException parentId=");
                    sb.append(str);
                    Log.d("MediaBrowserCompat", sb.toString());
                }
            }
        }
        
        @Override
        public void m(final Messenger messenger) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onConnectFailed for ");
            sb.append(this.b);
            Log.e("MediaBrowserCompat", sb.toString());
            if (!this.s(messenger, "onConnectFailed")) {
                return;
            }
            if (this.g != 2) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("onConnect from service while mState=");
                sb2.append(o(this.g));
                sb2.append("... ignoring");
                Log.w("MediaBrowserCompat", sb2.toString());
                return;
            }
            this.n();
            this.c.b();
        }
        
        void n() {
            final g h = this.h;
            if (h != null) {
                this.a.unbindService((ServiceConnection)h);
            }
            this.g = 1;
            this.h = null;
            this.i = null;
            this.j = null;
            this.e.a(null);
            this.k = null;
            this.l = null;
        }
        
        @Override
        public void p(@j0 final String str, final o o) {
            final n n = this.f.get(str);
            if (n == null) {
                return;
            }
            while (true) {
                if (o == null) {
                    Label_0172: {
                        try {
                            if (this.a()) {
                                this.i.f(str, null, this.j);
                            }
                            break Label_0172;
                            // iftrue(Label_0128:, b.get(n2) != o)
                            // iftrue(Label_0108:, !this.a())
                            // iftrue(Label_0172:, n2 < 0)
                        Label_0067:
                            while (true) {
                                while (true) {
                                    while (true) {
                                        this.i.f(str, o.b, this.j);
                                        Block_7: {
                                            while (true) {
                                                int n2 = 0;
                                                Label_0108: {
                                                    break Label_0108;
                                                    break Block_7;
                                                    --n2;
                                                    break Label_0067;
                                                }
                                                final List<o> b;
                                                b.remove(n2);
                                                final List<Bundle> c;
                                                c.remove(n2);
                                                continue;
                                            }
                                        }
                                        continue;
                                    }
                                    continue;
                                }
                                final List<o> b = n.b();
                                final List<Bundle> c = n.c();
                                int n2 = b.size() - 1;
                                continue Label_0067;
                            }
                        }
                        catch (RemoteException ex) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("removeSubscription failed with RemoteException parentId=");
                            sb.append(str);
                            Log.d("MediaBrowserCompat", sb.toString());
                        }
                    }
                    if (n.d() || o == null) {
                        this.f.remove(str);
                    }
                    return;
                }
                continue;
            }
        }
        
        @Override
        public void q(@j0 final String str, final Bundle bundle, @j0 final l l) {
            if (this.a()) {
                final SearchResultReceiver searchResultReceiver = new SearchResultReceiver(str, bundle, l, this.e);
                try {
                    this.i.g(str, bundle, searchResultReceiver, this.j);
                }
                catch (RemoteException ex) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Remote error searching items with query: ");
                    sb.append(str);
                    Log.i("MediaBrowserCompat", sb.toString(), (Throwable)ex);
                    this.e.post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            l.a(str, bundle);
                        }
                    });
                }
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("search() called while not connected (state=");
            sb2.append(o(this.g));
            sb2.append(")");
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public Bundle r() {
            return this.n;
        }
        
        private class g implements ServiceConnection
        {
            g() {
            }
            
            private void b(final Runnable runnable) {
                if (Thread.currentThread() == MediaBrowserCompat.j.this.e.getLooper().getThread()) {
                    runnable.run();
                }
                else {
                    MediaBrowserCompat.j.this.e.post(runnable);
                }
            }
            
            boolean a(final String str) {
                final j c = MediaBrowserCompat.j.this;
                if (c.h == this) {
                    final int g = c.g;
                    if (g != 0) {
                        if (g != 1) {
                            return true;
                        }
                    }
                }
                final int g2 = c.g;
                if (g2 != 0 && g2 != 1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" for ");
                    sb.append(MediaBrowserCompat.j.this.b);
                    sb.append(" with mServiceConnection=");
                    sb.append(MediaBrowserCompat.j.this.h);
                    sb.append(" this=");
                    sb.append(this);
                    Log.i("MediaBrowserCompat", sb.toString());
                }
                return false;
            }
            
            public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
                this.b(new Runnable() {
                    @Override
                    public void run() {
                        final boolean c = MediaBrowserCompat.c;
                        if (c) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("MediaServiceConnection.onServiceConnected name=");
                            sb.append(componentName);
                            sb.append(" binder=");
                            sb.append(binder);
                            Log.d("MediaBrowserCompat", sb.toString());
                            MediaBrowserCompat.j.this.j();
                        }
                        if (!g.this.a("onServiceConnected")) {
                            return;
                        }
                        final j c2 = MediaBrowserCompat.j.this;
                        c2.i = new m(binder, c2.d);
                        MediaBrowserCompat.j.this.j = new Messenger((Handler)MediaBrowserCompat.j.this.e);
                        final j c3 = MediaBrowserCompat.j.this;
                        c3.e.a(c3.j);
                        MediaBrowserCompat.j.this.g = 2;
                        while (true) {
                            if (c) {
                                try {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    MediaBrowserCompat.j.this.j();
                                    final j c4 = MediaBrowserCompat.j.this;
                                    c4.i.b(c4.a, c4.j);
                                }
                                catch (RemoteException ex) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("RemoteException during connect for ");
                                    sb2.append(MediaBrowserCompat.j.this.b);
                                    Log.w("MediaBrowserCompat", sb2.toString());
                                    if (MediaBrowserCompat.c) {
                                        Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                        MediaBrowserCompat.j.this.j();
                                    }
                                }
                                return;
                            }
                            continue;
                        }
                    }
                });
            }
            
            public void onServiceDisconnected(final ComponentName componentName) {
                this.b(new Runnable() {
                    @Override
                    public void run() {
                        if (MediaBrowserCompat.c) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("MediaServiceConnection.onServiceDisconnected name=");
                            sb.append(componentName);
                            sb.append(" this=");
                            sb.append(this);
                            sb.append(" mServiceConnection=");
                            sb.append(MediaBrowserCompat.j.this.h);
                            Log.d("MediaBrowserCompat", sb.toString());
                            MediaBrowserCompat.j.this.j();
                        }
                        if (!g.this.a("onServiceDisconnected")) {
                            return;
                        }
                        final j c = MediaBrowserCompat.j.this;
                        c.i = null;
                        c.j = null;
                        c.e.a(null);
                        final j c2 = MediaBrowserCompat.j.this;
                        c2.g = 4;
                        c2.c.c();
                    }
                });
            }
        }
    }
    
    interface k
    {
        void f(final Messenger p0, final String p1, final MediaSessionCompat.Token p2, final Bundle p3);
        
        void h(final Messenger p0, final String p1, final List<MediaItem> p2, final Bundle p3, final Bundle p4);
        
        void m(final Messenger p0);
    }
    
    public abstract static class l
    {
        public void a(@j0 final String s, final Bundle bundle) {
        }
        
        public void b(@j0 final String s, final Bundle bundle, @j0 final List<MediaItem> list) {
        }
    }
    
    private static class m
    {
        private Messenger a;
        private Bundle b;
        
        public m(final IBinder binder, final Bundle b) {
            this.a = new Messenger(binder);
            this.b = b;
        }
        
        private void i(final int what, final Bundle data, final Messenger replyTo) throws RemoteException {
            final Message obtain = Message.obtain();
            obtain.what = what;
            obtain.arg1 = 1;
            obtain.setData(data);
            obtain.replyTo = replyTo;
            this.a.send(obtain);
        }
        
        void a(final String s, final IBinder binder, final Bundle bundle, final Messenger messenger) throws RemoteException {
            final Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", s);
            androidx.core.app.i.b(bundle2, "data_callback_token", binder);
            bundle2.putBundle("data_options", bundle);
            this.i(3, bundle2, messenger);
        }
        
        void b(final Context context, final Messenger messenger) throws RemoteException {
            final Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            this.i(1, bundle, messenger);
        }
        
        void c(final Messenger messenger) throws RemoteException {
            this.i(2, null, messenger);
        }
        
        void d(final String s, final b b, final Messenger messenger) throws RemoteException {
            final Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", s);
            bundle.putParcelable("data_result_receiver", (Parcelable)b);
            this.i(5, bundle, messenger);
        }
        
        void e(final Context context, final Messenger messenger) throws RemoteException {
            final Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.b);
            this.i(6, bundle, messenger);
        }
        
        void f(final String s, final IBinder binder, final Messenger messenger) throws RemoteException {
            final Bundle bundle = new Bundle();
            bundle.putString("data_media_item_id", s);
            androidx.core.app.i.b(bundle, "data_callback_token", binder);
            this.i(4, bundle, messenger);
        }
        
        void g(final String s, final Bundle bundle, final b b, final Messenger messenger) throws RemoteException {
            final Bundle bundle2 = new Bundle();
            bundle2.putString("data_search_query", s);
            bundle2.putBundle("data_search_extras", bundle);
            bundle2.putParcelable("data_result_receiver", (Parcelable)b);
            this.i(8, bundle2, messenger);
        }
        
        void h(final String s, final Bundle bundle, final b b, final Messenger messenger) throws RemoteException {
            final Bundle bundle2 = new Bundle();
            bundle2.putString("data_custom_action", s);
            bundle2.putBundle("data_custom_action_extras", bundle);
            bundle2.putParcelable("data_result_receiver", (Parcelable)b);
            this.i(9, bundle2, messenger);
        }
        
        void j(final Messenger messenger) throws RemoteException {
            this.i(7, null, messenger);
        }
    }
    
    private static class n
    {
        private final List<o> a;
        private final List<Bundle> b;
        
        public n() {
            this.a = new ArrayList<o>();
            this.b = new ArrayList<Bundle>();
        }
        
        public o a(final Bundle bundle) {
            for (int i = 0; i < this.b.size(); ++i) {
                if (androidx.media.c.a(this.b.get(i), bundle)) {
                    return this.a.get(i);
                }
            }
            return null;
        }
        
        public List<o> b() {
            return this.a;
        }
        
        public List<Bundle> c() {
            return this.b;
        }
        
        public boolean d() {
            return this.a.isEmpty();
        }
        
        public void e(final Bundle bundle, final o o) {
            for (int i = 0; i < this.b.size(); ++i) {
                if (androidx.media.c.a(this.b.get(i), bundle)) {
                    this.a.set(i, o);
                    return;
                }
            }
            this.a.add(o);
            this.b.add(bundle);
        }
    }
    
    public abstract static class o
    {
        final MediaBrowser$SubscriptionCallback a;
        final IBinder b;
        WeakReference<n> c;
        
        public o() {
            this.b = (IBinder)new Binder();
            final int sdk_INT = Build$VERSION.SDK_INT;
            MediaBrowser$SubscriptionCallback a;
            if (sdk_INT >= 26) {
                a = new b();
            }
            else if (sdk_INT >= 21) {
                a = new a();
            }
            else {
                a = null;
            }
            this.a = a;
        }
        
        public void a(@j0 final String s, @j0 final List<MediaItem> list) {
        }
        
        public void b(@j0 final String s, @j0 final List<MediaItem> list, @j0 final Bundle bundle) {
        }
        
        public void c(@j0 final String s) {
        }
        
        public void d(@j0 final String s, @j0 final Bundle bundle) {
        }
        
        void e(final n referent) {
            this.c = new WeakReference<n>(referent);
        }
        
        @p0(21)
        private class a extends MediaBrowser$SubscriptionCallback
        {
            a() {
            }
            
            List<MediaItem> a(final List<MediaItem> list, final Bundle bundle) {
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
            
            public void onChildrenLoaded(@j0 final String s, final List<MediaBrowser$MediaItem> list) {
                final WeakReference<n> c = o.this.c;
                Object o;
                if (c == null) {
                    o = null;
                }
                else {
                    o = c.get();
                }
                if (o == null) {
                    MediaBrowserCompat.o.this.a(s, MediaItem.b(list));
                }
                else {
                    final List<MediaItem> b = MediaItem.b(list);
                    final List<o> b2 = ((n)o).b();
                    final List<Bundle> c2 = ((n)o).c();
                    for (int i = 0; i < b2.size(); ++i) {
                        final Bundle bundle = c2.get(i);
                        if (bundle == null) {
                            MediaBrowserCompat.o.this.a(s, b);
                        }
                        else {
                            MediaBrowserCompat.o.this.b(s, this.a(b, bundle), bundle);
                        }
                    }
                }
            }
            
            public void onError(@j0 final String s) {
                o.this.c(s);
            }
        }
        
        @p0(26)
        private class b extends a
        {
            b() {
            }
            
            public void onChildrenLoaded(@j0 final String s, @j0 final List<MediaBrowser$MediaItem> list, @j0 final Bundle bundle) {
                MediaSessionCompat.b(bundle);
                o.this.b(s, MediaItem.b(list), bundle);
            }
            
            public void onError(@j0 final String s, @j0 final Bundle bundle) {
                MediaSessionCompat.b(bundle);
                o.this.d(s, bundle);
            }
        }
    }
}
