package dev.svenehrke.demo.ssfepatterns.p01plain;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = "m01d03")
public class M01D03 {
	public static final String URL = "/p01plain/page03withparamscomponent";
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("Page and Component"),
		new RawString("with parameters"),
		new RawString("When page and/or component need parameters"),
		new RawString("Demo...")
	);

}
