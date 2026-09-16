# Scoreboard GUI

## Description

This application is a simple scoreboard that mimics that keeps track of the score in a game. When the program is compiled, a Scoreboard should pop up, displaying two scores on either side, as well as a Greeting Message. You can input a team name of your choice to both sides, and press a set button to set the Team Name's for the duration of the program. Plus and Minus signs can then be used to add and subtract from the score you have selected to alter (Note: Cannot go below 0).

We have 7 total Classes:
Main.java: Main Driver class for the program. Creates JFrame, adds Header, Center, and Footer Components, connects button event listeners, handles resetting button for both teams scores and names, handles Exit button, and displays the main scoreboard.
Center.java: Manages the GUI's center panel, displays greeting text, creates seperate score objects for both the home and away teams, adds them to the center panel, and provides getter methods so the other classes can access score components.
Footer.java: Holds the reset and exit buttons for the scoreboard, makes them accessible for the main driver class.
Header.java: Handles top greeting area of the scoreboard, where the name and submit buttons are.
ImageIconSwing.java: Loads and resizes images so they can be used as icons in the scoreboard GUI.
RichLabel.java: Extends JLabel to create a custom text label with a 3D/Drop Shadow effect.
Score.java: Handles each teams score display and score controls, as well as allowing incrementing and decrementing of each team's scores. 
## Usage
In order to start the application, ensure that Header, Center, and Footer compile.
1) javac *.java
2) java Main
