// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2.mock;

import java.util.concurrent.Executors;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import retrofit2.u;

public final class d
{
    private final u a;
    private final f b;
    private final ExecutorService c;
    
    d(final u a, final f b, final ExecutorService c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Executor a() {
        return this.c;
    }
    
    public <T> b<T> b(final Class<T> clazz) {
        return new b<T>(this.a, this.b, this.c, clazz);
    }
    
    public f c() {
        return this.b;
    }
    
    public u d() {
        return this.a;
    }
    
    public static final class a
    {
        private final u a;
        private f b;
        private ExecutorService c;
        
        public a(final u u) {
            Objects.requireNonNull(u, "retrofit == null");
            this.a = u;
        }
        
        public a a(final ExecutorService executorService) {
            Objects.requireNonNull(executorService, "executor == null");
            this.c = executorService;
            return this;
        }
        
        public d b() {
            if (this.b == null) {
                this.b = f.e();
            }
            if (this.c == null) {
                this.c = Executors.newCachedThreadPool();
            }
            return new d(this.a, this.b, this.c);
        }
        
        public a c(final f f) {
            Objects.requireNonNull(f, "behavior == null");
            this.b = f;
            return this;
        }
    }
}
