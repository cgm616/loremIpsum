package com.cgm616.LoremIpsum.core;

import com.cgm616.LoremIpsum.core.helper.LocalizationHelper;
import com.cgm616.LoremIpsum.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	
	public static void loadLanguages()
	{
		for(String localizationFile: Localizations.localeFiles)
		{
			LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationHelper.getLocaleFromFile(localizationFile), LocalizationHelper.isXmlLanguageFile(localizationFile));
		}
	}

}
