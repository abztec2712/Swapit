import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class BookOptionsGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame mainFrame = new JFrame("Book Options");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1920, 1080); // Set the size to fullscreen (1920x1080)
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the window
        mainFrame.setVisible(true); // Maximize the window

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Create a label to display a greeting message with line breaks using HTML
        JLabel greetingLabel = new JLabel("<html>Welcome to BookSwap!<br>Please select the desired option:</html>");
        greetingLabel.setFont(new Font("Calibri", Font.BOLD, 24));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(greetingLabel, gbc);


        JButton swapButton = new JButton("Swap Books");
        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        mainPanel.add(swapButton, gbc);

        JButton buyButton = new JButton("Buy Books");
        gbc.gridy = 1;
        gbc.gridx = 1;
        mainPanel.add(buyButton, gbc);

        JButton sellButton = new JButton("Sell Books");
        gbc.gridx = 2;
        gbc.gridy = 1;
        mainPanel.add(sellButton, gbc);

        mainFrame.add(mainPanel);

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openBuyWindow(mainFrame);
            }
        });

        swapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openSwapWindow(mainFrame);
            }
        });

        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openSellWindow(mainFrame);
            }
        });

        mainFrame.setVisible(true);
    }

    private static void openBuyWindow(JFrame mainFrame) {
        JFrame buyFrame = new JFrame("Buy Books");
        buyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window
        buyFrame.setSize(800, 600);
        buyFrame.setLocationRelativeTo(mainFrame); // Center the window relative to the main window

        // Create content for the Buy Books window
        JPanel buyPanel = new JPanel();
        buyPanel.add(new JLabel("<html>This is the Buy Books window.<br>there will be a search button to look for the books to be bought</html>"));

        JButton backButton = new JButton("Back");
        buyPanel.add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buyFrame.dispose(); // Close the Buy Books window
            }
        });

        buyFrame.add(buyPanel);
        buyFrame.setVisible(true);
    }

    private static void openSwapWindow(JFrame mainFrame) {
        JFrame swapFrame = new JFrame("Swap Books");
        swapFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window
        swapFrame.setSize(800, 600);
        swapFrame.setLocationRelativeTo(mainFrame); // Center the window relative to the main window

        // Create content for the Swap Books window
        JPanel swapPanel = new JPanel();
        swapPanel.add(new JLabel("<html>This is the Swap Books window.<br>there will be a search button to look for the books to be swapped</html>"));

        JButton backButton = new JButton("Back");
        swapPanel.add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapFrame.dispose(); // Close the Swap Books window
            }
        });

        swapFrame.add(swapPanel);
        swapFrame.setVisible(true);
    }

    private static void openSellWindow(JFrame mainFrame) {
        JFrame sellFrame = new JFrame("Sell Books");
        sellFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this window
        sellFrame.setSize(800, 600);
        sellFrame.setLocationRelativeTo(mainFrame); // Center the window relative to the main window

        // Create content for the Sell Books window
        JPanel sellPanel = new JPanel();
        sellPanel.add(new JLabel("<html>This is the Sell Books window.<br>there will be a search type feature to select the books to be sold.</html>"));

        JButton backButton = new JButton("Back");
        sellPanel.add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sellFrame.dispose(); // Close the Sell Books window
            }
        });

        sellFrame.add(sellPanel);
        sellFrame.setVisible(true);
    }
}