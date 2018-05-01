package pkgEnum;

public enum eDrawCount {
	DEFAULT(-1), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);

	private int iDrawCnt;

	private eDrawCount(int iDrawCnt) {
		this.iDrawCnt = iDrawCnt;
	}

	public int getiDrawCnt() {
		return iDrawCnt;
	}
}
