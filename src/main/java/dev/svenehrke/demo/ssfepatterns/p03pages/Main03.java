package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;

import java.util.List;

public class Main03 {
	public static final List<MainCardInfo> P03_PAGES_CARD_INFOS =
		List.of(
			new MainCardInfo(
				M03Page01Resource.URL,
				new RawString("Content Page"),
				null,
				new RawString("Recommended for most use cases"),
				new RawString("Demo...")
			),
			new MainCardInfo(
				M03Page02Resource.URL + "?greeting=Hello",
				new RawString("Content Page"),
				new RawString("taking a parameter"),
				new RawString("When the page itself needs a parameter"),
				new RawString("Demo...")
			),
			new MainCardInfo(
				M03Page03Resource.URL + "?greeting=Hello",
				new RawString("Custom Page"),
				new RawString("taking a parameter"),
				new RawString("When the opinionated content page does not fit"),
				new RawString("Demo...")
			),
			new MainCardInfo(
				M03Page04Resource.PAGE1_URL,
				new RawString("MPA Example"),
				new RawString("with menu"),
				null,
				new RawString("Demo...")
			)
		);
}
