// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network;

import com.untis.mobile.api.common.JsonRpcErrorData;
import com.untis.mobile.api.common.JsonRpcErrorType;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import com.untis.mobile.api.error.JsonRpcError;
import com.untis.mobile.api.common.JsonRpcResponse;
import kotlin.coroutines.d;
import n6.l;
import com.untis.mobile.services.profile.legacy.j0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00072\"\u0010\f\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0084@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u00020\u000f8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/dashboard/network/a;", "", "", "serverTime", "m", "(Ljava/lang/Long;)J", "Result", "", "isFirstRun", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "Lcom/untis/mobile/api/common/JsonRpcResponse;", "request", "o", "(ZLn6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "a", "Lcom/untis/mobile/persistence/models/profile/Profile;", "n", "()Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public abstract class a
{
    @e
    private final Profile a;
    
    public a(@e final String s) {
        k0.p(s, "profileId");
        final Profile l = j0.G.l(s);
        if (l != null) {
            this.a = l;
            return;
        }
        throw new IllegalStateException("invalid profile");
    }
    
    private final long m(final Long n) {
        final long currentTimeMillis = System.currentTimeMillis();
        long longValue;
        if (n == null) {
            longValue = currentTimeMillis;
        }
        else {
            longValue = n;
        }
        return longValue - currentTimeMillis;
    }
    
    @e
    protected final Profile n() {
        return this.a;
    }
    
    @org.jetbrains.annotations.f
    protected final <Result> Object o(final boolean b, @e final l<? super d<? super JsonRpcResponse<Result>>, ?> l, @e final d<? super Result> d) throws JsonRpcError {
        return h.i((g)i1.c(), (p)new p<r0, d<? super Result>, Object>(null) {
            int G;
            private /* synthetic */ Object H;
            final /* synthetic */ l<kotlin.coroutines.d<? super JsonRpcResponse<Result>>, Object> I;
            final /* synthetic */ boolean J;
            final /* synthetic */ a K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object h, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                final p<r0, kotlin.coroutines.d<? super Result>, Object> p2 = new p<r0, kotlin.coroutines.d<? super Result>, Object>(d) {
                    int G;
                    private /* synthetic */ Object H;
                    final /* synthetic */ l<kotlin.coroutines.d<? super JsonRpcResponse<Result>>, Object> I = this.I;
                    final /* synthetic */ boolean J = this.J;
                    final /* synthetic */ a K = this.K;
                };
                p2.H = h;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Result> d) {
                return ((a$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0062: {
                    if (g == 0) {
                        break Label_0062;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final r0 r0 = (r0)this.H;
                    try {
                        c1.n(o);
                        final Object invoke = o;
                        r0 h2 = r0;
                        final JsonRpcResponse jsonRpcResponse;
                        Label_0059: {
                            jsonRpcResponse = (JsonRpcResponse)invoke;
                        }
                        final com.untis.mobile.api.common.JsonRpcError error = jsonRpcResponse.error;
                        if (error != null) {
                            final JsonRpcError jsonRpcError = new JsonRpcError(error.getJsonRpcErrorType());
                            if (b.a[jsonRpcError.getType().ordinal()] != 1) {
                                throw jsonRpcError;
                            }
                            if (!this.J) {
                                throw jsonRpcError;
                            }
                            final Profile n = this.K.n();
                            final a k = this.K;
                            final JsonRpcErrorData data = error.data;
                            Long g2;
                            if (data == null) {
                                g2 = null;
                            }
                            else {
                                g2 = kotlin.coroutines.jvm.internal.b.g(data.serverTime);
                            }
                            n.setSchoolServerDelta(k.m(g2));
                            kotlinx.coroutines.h.f(h2, (g)i1.c(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ a H;
                                
                                @org.jetbrains.annotations.e
                                @Override
                                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                        int G;
                                        final /* synthetic */ a H = this.H;
                                    };
                                }
                                
                                @org.jetbrains.annotations.f
                                @Override
                                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                                    return ((a$a$a)this.create(r0, d)).invokeSuspend(j2.a);
                                }
                                
                                @org.jetbrains.annotations.f
                                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                                    kotlin.coroutines.intrinsics.b.h();
                                    if (this.G == 0) {
                                        c1.n(o);
                                        j0.G.b(this.H.n());
                                        return j2.a;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }, 2, (Object)null);
                            final a i = this.K;
                            final l<kotlin.coroutines.d<? super JsonRpcResponse<Result>>, Object> j = this.I;
                            this.H = null;
                            this.G = 2;
                            if ((o = i.o(false, (l<? super kotlin.coroutines.d<? super JsonRpcResponse<Object>>, ?>)j, (kotlin.coroutines.d<? super Object>)this)) == h) {
                                return h;
                            }
                            return o;
                        }
                        else {
                            o = jsonRpcResponse.result;
                            if (o != null) {
                                return o;
                            }
                            throw new JsonRpcError(JsonRpcErrorType.NoResult);
                        }
                        return h;
                        c1.n(o);
                        h2 = (r0)this.H;
                        final l<kotlin.coroutines.d<? super JsonRpcResponse<Result>>, Object> l = this.I;
                        this.H = h2;
                        this.G = 1;
                        // iftrue(Label_0059:, invoke = l.invoke(this) != h)
                        return h;
                    }
                    catch (Exception ex) {
                        timber.log.b.g((Throwable)ex, "could not invoke network call", new Object[0]);
                        throw ex;
                    }
                }
            }
        }, (d)d);
    }
}
