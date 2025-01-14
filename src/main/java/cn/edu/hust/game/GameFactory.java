package cn.edu.hust.game;

import cn.edu.hust.level.Level;
import cn.edu.hust.level.PlayerFactory;


/**
 *@author ouyangwenzhe
 */
public class GameFactory {

    /**
     * The factory providing the player objects.
     */
    private final PlayerFactory playerFactory;

    /**
     * Creates a new game factory.
     *
     * @param playerFactory
     *            The factory providing the player objects.
     */
    public GameFactory(PlayerFactory playerFactory) {
        this.playerFactory = playerFactory;
    }

    /**
     * Creates a game for a single level with one player.
     *
     * @param level
     *            The level to create a game for.
     * @return A new single player game.
     */
    public AbstractGame createSinglePlayerGame(Level level) {
        return new SinglePlayerAbstractGame(playerFactory.createPacMan(), level);
    }

    /**
     * Returns the player factory associated with this game factory.
     *
     * @return The player factory associated with this game factory.
     */
    protected PlayerFactory getPlayerFactory() {
        return playerFactory;
    }
}
