package s21212_java70;

class Tv {
	//Tv의 속성(맴버변수)
	int channel; //채널
	
	//Tv의 기능(매서드)
	void channelUp1()  { ++channel; }
	void channelUp()   { ++channel; }
}

  class SmartTvextendTv {
	boolean caption = true;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}			
}


