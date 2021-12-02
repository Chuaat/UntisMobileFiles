// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.d;
import java.lang.reflect.Field;
import kotlin.jvm.internal.f1;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Set;
import kotlin.jvm.internal.k0;
import kotlin.collections.j1;
import kotlin.jvm.internal.v0;
import kotlin.reflect.h;
import kotlin.jvm.internal.w0;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.e;
import kotlin.reflect.o;

public final class g implements f
{
    static final /* synthetic */ o<Object>[] X;
    @e
    private final kotlin.properties.f A;
    @e
    private final kotlin.properties.f B;
    @e
    private final kotlin.properties.f C;
    @e
    private final kotlin.properties.f D;
    @e
    private final kotlin.properties.f E;
    @e
    private final kotlin.properties.f F;
    @e
    private final kotlin.properties.f G;
    @e
    private final kotlin.properties.f H;
    @e
    private final kotlin.properties.f I;
    @e
    private final kotlin.properties.f J;
    @e
    private final kotlin.properties.f K;
    @e
    private final kotlin.properties.f L;
    @e
    private final kotlin.properties.f M;
    @e
    private final kotlin.properties.f N;
    @e
    private final kotlin.properties.f O;
    @e
    private final kotlin.properties.f P;
    @e
    private final kotlin.properties.f Q;
    @e
    private final kotlin.properties.f R;
    @e
    private final kotlin.properties.f S;
    @e
    private final kotlin.properties.f T;
    @e
    private final kotlin.properties.f U;
    @e
    private final kotlin.properties.f V;
    @e
    private final kotlin.properties.f W;
    private boolean a;
    @e
    private final kotlin.properties.f b;
    @e
    private final kotlin.properties.f c;
    @e
    private final kotlin.properties.f d;
    @e
    private final kotlin.properties.f e;
    @e
    private final kotlin.properties.f f;
    @e
    private final kotlin.properties.f g;
    @e
    private final kotlin.properties.f h;
    @e
    private final kotlin.properties.f i;
    @e
    private final kotlin.properties.f j;
    @e
    private final kotlin.properties.f k;
    @e
    private final kotlin.properties.f l;
    @e
    private final kotlin.properties.f m;
    @e
    private final kotlin.properties.f n;
    @e
    private final kotlin.properties.f o;
    @e
    private final kotlin.properties.f p;
    @e
    private final kotlin.properties.f q;
    @e
    private final kotlin.properties.f r;
    @e
    private final kotlin.properties.f s;
    @e
    private final kotlin.properties.f t;
    @e
    private final kotlin.properties.f u;
    @e
    private final kotlin.properties.f v;
    @e
    private final kotlin.properties.f w;
    @e
    private final kotlin.properties.f x;
    @e
    private final kotlin.properties.f y;
    @e
    private final kotlin.properties.f z;
    
