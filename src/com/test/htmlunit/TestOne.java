package com.test.htmlunit;

import org.junit.Test;

import junit.framework.Assert;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class TestOne {

    @Test
    public void homePage() throws Exception {
        final WebClient webClient = new WebClient(
                BrowserVersion.INTERNET_EXPLORER_9);
        final HtmlPage page = webClient
                .getPage("http://htmlunit.sourceforge.net");
        Assert.assertEquals("HtmlUnit - Welcome to HtmlUnit",
                page.getTitleText());

        final String pageAsXml = page.asXml();
        Assert.assertTrue(pageAsXml.contains("<body class=\"composite\">"));

        final String pageAsText = page.asText();
        Assert.assertTrue(pageAsText
                .contains("Support for the HTTP and HTTPS protocols"));

        webClient.closeAllWindows();
    }

}
