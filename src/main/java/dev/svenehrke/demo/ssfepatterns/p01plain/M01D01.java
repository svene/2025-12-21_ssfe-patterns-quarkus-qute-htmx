package dev.svenehrke.demo.ssfepatterns.p01plain;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = "m01d01")
@Path("/")
public class M01D01 {
	public static final String URL = "/p01plain/page01";
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		M01D01.URL,
		new RawString("Basic<br>QUTE Page"),
		new RawString("made using a QUTE template"),
		null,
		new RawString("Demo...")
	);
	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
	static class Templates {
		public static native TemplateInstance page01(Page01Code code);
	}
	@GET
	@Path(M01D01.URL)
	public TemplateInstance page() {
		return M01D01.Templates.page01(new Page01Code());
	}

}
