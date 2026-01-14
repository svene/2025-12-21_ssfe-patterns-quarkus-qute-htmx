package dev.svenehrke.demo.ssfepatterns.m03pages;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public class M03Routing {
	@Path("/")
	public static class M03D01Routing {
		public static final String URL = "/m03/d01";
		@GET
		@Path(URL)
		public TemplateInstance page() {
			return Templates.m03d01();
		}
	}

	@Path("/")
	public static class M03D02Routing {
		public static final String URL = "/m03/d02";
		@GET
		@Path(URL)
		public TemplateInstance m03d02e(
			@QueryParam("greeting") @DefaultValue("-") String greeting
		) {
			return Templates.m03d02(greeting);
		}
	}

	@Path("/")
	public static class M03D03Routing {
		public static final String URL = "/m03/d03";
		@GET
		@Path(URL)
		public TemplateInstance m03d02e(
			@QueryParam("greeting") @DefaultValue("-") String greeting
		) {
			return Templates.m03d02(greeting);
		}
	}

	@Path("/")
	@TemplateData(namespace = TemplateData.SIMPLENAME)
	public static class M03D04Routing {
		public static final String PAGE1_URL = "/m03/d04p1";
		public static final String PAGE2_URL = "/m03/d04p2";
		@GET
		@Path(PAGE1_URL)
		public TemplateInstance page1() {
			return Templates.m03d04p1();
		}

		@GET
		@Path(PAGE2_URL)
		public TemplateInstance page2() {
			return Templates.m03d04p2();
		}
	}


	// D04 --------------------------------------------

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
	private static class Templates {
		public static native TemplateInstance m03d01();
		public static native TemplateInstance m03d02(String greeting);
		public static native TemplateInstance m03d03(String greeting);
		public static native TemplateInstance m03d04p1();
		public static native TemplateInstance m03d04p2();
	}

}
