package net.microtile.part;

import net.microtile.MicroTile;
import net.microtile.tile.TileMultiTileProvider;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import codechicken.lib.vec.BlockCoord;
import codechicken.multipart.MultipartGenerator;
import codechicken.multipart.TMultiPart;

public class PartTileProvider extends TMultiPart {

	private Block m_parent;
	
	@Override
	public String getType() 
	{
		return MicroTile.MODID + "_multi_part_tile_provider";
	}
	
	
	
	public boolean addPart(World world, BlockCoord pos, TMultiPart part)
	{
		if(world.isRemote) {System.out.print("Cannot add multi parts to a client tile."); return;}
        return MultipartGenerator.addPart(world, pos, part);
	}

}
