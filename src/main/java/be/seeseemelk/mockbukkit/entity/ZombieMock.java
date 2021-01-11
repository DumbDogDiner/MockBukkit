package be.seeseemelk.mockbukkit.entity;

import java.util.UUID;

import com.destroystokyo.paper.block.TargetBlockInfo;
import com.destroystokyo.paper.entity.Pathfinder;
import com.destroystokyo.paper.entity.TargetEntityInfo;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.*;

import be.seeseemelk.mockbukkit.ServerMock;
import be.seeseemelk.mockbukkit.UnimplementedOperationException;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ZombieMock extends MonsterMock implements Zombie
{
	private boolean baby;
	private boolean villager;
	private Villager.Profession profession;
	private boolean converting;
	private int conversionTime;

	public ZombieMock(ServerMock server, UUID uuid)
	{
		super(server, uuid);
		setMaxHealth(20);
		setHealth(20);
	}

	@Override
	public boolean isInWater() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public EntityType getType()
	{
		return EntityType.ZOMBIE;
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

	@Override
	public boolean isBaby()
	{
		return baby;
	}

	@Override
	public void setBaby(boolean baby)
	{
		this.baby = baby;
	}

	@Override
	public boolean isVillager()
	{
		return villager;
	}

	/**
	 * This are unimplemented because they Bukkit specifies they should always fail? (@Contract Tag)
	 * 
	 * @param villager If the zombie is a village
	 */
	@Override
	public void setVillager(boolean villager)
	{
		this.villager = villager;
		throw new UnimplementedOperationException();
	}

	/**
	 * This are unimplemented because they Bukkit specifies they should always fail? (@Contract Tag)
	 * 
	 * @param profession Villager profession to use
	 */
	@Override
	public void setVillagerProfession(Villager.Profession profession)
	{
		throw new UnimplementedOperationException();
	}

	@Override
	public Villager.Profession getVillagerProfession()
	{
		return profession;
	}

	@Override
	public boolean isConverting()
	{
		return converting;
	}

	@Override
	public int getConversionTime()
	{
		return conversionTime;
	}

	@Override
	public void setConversionTime(int conversionTime)
	{
		this.conversionTime = conversionTime;
	}

	@Override
	public boolean isDrowning() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void startDrowning(int drownedConversionTime) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void stopDrowning() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setArmsRaised(boolean raised) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isArmsRaised() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean shouldBurnInDay() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setShouldBurnInDay(boolean shouldBurnInDay) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean canBreakDoors() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setCanBreakDoors(boolean canBreakDoors) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public int getAge()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setAge(int age)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setAgeLock(boolean lock)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean getAgeLock()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setBaby()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setAdult()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isAdult()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean canBreed()
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setBreed(boolean breed)
	{
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@NotNull
	@Override
	public Pathfinder getPathfinder() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isInDaylight() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Nullable
	@Override
	public Block getTargetBlock(int maxDistance, @NotNull TargetBlockInfo.FluidMode fluidMode) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Nullable
	@Override
	public BlockFace getTargetBlockFace(int maxDistance, @NotNull TargetBlockInfo.FluidMode fluidMode) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Nullable
	@Override
	public TargetBlockInfo getTargetBlockInfo(int maxDistance, @NotNull TargetBlockInfo.FluidMode fluidMode) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Nullable
	@Override
	public Entity getTargetEntity(int maxDistance, boolean ignoreBlocks) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Nullable
	@Override
	public TargetEntityInfo getTargetEntityInfo(int maxDistance, boolean ignoreBlocks) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setKiller(@Nullable Player killer) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public int getArrowsStuck() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setArrowsStuck(int arrows) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public int getShieldBlockingDelay() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setShieldBlockingDelay(int delay) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Nullable
	@Override
	public ItemStack getActiveItem() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void clearActiveItem() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public int getItemUseRemainingTime() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public int getHandRaisedTime() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isHandRaised() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public boolean isJumping() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setJumping(boolean jumping) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void playPickupItemAnimation(@NotNull Item item, int quantity) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public float getHurtDirection() {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}

	@Override
	public void setHurtDirection(float hurtDirection) {
		// TODO Auto-generated method stub
		throw new UnimplementedOperationException();
	}
}
