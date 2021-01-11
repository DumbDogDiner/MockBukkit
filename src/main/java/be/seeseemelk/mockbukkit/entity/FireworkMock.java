package be.seeseemelk.mockbukkit.entity;

import java.util.UUID;

import org.apache.commons.lang.Validate;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.jetbrains.annotations.NotNull;

import be.seeseemelk.mockbukkit.ServerMock;
import be.seeseemelk.mockbukkit.UnimplementedOperationException;
import be.seeseemelk.mockbukkit.inventory.meta.FireworkMetaMock;
import org.jetbrains.annotations.Nullable;

/**
 * This is a simple mock of the {@link Firework} {@link Entity}. It takes a {@link FireworkMeta} to carry all
 * properties.
 * 
 * @author TheBusyBiscuit
 *
 */
public class FireworkMock extends ProjectileMock implements Firework
{

	private FireworkMeta meta;
	private boolean shotAtAngle = false;

	public FireworkMock(@NotNull ServerMock server, @NotNull UUID uuid)
	{
		this(server, uuid, new FireworkMetaMock());
	}

	public FireworkMock(@NotNull ServerMock server, @NotNull UUID uuid, @NotNull FireworkMeta meta)
	{
		super(server, uuid);

		this.meta = meta.clone();
	}

	@Override
	public boolean isInWater() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public EntityType getType()
	{
		return EntityType.FIREWORK;
	}

	@Override
	public @NotNull FireworkMeta getFireworkMeta()
	{
		return meta;
	}

	@Override
	public void setFireworkMeta(@NotNull FireworkMeta meta)
	{
		Validate.notNull(meta, "FireworkMeta cannot be null!");
		this.meta = meta.clone();
	}

	@Override
	public void detonate()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isShotAtAngle()
	{
		return shotAtAngle;
	}

	@Override
	public void setShotAtAngle(boolean shotAtAngle)
	{
		this.shotAtAngle = shotAtAngle;
	}

	@Nullable
	@Override
	public UUID getSpawningEntity() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Nullable
	@Override
	public LivingEntity getBoostedEntity() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public Spigot spigot()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Nullable
	@Override
	public Location getOrigin() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean fromMobSpawner() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@NotNull
	@Override
	public Chunk getChunk() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@NotNull
	@Override
	public CreatureSpawnEvent.SpawnReason getEntitySpawnReason() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isInRain() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isInBubbleColumn() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isInWaterOrRain() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isInWaterOrBubbleColumn() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isInWaterOrRainOrBubbleColumn() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isInLava() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isTicking() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

}
