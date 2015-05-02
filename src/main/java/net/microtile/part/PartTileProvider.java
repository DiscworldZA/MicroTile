package net.microtile.part;

import net.microtile.MicroTile;
import net.microtile.tile.TileMultiTileProvider;
import net.minecraft.block.Block;
import codechicken.multipart.TMultiPart;

public class PartTileProvider extends TMultiPart {

	private Block m_parent;
	
	@Override
	public String getType() 
	{
		return MicroTile.MODID + "_multi_part_tile_provider";
	}
	
	
	
	public void onAdded()
	{
		if(!(this.tile() instanceof TileMultiTileProvider))
		{
			
		}
	}

}
