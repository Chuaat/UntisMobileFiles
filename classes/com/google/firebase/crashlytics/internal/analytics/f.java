// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.analytics;

import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;

public class f implements a
{
    @Override
    public void a(@j0 final String s, @k0 final Bundle bundle) {
        com.google.firebase.crashlytics.internal.f.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
