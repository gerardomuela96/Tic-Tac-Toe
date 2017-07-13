import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** An object named TicTacToe, which it
* initializes a GUI of the TicTacToe game
* for users to play the game.
* @author Gerardo Muela
*/
public class TicTacToe extends JFrame implements ActionListener{

	/**Initialization of "Player1" to play TicTacToe.*/
	private Player player1 = new Player();
	/**Initialization of "Player2" to play TicTacToe.*/
	private Player player2 = new Player();

	/**Initial size of height of the GUI window.*/
	private final int height = 500;
	/**Initial size of width of the GUI window.*/
	private final int width = 500;

	/**Initialization of "button1"*/
	JButton button1 = new JButton("");
	/**Initialization of "button2"*/
	JButton button2 = new JButton("");
	/**Initialization of "button3"*/
	JButton button3 = new JButton("");
	/**Initialization of "button4"*/
	JButton button4 = new JButton("");
	/**Initialization of "button5"*/
	JButton button5 = new JButton("");
	/**Initialization of "button6"*/
	JButton button6 = new JButton("");
	/**Initialization of "button7"*/
	JButton button7 = new JButton("");
	/**Initialization of "button8"*/
	JButton button8 = new JButton("");
	/**Initialization of "button9"*/
	JButton button9 = new JButton("");

