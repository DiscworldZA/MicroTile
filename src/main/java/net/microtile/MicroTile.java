package net.microtile;

import java.io.File;

import net.microtile.event.BlockEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MicroTile.MODID, name = MicroTile.MODNAME, version = MicroTile.VERSION)
public class MicroTile
{
	public static final String MODID = "MT";
	public static final String MODNAME = "MicroTile";
	public static final String VERSION = "0.0.1 Alpha";
	
	public void preInit(FMLPreInitializationEvent event)
	{
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new BlockEventHandler());
	}
}
