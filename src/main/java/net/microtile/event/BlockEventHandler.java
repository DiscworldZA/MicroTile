package net.microtile.event;

import codechicken.multipart.TMultiPart;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;

public class BlockEventHandler
{
	@SubscribeEvent
	public void BlockPlacedEvent(BlockEvent.PlaceEvent event)
	{
		if(event.block.hasTileEntity(event.blockMetadata))
		{
			System.out.println(event.block.getLocalizedName() + " has TE");
		}
	}
	
}
