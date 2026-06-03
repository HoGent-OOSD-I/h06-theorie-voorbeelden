package utils;

public enum Kleur {
	ROOD("(255, 0, 0)", "#ff0000"), GEEL("(255, 255, 0)", "#ffff00"), BLAUW("(0, 0, 255)", "#0000ff"),
	WIT("(255, 255, 255", "#ffffff"), ZWART("(0,0,0)", "#000000"); // <1>

	private final String hexCode; // <2>
	private final String rgbCode;

	private Kleur(String rgbCode, String hexCode) { // <3>
		this.rgbCode = rgbCode;
		this.hexCode = hexCode;
	}

	public String getRgbCode() {
		return rgbCode;
	}

	public String getHexCode() {
		return hexCode;
	}

	@Override
	public String toString() { // <4>
		return String.format("%s - RGB%s - Hex: %s", name().toLowerCase(), getRgbCode(), getHexCode());
	}
}