    static {
        X = new o[] { (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "withDefinedIn", "getWithDefinedIn()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "modifiers", "getModifiers()Ljava/util/Set;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "startFromName", "getStartFromName()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "debugMode", "getDebugMode()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "verbose", "getVerbose()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "unitReturnType", "getUnitReturnType()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "withoutReturnType", "getWithoutReturnType()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "enhancedTypes", "getEnhancedTypes()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderDefaultModality", "getRenderDefaultModality()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "receiverAfterName", "getReceiverAfterName()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), (o)k1.j((v0)new w0((h)k1.d((Class)g.class), "informativeErrorType", "getInformativeErrorType()Z")) };
    }
    
    public g() {
        this.b = this.o0(kotlin.reflect.jvm.internal.impl.renderer.b.c.a);
        final Boolean true = Boolean.TRUE;
        this.c = this.o0(true);
        this.d = this.o0(true);
        this.e = this.o0(kotlin.reflect.jvm.internal.impl.renderer.e.I);
        final Boolean false = Boolean.FALSE;
        this.f = this.o0(false);
        this.g = this.o0(false);
        this.h = this.o0(false);
        this.i = this.o0(false);
        this.j = this.o0(false);
        this.k = this.o0(true);
        this.l = this.o0(false);
        this.m = this.o0(false);
        this.n = this.o0(false);
        this.o = this.o0(true);
        this.p = this.o0(true);
        this.q = this.o0(false);
        this.r = this.o0(false);
        this.s = this.o0(false);
        this.t = this.o0(false);
        this.u = this.o0(false);
        this.v = this.o0(false);
        this.w = this.o0(false);
        this.x = this.o0(g$c.G);
        this.y = this.o0(g$a.G);
        this.z = this.o0(true);
        this.A = this.o0(kotlin.reflect.jvm.internal.impl.renderer.j.H);
        this.B = this.o0(kotlin.reflect.jvm.internal.impl.renderer.c.l.a.a);
        this.C = this.o0(kotlin.reflect.jvm.internal.impl.renderer.m.G);
        this.D = this.o0(kotlin.reflect.jvm.internal.impl.renderer.k.G);
        this.E = this.o0(false);
        this.F = this.o0(false);
        this.G = this.o0(kotlin.reflect.jvm.internal.impl.renderer.l.H);
        this.H = this.o0(false);
        this.I = this.o0(false);
        this.J = this.o0(j1.k());
        this.K = this.o0(kotlin.reflect.jvm.internal.impl.renderer.h.a.a());
        this.L = this.o0((Object)null);
        this.M = this.o0(kotlin.reflect.jvm.internal.impl.renderer.a.I);
        this.N = this.o0(false);
        this.O = this.o0(true);
        this.P = this.o0(true);
        this.Q = this.o0(false);
        this.R = this.o0(true);
        this.S = this.o0(true);
        this.T = this.o0(false);
        this.U = this.o0(false);
        this.V = this.o0(false);
        this.W = this.o0(true);
    }
    
    private final <T> kotlin.properties.f<g, T> o0(final T t) {
        final kotlin.properties.a a = kotlin.properties.a.a;
        return (kotlin.properties.f<g, T>)new kotlin.properties.c<T>() {
            final /* synthetic */ g c;
            
            protected boolean d(@e final o<?> o, final T t, final T t2) {
                k0.p((Object)o, "property");
                if (!this.c.m0()) {
                    return true;
                }
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
        };
    }
    
    public boolean A() {
        return (boolean)this.I.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[33]);
    }
    
    @e
    public Set<kotlin.reflect.jvm.internal.impl.name.b> B() {
        return (Set<kotlin.reflect.jvm.internal.impl.name.b>)this.J.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[34]);
    }
    
    public boolean C() {
        return (boolean)this.R.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[42]);
    }
    
    public boolean D() {
        return kotlin.reflect.jvm.internal.impl.renderer.f.a.a(this);
    }
    
    public boolean E() {
        return kotlin.reflect.jvm.internal.impl.renderer.f.a.b(this);
    }
    
