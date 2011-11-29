package entry;

import static org.junit.Assert.*;

import org.junit.Test;

public class GamePlayerTest {

    @Test
    public void judgeForOnce() {
        GamePlayer player = new GamePlayer();
        assertTrue(player.say("Integer"));
        assertFalse(player.say("Integer"));
    }

    @Test
    public void matchUpToCorrectAnswer() {
        GamePlayer player = new GamePlayer();
        assertTrue(player.say("Integer"));
        assertFalse(player.say("List"));
    }

    @Test
    public void recrodInAllAnswer() {
        GamePlayer player = new GamePlayer();
        player.say("Integer");
        player.say("String");
        assertEquals(2, (int)player.allRecord());

        player.say("Integer");
        player.say("List");
        assertEquals(4, (int)player.allRecord());
    }

    @Test
    public void outAnswerCount() {
        GamePlayer player = new GamePlayer();
        player.say("Set");
        player.say("List");
        assertEquals(2, (int)player.outCount());

        player.say("Integer");
        assertEquals(2, (int)player.outCount());

        player.say("Integer");
        assertEquals(3, (int)player.outCount());
    }
}
