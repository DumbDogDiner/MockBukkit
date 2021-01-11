package be.seeseemelk.mockbukkit.block;

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.List;

import com.destroystokyo.paper.block.BlockSoundGroup;
import org.apache.commons.lang.Validate;
import org.bukkit.Chunk;
import org.bukkit.FluidCollisionMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;

import be.seeseemelk.mockbukkit.UnimplementedOperationException;
import be.seeseemelk.mockbukkit.block.data.BlockDataMock;
import be.seeseemelk.mockbukkit.block.state.BlockStateMock;
import be.seeseemelk.mockbukkit.metadata.MetadataTable;
import junit.framework.AssertionFailedError;

public class BlockMock implements Block
{
	private final MetadataTable metadataTable = new MetadataTable();
	
	private final Location location;
	private BlockStateMock state;
	private Material material;
	private byte data;
	private BlockData blockData;

	/**
	 * Creates a basic block made of air.
	 */
	public BlockMock()
	{
		this(Material.AIR);
	}

	/**
	 * Creates a basic block made of air at a certain location.
	 * 
	 * @param location The location of the block.
	 */
	public BlockMock(Location location)
	{
		this(Material.AIR, location);
	}

	/**
	 * Creates a basic block with a given material.
	 * 
	 * @param material The material to give the block.
	 */
	public BlockMock(Material material)
	{
		this(material, null);
	}

	/**
	 * Creates a basic block with a given material that is also linked to a specific location.
	 * 
	 * @param material The material of the block.
	 * @param location The location of the block. Can be {@code null} if not needed.
	 */
	public BlockMock(Material material, Location location)
	{
		this.material = material;
		this.location = location;
		this.state = BlockStateMock.mockState(this);
		this.blockData = new BlockDataMock(material);
	}

