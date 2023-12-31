# README for Java Connect Four Game

This Java program simulates a Connect Four game. The Game class represents the game board and logic. Below is an explanation of the provided Game class methods and their functionality:
Game Class Overview:

    Attributes:
        board: A 6x7 2D array representing the game board.
        currentplayer: Tracks the current player's symbol ("O" or "O" in color for two players).
        Winner: Holds the winner's symbol if a player wins.

Methods:

    Game(): Default constructor.

    Game(String currentplayer): Constructor with a specified starting player.

    togglePlayer(): Switches the current player.

    setPosition(int Y): Places the player's symbol in the specified column Y on the board.

    checkWin(): Checks for a winning configuration horizontally, vertically, and diagonally.

    getBoard(): Retrieves the current state of the game board.

    getCurrent(): Retrieves the symbol of the current player.

    toString(): Generates a visual representation of the game board as a string.

Usage:

The Game class allows for the simulation of a Connect Four game. To use this class:

    Initialize Game:
        Create an instance of the Game class.
        Utilize methods like setPosition() to play the game by indicating the column where you want to place your symbol.

    Game Progress:
        The checkWin() method determines if a player has won after each move.
        togglePlayer() switches the current player's turn after a successful move.

    Display Board:
        toString() method generates and displays the current state of the game board.

Feel free to incorporate this Game class into a complete Connect Four game implementation by adding additional functionality, such as user input handling or a graphical interface.

Please note: The code provided assumes a textual representation of the game board and console-based interaction.
