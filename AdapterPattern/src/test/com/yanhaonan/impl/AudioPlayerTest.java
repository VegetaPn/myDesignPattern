package test.com.yanhaonan.impl; 

import com.yanhaonan.iface.MediaPlayer;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

/** 
* AudioPlayer Tester. 
* 
* @author <Authors name> 
* @since <pre>Feb 19, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring.xml")
public class AudioPlayerTest {

    @Autowired
    private MediaPlayer audioPlayer;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: play(String mediaType, String title)
    *
    */
    @Test
    public void testPlay() throws Exception {
        assertNotNull(audioPlayer);
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }


} 
