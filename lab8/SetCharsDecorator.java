package lab8;

public class SetCharsDecorator implements CardDecorator {
	private int i;
	private int limit;
	private int offset;
	
	public SetCharsDecorator() {
		i = 0;
		offset = 0;
	}
	
	public String addChar4Card(String s, char ch) {
		
		if ((s.length() == 4)|| (s.length() == 9) || (s.length() == 14)) {
			s = s + ch;
		}
		
		return s;
	}
	
	@Override
	public String addChar4Exp(String s, char ch) {
		if (s.length() == 2) {
			s = s + ch;
		}
		
		return s;
	}

	@Override
	public String delChar(String x, String y) {
		StringBuilder sb = new StringBuilder(x);
		if (sb.indexOf(y) != -1) {
			if (sb.charAt(sb.length() - 2) == y.charAt(0)) {
				x = sb.substring(0, sb.length()-1);
				sb.replace(0, sb.length(), x);
			} 
		}
		
		x = sb.substring(0, sb.length()-1);

		return x;
	}
}
