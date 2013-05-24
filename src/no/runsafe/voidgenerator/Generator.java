package no.runsafe.voidgenerator;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Arrays;
import java.util.Random;

public class Generator extends ChunkGenerator
{
	@Override
	public byte[][] generateBlockSections(World world, Random random, int cx, int cz, BiomeGrid biomes)
	{
		byte air = (byte) Material.AIR.getId();
		byte[][] chunk = new byte[8][4096];
		for (int n = 0; n < 8; ++n)
			Arrays.fill(chunk[n], air);

		if (cx == 0 && cz == 0)
			chunk[4][0] = (byte) Material.STONE.getId();

		return chunk;
	}
}
