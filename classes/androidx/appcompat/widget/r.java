// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.text.Selection;
import android.text.Spannable;
import androidx.annotation.p0;
import androidx.annotation.k0;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.ClipboardManager;
import android.app.Activity;
import android.widget.TextView;
import android.view.DragEvent;
import android.content.ClipData;
import android.content.ClipData$Item;
import android.util.Log;
import android.os.Parcelable;
import android.view.inputmethod.InputContentInfo;
import android.os.Build$VERSION;
import android.os.Bundle;
import androidx.core.view.inputmethod.c;
import androidx.core.view.inputmethod.b;
import androidx.annotation.j0;
import android.view.View;

final class r
{
    private static final String a = "ReceiveContent";
    private static final String b = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    
    private r() {
    }
    
    @j0
    static androidx.core.view.inputmethod.b.c a(@j0 final View view) {
        return new androidx.core.view.inputmethod.b.c() {
            @Override
            public boolean a(final androidx.core.view.inputmethod.c c, final int n, Bundle bundle) {
                final int sdk_INT = Build$VERSION.SDK_INT;
                boolean b = false;
                Bundle bundle2 = bundle;
                if (sdk_INT >= 25) {
                    bundle2 = bundle;
                    if ((n & 0x1) != 0x0) {
                        try {
                            c.e();
                            final InputContentInfo inputContentInfo = (InputContentInfo)c.f();
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            else {
                                bundle = new Bundle(bundle);
                            }
                            bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", (Parcelable)inputContentInfo);
                            bundle2 = bundle;
                        }
                        catch (Exception ex) {
                            Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", (Throwable)ex);
                            return false;
                        }
                    }
                }
                if (androidx.core.view.j0.k1(view, new androidx.core.view.c.a(new ClipData(c.b(), new ClipData$Item(c.a())), 2).e(c.c()).c(bundle2).a()) == null) {
                    b = true;
                }
                return b;
            }
        };
    }
    
    static boolean b(@j0 final View obj, @j0 final DragEvent dragEvent) {
        if (Build$VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null) {
            if (androidx.core.view.j0.f0(obj) != null) {
                final Activity d = d(obj);
                if (d == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't handle drop: no activity: view=");
                    sb.append(obj);
                    Log.i("ReceiveContent", sb.toString());
                    return false;
                }
                if (dragEvent.getAction() == 1) {
                    return obj instanceof TextView ^ true;
                }
                if (dragEvent.getAction() == 3) {
                    boolean b;
                    if (obj instanceof TextView) {
                        b = r.b.a(dragEvent, (TextView)obj, d);
                    }
                    else {
                        b = r.b.b(dragEvent, obj, d);
                    }
                    return b;
                }
            }
        }
        return false;
    }
    
    static boolean c(@j0 final TextView textView, int n) {
        final int n2 = 0;
        if ((n != 16908322 && n != 16908337) || androidx.core.view.j0.f0((View)textView) == null) {
            return false;
        }
        final ClipboardManager clipboardManager = (ClipboardManager)textView.getContext().getSystemService("clipboard");
        ClipData primaryClip;
        if (clipboardManager == null) {
            primaryClip = null;
        }
        else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            final androidx.core.view.c.a a = new androidx.core.view.c.a(primaryClip, 1);
            if (n == 16908322) {
                n = n2;
            }
            else {
                n = 1;
            }
            androidx.core.view.j0.k1((View)textView, a.d(n).a());
        }
        return true;
    }
    
    @k0
    static Activity d(@j0 final View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity)context;
            }
        }
        return null;
    }
    
    @p0(24)
    private static final class b
    {
        static boolean a(@j0 final DragEvent dragEvent, @j0 final TextView textView, @j0 final Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            final int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable)textView.getText(), offsetForPosition);
                androidx.core.view.j0.k1((View)textView, new androidx.core.view.c.a(dragEvent.getClipData(), 3).a());
                return true;
            }
            finally {
                textView.endBatchEdit();
            }
        }
        
        static boolean b(@j0 final DragEvent dragEvent, @j0 final View view, @j0 final Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            androidx.core.view.j0.k1(view, new androidx.core.view.c.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }
}
