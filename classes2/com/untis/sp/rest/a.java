// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.sp.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.HttpRequest;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.io.InputStream;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import w5.d;
import org.springframework.util.StringUtils;
import java.text.ParseException;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.http.InvalidMediaTypeException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import org.springframework.http.RequestEntity;
import java.net.URI;
import java.net.URLEncoder;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.HttpMethod;
import java.util.Collections;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.Date;
import java.util.Collection;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.RequestEntity$BodyBuilder;
import w5.c;
import java.util.Iterator;
import java.util.List;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import java.util.ArrayList;
import org.springframework.web.client.RestClientException;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.DateFormat;
import org.springframework.util.MultiValueMap;
import org.springframework.http.HttpStatus;
import w5.b;
import java.util.Map;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component("com.untis.sp.rest.ApiClient")
public class a
{
    private boolean a;
    private HttpHeaders b;
    private String c;
    private RestTemplate d;
    private Map<String, w5.b> e;
    private HttpStatus f;
    private MultiValueMap<String, String> g;
    private DateFormat h;
    
    public a() {
        this.a = false;
        this.b = new HttpHeaders();
        this.c = "http://localhost/api";
        this.d = this.c();
        this.l();
    }
    
    @Autowired
    public a(final RestTemplate d) {
        this.a = false;
        this.b = new HttpHeaders();
        this.c = "http://localhost/api";
        this.d = d;
        this.l();
    }
    
    private void F(final String[] array, final MultiValueMap<String, String> multiValueMap, final HttpHeaders httpHeaders) {
        for (final String str : array) {
            final w5.b b = this.e.get(str);
            if (b == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Authentication undefined: ");
                sb.append(str);
                throw new RestClientException(sb.toString());
            }
            b.applyToParams(multiValueMap, httpHeaders);
        }
    }
    
    public a A(final DateFormat h) {
        this.h = h;
        return this;
    }
    
    public void B(final boolean a) {
        final List interceptors = this.d.getInterceptors();
        Label_0112: {
            List<b> interceptors2;
            if (a) {
                if ((interceptors2 = (List<b>)interceptors) == null) {
                    interceptors2 = new ArrayList<b>();
                }
                interceptors2.add(new b());
            }
            else {
                if (interceptors == null || interceptors.isEmpty()) {
                    break Label_0112;
                }
                final Iterator<b> iterator = interceptors.iterator();
                while (true) {
                    interceptors2 = (List<b>)interceptors;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    if (!(((ClientHttpRequestInterceptor)iterator.next()) instanceof b)) {
                        continue;
                    }
                    iterator.remove();
                }
            }
            this.d.setInterceptors((List)interceptors2);
        }
        this.a = a;
    }
    
