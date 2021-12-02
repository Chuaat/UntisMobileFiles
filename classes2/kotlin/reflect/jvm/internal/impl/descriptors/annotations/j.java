// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.d0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.g0;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.g;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.name.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;

public final class j implements c
{
    @e
    private final KotlinBuiltIns a;
    @e
    private final b b;
    @e
    private final Map<kotlin.reflect.jvm.internal.impl.name.e, g<?>> c;
    @e
    private final b0 d;
    
    public j(@e final KotlinBuiltIns a, @e final b b, @e final Map<kotlin.reflect.jvm.internal.impl.name.e, ? extends g<?>> c) {
        k0.p(a, "builtIns");
        k0.p(b, "fqName");
        k0.p(c, "allValueArguments");
        this.a = a;
        this.b = b;
        this.c = (Map<kotlin.reflect.jvm.internal.impl.name.e, g<?>>)c;
        this.d = d0.b(g0.H, (n6.a<?>)new n6.a<kotlin.reflect.jvm.internal.impl.types.k0>() {
            final /* synthetic */ j G;
            
            @e
            public final kotlin.reflect.jvm.internal.impl.types.k0 a() {
                return j.c(this.G).getBuiltInClassByFqName(this.G.f()).A();
            }
        });
    }
    
    public static final /* synthetic */ KotlinBuiltIns c(final j j) {
        return j.a;
    }
    
    @e
    @Override
    public c0 a() {
        final c0 value = this.d.getValue();
        k0.o(value, "pyright 2010-2017 JetBrains s.r.o.\n *\n * Licensed under the Apache License, Version 2.0 (the \"License\");\n * you may not use this file except in compliance with the License.\n * You may obtain a copy of the License at\n *\n * http://www.apache.org/licenses/LICENSE-2.0\n *\n * Unless required by applicable law or agreed to in writing, software\n * distributed under the License is distributed on an \"AS IS\" BASIS,\n * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n * See the License for the specific language governing permissions and\n * limitations under the License.\n */\n\npackage org.jetbrains.kotlin.descriptors.annotations\n\nimport org.jetbrains.kotlin.builtins.KotlinBuiltIns\nimport org.jetbrains.kotlin.descriptors.SourceElement\nimport org.jetbrains.kotlin.name.FqName\nimport org.jetbrains.kotlin.name.Name\nimport org.jetbrains.kotlin.resolve.constants.ConstantValue\nimport org.jetbrains.kotlin.types.KotlinType\nimport kotlin.LazyThreadSafetyMode.PUBLICATION\n\nclass BuiltInAnnotationDescriptor(\n        private val builtIns: KotlinBuiltIns,\n        override val fqName: FqName,\n        override val allValueArguments: Map<Name, ConstantValue<*>>\n) : AnnotationDescriptor {\n    override val type: KotlinType by lazy(PUBLICATION) {\n        builtIns.getBuiltInClassByFqName(fqName).defaultType\n    }");
        return value;
    }
    
    @e
    @Override
    public Map<kotlin.reflect.jvm.internal.impl.name.e, g<?>> b() {
        return this.c;
    }
    
    @e
    @Override
    public b f() {
        return this.b;
    }
    
    @e
    @Override
    public w0 k() {
        final w0 a = w0.a;
        k0.o(a, "NO_SOURCE");
        return a;
    }
}
