package dev.svenehrke.demo.ssfepatterns.m03pages;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

import static dev.svenehrke.demo.ssfepatterns.m03pages.M03Routing.M03D03_URL;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M03Menus {
	MainCardInfo M03D01_CARD_INFO = new MainCardInfo(
		M03D01.URL,
		new RawString("Content Page"),
		null,
		new RawString("Recommended for most use cases"),
		new RawString("Demo...")
	);
	MainCardInfo M03D02_CARD_INFO = new MainCardInfo(
		M03D02.URL + "?greeting=Hello",
		new RawString("Content Page"),
		new RawString("taking a parameter"),
		new RawString("When the page itself needs a parameter"),
		new RawString("Demo...")
	);
	MainCardInfo M03D03_CARD_INFO = new MainCardInfo(
		M03D03_URL + "?greeting=Hello",
		new RawString("Custom Page"),
		new RawString("taking a parameter"),
		new RawString("When the opinionated content page does not fit"),
		new RawString("Demo...")
	);
}
