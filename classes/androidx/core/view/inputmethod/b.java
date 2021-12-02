// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.inputmethod;

import android.net.Uri;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnectionWrapper;
import android.content.ClipDescription;
import android.os.Parcelable;
import android.view.inputmethod.InputContentInfo;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.j0;
import android.view.inputmethod.InputConnection;

public final class b
{
    private static final String a = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String b = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    private static final String c = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String d = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    private static final String e = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String f = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    private static final String g = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String h = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    private static final String i = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String j = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    private static final String k = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String l = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    private static final String m = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    private static final String n = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int o = 1;
    
    @Deprecated
    public b() {
    }
    
    public static boolean a(@j0 final InputConnection inputConnection, @j0 final EditorInfo editorInfo, @j0 final androidx.core.view.inputmethod.c c, final int n, @k0 final Bundle bundle) {
        final ClipDescription b = c.b();
        final String[] a = androidx.core.view.inputmethod.a.a(editorInfo);
        final int length = a.length;
        final int n2 = 0;
        int i = 0;
        while (true) {
            while (i < length) {
                if (b.hasMimeType(a[i])) {
                    final boolean b2 = true;
                    if (!b2) {
                        return false;
                    }
                    if (Build$VERSION.SDK_INT >= 25) {
                        return inputConnection.commitContent((InputContentInfo)c.f(), n, bundle);
                    }
                    final int e = androidx.core.view.inputmethod.a.e(editorInfo);
                    int n3;
                    if (e != 2) {
                        n3 = n2;
                        if (e != 3) {
                            n3 = n2;
                            if (e != 4) {
                                return false;
                            }
                        }
                    }
                    else {
                        n3 = 1;
                    }
                    final Bundle bundle2 = new Bundle();
                    String s;
                    if (n3 != 0) {
                        s = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                    }
                    else {
                        s = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
                    }
                    bundle2.putParcelable(s, (Parcelable)c.a());
                    String s2;
                    if (n3 != 0) {
                        s2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    }
                    else {
                        s2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                    }
                    bundle2.putParcelable(s2, (Parcelable)c.b());
                    String s3;
                    if (n3 != 0) {
                        s3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    }
                    else {
                        s3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                    }
                    bundle2.putParcelable(s3, (Parcelable)c.c());
                    String s4;
                    if (n3 != 0) {
                        s4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    }
                    else {
                        s4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                    }
                    bundle2.putInt(s4, n);
                    String s5;
                    if (n3 != 0) {
                        s5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    }
                    else {
                        s5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                    }
                    bundle2.putParcelable(s5, (Parcelable)bundle);
                    String s6;
                    if (n3 != 0) {
                        s6 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
                    }
                    else {
                        s6 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
                    }
                    return inputConnection.performPrivateCommand(s6, bundle2);
                }
                else {
                    ++i;
                }
            }
            final boolean b2 = false;
            continue;
        }
    }
    
    @j0
    public static InputConnection b(@j0 final InputConnection inputConnection, @j0 final EditorInfo editorInfo, @j0 final c c) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        }
        if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        }
        if (c == null) {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        }
        if (Build$VERSION.SDK_INT >= 25) {
            return (InputConnection)new InputConnectionWrapper(inputConnection, false) {
                public boolean commitContent(final InputContentInfo inputContentInfo, final int n, final Bundle bundle) {
                    return c.a(androidx.core.view.inputmethod.c.g(inputContentInfo), n, bundle) || super.commitContent(inputContentInfo, n, bundle);
                }
            };
        }
        if (androidx.core.view.inputmethod.a.a(editorInfo).length == 0) {
            return inputConnection;
        }
        return (InputConnection)new InputConnectionWrapper(inputConnection, false) {
            public boolean performPrivateCommand(final String s, final Bundle bundle) {
                return androidx.core.view.inputmethod.b.c(s, bundle, c) || super.performPrivateCommand(s, bundle);
            }
        };
    }
    
    static boolean c(@k0 String s, @j0 final Bundle bundle, @j0 final c c) {
        final int n = 0;
        if (bundle == null) {
            return false;
        }
        boolean b;
        if (TextUtils.equals((CharSequence)"androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", (CharSequence)s)) {
            b = false;
        }
        else {
            if (!TextUtils.equals((CharSequence)"android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", (CharSequence)s)) {
                return false;
            }
            b = true;
        }
        if (b) {
            s = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        }
        else {
            s = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        }
        ResultReceiver resultReceiver2;
        try {
            final ResultReceiver resultReceiver = (ResultReceiver)bundle.getParcelable(s);
            if (b) {
                s = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
            else {
                s = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
            try {
                final Uri uri = (Uri)bundle.getParcelable(s);
                if (b) {
                    s = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                else {
                    s = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                final ClipDescription clipDescription = (ClipDescription)bundle.getParcelable(s);
                if (b) {
                    s = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                else {
                    s = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                final Uri uri2 = (Uri)bundle.getParcelable(s);
                if (b) {
                    s = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                }
                else {
                    s = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                }
                final int int1 = bundle.getInt(s);
                if (b) {
                    s = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                else {
                    s = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                final Bundle bundle2 = (Bundle)bundle.getParcelable(s);
                int a = n;
                if (uri != null) {
                    a = n;
                    if (clipDescription != null) {
                        a = (c.a(new androidx.core.view.inputmethod.c(uri, clipDescription, uri2), int1, bundle2) ? 1 : 0);
                    }
                }
                if (resultReceiver != null) {
                    resultReceiver.send(a, (Bundle)null);
                }
                return a != 0;
            }
            finally {}
        }
        finally {
            resultReceiver2 = null;
        }
        if (resultReceiver2 != null) {
            resultReceiver2.send(0, (Bundle)null);
        }
    }
    
    public interface c
    {
        boolean a(final androidx.core.view.inputmethod.c p0, final int p1, final Bundle p2);
    }
}
