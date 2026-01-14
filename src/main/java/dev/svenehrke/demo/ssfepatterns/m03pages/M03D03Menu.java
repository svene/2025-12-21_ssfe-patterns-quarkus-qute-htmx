package dev.svenehrke.demo.ssfepatterns.m03pages;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

import static dev.svenehrke.demo.ssfepatterns.m03pages.Routing.M03D03_URL;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M03D03Menu {
	MainCardInfo CARD_INFO  = new MainCardInfo(
		M03D03_URL + "?greeting=Hello",
		new RawString("Custom Page"),
		new RawString("taking a parameter"),
		new RawString("When the opinionated content page does not fit"),
		new RawString("Demo...")
	);
}
