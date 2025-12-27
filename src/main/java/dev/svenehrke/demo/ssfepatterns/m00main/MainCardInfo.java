package dev.svenehrke.demo.ssfepatterns.m00main;

import io.quarkus.qute.RawString;

public record MainCardInfo(
	String url,
	RawString title,
	RawString subTitle,
	RawString recommendation,
	RawString content
) {
}
