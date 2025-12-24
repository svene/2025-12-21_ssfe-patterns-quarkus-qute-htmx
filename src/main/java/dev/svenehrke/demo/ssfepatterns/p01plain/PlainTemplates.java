package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

public class PlainTemplates {
	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
	static class Templates {
		public static native TemplateInstance page01(Page01Code code);
		public static native TemplateInstance page02withcomponent(Page02Code code);
		public static native TemplateInstance page03withparamscomponent(Page03Code code);
		public static native TemplateInstance page04withcontentparamscomponent();
	}
}
