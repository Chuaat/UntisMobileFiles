// 
// Decompiled by Procyon v0.5.36
// 

package androidx.localbroadcastmanager.content;

import java.util.Set;
import android.net.Uri;
import android.util.Log;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.j0;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;
import java.util.ArrayList;
import android.content.BroadcastReceiver;
import java.util.HashMap;
import android.content.Context;

public final class a
{
    private static final String f = "LocalBroadcastManager";
    private static final boolean g = false;
    static final int h = 1;
    private static final Object i;
    private static a j;
    private final Context a;
    private final HashMap<BroadcastReceiver, ArrayList<c>> b;
    private final HashMap<String, ArrayList<c>> c;
    private final ArrayList<b> d;
    private final Handler e;
    
    static {
        i = new Object();
    }
    
    private a(final Context a) {
        this.b = new HashMap<BroadcastReceiver, ArrayList<c>>();
        this.c = new HashMap<String, ArrayList<c>>();
        this.d = new ArrayList<b>();
        this.a = a;
        this.e = new Handler(a.getMainLooper()) {
            public void handleMessage(final Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                }
                else {
                    androidx.localbroadcastmanager.content.a.this.a();
                }
            }
        };
    }
    
    @j0
    public static a b(@j0 final Context context) {
        synchronized (a.i) {
            if (a.j == null) {
                a.j = new a(context.getApplicationContext());
            }
            return a.j;
        }
    }
    
    void a() {
        while (true) {
            Object b = this.b;
            synchronized (b) {
                final int size = this.d.size();
                if (size <= 0) {
                    return;
                }
                final b[] a = new b[size];
                this.d.toArray(a);
                this.d.clear();
                // monitorexit(b)
                for (int i = 0; i < size; ++i) {
                    b = a[i];
                    for (int size2 = ((b)b).b.size(), j = 0; j < size2; ++j) {
                        final c c = ((b)b).b.get(j);
                        if (!c.d) {
                            c.b.onReceive(this.a, ((b)b).a);
                        }
                    }
                }
            }
        }
    }
    
    public void c(@j0 final BroadcastReceiver broadcastReceiver, @j0 final IntentFilter intentFilter) {
        synchronized (this.b) {
            final c c = new c(intentFilter, broadcastReceiver);
            ArrayList<c> value;
            if ((value = this.b.get(broadcastReceiver)) == null) {
                value = new ArrayList<c>(1);
                this.b.put(broadcastReceiver, value);
            }
            value.add(c);
            for (int i = 0; i < intentFilter.countActions(); ++i) {
                final String action = intentFilter.getAction(i);
                ArrayList<c> value2;
                if ((value2 = this.c.get(action)) == null) {
                    value2 = new ArrayList<c>(1);
                    this.c.put(action, value2);
                }
                value2.add(c);
            }
        }
    }
    
    public boolean d(@j0 final Intent obj) {
        synchronized (this.b) {
            final String action = obj.getAction();
            final String resolveTypeIfNeeded = obj.resolveTypeIfNeeded(this.a.getContentResolver());
            final Uri data = obj.getData();
            final String scheme = obj.getScheme();
            final Set categories = obj.getCategories();
            final boolean b = (obj.getFlags() & 0x8) != 0x0;
            if (b) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Resolving type ");
                sb.append(resolveTypeIfNeeded);
                sb.append(" scheme ");
                sb.append(scheme);
                sb.append(" of intent ");
                sb.append(obj);
                Log.v("LocalBroadcastManager", sb.toString());
            }
            final ArrayList<c> obj2 = this.c.get(obj.getAction());
            if (obj2 != null) {
                if (b) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Action list: ");
                    sb2.append(obj2);
                    Log.v("LocalBroadcastManager", sb2.toString());
                }
                ArrayList<c> list = null;
                for (int i = 0; i < obj2.size(); ++i) {
                    final c e = obj2.get(i);
                    if (b) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Matching against filter ");
                        sb3.append(e.a);
                        Log.v("LocalBroadcastManager", sb3.toString());
                    }
                    if (e.c) {
                        if (b) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                    }
                    else {
                        final IntentFilter a = e.a;
                        final ArrayList<c> list2 = list;
                        final int match = a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (b) {
                                final StringBuilder sb4 = new StringBuilder();
                                sb4.append("  Filter matched!  match=0x");
                                sb4.append(Integer.toHexString(match));
                                Log.v("LocalBroadcastManager", sb4.toString());
                            }
                            if (list2 == null) {
                                list = new ArrayList<c>();
                            }
                            else {
                                list = list2;
                            }
                            list.add(e);
                            e.c = true;
                        }
                        else if (b) {
                            String str;
                            if (match != -4) {
                                if (match != -3) {
                                    if (match != -2) {
                                        if (match != -1) {
                                            str = "unknown reason";
                                        }
                                        else {
                                            str = "type";
                                        }
                                    }
                                    else {
                                        str = "data";
                                    }
                                }
                                else {
                                    str = "action";
                                }
                            }
                            else {
                                str = "category";
                            }
                            final StringBuilder sb5 = new StringBuilder();
                            sb5.append("  Filter did not match: ");
                            sb5.append(str);
                            Log.v("LocalBroadcastManager", sb5.toString());
                        }
                    }
                }
                if (list != null) {
                    for (int j = 0; j < list.size(); ++j) {
                        list.get(j).c = false;
                    }
                    this.d.add(new b(obj, list));
                    if (!this.e.hasMessages(1)) {
                        this.e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
    
    public void e(@j0 final Intent intent) {
        if (this.d(intent)) {
            this.a();
        }
    }
    
    public void f(@j0 final BroadcastReceiver key) {
        synchronized (this.b) {
            final ArrayList<c> list = this.b.remove(key);
            if (list == null) {
                return;
            }
            for (int i = list.size() - 1; i >= 0; --i) {
                final c c = list.get(i);
                c.d = true;
                for (int j = 0; j < c.a.countActions(); ++j) {
                    final String action = c.a.getAction(j);
                    final ArrayList<c> list2 = this.c.get(action);
                    if (list2 != null) {
                        for (int k = list2.size() - 1; k >= 0; --k) {
                            final c c2 = list2.get(k);
                            if (c2.b == key) {
                                c2.d = true;
                                list2.remove(k);
                            }
                        }
                        if (list2.size() <= 0) {
                            this.c.remove(action);
                        }
                    }
                }
            }
        }
    }
    
    private static final class b
    {
        final Intent a;
        final ArrayList<c> b;
        
        b(final Intent a, final ArrayList<c> b) {
            this.a = a;
            this.b = b;
        }
    }
    
    private static final class c
    {
        final IntentFilter a;
        final BroadcastReceiver b;
        boolean c;
        boolean d;
        
        c(final IntentFilter a, final BroadcastReceiver b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }
}
