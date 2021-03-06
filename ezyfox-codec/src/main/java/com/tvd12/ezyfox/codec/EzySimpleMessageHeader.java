package com.tvd12.ezyfox.codec;

import lombok.Getter;

@Getter
public class EzySimpleMessageHeader implements EzyMessageHeader {

	protected boolean bigSize;
	protected boolean encrypted;
	protected boolean compressed;
	protected boolean text;
	
	public EzySimpleMessageHeader(
			boolean bigSize,
			boolean encrypted, boolean compressed, boolean text) {
		this.bigSize = bigSize;
		this.encrypted = encrypted;
		this.compressed = compressed;
		this.text = text;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
				.append("<")
				.append("bigSize: ")
					.append(bigSize)
					.append(", ")
				.append("encrypted: ")
					.append(encrypted)
					.append(", ")
				.append("compressed: ")
					.append(compressed)
					.append(", ")
				.append("text: ")
					.append(text)
				.append(">")
				.toString();
	}
	
}
