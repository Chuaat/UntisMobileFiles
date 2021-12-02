// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import java.util.concurrent.TimeUnit;
import androidx.annotation.j0;
import com.google.android.gms.tasks.m;
import java.util.concurrent.CountDownLatch;
import com.google.android.gms.tasks.f;

final class b implements f<Void>
{
    private final CountDownLatch a;
    
    b() {
        this.a = new CountDownLatch(1);
    }
    
    public void a(@j0 final m<Void> m) {
        this.a.countDown();
    }
    
    public boolean b(final long timeout, final TimeUnit unit) throws InterruptedException {
        return this.a.await(timeout, unit);
    }
    
    public void c() {
        this.a.countDown();
    }
}
