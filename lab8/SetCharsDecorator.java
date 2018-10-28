
public class SetCharsDecorator implements CardDecorator {
	private int loopNum;
	private int boundary;
	private int offset;
	private StringBuilder sb;
	
	public SetCharsDecorator() {
		loopNum = 0;
		offset = 0;
	}
	
	public String addChar(String x, char ch, int len) {
		x = x.replaceAll(ch + "", "");
		StringBuilder sb = new StringBuilder(x);
		
		boundary = sb.length() / len;
		if (x.length() == boundary * len) {
			boundary--;
		}
		
		for (loopNum = 0; loopNum < boundary; loopNum++) {
			System.err.println("len: " + sb.length() + " loop: " + (sb.length() / len));
			sb.insert(offset + len, ch);
			offset = offset + len + 1; 
		}
		
		offset = 0;
		
		return sb + "";
	}

	@Override
	public String delSpace(String x, String y) {
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
