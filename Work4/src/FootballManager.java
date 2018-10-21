import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballManager extends JFrame {

    private int WinWidth = 550, WinHeight = 200;
    private int WinXPos = 100, WinYPos = 100;
    private String LastS = "N/A", winner = "Tie";
    private int ACMscore = 0, RMscore = 0;
    JButton ACM = new JButton("AC Milan");
    JButton RM = new JButton("Real Madrid");
    JLabel score = new JLabel("Result: " + ACMscore + " X " + RMscore);
    JLabel LastScore = new JLabel("Last Scorer: " + LastS);
    Label win = new Label("Winner: " + winner);
    Font font = new Font("Times New Roman", 0, 18);

    public FootballManager() {
        super("FootballManager");
        setLayout(null);
        this.setBounds(WinXPos, WinYPos, WinWidth, WinHeight);

        ACM.setBounds(15, 10, 100, 30);
        add(ACM);

        RM.setBounds(WinWidth - 150, 10, 120, 30);
        add(RM);

        score.setBounds((WinWidth - WinXPos) / 2 - 10, 10, 100, 30);
        score.setFont(font);
        add(score);

        LastScore.setBounds( (WinWidth - WinXPos) / 2 - 35, 50, 200, 30);
        LastScore.setFont(font);
        add(LastScore);

        win.setBounds((WinWidth - WinXPos) / 2 - 30, 110, 180, 30);
        win.setFont(font);
        add(win);

        ACM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ACMscore = ACMscore + 1;
                score.setText("Result: " + ACMscore + " X " + RMscore);
                LastS = "AC Milan";
                LastScore.setText("Last Scorer: " + LastS);
                if (ACMscore > RMscore) {
                    winner = "AC Milan";
                    win.setText("Winner: " + winner);
                }
                else if (ACMscore == RMscore) {
                    winner = "Tie";
                    win.setText("Winner: " + winner);
                }
            }
        });
        RM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RMscore = RMscore + 1;
                score.setText("Result: " + ACMscore + " X " + RMscore);
                LastS = "Real Madrid";
                LastScore.setText("Last Scorer: " + LastS);
                if (ACMscore < RMscore) {
                    winner = "Real Madrid";
                    win.setText("Winner: " + winner);
                }
                else if (ACMscore == RMscore) {
                    winner = "Tie";
                    win.setText("Winner: " + winner);
                }
            }
        });

        setVisible(true);
    }
}
