package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public class M03D02 {
	public static final String URL = "/m03pages/page02";
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL + "?greeting=Hello",
		new RawString("Content Page"),
		new RawString("taking a parameter"),
		new RawString("When the page itself needs a parameter"),
		new RawString("Demo...")
	);

}
