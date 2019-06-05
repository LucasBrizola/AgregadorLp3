package com.fundatec.lp3.agregador.domain;

import java.util.ArrayList;

public class Secreto {
	private String debug;
	private ArrayList<Windows> windows = new ArrayList<Windows>();

	public String getDebug() {
		return debug;
	}

	public void setDebug(String debug) {
		this.debug = debug;
	}

	public ArrayList<Windows> getWindows() {
		return windows;
	}

	public void setWindows(ArrayList<Windows> windows) {
		this.windows = windows;
	}
}
