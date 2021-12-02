// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity.result.contract;

import android.graphics.Bitmap;
import androidx.activity.result.f;
import java.util.HashMap;
import androidx.core.content.d;
import java.util.Map;
import android.os.Parcelable;
import android.os.Build$VERSION;
import android.content.ClipData;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import androidx.annotation.k0;
import androidx.annotation.i;
import android.content.Intent;
import androidx.annotation.j0;
import android.content.Context;
import android.annotation.TargetApi;
import android.net.Uri;

public final class b
{
    private b() {
    }
    
    @TargetApi(19)
    public static class a extends androidx.activity.result.contract.a<String, Uri>
    {
        @androidx.annotation.i
        @j0
        public Intent d(@j0 final Context context, @j0 final String s) {
            return new Intent("android.intent.action.CREATE_DOCUMENT").setType("*/*").putExtra("android.intent.extra.TITLE", s);
        }
        
        @k0
        public final androidx.activity.result.contract.a.a<Uri> e(@j0 final Context context, @j0 final String s) {
            return null;
        }
        
        @k0
        public final Uri f(final int n, @k0 final Intent intent) {
            if (intent != null && n == -1) {
                return intent.getData();
            }
            return null;
        }
    }
    
    public static class b extends a<String, Uri>
    {
        @androidx.annotation.i
        @j0
        public Intent d(@j0 final Context context, @j0 final String type) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(type);
        }
        
        @k0
        public final a<Uri> e(@j0 final Context context, @j0 final String s) {
            return null;
        }
        
