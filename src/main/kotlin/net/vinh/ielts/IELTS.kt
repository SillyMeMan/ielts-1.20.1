package net.vinh.ielts

import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object IELTS : ModInitializer {
	const val MOD_ID = "ielts"
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		LOGGER.info("IELTS Loaded")
	}

	fun id(name: String) : Identifier? {
		return Identifier.of(MOD_ID, name)
	}
}