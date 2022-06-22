import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.util.Scanner;



public class Board extends JPanel implements ActionListener, KeyListener {

    /** controls the delay between each tick in ms */
    private final int delay = 25;
    /** controls the size of the board */
    public static final int titleSize = 50;
    public static final int rows = 12;
    public static final int columns = 18;
    /** controls how many coins appear on the board */ 
    public static final int numberOfCoins = 1;
    /** controls how many Block appear on the board */
     public static final int numberOfBlocks = 20;
    
    /** keep a reference to the timer object that triggers actionPerformed() */
    private Timer timer;
    /** objects that appear on the game board */
    private Player player;
    private ArrayList<Coin> coins;
    private ArrayList<Block> blocks;

    
    /** creating characters */
    Characters Arshia = new Characters ("Arshia","Male");
    Characters Bardia = new Characters ("Bardia","Male");
    Characters Hardia = new Characters ("Hardia","Female");

    public Board() {

        int choice;

        Scanner sc = new Scanner(System.in);

        /** set the game board size */
        setPreferredSize(new Dimension(titleSize * columns, titleSize * rows));
        /** set the game board background color */
        setBackground(new Color(232, 232, 232));

        /** initialize the game state */
        player = new Player();
        coins = populateCoins(numberOfCoins);
        blocks = populateBlocks(numberOfBlocks);

        System.out.println(Arshia);
        System.out.println(Bardia);
        System.out.println(Hardia);
        
        /** printing out the options of characters to choose from */
        System.out.println("which character do you want to play with ?");
        System.out.println("1. Arshia");
        System.out.println("2. Bardia");
        System.out.println("3. Hardia");

        choice = sc.nextInt();

        /** choosing character */
        if(choice == 1) { 
            player.loadImage("Arshia");
        }
        if(choice == 2) { 
            player.loadImage("Bardia");
        }
        if(choice == 3) { 
            player.loadImage("Hardia");
        }
        /** this timer will call the actionPerformed() method every DELAY ms */
        timer = new Timer(delay, this);
        timer.start();
        sc.close();
    }


    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /** this method is called by the timer every DELAY ms */
        /** for updating state of your game or animation before the graphics are redrawn*/

        /** prevent the player from disappearing off the board */
        player.tick();

        /** give the player points for collecting coins */
        collectCoins();

        /** give the player points for collecting coins */
        hitBlocks();

        /** calling repaint() will trigger paintComponent() to run again, which will refresh/redraw the graphics.*/
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        /** when calling g.drawImage() we can use "this" for the ImageObserver */
        /** because Component implements the ImageObserver interface, and JPanel */
        /** extends from Component.*/

        /** draw our graphics.*/
        drawBackground(g);
        drawScore(g);
        for (Block block : blocks) {
            block.draw(g, this);
        }
        for (Coin coin : coins) {
            coin.draw(g, this);
        }
        player.draw(g, this);

        /** this smooths out animations*/
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        /** this is not used but must be defined as part of the KeyListener interface*/
    }

    @Override
    public void keyPressed(KeyEvent e) {
        /** react to key down events*/
        player.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        /** react to key up events*/
    }

    private void drawBackground(Graphics g) {
        /** draw a checkered background*/
        g.setColor(new Color(214, 214, 214));
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                /** only color every other tile*/
                if ((row + col) % 2 == 1) {
                    /** draw a square tile at the current row/column position*/
                    g.fillRect(
                        col * titleSize, 
                        row * titleSize, 
                        titleSize, 
                        titleSize
                    );
                }
            }    
        }
    }

    private void drawScore(Graphics g) {
        /** set the text to be displayed*/
        String text = "$" + player.getScore();
        /** cast the Graphics to Graphics2D to draw nicer text*/
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
            RenderingHints.KEY_TEXT_ANTIALIASING,
            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setRenderingHint(
            RenderingHints.KEY_RENDERING,
            RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(
            RenderingHints.KEY_FRACTIONALMETRICS,
            RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        /** set the text color and font*/
        g2d.setColor(new Color(30, 201, 139));
        g2d.setFont(new Font("Lato", Font.BOLD, 25));
        /** draw the score in the bottom center of the screen*/
        FontMetrics metrics = g2d.getFontMetrics(g2d.getFont());
        /** the text will be contained within this rectangle.*/
        Rectangle rect = new Rectangle(0, titleSize * (rows - 1), titleSize * columns, titleSize);
        /** determine the x coordinate for the text*/
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        /** determine the y coordinate for the text*/
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        /** draw the string*/
        g2d.drawString(text, x, y);
    }

    private ArrayList<Coin> populateCoins(int numCoins) {
        ArrayList<Coin> coinList = new ArrayList<>();
        Random rand = new Random();

        /** create the given number of coins in random positions on the board.*/
        for (int i = 0; i < numCoins; i++) {
            int coinX = rand.nextInt(columns);
            int coinY = rand.nextInt(rows);
            coinList.add(new Coin(coinX, coinY));
        }
        return coinList;
    }

    
    private ArrayList<Block> populateBlocks(int numBlocks) {
        ArrayList<Block> blockList = new ArrayList<>();
        ArrayList<Integer> blockX = randomize(numBlocks, columns);
        ArrayList<Integer> blockY = randomize(numBlocks, rows);
        /** create the given number of Blocks in random positions on the board.*/

            for (int i = 0; i < numBlocks; i++) {
                blockList.add(new Block(blockX.get(i), blockY.get(i)));
            }
               
            return blockList;

    }
    /** check for not spawning blcoks at the same spot*/
    private ArrayList<Integer> randomize(int num, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < num; i++){
            list.add(rand.nextInt(max));
        }
        
        return list;
    }

    private void hitBlocks() {
        /** allow player to hit Blocks*/
        ArrayList<Block> hitBlocks = new ArrayList<>();
        for (Block block : blocks) {
            /** if the player is on the same tile as a Blocks, hit it*/
            if (player.getPos().equals(block.getPos())) {
                /** decrease the player some points for hitting blocks*/
                player.addScore(-20);
                hitBlocks.add(block);
                blocks = populateBlocks(numberOfBlocks);  
                coins = populateCoins(numberOfCoins);
            }
        }
        /** remove hit Blocks from the board*/
        blocks.removeAll(hitBlocks);
        
    }

    private void collectCoins() {
        /** allow player to pickup coins*/
        ArrayList<Coin> collectedCoins = new ArrayList<>();
        for (Coin coin : coins) {
            /** if the player is on the same tile as a coin, collect it*/
            if (player.getPos().equals(coin.getPos())) {
                /** give the player some points for picking this up*/
                player.addScore(10);
                collectedCoins.add(coin);
                coins = populateCoins(1);
                blocks = populateBlocks(numberOfBlocks);
                coins = populateCoins(numberOfCoins);
            }
        }
        /** remove collected coins from the board*/
        coins.removeAll(collectedCoins);
        
    }

}
