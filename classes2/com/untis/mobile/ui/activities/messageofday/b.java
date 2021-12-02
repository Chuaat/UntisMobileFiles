// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.messageofday;

import android.view.View$OnClickListener;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.untis.mobile.c;
import com.untis.mobile.persistence.models.MessageOfDayKt;
import android.view.ViewGroup;
import com.untis.mobile.ui.activities.drive.DriveAttachmentListActivity;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import android.content.Intent;
import android.net.Uri;
import kotlin.text.s;
import org.jetbrains.annotations.f;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;
import kotlin.jvm.internal.k0;
import android.view.LayoutInflater;
import com.untis.mobile.persistence.models.MessageOfDay;
import java.util.List;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;
import android.widget.BaseAdapter;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J$\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016R\u001e\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#" }, d2 = { "Lcom/untis/mobile/ui/activities/messageofday/b;", "Landroid/widget/BaseAdapter;", "Landroid/webkit/WebViewClient;", "b", "", "Lcom/untis/mobile/persistence/models/drive/DriveAttachment;", "driveAttachments", "Lkotlin/j2;", "e", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Lcom/untis/mobile/persistence/models/MessageOfDay;", "c", "", "getItemId", "getCount", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/content/Context;", "G", "Landroid/content/Context;", "context", "H", "Ljava/util/List;", "messages", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b extends BaseAdapter
{
    @e
    private final Context G;
    @e
    private final List<MessageOfDay> H;
    private final LayoutInflater I;
    
    public b(@e final Context g, @e final List<MessageOfDay> h) {
        k0.p(g, "context");
        k0.p(h, "messages");
        this.G = g;
        this.H = h;
        this.I = LayoutInflater.from(g.getApplicationContext());
    }
    
    private final WebViewClient b() {
        return new WebViewClient() {
            public boolean shouldOverrideUrlLoading(@e final WebView webView, @f final String s) {
                k0.p(webView, "view");
                boolean b = false;
                if (s != null) {
                    if (!s.u2(s, "http://", false, 2, (Object)null)) {
                        b = b;
                        if (!s.u2(s, "https://", false, 2, (Object)null)) {
                            return b;
                        }
                    }
                    final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    intent.setFlags(268435456);
                    webView.getContext().startActivity(intent);
                    b = true;
                }
                return b;
            }
        };
    }
    
    private static final void d(final b b, final MessageOfDay messageOfDay, final View view) {
        k0.p(b, "this$0");
        k0.p(messageOfDay, "$messageOfDay");
        b.e(messageOfDay.getDriveAttachments());
    }
    
    private final void e(final List<DriveAttachment> list) {
        DriveAttachmentListActivity.s(this.G, list);
    }
    
    @e
    public MessageOfDay c(final int n) {
        return this.H.get(n);
    }
    
    public int getCount() {
        return this.H.size();
    }
    
    public long getItemId(final int n) {
        return this.H.get(n).getId();
    }
    
    @e
    public View getView(int n, @f final View view, @f final ViewGroup viewGroup) {
        final MessageOfDay c = this.c(n);
        View inflate = view;
        if (view == null) {
            inflate = this.I.inflate(2131493217, viewGroup, false);
        }
        final String escapedSubject = MessageOfDayKt.getEscapedSubject(c);
        final String escapedText = MessageOfDayKt.getEscapedText(c);
        n = com.untis.mobile.c.i.oz;
        ((WebView)inflate.findViewById(n)).setWebViewClient(this.b());
        ((WebView)inflate.findViewById(n)).loadData(escapedSubject, "text/html; charset=utf-8", "UTF-8");
        if (!k0.g(escapedSubject, escapedText)) {
            n = com.untis.mobile.c.i.pz;
            ((WebView)inflate.findViewById(n)).setWebViewClient(this.b());
            ((WebView)inflate.findViewById(n)).loadData(escapedText, "text/html; charset=utf-8", "UTF-8");
            ((WebView)inflate.findViewById(n)).setVisibility(0);
        }
        else {
            ((WebView)inflate.findViewById(com.untis.mobile.c.i.pz)).setVisibility(8);
        }
        if (c.getDriveAttachments().isEmpty() ^ true) {
            n = com.untis.mobile.c.i.nz;
            ((ViewGroup)inflate.findViewById(n)).setOnClickListener((View$OnClickListener)new a(this, c));
            ((ViewGroup)inflate.findViewById(n)).setVisibility(0);
        }
        else {
            ((ViewGroup)inflate.findViewById(com.untis.mobile.c.i.nz)).setVisibility(8);
        }
        k0.o(inflate, "view");
        return inflate;
    }
}
