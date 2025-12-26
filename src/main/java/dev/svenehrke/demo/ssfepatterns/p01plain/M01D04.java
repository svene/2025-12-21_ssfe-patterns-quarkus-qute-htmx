package dev.svenehrke.demo.ssfepatterns.p01plain;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = "m01d04")
public class M01D04 {
	public static final String URL = "/p01plain/page04withcontentparamscomponent";
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("Content parameter"),
		new RawString("passed from page to component"),
		new RawString("When html needs to be passed into component"),
		new RawString("Demo...")
	);

}
