// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.accounts.AuthenticatorException;
import java.io.IOException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import android.accounts.AccountManagerCallback;
import android.accounts.Account;
import androidx.core.content.d;
import androidx.annotation.c1;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import android.accounts.AccountManager;

public final class o extends u5
{
    private long c;
    private String d;
    private AccountManager e;
    private Boolean f;
    private long g;
    
    o(final z4 z4) {
        super(z4);
    }
    
    @Override
    protected final boolean g() {
        final Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(instance.get(15) + instance.get(16), TimeUnit.MILLISECONDS);
        final Locale default1 = Locale.getDefault();
        final String language = default1.getLanguage();
        final Locale english = Locale.ENGLISH;
        final String lowerCase = language.toLowerCase(english);
        final String lowerCase2 = default1.getCountry().toLowerCase(english);
        final StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.d = sb.toString();
        return false;
    }
    
    @c1
    final long l() {
        this.e();
        return this.g;
    }
    
    public final long m() {
        this.h();
        return this.c;
    }
    
    public final String n() {
        this.h();
        return this.d;
    }
    
    @c1
    final void o() {
        this.e();
        this.f = null;
        this.g = 0L;
    }
    
    @c1
    final boolean p() {
        this.e();
        final long a = super.a.F().a();
        if (a - this.g > 86400000L) {
            this.f = null;
        }
        Object f = this.f;
        if (f == null) {
            Label_0074: {
                if (androidx.core.content.d.a(super.a.X(), "android.permission.GET_ACCOUNTS") != 0) {
                    super.a.c().v().a("Permission error checking for dasher/unicorn accounts");
                }
                else {
                    if (this.e == null) {
                        this.e = AccountManager.get(super.a.X());
                    }
                    try {
                        f = this.e.getAccountsByTypeAndFeatures("com.google", new String[] { "service_HOSTED" }, (AccountManagerCallback)null, (Handler)null).getResult();
                        if (f != null && f.length > 0) {
                            this.f = Boolean.TRUE;
                            this.g = a;
                            return true;
                        }
                        f = this.e.getAccountsByTypeAndFeatures("com.google", new String[] { "service_uca" }, (AccountManagerCallback)null, (Handler)null).getResult();
                        if (f != null && f.length > 0) {
                            this.f = Boolean.TRUE;
                            this.g = a;
                            return true;
                        }
                        break Label_0074;
                    }
                    catch (OperationCanceledException f) {}
                    catch (IOException f) {}
                    catch (AuthenticatorException ex) {}
                    super.a.c().q().b("Exception checking account types", f);
                }
            }
            this.g = a;
            this.f = Boolean.FALSE;
            return false;
        }
        return (boolean)f;
    }
}
