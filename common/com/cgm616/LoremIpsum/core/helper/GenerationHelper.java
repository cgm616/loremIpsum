package com.cgm616.LoremIpsum.core.helper;

import com.cgm616.LoremIpsum.core.GenerationHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class GenerationHelper {

	public static void addGen() {
		GameRegistry.registerWorldGenerator(new GenerationHandler());
	}

}
