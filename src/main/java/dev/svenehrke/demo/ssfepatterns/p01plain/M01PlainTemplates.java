package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;

public class M01PlainTemplates {
	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
	static class Templates {
		public static native TemplateInstance page02withcomponent(Page02Code code);
		public static native TemplateInstance page03withparamscomponent(Page03Code code);
		public static native TemplateInstance page04withcontentparamscomponent(Page04Code code);
		public static native TemplateInstance page05withnestedcomponents(Page05Code code);
	}
}