        @k0
        public final Uri f(final int n, @k0 final Intent intent) {
            if (intent != null && n == -1) {
                return intent.getData();
            }
            return null;
        }
    }
    
    @TargetApi(18)
    public static class c extends a<String, List<Uri>>
    {
        @j0
        static List<Uri> e(@j0 final Intent intent) {
            final LinkedHashSet<Uri> c = new LinkedHashSet<Uri>();
            if (intent.getData() != null) {
                c.add(intent.getData());
            }
            final ClipData clipData = intent.getClipData();
            if (clipData == null && c.isEmpty()) {
                return Collections.emptyList();
            }
            if (clipData != null) {
                for (int i = 0; i < clipData.getItemCount(); ++i) {
                    final Uri uri = clipData.getItemAt(i).getUri();
                    if (uri != null) {
                        c.add(uri);
                    }
                }
            }
            return new ArrayList<Uri>(c);
        }
        
        @androidx.annotation.i
        @j0
        public Intent d(@j0 final Context context, @j0 final String type) {
            return new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(type).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        
        @k0
        public final a<List<Uri>> f(@j0 final Context context, @j0 final String s) {
            return null;
        }
        
        @j0
        public final List<Uri> g(final int n, @k0 final Intent intent) {
            if (intent != null && n == -1) {
                return e(intent);
            }
            return Collections.emptyList();
        }
    }
    
    @TargetApi(19)
    public static class d extends a<String[], Uri>
    {
        @androidx.annotation.i
        @j0
        public Intent d(@j0 final Context context, @j0 final String[] array) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", array).setType("*/*");
        }
        
        @k0
        public final a<Uri> e(@j0 final Context context, @j0 final String[] array) {
            return null;
        }
        
        @k0
        public final Uri f(final int n, @k0 final Intent intent) {
            if (intent != null && n == -1) {
                return intent.getData();
            }
            return null;
        }
    }
    
    @TargetApi(21)
    public static class e extends a<Uri, Uri>
    {
        @androidx.annotation.i
        @j0
        public Intent d(@j0 final Context context, @k0 final Uri uri) {
            final Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build$VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", (Parcelable)uri);
            }
            return intent;
        }
        
        @k0
        public final a<Uri> e(@j0 final Context context, @k0 final Uri uri) {
            return null;
        }
        
        @k0
        public final Uri f(final int n, @k0 final Intent intent) {
            if (intent != null && n == -1) {
                return intent.getData();
            }
            return null;
        }
    }
    
    @TargetApi(19)
    public static class f extends a<String[], List<Uri>>
    {
        @androidx.annotation.i
        @j0
        public Intent d(@j0 final Context context, @j0 final String[] array) {
            return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", array).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
        }
        
        @k0
        public final a<List<Uri>> e(@j0 final Context context, @j0 final String[] array) {
            return null;
        }
        
        @j0
        public final List<Uri> f(final int n, @k0 final Intent intent) {
            if (n == -1 && intent != null) {
                return c.e(intent);
            }
            return Collections.emptyList();
        }
    }
    
    public static final class g extends a<Void, Uri>
    {
        @j0
        public Intent d(@j0 final Context context, @k0 final Void void1) {
            return new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
        }
        
        @k0
        public Uri e(final int n, @k0 final Intent intent) {
            if (intent != null && n == -1) {
                return intent.getData();
            }
            return null;
        }
    }
    
    public static final class h extends a<String[], Map<String, Boolean>>
    {
        public static final String a = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        public static final String b = "androidx.activity.result.contract.extra.PERMISSIONS";
        public static final String c = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";
        
        @j0
        static Intent e(@j0 final String[] array) {
            return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array);
        }
        
        @j0
        public Intent d(@j0 final Context context, @j0 final String[] array) {
            return e(array);
        }
        
        @k0
        public a<Map<String, Boolean>> f(@j0 final Context context, @k0 final String[] array) {
            if (array == null || array.length == 0) {
                return (a<Map<String, Boolean>>)new a(Collections.emptyMap());
            }
            final androidx.collection.a<String, Boolean> a = new androidx.collection.a<String, Boolean>();
            final int length = array.length;
            int i = 0;
            boolean b = true;
            while (i < length) {
                final String s = array[i];
                final boolean b2 = androidx.core.content.d.a(context, s) == 0;
                a.put(s, b2);
                if (!b2) {
                    b = false;
                }
                ++i;
            }
            if (b) {
                return (a<Map<String, Boolean>>)new a(a);
            }
            return null;
        }
        
        @j0
        public Map<String, Boolean> g(int i, @k0 final Intent intent) {
            if (i != -1) {
                return Collections.emptyMap();
            }
            if (intent == null) {
                return Collections.emptyMap();
            }
            final String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            final int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                final HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
                int length;
                for (length = stringArrayExtra.length, i = 0; i < length; ++i) {
                    hashMap.put(stringArrayExtra[i], intArrayExtra[i] == 0);
                }
                return hashMap;
            }
            return Collections.emptyMap();
        }
    }
    
    public static final class i extends a<String, Boolean>
    {
        @j0
        public Intent d(@j0 final Context context, @j0 final String s) {
            return h.e(new String[] { s });
        }
        
        @k0
        public a<Boolean> e(@j0 final Context context, @k0 final String s) {
            if (s == null) {
                return (a<Boolean>)new a(Boolean.FALSE);
            }
            if (androidx.core.content.d.a(context, s) == 0) {
                return (a<Boolean>)new a(Boolean.TRUE);
            }
            return null;
        }
        
        @j0
        public Boolean f(final int n, @k0 final Intent intent) {
            if (intent == null || n != -1) {
                return Boolean.FALSE;
            }
            final int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && intArrayExtra.length != 0) {
                boolean b = false;
                if (intArrayExtra[0] == 0) {
                    b = true;
                }
                return b;
            }
            return Boolean.FALSE;
        }
    }
    
    public static final class j extends a<Intent, androidx.activity.result.a>
    {
        public static final String a = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
        
        @j0
        public Intent d(@j0 final Context context, @j0 final Intent intent) {
            return intent;
        }
        
        @j0
        public androidx.activity.result.a e(final int n, @k0 final Intent intent) {
            return new androidx.activity.result.a(n, intent);
        }
    }
    
    public static final class k extends a<androidx.activity.result.f, androidx.activity.result.a>
    {
        public static final String a = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        public static final String b = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        public static final String c = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";
        
        @j0
        public Intent d(@j0 final Context context, @j0 final androidx.activity.result.f f) {
            return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)f);
        }
        
        @j0
        public androidx.activity.result.a e(final int n, @k0 final Intent intent) {
            return new androidx.activity.result.a(n, intent);
        }
    }
    
    public static class l extends a<Uri, Boolean>
    {
        @androidx.annotation.i
        @j0
        public Intent d(@j0 final Context context, @j0 final Uri uri) {
            return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", (Parcelable)uri);
        }
        
        @k0
        public final a<Boolean> e(@j0 final Context context, @j0 final Uri uri) {
            return null;
        }
        
        @j0
        public final Boolean f(final int n, @k0 final Intent intent) {
            return n == -1;
        }
    }
    
    public static class m extends a<Void, Bitmap>
    {
        @androidx.annotation.i
        @j0
        public Intent d(@j0 final Context context, @k0 final Void void1) {
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }
        
        @k0
        public final a<Bitmap> e(@j0 final Context context, @k0 final Void void1) {
            return null;
        }
        
        @k0
        public final Bitmap f(final int n, @k0 final Intent intent) {
            if (intent != null && n == -1) {
                return (Bitmap)intent.getParcelableExtra("data");
            }
            return null;
        }
    }
    
    public static class n extends a<Uri, Bitmap>
    {
        @androidx.annotation.i
        @j0
        public Intent d(@j0 final Context context, @j0 final Uri uri) {
            return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", (Parcelable)uri);
        }
        
        @k0
        public final a<Bitmap> e(@j0 final Context context, @j0 final Uri uri) {
            return null;
        }
        
        @k0
        public final Bitmap f(final int n, @k0 final Intent intent) {
            if (intent != null && n == -1) {
                return (Bitmap)intent.getParcelableExtra("data");
            }
            return null;
        }
    }
}
