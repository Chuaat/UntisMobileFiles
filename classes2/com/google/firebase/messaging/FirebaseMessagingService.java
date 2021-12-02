// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.messaging;

import androidx.annotation.c1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;
import androidx.annotation.j0;

public class FirebaseMessagingService extends h
{
    @j0
    public static final String L = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    private static final Queue<String> M;
    
    static {
        M = new ArrayDeque<String>(10);
    }
    
    private boolean j(String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final Queue<String> m = FirebaseMessagingService.M;
        if (m.contains(s)) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                s = String.valueOf(s);
                if (s.length() != 0) {
                    s = "Received duplicate message: ".concat(s);
                }
                else {
                    s = new String("Received duplicate message: ");
                }
                Log.d("FirebaseMessaging", s);
            }
            return true;
        }
        if (m.size() >= 10) {
            m.remove();
        }
        m.add(s);
        return false;
    }
    
    private void k(final Intent intent) {
        Bundle extras;
        if ((extras = intent.getExtras()) == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (n0.v(extras)) {
            final n0 n0 = new n0(extras);
            final ExecutorService d = q.d();
            final d d2 = new d((Context)this, n0, d);
            try {
                final boolean a = d2.a();
                d.shutdown();
                if (a) {
                    return;
                }
                if (l0.B(intent)) {
                    l0.t(intent);
                }
            }
            finally {
                d.shutdown();
            }
        }
        this.o(new p0(extras));
    }
    
    private String l(final Intent intent) {
        final String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }
    
    private void m(final Intent intent) {
        if (!this.j(intent.getStringExtra("google.message_id"))) {
            this.s(intent);
        }
    }
    
    private void s(final Intent intent) {
        String stringExtra;
        if ((stringExtra = intent.getStringExtra("message_type")) == null) {
            stringExtra = "gcm";
        }
        int n = 0;
        Label_0130: {
            switch (stringExtra.hashCode()) {
                case 814800675: {
                    if (stringExtra.equals("send_event")) {
                        n = 2;
                        break Label_0130;
                    }
                    break;
                }
                case 814694033: {
                    if (stringExtra.equals("send_error")) {
                        n = 3;
                        break Label_0130;
                    }
                    break;
                }
                case 102161: {
                    if (stringExtra.equals("gcm")) {
                        n = 0;
                        break Label_0130;
                    }
                    break;
                }
                case -2062414158: {
                    if (stringExtra.equals("deleted_messages")) {
                        n = 1;
                        break Label_0130;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            l0.v(intent);
            this.k(intent);
            return;
        }
        if (n == 1) {
            this.n();
            return;
        }
        if (n == 2) {
            this.p(intent.getStringExtra("google.message_id"));
            return;
        }
        if (n != 3) {
            String concat;
            if (stringExtra.length() != 0) {
                concat = "Received message with unknown type: ".concat(stringExtra);
            }
            else {
                concat = new String("Received message with unknown type: ");
            }
            Log.w("FirebaseMessaging", concat);
            return;
        }
        this.r(this.l(intent), new t0(intent.getStringExtra("error")));
    }
    
    @j0
    @Override
    protected Intent c(@j0 final Intent intent) {
        return u0.b().c();
    }
    
    @Override
    public void d(@j0 final Intent intent) {
        final String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            this.m(intent);
            return;
        }
        if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            this.q(intent.getStringExtra("token"));
            return;
        }
        final String value = String.valueOf(intent.getAction());
        String concat;
        if (value.length() != 0) {
            concat = "Unknown intent action: ".concat(value);
        }
        else {
            concat = new String("Unknown intent action: ");
        }
        Log.d("FirebaseMessaging", concat);
    }
    
    @c1
    public void n() {
    }
    
    @c1
    public void o(@j0 final p0 p) {
    }
    
    @c1
    public void p(@j0 final String s) {
    }
    
    @c1
    public void q(@j0 final String s) {
    }
    
    @c1
    public void r(@j0 final String s, @j0 final Exception ex) {
    }
}
