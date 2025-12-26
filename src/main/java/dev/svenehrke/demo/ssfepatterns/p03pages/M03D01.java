package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public class M03D01 {
	public static final String URL = "/p03pages/page01";
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		M03D01.URL,
		new RawString("Content Page"),
		null,
		new RawString("Recommended for most use cases"),
		new RawString("Demo...")
	);

}
