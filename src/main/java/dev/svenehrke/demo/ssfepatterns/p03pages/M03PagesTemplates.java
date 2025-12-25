package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.p01plain.Page01Code;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

public class M03PagesTemplates {
	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
	static class Templates {
		public static native TemplateInstance page01contentpage(Page01Code code);
		public static native TemplateInstance page02contentpagewithparam(String greeting);
		public static native TemplateInstance page03custompagewithparam(String greeting);
	}
}
