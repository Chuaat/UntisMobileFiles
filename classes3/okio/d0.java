// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.Closeable;
import n6.l;
import java.io.InputStream;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;
import m6.h;
import javax.crypto.Mac;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import m6.g;
import java.io.FileNotFoundException;
import org.jetbrains.annotations.e;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "okio/e0", "okio/f0" }, d2 = {}, k = 4, mv = { 1, 4, 1 })
public final class d0
{
    @e
    public static final p0 a(@e final File file) throws FileNotFoundException {
        return e0.b(file);
    }
    
    @g(name = "blackhole")
    @e
    public static final p0 b() {
        return f0.a();
    }
    
    @e
    public static final n c(@e final p0 p) {
        return f0.b(p);
    }
    
    @e
    public static final o d(@e final r0 r0) {
        return f0.c(r0);
    }
    
    @e
    public static final q e(@e final p0 p2, @e final Cipher cipher) {
        return e0.c(p2, cipher);
    }
    
    @e
    public static final r f(@e final r0 r0, @e final Cipher cipher) {
        return e0.d(r0, cipher);
    }
    
    @e
    public static final z g(@e final p0 p2, @e final MessageDigest messageDigest) {
        return e0.f(p2, messageDigest);
    }
    
    @e
    public static final z h(@e final p0 p2, @e final Mac mac) {
        return e0.g(p2, mac);
    }
    
    @e
    public static final a0 i(@e final r0 r0, @e final MessageDigest messageDigest) {
        return e0.h(r0, messageDigest);
    }
    
    @e
    public static final a0 j(@e final r0 r0, @e final Mac mac) {
        return e0.i(r0, mac);
    }
    
    public static final boolean k(@e final AssertionError assertionError) {
        return e0.j(assertionError);
    }
    
    @h
    @e
    public static final p0 l(@e final File file) throws FileNotFoundException {
        return e0.p(file, false, 1, null);
    }
    
    @h
    @e
    public static final p0 m(@e final File file, final boolean b) throws FileNotFoundException {
        return e0.l(file, b);
    }
    
    @e
    public static final p0 n(@e final OutputStream outputStream) {
        return e0.m(outputStream);
    }
    
    @e
    public static final p0 o(@e final Socket socket) throws IOException {
        return e0.n(socket);
    }
    
    @IgnoreJRERequirement
    @e
    public static final p0 p(@e final Path path, @e final OpenOption... array) throws IOException {
        return e0.o(path, array);
    }
    
    @e
    public static final r0 r(@e final File file) throws FileNotFoundException {
        return e0.q(file);
    }
    
    @e
    public static final r0 s(@e final InputStream inputStream) {
        return e0.r(inputStream);
    }
    
    @e
    public static final r0 t(@e final Socket socket) throws IOException {
        return e0.s(socket);
    }
    
    @IgnoreJRERequirement
    @e
    public static final r0 u(@e final Path path, @e final OpenOption... array) throws IOException {
        return e0.t(path, array);
    }
    
    public static final <T extends Closeable, R> R v(final T t, @e final l<? super T, ? extends R> l) {
        return f0.d(t, l);
    }
}