	@Override
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue)
	{
		metadataTable.setMetadata(metadataKey, newMetadataValue);
	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey)
	{
		return metadataTable.getMetadata(metadataKey);
	}

	@Override
	public boolean hasMetadata(String metadataKey)
	{
		return metadataTable.hasMetadata(metadataKey);
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin)
	{
		metadataTable.removeMetadata(metadataKey, owningPlugin);
	}

	@Override
	@Deprecated
	public byte getData()
	{
		return data;
	}

	@Override
	public Block getRelative(int modX, int modY, int modZ)
	{
		int x = location.getBlockX() + modX;
		int y = location.getBlockY() + modY;
		int z = location.getBlockZ() + modZ;
		return location.getWorld().getBlockAt(x, y, z);
	}

	@Override
	public Block getRelative(BlockFace face)
	{
		return getRelative(face, 1);
	}

	@Override
	public Block getRelative(BlockFace face, int distance)
	{
		return getRelative(face.getModX() * distance, face.getModY() * distance, face.getModZ() * distance);
	}

	/**
	 * Assets that the material type of the block is equal to a given type.
	 * 
	 * @param material The material type that the block should have.
	 * @throws AssertionFailedError Thrown if the material type of the block does not equal the given material type.
	 */
	public void assertType(Material material) throws AssertionFailedError
	{
		if (this.material != material)
		{
			fail(String.format("Block material type is <%s>, but <%s> was expected.", this.material, material));
		}
	}

	@Override
	public Material getType()
	{
		return material;
	}

	@Override
	public byte getLightLevel()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public byte getLightFromSky()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public byte getLightFromBlocks()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public World getWorld()
	{
		return location.getWorld();
	}

	@Override
	public int getX()
	{
		return location.getBlockX();
	}

	@Override
	public int getY()
	{
		return location.getBlockY();
	}

	@Override
	public int getZ()
	{
		return location.getBlockZ();
	}

	@Override
	public Location getLocation()
	{
		return location;
	}

	@Override
	public Location getLocation(Location loc)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public Chunk getChunk()
	{
		return location.getWorld().getChunkAt(this);
	}

	@Override
	public void setType(Material type)
	{
		material = type;
		state = BlockStateMock.mockState(this);
		blockData = new BlockDataMock(type);
	}

	@Override
	public void setType(Material type, boolean applyPhysics)
	{
		setType(material);
	}

	@Override
	public BlockFace getFace(Block block)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public BlockState getState()
	{
		// This will always return a snapshot of the BlockState, not the actual state.
		// This is optional with Paper but for Spigot it simply works like that.
		return state.getSnapshot();
	}

	@NotNull
	@Override
	public BlockState getState(boolean useSnapshot) {
		if (useSnapshot)
			return getState();
		throw new UnimplementedOperationException();
	}

	@Override
	public Biome getBiome()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setBiome(Biome bio)
	{

		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isBlockPowered()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isBlockIndirectlyPowered()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isBlockFacePowered(BlockFace face)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isBlockFaceIndirectlyPowered(BlockFace face)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public int getBlockPower(BlockFace face)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public int getBlockPower()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isEmpty()
	{
		return material == Material.AIR;
	}

	@Override
	public boolean isLiquid()
	{
		return material == Material.LAVA
		    || material == Material.WATER
		    || material == Material.BUBBLE_COLUMN;
	}

	@Override
	public boolean isBuildable() {
		// TODO: Stub
		return !isLiquid();
	}

	@Override
	public boolean isBurnable() {
		// TODO not exhaustive
		switch (material) {
			case ACACIA_WOOD:
			case BIRCH_WOOD:
			case OAK_WOOD:
			case JUNGLE_WOOD:
			case SPRUCE_WOOD:
			case DARK_OAK_WOOD:
			case STRIPPED_ACACIA_WOOD:
			case STRIPPED_BIRCH_WOOD:
			case STRIPPED_OAK_WOOD:
			case STRIPPED_JUNGLE_WOOD:
			case STRIPPED_SPRUCE_WOOD:
			case STRIPPED_DARK_OAK_WOOD:
			case STRIPPED_ACACIA_LOG:
			case STRIPPED_BIRCH_LOG:
			case STRIPPED_OAK_LOG:
			case STRIPPED_JUNGLE_LOG:
			case STRIPPED_SPRUCE_LOG:
			case STRIPPED_DARK_OAK_LOG:
			case ACACIA_STAIRS:
			case BIRCH_STAIRS:
			case OAK_STAIRS:
			case JUNGLE_STAIRS:
			case SPRUCE_STAIRS:
			case DARK_OAK_STAIRS:
			case ACACIA_SLAB:
			case BIRCH_SLAB:
			case OAK_SLAB:
			case JUNGLE_SLAB:
			case SPRUCE_SLAB:
			case DARK_OAK_SLAB:
			case ACACIA_PLANKS:
			case BIRCH_PLANKS:
			case OAK_PLANKS:
			case JUNGLE_PLANKS:
			case SPRUCE_PLANKS:
			case DARK_OAK_PLANKS:
				return true;
			default:
				return false;
		}
	}

	@Override
	public boolean isReplaceable() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isSolid() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public double getTemperature()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public double getHumidity()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public PistonMoveReaction getPistonMoveReaction()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean breakNaturally()
	{
		if (this.isEmpty())
		{
			return false;
		}
		this.setType(Material.AIR);
		return true;
	}

	@Override
	public boolean breakNaturally(ItemStack tool)
	{
		return this.breakNaturally();
	}

	@Override
	public boolean breakNaturally(@NotNull ItemStack tool, boolean triggerEffect) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public Collection<ItemStack> getDrops()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public Collection<ItemStack> getDrops(ItemStack tool)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public BlockData getBlockData()
	{
		return blockData;
	}

	@Override
	public void setBlockData(@NotNull BlockData data)
	{
		this.blockData = data;
	}

	@Override
	public void setBlockData(BlockData data, boolean applyPhysics)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isPassable()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public RayTraceResult rayTrace(Location start, Vector direction, double maxDistance, FluidCollisionMode fluidCollisionMode)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public BoundingBox getBoundingBox()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@NotNull
	@Override
	public BlockSoundGroup getSoundGroup() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@NotNull
	@Override
	public String getTranslationKey() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@NotNull
	@Override
	public float getDestroySpeed(@NotNull ItemStack itemStack) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public Collection<ItemStack> getDrops(ItemStack tool, Entity entity)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	/**
	 * This method sets the current {@link BlockState} to the provided {@link BlockStateMock}.
	 * <strong>Do not call this method directly, use {@link BlockState#update()} instead.</strong>
	 * 
	 * @param state The {@link BlockState} that should be set.
	 */
	public void setState(@NotNull BlockStateMock state)
	{
		Validate.notNull(state, "The BlockState cannot be null");
		this.state = state;
	}
	
	@Override
	public boolean applyBoneMeal(BlockFace face)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}
}
