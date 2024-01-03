package no.runsafe.dergons.event;

import no.runsafe.framework.api.player.IPlayer;
import no.runsafe.framework.minecraft.event.player.RunsafeCustomEvent;

public class DergonVexEvent extends RunsafeCustomEvent
{
	public DergonVexEvent(IPlayer player)
	{
		super(player, "runsafe.dergons.vex");
	}

	@Override
	public Object getData()
	{
		return null;
	}
}
