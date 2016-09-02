
public class Tv implements Volume,Channel {
	
	int channelNumber;
	int volumeNumber;
	static int maxChannelNumebr = 100;
	static int minChannelNumebr = 1;
	static int maxVolumeNumebr = 40;
	static int minVolumeNumebr = 0;
	boolean state;
	
	public void powerOn(){
		if(state==false){state = true;}
	}
	
	public void powerOff(){
		if(state==true){state = false;}
	}
	
	public void channelNumberUp(int channelNumber){
	
		if(channelNumber==maxChannelNumebr)
		{
			channelNumber = minChannelNumber;
		}
		else{
			volumeNumber--;
		}
	}
	
	public void channelNumberDown(int channelNumber){
		if(channelNumber==minChannelNumebr)
		{
			channelNumber = maxChannelNumber;
		}
		else{
			volumeNumber--;
		}
	}
	
	public void volumeUp(int volumeNumber){
		
		if(volumeNumber==maxVolume)
		{
			/*Flash a message saying that max volume reached*/
		}
		else{
			volumeNumber++;
		}
	}
	public void volumeDown(int volumeNumber){
		
		if(volumeNumber==minVolume)
		{
			/*Flash a message saying that min volume reached*/
		}
		else{
			volumeNumber--;
		}
	}
}
