// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io.path;

import java.nio.file.FileSystem;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.text.s;
import java.util.Iterator;
import kotlin.j2;
import java.nio.file.FileStore;
import kotlin.w;
import java.nio.file.attribute.FileAttributeView;
import kotlin.y0;
import kotlin.jvm.internal.h0;
import kotlin.sequences.m;
import n6.l;
import java.net.URI;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.FileTime;
import java.util.Map;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.collections.v;
import java.util.List;
import java.nio.file.StandardCopyOption;
import java.nio.file.CopyOption;
import java.nio.file.Paths;
import java.io.IOException;
import kotlin.jvm.internal.k0;
import java.nio.file.Files;
import java.util.Arrays;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import java.nio.file.LinkOption;
import kotlin.o2;
import kotlin.internal.f;
import kotlin.e1;
import java.nio.file.Path;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\r\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0002*\u00020\u0000H\u0087\b\u001a\u0014\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u001a0\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a(\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0014\u001a\u00020\t*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0013\u001a(\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0013\u001a(\u0010\u0016\u001a\u00020\t*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0013\u001a\r\u0010\u0017\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\r\u0010\u001b\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\b\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001f*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0002H\u0007\u001aA\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010!*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\u0018\u0010$\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000#\u0012\u0004\u0012\u00028\u00000\"H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a.\u0010)\u001a\u00020'*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00022\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0\"H\u0087\b\u00f8\u0001\u0000\u001a\r\u0010+\u001a\u00020**\u00020\u0000H\u0087\b\u001a\r\u0010,\u001a\u00020'*\u00020\u0000H\u0087\b\u001a\r\u0010-\u001a\u00020\t*\u00020\u0000H\u0087\b\u001a0\u00100\u001a\u00020\u0000*\u00020\u00002\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0087\b¢\u0006\u0004\b0\u00101\u001a0\u00102\u001a\u00020\u0000*\u00020\u00002\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0087\b¢\u0006\u0004\b2\u00101\u001a0\u00103\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0087\b¢\u0006\u0004\b3\u0010\u0010\u001a\u001f\u00104\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u001a\r\u00106\u001a\u000205*\u00020\u0000H\u0087\b\u001a2\u00109\u001a\u0004\u0018\u000108*\u00020\u00002\u0006\u00107\u001a\u00020\u00022\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\b9\u0010:\u001a:\u0010<\u001a\u00020\u0000*\u00020\u00002\u0006\u00107\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u0001082\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\b<\u0010=\u001a6\u0010@\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010?\u0018\u0001*\u00020>*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\b@\u0010A\u001a4\u0010B\u001a\u00028\u0000\"\n\b\u0000\u0010?\u0018\u0001*\u00020>*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\bB\u0010A\u001a\u001c\u0010G\u001a\u00020F2\u0006\u0010C\u001a\u00020\u00002\n\u0010E\u001a\u0006\u0012\u0002\b\u00030DH\u0001\u001a4\u0010J\u001a\u00028\u0000\"\n\b\u0000\u0010I\u0018\u0001*\u00020H*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\bJ\u0010K\u001a>\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001080L*\u00020\u00002\u0006\u0010/\u001a\u00020\u00022\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\bM\u0010N\u001a(\u0010P\u001a\u00020O*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\bP\u0010Q\u001a\u0015\u0010R\u001a\u00020\u0000*\u00020\u00002\u0006\u0010;\u001a\u00020OH\u0087\b\u001a*\u0010T\u001a\u0004\u0018\u00010S*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\bT\u0010U\u001a\u0015\u0010V\u001a\u00020\u0000*\u00020\u00002\u0006\u0010;\u001a\u00020SH\u0087\b\u001a.\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0W*\u00020\u00002\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\f\"\u00020\u0011H\u0087\b¢\u0006\u0004\bY\u0010Z\u001a\u001b\u0010[\u001a\u00020\u0000*\u00020\u00002\f\u0010;\u001a\b\u0012\u0004\u0012\u00020X0WH\u0087\b\u001a\u0015\u0010\\\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\b\u001a8\u0010]\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0087\b¢\u0006\u0004\b]\u0010^\u001a\r\u0010_\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a0\u0010`\u001a\u00020\u0000*\u00020\u00002\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0087\b¢\u0006\u0004\b`\u00101\u001aD\u0010c\u001a\u00020\u00002\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00022\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0087\b¢\u0006\u0004\bc\u0010d\u001aM\u0010f\u001a\u00020\u00002\b\u0010e\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u00022\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0007¢\u0006\u0004\bf\u0010g\u001a8\u0010!\u001a\u00020\u00002\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00022\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0087\b¢\u0006\u0004\b!\u0010h\u001aA\u0010i\u001a\u00020\u00002\b\u0010e\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u00022\u001a\u0010/\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030.0\f\"\u0006\u0012\u0002\b\u00030.H\u0007¢\u0006\u0004\bi\u0010j\u001a\u0015\u0010k\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010l\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0002H\u0087\n\u001a\u0011\u0010m\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0002H\u0087\b\u001a,\u0010o\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\f\"\u00020\u0002H\u0087\b¢\u0006\u0004\bo\u0010p\u001a\r\u0010r\u001a\u00020\u0000*\u00020qH\u0087\b\" \u0010w\u001a\u00020\u0002*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bu\u0010v\u001a\u0004\bs\u0010t\" \u0010z\u001a\u00020\u0002*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\by\u0010v\u001a\u0004\bx\u0010t\" \u0010}\u001a\u00020\u0002*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b|\u0010v\u001a\u0004\b{\u0010t\"\"\u0010\u0080\u0001\u001a\u00020\u0002*\u00020\u00008\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\u007f\u0010v\u001a\u0004\b~\u0010t\"$\u0010\u0083\u0001\u001a\u00020\u0002*\u00020\u00008\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010v\u001a\u0005\b\u0081\u0001\u0010t\"#\u0010\u0086\u0001\u001a\u00020\u0002*\u00020\u00008F@\u0007X\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010v\u001a\u0005\b\u0084\u0001\u0010t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0087\u0001" }, d2 = { "Ljava/nio/file/Path;", "J", "", "K", "base", "U0", "W0", "V0", "target", "", "overwrite", "L", "", "Ljava/nio/file/CopyOption;", "options", "M", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;", "Ljava/nio/file/LinkOption;", "f0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "Q0", "H0", "D0", "J0", "E0", "F0", "G0", "K0", "other", "I0", "glob", "", "L0", "T", "Lkotlin/Function1;", "Lkotlin/sequences/m;", "block", "c1", "(Ljava/nio/file/Path;Ljava/lang/String;Ln6/l;)Ljava/lang/Object;", "Lkotlin/j2;", "action", "l0", "", "j0", "b0", "c0", "Ljava/nio/file/attribute/FileAttribute;", "attributes", "P", "(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "O", "O0", "N0", "Ljava/nio/file/FileStore;", "k0", "attribute", "", "n0", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "value", "X0", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;", "Ljava/nio/file/attribute/FileAttributeView;", "V", "i0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;", "h0", "path", "Ljava/lang/Class;", "attributeViewClass", "", "g0", "Ljava/nio/file/attribute/BasicFileAttributes;", "A", "R0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;", "", "S0", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;", "Ljava/nio/file/attribute/FileTime;", "u0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;", "Y0", "Ljava/nio/file/attribute/UserPrincipal;", "z0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/UserPrincipal;", "Z0", "", "Ljava/nio/file/attribute/PosixFilePermission;", "C0", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/util/Set;", "a1", "R", "S", "(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "T0", "Q", "prefix", "suffix", "X", "(Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "directory", "Y", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "(Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "U", "(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "e0", "d0", "H", "subpaths", "I", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;", "Ljava/net/URI;", "b1", "s0", "(Ljava/nio/file/Path;)Ljava/lang/String;", "getInvariantSeparatorsPathString$annotations", "(Ljava/nio/file/Path;)V", "invariantSeparatorsPathString", "x0", "getNameWithoutExtension$annotations", "nameWithoutExtension", "o0", "getExtension$annotations", "extension", "A0", "getPathString$annotations", "pathString", "q0", "getInvariantSeparatorsPath$annotations", "invariantSeparatorsPath", "v0", "getName$annotations", "name", "kotlin-stdlib-jdk7" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/io/path/PathsKt")
class e extends d
{
    public e() {
    }
    
    private static final String A0(final Path path) {
        return path.toString();
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Set<PosixFilePermission> C0(final Path path, final LinkOption... original) throws IOException {
        final Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[])Arrays.copyOf(original, original.length));
        k0.o(posixFilePermissions, "Files.getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean D0(final Path path, final LinkOption... original) {
        return Files.isDirectory(path, (LinkOption[])Arrays.copyOf(original, original.length));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean E0(final Path path) {
        return Files.isExecutable(path);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean F0(final Path path) throws IOException {
        return Files.isHidden(path);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean G0(final Path path) {
        return Files.isReadable(path);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path H(final String first) {
        final Path value = Paths.get(first, new String[0]);
        k0.o(value, "Paths.get(path)");
        return value;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean H0(final Path path, final LinkOption... original) {
        return Files.isRegularFile(path, (LinkOption[])Arrays.copyOf(original, original.length));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path I(final String first, final String... original) {
        final Path value = Paths.get(first, (String[])Arrays.copyOf(original, original.length));
        k0.o(value, "Paths.get(base, *subpaths)");
        return value;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean I0(final Path path, final Path path2) throws IOException {
        return Files.isSameFile(path, path2);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path J(Path absolutePath) {
        absolutePath = absolutePath.toAbsolutePath();
        k0.o(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean J0(final Path path) {
        return Files.isSymbolicLink(path);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final String K(final Path path) {
        return path.toAbsolutePath().toString();
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean K0(final Path path) {
        return Files.isWritable(path);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path L(Path copy, final Path target, final boolean b) throws IOException {
        CopyOption[] original;
        if (b) {
            original = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING };
        }
        else {
            original = new CopyOption[0];
        }
        copy = Files.copy(copy, target, (CopyOption[])Arrays.copyOf(original, original.length));
        k0.o(copy, "Files.copy(this, target, *options)");
        return copy;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { a.class })
    @org.jetbrains.annotations.e
    public static final List<Path> L0(@org.jetbrains.annotations.e Path directoryStream, @org.jetbrains.annotations.e final String glob) throws IOException {
        k0.p(directoryStream, "$this$listDirectoryEntries");
        k0.p(glob, "glob");
        directoryStream = (Path)Files.newDirectoryStream(directoryStream, glob);
        try {
            k0.o(directoryStream, "it");
            final List<Path> i5 = v.I5((Iterable<? extends Path>)directoryStream);
            c.a((Closeable)directoryStream, null);
            return i5;
        }
        finally {
            try {}
            finally {
                c.a((Closeable)directoryStream, (Throwable)glob);
            }
        }
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path M(Path copy, final Path target, final CopyOption... original) throws IOException {
        copy = Files.copy(copy, target, (CopyOption[])Arrays.copyOf(original, original.length));
        k0.o(copy, "Files.copy(this, target, *options)");
        return copy;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path N0(Path move, final Path target, final boolean b) throws IOException {
        CopyOption[] original;
        if (b) {
            original = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING };
        }
        else {
            original = new CopyOption[0];
        }
        move = Files.move(move, target, (CopyOption[])Arrays.copyOf(original, original.length));
        k0.o(move, "Files.move(this, target, *options)");
        return move;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path O(Path directories, final FileAttribute<?>... original) throws IOException {
        directories = Files.createDirectories(directories, (FileAttribute<?>[])Arrays.copyOf(original, original.length));
        k0.o(directories, "Files.createDirectories(this, *attributes)");
        return directories;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path O0(Path move, final Path target, final CopyOption... original) throws IOException {
        move = Files.move(move, target, (CopyOption[])Arrays.copyOf(original, original.length));
        k0.o(move, "Files.move(this, target, *options)");
        return move;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path P(Path directory, final FileAttribute<?>... original) throws IOException {
        directory = Files.createDirectory(directory, (FileAttribute<?>[])Arrays.copyOf(original, original.length));
        k0.o(directory, "Files.createDirectory(this, *attributes)");
        return directory;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path Q(Path file, final FileAttribute<?>... original) throws IOException {
        file = Files.createFile(file, (FileAttribute<?>[])Arrays.copyOf(original, original.length));
        k0.o(file, "Files.createFile(this, *attributes)");
        return file;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean Q0(final Path path, final LinkOption... original) {
        return Files.notExists(path, (LinkOption[])Arrays.copyOf(original, original.length));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path R(Path link, final Path existing) throws IOException {
        link = Files.createLink(link, existing);
        k0.o(link, "Files.createLink(this, target)");
        return link;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path S(Path symbolicLink, final Path target, final FileAttribute<?>... original) throws IOException {
        symbolicLink = Files.createSymbolicLink(symbolicLink, target, (FileAttribute<?>[])Arrays.copyOf(original, original.length));
        k0.o(symbolicLink, "Files.createSymbolicLink\u2026his, target, *attributes)");
        return symbolicLink;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Map<String, Object> S0(final Path path, final String attributes, final LinkOption... original) throws IOException {
        final Map<String, Object> attributes2 = Files.readAttributes(path, attributes, (LinkOption[])Arrays.copyOf(original, original.length));
        k0.o(attributes2, "Files.readAttributes(this, attributes, *options)");
        return attributes2;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path T(final String prefix, final FileAttribute<?>... original) throws IOException {
        final Path tempDirectory = Files.createTempDirectory(prefix, (FileAttribute<?>[])Arrays.copyOf(original, original.length));
        k0.o(tempDirectory, "Files.createTempDirectory(prefix, *attributes)");
        return tempDirectory;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path T0(Path symbolicLink) throws IOException {
        symbolicLink = Files.readSymbolicLink(symbolicLink);
        k0.o(symbolicLink, "Files.readSymbolicLink(this)");
        return symbolicLink;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { a.class })
    @org.jetbrains.annotations.e
    public static final Path U(@org.jetbrains.annotations.f Path dir, @org.jetbrains.annotations.f String s, @org.jetbrains.annotations.e final FileAttribute<?>... array) throws IOException {
        k0.p(array, "attributes");
        if (dir != null) {
            dir = Files.createTempDirectory(dir, s, (FileAttribute<?>[])Arrays.copyOf(array, array.length));
            s = "Files.createTempDirector\u2026ory, prefix, *attributes)";
        }
        else {
            dir = Files.createTempDirectory(s, (FileAttribute<?>[])Arrays.copyOf(array, array.length));
            s = "Files.createTempDirectory(prefix, *attributes)";
        }
        k0.o(dir, s);
        return dir;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { a.class })
    @org.jetbrains.annotations.e
    public static final Path U0(@org.jetbrains.annotations.e final Path obj, @org.jetbrains.annotations.e final Path obj2) {
        k0.p(obj, "$this$relativeTo");
        k0.p(obj2, "base");
        try {
            return b.c.a(obj, obj2);
        }
        catch (IllegalArgumentException cause) {
            final String message = cause.getMessage();
            final StringBuilder sb = new StringBuilder();
            sb.append("\nthis path: ");
            sb.append(obj);
            sb.append("\nbase path: ");
            sb.append(obj2);
            throw new IllegalArgumentException(k0.C(message, sb.toString()), cause);
        }
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { a.class })
    @org.jetbrains.annotations.f
    public static final Path V0(@org.jetbrains.annotations.e Path a, @org.jetbrains.annotations.e final Path path) {
        k0.p(a, "$this$relativeToOrNull");
        k0.p(path, "base");
        try {
            a = b.c.a(a, path);
        }
        catch (IllegalArgumentException ex) {
            a = null;
        }
        return a;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { a.class })
    @org.jetbrains.annotations.e
    public static final Path W0(@org.jetbrains.annotations.e Path path, @org.jetbrains.annotations.e Path v0) {
        k0.p(path, "$this$relativeToOrSelf");
        k0.p(v0, "base");
        v0 = V0(path, v0);
        if (v0 != null) {
            path = v0;
        }
        return path;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path X(final String prefix, final String suffix, final FileAttribute<?>... original) throws IOException {
        final Path tempFile = Files.createTempFile(prefix, suffix, (FileAttribute<?>[])Arrays.copyOf(original, original.length));
        k0.o(tempFile, "Files.createTempFile(prefix, suffix, *attributes)");
        return tempFile;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path X0(Path setAttribute, final String attribute, final Object value, final LinkOption... original) throws IOException {
        setAttribute = Files.setAttribute(setAttribute, attribute, value, (LinkOption[])Arrays.copyOf(original, original.length));
        k0.o(setAttribute, "Files.setAttribute(this,\u2026tribute, value, *options)");
        return setAttribute;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { a.class })
    @org.jetbrains.annotations.e
    public static final Path Y(@org.jetbrains.annotations.f Path dir, @org.jetbrains.annotations.f String s, @org.jetbrains.annotations.f final String s2, @org.jetbrains.annotations.e final FileAttribute<?>... array) throws IOException {
        k0.p(array, "attributes");
        if (dir != null) {
            dir = Files.createTempFile(dir, s, s2, (FileAttribute<?>[])Arrays.copyOf(array, array.length));
            s = "Files.createTempFile(dir\u2026fix, suffix, *attributes)";
        }
        else {
            dir = Files.createTempFile(s, s2, (FileAttribute<?>[])Arrays.copyOf(array, array.length));
            s = "Files.createTempFile(prefix, suffix, *attributes)";
        }
        k0.o(dir, s);
        return dir;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path Y0(Path setLastModifiedTime, final FileTime time) throws IOException {
        setLastModifiedTime = Files.setLastModifiedTime(setLastModifiedTime, time);
        k0.o(setLastModifiedTime, "Files.setLastModifiedTime(this, value)");
        return setLastModifiedTime;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path Z0(Path setOwner, final UserPrincipal owner) throws IOException {
        setOwner = Files.setOwner(setOwner, owner);
        k0.o(setOwner, "Files.setOwner(this, value)");
        return setOwner;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path a1(Path setPosixFilePermissions, final Set<? extends PosixFilePermission> perms) throws IOException {
        setPosixFilePermissions = Files.setPosixFilePermissions(setPosixFilePermissions, (Set<PosixFilePermission>)perms);
        k0.o(setPosixFilePermissions, "Files.setPosixFilePermissions(this, value)");
        return setPosixFilePermissions;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final void b0(final Path path) throws IOException {
        Files.delete(path);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path b1(final URI uri) {
        final Path value = Paths.get(uri);
        k0.o(value, "Paths.get(this)");
        return value;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean c0(final Path path) throws IOException {
        return Files.deleteIfExists(path);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final <T> T c1(Path directoryStream, final String glob, final l<? super m<? extends Path>, ? extends T> l) throws IOException {
        directoryStream = (Path)Files.newDirectoryStream(directoryStream, glob);
        try {
            k0.o(directoryStream, "it");
            final T invoke = l.invoke(v.n1((Iterable<?>)directoryStream));
            h0.d(1);
            if (kotlin.internal.l.a(1, 1, 0)) {
                c.a((Closeable)directoryStream, null);
            }
            else if (directoryStream != null) {
                ((Closeable)directoryStream).close();
            }
            h0.c(1);
            return invoke;
        }
        finally {
            try {}
            finally {
                h0.d(1);
                Label_0094: {
                    if (kotlin.internal.l.a(1, 1, 0)) {
                        break Label_0094;
                    }
                    Label_0099: {
                        if (directoryStream == null) {
                            break Label_0099;
                        }
                        try {
                            ((Closeable)directoryStream).close();
                            h0.c(1);
                            break Label_0094;
                            c.a((Closeable)directoryStream, (Throwable)l);
                        }
                        finally {}
                    }
                }
            }
        }
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path d0(Path resolve, final String other) {
        k0.p(resolve, "$this$div");
        resolve = resolve.resolve(other);
        k0.o(resolve, "this.resolve(other)");
        return resolve;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Path e0(Path resolve, final Path path) {
        k0.p(resolve, "$this$div");
        resolve = resolve.resolve(path);
        k0.o(resolve, "this.resolve(other)");
        return resolve;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final boolean f0(final Path path, final LinkOption... original) {
        return Files.exists(path, (LinkOption[])Arrays.copyOf(original, original.length));
    }
    
    @y0
    @org.jetbrains.annotations.e
    public static final Void g0(@org.jetbrains.annotations.e final Path obj, @org.jetbrains.annotations.e final Class<?> obj2) {
        k0.p(obj, "path");
        k0.p(obj2, "attributeViewClass");
        final StringBuilder sb = new StringBuilder();
        sb.append("The desired attribute view type ");
        sb.append(obj2);
        sb.append(" is not available for the file ");
        sb.append(obj);
        sb.append('.');
        throw new UnsupportedOperationException(sb.toString());
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final long j0(final Path path) throws IOException {
        return Files.size(path);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final FileStore k0(final Path path) throws IOException {
        final FileStore fileStore = Files.getFileStore(path);
        k0.o(fileStore, "Files.getFileStore(this)");
        return fileStore;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final void l0(Path directoryStream, final String glob, final l<? super Path, j2> l) throws IOException {
        directoryStream = (Path)Files.newDirectoryStream(directoryStream, glob);
        try {
            k0.o(directoryStream, "it");
            final Iterator<Object> iterator = ((Iterable<Object>)directoryStream).iterator();
            while (iterator.hasNext()) {
                l.invoke(iterator.next());
            }
            final j2 a = j2.a;
            h0.d(1);
            if (kotlin.internal.l.a(1, 1, 0)) {
                c.a((Closeable)directoryStream, null);
            }
            else if (directoryStream != null) {
                ((Closeable)directoryStream).close();
            }
            h0.c(1);
        }
        finally {
            try {}
            finally {
                h0.d(1);
                Label_0118: {
                    if (kotlin.internal.l.a(1, 1, 0)) {
                        break Label_0118;
                    }
                    Label_0123: {
                        if (directoryStream == null) {
                            break Label_0123;
                        }
                        try {
                            ((Closeable)directoryStream).close();
                            h0.c(1);
                            break Label_0118;
                            c.a((Closeable)directoryStream, (Throwable)l);
                        }
                        finally {}
                    }
                }
            }
        }
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final Object n0(final Path path, final String attribute, final LinkOption... original) throws IOException {
        return Files.getAttribute(path, attribute, (LinkOption[])Arrays.copyOf(original, original.length));
    }
    
    @org.jetbrains.annotations.e
    public static final String o0(@org.jetbrains.annotations.e final Path path) {
        k0.p(path, "$this$extension");
        final Path fileName = path.getFileName();
        String s2;
        final String s = s2 = "";
        if (fileName != null) {
            final String string = fileName.toString();
            s2 = s;
            if (string != null) {
                final String n5 = kotlin.text.s.n5(string, '.', "");
                s2 = s;
                if (n5 != null) {
                    s2 = n5;
                }
            }
        }
        return s2;
    }
    
    private static final String q0(final Path path) {
        return s0(path);
    }
    
    @org.jetbrains.annotations.e
    public static final String s0(@org.jetbrains.annotations.e final Path path) {
        k0.p(path, "$this$invariantSeparatorsPathString");
        final FileSystem fileSystem = path.getFileSystem();
        k0.o(fileSystem, "fileSystem");
        final String separator = fileSystem.getSeparator();
        String s;
        if (k0.g(separator, "/") ^ true) {
            final String string = path.toString();
            k0.o(separator, "separator");
            s = kotlin.text.s.k2(string, separator, "/", false, 4, (Object)null);
        }
        else {
            s = path.toString();
        }
        return s;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final FileTime u0(final Path path, final LinkOption... original) throws IOException {
        final FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[])Arrays.copyOf(original, original.length));
        k0.o(lastModifiedTime, "Files.getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }
    
    @org.jetbrains.annotations.e
    public static final String v0(@org.jetbrains.annotations.e Path fileName) {
        k0.p(fileName, "$this$name");
        fileName = fileName.getFileName();
        String string;
        if (fileName != null) {
            string = fileName.toString();
        }
        else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        return string;
    }
    
    @org.jetbrains.annotations.e
    public static final String x0(@org.jetbrains.annotations.e Path fileName) {
        k0.p(fileName, "$this$nameWithoutExtension");
        fileName = fileName.getFileName();
        if (fileName != null) {
            final String string = fileName.toString();
            if (string != null) {
                final String y5 = s.y5(string, ".", (String)null, 2, (Object)null);
                if (y5 != null) {
                    return y5;
                }
            }
        }
        return "";
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { a.class })
    private static final UserPrincipal z0(final Path path, final LinkOption... original) throws IOException {
        return Files.getOwner(path, (LinkOption[])Arrays.copyOf(original, original.length));
    }
}
