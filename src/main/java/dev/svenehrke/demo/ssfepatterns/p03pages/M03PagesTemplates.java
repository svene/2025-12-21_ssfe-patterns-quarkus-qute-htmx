package dev.svenehrke.demo.ssfepatterns.p03pages;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

public class M03PagesTemplates {
	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
	static class Templates {
		public static native TemplateInstance page01contentpage();
		public static native TemplateInstance page02contentpagewithparam(String greeting);
		public static native TemplateInstance page03custompagewithparam(String greeting);
		public static native TemplateInstance page04mpapage1();
		public static native TemplateInstance page04mpapage2();
	}
}
