package no.runsafe.voidgenerator;

import no.runsafe.framework.RunsafePlugin;
import org.bukkit.generator.ChunkGenerator;

public class Plugin extends RunsafePlugin
{
	@Override
	protected void PluginSetup()
	{
	}

	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id)
	{
		return new Generator();
	}
}
