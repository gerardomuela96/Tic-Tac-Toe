/** An object named Player, which
* which represents a player for the
* game TicTacToe.
* @author Gerardo Muela
*/
public class Player{
	/**Boolean variable that represents the turn of the player.*/
	private boolean turn;
	/**String variable that represents the symbol "X" or "O", which the player is using.*/
	private String symbol;
	/**Static int variable to keep track of which player number the player is, either 1 or 2.*/
	static int counter = 0;

	/**Constructor that initializes the fields of the object Player.*/
	public Player(){
		counter++;
		if(counter == 1){
			this.turn = true;
			this.symbol = "X";
		}
		else{
			this.turn = false;
			this.symbol = "O";
		}
	}
	/**Method that checks which player's turn is it.
	 *player2 represents the player playing against.*/
	public void nextTurn(Player player2){
		this.turn = false;
		player2.setTurn(true);
	}
	/**Method that checks the turn of the player.
	 *@return a boolean representing the player's turn.
	 *True if the it's the player's turn, false otherwise.*/
	public boolean getTurn(){
		return this.turn;
	}
	/**Method that sets the turn of the player.
	 *b is a boolean representing the player's turn.
	 *True if the it's the player's turn, false otherwise.*/
	public void setTurn(boolean b){
		this.turn = b;
	}
	/**Method that gets the symbol the player is using, either "X" or "O".
	 *@return a String that is the player's symbol in the TicTacToe game.*/
	public String getSymbol(){
		return this.symbol;
	}
}