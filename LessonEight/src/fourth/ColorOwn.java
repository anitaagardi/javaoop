package fourth;

import java.awt.Color;

public class ColorOwn {
	private Color c;

	public ColorOwn(Color c) {
		super();
		this.c = c;
	}

	public String toString() {
		if (c == Color.BLACK)
			return "fekete";
		if (c == Color.BLUE)
			return "kék";
		if (c == Color.CYAN)
			return "cián";
		if (c == Color.GRAY)
			return "szürke";
		if (c == Color.GREEN)
			return "zöld";
		if(c == Color.RED)
			return "piros";
		else
			return "még nincs magyarra fordítva...";
	}

}
