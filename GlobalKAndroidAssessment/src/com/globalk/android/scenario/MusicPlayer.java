package com.globalk.android.scenario;


public class MusicPlayer extends PageObjects {
		
	 @CacheLookup
     @FindBy(id = "toolbar")
     public WebElement toolbar;
	 
	 @CacheLookup
     @FindBy(xpath = "ViewGroup[1]/id/design_menu_item_text")
     public WebElement AllMusic;
	 
	 @CacheLookup
     @FindBy(xpath = "layout/watch_card_contetnt")
     public WebElement Genres;
	 
	 @CacheLookup
     @FindBy(xpath = "RelativeLayout[0]/layout/media_list_item")
     public WebElement Rock;
	 
	 @CacheLookup
     @FindBy(xpath = "RelativeLayout[0]/Linearlayout[1]")
     public WebElement Awakening;
	 
	 @CacheLookup
     @FindBy(id = "content")
     public WebElement viewMedia;
	 
	 @CacheLookup
     @FindBy(id = "play_pause")
     public WebElement PlayandPause;
	 
	 @CacheLookup
     @FindBy(id = "next")
     public WebElement next;
	 
	 @CacheLookup
     @FindBy(id = "prev")
     public WebElement previous;
	 
	 
	 public MusicPlayer(AndroidDriver driver) {
			super(driver);
		
		}
	 
	 public boolean isInitialized() {
			
			return  toolbar.isDisplayed();
			
		}
	 
	 public void VerifyNavigateToAwakingSong(){
			
			this.toolbar.click();
			
			this.AllMusic.click();
			
			this.Genres.click();
			
			this.Rock.click();
			
			this.Awakening.click();
			
	 }
	 
	 public void VerifyMediaPlayer(){
			
		 	this.viewMedia.click();
			
			this.PlayandPause.click();
			
			this.next.click();
			
			this.previous.click();
			
				
			}

	   
	   
}
