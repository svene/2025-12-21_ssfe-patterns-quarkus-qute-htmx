package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public class M03D04 {
	public static final String PAGE1_URL = "/m03pages/page04page01";
	public static final String PAGE2_URL = "/m03pages/page04page02";
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		PAGE1_URL,
		new RawString("MPA Example"),
		new RawString("with menu"),
		null,
		new RawString("Demo...")
	);

}