    public void C(final String s) {
        for (final w5.b b : this.e.values()) {
            if (b instanceof w5.c) {
                ((w5.c)b).c(s);
                return;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }
    
    public a D(final String s) {
        this.a("User-Agent", s);
        return this;
    }
    
    public void E(final String s) {
        for (final w5.b b : this.e.values()) {
            if (b instanceof w5.c) {
                ((w5.c)b).d(s);
                return;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }
    
    public a a(final String s, final String s2) {
        if (this.b.containsKey((Object)s)) {
            this.b.remove((Object)s);
        }
        this.b.add(s, s2);
        return this;
    }
    
    protected void b(final HttpHeaders httpHeaders, final RequestEntity$BodyBuilder requestEntity$BodyBuilder) {
        for (final Map.Entry<K, List> entry : httpHeaders.entrySet()) {
            for (final String s : entry.getValue()) {
                if (s != null) {
                    requestEntity$BodyBuilder.header((String)entry.getKey(), new String[] { s });
                }
            }
        }
    }
    
    protected RestTemplate c() {
        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory((ClientHttpRequestFactory)new BufferingClientHttpRequestFactory(restTemplate.getRequestFactory()));
        return restTemplate;
    }
    
    public String d(final c other, final Collection<? extends CharSequence> collection) {
        if (com.untis.sp.rest.a.c.L.equals(other)) {
            return this.r(collection);
        }
        c h;
        if ((h = other) == null) {
            h = com.untis.sp.rest.a.c.H;
        }
        return h.d(collection);
    }
    
    public String e(final Date date) {
        return this.h.format(date);
    }
    
    public w5.b f(final String s) {
        return this.e.get(s);
    }
    
    public Map<String, w5.b> g() {
        return this.e;
    }
    
    public String h() {
        return this.c;
    }
    
    public DateFormat i() {
        return this.h;
    }
    
    public MultiValueMap<String, String> j() {
        return this.g;
    }
    
    public HttpStatus k() {
        return this.f;
    }
    
    protected void l() {
        (this.h = (DateFormat)new com.untis.sp.rest.b()).setTimeZone(TimeZone.getTimeZone("UTC"));
        this.D("Java-SDK");
        final HashMap<String, w5.b> hashMap = new HashMap<String, w5.b>();
        this.e = hashMap;
        this.e = (Map<String, w5.b>)Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public <T> T m(String s, HttpMethod httpMethod, final MultiValueMap<String, String> ex, final Object o, final HttpHeaders httpHeaders, final MultiValueMap<String, Object> multiValueMap, final List<MediaType> list, final MediaType mediaType, String[] iterator, final ParameterizedTypeReference<T> parameterizedTypeReference) throws RestClientException {
        this.F(iterator, (MultiValueMap<String, String>)ex, httpHeaders);
        s = (String)UriComponentsBuilder.fromHttpUrl(this.c).path(s);
        Label_0120: {
            if (ex == null) {
                break Label_0120;
            }
            iterator = (String[])(Object)((MultiValueMap)ex).values().iterator();
        Label_0068:
            while (true) {
                Label_0114: {
                    List<String> list2;
                    int n;
                    while (true) {
                        while (((Iterator)(Object)iterator).hasNext()) {
                            list2 = ((Iterator<List<String>>)(Object)iterator).next();
                            if (list2 != null) {
                                n = 0;
                                break Label_0068;
                            }
                        }
                        break Label_0114;
                        if (n >= list2.size()) {
                            continue;
                        }
                        break;
                    }
                    while (true) {
                        try {
                            list2.set(n, URLEncoder.encode(list2.get(n), "utf8"));
                            ++n;
                            continue Label_0068;
                            while (true) {
                                try {
                                    s = (String)RequestEntity.method(httpMethod, new URI(((UriComponentsBuilder)s).build().toUriString()));
                                    if (list != null) {
                                        ((RequestEntity$BodyBuilder)s).accept((MediaType[])list.toArray(new MediaType[list.size()]));
                                    }
                                    if (mediaType != null) {
                                        ((RequestEntity$BodyBuilder)s).contentType(mediaType);
                                    }
                                    this.b(httpHeaders, (RequestEntity$BodyBuilder)s);
                                    this.b(this.b, (RequestEntity$BodyBuilder)s);
                                    s = (String)((RequestEntity$BodyBuilder)s).body(this.t(o, multiValueMap, mediaType));
                                    s = (String)this.d.exchange((RequestEntity)s, (ParameterizedTypeReference)parameterizedTypeReference);
                                    this.f = ((ResponseEntity)s).getStatusCode();
                                    this.g = (MultiValueMap<String, String>)((ResponseEntity)s).getHeaders();
                                    if (((ResponseEntity)s).getStatusCode() == HttpStatus.NO_CONTENT) {
                                        return null;
                                    }
                                    if (!((ResponseEntity)s).getStatusCode().is2xxSuccessful()) {
                                        s = (String)new StringBuilder();
                                        ((StringBuilder)s).append("API returned ");
                                        ((StringBuilder)s).append(this.f);
                                        ((StringBuilder)s).append(" and it wasn't handled by the RestTemplate error handler");
                                        throw new RestClientException(((StringBuilder)s).toString());
                                    }
                                    if (parameterizedTypeReference == null) {
                                        return null;
                                    }
                                    return (T)((ResponseEntity)s).getBody();
                                }
                                catch (URISyntaxException ex) {
                                    httpMethod = (HttpMethod)new StringBuilder();
                                    ((StringBuilder)httpMethod).append("Could not build URL: ");
                                    ((StringBuilder)httpMethod).append(((UriComponentsBuilder)s).toUriString());
                                    throw new RestClientException(((StringBuilder)httpMethod).toString(), (Throwable)ex);
                                }
                                ((UriComponentsBuilder)s).queryParams((MultiValueMap)ex);
                                continue;
                            }
                        }
                        catch (UnsupportedEncodingException ex2) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    public boolean n() {
        return this.a;
    }
    
    public boolean o(final String anObject) {
        if ("*/*".equals(anObject)) {
            return true;
        }
        try {
            return this.p(MediaType.parseMediaType(anObject));
        }
        catch (InvalidMediaTypeException ex) {
            return false;
        }
    }
    
    public boolean p(final MediaType mediaType) {
        return mediaType != null && (MediaType.APPLICATION_JSON.isCompatibleWith(mediaType) || mediaType.getSubtype().matches("^.*\\+json[;]?\\s*$"));
    }
    
    public MultiValueMap<String, String> q(final c c, final String s, final Object o) {
        final LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
        if (s != null && !s.isEmpty() && o != null) {
            c h;
            if ((h = c) == null) {
                h = com.untis.sp.rest.a.c.H;
            }
            String s2;
            if (o instanceof Collection) {
                final Collection collection = (Collection)o;
                if (collection.isEmpty()) {
                    return (MultiValueMap<String, String>)linkedMultiValueMap;
                }
                if (h.equals(com.untis.sp.rest.a.c.L)) {
                    final Iterator<Object> iterator = collection.iterator();
                    while (iterator.hasNext()) {
                        ((MultiValueMap)linkedMultiValueMap).add((Object)s, (Object)this.r(iterator.next()));
                    }
                    return (MultiValueMap<String, String>)linkedMultiValueMap;
                }
                final ArrayList<String> list = new ArrayList<String>();
                final Iterator<Object> iterator2 = collection.iterator();
                while (iterator2.hasNext()) {
                    list.add(this.r(iterator2.next()));
                }
                s2 = h.d(list);
            }
            else {
                s2 = this.r(o);
            }
            ((MultiValueMap)linkedMultiValueMap).add((Object)s, (Object)s2);
            return (MultiValueMap<String, String>)linkedMultiValueMap;
        }
        return (MultiValueMap<String, String>)linkedMultiValueMap;
    }
    
    public String r(final Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Date) {
            return this.e((Date)obj);
        }
        if (obj instanceof Collection) {
            final StringBuilder sb = new StringBuilder();
            for (final Object next : (Collection)obj) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(String.valueOf(next));
            }
            return sb.toString();
        }
        return String.valueOf(obj);
    }
    
    public Date s(final String source) {
        try {
            return this.h.parse(source);
        }
        catch (ParseException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    protected Object t(Object o, final MultiValueMap<String, Object> multiValueMap, final MediaType mediaType) {
        if (MediaType.MULTIPART_FORM_DATA.isCompatibleWith(mediaType) || MediaType.APPLICATION_FORM_URLENCODED.isCompatibleWith(mediaType)) {
            o = multiValueMap;
        }
        return o;
    }
    
    public List<MediaType> u(final String[] array) {
        if (array.length == 0) {
            return null;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            final MediaType mediaType = MediaType.parseMediaType(array[i]);
            if (this.p(mediaType)) {
                return Collections.singletonList(mediaType);
            }
        }
        return (List<MediaType>)MediaType.parseMediaTypes(StringUtils.arrayToCommaDelimitedString((Object[])array));
    }
    
    public MediaType v(final String[] array) {
        if (array.length == 0) {
            return MediaType.APPLICATION_JSON;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            final MediaType mediaType = MediaType.parseMediaType(array[i]);
            if (this.p(mediaType)) {
                return mediaType;
            }
        }
        return MediaType.parseMediaType(array[0]);
    }
    
    public void w(final String s) {
        for (final w5.b b : this.e.values()) {
            if (b instanceof w5.a) {
                ((w5.a)b).e(s);
                return;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }
    
    public void x(final String s) {
        for (final w5.b b : this.e.values()) {
            if (b instanceof w5.a) {
                ((w5.a)b).f(s);
                return;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }
    
    public a y(final String c) {
        this.c = c;
        return this;
    }
    
    public void z(final String s) {
        for (final w5.b b : this.e.values()) {
            if (b instanceof d) {
                ((d)b).b(s);
                return;
            }
        }
        throw new RuntimeException("No Bearer authentication configured!");
    }
    
    private class b implements ClientHttpRequestInterceptor
    {
        private final Log a;
        
        private b() {
            this.a = LogFactory.getLog((Class)b.class);
        }
        
        private String a(final InputStream in) throws IOException {
            final StringBuilder sb = new StringBuilder();
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
            while (true) {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append(System.lineSeparator());
            }
            bufferedReader.close();
            return sb.toString();
        }
        
        private String b(final HttpHeaders httpHeaders) {
            final StringBuilder sb = new StringBuilder();
            for (final Map.Entry<String, V> entry : httpHeaders.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=[");
                final Iterator iterator2 = ((List)entry.getValue()).iterator();
                while (iterator2.hasNext()) {
                    sb.append(iterator2.next());
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
                sb.append("],");
            }
            sb.setLength(sb.length() - 1);
            return sb.toString();
        }
        
        private void d(final HttpRequest httpRequest, final byte[] bytes) throws UnsupportedEncodingException {
            final Log a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("URI: ");
            sb.append(httpRequest.getURI());
            a.info((Object)sb.toString());
            final Log a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("HTTP Method: ");
            sb2.append(httpRequest.getMethod());
            a2.info((Object)sb2.toString());
            final Log a3 = this.a;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("HTTP Headers: ");
            sb3.append(this.b(httpRequest.getHeaders()));
            a3.info((Object)sb3.toString());
            final Log a4 = this.a;
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Request Body: ");
            sb4.append(new String(bytes, StandardCharsets.UTF_8));
            a4.info((Object)sb4.toString());
        }
        
        private void e(final ClientHttpResponse clientHttpResponse) throws IOException {
            final Log a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("HTTP Status Code: ");
            sb.append(clientHttpResponse.getRawStatusCode());
            a.info((Object)sb.toString());
            final Log a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Status Text: ");
            sb2.append(clientHttpResponse.getStatusText());
            a2.info((Object)sb2.toString());
            final Log a3 = this.a;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("HTTP Headers: ");
            sb3.append(this.b(clientHttpResponse.getHeaders()));
            a3.info((Object)sb3.toString());
            final Log a4 = this.a;
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Response Body: ");
            sb4.append(this.a(clientHttpResponse.getBody()));
            a4.info((Object)sb4.toString());
        }
        
        public ClientHttpResponse c(final HttpRequest httpRequest, final byte[] array, final ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
            this.d(httpRequest, array);
            final ClientHttpResponse execute = clientHttpRequestExecution.execute(httpRequest, array);
            this.e(execute);
            return execute;
        }
    }
    
    public enum c
    {
        H(","), 
        I("\t"), 
        J(" "), 
        K("|"), 
        L((String)null);
        
        private final String G;
        
        private c(final String g) {
            this.G = g;
        }
        
        private String d(final Collection<? extends CharSequence> collection) {
            return StringUtils.collectionToDelimitedString((Collection)collection, this.G);
        }
    }
}
