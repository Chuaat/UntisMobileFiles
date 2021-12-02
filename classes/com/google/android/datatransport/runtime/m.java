// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import z1.a;
import java.util.concurrent.Executor;

class m implements Executor
{
    private final Executor G;
    
    m(final Executor g) {
        this.G = g;
    }
    
    @Override
    public void execute(final Runnable runnable) {
        this.G.execute(new a(runnable));
    }
    
    static class a implements Runnable
    {
        private final Runnable G;
        
        a(final Runnable g) {
            this.G = g;
        }
        
        @Override
        public void run() {
            try {
                this.G.run();
            }
            catch (Exception ex) {
                z1.a.e("Executor", "Background execution failure.", ex);
            }
        }
    }
}
