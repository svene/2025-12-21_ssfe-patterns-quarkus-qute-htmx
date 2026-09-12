package dev.svenehrke.demo.hypermediapatterns.s03pages;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public class S03Routing {
	// docs:start d01
	@Path("/")
	public static class S03D01Routing {
		public static final String URL = "/s03/d01";
		@GET
		@Path(URL)
		public TemplateInstance page() {
			return Templates.s03d01();
		}
	}
	// docs:end d01

	// docs:start d02
	@Path("/")
	public static class S03D02Routing {
		public static final String URL = "/s03/d02";
		@GET
		@Path(URL)
		public TemplateInstance page(
			@QueryParam("greeting") @DefaultValue("-") String greeting
		) {
			return Templates.s03d02(greeting);
		}
	}
	// docs:end d02

	// docs:start d03
	@Path("/")
	public static class S03D03Routing {
		public static final String URL = "/s03/d03";
		@GET
		@Path(URL)
		public TemplateInstance page(
			@QueryParam("greeting") @DefaultValue("-") String greeting
		) {
			return Templates.s03d03(greeting);
		}
	}
	// docs:end d03

	// docs:start d04
	@Path("/")
	@TemplateData(namespace = TemplateData.SIMPLENAME)
	public static class S03D04Routing {
		public static final String PAGE1_URL = "/s03/d04p1";
		public static final String PAGE2_URL = "/s03/d04p2";
		@GET
		@Path(PAGE1_URL)
		public TemplateInstance page1() {
			return Templates.s03d04p1();
		}

		@GET
		@Path(PAGE2_URL)
		public TemplateInstance page2() {
			return Templates.s03d04p2();
		}
	}
	// docs:end d04



	@CheckedTemplate(basePath = "dev/svenehrke/demo/hypermediapatterns/s03pages")
	private static class Templates {
		public static native TemplateInstance s03d01();
		public static native TemplateInstance s03d02(String greeting);
		public static native TemplateInstance s03d03(String greeting);
		public static native TemplateInstance s03d04p1();
		public static native TemplateInstance s03d04p2();
	}

}
