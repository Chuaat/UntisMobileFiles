// 
// Decompiled by Procyon v0.5.36
// 

package com.google.gson.stream;

import java.util.Arrays;
import java.io.EOFException;
import java.util.Objects;
import java.io.IOException;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.JsonReaderInternalAccess;
import java.io.Reader;
import java.io.Closeable;

public class JsonReader implements Closeable
{
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final char[] NON_EXECUTE_PREFIX;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final char[] buffer;
    private final Reader in;
    private boolean lenient;
    private int limit;
    private int lineNumber;
    private int lineStart;
    private int[] pathIndices;
    private String[] pathNames;
    int peeked;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int pos;
    private int[] stack;
    private int stackSize;
    
    static {
        NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() {
            @Override
            public void promoteNameToValue(final JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader)jsonReader).promoteNameToValue();
                    return;
                }
                int n;
                if ((n = jsonReader.peeked) == 0) {
                    n = jsonReader.doPeek();
                }
                int peeked;
                if (n == 13) {
                    peeked = 9;
                }
                else if (n == 12) {
                    peeked = 8;
                }
                else {
                    if (n != 14) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Expected a name but was ");
                        sb.append(jsonReader.peek());
                        sb.append(jsonReader.locationString());
                        throw new IllegalStateException(sb.toString());
                    }
                    peeked = 10;
                }
                jsonReader.peeked = peeked;
            }
        };
    }
    
    public JsonReader(final Reader reader) {
        this.lenient = false;
        this.buffer = new char[1024];
        this.pos = 0;
        this.limit = 0;
        this.lineNumber = 0;
        this.lineStart = 0;
        this.peeked = 0;
        final int[] stack = new int[32];
        this.stack = stack;
        this.stackSize = 0;
        this.stackSize = 0 + 1;
        stack[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.in = reader;
    }
    
    private void checkLenient() throws IOException {
        if (this.lenient) {
            return;
        }
        throw this.syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
    
    private void consumeNonExecutePrefix() throws IOException {
        this.nextNonWhitespace(true);
        final int pos = this.pos - 1;
        this.pos = pos;
        final char[] non_EXECUTE_PREFIX = JsonReader.NON_EXECUTE_PREFIX;
        if (pos + non_EXECUTE_PREFIX.length > this.limit && !this.fillBuffer(non_EXECUTE_PREFIX.length)) {
            return;
        }
        int n = 0;
        while (true) {
            final char[] non_EXECUTE_PREFIX2 = JsonReader.NON_EXECUTE_PREFIX;
            if (n >= non_EXECUTE_PREFIX2.length) {
                this.pos += non_EXECUTE_PREFIX2.length;
                return;
            }
            if (this.buffer[this.pos + n] != non_EXECUTE_PREFIX2[n]) {
                return;
            }
            ++n;
        }
    }
    
    private boolean fillBuffer(int n) throws IOException {
        final char[] buffer = this.buffer;
        final int lineStart = this.lineStart;
        final int pos = this.pos;
        this.lineStart = lineStart - pos;
        final int limit = this.limit;
        if (limit != pos) {
            System.arraycopy(buffer, pos, buffer, 0, this.limit = limit - pos);
        }
        else {
            this.limit = 0;
        }
        this.pos = 0;
        int i;
        int n2;
        do {
            final Reader in = this.in;
            final int limit2 = this.limit;
            final int read = in.read(buffer, limit2, buffer.length - limit2);
            if (read == -1) {
                return false;
            }
            i = this.limit + read;
            this.limit = i;
            n2 = n;
            if (this.lineNumber != 0) {
                continue;
            }
            final int lineStart2 = this.lineStart;
            n2 = n;
            if (lineStart2 != 0) {
                continue;
            }
            n2 = n;
            if (i <= 0) {
                continue;
            }
            n2 = n;
            if (buffer[0] != '\ufeff') {
                continue;
            }
            ++this.pos;
            this.lineStart = lineStart2 + 1;
            n2 = n + 1;
        } while (i < (n = n2));
        return true;
    }
    
    private boolean isLiteral(final char c) throws IOException {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c == ',') {
                    return false;
                }
                if (c != '/' && c != '=') {
                    if (c == '{' || c == '}' || c == ':') {
                        return false;
                    }
                    if (c != ';') {
                        switch (c) {
                            default: {
                                return true;
                            }
                            case '\\': {
                                break;
                            }
                            case '[':
                            case ']': {
                                return false;
                            }
                        }
                    }
                }
            }
            this.checkLenient();
        }
        return false;
    }
    
    private int nextNonWhitespace(final boolean b) throws IOException {
        final char[] buffer = this.buffer;
        while (true) {
            int pos = this.pos;
        Label_0244:
            while (true) {
                int limit = this.limit;
                while (true) {
                    int pos2 = pos;
                    int limit2 = limit;
                    if (pos == limit) {
                        this.pos = pos;
                        if (!this.fillBuffer(1)) {
                            if (!b) {
                                return -1;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("End of input");
                            sb.append(this.locationString());
                            throw new EOFException(sb.toString());
                        }
                        else {
                            pos2 = this.pos;
                            limit2 = this.limit;
                        }
                    }
                    pos = pos2 + 1;
                    final char c = buffer[pos2];
                    if (c == '\n') {
                        ++this.lineNumber;
                        this.lineStart = pos;
                    }
                    else if (c != ' ' && c != '\r') {
                        if (c != '\t') {
                            if (c == '/') {
                                if ((this.pos = pos) == limit2) {
                                    this.pos = pos - 1;
                                    final boolean fillBuffer = this.fillBuffer(2);
                                    ++this.pos;
                                    if (!fillBuffer) {
                                        return c;
                                    }
                                }
                                this.checkLenient();
                                final int pos3 = this.pos;
                                final char c2 = buffer[pos3];
                                if (c2 != '*') {
                                    if (c2 != '/') {
                                        return c;
                                    }
                                    this.pos = pos3 + 1;
                                    break Label_0244;
                                }
                                else {
                                    this.pos = pos3 + 1;
                                    if (this.skipTo("*/")) {
                                        pos = this.pos + 2;
                                        break;
                                    }
                                    throw this.syntaxError("Unterminated comment");
                                }
                            }
                            else {
                                this.pos = pos;
                                if (c == '#') {
                                    this.checkLenient();
                                    break Label_0244;
                                }
                                return c;
                            }
                        }
                    }
                    limit = limit2;
                }
            }
            this.skipToEndOfLine();
        }
    }
    
    private String nextQuotedValue(final char c) throws IOException {
        final char[] buffer = this.buffer;
        StringBuilder sb = null;
        while (true) {
            final int pos = this.pos;
            final int limit = this.limit;
            int lineStart = pos;
            while (true) {
                final int pos2 = lineStart;
                if (pos2 < limit) {
                    lineStart = pos2 + 1;
                    final char c2 = buffer[pos2];
                    if (c2 == c) {
                        this.pos = lineStart;
                        final int n = lineStart - pos - 1;
                        if (sb == null) {
                            return new String(buffer, pos, n);
                        }
                        sb.append(buffer, pos, n);
                        return sb.toString();
                    }
                    else {
                        if (c2 == '\\') {
                            this.pos = lineStart;
                            final int len = lineStart - pos - 1;
                            StringBuilder sb2;
                            if ((sb2 = sb) == null) {
                                sb2 = new StringBuilder(Math.max((len + 1) * 2, 16));
                            }
                            sb2.append(buffer, pos, len);
                            sb2.append(this.readEscapeCharacter());
                            sb = sb2;
                            break;
                        }
                        if (c2 != '\n') {
                            continue;
                        }
                        ++this.lineNumber;
                        this.lineStart = lineStart;
                    }
                }
                else {
                    StringBuilder sb3;
                    if ((sb3 = sb) == null) {
                        sb3 = new StringBuilder(Math.max((pos2 - pos) * 2, 16));
                    }
                    sb3.append(buffer, pos, pos2 - pos);
                    this.pos = pos2;
                    if (this.fillBuffer(1)) {
                        sb = sb3;
                        break;
                    }
                    throw this.syntaxError("Unterminated string");
                }
            }
        }
    }
    
    private String nextUnquotedValue() throws IOException {
        final int n = 0;
        StringBuilder sb = null;
        while (true) {
            do {
                int n2 = 0;
                Label_0187: {
                    Label_0158: {
                        while (true) {
                            final int pos = this.pos;
                            if (pos + n2 < this.limit) {
                                final char c = this.buffer[pos + n2];
                                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                                    break Label_0187;
                                }
                                if (c == '#') {
                                    break Label_0158;
                                }
                                if (c == ',') {
                                    break Label_0187;
                                }
                                if (c == '/' || c == '=') {
                                    break Label_0158;
                                }
                                if (c == '{' || c == '}' || c == ':') {
                                    break Label_0187;
                                }
                                if (c == ';') {
                                    break Label_0158;
                                }
                                switch (c) {
                                    default: {
                                        ++n2;
                                        continue;
                                    }
                                    case 92: {
                                        break Label_0158;
                                    }
                                    case 91:
                                    case 93: {
                                        break Label_0187;
                                    }
                                }
                            }
                            else {
                                if (n2 >= this.buffer.length) {
                                    break;
                                }
                                if (this.fillBuffer(n2 + 1)) {
                                    continue;
                                }
                                break Label_0187;
                            }
                        }
                        StringBuilder sb2;
                        if ((sb2 = sb) == null) {
                            sb2 = new StringBuilder(Math.max(n2, 16));
                        }
                        sb2.append(this.buffer, this.pos, n2);
                        this.pos += n2;
                        sb = sb2;
                        continue;
                    }
                    this.checkLenient();
                }
                StringBuilder sb2 = sb;
                String string;
                if (sb2 == null) {
                    string = new String(this.buffer, this.pos, n2);
                }
                else {
                    sb2.append(this.buffer, this.pos, n2);
                    string = sb2.toString();
                }
                this.pos += n2;
                return string;
            } while (this.fillBuffer(1));
            int n2 = n;
            continue;
        }
    }
    
    private int peekKeyword() throws IOException {
        final char c = this.buffer[this.pos];
        int peeked;
        String s;
        String s2;
        if (c != 't' && c != 'T') {
            if (c != 'f' && c != 'F') {
                if (c != 'n' && c != 'N') {
                    return 0;
                }
                peeked = 7;
                s = "null";
                s2 = "NULL";
            }
            else {
                peeked = 6;
                s = "false";
                s2 = "FALSE";
            }
        }
        else {
            peeked = 5;
            s = "true";
            s2 = "TRUE";
        }
        final int length = s.length();
        for (int i = 1; i < length; ++i) {
            if (this.pos + i >= this.limit && !this.fillBuffer(i + 1)) {
                return 0;
            }
            final char c2 = this.buffer[this.pos + i];
            if (c2 != s.charAt(i) && c2 != s2.charAt(i)) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || this.fillBuffer(length + 1)) && this.isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        return this.peeked = peeked;
    }
    
    private int peekNumber() throws IOException {
        final char[] buffer = this.buffer;
        int pos = this.pos;
        int limit = this.limit;
        int peekedNumberLength = 0;
        int n = 0;
        int n2 = 1;
        long peekedLong = 0L;
        int n3 = 0;
        while (true) {
            int pos2 = pos;
            int limit2 = limit;
            if (pos + peekedNumberLength == limit) {
                if (peekedNumberLength == buffer.length) {
                    return 0;
                }
                if (!this.fillBuffer(peekedNumberLength + 1)) {
                    break;
                }
                pos2 = this.pos;
                limit2 = this.limit;
            }
            final char c = buffer[pos2 + peekedNumberLength];
            Label_0492: {
                if (c != '+') {
                    if (c != 'E' && c != 'e') {
                        if (c != '-') {
                            if (c != '.') {
                                if (c >= '0' && c <= '9') {
                                    Label_0289: {
                                        if (n != 1 && n != 0) {
                                            long n4 = 0L;
                                            int n6 = 0;
                                            Label_0260: {
                                                if (n == 2) {
                                                    if (peekedLong == 0L) {
                                                        return 0;
                                                    }
                                                    n4 = 10L * peekedLong - (c - '0');
                                                    final long n5 = lcmp(peekedLong, -922337203685477580L);
                                                    n6 = (n2 & ((n5 > 0 || (n5 == 0 && n4 < peekedLong)) ? 1 : 0));
                                                }
                                                else {
                                                    if (n == 3) {
                                                        n = 4;
                                                        break Label_0289;
                                                    }
                                                    if (n != 5) {
                                                        n6 = n2;
                                                        n4 = peekedLong;
                                                        if (n != 6) {
                                                            break Label_0260;
                                                        }
                                                    }
                                                    n = 7;
                                                    break Label_0289;
                                                }
                                            }
                                            n2 = n6;
                                            peekedLong = n4;
                                        }
                                        else {
                                            peekedLong = -(c - '0');
                                            n = 2;
                                        }
                                    }
                                    break Label_0492;
                                }
                                if (!this.isLiteral(c)) {
                                    break;
                                }
                                return 0;
                            }
                            else {
                                if (n == 2) {
                                    n = 3;
                                    break Label_0492;
                                }
                                return 0;
                            }
                        }
                        else {
                            if (n == 0) {
                                n = 1;
                                n3 = 1;
                                break Label_0492;
                            }
                            if (n != 5) {
                                return 0;
                            }
                        }
                    }
                    else {
                        if (n != 2 && n != 4) {
                            return 0;
                        }
                        n = 5;
                        break Label_0492;
                    }
                }
                else if (n != 5) {
                    return 0;
                }
                n = 6;
            }
            ++peekedNumberLength;
            pos = pos2;
            limit = limit2;
        }
        int peeked;
        if (n == 2 && n2 && (peekedLong != Long.MIN_VALUE || n3 != 0) && (peekedLong != 0L || n3 == 0)) {
            if (n3 == 0) {
                peekedLong = -peekedLong;
            }
            this.peekedLong = peekedLong;
            this.pos += peekedNumberLength;
            peeked = 15;
        }
        else {
            if (n != 2 && n != 4 && n != 7) {
                return 0;
            }
            this.peekedNumberLength = peekedNumberLength;
            peeked = 16;
        }
        return this.peeked = peeked;
    }
    
    private void push(final int n) {
        final int stackSize = this.stackSize;
        final int[] stack = this.stack;
        if (stackSize == stack.length) {
            final int newLength = stackSize * 2;
            this.stack = Arrays.copyOf(stack, newLength);
            this.pathIndices = Arrays.copyOf(this.pathIndices, newLength);
            this.pathNames = Arrays.copyOf(this.pathNames, newLength);
        }
        this.stack[this.stackSize++] = n;
    }
    
    private char readEscapeCharacter() throws IOException {
        if (this.pos == this.limit && !this.fillBuffer(1)) {
            throw this.syntaxError("Unterminated escape sequence");
        }
        final char[] buffer = this.buffer;
        final int pos = this.pos;
        final int n = pos + 1;
        this.pos = n;
        final char c = buffer[pos];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c == 'b') {
                    return '\b';
                }
                if (c == 'f') {
                    return '\f';
                }
                if (c == 'n') {
                    return '\n';
                }
                if (c == 'r') {
                    return '\r';
                }
                if (c == 't') {
                    return '\t';
                }
                if (c != 'u') {
                    throw this.syntaxError("Invalid escape sequence");
                }
                if (n + 4 > this.limit && !this.fillBuffer(4)) {
                    throw this.syntaxError("Unterminated escape sequence");
                }
                final char c2 = '\0';
                int pos2 = this.pos;
                char c3 = c2;
                while (true) {
                    final int n2 = pos2;
                    if (n2 >= pos2 + 4) {
                        this.pos += 4;
                        return c3;
                    }
                    int n3 = this.buffer[n2];
                    final char c4 = (char)(c3 << 4);
                    if (n3 >= 48 && n3 <= 57) {
                        n3 -= 48;
                    }
                    else {
                        if (n3 >= 97 && n3 <= 102) {
                            n3 -= 97;
                        }
                        else {
                            if (n3 < 65 || n3 > 70) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("\\u");
                                sb.append(new String(this.buffer, this.pos, 4));
                                throw new NumberFormatException(sb.toString());
                            }
                            n3 -= 65;
                        }
                        n3 += 10;
                    }
                    final char c5 = (char)(c4 + n3);
                    pos2 = n2 + 1;
                    c3 = c5;
                }
            }
        }
        else {
            ++this.lineNumber;
            this.lineStart = n;
        }
        return c;
    }
    
    private void skipQuotedValue(final char c) throws IOException {
        final char[] buffer = this.buffer;
    Label_0005:
        while (true) {
            int i;
            int lineStart;
            for (i = this.pos; i < this.limit; i = lineStart) {
                lineStart = i + 1;
                final char c2 = buffer[i];
                if (c2 == c) {
                    this.pos = lineStart;
                    return;
                }
                if (c2 == '\\') {
                    this.pos = lineStart;
                    this.readEscapeCharacter();
                    continue Label_0005;
                }
                if (c2 == '\n') {
                    ++this.lineNumber;
                    this.lineStart = lineStart;
                }
            }
            this.pos = i;
            if (this.fillBuffer(1)) {
                continue;
            }
            throw this.syntaxError("Unterminated string");
        }
    }
    
    private boolean skipTo(final String s) throws IOException {
        final int length = s.length();
        while (true) {
            final int pos = this.pos;
            final int limit = this.limit;
            int i = 0;
            if (pos + length > limit && !this.fillBuffer(length)) {
                return false;
            }
            final char[] buffer = this.buffer;
            final int pos2 = this.pos;
            Label_0107: {
                if (buffer[pos2] != '\n') {
                    while (i < length) {
                        if (this.buffer[this.pos + i] != s.charAt(i)) {
                            break Label_0107;
                        }
                        ++i;
                    }
                    return true;
                }
                ++this.lineNumber;
                this.lineStart = pos2 + 1;
            }
            ++this.pos;
        }
    }
    
    private void skipToEndOfLine() throws IOException {
        while (this.pos < this.limit || this.fillBuffer(1)) {
            final char[] buffer = this.buffer;
            final int pos = this.pos;
            final int n = pos + 1;
            this.pos = n;
            final char c = buffer[pos];
            if (c == '\n') {
                ++this.lineNumber;
                this.lineStart = n;
                break;
            }
            if (c == '\r') {
                break;
            }
        }
    }
    
    private void skipUnquotedValue() throws IOException {
        do {
            int n = 0;
            Label_0142: {
                Label_0138: {
                    int pos;
                    while (true) {
                        pos = this.pos;
                        if (pos + n >= this.limit) {
                            break;
                        }
                        final char c = this.buffer[pos + n];
                        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                            break Label_0142;
                        }
                        if (c == '#') {
                            break Label_0138;
                        }
                        if (c == ',') {
                            break Label_0142;
                        }
                        if (c == '/' || c == '=') {
                            break Label_0138;
                        }
                        if (c == '{' || c == '}' || c == ':') {
                            break Label_0142;
                        }
                        if (c == ';') {
                            break Label_0138;
                        }
                        switch (c) {
                            default: {
                                ++n;
                                continue;
                            }
                            case 92: {
                                break Label_0138;
                            }
                            case 91:
                            case 93: {
                                break Label_0142;
                            }
                        }
                    }
                    this.pos = pos + n;
                    continue;
                }
                this.checkLenient();
            }
            this.pos += n;
        } while (this.fillBuffer(1));
    }
    
    private IOException syntaxError(final String str) throws IOException {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.locationString());
        throw new MalformedJsonException(sb.toString());
    }
    
    public void beginArray() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        if (n == 3) {
            this.push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(this.peek());
        sb.append(this.locationString());
        throw new IllegalStateException(sb.toString());
    }
    
    public void beginObject() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        if (n == 1) {
            this.push(3);
            this.peeked = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(this.peek());
        sb.append(this.locationString());
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }
    
    int doPeek() throws IOException {
        final int[] stack = this.stack;
        final int stackSize = this.stackSize;
        final int n = stack[stackSize - 1];
        Label_0263: {
            if (n == 1) {
                stack[stackSize - 1] = 2;
                break Label_0263;
            }
            int peeked;
            if (n == 2) {
                final int nextNonWhitespace = this.nextNonWhitespace(true);
                if (nextNonWhitespace == 44) {
                    break Label_0263;
                }
                if (nextNonWhitespace == 59) {
                    this.checkLenient();
                    break Label_0263;
                }
                if (nextNonWhitespace == 93) {
                    return this.peeked = 4;
                }
                throw this.syntaxError("Unterminated array");
            }
            else if (n != 3 && n != 5) {
                if (n == 4) {
                    stack[stackSize - 1] = 5;
                    final int nextNonWhitespace2 = this.nextNonWhitespace(true);
                    if (nextNonWhitespace2 == 58) {
                        break Label_0263;
                    }
                    if (nextNonWhitespace2 != 61) {
                        throw this.syntaxError("Expected ':'");
                    }
                    this.checkLenient();
                    if (this.pos >= this.limit && !this.fillBuffer(1)) {
                        break Label_0263;
                    }
                    final char[] buffer = this.buffer;
                    final int pos = this.pos;
                    if (buffer[pos] == '>') {
                        this.pos = pos + 1;
                    }
                    break Label_0263;
                }
                else {
                    if (n == 6) {
                        if (this.lenient) {
                            this.consumeNonExecutePrefix();
                        }
                        this.stack[this.stackSize - 1] = 7;
                        break Label_0263;
                    }
                    if (n == 7) {
                        if (this.nextNonWhitespace(false) != -1) {
                            this.checkLenient();
                            --this.pos;
                            break Label_0263;
                        }
                        peeked = 17;
                    }
                    else {
                        if (n != 8) {
                            break Label_0263;
                        }
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
            }
            else {
                stack[stackSize - 1] = 4;
                if (n == 5) {
                    final int nextNonWhitespace3 = this.nextNonWhitespace(true);
                    if (nextNonWhitespace3 != 44) {
                        if (nextNonWhitespace3 != 59) {
                            if (nextNonWhitespace3 == 125) {
                                return this.peeked = 2;
                            }
                            throw this.syntaxError("Unterminated object");
                        }
                        else {
                            this.checkLenient();
                        }
                    }
                }
                final int nextNonWhitespace4 = this.nextNonWhitespace(true);
                if (nextNonWhitespace4 != 34) {
                    if (nextNonWhitespace4 != 39) {
                        if (nextNonWhitespace4 != 125) {
                            this.checkLenient();
                            --this.pos;
                            if (!this.isLiteral((char)nextNonWhitespace4)) {
                                throw this.syntaxError("Expected name");
                            }
                            peeked = 14;
                        }
                        else {
                            if (n != 5) {
                                return this.peeked = 2;
                            }
                            throw this.syntaxError("Expected name");
                        }
                    }
                    else {
                        this.checkLenient();
                        peeked = 12;
                    }
                }
                else {
                    peeked = 13;
                }
            }
            return this.peeked = peeked;
        }
        final int nextNonWhitespace5 = this.nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            final int peeked = 9;
            return this.peeked = peeked;
        }
        if (nextNonWhitespace5 == 39) {
            this.checkLenient();
            return this.peeked = 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                return this.peeked = 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    return this.peeked = 1;
                }
                --this.pos;
                final int peekKeyword = this.peekKeyword();
                if (peekKeyword != 0) {
                    return peekKeyword;
                }
                final int peekNumber = this.peekNumber();
                if (peekNumber != 0) {
                    return peekNumber;
                }
                if (this.isLiteral(this.buffer[this.pos])) {
                    this.checkLenient();
                    final int peeked = 10;
                    return this.peeked = peeked;
                }
                throw this.syntaxError("Expected value");
            }
            else if (n == 1) {
                return this.peeked = 4;
            }
        }
        if (n != 1 && n != 2) {
            throw this.syntaxError("Unexpected value");
        }
        this.checkLenient();
        --this.pos;
        return this.peeked = 7;
    }
    
    public void endArray() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        if (n == 4) {
            int stackSize = this.stackSize - 1;
            this.stackSize = stackSize;
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
            this.peeked = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(this.peek());
        sb.append(this.locationString());
        throw new IllegalStateException(sb.toString());
    }
    
    public void endObject() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        if (n == 2) {
            int stackSize = this.stackSize - 1;
            this.stackSize = stackSize;
            this.pathNames[stackSize] = null;
            final int[] pathIndices = this.pathIndices;
            --stackSize;
            ++pathIndices[stackSize];
            this.peeked = 0;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(this.peek());
        sb.append(this.locationString());
        throw new IllegalStateException(sb.toString());
    }
    
    public String getPath() {
        final StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int stackSize = this.stackSize, i = 0; i < stackSize; ++i) {
            final int n = this.stack[i];
            if (n != 1 && n != 2) {
                if (n == 3 || n == 4 || n == 5) {
                    sb.append('.');
                    final String[] pathNames = this.pathNames;
                    if (pathNames[i] != null) {
                        sb.append(pathNames[i]);
                    }
                }
            }
            else {
                sb.append('[');
                sb.append(this.pathIndices[i]);
                sb.append(']');
            }
        }
        return sb.toString();
    }
    
    public boolean hasNext() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        return n != 2 && n != 4;
    }
    
    public final boolean isLenient() {
        return this.lenient;
    }
    
    String locationString() {
        final int lineNumber = this.lineNumber;
        final int pos = this.pos;
        final int lineStart = this.lineStart;
        final StringBuilder sb = new StringBuilder();
        sb.append(" at line ");
        sb.append(lineNumber + 1);
        sb.append(" column ");
        sb.append(pos - lineStart + 1);
        sb.append(" path ");
        sb.append(this.getPath());
        return sb.toString();
    }
    
    public boolean nextBoolean() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        if (n == 5) {
            this.peeked = 0;
            final int[] pathIndices = this.pathIndices;
            final int n2 = this.stackSize - 1;
            ++pathIndices[n2];
            return true;
        }
        if (n == 6) {
            this.peeked = 0;
            final int[] pathIndices2 = this.pathIndices;
            final int n3 = this.stackSize - 1;
            ++pathIndices2[n3];
            return false;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected a boolean but was ");
        sb.append(this.peek());
        sb.append(this.locationString());
        throw new IllegalStateException(sb.toString());
    }
    
    public double nextDouble() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        if (n == 15) {
            this.peeked = 0;
            final int[] pathIndices = this.pathIndices;
            final int n2 = this.stackSize - 1;
            ++pathIndices[n2];
            return (double)this.peekedLong;
        }
        Label_0215: {
            if (n == 16) {
                this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
                this.pos += this.peekedNumberLength;
            }
            else {
                String peekedString;
                if (n != 8 && n != 9) {
                    if (n == 10) {
                        peekedString = this.nextUnquotedValue();
                    }
                    else {
                        if (n == 11) {
                            break Label_0215;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Expected a double but was ");
                        sb.append(this.peek());
                        sb.append(this.locationString());
                        throw new IllegalStateException(sb.toString());
                    }
                }
                else {
                    char c;
                    if (n == 8) {
                        c = '\'';
                    }
                    else {
                        c = '\"';
                    }
                    peekedString = this.nextQuotedValue(c);
                }
                this.peekedString = peekedString;
            }
        }
        this.peeked = 11;
        final double double1 = Double.parseDouble(this.peekedString);
        if (!this.lenient && (Double.isNaN(double1) || Double.isInfinite(double1))) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("JSON forbids NaN and infinities: ");
            sb2.append(double1);
            sb2.append(this.locationString());
            throw new MalformedJsonException(sb2.toString());
        }
        this.peekedString = null;
        this.peeked = 0;
        final int[] pathIndices2 = this.pathIndices;
        final int n3 = this.stackSize - 1;
        ++pathIndices2[n3];
        return double1;
    }
    
    public int nextInt() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        if (n == 15) {
            final long peekedLong = this.peekedLong;
            final int n2 = (int)peekedLong;
            if (peekedLong == n2) {
                this.peeked = 0;
                final int[] pathIndices = this.pathIndices;
                final int n3 = this.stackSize - 1;
                ++pathIndices[n3];
                return n2;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Expected an int but was ");
            sb.append(this.peekedLong);
            sb.append(this.locationString());
            throw new NumberFormatException(sb.toString());
        }
        else {
            if (n == 16) {
                this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
                this.pos += this.peekedNumberLength;
            }
            else {
                if (n != 8 && n != 9 && n != 10) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected an int but was ");
                    sb2.append(this.peek());
                    sb2.append(this.locationString());
                    throw new IllegalStateException(sb2.toString());
                }
                String peekedString;
                if (n == 10) {
                    peekedString = this.nextUnquotedValue();
                }
                else {
                    char c;
                    if (n == 8) {
                        c = '\'';
                    }
                    else {
                        c = '\"';
                    }
                    peekedString = this.nextQuotedValue(c);
                }
                this.peekedString = peekedString;
                try {
                    final int int1 = Integer.parseInt(this.peekedString);
                    this.peeked = 0;
                    final int[] pathIndices2 = this.pathIndices;
                    final int n4 = this.stackSize - 1;
                    ++pathIndices2[n4];
                    return int1;
                }
                catch (NumberFormatException ex) {}
            }
            this.peeked = 11;
            final double double1 = Double.parseDouble(this.peekedString);
            final int n5 = (int)double1;
            if (n5 == double1) {
                this.peekedString = null;
                this.peeked = 0;
                final int[] pathIndices3 = this.pathIndices;
                final int n6 = this.stackSize - 1;
                ++pathIndices3[n6];
                return n5;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Expected an int but was ");
            sb3.append(this.peekedString);
            sb3.append(this.locationString());
            throw new NumberFormatException(sb3.toString());
        }
    }
    
    public long nextLong() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        if (n == 15) {
            this.peeked = 0;
            final int[] pathIndices = this.pathIndices;
            final int n2 = this.stackSize - 1;
            ++pathIndices[n2];
            return this.peekedLong;
        }
        if (n == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        else {
            if (n != 8 && n != 9 && n != 10) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Expected a long but was ");
                sb.append(this.peek());
                sb.append(this.locationString());
                throw new IllegalStateException(sb.toString());
            }
            String peekedString;
            if (n == 10) {
                peekedString = this.nextUnquotedValue();
            }
            else {
                char c;
                if (n == 8) {
                    c = '\'';
                }
                else {
                    c = '\"';
                }
                peekedString = this.nextQuotedValue(c);
            }
            this.peekedString = peekedString;
            try {
                final long long1 = Long.parseLong(this.peekedString);
                this.peeked = 0;
                final int[] pathIndices2 = this.pathIndices;
                final int n3 = this.stackSize - 1;
                ++pathIndices2[n3];
                return long1;
            }
            catch (NumberFormatException ex) {}
        }
        this.peeked = 11;
        final double double1 = Double.parseDouble(this.peekedString);
        final long n4 = (long)double1;
        if (n4 == double1) {
            this.peekedString = null;
            this.peeked = 0;
            final int[] pathIndices3 = this.pathIndices;
            final int n5 = this.stackSize - 1;
            ++pathIndices3[n5];
            return n4;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected a long but was ");
        sb2.append(this.peekedString);
        sb2.append(this.locationString());
        throw new NumberFormatException(sb2.toString());
    }
    
    public String nextName() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        String s;
        if (n == 14) {
            s = this.nextUnquotedValue();
        }
        else {
            char c;
            if (n == 12) {
                c = '\'';
            }
            else {
                if (n != 13) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Expected a name but was ");
                    sb.append(this.peek());
                    sb.append(this.locationString());
                    throw new IllegalStateException(sb.toString());
                }
                c = '\"';
            }
            s = this.nextQuotedValue(c);
        }
        this.peeked = 0;
        return this.pathNames[this.stackSize - 1] = s;
    }
    
    public void nextNull() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        if (n == 7) {
            this.peeked = 0;
            final int[] pathIndices = this.pathIndices;
            final int n2 = this.stackSize - 1;
            ++pathIndices[n2];
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected null but was ");
        sb.append(this.peek());
        sb.append(this.locationString());
        throw new IllegalStateException(sb.toString());
    }
    
    public String nextString() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        String s = null;
        Label_0142: {
            if (n == 10) {
                s = this.nextUnquotedValue();
            }
            else {
                char c;
                if (n == 8) {
                    c = '\'';
                }
                else if (n == 9) {
                    c = '\"';
                }
                else {
                    if (n == 11) {
                        s = this.peekedString;
                        this.peekedString = null;
                        break Label_0142;
                    }
                    if (n == 15) {
                        s = Long.toString(this.peekedLong);
                        break Label_0142;
                    }
                    if (n == 16) {
                        s = new String(this.buffer, this.pos, this.peekedNumberLength);
                        this.pos += this.peekedNumberLength;
                        break Label_0142;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Expected a string but was ");
                    sb.append(this.peek());
                    sb.append(this.locationString());
                    throw new IllegalStateException(sb.toString());
                }
                s = this.nextQuotedValue(c);
            }
        }
        this.peeked = 0;
        final int[] pathIndices = this.pathIndices;
        final int n2 = this.stackSize - 1;
        ++pathIndices[n2];
        return s;
    }
    
    public JsonToken peek() throws IOException {
        int n;
        if ((n = this.peeked) == 0) {
            n = this.doPeek();
        }
        switch (n) {
            default: {
                throw new AssertionError();
            }
            case 17: {
                return JsonToken.END_DOCUMENT;
            }
            case 15:
            case 16: {
                return JsonToken.NUMBER;
            }
            case 12:
            case 13:
            case 14: {
                return JsonToken.NAME;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                return JsonToken.STRING;
            }
            case 7: {
                return JsonToken.NULL;
            }
            case 5:
            case 6: {
                return JsonToken.BOOLEAN;
            }
            case 4: {
                return JsonToken.END_ARRAY;
            }
            case 3: {
                return JsonToken.BEGIN_ARRAY;
            }
            case 2: {
                return JsonToken.END_OBJECT;
            }
            case 1: {
                return JsonToken.BEGIN_OBJECT;
            }
        }
    }
    
    public final void setLenient(final boolean lenient) {
        this.lenient = lenient;
    }
    
    public void skipValue() throws IOException {
        int n = 0;
        int n2 = 0;
        do {
            int n3;
            if ((n3 = this.peeked) == 0) {
                n3 = this.doPeek();
            }
            Label_0181: {
                if (n3 == 3) {
                    this.push(1);
                }
                else if (n3 == 1) {
                    this.push(3);
                }
                else {
                    if (n3 == 4 || n3 == 2) {
                        --this.stackSize;
                        n2 = n - 1;
                        break Label_0181;
                    }
                    if (n3 != 14 && n3 != 10) {
                        char c;
                        if (n3 != 8 && n3 != 12) {
                            if (n3 != 9 && n3 != 13) {
                                n2 = n;
                                if (n3 == 16) {
                                    this.pos += this.peekedNumberLength;
                                    n2 = n;
                                }
                                break Label_0181;
                            }
                            else {
                                c = '\"';
                            }
                        }
                        else {
                            c = '\'';
                        }
                        this.skipQuotedValue(c);
                        n2 = n;
                        break Label_0181;
                    }
                    this.skipUnquotedValue();
                    n2 = n;
                    break Label_0181;
                }
                n2 = n + 1;
            }
            this.peeked = 0;
        } while ((n = n2) != 0);
        final int[] pathIndices = this.pathIndices;
        final int stackSize = this.stackSize;
        final int n4 = stackSize - 1;
        ++pathIndices[n4];
        this.pathNames[stackSize - 1] = "null";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(this.locationString());
        return sb.toString();
    }
}