	/**Constructor to initialize the fields of the object TicTacToe.*/
	public TicTacToe(){

		/**Set title for GUI window.*/
		setTitle("TicTacToe");

		/**Set initial size for the GUI window.*/
		setSize(width,height);

		/**Set the close operation for the GUI window as the X on the upper right corner.*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**Set the layout of the GUI window to a 3 x 3 Grid layout.*/
		setLayout(new GridLayout(3,3));

		/**Add button "button1" to the GUI window.*/
		add(button1);
		/**Set the action for "button1" when the user clicks on the button.*/
		button1.addActionListener(this);
		/**Add button "button2" to the GUI window.*/
		add(button2);
		/**Set the action for "button2" when the user clicks on the button.*/
		button2.addActionListener(this);
		/**Add button "button3" to the GUI window.*/
		add(button3);
		/**Set the action for "button3" when the user clicks on the button.*/
		button3.addActionListener(this);
		/**Add button "button4" to the GUI window.*/
		add(button4);
		/**Set the action for "button4" when the user clicks on the button.*/
		button4.addActionListener(this);
		/**Add button "button5" to the GUI window.*/
		add(button5);
		/**Set the action for "button5" when the user clicks on the button.*/
		button5.addActionListener(this);
		/**Add button "button6" to the GUI window.*/
		add(button6);
		/**Set the action for "button6" when the user clicks on the button.*/
		button6.addActionListener(this);
		/**Add button "button7" to the GUI window.*/
		add(button7);
		/**Set the action for "button7" when the user clicks on the button.*/
		button7.addActionListener(this);
		/**Add button "button8" to the GUI window.*/
		add(button8);
		/**Set the action for "button8" when the user clicks on the button.*/
		button8.addActionListener(this);
		/**Add button "button9" to the GUI window.*/
		add(button9);
		/**Set the action for "button9" when the user clicks on the button.*/
		button9.addActionListener(this);

		/**Set the visibility of the window to "true" so the GUI window can be visible.*/
		setVisible(true);
	}
	/**Method that checks which button is push by the user in the GUI window to check which
	 * player's turn is it and to set the text of the button to the symbol the player is using.*/
	public void actionPerformed(ActionEvent e){
		/**Action for "button1".*/
		if(e.getSource() == button1){
			if(button1.getText().equals("")){
				if(player1.getTurn() == true){
					button1.setText("X");
					player1.nextTurn(player2);
				}
				else if(player2.getTurn() == true){
					button1.setText("O");
					player2.nextTurn(player1);
				}
			}
			checkWhoWin();
		}
		/**Action for "button2".*/
		if(e.getSource() == button2){
			if(button2.getText().equals("")){
				if(player1.getTurn() == true){
					button2.setText("X");
					player1.nextTurn(player2);
				}
				else if(player2.getTurn() == true){
					button2.setText("O");
					player2.nextTurn(player1);
				}
			}
			checkWhoWin();
		}
		/**Action for "button3".*/
		if(e.getSource() == button3){
			if(button3.getText().equals("")){
				if(player1.getTurn() == true){
					button3.setText("X");
					player1.nextTurn(player2);
				}
				else if(player2.getTurn() == true){
					button3.setText("O");
					player2.nextTurn(player1);
				}
			}
			checkWhoWin();
		}
		/**Action for "button4".*/
		if(e.getSource() == button4){
			if(button4.getText().equals("")){
				if(player1.getTurn() == true){
					button4.setText("X");
					player1.nextTurn(player2);
				}
				else if(player2.getTurn() == true){
					button4.setText("O");
					player2.nextTurn(player1);
				}
			}
			checkWhoWin();
		}
		/**Action for "button5".*/
		if(e.getSource() == button5){
			if(button5.getText().equals("")){
				if(player1.getTurn() == true){
					button5.setText("X");
					player1.nextTurn(player2);
				}
				else if(player2.getTurn() == true){
					button5.setText("O");
					player2.nextTurn(player1);
				}
			}
			checkWhoWin();
		}
		/**Action for "button6".*/
		if(e.getSource() == button6){
			if(button6.getText().equals("")){
				if(player1.getTurn() == true){
					button6.setText("X");
					player1.nextTurn(player2);
				}
				else if(player2.getTurn() == true){
					button6.setText("O");
					player2.nextTurn(player1);
				}
			}
			checkWhoWin();
		}
		/**Action for "button7".*/
		if(e.getSource() == button7){
			if(button7.getText().equals("")){
				if(player1.getTurn() == true){
					button7.setText("X");
					player1.nextTurn(player2);
				}
				else if(player2.getTurn() == true){
					button7.setText("O");
					player2.nextTurn(player1);
				}
			}
			checkWhoWin();
		}
		/**Action for "button8".*/
		if(e.getSource() == button8){
			if(button8.getText().equals("")){
				if(player1.getTurn() == true){
					button8.setText("X");
					player1.nextTurn(player2);
				}
				else if(player2.getTurn() == true){
					button8.setText("O");
					player2.nextTurn(player1);
				}
			}
			checkWhoWin();
		}
		/**Action for "button9".*/
		if(e.getSource() == button9){
			if(button9.getText().equals("")){
				if(player1.getTurn() == true){
					button9.setText("X");
					player1.nextTurn(player2);
				}
				else if(player2.getTurn() == true){
					button9.setText("O");
					player2.nextTurn(player1);
				}
			}
			checkWhoWin();
		}
	}
	/**Method that checks if one of the eight conditions for a player to be declare the winner.
	 * If no condition is met the game is declare a tied.*/
	public void checkWhoWin(){
		if(button1.getText().equals(button2.getText()) && button1.getText().equals(button3.getText()) 
			&& !button1.getText().equals("")){
			if(button1.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"Player1 WON!");
				System.exit(0);
			}
			else if(button1.getText().equals("O")){
				JOptionPane.showMessageDialog(null,"Player2 WON!");
				System.exit(0);
			}
		}
		else if(button4.getText().equals(button5.getText()) && button4.getText().equals(button6.getText()) 
			&& !button4.getText().equals("")){
			if(button4.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"Player1 WON!");
				System.exit(0);
			}
			else if(button4.getText().equals("O")){
				JOptionPane.showMessageDialog(null,"Player2 WON!");
				System.exit(0);
			}
		}
		else if(button7.getText().equals(button8.getText()) && button7.getText().equals(button9.getText()) 
			&& !button7.getText().equals("")){
			if(button7.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"Player1 WON!");
				System.exit(0);
			}
			else if(button7.getText().equals("O")){
				JOptionPane.showMessageDialog(null,"Player2 WON!");
				System.exit(0);
			}
		}
		else if(button1.getText().equals(button4.getText()) && button1.getText().equals(button7.getText()) 
			&& !button1.getText().equals("")){
			if(button1.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"Player1 WON!");
				System.exit(0);
			}
			else if(button1.getText().equals("O")){
				JOptionPane.showMessageDialog(null,"Player2 WON!");
				System.exit(0);
			}
		}
		else if(button2.getText().equals(button5.getText()) && button2.getText().equals(button8.getText()) 
			&& !button2.getText().equals("")){
			if(button2.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"Player1 WON!");
				System.exit(0);
			}
			else if(button2.getText().equals("O")){
				JOptionPane.showMessageDialog(null,"Player2 WON!");
				System.exit(0);
			}
		}
		else if(button3.getText().equals(button6.getText()) && button3.getText().equals(button9.getText()) 
			&& !button3.getText().equals("")){
			if(button3.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"Player1 WON!");
				System.exit(0);
			}
			else if(button3.getText().equals("O")){
				JOptionPane.showMessageDialog(null,"Player2 WON!");
				System.exit(0);
			}
		}
		else if(button1.getText().equals(button5.getText()) && button1.getText().equals(button9.getText()) 
			&& !button1.getText().equals("")){
			if(button1.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"Player1 WON!");
				System.exit(0);
			}
			else if(button1.getText().equals("O")){
				JOptionPane.showMessageDialog(null,"Player2 WON!");
				System.exit(0);
			}
		}
		else if(button3.getText().equals(button5.getText()) && button3.getText().equals(button7.getText()) 
			&& !button3.getText().equals("")){
			if(button3.getText().equals("X")){
				JOptionPane.showMessageDialog(null,"Player1 WON!");
				System.exit(0);
			}
			else if(button3.getText().equals("O")){
				JOptionPane.showMessageDialog(null,"Player2 WON!");
				System.exit(0);
			}
		}
		else if(!button1.getText().equals("") && !button2.getText().equals("") && !button3.getText().equals("")
			&& !button4.getText().equals("") && !button5.getText().equals("") && !button6.getText().equals("")
			&& !button7.getText().equals("") && !button8.getText().equals("") && !button9.getText().equals("")){
			JOptionPane.showMessageDialog(null,"It's a Tied!");
			System.exit(0);
		}
	}
	/**Main method that initializes the TicTacToe object for two players to play the game.*/
	public static void main(String [] args){
		new TicTacToe();
	}
}