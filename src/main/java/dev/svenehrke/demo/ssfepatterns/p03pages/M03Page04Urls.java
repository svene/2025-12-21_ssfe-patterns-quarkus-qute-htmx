package dev.svenehrke.demo.ssfepatterns.p03pages;

import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

//@TemplateData
@TemplateData(namespace = "m03page04")
public class M03Page04Urls {

	public static final String PAGE1_URL = "/m03pages/page04page01";
	public static final String PAGE2_URL = "/m03pages/page04page02";

}
