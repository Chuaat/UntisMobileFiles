// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import java.util.Collection;
import java.util.List;
import android.os.Parcelable;
import java.io.Serializable;
import com.google.android.gms.common.internal.x;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import androidx.annotation.k0;
import android.accounts.Account;

public final class a
{
    private a() {
    }
    
    @Deprecated
    @RecentlyNonNull
    public static Intent a(@k0 final Account account, @k0 final ArrayList<Account> list, @k0 final String[] array, @RecentlyNonNull final boolean b, @k0 final String s, @k0 final String s2, @k0 final String[] array2, @k0 final Bundle bundle) {
        final Intent intent = new Intent();
        x.b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", (Serializable)list);
        intent.putExtra("allowableAccountTypes", array);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", (Parcelable)account);
        intent.putExtra("alwaysPromptForAccount", b);
        intent.putExtra("descriptionTextOverride", s);
        intent.putExtra("authTokenType", s2);
        intent.putExtra("addAccountRequiredFeatures", array2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String)null);
        return intent;
    }
    
    @RecentlyNonNull
    public static Intent b(@RecentlyNonNull final a a) {
        final Intent intent = new Intent();
        x.b(true, "We only support hostedDomain filter for account chip styled account picker");
        x.b(true, "Consent is only valid for account chip styled account picker");
        x.b(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", (Serializable)a.c);
        if (a.d != null) {
            intent.putExtra("allowableAccountTypes", (String[])a.d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", a.g);
        intent.putExtra("selectedAccount", (Parcelable)a.a);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", a.e);
        intent.putExtra("descriptionTextOverride", a.f);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("realClientPackage", (String)null);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String)null);
        final Bundle bundle = new Bundle();
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
    
    public static class a
    {
        @k0
        private Account a;
        private boolean b;
        @k0
        private ArrayList<Account> c;
        @k0
        private ArrayList<String> d;
        private boolean e;
        @k0
        private String f;
        @k0
        private Bundle g;
        private boolean h;
        private int i;
        @k0
        private String j;
        private boolean k;
        @k0
        private b l;
        @k0
        private String m;
        private boolean n;
        
        static /* synthetic */ int a(final a a, final int n) {
            return a.i = 0;
        }
        
        static /* synthetic */ b d(final a a, final b b) {
            return a.l = null;
        }
        
        static /* synthetic */ String e(final a a, final String s) {
            return a.j = null;
        }
        
        static /* synthetic */ String i(final a a, final String s) {
            return a.m = null;
        }
        
        static /* synthetic */ boolean l(final a a, final boolean b) {
            return a.b = false;
        }
        
        static /* synthetic */ boolean o(final a a, final boolean b) {
            return a.h = false;
        }
        
        static /* synthetic */ boolean q(final a a, final boolean b) {
            return a.k = false;
        }
        
        static /* synthetic */ boolean s(final a a, final boolean b) {
            return a.n = false;
        }
        
        public static class a
        {
            @k0
            private Account a;
            @k0
            private ArrayList<Account> b;
            @k0
            private ArrayList<String> c;
            private boolean d;
            @k0
            private String e;
            @k0
            private Bundle f;
            private boolean g;
            private int h;
            private boolean i;
            
            public a() {
                this.d = false;
                this.g = false;
                this.h = 0;
                this.i = false;
            }
            
            @RecentlyNonNull
            public com.google.android.gms.common.a.a a() {
                x.b(true, "We only support hostedDomain filter for account chip styled account picker");
                x.b(true, "Consent is only valid for account chip styled account picker");
                final com.google.android.gms.common.a.a a = new com.google.android.gms.common.a.a();
                a.d = this.c;
                a.c = this.b;
                a.e = this.d;
                com.google.android.gms.common.a.a.d(a, null);
                com.google.android.gms.common.a.a.e(a, null);
                a.g = this.f;
                a.a = this.a;
                com.google.android.gms.common.a.a.l(a, false);
                com.google.android.gms.common.a.a.o(a, false);
                com.google.android.gms.common.a.a.i(a, null);
                com.google.android.gms.common.a.a.a(a, 0);
                a.f = this.e;
                com.google.android.gms.common.a.a.q(a, false);
                com.google.android.gms.common.a.a.s(a, false);
                return a;
            }
            
            @RecentlyNonNull
            public a b(@k0 final List<Account> c) {
                ArrayList<Account> b;
                if (c == null) {
                    b = null;
                }
                else {
                    b = new ArrayList<Account>(c);
                }
                this.b = b;
                return this;
            }
            
            @RecentlyNonNull
            public a c(@k0 final List<String> c) {
                ArrayList<String> c2;
                if (c == null) {
                    c2 = null;
                }
                else {
                    c2 = new ArrayList<String>(c);
                }
                this.c = c2;
                return this;
            }
            
            @RecentlyNonNull
            public a d(@RecentlyNonNull final boolean d) {
                this.d = d;
                return this;
            }
            
            @RecentlyNonNull
            public a e(@k0 final Bundle f) {
                this.f = f;
                return this;
            }
            
            @RecentlyNonNull
            public a f(@k0 final Account a) {
                this.a = a;
                return this;
            }
            
            @RecentlyNonNull
            public a g(@k0 final String e) {
                this.e = e;
                return this;
            }
        }
        
        public static final class b
        {
        }
    }
}
