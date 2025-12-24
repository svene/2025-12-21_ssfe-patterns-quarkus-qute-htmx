package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class P01PlainQuteResource {

	public static final String PAGE_01_URL = "/p01plain/page01";
	public static final String PAGE_02_URL = "/p01plain/page02withcomponent";
	public static final String PAGE_03_URL = "/p01plain/page03withparamscomponent";
	public static final String PAGE_04_URL = "/p01plain/page04withcontentparamscomponent";

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
	static class Templates {
		public static native TemplateInstance page01(Page01Code code);
		public static native TemplateInstance page02withcomponent();
		public static native TemplateInstance page03withparamscomponent();
		public static native TemplateInstance page04withcontentparamscomponent();
	}
	@GET
	@Path(PAGE_01_URL)
	public TemplateInstance page01() {
		return Templates.page01(new Page01Code());
	}
	@GET
	@Path(PAGE_02_URL)
	public TemplateInstance page02withcomponent() {
		return Templates.page02withcomponent();
	}
	@GET
	@Path(PAGE_03_URL)
	public TemplateInstance page03withparamscomponent() {
		return Templates.page03withparamscomponent();
	}
	@GET
	@Path(PAGE_04_URL)
	public TemplateInstance page04withcontentparamscomponent() {
		return Templates.page04withcontentparamscomponent();
	}
}
