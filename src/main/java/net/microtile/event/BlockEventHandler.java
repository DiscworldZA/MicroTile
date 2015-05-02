package net.microtile.event;

import net.minecraftforge.event.world.BlockEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

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
