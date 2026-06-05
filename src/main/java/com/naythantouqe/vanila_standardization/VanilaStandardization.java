package com.naythantouqe.vanila_standardization;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanilaStandardization implements ModInitializer {
	public static final String MOD_ID = "vanilastandardization";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello myself world!");
	}
}