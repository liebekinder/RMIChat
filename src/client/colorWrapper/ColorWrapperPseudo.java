package client.colorWrapper;

import java.awt.Color;

public class ColorWrapperPseudo extends ColorWrapperBase implements IColorWrapper{

	@Override
	public void addFormatedText(String text) {

		String[] pseudo = text.split("\\]");
		if(pseudo.length>1) {
			
			chatRoomGui.addText("[",Color.RED);
			chatRoomGui.addText(pseudo[0].substring(1), Color.LIGHT_GRAY);
			chatRoomGui.addText("]",Color.RED);
			chatRoomGui.addText(text.substring(pseudo[0].length()+1));
		}
		else {
			chatRoomGui.addText(text,Color.ORANGE);
		}

	}
}