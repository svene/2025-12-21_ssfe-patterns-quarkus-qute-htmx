package dev.svenehrke.demo.ssfepatterns.m03pages;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M03D04Code {
	String HTML = """
      {#include dev/svenehrke/demo/ssfepatterns/m03pages/m03d04mpalayout selectedMenu = "page2"}
      <div>
        <h4>Page 2</h4>
      </div>
      {/include}
      """;
	String LAYOUT = """
      <!DOCTYPE html>
      <html lang="en">
      ...
      <div class="container mt-1">
        <nav class="navbar" role="navigation" aria-label="main navigation">
          <div class="navbar-menu">
            <div class="navbar-start">
              <a class="navbar-item {#if selectedMenu == 'page1'}is-selected{/if}" href="{M03D04Routing:PAGE1_URL}">Page 1</a>
              <a class="navbar-item {#if selectedMenu == 'page2'}is-selected{/if}" href="{M03D04Routing:PAGE2_URL}">Page 2</a>
            </div>
          </div>
        </nav>
      <div class="p-1 mt-1 area-border" style="min-height: 500px">
        {#insert}{/insert}
      </div>
      ...
      """;
	String JAVA = """
      @Path("/")
      public class M03D04Routing {
        public static final String PAGE1_URL = "/m03/d04p1";
        public static final String PAGE2_URL = "/m03/d04p2";

        @GET
        @Path(PAGE1_URL)
        public TemplateInstance page1() {
          return Templates.m03d04();
        }

        @GET
        @Path(PAGE2_URL)
        public TemplateInstance page2() {
          return Templates.m03d04();
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
        private static class Templates {
          public static native TemplateInstance m03d04p1();
          public static native TemplateInstance m03d04p2();
        }
      }
      """;
}
