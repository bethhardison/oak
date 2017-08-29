package com.taiga.oak.tester;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by CJW on 2017/8/29.
 */
public class HttpTest {

  @Test
  public void test() throws IOException, URISyntaxException {
    URI uri = new URIBuilder()
        .setScheme("http")
        .setHost("www.google.com")
        .setPath("/search")
        .setParameter("q", "httpclient")
        .setParameter("btnG", "Google Search")
        .setParameter("aq", "f")
        .setParameter("oq", "")
        .build();
    HttpGet httpget = new HttpGet(uri);
    System.out.println(httpget.getURI());
  }
}
