package com.globalk.android.test;

import com.globalk.android.scenario.MusicPlayer;

public class MusicPlayerTest {

	 @Test
	    public void testmusicplayer()
	    {
		 MusicPlayer musicplayer = new MusicPlayer();
		 
	        musicplayer.VerifyNavigateToAwakingSong();
	        
	        musicplayer.VerifyMediaPlayer();
	          
	        }

	    }
	


