package com.configuration.property;

import java.io.IOException;

public class FileReadManager {

	private FileReadManager() {
	}

	public static FileReadManager GetInstance() {
		FileReadManager fr = new FileReadManager();
		return fr;
	}

	public ConfigureReader CrInstance() throws IOException {
		ConfigureReader cr = new ConfigureReader();
		return cr;

	}
}
