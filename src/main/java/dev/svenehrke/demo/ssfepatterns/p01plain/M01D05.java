package dev.svenehrke.demo.ssfepatterns.p01plain;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = "m01d05")
public class M01D05 {
	public static final String URL = "/m01plain/page05withnestedcomponents";
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("Nested components"),
		new RawString("or: template in template"),
		new RawString("If you need components in content-parameters"),
		new RawString("Demo...")
	);

}
