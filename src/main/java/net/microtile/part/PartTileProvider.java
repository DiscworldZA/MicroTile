package net.microtile.part;

import net.microtile.MicroTile;
import codechicken.multipart.TMultiPart;

public class PartTileProvider extends TMultiPart {

	@Override
	public String getType() 
	{
		return MicroTile.MODID + "_multi_part_tile_provider";
	}
	
	public void onAdded()
	{
		
	}

}
