package realmrelay.packets.server;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import realmrelay.packets.Packet;


public class QuestObjIdPacket extends Packet {
	
	public int objectId;

	@Override
	public void parseFromInput(DataInput in) throws IOException {
		this.objectId = in.readInt();
	}

	@Override
	public void writeToOutput(DataOutput out) throws IOException {
		out.writeInt(this.objectId);
	}

}
