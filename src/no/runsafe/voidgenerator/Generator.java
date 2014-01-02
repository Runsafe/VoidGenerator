package no.runsafe.voidgenerator;

import no.runsafe.framework.minecraft.Item;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Arrays;
import java.util.Random;

public class Generator extends ChunkGenerator
{
	@Override
	public byte[][] generateBlockSections(World world, Random random, int cx, int cz, BiomeGrid biomes)
	{
		byte air = (byte) Item.Unavailable.Air.getType().getId();
		byte[][] chunk = new byte[8][4096];
		for (int n = 0; n < 8; ++n)
			Arrays.fill(chunk[n], air);

		if (cx == 0 && cz == 0)
			chunk[4][0] = (byte) Item.BuildingBlock.Stone.getType().getId();

		return chunk;
	}
}
