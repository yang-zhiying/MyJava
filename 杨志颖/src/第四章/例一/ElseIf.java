package 第四章.例一;

public class ElseIf {
	/*
	 *1.问题背景：一年中
	 * */
	private String season;
	private int month;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public void judgeSeason() {
		
		if(month ==12 || month== 1 || month==2) {
			season="Winter";
		}
		else if(month == 3 || month==4 ||month == 5) {
			season="Spring";
		}
		else if(month==6 || month == 7 || month== 8) {
			season="Summer";
		}
		else if(month== 9 || month==10 || month ==11) {
			season="Autumn";
		}
		else {
			season="no season";
		}
		System.out.println("Month "+ month+" belongs to "+season);
	}
}
