package net.microtile.tile;

import net.minecraft.tileentity.TileEntity;
import codechicken.multipart.PartMap;
import codechicken.multipart.TMultiPart;
import codechicken.multipart.TileMultipart;

public class TileMultiTileProvider extends TileMultipart 
{
	private TileEntity[] m_tiles;
	
	public TileMultiTileProvider()
	{
		m_tiles = new TileEntity[PartMap.EDGE_XPP.i];
	}
	
	public boolean addTileEntity(int pos, TileEntity tile)
	{
		if(m_tiles[pos] != null)
		{
			return false;
		}
		
		if(tile == null)
		{
			return false;
		}
		
		m_tiles[pos] = tile;
		
		return true;
	}
	
	public boolean addtileEntity(PartMap pos, TileEntity tile)
	{
		return addTileEntity(pos.i, tile);
	}
	
	public void removeTileEntity(int pos)
	{
		m_tiles[pos] = null;
	}
	
	public void removeTileEntity(PartMap pos)
	{
		removeTileEntity(pos.i);
	}
	
	public void partAdded(TMultiPart part)
	{
		
	}
	
	public void partRemoved(TMultiPart part, int pos)
	{
		removeTileEntity(pos);
	}
}
