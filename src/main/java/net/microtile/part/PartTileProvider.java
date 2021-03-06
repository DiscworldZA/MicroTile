package net.microtile.part;

import net.microtile.MicroTile;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import codechicken.multipart.TMultiPart;

public class PartTileProvider extends TMultiPart
{
	
	private Block m_parent;
	private TileEntity m_parentTile;
	
	public PartTileProvider(Block b)
	{
		m_parent = b;
		m_parentTile = b.createTileEntity(tile().getWorldObj(), tile().blockMetadata);
	}
	
	@Override
	public String getType()
	{
		return MicroTile.MODID + "_multi_part_tile_provider_" + m_parent.getUnlocalizedName();
	}
	
	public Iterable<ItemStack> getDrops()
	{
		return m_parent.getDrops(tile().getWorldObj(), tile().xCoord, tile().yCoord, tile().zCoord, tile().blockMetadata, 0);
	}
	
	public void update()
	{
		m_parent.updateTick(tile().getWorldObj(), tile().xCoord, tile().yCoord, tile().zCoord, tile().getWorldObj().rand);
		m_parentTile.updateEntity();
	}
	

	
}
