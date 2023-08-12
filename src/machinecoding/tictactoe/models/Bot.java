package machinecoding.tictactoe.models;

import machinecoding.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;
import machinecoding.tictactoe.strategies.botplayingstrategies.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    public Bot(Symbol symbol, String name, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {

        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy= BotPlayingStrategyFactory.getBotPlayingStrategyForDifficultyLevel(botDifficultyLevel);

    }

    public BotDifficultyLevel getBotDifficultyLevel() {


        return botDifficultyLevel;
    }

    @Override
    public Cell makeMove(Board board) {
        return botPlayingStrategy.makeMove(board);
    }
}
