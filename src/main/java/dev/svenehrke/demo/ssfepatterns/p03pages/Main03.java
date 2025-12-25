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
			)
		);
}
