package dev.svenehrke.demo.ssfepatterns.p01greeting;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/greetingpage")
public class P01GreetingPageResource {

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01greeting")
	static class Templates {
		// parameter name must be "name"
		public static native TemplateInstance greetingpage(String name);
	}
	@GET
	public TemplateInstance greetingPage() {
		return Templates.greetingpage("Bart");
	}
}