    public boolean F() {
        return (boolean)this.u.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[19]);
    }
    
    public boolean G() {
        return (boolean)this.W.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[47]);
    }
    
    @e
    public Set<kotlin.reflect.jvm.internal.impl.renderer.e> H() {
        return (Set<kotlin.reflect.jvm.internal.impl.renderer.e>)this.e.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[3]);
    }
    
    public boolean I() {
        return (boolean)this.n.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[12]);
    }
    
    @e
    public j J() {
        return (j)this.A.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[25]);
    }
    
    @e
    public k K() {
        return (k)this.D.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[28]);
    }
    
    public boolean L() {
        return (boolean)this.S.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[43]);
    }
    
    public boolean M() {
        return (boolean)this.U.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[45]);
    }
    
    @e
    public l N() {
        return (l)this.G.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[31]);
    }
    
    public boolean O() {
        return (boolean)this.E.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[29]);
    }
    
    public boolean P() {
        return (boolean)this.F.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[30]);
    }
    
    public boolean Q() {
        return (boolean)this.q.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[15]);
    }
    
    public boolean R() {
        return (boolean)this.O.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[39]);
    }
    
    public boolean S() {
        return (boolean)this.H.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[32]);
    }
    
    public boolean T() {
        return (boolean)this.p.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[14]);
    }
    
    public boolean U() {
        return (boolean)this.o.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[13]);
    }
    
    public boolean V() {
        return (boolean)this.r.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[16]);
    }
    
    public boolean W() {
        return (boolean)this.Q.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[41]);
    }
    
    public boolean X() {
        return (boolean)this.P.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[40]);
    }
    
    public boolean Y() {
        return (boolean)this.z.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[24]);
    }
    
    public boolean Z() {
        return (boolean)this.g.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[5]);
    }
    
    @Override
    public void a(@e final Set<kotlin.reflect.jvm.internal.impl.name.b> set) {
        k0.p((Object)set, "<set-?>");
        this.K.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[35], (Object)set);
    }
    
    public boolean a0() {
        return (boolean)this.f.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[4]);
    }
    
    @Override
    public void b(final boolean b) {
        this.f.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[4], (Object)b);
    }
    
    @e
    public m b0() {
        return (m)this.C.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[27]);
    }
    
    @Override
    public void c(@e final Set<? extends kotlin.reflect.jvm.internal.impl.renderer.e> set) {
        k0.p((Object)set, "<set-?>");
        this.e.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[3], (Object)set);
    }
    
    @e
    public n6.l<c0, c0> c0() {
        return (n6.l<c0, c0>)this.x.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[22]);
    }
    
    @Override
    public void d(@e final k k) {
        k0.p((Object)k, "<set-?>");
        this.D.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[28], (Object)k);
    }
    
    public boolean d0() {
        return (boolean)this.t.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[18]);
    }
    
    @Override
    public void e(final boolean b) {
        this.c.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[1], (Object)b);
    }
    
    public boolean e0() {
        return (boolean)this.k.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[9]);
    }
    
    @Override
    public void f(final boolean b) {
        this.j.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[8], (Object)b);
    }
    
    @e
    public c.l f0() {
        return (c.l)this.B.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[26]);
    }
    
    @Override
    public boolean g() {
        return (boolean)this.m.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[11]);
    }
    
    public boolean g0() {
        return (boolean)this.j.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[8]);
    }
    
    @Override
    public void h(@e final b b) {
        k0.p((Object)b, "<set-?>");
        this.b.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[0], (Object)b);
    }
    
    public boolean h0() {
        return (boolean)this.c.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[1]);
    }
    
    @Override
    public void i(final boolean b) {
        this.w.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[21], (Object)b);
    }
    
    public boolean i0() {
        return (boolean)this.d.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[2]);
    }
    
    @Override
    public void j(final boolean b) {
        this.h.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[6], (Object)b);
    }
    
    public boolean j0() {
        return (boolean)this.l.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[10]);
    }
    
    @Override
    public void k(final boolean b) {
        this.F.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[30], (Object)b);
    }
    
    public boolean k0() {
        return (boolean)this.w.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[21]);
    }
    
    @Override
    public void l(final boolean b) {
        this.E.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[29], (Object)b);
    }
    
    public boolean l0() {
        return (boolean)this.v.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[20]);
    }
    
    @Override
    public void m(@e final m m) {
        k0.p((Object)m, "<set-?>");
        this.C.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[27], (Object)m);
    }
    
    public final boolean m0() {
        return this.a;
    }
    
    @Override
    public void n(@e final kotlin.reflect.jvm.internal.impl.renderer.a a) {
        k0.p((Object)a, "<set-?>");
        this.M.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[37], (Object)a);
    }
    
    public final void n0() {
        this.a = true;
    }
    
    @e
    @Override
    public Set<kotlin.reflect.jvm.internal.impl.name.b> o() {
        return (Set<kotlin.reflect.jvm.internal.impl.name.b>)this.K.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[35]);
    }
    
    @Override
    public boolean p() {
        return (boolean)this.h.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[6]);
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.renderer.a q() {
        return (kotlin.reflect.jvm.internal.impl.renderer.a)this.M.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[37]);
    }
    
    @Override
    public void r(final boolean b) {
        this.v.b((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[20], (Object)b);
    }
    
    @e
    public final g s() {
        final g obj = new g();
        final Field[] declaredFields = g.class.getDeclaredFields();
        k0.o((Object)declaredFields, "this::class.java.declaredFields");
        final int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            final Field field = declaredFields[i];
            ++i;
            if ((field.getModifiers() & 0x8) != 0x0) {
                continue;
            }
            field.setAccessible(true);
            final Object value = field.get(this);
            kotlin.properties.c c;
            if (value instanceof kotlin.properties.c) {
                c = (kotlin.properties.c)value;
            }
            else {
                c = null;
            }
            if (c == null) {
                continue;
            }
            final String name = field.getName();
            k0.o((Object)name, "field.name");
            kotlin.text.s.u2(name, "is", false, 2, null);
            final d d = k1.d((Class)g.class);
            final String name2 = field.getName();
            final String name3 = field.getName();
            k0.o((Object)name3, "field.name");
            field.set(obj, obj.o0(c.a((Object)this, (o)new f1((h)d, name2, k0.C("get", (Object)kotlin.text.s.m1(name3))))));
        }
        return obj;
    }
    
    public boolean t() {
        return (boolean)this.s.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[17]);
    }
    
    public boolean u() {
        return (boolean)this.N.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[38]);
    }
    
    @org.jetbrains.annotations.f
    public n6.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean> v() {
        return (n6.l<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, Boolean>)this.L.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[36]);
    }
    
    public boolean w() {
        return (boolean)this.V.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[46]);
    }
    
    public boolean x() {
        return (boolean)this.i.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[7]);
    }
    
    @e
    public b y() {
        return (b)this.b.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[0]);
    }
    
    @org.jetbrains.annotations.f
    public n6.l<e1, String> z() {
        return (n6.l<e1, String>)this.y.a((Object)this, (o)kotlin.reflect.jvm.internal.impl.renderer.g.X[23]);
    }
}
