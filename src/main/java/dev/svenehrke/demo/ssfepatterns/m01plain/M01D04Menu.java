package dev.svenehrke.demo.ssfepatterns.m01plain;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D04Menu {
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		M01D04.URL,
		new RawString("Content parameter"),
		new RawString("passed from page to component"),
		new RawString("When html needs to be passed into component"),
		new RawString("Demo...")
	);
}
